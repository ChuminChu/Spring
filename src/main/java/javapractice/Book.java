package javapractice;

import java.lang.reflect.Constructor;

public class Book {
    String title;
    String publishedAt;
    int price;
    String isbn;

    //참조
    Author 작가;
    Publisher 출판사;

    public Book(String title, String publishedAt, int price, String isbn, Author 작가, Publisher 출판사) {
        this.title = title;
        this.publishedAt = publishedAt;
        this.price = price;
        this.isbn = isbn;
        this.작가 = 작가;
        this.출판사 = 출판사;
    }
}
