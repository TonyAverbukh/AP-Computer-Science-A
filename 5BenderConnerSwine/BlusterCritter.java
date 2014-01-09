//Conner Bender
//5th hour
//3/25/2013

import info.gridworld.actor.Critter;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.actor.ActorWorld;

import java.awt.Color;
import java.util.ArrayList;

public class BlusterCritter extends Critter
{
	private int courage;
	
	public BlusterCritter(int c)
	{
		courage = c;
	}
	
	public ArrayList<Actor> getActors()
	{
		
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Location now = getLocation();
		
		for(int row = now.getRow() - 2; row <= now.getRow() + 2; row++)
    	{
     		for(int col = now.getCol() - 2; col <= now.getCol() + 2; col++)
      	{
				Location loc = new Location(row, col);
				
				if(getGrid().isValid(loc))
				{
					Actor jonathon = getGrid().get(loc);
          		
					if(jonathon != null)
					{
						actors.add(jonathon);
					}
				}
			}
		}
		return actors;
	}
	
	
	public void processActors(ArrayList<Actor> actors)
	{
		int count = 0;
		
		for(Actor jonathon : actors)
		{
			if(count < courage)
			{
				light();
			}
			if(jonathon instanceof Critter)
			{
				count++;
			}
			else
			{
				darken();
			}
		}
	}
	
	public void light()
	{
	 	Color color = getColor();
		int green = color.getGreen();
		int red = color.getRed();
		int blue = color.getBlue();
		
		if(green < 255)
		{
			green++;
		}
		if(red < 255)
		{
			red++;
		}
		if(blue < 255)
		{
			blue++;
		}

		setColor(new Color(red, green, blue));
	}
	
	public void darken()
	{
	 	Color color = getColor();
		int green = color.getGreen();
		int red = color.getRed();
		int blue = color.getBlue();
		
		if(green > 0)
		{
			green--;
		}
		if(red > 0)
		{
			red--;
		}
		if(blue > 0)
		{
			blue--;
		}
		
		setColor(new Color(red, green, blue));
	}
}