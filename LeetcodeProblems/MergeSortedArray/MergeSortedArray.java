import java.util.Map;
import java.util.TreeMap;

public class MergeSortedArray {

    static void merge(int[] a, int n, int[] b, int m) {
        
         Map<Integer,Boolean> mp = new TreeMap<Integer,Boolean>();
       
        // Inserting values to a map.
        for(int i = 0; i < n; i++)
        {
            mp.put(a[i], true);
        }
        for(int i = 0;i < m;i++)
        {
            mp.put(b[i], true);
        }
       
        // Printing keys of the map.
        for (Map.Entry<Integer,Boolean> me : mp.entrySet())
        {
            System.out.print(me.getKey() + " ");
        }
    }

    public static void main(String[] args)
    {
        int a[] = {1,2,3,0,0,0};
        int b[] = {2,5,6};
        int n = a.length;
        int m = b.length;
     
     
        merge(a,3,b,m);
    }
    



    
}
