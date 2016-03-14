import edu.brainacad.MyTuple;

/**
 * Created by m18 on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        MyTuple <String, Integer, Long>a1=new MyTuple("bobp",10,9.5);
        MyTuple<Double,String,String> a2=new MyTuple(11.5,"bobo","Dyanamo");

        System.out.println(a1);
        System.out.println(a2);
    }
}
