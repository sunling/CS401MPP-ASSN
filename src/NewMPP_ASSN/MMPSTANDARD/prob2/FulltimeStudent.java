package NewMPP_ASSN.MMPSTANDARD.prob2;

import java.util.List;

public class FulltimeStudent extends Student {
	
	private FulltimeTranscriptRecord fulltimeTransRecord;
	
	public FulltimeStudent(String name, FulltimeTranscriptRecord record){
		super(name);
		this.fulltimeTransRecord = record;
	}


	@Override
	public double computeGpa() {
		// TODO Auto-generated method stub
		double average = 0.0;
		for(Double grades:fulltimeTransRecord.getFallTranscript().getGrades()){
			average += grades;
		}
		for(Double grades:fulltimeTransRecord.getStringTranscript().getGrades()){
			average += grades;
		}
		
		return average/(fulltimeTransRecord.getStringTranscript().getGrades().size()+fulltimeTransRecord.getFallTranscript().getGrades().size());
	}


	public FulltimeTranscriptRecord getFulltimeTransRecord() {
		return fulltimeTransRecord;
	}
	
	
	
}
