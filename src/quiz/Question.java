package quiz;

public abstract class Question {
    private String questionBody;
    private String correctAnswer;
    private int pointValue;
    private boolean isCorrect;

    public Question(String body, String answer, int points) {
        questionBody = body;
        correctAnswer = answer;
        pointValue = points;
        isCorrect = false;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public int getPointValue() {
        return pointValue;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public abstract void checkAnswer(String userResponse);
}
