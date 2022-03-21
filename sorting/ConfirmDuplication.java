/*

현수네 반에는 N명의 학생들이 있습니다.

선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.

만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,

N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.




- 예시
8
20 25 52 30 39 33 43 33                                                    D



----------------------------생각의 과정----------------------------

1. 해쉬맵을 만들어서 각 학생이 적어낸 숫자를 넣어주며 카운팅 한다.

2. 해쉬맵을 setKey()로 돌려 카운트가 1 이상인 것을 찾는다면 answer에 D를 넣는다.

정렬로도 풀수 있음 // 오름차순으로 정렬한 이후 이웃한 두 수를 비교해서 같은것이 있으면 D를 넣는다.

하지만 해쉬맵에 비해 시간복잡도가 올라가서 더 오래걸린다.

*/


package sorting;
import java.util.*;
public class ConfirmDuplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int str1 = sc.nextInt();
        
        int[] arr = new int[str1];
        for(int i =0; i<str1; i++){
            arr[i] = sc.nextInt();
        }

        String answer = "U";

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i =0; i<str1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(  int x : map.keySet() ){
            if(map.get(x) > 1){
                answer = "D";
                break;
            }
        }
        System.out.println(answer);
    }
}
