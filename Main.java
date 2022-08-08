import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        
        int lenght, temp = 0;
        int count;


        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman sayısı : ");
        lenght = scan.nextInt();

        if(lenght > 0){
            int arr [] = new int [lenght];

            for(int i = 0; i < lenght; i++){
               System.out.printf("%d. elemanı giriniz : ", i+1);
                arr[i] = scan.nextInt();
            }

            for(int i = 0; i < lenght; i++){
                for(int j = i+1; j < lenght; j++){
                    if(arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        for(int i = 0; i < lenght; i++){
            count = 1;
            for(int j = 0; j < lenght; j++){
                if(i != j && arr[i] == arr[j]){
                    count++;
                }
            }
            if( i == arr.length - 1 || arr[i] != arr[i + 1]){
                System.out.println(arr[i] + " sayısı " + count + " kez tekrar etti.");}
        }

        


    }
}
}