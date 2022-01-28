package quiz;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> listOfQuestions;

    public Quiz() {
        listOfQuestions = new ArrayList<Question>();
    }

    public void addQuestion(Question aQuestion) {
        listOfQuestions.add(aQuestion);
    }

    public void displayQuiz() {
        for(Question question : listOfQuestions) {
            System.out.println(question.getQuestionBody());
        }
    }
}
