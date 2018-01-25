package com.abebe.demospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping(value="/")
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
    @RequestMapping("/getname")
    public String showWithName(@RequestParam("name") String name,@RequestParam("age") int age,@RequestParam("color") String color)
    {

        return name+" "+age+"" + ""+color;
    }


    @RequestMapping("/getothername")
    public String showWithName(HttpServletRequest param)
    {

        String withName = param.getParameter("yourname");
        if(withName==null)
            return "Just Hello";
        else return "Hello "+withName;
    }

}
