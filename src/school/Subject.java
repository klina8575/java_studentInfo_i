package school;

import java.util.ArrayList;

import utils.Define;

public class Subject {
	private String subjectName; //과목명
	private int subjectId; //과목코드
	private int gradeType; //학점 평가 정책
	//register() 메소드를 호출하면 이 리스트에 추가됨
	private ArrayList<Student> studentList = new ArrayList<Student>(); //과목을 수강신청한 학생 리스트
	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE; //학점 평가 정책: 기본으로 A,B방식을 사용한다.
	}
	
	public void register(Student student) { //수강신청한 학생이 등록된다.
		studentList.add(student);
	}

	//getter, setter 메소드
	
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
}
