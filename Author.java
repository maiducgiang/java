package com.company;

class Author{
    private String name;
    private String email;
    public Author(){

    }
    public Author(String name, String email){
        this.name = name;
        this.email = email;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
}
class Book{
    private String name;
    private Author[] authors;
    private double price;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public String getAuthorNames(){
        String authorNames = authors[0].getName();
        for(int i = 1; i < authors.length; i++) authorNames +="," + authors[i].getName() ;
        return authorNames;
    }
}
