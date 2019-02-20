package creational.singleton;

/**A singleton provides global access to class restricted to one instance */
public class SingletonExample {

    private static SingletonExample uniqueInstance = null;

    //private constructor prohibits multiple instance 7
    // being constructed through a public constructor
    private SingletonExample() {}

    public static SingletonExample getInstance() {
        if(uniqueInstance == null) {
            return new SingletonExample();
        }
        else {
            return uniqueInstance;
        }
    }
}
