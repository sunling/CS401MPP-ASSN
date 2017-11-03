package NewMPP_ASSN.Lab3.prob1.prob4;

public class House implements Property {
	
	double lotSize = 0;
	public House(double lotSize){
		this.lotSize = lotSize;
	}

	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return lotSize * 0.1;
	}
	
	

}
