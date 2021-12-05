package test.entity;

public class userAnswers {
	questions q;
	int userAnswer;
	public userAnswers(questions q, int userAnswer) {
		super();
		this.q = q;
		this.userAnswer = userAnswer;
	}
	public questions getQ() {
		return q;
	}
	public void setQ(questions q) {
		this.q = q;
	}
	public int getUserAnswer() {
		return userAnswer;
	}
	public void setUserAnswer(int userAnswer) {
		this.userAnswer = userAnswer;
	}
	
}
