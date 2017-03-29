import java.util.*;
public class BinarySearch {

	public static void main(String args[])
	{
		Search a= new Search(); //object of class Search
		a.getArray();	
		a.displayArray();
		a.searchArray();
		
	}
}

class Search
{
	int a[]=new int[20];
	int i,m,n,val;
	Scanner input=new Scanner(System.in);
	
	//method to accept array elements and search element
	void getArray()
	{
		System.out.println("Enter size of the array --->");
		n= input.nextInt();
		
		System.out.println("Enter array elements in ascending order --->");
		for(i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		
		System.out.println("Enter element to be searched --->");
		val=input.nextInt();
		
	}
	
	
	//method to display the array
	void displayArray()
	{
		System.out.println("Array elements --->");
		for(i=0;i<n;i++)
		{
			System.out.println("  "+a[i]+"  ");
		}
	}
	
	
	//method to implement binary search
	void searchArray()
	{ 
		int l,r,m; // left right and middle indices
		l = 0;	//set left index to 0
		r = n-1;	//set right index to last element
		
		
		while(l<=r)		//loop executes if left index is less than or = right index
		{
			m = (l+r)/2;	//middle index =l+r/2
			
	/*compare middle element with search .
	 * If middle element is less than search value then change left index to m+1
	 */
			if(a[m]<val)	
			{
				l=m+1;
			}
			
	/*
	 * If middle value is = search value return position 
	 */
			else if(val==a[m])
			{
				i=m+1;
				System.out.println("Search is successful");
				System.out.println("Element found at " +i+ " position");
				break;
			}
		
	/*
	 * iF MIDDLE VALUE > SEARCH VALUE CHANGE RIGHT INDEX TO M-1
	*/
			else if (val>a[m])
			{
				l=m+1;
			}
			
			else
			{
				r=m-1;
			}
		}
		
		if(l>r) // If l>r search element is not found in the array
		{
			System.out.println("Element not found!!");
		}
		
	}
	
}