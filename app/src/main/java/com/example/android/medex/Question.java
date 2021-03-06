package com.example.android.medex;

import android.content.Intent;

import java.util.HashMap;
import java.util.List;

class Question {

    String question;
    String timeOut;
    List<String> options;
    String answer;

    public Question() {

    }

    public Question(String question, String timeOut, List<String> options, String answer, HashMap<String, Boolean> responses) {
        this.question = question;
        this.timeOut = timeOut;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getTimeOut() {
        return Integer.parseInt(timeOut);
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
