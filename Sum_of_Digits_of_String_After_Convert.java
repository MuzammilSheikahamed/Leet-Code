//1945. Sum of Digits of String After Convert

public class Sum_of_Digits_of_String_After_Convert {
    public static int getLucky(String s, int k) {
        int num=0,ans=0;
        StringBuffer temp=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
        num=s.charAt(i)-96;
        temp.append(num);
        }
        while(k>0)
        {
        for(int i=0;i<temp.length();i++){
            String a=temp.charAt(i)+"";
            ans=ans+Integer.parseInt(a);
        }
        k--;
        if(k>0){
        temp =new StringBuffer(String.valueOf(ans));
        ans=0;
        }  
    }
        return ans;
    }
    public static void main(String[] args) {
        String s="iiii";
        int k=1;
        /*Test cases 
         * s="leetcode",k=2
         * s="zbax",k=2
         */
        System.out.println(getLucky(s, k));
    }
}
