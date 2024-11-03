package Singleton;


// Basically Singleton calsses the classes the has only one objecr
public class Singleton {
     private static Singleton instance;
     public static Singleton  getInstance(){
         if(instance==null){
             instance=new Singleton();
         }
         return instance;
     }
}
