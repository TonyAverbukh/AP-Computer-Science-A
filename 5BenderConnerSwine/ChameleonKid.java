//Conner Bender
//5th hour
//3/14/2013

import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;

import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter
{
	public ArrayList<Actor> getActors()
	{
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] dirs = {Location.NORTH, Location.SOUTH};
		
		for(Location loc : getLocationsInDirections(dirs))
		{
			Actor i = getGrid().get(loc);
			
			if(i != null)
			{
				actors.add(i);
			}
		}
		
		return actors;
	}
	
	public ArrayList<Location> getLocationsInDirections(int[] dirs)
	{
 		ArrayList<Location> locs = new ArrayList<Location>();
		Grid gr = getGrid();
		Location loc = getLocation();
		
		for(int i : dirs)
		{
			Location neighbor = loc.getAdjacentLocation(getDirection() + i);
			
			if(gr.isValid(neighbor))
			{
				locs.add(neighbor);
			}
		}
		
		return locs;
	}
}