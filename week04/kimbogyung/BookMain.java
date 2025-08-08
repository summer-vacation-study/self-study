public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.displayInfo();

        Book b2 = new Book("Hello Java", "Seo");
        b2.displayInfo();

        Book b3 = new Book("JPA 프로그래밍", "Kim", 700);
        b3.displayInfo();
    }
}
