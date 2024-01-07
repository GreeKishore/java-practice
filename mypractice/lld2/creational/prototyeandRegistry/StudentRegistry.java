package mypractice.lld2.creational.prototyeandRegistry;

import java.util.HashMap;
import java.util.Map;
//step 5
public class StudentRegistry implements Registry<String,Student>{
    private final Map<String,Student> map = new HashMap<>();
    @Override
    public Student getPrototype(String key) {
        return map.get(key);
    }

    @Override
    public void setPrototype(String key, Student value) {
        map.put(key,value);
    }
}