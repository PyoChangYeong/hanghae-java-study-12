package choiwonbin.report2;
//        3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오.)
public class Report2_1 {
    public static void main(String[] args) {
        byte b =10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        b = (byte)i;
        ch = (char)b;
        short s = (short)ch;
        float f = (float)l;
        i = (int)ch;
    }
}
