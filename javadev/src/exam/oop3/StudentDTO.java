package exam.oop3;

public class StudentDTO { //DTO == data transfer object
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int phi;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getPhi() {
		return phi;
	}
	public void setPhi(int phi) {
		this.phi = phi;
	}
	
	public int getTotal() {
		return  this.getKor() + 
				this.getEng() + 
				this.getMat() + 
				this.getPhi();
	}
	
	public int getAvg() {
		return getTotal()/4;
	}
	
	public String getStudentScore() {
		return  this.getName() + "\t" +
				this.getKor() + "\t" +
				this.getEng() + "\t" +
				this.getMat() + "\t" +
				this.getPhi() + "\t" +
				this.getTotal() + "\t" +
				this.getAvg();
	}
	
}
