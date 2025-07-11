package arrays;
import java.util.Arrays;
public class SortPositiveNegative {
	public static void main(String[] args)
	{
		int[]ar= {-1,-2,3,-2,-2,-3,6,7,8,-10,10,-1,9,-9};
		int[]neg=new int[ar.length];
		int[]pos=new int[ar.length];
		int memp=0, memn=0;
		for(int i =0 ; i<ar.length ;i++)
		{
			if(ar[i]<0)
			{
				neg[memn]=ar[i];
				memn++;
			}
			else
			{
				pos[memp]=ar[i];
				memp++;
			}
		}
		System.out.println(Arrays.toString(pos));
		System.out.println(Arrays.toString(neg));
		int[]ans = new int[ar.length];
		for(int i = 0; i<ar.length;i++)
		{
			if(i<pos.length-memp)
				ans[i]=neg[i];
			else
			{
				ans[i]=neg[i]+pos[i-memn];
			}
		}
		System.out.println(Arrays.toString(ans));
		
	}
	
}
