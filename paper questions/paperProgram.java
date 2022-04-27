
class Book {
    private String author_name;
}

class Book_publication extends Book {
    private String title;
}

class Paper_publication extends Book {
    private String title;

}

public class paperProgram {
    public static void main(String[] args) {
        Book b;
        Book_publication bp = new Book_publication();
        Paper_publication pp = new Paper_publication();
        // b = bp;
        // b.title();
        // b = pp;
        // b.title();
    }
}
