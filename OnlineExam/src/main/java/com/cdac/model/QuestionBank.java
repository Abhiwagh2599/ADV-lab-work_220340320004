package com.cdac.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {
	//key-value pair (key==>subject name value===>question of that subject )
	private Map<String, List<Question>>questionBank=new HashMap<>();
	
	public void addNewSubject(String Subject) {
		questionBank.put(Subject,new ArrayList<>());
	}
	
	public void addNewQuestion(String subject,Question question ) {
		List<Question>questions=questionBank.get(subject);
		questions.add(question );
	}
	public List<Question> fetchQuestionOn(String subject) {
		return questionBank.get(subject);
	}
	
}
