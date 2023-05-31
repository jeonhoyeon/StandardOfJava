public class ch03 {
    public static void main(String[] args) {
        op06();

    }
    //전위형, 후위형 차이
    static void op01() {
        int i = 5, j = 0;

        j = i++;
        System.out.println("j = i++; 실행 후, i= " + i + ", j= " + j);

        //결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
        i = 5;
        j = 0;

        j = ++i;
        System.out.println("j = ++i; 실행 후, i= " + i + ", j= " + j);

    }

    //byte형의 형변환
    static void op02() {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        System.out.println(c);
    }

    //int타입과 int타입의 연산결과는 int
    static void op03() {
        int a = 1000000;
        int b = 2000000;

        long c = (long)a * b; //long타입의 결과값을 얻으려면 변수 a 또는 b를 long타입으로 형변환해줘야 함 
        System.out.println(c);
    }

    //알파벳 출력하기
    static void op04() {
        char c = 'a';
        for (int i = 0; i < 26; i++){
            System.out.print(c++); //'a'부터 26개의 문자 출력 a = 97
        }
        System.out.println();

        c = 'A';
        for(int i = 0; i < 26; i++){
            System.out.print(c++); //'A'부터 26개의 문자 출력 A = 65
        }
        System.out.println();

        c = '0';
        for(int i = 0; i < 26; i++){
            System.out.print(c++); //'0'부터 10개의 문자 출력
        }
        System.out.println();
    }

    //대문자를 소문자로, 소문자를 대문자로 변환하기
    static void op05() {
        char lowerCase = 'a';
        char upperCase = (char)(lowerCase - 32);
        System.out.println(upperCase);
    }

    //pi
    static void op06() {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);

    }


}
