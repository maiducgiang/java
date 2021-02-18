package com.company;

public class Main {

    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("Viet", "VietCV@codelearn.io");
        authors[1] = new Author("Tuan", "TuanLQ@codelearn.io");
        authors[2] = new Author("Kien", "KienNT@Codelearn.io");

        Book book1 = new Book("C++ for Beginners", authors, 210000);
        System.out.println(book1.getAuthorNames());
    }
}
