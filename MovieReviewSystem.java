import java.util.ArrayList;
import java.util.List;

// Review class to hold review details
class Review {
    private String message;
    private String reviewer;
    private double rating;

    public Review(String message, String reviewer, double rating) {
        this.message = message;
        this.reviewer = reviewer;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return message + " by " + reviewer + " - " + rating;
    }
}

// Movie class
class Movie {
    private String title;
    private String director;
    private List<String> actors;
    private List<Review> reviews;

    public Movie(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
    }

    // Method to add a review
    public void addReview(String message, String reviewer, double rating) {
        Review review = new Review(message, reviewer, rating);
        reviews.add(review);
    }

    // Method to display all reviews
    public void displayReviews() {
        System.out.println("Reviews for '" + title + "':");
        for (Review review : reviews) {
            System.out.println(review);
        }
        System.out.println();
    }
}

public class MovieReviewApp {
    public static void main(String[] args) {
        // Create movie 1: Titanic
        List<String> titanicActors = List.of("Leonardo DiCaprio", "Kate Winslet");
        Movie titanic = new Movie("Titanic", "James Cameron", titanicActors);

        titanic.addReview("Great movie!", "Irvine Rolf", 4.5);
        titanic.addReview("Highly recommended!", "Ashkii Karlheinz", 4.5);
        titanic.addReview("A classic that never gets old.", "Nele Athol", 4.0);
        titanic.addReview("Great movie!", "Cipactli Anselma", 4.0);

        // Create movie 2: The Godfather
        List<String> godfatherActors = List.of("Marlon Brando", "Al Pacino");
        Movie godfather = new Movie("The Godfather", "Francis Ford Coppola", godfatherActors);

        godfather.addReview("Great movie!", "Irvine Rolf", 4.5);
        godfather.addReview("Great movie!", "Cipactli Anselma", 4.0);
        godfather.addReview("Highly recommended!", "Martin Nadine", 4.0);

        // Display all reviews
        titanic.displayReviews();
        godfather.displayReviews();
    }
}