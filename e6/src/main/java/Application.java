public class Application {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("FIZZ");
        Singleton anotherSingleton = Singleton.getInstance("BUZZ");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}