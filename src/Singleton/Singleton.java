package Singleton;

public class Singleton {
    //This is a complete example of what the design pattern is.

    private static Singleton firstInstance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if (firstInstance == null){
            firstInstance = new Singleton();
            //Lazy instantiation: if the instance isn't needed it won't be created.

         }
         return firstInstance;
    }
}
