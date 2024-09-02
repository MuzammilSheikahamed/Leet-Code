//1894. Find the Student that Will Replace the Chalk

public class Find_the_Student_that_Will_Replace_the_Chalk {
    public static int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        for(int num:chalk)
        sum+=num;
        while(k>sum){
            k-=sum;
        }
        for(int i=0;i<chalk.length;i++){
            if(chalk[i]>k){
                return i;
            }
            k-=chalk[i];
        }
        return 0;    
    }
    public static void main(String[] args) {
        int []chalk = {5,1,5}; 
        int k = 22;
        System.out.println(chalkReplacer(chalk, k));
    }
}
