public abstract class Shape
{
    // instance variables - replace the example below with your own
    private int include_area;

    /** Constructor */
    public Shape(int include_area)
    {
        this.include_area=include_area;
    }
    
    /** Methods */
    public abstract double computeArea();
    public abstract String getType();
    
    public boolean sameArea(Shape shp)
    {
        if(include_area==shp.include_area)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String toString()
    {
        return getType() + " : "+ computeArea();
    }
    
    public int getOuterArea()
    {
        return include_area;
    }
}

