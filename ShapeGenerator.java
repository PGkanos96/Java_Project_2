import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class ShapeGenerator
{
    // instance variables - replace the example below with your own
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    Random rnd = new Random();
    
    /**
     * Constructor for objects of class ShapeGenerator
     */
    public ShapeGenerator(int num_of_shapes)
    {
        initializeShapes(num_of_shapes);
    }

    /** Methods */
    private void initializeShapes(int num_of_shapes)
    {
        int rand_position;
        int[] include_areas_choices = {1,2,3,4,8,12,16}; 
         
        
        for(int i=0; i<num_of_shapes; i++)
        {
            rand_position=rnd.nextInt(include_areas_choices.length);
            shapes.add(new Square(include_areas_choices[rand_position]));
            rand_position=rnd.nextInt(include_areas_choices.length);
            shapes.add(new Triangle(include_areas_choices[rand_position]));
            rand_position=rnd.nextInt(include_areas_choices.length);
            shapes.add(new Pentagon(include_areas_choices[rand_position]));
            rand_position=rnd.nextInt(include_areas_choices.length);
            shapes.add(new Circle(include_areas_choices[rand_position]));
        }
        
        Collections.shuffle(shapes);
    }
    
    public Shape nextShape()
    {
        int position=rnd.nextInt(shapes.size());
        Shape shp = shapes.get(position);
        shapes.remove(position);
        return shp;
    }
    
    public boolean hasShape()
    {
        if(shapes.size()>0)
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
        for (int i=0; i<shapes.size(); i++)
        {
            System.out.println(shapes.get(i).getType());
        }
        System.out.println("\n\n");
        return "ok";
    }
    
    public void Main()
    {
        shapes.clear();
        initializeShapes(8);
        
        for(int i=0; i<8; i++)
        {
            System.out.println(nextShape().toString());
            System.out.println("Remaning shapes:");
            toString();
        }
    }
}
