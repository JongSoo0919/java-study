package class_data.solve;

public class ClassDataTest1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = " 어바웃 타임";
        aboutTime.review = "at";

        System.out.println("title : " + inception.title + " review : " + inception.title);
        System.out.println("title : " + aboutTime.title + " review : " + aboutTime.title);
    }
}
