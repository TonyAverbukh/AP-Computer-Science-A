//Conner Bender
//5th hour
//3/27/2013

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;

import java.awt.Color;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter 
{
    
   public ArrayList<Location> getMoveLocations() 
	{
		ArrayList<Location> locations = new ArrayList<Location>();
		Grid grid = getGrid();
		Location current = getLocation();
		int dir = getDirection() + 90;
		Location next = current.getAdjacentLocation(dir).getAdjacentLocation(dir);
	
		if(grid.isValid(next) && grid.get(next) == null)
	   {
			locations.add(next);
		}
		
		int otherDir = getDirection() - 90;
		next = current.getAdjacentLocation(otherDir).getAdjacentLocation(otherDir);
	
		if(grid.isValid(next) && grid.get(next) == null)
	   {
			locations.add(next);
		}
	
		return locations;
   }

}