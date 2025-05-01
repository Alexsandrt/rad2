package com.example.rad2.controller;

import com.example.rad2.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    @Autowired
    private TextService textService;

    @PostMapping("/texts/add")
    public String addText(@RequestParam("text") String text) {
        textService.addText(text);
        return "Благодарим за ваше дополнение, после проверки ваш текст будет добавлен на сайт";
    }
}