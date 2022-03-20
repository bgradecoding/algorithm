/*

학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.

투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.

선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.

반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.





- 예시

15
BACBACCACCBDEDE                                            C



----------------------------생각의 과정----------------------------

1. 해시 맵을 이용하여 두번째 입력된 투표결과를 반복문을 돌면서 후보자의 득표 수를 세어준다.

2. 제일 많이 득표한 후보를 answer로 리턴한다.

 */


package hash;
import java.util.*;
public class ClassLeader {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int str1 = in.nextInt();
        String str2 = in.next();

        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for( char x : str2.toCharArray() ){
            if( map.containsKey(x) ){
                map.put(x, map.get(x)+1);
            }else{
                map.put(x, 1);
            }
        }
        int max = 0;
        for( char x : map.keySet()){
            if( map.get(x) > max ){
                max = map.get(x);
                answer = x;
            }
        }
        System.out.println(answer);


    }
}
