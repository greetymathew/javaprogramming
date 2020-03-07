package com.basic.classJava;

//POJO -- plain old java object,
//DTO -- Data transfer object
 class JavaClass {
    
    //instance variable
    private int intInstanceVariable;
    
    //instance variable
    private String instanceStrihgValue;// = "instance";
    
    //instance boolean value
    private boolean instanceBoolean;
    
    //static variable 
    private static String staticStringValue;// = "static";
    //test commit
    
    
    //methods, functions

    public int getIntInstanceVariable() {
        return intInstanceVariable;
    }

    public void setIntInstanceVariable(int intInstanceVariable) {
        this.intInstanceVariable = intInstanceVariable;
    }

    public String getInstanceStrihgValue() {
        return instanceStrihgValue;
    }

    public void setInstanceStrihgValue(String instanceStrihgValue) {
        this.instanceStrihgValue = instanceStrihgValue;
    }

    public static String getStaticStringValue() {
        return staticStringValue;
    }

    public static void setStaticStringValue(String staticValue) {
        JavaClass.staticStringValue = staticValue;
    }

    public boolean isInstanceBoolean() {
        return instanceBoolean;
    }

    public void setInstanceBoolean(boolean instanceBoolean) {
        this.instanceBoolean = instanceBoolean;
    }
    
}