package Static;

public class InnerClass {
    // Here the class has to be static because this class is inside another class That is of having no reference Object....
    static class Test{
        int a;
        int b;
        Test(int a, int b){
            this.a=a;
            this.b=b;
        }
    }
    static {
        System.out.println("Hey I am static block ill just only execute Only once when the Main class runns");
    }

    public static void main(String[] args) {
        // As the static things doesnt need Objects but the class it self is object but it is with respect to the Main class
        // So the class no need object w.r.t main class but the content inside the test class need object
        Test t1=new Test(10,20);
    }
}
