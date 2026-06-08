package com.example.crud.exception;

public class CustomExceptionExample {
    private static int balance=200;

    public static void main(String[] args) {
        try{
            withdraw(300);
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }


    }
    public static void withdraw(int ammount){
        if(ammount>balance){
            throw new LowBalanceException("Your balance is low");
        }
        balance = balance - ammount;
    }

}
