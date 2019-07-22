package com.shevlik.topic7;

//Задача А5 стр87

import java.util.Arrays;

public class Book {
    private static int idCount=0;
    private int id;
    private String bookName;
    private String publisher;
    private int year;
    private int pageCount;
    private float price;
    private String coverType;
    private String[] authorNames;



    public Book(String bookName, String publisher, int year, int pageCount, float price, String coverType, String... authorNames) {
        id=++idCount;
        this.bookName = bookName;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.coverType = coverType;
        setAuthorNames(authorNames);
    }

    public void searchAuthor(String author){
        int size=authorNames.length;
        for(int i=0;i<size;i++){
            if(authorNames[i].regionMatches(true,0,author,0,author.length())) System.out.println(toString());
            /*else System.out.println("Not found")*/;
        }

    }

    public void searchPublisher(String publisher){
        if(publisher.equals("")) return;
        if(this.publisher.regionMatches(true,0,publisher,0,publisher.length())) System.out.println(toString());
        /*else System.out.println("Not found");*/
    }

    public void searchAfterYear(int year){
        if(year>=this.year) return;
        else System.out.println(toString());
    }


    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String[] getAuthorNames() {
        return authorNames;
    }

    public void setAuthorNames(String[] authorNames) {
        if(authorNames.equals(null)) return;
        int size=authorNames.length;
        this.authorNames=new String[size];
        for(int i=0;i<size;i++) {
            this.authorNames[i] = authorNames[i];
        }
    }

    @Override
    public String toString() {
        return "Код " + id +
                ", '" + bookName + '\'' +
                ", издательство '" + publisher + '\'' +
                ", " + year + " год"+
                ", " + pageCount +" стр."+
                ", цена " + price + " руб."+
                ", переплет " + coverType +
                ", авторы" + Arrays.toString(authorNames);
    }
}
