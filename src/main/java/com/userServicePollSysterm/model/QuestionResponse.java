package com.userServicePollSysterm.model;

public class QuestionResponse {
    private Long questionId;
    private String questionTitle;
    private String firstAnswerOption;
    private String secondAnswerOption;
    private String thirdAnswerOption;
    private String fourthAnswerOption;

    public QuestionResponse() {}

    public QuestionResponse(Long questionId, String questionTitle, String firstAnswerOption, String secondAnswerOption, String thirdAnswerOption, String fourthAnswerOption) {
        this.questionId = questionId;
        this.questionTitle = questionTitle;
        this.firstAnswerOption = firstAnswerOption;
        this.secondAnswerOption = secondAnswerOption;
        this.thirdAnswerOption = thirdAnswerOption;
        this.fourthAnswerOption = fourthAnswerOption;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public String getFirstAnswerOption() {
        return firstAnswerOption;
    }

    public String getSecondAnswerOption() {
        return secondAnswerOption;
    }

    public String getThirdAnswerOption() {
        return thirdAnswerOption;
    }

    public String getFourthAnswerOption() {
        return fourthAnswerOption;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public void setFirstAnswerOption(String firstAnswerOption) {
        this.firstAnswerOption = firstAnswerOption;
    }

    public void setSecondAnswerOption(String secondAnswerOption) {
        this.secondAnswerOption = secondAnswerOption;
    }

    public void setThirdAnswerOption(String thirdAnswerOption) {
        this.thirdAnswerOption = thirdAnswerOption;
    }

    public void setFourthAnswerOption(String fourthAnswerOption) {
        this.fourthAnswerOption = fourthAnswerOption;
    }


}
