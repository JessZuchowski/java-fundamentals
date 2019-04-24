package inheritance;

public class Review {
    public String body;
    public String author;
    public int numberOfStars;

    /**
     *
     * @param body
     * @param author
     * @param numberOfStars
     */

    Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }

    public String toString() {
        return body + " " + author + " " + numberOfStars;
    }
}
