
public class Student {
	private double[] scores = new double[4];
	private double GPA;
	private String name = "";
	public Student(double score1, double score2, double score3, double score4) {
		this.scores[0] = score1;
		this.scores[1] = score2;
		this.scores[2] = score3;
		this.scores[3] = score4;
	}
	public void setScores(double a, double b, double c, double d){
		this.scores[0] = a;
		this.scores[1] = b;
		this.scores[2] = c;
		this.scores[3] = d;
	}
	public double getScore1() {
		return scores[0];
	}
	public void setScore1(double score1) {
		this.scores[0] = score1;
	}
	public double getScore2() {
		return scores[1];
	}
	public void setScore2(double score2) {
		this.scores[1] = score2;
	}
	public double getScore3() {
		return scores[2];
	}
	public void setScore3(double score3) {
		this.scores[2] = score3;
	}
	public double getScore4() {
		return scores[3];
	}
	public void setScore4(double score4) {
		this.scores[3] = score4;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		this.GPA = gPA;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
