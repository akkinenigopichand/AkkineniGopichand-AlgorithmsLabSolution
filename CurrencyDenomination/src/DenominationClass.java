import java.util.Scanner;

public class DenominationClass {

	Scanner sc = new Scanner(System.in);
	
	int denom[],count[];
	int size,i,amount,temp;
	
	
	void SetSize()
	{
		System.out.println("Enter the size of currency denominations ");
		size = sc.nextInt();
		denom= new int[size];
		count= new int[size];
	}
	
	
	void SetDenom()
	{
		System.out.println("Enter the currency denominations value ");
		for(i=0;i<size;i++)
		{
			denom[i]=sc.nextInt();
		}
		
		//setting the values of count array to zero
		for(i=0;i<size;i++) 
		{
			count[i]=0;
		}
	}
	
	
	
	void Sort() 
	{	
		//bubble sort in descending order
		temp = 0;
		for(i=0; i < size; i++)
		{  
            for(int j=1; j < (size-i); j++)
            {  
            	if(denom[j-1] < denom[j])
            	{    
            		temp = denom[j-1];  
            		denom[j-1] = denom[j];  
            		denom[j] = temp;  
            	}  
                     
            }  
		}  
		
	}
	
	
	
	
	
	void CountDenom() 
	{
		System.out.println("Enter the amount you want to pay - ");
		amount = sc.nextInt();
		
		
		try 
		{
			//counting the denominations
			for(i=0;i<size;i++)
			{	
				count[i]=(amount/denom[i]);
				amount=amount-(count[i]*denom[i]);
			}
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e+" denominations of zero are invalid");
		}
		
		
		
	}
	
	
	void Print() 
	{
		
		if(amount!=0)
		{
			System.out.println("Exact amount is not achievable with these denominations");
		}
		
		else
		{
			System.out.println("Your payment approach in order to give min no of notes will be ");
			for(i=0;i<size;i++) 
			{
				if(count[i]!=0)
				{
					System.out.println(denom[i]+" : "+count[i]);
				}
			}
		}
		
	}
	
	
	public static void main(String args[]) 
	{
		DenominationClass obj = new DenominationClass();
		
		obj.SetSize();
		obj.SetDenom();
		obj.Sort();
		obj.CountDenom();
		obj.Print();
		
		
	}
}
