//Conner Bender
//5th hour
//3/14/2013

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;

import java.awt.Color;

public class ChameleonKidRunner
{
    public static void main(String[] args)
    {
    	ActorWorld world = new ActorWorld();
    	ChameleonKid kid = new ChameleonKid();
    	ChameleonKid kid2 = new ChameleonKid();

    	int row = 0;
    	int col = 0;
    	kid.setColor(new Color(200, 100, 255));
    	kid2.setColor(new Color(100, 200, 255));
    	for (int r = 0; r< world.getGrid().getNumRows(); r++)
    	{
    			int red = (int)(Math.random() * 156)+100;
        		int green = (int)(Math.random() * 156)+100;
        		int blue = (int)(Math.random() * 156)+100;
        		world.add(new Location(r, col + 1), new Rock(new Color(red, green, blue)));
    	}
    	world.add(new Location(row, col), kid);

    	row = 3;
    	col = 3;
    	for (int r = 0; r< world.getGrid().getNumRows(); r++)
    	{
    			int red = (int)(Math.random() * 156)+100;
        		int green = (int)(Math.random() * 156)+100;
        		int blue = (int)(Math.random() * 156)+100;
        		world.add(new Location(r, col + 1), new Rock(new Color(red, green, blue)));
    	}
    	world.add(new Location(row, col), kid2);
    	world.show();
    }
}