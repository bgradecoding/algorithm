package sorting;

import java.util.*;
public class InsertSort {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int str1 = in.nextInt();

        int[] answer = new int[str1];
        for(int i =0; i<str1; i++){
            answer[i] = in.nextInt();
        }
        int temp = 0;
        for(int i = 1; i<str1; i++){
            temp = answer[i];
            int j;
            for( j = i-1; j>=0; j--){
                if(answer[j] > temp) answer[j+1] = answer[j];
                else break;
            }
            answer[j+1] = temp;
        }


        for( int i = 0; i<str1; i++ ){
            System.out.print(answer[i]+ " ");
        }

    }
}
