/*

현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를

각 구간별로 구하라고 했습니다.

만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면

20 12 20 10 23 17 10

각 연속 4일간의 구간의 매출종류는

첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.

두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.

세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.

네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.

N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별

매출액의 종류를 출력하는 프로그램을 작성하세요.



- 예시
7 4
20 12 20 10 23 17 10                                                 3 4 4 3



----------------------------생각의 과정----------------------------

1. 0에서 시작하는 il 인덱스와 두번째 입력수에서 시작하는 rl 인덱스를 같이 반복문에서 증가하게 만든다.

2. 반복문을 rl에서 입력받은 배열의 크기만큼 반복하면서 rl이 증가할 때마다 il도 증가 시키면서 각 구간의 매출액을 저장한다.

3. 매출액의 종류를 answer에 저장한다.


*/


package hash;
import java.util.*;
public class KindOfSales {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int str1 = sc.nextInt();
        int str2 = sc.nextInt();

        int[] arr = new int[str1];
        for(int i =0; i<str1; i++){
            arr[i] = sc.nextInt();
        }

        int[] answer = new int[str1-str2+1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<str2-1; i++){
            if( map.containsKey(arr[i]) ){
                map.put( arr[i], map.get(arr[i])+1 );
            }else{
                map.put(arr[i], 1);
            }
        }
        int lt =0;
        for ( int rt = str2 -1; rt<str1; rt++){
            
            if(map.containsKey(arr[rt])){
                map.put(arr[rt], map.get(arr[rt])+1);
            }else{
                map.put(arr[rt],1);
            }
            answer[lt] = map.size();
            map.put(arr[lt], map.get(arr[lt])-1);

            if(map.get(arr[lt])==0){
                map.remove(arr[lt]);
            }
            lt++;
        }


        for( int i = 0; i<answer.length; i++ ){
            System.out.print(answer[i]+ " ");
        }

    }
}

