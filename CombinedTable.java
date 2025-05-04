public class CombinedTable  
{
    private int seats2 = 0;
    private double View2 = 0;
    private SingleTable table1 = null;
    private SingleTable table2 = null; 

    public CombinedTable(SingleTable t1, SingleTable t2)
    {
        seats2 = t1.getNumSeats() +t2.getNumSeats()-2;

        table1 = t1;
        table2 = t2;

        if(t1.getHeight()==t2.getHeight()) View2 = ((
        double)t1.getViewQuality()
        +
        (double)t2.getViewQuality())/2;
        
        else 
        View2 = (((
            double)t1.getViewQuality()
            +
            (double)t2.getViewQuality())/2)-10;


    }
 
    public boolean canSeat(int i)
    {
        if(seats2>=i) return true;
        return false;
    }

    public double getDesireablity()
    {

       int t1h = table1.getHeight();
       double t1v = table1.getViewQuality();
       int t2h = table2.getHeight();
       double t2v = table2.getViewQuality();

        if(t1h==t2h) View2 = ((
        double)t1v
        +
        (double)t2v)/2;
        
        else 
        View2 = (((
            double)t1v
            +
            (double)t2v)/2)-10;




        return View2;
    }


}