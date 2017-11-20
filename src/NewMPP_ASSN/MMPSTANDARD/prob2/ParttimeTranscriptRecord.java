package NewMPP_ASSN.MMPSTANDARD.prob2;
import java.util.*;
public class ParttimeTranscriptRecord {
	
	private List <Double> grades;
	
	public ParttimeTranscriptRecord(){
		grades = new ArrayList<>();
	}

	public List<Double> getGrades() {
		return grades;
	}

	public void insertGrade(Double grade) {
		this.grades.add(grade);
	}
	
	
	
}
