package ss;

public class UsingStringBuffer
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

	

	
	StringBuffer br= new StringBuffer(args[0]);
	
	if(args[0].equals(br.reverse().toString()))
	{
		System.out.println("You are welcome");
	}
	else
	{
		System.out.println("You are not lucky user");
	}
	
}
}
