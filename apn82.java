class apn82{
    public static void Reversed(int numbers[]){
        int first = 0 , last = numbers.length-1;
        System.out.println(last+" Is last ");
        while(first<last){

            // Swap 
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp ;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[] = {1,4,2,8,11};

        Reversed(number);
        System.out.println("Reversed array is : ");
        for(int i = 0 ; i<number.length; i++){
            System.out.println(number[i]);
        }
    }
}