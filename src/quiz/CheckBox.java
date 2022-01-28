package quiz;

public class CheckBox extends Question {

    public CheckBox(String body, String answer, int points) {
        super(body, answer, points);
    }

    @Override
    public void checkAnswer(String userResponse) {
        System.out.println("Not yet implemented!");
    }
}
