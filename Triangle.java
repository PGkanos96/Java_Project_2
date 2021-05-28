public class Triangle extends Shape
{
    /** Constructor */
    public Triangle(int include_area)
    {
        super(include_area);
    }

      
    /** Methods */
    public double computeArea()
    {
        return 0.5 * getOuterArea();
    }
    
    public String getType()
    {
        return "Triangle";
    }
}
