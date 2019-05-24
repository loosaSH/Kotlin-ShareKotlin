package net.loosash.sharekotlin.javacoder;

public class JavaSingleton1 {

    private static final JavaSingleton1 INSTANCE = new JavaSingleton1();
    String name;
    int age;

    private JavaSingleton1(){}

    public static JavaSingleton1 getInstance(){
        return INSTANCE;
    }
}
