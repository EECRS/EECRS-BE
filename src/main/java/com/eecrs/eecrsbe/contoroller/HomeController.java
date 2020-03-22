package com.eecrs.eecrsbe.contoroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public ResponseEntity openSwaggerPage(HttpServletResponse response) {
        try {
            response.sendRedirect("/swagger-ui.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok().build();
    }

}
