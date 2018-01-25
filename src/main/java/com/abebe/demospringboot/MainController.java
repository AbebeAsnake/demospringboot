package com.abebe.demospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping(value="/home/data/la")
    public String ShowIndex()
    {
        String userName;
        Scanner keyBoard = new Scanner(System.in);
        userName = keyBoard.nextLine();
        String greet = "Hello" +" "+ userName;
        System.out.println(greet);
        System.out.println("hello sir");
        return  greet;
    }

}
