
public class Student {
	String name, stu_no;
	int kor, eng, mat, edp, tot;
	double avg;
	char grade;
// 이 아래로는 전부 툴 사용 
	
	public Student() { // Default constructor 기본 

		
	}// 생성자는 항상 이름이 같으니 오버로딩함. 

	public Student(String name, String stu_no, int kor, int eng, int mat, int edp) { //파라미터 있는거 
		super();
		this.name = name;
		this.stu_no = stu_no;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.edp = edp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStu_no() {
		return stu_no;
	}

	public void setStu_no(String stu_no) {
		this.stu_no = stu_no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEdp() {
		return edp;
	}

	public void setEdp(int edp) {
		this.edp = edp;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override		//4가지 조건 있어야 이걸 붙일 수 있다. 
	public String toString() { //-가 왼정렬
		return String.format("%-10s %10s %5d %5d %5d %5d \t\t%5d %8.2f %5c]",
				name, stu_no, kor, eng, mat, edp, tot, avg, grade);
	}
}
