package org.example.javaconfighigh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ExamConfig.class);

        Exam exam = context.getBean(Exam.class);
        exam.examCheck();
    }

}
