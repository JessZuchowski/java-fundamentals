package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    public String name;
    public String allTheMovies;
    public int priceCategory;

    public List<Review> review = new ArrayList<>();

    Theater(String name, String allTheMovies, int priceCategory) {
        this.name = name;
        this.allTheMovies = allTheMovies;
        this.priceCategory = priceCategory;
    }

    public void addReview(String body, String author, int numberOfStars) {
        Review review = new Review(body, author, numberOfStars);
        this.review.add(review);
    }

    public String toString() {
        return name + " " + allTheMovies + " " + priceCategory;
    }

}
