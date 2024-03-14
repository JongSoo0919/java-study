package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        call(parent);
        Parent parent1 = new Child();
        call(parent1);
    }

    public static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("child instance");
            Child child = (Child) parent;
            child.childMethod();
        }

    }
}
