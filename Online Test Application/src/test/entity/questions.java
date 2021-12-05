package test.entity;

public class questions {
	int questionid;
	String question;
	String Op1;
	String Op2;
	int answer;
	
	
	public questions(int questionid, String question, String op1, String op2, int answer) {
		super();
		this.questionid = questionid;
		this.question = question;
		Op1 = op1;
		Op2 = op2;
		this.answer = answer;
	}
	public questions() {
		// TODO Auto-generated constructor stub
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOp1() {
		return Op1;
	}
	public void setOp1(String op1) {
		Op1 = op1;
	}
	public String getOp2() {
		return Op2;
	}
	public void setOp2(String op2) {
		Op2 = op2;
	}
	
}
