package templateMethod;

public class CapitalStrategyRevolver extends CapitalStrategy {

	@Override
	public double capital() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double duration() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public double riskFactorFor() {
		// TODO Auto-generated method stub
		return 2;
	}
	public double capital(Loan loan){
		return loan.outstandingRiskAmount() *
	               duration() *
	               riskFactorFor() +
	                (loan.unusedRiskAmount()*
	                        duration()*
	                        unusedRiskFactor());
	}

}
