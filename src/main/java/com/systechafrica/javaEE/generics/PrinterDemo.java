package com.systechafrica.javaEE.generics;

public class PrinterDemo {
    public static void main(String[] args) {
        Printer<String> printName = new Printer<>("Nick");
        printName.print();
        Printer<Integer> printNum = new Printer<Integer>(15);
        printNum.print();
    }
}
