package quest;

import java.util.*;

public class Quest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        String grade = "";
        List<String>questions=new ArrayList<>();
        questions.add("1. Python에서 변수를 선언하는 방법은? (점수: 10점)");
        questions.add("2. Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)");
        questions.add("3. Python에서 조건문을 작성하는 방법은? (점수: 10점)");
        questions.add("4. Python에서 함수를 정의하는 방법은? (점수: 5점)");
        List<String>choice = new ArrayList<>();
        choice.add("1) var name 2) name = value 3) set name 4) name == value");
        choice.add("1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
        choice.add("1) if-else, 2) for-in, 3) while, 4) def");
        choice.add("1) class, 2) def, 3) import, 4) return");
        List<Integer>userAnswers = new ArrayList<>();
        List<Integer>answerList = new ArrayList<>();
        answerList.add(2);
        answerList.add(1);
        answerList.add(1);
        answerList.add(2);
        List<Integer>scoreList=new ArrayList<>();
        scoreList.add(10);
        scoreList.add(15);
        scoreList.add(10);
        scoreList.add(5);
        int score = 0;
        for(int i=0; i<questions.size(); i++){
            System.out.println(questions.get(i));
            System.out.println(choice.get(i));
            answer=sc.nextInt();
            userAnswers.add(answer);
        }
        System.out.println("---------------- 결과 ---------------");
        System.out.println("응답한 내용 : ");
        for(int i=0; i<userAnswers.size();i++){
            System.out.print((i+1) + "번"+userAnswers.get(i)+",");
            if(userAnswers.get(i)==answerList.get(i)){
                score+=scoreList.get(i);
            }
        }
        if(score>=30){
            grade="A";
        }else if(score>=20){
            grade="B";
        }else{
            grade="F";
        }
        System.out.println();
        System.out.println("당신의 응답 합계 : " + score + "점");
        System.out.println("학점 : "+grade);
    }
}
