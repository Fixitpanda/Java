public class Book {
    String name;
    String author;
    int numberOfPages;

    public Book(String name, String author, int numberOfPages) {
        this.name = name;
        this.author = author;
        if (numberOfPages < 0) {
            this.numberOfPages = 1;
        } else {
            this.numberOfPages = numberOfPages;
        }
    }

    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getNumberOfPages() {
        return this.numberOfPages;
    }
    public String toString() {
        return this.name + " by " + this.author + ", " + this.numberOfPages + " pages.";
    }
}


