package lambda.ex3;

public class ComposeExample {
    public static MyCompose compose(MyCompose myCompose1, MyCompose myCompose2) {
        return (str) -> {
            str = myCompose1.transform(str);
            return myCompose2.transform(str);
        };

//        return new MyCompose() {
//            @Override
//            public String transform(String str) {
//                str = myCompose1.transform(str); // 중간 값
//                return myCompose2.transform(str); // 마지막 값
//            }
//        };
    }
    public static void main(String[] args) {
        MyCompose myCompose1 = (str) -> str.toUpperCase();
        MyCompose myCompose2 = (str) -> "***" + str + "***";

        System.out.println(compose(myCompose1, myCompose2));

        MyCompose myCompose = compose(myCompose1, myCompose2);
        System.out.println(myCompose.transform("Hello"));

    }
}
