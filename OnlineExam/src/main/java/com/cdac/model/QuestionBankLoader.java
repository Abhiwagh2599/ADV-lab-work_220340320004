package com.cdac.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {
	public List<Question> loadQuestionBank(){
		QuestionBank qb=new QuestionBank();
		qb.addNewSubject("Java");//================//calling questionBank
		
		//now  adding question 
		Question q =new Question("What is a correct syntax to output");
		List<Options > ops=new ArrayList<Options>();
		ops.add(new Options("Console.WriteLine(..)",false));
		ops.add(new Options("System.out.println(..)", true));
		ops.add(new Options("echo(..)", false));
		ops.add(new Options("print(..)", false));
		
		q = new Question("What is G1 in Java?");
		ops = new ArrayList<Options>();
		ops.add(new Options("G1 is nickname of Jeevan", false));
		ops.add(new Options("G1 is Sequel of SRK's Ra.One", false));
		ops.add(new Options("G1 is a type of Garbage Collector", true));
		ops.add(new Options("G1 is the name of next bond movie", false));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);
		
		q = new Question("What is JVM in Java?");
		ops = new ArrayList<Options>();
		ops.add(new Options("Java Viral Machine", false));
		ops.add(new Options("Java Visual Machine", false));
		ops.add(new Options("Java Vending Machine", false));
		ops.add(new Options("Java Virtual Machine", true));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);
		
		q = new Question("What happens when a Java code is compiled?");
		ops = new ArrayList<Options>();
		ops.add(new Options("Bytecode is produced", true));
		ops.add(new Options("Nativecode is produced", false));
		ops.add(new Options("Assembly code is produced", false));
		ops.add(new Options("None of the above", false));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);
		
		q = new Question("What is an Object?");
		ops = new ArrayList<Options>();
		ops.add(new Options("Object is an instance of a class", true));
		ops.add(new Options("Object is a primitive datatype", false));
		ops.add(new Options("Object is the one who runs our code", true));
		ops.add(new Options("None of the above", false));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);
		
		return qb.fetchQuestionOn("Java");
		
	}
	
	
}
