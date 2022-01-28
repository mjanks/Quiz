package quiz;

public class QuizRunner {
    public static void main(String[] args) {
        Question q1 = new Question("What is two plus two?", "4", 5);
        Question q2 = new Question("What is the capital of Michigan?", "Lansing", 10);

        Quiz myQuiz = new Quiz();
        myQuiz.addQuestion(q1);
        myQuiz.addQuestion(q2);

        myQuiz.displayQuiz();
    }
}
