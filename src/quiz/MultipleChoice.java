package quiz;

public class MultipleChoice extends Question {

    public MultipleChoice(String body, String answer, int points) {
        super(body, answer, points);
    }

    @Override
    public void checkAnswer(String userResponse) {
        System.out.println("Not yet implemented!");
    }
}
