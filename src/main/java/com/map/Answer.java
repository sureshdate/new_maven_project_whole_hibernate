package com.map;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="answer")
public class Answer {

	@Id
	private int answer_id;
	private String answer;

	/*
	 * /@OneToOne //this is optional if u want question id in answer table then we
	 * have to map.otherwise not. //this is back operation.that is bidirectionl.
	 * //nOw if u dont want question_id field in answertable then use follwing rule
	 * 
	 * @OneToOne(mappedBy="answer") 
	   private Question question;
	 */

	@ManyToOne
	@JoinColumn(name="Q_id")//rename the column name which is mapped by question.
	private Question question;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int answer_id, String answer, Question question) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
		this.question = question;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
