import java.util.Scanner;

public class HammingCode {
    public static void main(String[] args) {

        //Считываем сообщение

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = a.toCharArray();

        //Обрабатываем сообщение
        //s1,s2,s3 - контрольные суммы

        byte r1 = (byte)ch[0],r2 = (byte)ch[1], r3 = (byte)ch[3];
        byte i1 = (byte)ch[2], i2 = (byte)ch[4], i3 = (byte)ch[5], i4 = (byte)ch[6];
        int s1,s2,s3;
        s1 = (r1+i1+i2+i4) % 2;
        s2 = (r2+i1+i3+i4) % 2;
        s3 = (r3+i2+i3+i4) % 2;
        int ErrorNumber = s3*4 + s2*2 + s1 - 1;

        //Вывод правильного сообщения и бита с ошибкой

        if (ErrorNumber == -1){
            System.out.println(a);
        } else{
            int b = (int)ch[ErrorNumber];
            b = (b+1) % 2;
            ch[ErrorNumber] = Character.forDigit(b, 10);
            for (int i=0;i<7;i++){
                System.out.print(ch[i]);
            } System.out.println();
            System.out.println("Номер бита с ошибкой: " + (ErrorNumber+1));
        }
    }
}