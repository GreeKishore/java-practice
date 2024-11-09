package mypractice.lld1;

public class NestedStaticClassPractice {
    public int var1 = 2;
    static int var2 = 3;
    public static void main(String[] args) {
        Nested nested = new Nested();

        System.out.println(nested.var3);
        System.out.println(Nested.var4);
    }
    static class Nested {
        public int var3 = 4;
        public static int var4 = 5;
        public static void main(String[] args) {
            //System.out.println(var1); // Non-static field 'var1' cannot be referenced from a static context
            System.out.println(var2);
            //System.out.println(var3); // Non-static field 'var1' cannot be referenced from a static context
            System.out.println(var4);
        }
    }
}