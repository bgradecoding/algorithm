/*

N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.

정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.






- 예시
5
2 7
1 3
1 2
2 5
3 6


-출력

1 2
1 3
2 5
2 7
3 6


----------------------------생각의 과정----------------------------

1. compareTo를 활용하여 오름차순 정렬을 한다.


*/


package sorting;
import java.util.*;

public class CoordinateSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int str1 = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for(int i =0; i<str1; i++){
            list.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list);
        for(Point p : list){
            System.out.println(p.x + " " + p.y);
        }
    }
}
class Point implements Comparable<Point>{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point p){
        if(this.x == p.x){
            return this.y - p.y;
        }
        return this.x - p.x;
    }
}
