package july2622.hackerrank;

public class ViralAdvertising {
    public static int viralAdvertising(int n) {
        int day = 1;
        int numOfPeopleSharedWithAtDay = 5; //day 1
        int numOfPeopeLikedAtDay;
        int totalNumOfPeopleLiked = 0; //day 1

        while (day <= n) {
            numOfPeopeLikedAtDay = numOfPeopleSharedWithAtDay / 2;
            totalNumOfPeopleLiked += numOfPeopeLikedAtDay;

            //next day
            day++;
            numOfPeopleSharedWithAtDay = numOfPeopeLikedAtDay * 3;
        }

        return totalNumOfPeopleLiked;
    }
}
