public class WriterFactory {
    public AbstractWriter getWriter(String objectType) {
        if (objectType == null)
            return null;
        AbstractWriter writer = null;
        if (objectType.equalsIgnoreCase("file"))
            writer = new CustomFileWriter();
        else if (objectType.equalsIgnoreCase("xml"))
            writer = new CustomXmlWriter();
        return writer;
    }
}
