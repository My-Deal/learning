package javapractice.accessmodifier.library;

public class Librarian {
    public Librarian(){
        Book book=new Book();
        book.modifyTemplate();
    }

    public static void main(String[] args) {
    Librarian librarian=new Librarian();
    CourseBook courseBook=new CourseBook();
    }
}
