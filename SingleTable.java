public class SingleTable  
{ 
/** Returns the number of seats at this table. The value is always greater than or equal to 4. */ 
private int seats = 0;
private int height = 0;
private double View = 0;

public SingleTable(int s, int h, double v)
{
    seats = s;
    height = h;
    View = v;
}

public int getNumSeats()  
{ 
    return seats;
 }  
/** Returns the height of this table in centimeters. */  




public int getHeight()  
{ 
    return height;
}  
/** Returns the quality of the view from this table. */  





public double getViewQuality()  
{ 
    return View;
}  
/** Sets the quality of the view from this table to value . */  





public void setViewQuality(double value)  
{ 
     View = value;
}
// There may be instance variables, constructors, and methods that are not shown.  
}  
