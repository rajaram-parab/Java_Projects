
public class ThrowExceptionThroughMain {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		try {
			throw new Throwable("Caught in main");
		} catch (Exception e) {
			// TODO: handle exception
			//System.err.println("Caught in Main"); // not working
			//System.out.println("Caught in main"); // not working
		}

	}

}
