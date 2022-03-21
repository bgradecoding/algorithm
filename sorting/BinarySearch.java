/*

임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면

이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.





- 예시
8 32
23 87 65 12 57 32 99 81                                                    3



----------------------------생각의 과정----------------------------

1. binary search를 활용한다.



*/


package sorting;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int str1 = sc.nextInt();
        int str2 = sc.nextInt();
        int[] arr = new int[str1];
        for(int i =0; i<str1; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int rt = arr.length;
        int lt = 0;
        int answer = 0;

        while(lt<=rt){
            int mid = (rt+lt)/2;
            if(arr[mid] == str2){
                answer = mid+1;
                break;
            }
            else if(arr[mid] > str2){
                rt = mid-1;
            }
            else{
                lt = mid+1;
            }
        }
        System.out.println(answer);
    }
}
