// indian Coins
// We are given an infinate supply of demoinations coins ,
// find min no of coins/notes to make change for value v 
import java.util.*;
public class apn223 {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int CountofCoins = 0 ;
        int amount = 590 ;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0 ; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    CountofCoins++;
                    ans.add(coins[i]);
                    amount = amount - coins[i]; 
                }
            }
        }

        System.out.println("Total (min) coins used = "+CountofCoins);

        for(int i = 0 ; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        };

    }
}
