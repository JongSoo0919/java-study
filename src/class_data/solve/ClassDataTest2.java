package class_data.solve;

public class ClassDataTest2 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = " 어바웃 타임";
        aboutTime.review = "at";

        MovieReview[] reviews = {inception, aboutTime};
        for (MovieReview m : reviews) {
            System.out.println("title : " + m.title + " review : " + m.title);
        }
    }
}
