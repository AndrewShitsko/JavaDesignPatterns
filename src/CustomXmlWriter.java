
public class CustomXmlWriter extends AbstractWriter {
    @Override
    public void write(String text) {
        System.out.println("Writing \"" + text.toString() + "\" to xml...");
    }
}
