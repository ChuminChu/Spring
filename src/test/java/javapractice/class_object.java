package javapractice;

import org.junit.jupiter.api.Test;

public class class_object {
    @Test
    void test() {
        Publisher publisher1 = new Publisher("길벗");
        Author author1 = new Author("추민영","2002-03-05");
        Book book1 = new Book("누가 내 머리에 똥이냐?", "0000-00-00",17000, "0", author1, publisher1);

        System.out.println(book1);

        Money money1 = new Money(400);
        // Money money2 = new Money(-9); // 코드 에러
        //money1.money = -9; // ()안은 -9가 안들어가지만 이렇게 바꿔줄 수 있다. 따라서 이걸 방지하고자 Money Class에서 private를 넣어 외부에서는 재정의할 수 없다.

        /*
        Book book1 = new Book();

        book1.title = "누가 내 머리에 똥쌌어";
        book1.publishedAt = "2002-00-00";
        book1.출판사 = publisher1;
        book1.작가 = author1;
        */
    }
}
