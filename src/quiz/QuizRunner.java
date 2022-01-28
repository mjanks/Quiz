package quiz;

public class QuizRunner {
    public static void main(String[] args) {
        Question tf = new TrueFalse("The sky is blue.", "True", 5);
        Question multiple = new MultipleChoice("What is the capital of Michigan?", "Lansing", 10,
                "Sandusky", "Detroit", "Ann Arbor", "Lansing");
        Question check = new CheckBox("Which are states in the US?", "Michigan California", 20,
                "Michigan", "Detroit", "California", "Westland");

        Quiz myQuiz = new Quiz();
        myQuiz.addQuestion(tf);
        myQuiz.addQuestion(multiple);
        myQuiz.addQuestion(check);

        myQuiz.startQuiz();
    }
}
