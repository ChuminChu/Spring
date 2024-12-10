package javapractice;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Publisher {
    String name;
    //출판사가 가지고 있는 책은 여러개가 있으니까
    private List<Book> books = new ArrayList<>();

    public Publisher(String name){
        this.name = name;
    }
    //참조
   //Book 여러책;
}
