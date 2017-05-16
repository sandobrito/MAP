package templateMethod;

public abstract class CapitalStrategy {

	public abstract double capital();

    public abstract double duration();

    public abstract double riskFactorFor();
    
    

    

    public final double capitalTemplate(Loan loan){
        return duration() *
                riskFactorFor() *
                capital();
    }


}
