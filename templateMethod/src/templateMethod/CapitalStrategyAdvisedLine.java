package templateMethod;

public class CapitalStrategyAdvisedLine extends CapitalStrategy{
	
	public double capital(Loan loan){
		return loan.getCommitimment() * loan.getUnusedPercentage()* duration() * riskFactorFor();
	}

	@Override
	public double capital() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double duration() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double riskFactorFor() {
		// TODO Auto-generated method stub
		return 0;
	}

}
