package org.example.javaconfighigh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ExamConfig {

    @Bean
    @Scope("singleton")
    public Exam exam() {
        return new Exam(answerCheck());
    }

    @Bean
    public AnswerCheck answerCheck() {
        return new AnswerCheck();
    }
}
