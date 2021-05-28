package javapractice.accessmodifier.library;

public class Book {
    public Book() {
        author="virendra";
    }

    protected String author;
    protected void modifyTemplate(){
        System.out.println(this.getClass().getName()+":"+this.getClass().getDeclaredMethods());
    }
}
