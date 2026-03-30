package Models;

public class Book {
    String title;
    String author;
    int year;
    boolean available;


    public void printBookTitle(){
        System.out.println(title);
    }
    public void printBookAuthor(){
        System.out.println(author);
    }
    public void printBookReleaseDate(){
        System.out.println(year);
    }
    public void printBookAvailability(){
        System.out.println(available);
    }
    public void getBookTitle(String book_title){
        title=book_title;
    }
    public void getBookAuthor(String book_author){
        author=book_author;
    }
    public void getBookReleaseDate(int book_year){
        year=book_year;
    }
    public void getBookAvailability(boolean book_availability){
        available= book_availability;
    }


}
