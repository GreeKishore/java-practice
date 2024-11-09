package mypractice.lld2.structural.decoratorAndFlyweightPattern;

/* Concrete components provide default implementations for the
 operations. There might be several variations of these
 classes in a program.*/
public class FileDataSource implements DataSource{
    public String fileName;
    public FileDataSource(String s) {
        fileName = s;
    }

    @Override
    public String WriteData() {
        return null;
    }

    @Override
    public String ReadData() {
        return null;
    }
}