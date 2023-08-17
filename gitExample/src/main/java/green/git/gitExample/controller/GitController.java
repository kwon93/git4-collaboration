package green.git.gitExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLOutput;

@Controller
public class GitController {

    @GetMapping
    public void test(){
        System.out.println("테스트");
    }


}
