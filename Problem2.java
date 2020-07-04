
public class Problem2 {
 
	public static void print(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
			System.out.print( arr[i]+" ");
		
		System.out.println();
	}
	
	//	without using temp array
	
	public static int[] moveRightByOne(int[] arr,int n)
	{
		int t=arr[n-1],i;
		for(i=n-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[i]=t;
		
		return arr;
	}
	
	public static void moveRight_methodOne(int[] arr,int n,int k)
	{ 
		for(int i=0;i<k;i++)
			moveRightByOne(arr,n);
		
		print(arr,n);
	}
	 
	//	Using temp array
	
	public static void moveRight_methodTwo(int[] arr,int n,int k)
	{ 
		int[] temp=new int[n];
		 
		int index=0;
		for(int i=n-k;i<n;i++)
		{
			temp[index++]=arr[i];
		}
		
		for(int i=0;i<=k;i++)
		{
			temp[index++]=arr[i];
		}
		
		print(temp,n);
	}
	
	public static void main(String[] args) {
	  
		int n=7,k=3;
		int[] arr= {1,2,3,4,5,6,7};
		 
		// method 2
		moveRight_methodTwo(arr,n,k);
		 		
		//	method 1
		moveRight_methodOne(arr,n,k);
		
		
	}

}
