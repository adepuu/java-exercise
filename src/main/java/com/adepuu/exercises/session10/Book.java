package com.adepuu.exercises.session10;

import java.util.Date;

public class Book extends Material{
  private Date borrowDate;

  private Date returnDate;

  private String borrower;

  public Book(String title, int count) {
    super(title, count);
  }

  public Book(String title, int count, Date borrowDate, Date returnDate, String Borrower) {
    super(title, count);
    this.borrowDate = borrowDate;
    this.returnDate = returnDate;
    this.borrower = Borrower;
  }


  public Date getBorrowDate() {
    return borrowDate;
  }

  public void setBorrowDate(Date borrowDate) {
    this.borrowDate = borrowDate;
  }

  public Date getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(Date returnDate) {
    this.returnDate = returnDate;
  }

  public String getBorrower() {
    return borrower;
  }

  public void setBorrower(String borrower) {
    this.borrower = borrower;
  }

  @Override
  void borrow() {
    if(getCount() > 0) {
      setCount(getCount() - 1);
    }
  }

  @Override
  void returnMaterial() {
      setCount(getCount() + 1);
  }
}
