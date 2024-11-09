package mypractice.lld2.structural.decoratorAndFlyweightPattern;


public class Client {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("somefile");
        source.WriteData();
        source.ReadData();
        source = new CompressionDecorator(source);
        source = new EncryptionDecorator(source);
        source.WriteData();
    }
}