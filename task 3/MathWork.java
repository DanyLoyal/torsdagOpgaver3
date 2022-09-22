import java.util.Random;

public class MathWork{

static int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

static Random myRndm = new Random();

    public static void main(String[] args)
    {

SumOfNum();
getRndm();
printInt(5);

    }

    public static void printInt(int i) {
    System.out.println(i);

    if(i > 0){

    printInt(i - 1);
}

}


public static void SumOfNum() {

    for(int i=1;i<100; i++){

if(i%5==0){

System.out.println(i+"");

}

}

}
 
 public static void getRndm() {

System.out.println(arr[myRndm.nextInt(arr.length)]);

 }

}