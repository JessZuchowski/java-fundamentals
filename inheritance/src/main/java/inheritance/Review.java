package inheritance;

public class Review {
    String body;
    String author;
    int numberOfStars;

    Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }

    public String toString() {
        return body + " " + author + " " + numberOfStars;
    }
}
