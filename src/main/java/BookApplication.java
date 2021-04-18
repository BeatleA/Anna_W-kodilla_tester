public class BookApplication {
    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book.getAuthor() + " " + book.getTitle());

        Book book2 = Book.of("Ken Follett", "World without end");
        System.out.println(book2.getAuthor() + " " + book2.getTitle());
    }
}
