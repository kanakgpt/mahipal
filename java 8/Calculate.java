package com.example.crud.java8;

@FunctionalInterface
public interface Calculate {//Single responsibility interface
    void perform(int a , int b);
    default void display(){
        System.out.println("This is a default method in the Calculate interface.");
    }
}
//BlueDart,DTDC,Express

// interface Shipment{


//SOLID Design Pattern
