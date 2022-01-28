package quiz;

public class TrueFalse extends Question {

    public TrueFalse(String body, String answer, int points) {
        super(body, answer, points);
    }

    @Override
    public void checkAnswer(String response) {
        if(response.equalsIgnoreCase(getCorrectAnswer())) {
            System.out.println("Correct!");
            setCorrect(true);
        } else {
            System.out.println("Incorrect");
            setCorrect(false);
        }
    }

}
