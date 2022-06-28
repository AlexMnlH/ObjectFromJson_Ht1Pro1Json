package net.ukr.ahavrykin;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;

public class Main {
    static String JSON_TEXT = """
            {
              "books": [
                 {
                    "name": "History of Ukraine",
                    "pages": 100,
                    "author": "xxx"
                 },
                 {
                    "name": "Sсience",
                    "pages": 200,
                    "author": "yyyy"
                 }
              ]
            }
            """;

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Books books = gson.fromJson(JSON_TEXT, Books.class);
        System.out.println(books);


        String json= gson.toJson(books);
        System.out.println(json);

    }
}

class Book {
    String name;
    int pages;
    String author;

    @Override
    public String toString() {
        return '{' +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}

class Books extends Book {
    Book[] books;

    @Override
    public String toString() {
        return "Books{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}

