package NewMPP_ASSN.MMPSTANDARD.prob2;

public class FulltimeTranscriptRecord {
	
	private  SemesterTranscript fallTranscript;
	private SemesterTranscript stringTranscript;
	
	public FulltimeTranscriptRecord(){
		
	}

	public SemesterTranscript getFallTranscript() {
		return fallTranscript;
	}

	public void setFallTranscript(SemesterTranscript fallTranscript) {
		this.fallTranscript = fallTranscript;
	}

	public SemesterTranscript getStringTranscript() {
		return stringTranscript;
	}

	public void setSpringTranscript(SemesterTranscript stringTranscript) {
		this.stringTranscript = stringTranscript;
	}
	
	

}
