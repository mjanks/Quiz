package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> listOfQuestions;

    public Quiz() {
        listOfQuestions = new ArrayList<Question>();
    }

    public void addQuestion(Question aQuestion) {
        listOfQuestions.add(aQuestion);
    }

    public void displayQuestions() {
        for(Question question : listOfQuestions) {
            System.out.println(question.getQuestionBody());
        }
    }

    public void startQuiz() {
        Scanner scan = new Scanner(System.in);
        for(Question question : listOfQuestions) {
            System.out.println(question.getQuestionBody());
            String response = scan.nextLine();
            question.checkAnswer(response);
        }
    }
}
