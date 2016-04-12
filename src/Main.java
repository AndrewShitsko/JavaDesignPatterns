public class Main {

    public static void main(String[] args) {
        // Singleton
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Factory Method
        WriterFactory factory = new WriterFactory();
        AbstractWriter fileWriter = factory.getWriter("file");
        AbstractWriter xmlWriter = factory.getWriter("xml");
        fileWriter.write("Something text");
        xmlWriter.write("Something text");
    }
}
