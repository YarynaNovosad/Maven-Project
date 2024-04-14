package base;

public class Base {
    private int id = 4;
    private String description = "Description about method";

    public String publicMethod(){

        return "Public";
    }

    String defaultMethod(){
        return "Default";
    }

    protected String protectedMethod(){

        return "Protected";
    }

    private String privateMethod(){
        return "Private";
    }

    public static void main( String[] args ){

        Base base = new Base();
        System.out.println(base.publicMethod());
        System.out.println(base.defaultMethod());
        System.out.println(base.protectedMethod());
        System.out.println(base.privateMethod());
        System.out.println(base.id);
        System.out.println(base.description);
    }
}
