package com.abebe.demospringboot;

import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

public class ObjectUsage {


       public String ShowIndex2()
       {
           String userName="";
           Scanner keyBoard = new Scanner(System.in);
           userName = keyBoard.nextLine();
           String greet = "Hello" +" "+ userName;
           System.out.println(greet);
           System.out.println("hello sir");
           return  greet;
       }




}
