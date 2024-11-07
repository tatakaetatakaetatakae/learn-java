public class Student {
    private String name;
    private String ID;
    private String[] borrowedBooks;

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(String[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void borrowBook(Book myBook){

    }
    public void returnBook(Book myBook){

    }
    public String[] displayBorrowedBooks(){
        return borrowedBooks;
    }
}
