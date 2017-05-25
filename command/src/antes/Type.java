package antes;

public enum Type {
	FEE,PHI,PHEUAUX;
	public static final int SIZE = 8;
		
		public int getValue(){
			return this.ordinal();
		}
	
		public static Type forValue(int value){
			return values()[value];
		}
}
