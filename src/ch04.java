import java.util.Scanner;

public class ch04 {
    public static void main(String[] args) {
        op13();
    }

    static void op01() {
        int x = 0;
        System.out.printf("x = %d 일 때, 참인 것은%n", x);

        if(x==0) System.out.println("x==0");
        if(x!=0) System.out.println("x!=0");
        if(!(x ==0)) System.out.println("!(x==0)");
        if(!(x!=0)) System.out.println("!(x!=0)");

        x = 1;
        System.out.printf("x = %d 일 때, 참인 것은%n", x);

        if(x==0) System.out.println("x==0");
        if(x!=0) System.out.println("x!=0");
        if(!(x==0)) System.out.println("!(x==0)");
        if(!(x!=0)) System.out.println("!(x!=0)");

    }

    static void op02() {
        int input;
        System.out.println("숫자 하나를 입력하세요.> ");
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
        input = Integer.parseInt(tmp); //입력받은 문자열(tmp)을 숫자로 변환

        if(input == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        }else {
            System.out.printf("입력하신 숫자은 %d입니다", input);
        }
    }

    //if-else문울 활용한 학점 나타내기
    static void op03() {
        int score = 0; //점수를 저장하기 변수
        char grade = ' '; //학점을 저장하기 위한 변수. 공백으로 초기화
        System.out.println("당신의 점수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt(); //화면을 통해 입력받은 점수를 score 변수에 저장

        if(score >= 90){
            grade = 'A';
        }else if (score >= 80){
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("당신의 학점은 " + grade + "입니다");
    }

    //중첩 if문을 활용한 학점 나타내기
    static void op04() {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.println("점수를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if(score >= 90){ //score가 90점 보다 같거나 크면 A
            grade = 'A';
            if(score >= 98){ //score가 98점 보다 크면 A+
                opt = '+';
            } else if (score < 94){ //score가 90점이상 94점 미만인 경우 A-
                opt = '-';
            }
        }else if (score >= 80){ //score가 80점보다 같거나 크면 B
            grade = 'B';
            if(score >= 88) {
                opt = '+';
            }else if (score < 94) {
                opt = '-';
            }
        }  else {
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c 입니다.%n" , grade, opt);
    }

    //switch문을 활용한 해당하는 계절 출력하기
    static void op05() {
        System.out.println("현재 월을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch(month) {
            case 3:
            case 4 :
            case 5 :
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default :
                //case 12 : case 1 : case 2 :
                System.out.println("현재의 계절은 겨울입니다");
        }


    }

    //switch문을 활용한 가위바위보 대결
    static void op06() {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 : ");

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt(); // 화면을 통해 입력받은 숫자를 user에 저장
        int com = (int)(Math.random() * 3) + 1; //1,2,3 중 하나가 com에 저장됨

        System.out.println("당신은" + user + "입니다");
        System.out.println("컴은" + com + "입니다");

        switch(user-com){
            case 1  :
            case -2 :
                System.out.println("이겼다 ! ");
                break;
            case 2  :
            case -1 :
                System.out.println("졌다 ! ");
                break;
            case 0 :
                System.out.println("비겼다 ! ");
                break;
        }
    }

    //switch문을 활용한 학점 나타내기
    static void op07() {
        int score = 0;
        char grade = ' ';

        System.out.println("점수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
        score = Integer.parseInt(tmp); //입력받은 문자열(tmp)을 숫자로 변환

        switch (score/10){
            case 10 :
            case 9  :
                grade = 'A';
                break;
            case 8  :
                grade = 'B';
                break;
            case 7  :
                grade = 'C';
                break;
            default  :
                grade = 'F';
                break;
        }//end of switch
        System.out.println("당신의 학점은" + grade + "입니다.");
    }

    static void op08() {
        for (int i = 2; i<=9; i++){
            for (int j = 1; j<= 9; j++){
//                System.out.println(i + "*" + j + "=" + i*j);
                System.out.printf("%d x %d = %d%n", i, j, i*j);
            }
        }
    }

    static void op09() {
        for(int i=1; i<=3; i++)
            for(int j=1; j<=3; j++)
                for(int k=1; k<=3; k++)
                    System.out.println(""+i+j+k);
    }

    static void op10() {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++) {
                if (i == j) {
                    System.out.printf("[%d,%d]", i, j);
                }else{
                    System.out.printf("%5c",' ');
                }
            }
            System.out.println();
        }
    }

    static void op11() {
        int i = 5;

//        while(i--!=0) { //변수 i의 값만큼 블럭{}을 반복
        while(i!=0){
            i--;
            System.out.println(i + " - I can do it.");
        }
    }

    static void op12() {
        int i = 11;

        System.out.println("카운트 다운을 시작합니다.");
        while(i--!=0){
            System.out.println(i);
            for(int j=0; j<2_000_000_000;j++){ //시간지연을 위한 빈 문장
                ;
            }
        }
        System.out.println("GAME OVER");
    }

    static void op13() {
        System.out.println("숫자를 입력하세요. (예:12345)>12345");
        int num = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        num = Integer.parseInt(tmp);

        while(num!=0){
            //num을 10으로 나눈 나머지를 sum에 더함
           sum += num % 10;
            System.out.printf("sum= %3d num = %d%n", sum, num);

            num /= 10; //num = num / 10; num을 10으로 나눈 값을 다시 num에 저장
        }
        System.out.println("각 자리수의 합:" + sum);
    }
}




