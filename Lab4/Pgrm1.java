public class Pgrm1{
    public static void main(String[] args){
        JavaProffessionalRobber obj = new JavaProffessionalRobber();
        int [] row_house = {1,2,3,0};
        int max_row = obj.RowHouses(row_house);
        System.out.println(max_row);
        int [] Round_Houses = {1,2,3,4};
        int max_round = obj.RoundHouses(Round_Houses);
        System.out.println(max_round);
        int [] Sqaure_Houses = {5,10,2,7};
        int max_square = obj.SquareHouse(Sqaure_Houses);
        System.out.println(max_square);
        int[][] houses = {
            {5, 3, 8, 2},
            {10, 12, 7, 6},
            {4, 9, 11, 5},
            {8, 6, 3, 7}
        };
        int maxRobbed = obj.MultiHouse(houses);
        System.out.println("Maximum amount that can be robbed: " + maxRobbed);  // Output should be 35
    }



    
}

abstract class Robber{
    Robber(){
        System.out.println("I Love Machine Learning");
    }
    void RobbingClass(){
        System.out.println("MSc AIML");
    }
    
    abstract int RowHouses(int [] arr);
    abstract int RoundHouses(int [] arr);
    abstract int SquareHouse(int [] arr);
    abstract int MultiHouse(int [][] mat);
}

class JavaProffessionalRobber extends Robber{
    int RowHouses(int[] arr){
        int even = 0;
        int odd = 0;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                even += arr[i];
            }
            else{
                odd += arr[i];
            }
        }
        if (even>odd){
            return even;
        }
        else{
            return odd;
        }
    }

    int RoundHouses(int[] arr){
        int even = 0;
        int odd = 0;
        for (int i = 0;i<arr.length;i++){
            if(i%2 == 0 && i != arr.length-1){
                even += arr[i];
            }
            else{
                odd += arr[i];
            }
        }
        if (even>odd){
            return even;
        }
        else{
            return odd;
        }
    }
    int SquareHouse(int[] arr){
        int d1 = 0;
        d1 = arr[0] + arr[2];
        int d2 = 0;
        d2 = arr[1] + arr[3];

        if (d1>d2){
            return d1;
        }
        else{
            return d2;
        }
    }
    int MultiHouse(int [][] houses){
        int n = houses.length;  // Number of house types (rows)
        int m = houses[0].length;  // Number of houses per type (columns)
        
        // If there's only one house, simply return the maximum of all houses
        if (n == 1) {
            int max = 0;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, houses[0][i]);
            }
            return max;
        }

        // DP array to store the maximum amount that can be robbed up to each house
        int[][] dp = new int[n][m];
        
        // Initialize the DP array for the first house type
        for (int i = 0; i < m; i++) {
            dp[0][i] = houses[0][i];
        }

        // Fill in the DP table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If robbing house j of type i, you can't rob the adjacent house of type i-1
                int robCurrentHouse = houses[i][j];
                if (j > 0) {
                    robCurrentHouse += dp[i-1][j-1];  // Consider previous house of the previous type
                }
                dp[i][j] = Math.max(dp[i-1][j], robCurrentHouse);  // Max of robbing or not robbing
            }
        }

        // Find the maximum value in the last row of DP table
        int maxAmount = 0;
        for (int i = 0; i < m; i++) {
            maxAmount = Math.max(maxAmount, dp[n-1][i]);
        }

        return maxAmount;
    }
    
}

