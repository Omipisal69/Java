package Demo_II;



public class InSufficientBalanceException extends Exception {
	private String msg;
	public InSufficientBalanceException()
	{
		msg="Balance Is Too Low";
	}
	public String getMessage() {
		return msg;
	}
	
}