package ss;

public class ThrouguhCommandLineUsingException 
{
	public static void main(String [] args)
	{
    
	try
	{
        System.out.println("Argument one = "+args[0]);
        
    }
	catch( ArrayIndexOutOfBoundsException ae)
	{
		System.out.println("Enter one arg" );
	}
	}

}
