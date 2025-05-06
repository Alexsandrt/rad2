package com.example.rad2.controller;

import com.example.rad2.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    @Autowired
    private TextService textService;

    @PostMapping("/texts/add")
    public ResponseEntity<String> addText(@RequestParam("text") String text) {
        try {
            textService.addText(text);
            return ResponseEntity.ok("Благодарим за ваше дополнение, после проверки ваш текст будет добавлен на сайт");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ошибка на стороне сервера");
        }
    }
}



/*@RestController
public class TextController {

    @Autowired
    private TextService textService;

    @PostMapping("/texts/add")
    public String addText(@RequestParam("text") String text) {
        textService.addText(text);
        return "Благодарим за ваше дополнение, после проверки ваш текст будет добавлен на сайт";
    }
}*/