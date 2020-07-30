public class Solution {
    public int maxProfit(int[] a) {
        if(a.length >=2)
        {
            int diff=a[1]-a[0],pos=0;
            int min = a[0];
            int i=0;
            for(i=0;i<a.length;i++)
            {
                if(a[i]- min >= diff){
                    diff=a[i]-min;
                    pos=i;
                }
                if(a[i]<min)
                    min=a[i];
            }
            return diff;
        }
        return 0;
    }
}
