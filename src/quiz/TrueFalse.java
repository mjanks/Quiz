package quiz;

public class TrueFalse extends Question {

    public TrueFalse(String body, String answer, int points) {
        super(body, answer, points);
    }

    @Override
    public void checkAnswer(String response) {
        if(response.equals(this.getCorrectAnswer())) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect");
        }
    }

}
