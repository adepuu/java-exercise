package com.adepuu.exercises.session10;

import java.util.Date;

public class Magazine extends Material{
  private Date borrowDate;

  private Date returnDate;

  private String borrower;

  public Magazine(String title, int count) {
    super(title, count);
  }

  public Magazine(String title, int count, Date borrowDate, Date returnDate, String Borrower) {
    super(title, count);
    this.setBorrowDate(borrowDate);
    this.setReturnDate(returnDate);
    this.setBorrower(Borrower);
  }

  @Override
  void borrow() {

  }

  @Override
  void returnMaterial() {

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


}
