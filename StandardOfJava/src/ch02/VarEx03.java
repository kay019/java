package ch02;

public class VarEx03 {

    public static void main(String[] args){

        final int score;// = 100;
        score = 200;

        boolean power = false;
        byte b = 127; // byte : -128~ 127

        int oct = 010; // 8진수, 10진수로 8
        int hex = 0x10; // 16진수, 10진수로 16

        //long l = 100_000_000_000; //int 리터럴 값 오버
        long l = 100_000_000_000L; //int 리터럴 값 오버

        float f = 3.14f;// f를 지우면 타입 미스매치 에러
        double d = 3.14;


        char ch = 'A';
        int i = 'A'; //문자 코드가 출력됨


        String str = ""; // 빈 문자열[empty string]
        String str2 = "ABCD";
        String str3 = "123";
        String str4 = str2 + str3;


       System.out.println(score);
       System.out.println(power);
       System.out.println(oct);
       System.out.println(hex);
       System.out.println(10.);
       System.out.println(.10);
       System.out.println(10f);
       System.out.println(1e3);
       System.out.println(ch);
       System.out.println(i);
       System.out.println(str4);
       System.out.println(""+7+7);
       System.out.println(7+7+"");



    }
}
