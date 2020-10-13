
public class LikeNo {


    private String[] s;
    private int n;
    int cnt = 0;
    public String likeNo(String[] s, int n) {
        String str = null;
        if (n==0)
            str = "0 liked";
        else if(n == 1)
        {
            str = s[0]+" liked";
        }
        else if(n == 2)
        {
            str = s[0]+","+s[1]+" liked";
        }
        else if(n == 3)
        {
            str = s[0]+","+s[1]+","+s[2]+" liked";
        }
        else {
            int l = 0;
            for(int i=0;i<n;i++) {
                if(i>2) l++;
                str = s[0]+","+s[1]+","+s[2]+" and "+l+" others liked";
            }

        }

        return str;
    }

}
