package com.cdac.model;

public class Options {
	private String option;
	private boolean isRightAnswer;
	
	public Options(String option, boolean isRightAnswer) {
		super();
		this.option = option;
		this.isRightAnswer = isRightAnswer;
	}

	public Options() {
		super();
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public boolean isRightAnswer() {
		return isRightAnswer;
	}

	public void setRightAnswer(boolean isRightAnswer) {
		this.isRightAnswer = isRightAnswer;
	}
	
	
	
	
	
	
}
