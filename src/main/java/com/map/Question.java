package com.map;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="question")
public class Question {
	@Id
	@Column(name = "question_id")
	private int questionId;
	private String question;

	/*
	 * @OneToOne//this is one to one mapping
	 * 
	 * @JoinColumn(name="a_id") 
	 * private Answer answer;
	 */

	
	// now i am doing for one to many mapping i.e one question have many answer
	//jo join column bnega vo answer vale table me q_id banega.because of mapped by question kiya he .
	//mapped by nahi lagate to yak extra table ban jata i.e question_answer
	@OneToMany(mappedBy="question", fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Answer> answers;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * public Question(int questionId, String question, Answer answer) { super();
	 * this.questionId = questionId; this.question = question; this.answer = answer;
	 * }
	 */ // this constructor is for one to one mapping
	
	public Question(int questionId, String question, List<Answer> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}//this constructor is for one to many.


	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	/*
	  public Answer getAnswer() { return answer; }
	  
	  
	  public void setAnswer(Answer answer) { this.answer = answer; }
	 */ 
	// this is for one to one mapping

}
