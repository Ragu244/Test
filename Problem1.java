import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) { 
		
		int numberOfPeople=8;
 
		int[] peopleAge= {20,21,22,40,50,52,54,55};
		  
		int count_1to10=0,count_11to20=0,count_21to30=0,count_31to40=0,count_41to50=0,count_51to60=0,count_61to70=0,count_71to80=0,count_81to90=0,count_91to100=0;
		
		for(int temp=0;temp<numberOfPeople;temp++)
		{
			if(peopleAge[temp]>=1 && peopleAge[temp]<=10)
			{
				count_1to10++;
			} 
			else if(peopleAge[temp]>=11 && peopleAge[temp]<=20)
			{
					count_11to20++;
			} 
			else if(peopleAge[temp]>=21 && peopleAge[temp]<=30)
			{
					count_21to30++;
			}
			else if(peopleAge[temp]>=31 && peopleAge[temp]<=40)
			{
					count_31to40++;
			}
			else if(peopleAge[temp]>=41 && peopleAge[temp]<=50)
			{
					count_41to50++;
			}
			else if(peopleAge[temp]>=51 && peopleAge[temp]<=60)
			{
					count_51to60++;
			}
			else if(peopleAge[temp]>=61 && peopleAge[temp]<=70)
			{
					count_61to70++;
			}
			else if(peopleAge[temp]>=71 && peopleAge[temp]<=80)
			{
					count_71to80++;
			}
			else if(peopleAge[temp]>=81 && peopleAge[temp]<=90)
			{
					count_81to90++;
			}
			else if(peopleAge[temp]>=91 && peopleAge[temp]<=100)
			{
					count_91to100++;
			}
		}
		
		System.out.println("age group \t total people");
		System.out.println("1 to 10 \t"+count_1to10);
		System.out.println("11 to 20 \t"+count_11to20);
		System.out.println("21 to 30 \t"+count_21to30);
		System.out.println("31 to 40 \t"+count_31to40);
		System.out.println("41 to 50 \t"+count_41to50);
		System.out.println("51 to 60 \t"+count_51to60);
		System.out.println("61 to 70 \t"+count_61to70);
		System.out.println("71 to 80 \t"+count_71to80);
		System.out.println("81 to 90 \t"+count_81to90);
		System.out.println("91 to 100 \t"+count_91to100);
		
	}

}
