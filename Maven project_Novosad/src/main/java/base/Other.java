package base;

public class Other {

    public static void main( String[] args ) {
        Base base = new Base();
        System.out.println(base.publicMethod());
        System.out.println(base.defaultMethod());
        System.out.println(base.protectedMethod());
        System.out.println(base.privateMethod()); // недоступно
    }
}
