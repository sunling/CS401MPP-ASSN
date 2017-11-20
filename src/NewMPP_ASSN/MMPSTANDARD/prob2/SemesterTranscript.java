package NewMPP_ASSN.MMPSTANDARD.prob2;

import java.util.ArrayList;
import java.util.List;

public class SemesterTranscript {
	
private List <Double> grades;
	
	public SemesterTranscript(){
		grades = new ArrayList<>();
	}

	public List<Double> getGrades() {
		return grades;
	}

	public void insertGrade(Double grade) {
		this.grades.add(grade);
	}
	
	
}
