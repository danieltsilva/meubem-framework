package com.meubem.core.controllers;

import com.meubem.core.models.Question;
import com.meubem.core.repositories.QuestionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class QuestionController {

    @Autowired
    QuestionRepository questionRepository;

    @GetMapping("/questions")
    public List<Question> getQuestions() {
        log.info("Get all questions");

        List<Question> list = new ArrayList<>();
        Iterable<Question> customers = questionRepository.findAll();

        customers.forEach(list::add);
        return list;
    }

}
