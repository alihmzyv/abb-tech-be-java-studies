package november42022.tasksgiven.singleton;

public class SingletonClassExample {
    private SingletonClassExample singletonClassExample;

    private SingletonClassExample() {
    }

    public SingletonClassExample instance() {
        if (singletonClassExample == null) {
            singletonClassExample = new SingletonClassExample();
        }
        return singletonClassExample;
    }
}
