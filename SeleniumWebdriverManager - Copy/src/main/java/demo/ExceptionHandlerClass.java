package demo;

public class ExceptionHandlerClass {

	public static void main(String[] args) {

		try {
			System.out.println("Hello World  . . !\n");
			int i = 1/0;
			System.out.println("Completed");
		}
		catch(Exception e) {
			System.out.println("Below are the exception reasons . . . .");
			System.out.println("Message is : "+e.getMessage());
			System.out.println("Cause is : "+e.getCause());
			e.printStackTrace();
		}
		finally{
			System.out.println("Finally done with all errors");
		}
	}

}
