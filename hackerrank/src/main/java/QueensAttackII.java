import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QueensAttackII {
    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        Pos queen = new Pos(n, r_q, c_q, obstacles);
        return (int) queen.countPossibleMoves();
    }

    public static void main(String[] args) {
        Pos queen = new Pos(5, 2, 3, List.of(List.of(5, 5),
                List.of(4, 2), List.of(2, 3)));
        System.out.println(queen.countPossibleMoves());
    }
}

class Pos {
    private int row;
    private int col;
    private int boundary;
    Set<Pos> obstacles;

    public Pos(int boundary, int col, int row, List<List<Integer>> obstacles) {
        this.boundary = boundary;
        this.row = row;
        this.col = col;
        this.obstacles = obstacles.stream().map(list -> Pos.of(list.get(0), list.get(1))).collect(Collectors.toSet());
    }

    public Pos(int col, int row) {
        this.row = row;
        this.col = col;
    }

    public static Pos of(int col, int row) {
        return new Pos(col, row);
    }

    public long countPossibleMoves() {
        return Stream.of(getHorizontalLeft(), getHorizontalRight(), getVerticalUp(), getVerticalDown(),
                getDiagonal1(), getDiagonal2()).flatMap(i -> i)
                .count();
    }

    private boolean isOnBoard() {
        return (this.row >= 1 && this.row <= boundary) && (this.col >= 1 && this.col <= boundary);
    }

    private boolean canMove() {
        return isOnBoard() && !obstacles.contains(this);
    }

    public Pos move(int dy, int dx) {
        return Pos.of(col + dy, row + dx);
    }

    private Stream<Pos> getVerticalUp() {
        return Stream.iterate(this.move(1, 0), pos -> pos.move(1, 0))
                .takeWhile(Pos::canMove);
    }

    private Stream<Pos> getVerticalDown() {
        return Stream.iterate(this.move(- 1, 0), pos -> pos.move(- 1, 0))
                .takeWhile(Pos::canMove);
    }

    private Stream<Pos> getHorizontalLeft() {
        return Stream.iterate(this.move(0, -1), pos -> pos.move(0, -1))
                .takeWhile(Pos::canMove);
    }

    private Stream<Pos> getHorizontalRight() {
        return Stream.iterate(this.move(0, 1), pos -> pos.move(0, 1))
                .takeWhile(Pos::canMove);
    }

    private Stream<Pos> getDiagonal1() {
        Stream<Pos> partOne = Stream.iterate(this.move(1, -1), pos -> pos.move(1, -1))
                .takeWhile(Pos::canMove);
        Stream<Pos> partTwo = Stream.iterate(this.move(-1, 1), pos -> pos.move(-1, 1))
                .takeWhile(Pos::canMove);
        return Stream.concat(partTwo, partOne);
    }

    private Stream<Pos> getDiagonal2() {
        Stream<Pos> partOne = Stream.iterate(this.move(1, 1), pos -> pos.move(1, 1))
                .takeWhile(Pos::canMove);
        Stream<Pos> partTwo = Stream.iterate(this.move(-1, -1), pos -> pos.move(-1, -1))
                .takeWhile(Pos::canMove);
        return Stream.concat(partTwo, partOne);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pos pos = (Pos) o;
        return row == pos.row && col == pos.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
}
