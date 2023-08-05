public class apn83 {
    public static void Pairs(int Numbers[]){
        int tp = 0 ;
        for(int i = 0 ; i<Numbers.length-1;i++){
            int curr = Numbers[i];
            for(int j = i+1 ; j<Numbers.length;j++){
                System.out.print("("+curr+","+Numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are "+tp);
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6};
        Pairs(number);
    }
}
