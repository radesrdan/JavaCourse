package com.example.scope;

public class Main {

    public static void main(String[] args) {
        String var4 = "this is private to main()";

        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("scopeCheck var is " + scopeCheck.getVar1());
        System.out.println(var4);

        scopeCheck.timesTwo();
        System.out.println("*************");
        ScopeCheck.InnerClass innerClass =  scopeCheck.new InnerClass();
        innerClass.timesTwo();
        scopeCheck.useInner();

    }
}
