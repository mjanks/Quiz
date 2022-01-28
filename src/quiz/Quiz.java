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

    public void startQuiz() {
        Scanner scan = new Scanner(System.in);
        for(Question question : listOfQuestions) {
            if(question instanceof TrueFalse) {
                System.out.println(question.getQuestionBody());
                System.out.println("True or False?");
                String response = scan.nextLine();
                question.checkAnswer(response);
            } else if(question instanceof MultipleChoice) {
                System.out.println(question.getQuestionBody());
                System.out.println(((MultipleChoice) question).getFirstChoice());
                System.out.println(((MultipleChoice) question).getSecondChoice());
                System.out.println(((MultipleChoice) question).getThirdChoice());
                System.out.println(((MultipleChoice) question).getFourthChoice());
                String response = scan.nextLine();
                question.checkAnswer(response);
            } else if(question instanceof CheckBox) {
                System.out.println(question.getQuestionBody());
                System.out.println("Enter all correct responses, in order, separated by a space:");
                System.out.println(((CheckBox) question).getFirstChoice());
                System.out.println(((CheckBox) question).getSecondChoice());
                System.out.println(((CheckBox) question).getThirdChoice());
                System.out.println(((CheckBox) question).getFourthChoice());
                String response = scan.nextLine();
                question.checkAnswer(response);
            }
        }
        System.out.println("Great job!");
    }
}
