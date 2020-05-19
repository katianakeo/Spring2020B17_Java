package day41_Inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Ebook book1 = new Ebook();
        book1.title = "Hamlet";
        book1.author = "Shakespeare";
        book1.price = 20;
        System.out.println(book1);
        System.out.println("Size: "+book1.size);
        System.out.println("pages: "+book1.pages);

        book1.readBook();

        AudioBook book2 = new AudioBook();
        book2.title = "Becoming";
        book2.author = "Michelle Obama";
        book2.price = 30;
        System.out.println(book2);

    }
}
