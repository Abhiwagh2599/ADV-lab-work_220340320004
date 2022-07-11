package com.cdac.model;

import java.util.List;

public class Question {
	private String question;
	private List<Options>options;
	public Question(String string) {
		
	}
	
	public List<Options> getOptions() {
		return options;
	}
	public void setOptions(List<Options> options) {
		this.options = options;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
		
}
