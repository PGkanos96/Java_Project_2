import java.util.ArrayList;
import java.util.Scanner;
public class Player
{
    private ArrayList<Shape> player_shapes = new ArrayList<Shape>();
    private double points=0;
    private int num_of_player_shapes;
    private Scanner keyboard = new Scanner(System.in);
    
    /** Constructor*/
    public Player(int num_of_player_shapes)
    {
        this.num_of_player_shapes=num_of_player_shapes;
    }

    
    /**Methods*/
    public void playShape(Shape shp)
    {
        String response;
        System.out.println("Incoming shape " + shp.toString() + ".");
        do
        {
            System.out.println("Will you keep it? (type Y/N)");
            response = keyboard.nextLine();
        }while((!response.equals("Y"))&&(!response.equals("N")));
        
        if(response.equals("Y"))
        {
            String special_insertion="None";
            double points_to_add=0;
            
            if(player_shapes.size()>0)
            {
                if( shp.computeArea() == player_shapes.get(player_shapes.size()-1).computeArea() )
                {
                    points_to_add=10*shp.computeArea();
                    System.out.println("Last two shapes have the same area. Player gets x10 ("+ points_to_add +") points for the last shape.");
                    special_insertion="Same Area";
                }
            
                if( shp.getType().equals(player_shapes.get(player_shapes.size()-1).getType()) )
                {
                    System.out.println("Last two shapes are of the same type. Removing the last two shapes from Player's list and adding the points ("+shp.computeArea()+") .");
                    points_to_add+=shp.computeArea();
                    points+=points_to_add;
                    player_shapes.remove(player_shapes.size()-1);
                    special_insertion="Same Type";
                }
                else
                {
                    if(special_insertion.equals("Same Area"))
                    {
                        player_shapes.add(shp);
                        points+=points_to_add;
                    }
                }
            }
            
            if(special_insertion.equals("None"))
            {
                player_shapes.add(shp);
                points_to_add=shp.computeArea();
                points+=points_to_add;
            }
            
            System.out.println("Adding "+ points_to_add +" points...");
        }
    }
    
    public boolean isStackFull()
    {
        if(player_shapes.size()==num_of_player_shapes)
        {return true;}
        else
        {return false;}
    }
    
    public void printStack()
    {
        System.out.println("Current stack:");
        
        for(int i=0; i<player_shapes.size(); i++)
        {
            System.out.println("\t\t"+ (i+1) + ". " + player_shapes.get(i).getType()+" : "+ player_shapes.get(i).computeArea());
        }
        System.out.println();
    }
    
    public double getPoints()
    {
        return points;
    }
}
