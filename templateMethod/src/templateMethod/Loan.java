package templateMethod;

public class Loan {
	 	
	    public double capital;
	    public double duration;
	    protected double riskFactorFor;
	    public double commitimment;
	    public double UnusedPercentage;
		
	    
	    
	    
	    public double getCapital() {
			return capital;
		}
		public void setCapital(double capital) {
			this.capital = capital;
		}
		public double getDuration() {
			return duration;
		}
		public void setDuration(double duration) {
			this.duration = duration;
		}
		public double getCommitimment() {
			return commitimment;
		}
		public void setCommitimment(double commitimment) {
			this.commitimment = commitimment;
		}
		public double getUnusedPercentage() {
			return UnusedPercentage;
		}
		public void setUnusedPercentage(double unusedPercentage) {
			UnusedPercentage = unusedPercentage;
		}

}
