package lambda.ex3;

public class BuildGreeterExample {
    public static MyBuildGreeter buildGreeter(String greeting){
        return (str -> greeting + ", " + str);
    }
    public static void main(String[] args) {
        MyBuildGreeter helloGreeter = buildGreeter("Hello");
        MyBuildGreeter hiGreeter = buildGreeter("Hi");

        System.out.println(helloGreeter.apply("Java"));
        System.out.println(hiGreeter.apply("Lambda"));


    }
}
