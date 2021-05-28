package javapractice.accessmodifier.library;

public class CourseBook extends Book{
    public CourseBook(){
        System.out.println(author);
        modifyTemplate();
        Book book=new Book();
        book.modifyTemplate();
    }
}
