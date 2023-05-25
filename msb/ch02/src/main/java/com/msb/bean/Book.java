package com.msb.bean;

/**
 * Created by 17081290 on 2021/6/2.
 */
public class Book {
    private String name;
    private String author;
    private double price;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}

    public Book(){
        System.out.println("Book被创建");
    }

    public Book(String name,String author, double price){
        this.name =name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + ", author='" + author + ", price=" + price +'}';
    }
}
