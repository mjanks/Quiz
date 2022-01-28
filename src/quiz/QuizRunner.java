package quiz;

public class QuizRunner {
    public static void main(String[] args) {
        Question q1 = new TrueFalse("The sky is blue. True or False?", "True", 5);

        Quiz myQuiz = new Quiz();
        myQuiz.addQuestion(q1);

        myQuiz.startQuiz();
    }
}
