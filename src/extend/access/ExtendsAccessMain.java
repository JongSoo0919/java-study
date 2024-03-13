package extend.access;

import extend.access.child.Child;
import extend.access.parent.Parent;

public class ExtendsAccessMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.printParent();
        child.call();
    }
}
