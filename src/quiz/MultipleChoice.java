package quiz;

public class MultipleChoice extends Question {
    private String firstChoice;
    private String secondChoice;
    private String thirdChoice;
    private String fourthChoice;

    public MultipleChoice(String body, String answer, int points, String choice1, String choice2,
                          String choice3, String choice4) {
        super(body, answer, points);
        firstChoice = choice1;
        secondChoice = choice2;
        thirdChoice = choice3;
        fourthChoice = choice4;
    }

    public String getFirstChoice() {
        return firstChoice;
    }

    public String getSecondChoice() {
        return secondChoice;
    }

    public String getThirdChoice() {
        return thirdChoice;
    }

    public String getFourthChoice() {
        return fourthChoice;
    }

    @Override
    public void checkAnswer(String userResponse) {
        if(userResponse.equalsIgnoreCase(getCorrectAnswer())) {
            System.out.println("Correct!");
            setCorrect(true);
        } else {
            System.out.println("Incorrect");
            setCorrect(false);
        }
    }
}
