package NewMPP_ASSN.MMPSTANDARD.prob2;
import java.util.*;
public class ParttimeStudent  extends Student {

	private ParttimeTranscriptRecord partTimeTransRecord;
	
	public ParttimeStudent(String name,ParttimeTranscriptRecord record) {
		super(name);
		// TODO Auto-generated constructor stub
		this.partTimeTransRecord = record;
	}

	@Override
	public double computeGpa() {
		// TODO Auto-generated method stub
		return partTimeTransRecord.getGrades().stream().mapToDouble(e->e).average().getAsDouble();
	}

	public ParttimeTranscriptRecord getPartTimeTransRecord() {
		return partTimeTransRecord;
	}
	
	
	
}
