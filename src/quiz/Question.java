package quiz;

public class Question {
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

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
