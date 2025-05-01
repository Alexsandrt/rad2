package com.example.rad2.service;

import com.example.rad2.entity.Text;
import com.example.rad2.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextService {

    @Autowired
    private TextRepository textRepository;

    public void addText(String text) {
        Text textEntity = new Text();
        textEntity.setText(text);
        textRepository.save(textEntity);
    }
}