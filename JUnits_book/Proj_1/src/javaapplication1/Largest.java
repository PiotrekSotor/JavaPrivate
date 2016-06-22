package javaapplication1;
public class Largest {
    public static int largest (int[] tab) throws RuntimeException{
        if (tab == null)
            throw new RuntimeException("Null list");
        if (tab.length < 1)
            throw new RuntimeException("Empty list");
                    
        int max = Integer.MIN_VALUE;
        for (int i : tab)
        {
            if (max < i)
                max = i;
        }
        return max;
    }
}
