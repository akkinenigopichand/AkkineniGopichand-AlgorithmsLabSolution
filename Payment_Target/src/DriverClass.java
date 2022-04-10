import java.util.Scanner;

public class DriverClass {

	Scanner sc = new Scanner(System.in);
	
	int array[];
	int size,i,noOf,targetValue;
	
	
	void SetSize() 
	{
		System.out.println("Enter the size of transaction array");
		size = sc.nextInt();
		array= new int[size];
	}
	
	
	void TakeValues()
	{
		System.out.println("Start entering the values for the array");
		
		for(i=0;i<size;i++)
		{
			//taking values for the transactions individually
			System.out.println("enter the value for the transaction number - "+(i+1));
			array[i]=sc.nextInt();
		}	
	}
	
	
	void NoOfTargets() 
	{
		System.out.println("Enter the total no of targets that needs to be achieved");
		noOf=sc.nextInt();
	}
	
	
	
	void Check() 
	{
		for(i=0;i<noOf;i++) 
		{
			System.out.println("Enter the value of target ");
			targetValue=sc.nextInt();
			
			int sum=0,count=0;
			boolean chk = false;
			
			for(int j=0;j<size;j++) 
			{
				if(sum>targetValue)
				{
					chk=true ;
					break;
				}
				sum=sum+array[j];
				count++;
			}
			
			if(chk) {System.out.println("Target achieved after "+count+" transactions ");}
			else {System.out.println("Given target is not achieved ");}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DriverClass obj = new DriverClass();
		
		obj.SetSize();
		obj.TakeValues();
		obj.NoOfTargets();
		obj.Check();
		
		
		}
	
	
}
