/*

S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.

아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.






- 예시
bacaAacba
abc                                                 3



----------------------------생각의 과정----------------------------

1. 첫번째 입력된 문자열로 반복문을 돌면서 두번째 입력된 문자열의 길이를 기준으로 해쉬맵을 만든다.

2. 슬라이딩 윈도우를 활용하여 rt가 하나 증가하면서 해당 문자열을 해쉬에 넣고 lt에 해당하는 문자열을 해쉬맵에서 제외 시키고 lt를 증가시킨다.

3. 만약 해쉬에 두번째 입력된 문자열에 해쉬가 모두 일치한다면 answer에 1을 더한다.


*/

package hash;
import java.util.*;
public class AllAnagram {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        int answer = 0;
        int lt = 0;
        
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        
        for(int i = 0; i < t.length(); i++){
            hm2.put(t.charAt(i), hm2.getOrDefault(t.charAt(i), 0) + 1);
        }

        for( int i=0; i<t.length()-1; i++){
            hm1.put(s.charAt(i), hm1.getOrDefault(s.charAt(i), 0) + 1);
        }

        for( int rt=t.length()-1; rt<s.length(); rt++){
            
            
            hm1.put(s.charAt(rt), hm1.getOrDefault(s.charAt(rt), 0) + 1);
            
            if(hm1.equals(hm2)){
                answer++;
            }
            
            hm1.put(s.charAt(lt), hm1.get(s.charAt(lt)) - 1);
            if(hm1.get(s.charAt(lt)) == 0){
                hm1.remove(s.charAt(lt));
            }
            lt++;
        }

        System.out.println(answer);

    }
}
