import java.util.ArrayList;
import java.util.Collections;

class Distribute_Choclates{
     
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        //System.out.println(a);
        long max=Long.MAX_VALUE;
        for(int i=0;i<n-m+1;i++){
            int min=a.get(i);
            int mx=a.get(i+m-1);
            max=(long)Math.min(max,mx-min);
        }
        return max;
    }
}
