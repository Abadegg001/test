import java.util.Random;

public class R1 {
    public static void main(String[] args) {
        int num=0,count=0;
        Random r=new Random();
        for(int i=0;i<1000;i++) {
            num = r.nextInt(2) + 1;
            if(num==1)
                count++;
        }
        System.out.println(count/1000.0);
    }
}
