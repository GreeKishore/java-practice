package mypractice.lld2.creational.prototyeandRegistry;
//step 4
public interface Registry <K,V>{
    V getPrototype(K key);
    void setPrototype(K key,V value);
}