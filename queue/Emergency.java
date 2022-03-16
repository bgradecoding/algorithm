/*


메디컬 병원 응급실에는 의사가 한 명밖에 없습니다.

응급실은 환자가 도착한 순서대로 진료를 합니다. 하지만 위험도가 높은 환자는 빨리 응급조치를 의사가 해야 합니다.

이런 문제를 보완하기 위해 응급실은 다음과 같은 방법으로 환자의 진료순서를 정합니다.

• 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼냅니다.

• 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣습니다. 그렇지 않으면 진료를 받습니다.

즉 대기목록에 자기 보다 위험도가 높은 환자가 없을 때 자신이 진료를 받는 구조입니다.

현재 N명의 환자가 대기목록에 있습니다.

N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력하는 프로그램을 작성하세요.





- 예시
5 2
60 50 70 80 90                                       3



----------------------------생각의 과정----------------------------

1. 환자의 객체를 만들어 해당 변수로 환자번호와 위험도를 저장하여 큐로 만든다.

2. 큐가 비어있을때 까지 반복문을 돌면서 poll하여 큐에 남은 환자들보다 위험도가 높은 환자가 있는지 확인한다.

3. 한명이라도 위험도가 있는 환자가 있다면 poll한 환자를 다시 큐에 offer 한다.

4. 위험도가 높은 환자가 없다면 poll한 환자를 진료를 받는다. answer +1을 수행한다. 그 환자의 아이디가 입력된 환자인지 확인한다.

5. 이 과정을 반복하여 입력된 환자가 나올때 answer를 출력한다.


*/


package queue;

public class Emergency {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int str1 = in.nextInt();
        int str2 = in.nextInt();

        int[] arr = new int[str1];
        for(int i =0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int answer = 1;

        Queue<Patient> queue = new LinkedList<>();
        for(int i = 0; i<str1; i++){
            queue.offer(new Patient(i, arr[i]));
        }

        while(!queue.isEmpty()){
            Patient tmp = queue.poll();
            for(Patient x : queue){
                if(x.dangerIndex > tmp.dangerIndex){
                    queue.add(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp !=null){
                if(tmp.index == str2) return answer;
                else answer++;
            }
        }
    

    }

    public class Patient {
        int index;
        int dangerIndex;
        public Patient( int id , int danger ){
            this.index = id;
            this.dangerIndex = danger;
        }
    }
}
