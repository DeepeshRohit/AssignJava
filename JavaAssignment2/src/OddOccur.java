
public class OddOccur{

    public int oddOccur(int a[], int n)
    {
        int i;
        for (i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j])
                    count++;
            }
            if (count % 2 != 0)
                return a[i];
        }
        return -1;
    }
}