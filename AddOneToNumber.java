
public class AddOneToNumber {
	public static int[] plusOne(int[] A) {
		int a[]=new int[A.length];
		int carry=0;
		for(int i=A.length-1;i>=1;i--){
			if(i==A.length-1)
			{
				if(A[i]==9){
					a[i]=0;
					carry=1;
				}
				else{
					a[i] = A[i]+ 1;
				}
			}
			else{
				if(A[i]==9 && carry==1)
				{
					a[i]=0;
					carry =1;
				}
				else
				{
					a[i] = A[i] + carry;;
					carry=0;
				}
			}
		}
		if(A.length == 1)
		{
			if(A[0]==9)
			{
				a[0]=0;
				int out[] = new int[A.length+1];
				out[0]= 1;
				for(int i=1;i<A.length;i++)
				{
					out[i] = a[i-1];
				}
				a=out;
			}
			else
			{
				a[0] = A[0] + 1;
			}
		}
		else if(A[0]==9 && carry == 1)
		{
			a[0]=0;
			int out[] = new int[A.length+1];
			out[0]= 1;
			for(int i=1;i<A.length;i++)
			{
				out[i] = a[i-1];
			}
			a=out;
		}
		else
		{
			a[0]=A[0]+carry;
		}
		return a;
    }
	public static void main(String args[])
	{
		int a[]={9,9};
		int out[]=plusOne(a);
		for(int i=0;i<out.length;i++)
		{
			System.out.print(out[i]+" ");
		}
	}
}
