package com.androidsabari.quiz;

public class Question  {

    private String question;
    private String questionid;
    private String answers;
    //private String quizid;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;


    public Question(String question, String questionid, String answers,
                    String choice1, String choice2, String choice3, String choice4) {

        this.question = question;
        this.questionid = questionid;
        this.answers = answers;
        //this.quizid = quizid;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

//	public String getQuizid() {
//		return quizid;
//	}
//
//	public void setQuizid(String quizid) {
//		this.quizid = quizid;


//	}

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    public String getChoice4() {
        return choice4;
    }

    public void setChoice4(String choice4) {
        this.choice4 = choice4;
    }

}
