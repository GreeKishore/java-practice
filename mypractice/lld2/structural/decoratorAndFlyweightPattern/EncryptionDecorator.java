package mypractice.lld2.structural.decoratorAndFlyweightPattern;

// Concrete decorators must call methods on the wrapped object,
// but may add something of their own to the result. Decorators
// can execute the added behavior either before or after the
// call to a wrapped object.
public class EncryptionDecorator extends DataSourceDecorator{
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public String WriteData() {
        return "Message encrypted";
    }

    @Override
    public String ReadData() {
        return "Data is being read";
    }
}