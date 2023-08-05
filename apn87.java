import java.util.*;
class apn87 {
    public static int trappedRainWater(int height[]){
        int waterLevel;
        int n = height.length;
        // Calculate left max boundry - array 

        int LeftMax[] = new int[n];
        LeftMax[0] = height[0];

        for(int i = 1 ; i<n;i++){

            LeftMax[i] = Math.max(height[i] , LeftMax[i-1]); // Max value ko store krta h 
        }

        // Calculate Right max boundry - array 
        int RightMax[] = new int[n];
        RightMax[n-1] = height[n-1];

        for(int i = n-2 ; i>=0; i--){

            RightMax[i] = Math.max(height[i],RightMax[i+1]);
        }
        int trappedWater = 0 ;

        // loop 
        for(int i = 0 ; i<n;i++){

            // waterLevel = min(leftMax bound , RightMax bound)
            waterLevel = Math.min(LeftMax[i],RightMax[i]);

            // trapped water = waterLevel - hight[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}
