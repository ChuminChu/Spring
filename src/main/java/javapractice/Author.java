package javapractice;

import java.util.ArrayList;
import java.util.List;

public class Author {
    String name;
    String dataOfBitrh;
    //작가가 쓴 책은 여러개일 수 있으니까
    private List<Book> books = new ArrayList<>();

    public Author(String name, String dataOfBitrh) {
        this.name = name;
        this.dataOfBitrh = dataOfBitrh;
    }


    //참조
    //Book 작가가쓴책;
}
