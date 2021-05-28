public class Square extends Shape
{
    /** Constructor */
    public Square(int include_area)
    {
        super(include_area);
    }

      
    /** Methods */
    public double computeArea()
    {
        return getOuterArea();
    }
    
    public String getType()
    {
        return "Square";
    }
}
