
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    ArrayList<Student> students;
    public void addBook(Book myBook){
        books.add(myBook);
    }
    public void addStudent(Student myStudent){
        students.add(myStudent);
    }
    public void displayBooks(){
        System.out.println("Books available in the library:" + books);
    }
    public void displayStudents(){
        System.out.println("Students in the library:" + students);
    }
}
