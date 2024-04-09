import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr_size=10;
        int []arr=new int[arr_size];

        String numbers=sc.nextLine().trim();
        String[]num_arr=numbers.split("\\s+");

        for(int i=0;i<num_arr.length;i++){

            arr[i]=Integer.parseInt(num_arr[i]);

        }
        for(int i=0;i<arr.length;i++){
            if(i>=10||arr[i]<0||arr[i]>=10){
                System.out.print("Out of range");
                return;
            }
        }



        Arrays.sort(arr);
        int highestFrequencyNumber=arr[0];
        int currentFrequency=1,mostFrequency=0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]==arr[i]){
                currentFrequency++;
            }else{
                if(currentFrequency>mostFrequency){
                    mostFrequency=currentFrequency;
                    highestFrequencyNumber=arr[i];
                }
                currentFrequency=1;
            }

        }
        if(currentFrequency>mostFrequency){
            mostFrequency=currentFrequency;
            highestFrequencyNumber=arr[arr.length-1];
        }
        System.out.println(highestFrequencyNumber+","+mostFrequency);



    }


}