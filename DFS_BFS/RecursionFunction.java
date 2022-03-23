package DFS_BFS;
import java.util.*;

public class RecursionFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        DFS(n1);
    }
    public static void DFS(int n){
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.println(n);   //함수 호출은 스택프레임을 가지고 있기 때문에 이 줄은 나중에 호출된 순서부터 차례대로 pop되어 출력된다.
            // 따라서 재귀함수를 호출하는 시점을 잘 선택해야 한다.
        }
    }

}
