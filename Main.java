public class Main {
    public static void main(String[] args) {
    
    SingleTable t1 = new SingleTable( 4, 74, 60);
    SingleTable t2 = new SingleTable( 8, 74, 70);
    SingleTable t3 = new SingleTable( 12, 76,  75);

    CombinedTable c1 = new CombinedTable(t1, t2);
    CombinedTable c2 = new CombinedTable(t2, t3);

        System.out.println(c1.canSeat(9));
        System.out.println(c1.canSeat(11));
        System.out.println(c1.getDesireablity());
        System.out.println(c2.canSeat(18));
        System.out.println(c2.getDesireablity());
      
        t2.setViewQuality(80);
        System.out.println(c2.getDesireablity());




    }
}