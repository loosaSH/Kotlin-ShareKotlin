package net.loosash.sharekotlin.javacoder;

public class JavaSingleton2 {

    private volatile static JavaSingleton2 INSTANCE;

    public JavaSingleton2() {
    }

    public static JavaSingleton2 getInstance(){
        if (INSTANCE == null){
            synchronized (JavaSingleton2.class){
                if (INSTANCE == null){
                    INSTANCE = new JavaSingleton2();
                }
            }
        }
        return INSTANCE;
    }
}
