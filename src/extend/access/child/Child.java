package extend.access.child;

import extend.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 2; // 상속 관계 or 같은 패키지, 현재는 다른 패키지이나 상속 관계.
//        defaultValue = 3; // 다른 패키지이므로 불가능 Compile Error
//        privateValue = 4; // 접근 불가 Compile Error

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();
    }
}
