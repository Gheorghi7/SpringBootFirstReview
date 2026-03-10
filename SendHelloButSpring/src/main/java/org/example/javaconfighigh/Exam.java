package org.example.javaconfighigh;

public class Exam {
    private AnswerCheck answerCheck;

    public Exam(AnswerCheck answerCheck) {
        this.answerCheck = answerCheck;
    }

    public AnswerCheck getAnswerCheck() {
        return answerCheck;
    }

    public void examCheck() {
        AnswerCheck.checkAnswer();
    }
}
