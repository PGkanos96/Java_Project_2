public class Pentagon extends Shape
{
    /** Constructor */
    public Pentagon(int include_area)
    {
        super(include_area);
    }

      
    /** Methods */
    public double computeArea()
    {
        return 0.75 * getOuterArea();
    }
    
    public String getType()
    {
        return "Pentagon";
    }
}
