import java.util.Scanner;

public class ShapeGame
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert the number of shapes of each type:");
        int generator_size = keyboard.nextInt();
        
        System.out.println("Insert the size of players' lists:");
        int players_list_size = keyboard.nextInt();
        
        ShapeGenerator shp_gen = new ShapeGenerator(generator_size);
        Player player_1 = new Player(players_list_size);
        
        int count_rounds=0;
        
        while((shp_gen.hasShape()==true)&&(player_1.isStackFull()==false))
        {
            count_rounds+=1;
            System.out.println("\n\n\nRound " + count_rounds + "\n--------------------------------------------------------");
            player_1.printStack();
            player_1.playShape(shp_gen.nextShape());
            System.out.println("Player has "+ player_1.getPoints() +" points.");
        }
                            
        System.out.println("\n\n\n========================================================");
        player_1.printStack();
        if(shp_gen.hasShape()==false)
        {
            if(player_1.isStackFull()==true)
            {
                System.out.println("Player's stack is full.\nGenerator's stack is empty.\nGame ends!");
                System.out.println("Player has collected "+ player_1.getPoints() +" points.");
            }
            else
            {
                System.out.println("Shape generator's stack is empty.\nGame ends!");
                System.out.println("Player has collected "+ player_1.getPoints() +" points.");
            }
        }
        else
        {
            System.out.println("Player's stack is full.\nGame ends!");
            System.out.println("Player has collected "+ player_1.getPoints() +" points.");
        }
        
         
    }
}
