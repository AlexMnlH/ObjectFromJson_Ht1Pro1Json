package net.ukr.ahavrykin;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    static String JSON_TEXT = """
            {
              “books”: [
                 {
                    “name”: “…”,
                    “pages”: 100,
                    “author”: “xxx”
                 },
                 {
                    “name”: “…”,
                    “pages”: 200,
                    “author”: “yyyy”
                 }
              ]
            }
            """;
    public static void main(String[] args) {
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        Book books=gson.fromJson(JSON_TEXT,Book.class);
        System.out.println(books);
    }
}

class Book{
    String name;
    int pages;
    String author;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}
