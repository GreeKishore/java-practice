package mypractice.lld2.structural.decoratorAndFlyweightPattern;

public class CompressionDecorator extends DataSourceDecorator{
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public String WriteData() {
        return "Written message compressed";
    }

    @Override
    public String ReadData() {
        return "Reading Compressed message";
    }
}