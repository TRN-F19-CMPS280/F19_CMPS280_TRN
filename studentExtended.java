package CMPS280;

public class studentExtended extends Student {

	String fullName;
	
	
	public studentExtended() {

	}
	
	public studentExtended (String fullName) {
		this.fullName = fullName;
	}
	
	@Override
	public String getFullName() {
		return this.fullName;
	}

	@Override
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
}
