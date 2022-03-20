/*

Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.

예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로

알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.

길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.





- 예시

AbaAeCe
baeeACA                                                YES



----------------------------생각의 과정----------------------------

1. 입력받은 두가지 문자열을 반복문을 돌려 해쉬맵 형태로 char, int 형태로 만들어서 넣어준다.

2. 해쉬맵을 비교해서 같은 값이 있으면 값을 더해준다.

3. 두 해쉬맵을 비교해서 같은 키값과 값이 있으면 아나그램이다.

4. 둘 중 하나라도 다르면 아나그램이 아니다.

 */
package hash;

import java.util.*;
public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        String answer = "YES";
        for( char x : str1.toCharArray() ){
            if(map1.containsKey(x)){
                map1.put(x, map1.get(x)+1);
            }else{
                map1.put(x,1);
            }
        }


        for( char x : str2.toCharArray() ){
            if(map2.containsKey(x)){
                map2.put(x, map2.get(x)+1);
            }else{
                map2.put(x,1);
            }
        }

        for( char x : map1.keySet() ){
            if(map2.containsKey(x)){
                if(map1.get(x) != map2.get(x)){
                    answer = "NO";
                    break;
                }
            }else{
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
    }
}
