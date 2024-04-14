package service;

import base.Base;

public class BaseService {
    public static void main( String[] args )
    {
        Base base = new Base();
        System.out.println(base.publicMethod());
        System.out.println(base.defaultMethod()); // недоступно
        System.out.println(base.protectedMethod()); // недоступно
        System.out.println(base.privateMethod()); // недоступно
    }
}