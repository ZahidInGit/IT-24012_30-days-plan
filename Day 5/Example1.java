class Book {

    String title;
    String author;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Anonymous";
        System.out.println("No-Arg Constructor called.");
    }

    public void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

public class Example1 {

    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.display();
    }
}
