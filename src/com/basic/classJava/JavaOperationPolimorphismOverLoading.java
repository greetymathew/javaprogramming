package com.basic.classJava;


public class JavaOperationPolimorphismOverLoading {
    
// polymorphism, method overloading == static poly
    // Method overloading is performed within class.
    //In case of method overloading, parameter must be different.
    //Method overloading is the example of compile time polymorphism.
    
//    
//    There are two ways to overload the method in java
//
//    By changing number of arguments
//    By changing the data type
    
    
    //method overloading can't be performed by changing return type 
    //of the method only. Return type can be same or different in method overloading. But you must have to change the parameter.
    
    public static int multiply(int a, int b) {
        System.out.println("inside 2 param int");
        return a*b;
    }
    
    //param type over loading
    public static float multiply(float a, float b) {
        System.out.println("inside 2 param float");
        return a*b;
    }
    
    public static int multiply(int a, int b, int c) {
       System.out.println("inside 3 param int");        
        return a*b*c;
    }
    
   
    
    
    public static void main(String... args) {

        System.out.println(new JavaOperationPolimorphismOverLoading().multiply(10, 20));
        System.out.println(new JavaOperationPolimorphismOverLoading().multiply(10f, 20f));
        System.out.println(new JavaOperationPolimorphismOverLoading().multiply(10, 20,10));
        
        
        System.out.println(JavaOperationPolimorphismOverLoading.multiply(10, 20));
        System.out.println(JavaOperationPolimorphismOverLoading.multiply(10f, 20f));
        System.out.println(JavaOperationPolimorphismOverLoading.multiply(10, 20,10));
        
        
    }
    
}