class PopulationProjection 
{
	public static void main(String[] args) 
	{
		final long currPop = 312032486l;
		long seconds = (365*24*60*60)*5;
		long birth = seconds/7;
		long death = seconds/13;
		long imm = seconds/45;
		long newPop = currPop + birth + imm - death;
		System.out.println("Current population = "+currPop);
		System.out.println("Population in next 5 years = "+newPop);
	}
}
