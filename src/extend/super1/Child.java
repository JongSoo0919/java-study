package extend.super1;


public class Child extends Parent {
    public String value = "hello child";

    @Override
    public void hello() {
        System.out.println("child Hello!");
    }

    public void call() {
        System.out.println("this.value = " + this.value);
        System.out.println("super.value = " + super.value);

        this.hello();
        super.hello();
    }
}
