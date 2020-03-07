package com.basic.classJava;

public class Reader {

    public static void main(String... args) {

        //object creation, equivalent to row identification 
        //instance == object
        // static is not an instance variable
        JavaClass javaClassObject1 = new JavaClass();
        System.out.println("instance int value = "+javaClassObject1.getIntInstanceVariable());
        System.out.println("instance string value = "+javaClassObject1.getInstanceStrihgValue());
        System.out.println("instance string value = "+javaClassObject1.isInstanceBoolean());
        System.out.println("static string value = "+ javaClassObject1.getStaticStringValue());

        // System.out.println("testVariable value = "+javaClassObject.getStaticValue());

        // static is not an instance variable, so no need to instance/object to get static value
        //ideal way of getting static variable
        System.out.println("static string value = "+ JavaClass.getStaticStringValue());
        
        
        // variable initialize
        javaClassObject1.setInstanceBoolean(true);
        javaClassObject1.setInstanceStrihgValue("hai");
        javaClassObject1.setIntInstanceVariable(10);
        //javaClassObject1.setStaticStringValue("static");
        JavaClass.setStaticStringValue("static");
        
        System.out.println("------class 1 intialized----------");
        System.out.println("instance int value = "+javaClassObject1.getIntInstanceVariable());
        System.out.println("instance string value = "+javaClassObject1.getInstanceStrihgValue());
        System.out.println("instance string value = "+javaClassObject1.isInstanceBoolean());
        System.out.println("static string value = "+ JavaClass.getStaticStringValue());


        // another object
        
        JavaClass javaClassObject2 = new JavaClass();
        javaClassObject2.setInstanceBoolean(true);
        javaClassObject2.setInstanceStrihgValue("hai from 2");
        javaClassObject2.setIntInstanceVariable(11);
        //javaClassObject1.setStaticStringValue("static");
       // JavaClass.setStaticStringValue("static");
        
        System.out.println("------class 2 intialized----------");
        System.out.println("instance int value = "+javaClassObject2.getIntInstanceVariable());
        System.out.println("instance string value = "+javaClassObject2.getInstanceStrihgValue());
        System.out.println("instance string value = "+javaClassObject2.isInstanceBoolean());
        System.out.println("static string value = "+ JavaClass.getStaticStringValue());

    }
}