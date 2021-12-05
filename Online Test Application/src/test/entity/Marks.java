package test.entity;

public class Marks {
Student s;
int mark;
float per;
char grade;
int tot;
public int getTot() {
	return tot;
}
public void setTot(int tot) {
	this.tot = tot;
}
public Marks(Student s, int mark, float per, char grade, int tot) {
	super();
	this.s = s;
	this.mark = mark;
	this.per = per;
	this.grade = grade;
	this.tot = tot;
}
public Student getS() {
	return s;
}
public void setS(Student s) {
	this.s = s;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}
public float getPer() {
	return per;
}
public void setPer(float per) {
	this.per = per;
}
public char getGrade() {
	return grade;
}
public void setGrade(char grade) {
	this.grade = grade;
}



}
