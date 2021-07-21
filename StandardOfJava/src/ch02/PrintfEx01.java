package ch02;

public class PrintfEx01 {

    public static void main(String[] args){

        System.out.println(10/3); // 3 인 이유 -> 정수/ 정수 라서
        System.out.println(10.0/3);
        System.out.println(0x1A);
        System.out.println("/////////");
        System.out.printf("%.2f\n", 10.0/3); //지시자.소수점 둘째자리까지 \n:개행문자
        System.out.println("/////////");
        System.out.printf("%d%n", 0x1A); // 10진수 %n 개행문자: os 상관없이된다. %n 사용 추천
        System.out.println("/////////");
        System.out.printf("%X\n", 0x1A); //16진수
        System.out.println("/////////");

        System.out.printf("%d%n", 15); //10진수
        System.out.printf("%o%n", 15); //8진수
        System.out.printf("%x%n", 15); //16진수
        System.out.printf("%s%n", Integer.toBinaryString(15));  // toBinaryString 이진 문자열

        System.out.println("/////////");
        System.out.printf("%#o%n", 15); //8진수
        System.out.printf("%#x%n", 15); //16진수
        System.out.printf("%#X%n", 15); //16진수

        float f = 123.456789f;
        double d = 123.456789;
        System.out.printf("%f%n", f); //정밀도 7자리 - 소수점 아래 마지막 2 자리는 다름
        System.out.printf("%f%n", d);
        System.out.printf("%e%n", f); //마지막 자리 반올림
        System.out.printf("%e%n", d);
        System.out.printf("%g%n", 123.4567689);
        System.out.printf("%g%n", 0.000000001);

        System.out.printf("[%5d]%n", 10);
        System.out.printf("[%-5d]%n", 10);
        System.out.printf("[%05d]%n", 10);
        System.out.printf("d=%14.10f%n", d); // 빈자리 앞자리는 공백, 소수점 아래는 0

        String url = "www.codechobo.com";
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);
        System.out.printf("[%.8s]%n", url); // .n n자리의 문자열의 일부만 출력


        System.out.printf("[%5d]%n", 10);//오른정렬
        System.out.printf("[%-5d]%n", 10);//왼정렬
        System.out.printf("[%05d]%n", 10);
        System.out.printf("[%5d]%n", 231240); // 전체 출력

        double z = 1.123123123;
        System.out.printf("%f%n", z);
        System.out.printf("%14.10f%n", z);
        System.out.printf("%.3f%n", z);

        String s = "www.www.www.www";
        System.out.printf("[%s]%n", s);
        System.out.printf("[%20s]%n", s);
        System.out.printf("[%-20s]%n", s);
        System.out.printf("[%.3s]%n", s);



    }
}
