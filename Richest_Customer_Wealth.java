//1672. Richest Customer Wealth

class Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
public static void main(String[] args) {
    int [][]accounts1 ={{1,2,3},{3,2,1}};
    // int [][]accounts2 = {{1,5},{7,3},{3,5}};
    // int [][]accounts3 = {{2,8,7},{7,1,3},{1,9,5}};
    System.out.println(maximumWealth(accounts1));
}
}