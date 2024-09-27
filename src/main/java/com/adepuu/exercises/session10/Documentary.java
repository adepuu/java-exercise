package com.adepuu.exercises.session10;

public class Documentary extends Book {
    private String documentaryTopic;

    public Documentary(String bookName, String bookAuthor, int bookQuantity, String documentaryTopic) {
        super(bookName, bookAuthor, bookQuantity);
        this.documentaryTopic = documentaryTopic;
    }
    public String getDocumentaryTopic() {
        return documentaryTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Topic: " + documentaryTopic);
    }
    @Override
    public void borrowBook() {
        if (getBookQuantity() <= 0) {
            System.out.println("No more Documentary available to be borrowed");
        } else {
            super.borrowBook();
            System.out.println("You have borrowed the " + getBookName() + " book.");
        }
    }
    @Override
    public void returnBook() {
        if (getBookQuantity() >= getInitialBookQuantity()) {
            System.out.println("You might be returning your book to the wrong library. We already have all the books in stock.");
        } else {
            super.returnBook();
            System.out.println("Thank you for returning the borrowed book.");
        }
    }
}
