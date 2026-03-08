package org.example.dependencies;

public class Exam {
    private AnswerChecker answers;

    public AnswerChecker getAnswers() {
        return answers;
    }

    public void setAnswers(AnswerChecker answers) {
        this.answers = answers;
        System.out.println("We've just set answer using setter");
    }

    public void examCheck() {
        answers.checkAnswer();
    }
}
