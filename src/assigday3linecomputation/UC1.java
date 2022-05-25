package assigday3linecomputation;

public class UC1{

}
    public static void main(String[] args){
        String p1 = "x1";
        String p2 = "y1";
        String p3 = "x2";
        String p4 = "y2";
        String p5 = "x1";
        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p3));
        System.out.println(p3.compareTo(p4));
        System.out.println(p4.compareTo(p1));
        System.out.println(p1.compareTo(p5));
    }
}