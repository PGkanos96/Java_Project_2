public class Circle extends Shape
{
    /** Constructor */
    public Circle(int include_area)
    {
        super(include_area);
    }

      
    /** Methods */
    public double computeArea()
    {
        return (Math.PI/4) * getOuterArea();
    }
    
    public String getType()
    {
        return "Circle";
    }
}
