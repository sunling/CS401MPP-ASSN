package NewMPP_ASSN.Lab2.Lab4a;

import java.util.*;

public class Student {
	String name;
	List<TranscriptEntry> grades;
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}
	
}
