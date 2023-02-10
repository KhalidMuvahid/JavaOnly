public class HashCodeAndEquals {
    public static void main(String[] args) {
        Book book = new Book(1);
        Book book1 = new Book(1);
        Book book2 = new Book(3);

        System.out.println(book.equals(book));
        System.out.println(book.equals(book1));
        System.out.println(book.equals(book2));


    }


}
class Book{
    private int id;

    public Book(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id == book.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}