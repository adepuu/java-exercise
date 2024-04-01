package com.adepuu.exercises.session10;


public interface LibraryTransaction {
    void borrowing(String borrower);
    void returning(String borrower);
} 