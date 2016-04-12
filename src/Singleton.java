
public class Singleton {
    private static Singleton instance;
    private static int count = 0;
    private Singleton(){ count++; }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        System.out.println("Creating Singleton " + count);
        return instance;
    }
}
