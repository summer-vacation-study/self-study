public class MovieReivewMain2 {
    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "좋은 영화";

        MovieReview movie2 = new MovieReview();
        movie2.title = "어바웃 타임";
        movie2.review = "좋은 시간 영화!";

        MovieReview [] movies = new MovieReview [] {movie1,movie2};

        for (MovieReview r : movies) {
            System.out.println("영화 제목: " + r.title + ", 리뷰: " + r.review);
        }

    }
}
