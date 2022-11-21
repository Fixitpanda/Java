// this is a sample tester for Book

public class Tester
{
    public static void main(String[] args)
{
    Book b1 = new Book("Oliver Twist", "Charles Dikens", 200);
    System.out.println(b1);
    System.out.println("Book name: " + b1.getName());
    System.out.println("Book author: " + b1.getAuthor());
    System.out.println("Book pages: " + b1.getNumberOfPages());
}

}
