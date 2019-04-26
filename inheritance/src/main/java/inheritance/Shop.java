package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public String name;
    public String description;
    public int priceCategory;



   public List<Review> review = new ArrayList<>();

   Shop(String name, String description, int priceCategory) {
       this.name = name;
       this.description = description;
       this.priceCategory = priceCategory;
   }

   public void addReview(String body, String author, int numberOfStars) {
       Review review = new Review(body, author, numberOfStars);
       this.review.add(review);
   }

   public String toString() {return name + " " + description + " " + priceCategory;}
}
