import java.util.*;
public class arraylistintsum {
public static void sumofodd(List<Integer> list)
{
	int sum=0;
	for(int i=0;i<10;i++)
	{
		if(list.get(i)%2==0)continue;
		else sum+=list.get(i);
		//for(int i:values) sum+=i;
	}
	System.out.println("Sum of odd numbers: "+sum);
	
}

	//@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		int[] values = {1,2,3,4,5,6,7,8,9,10};
		for(int i:values)
			list.add(new Integer(i));
		sumofodd(list);

}
}