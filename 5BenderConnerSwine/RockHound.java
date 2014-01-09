//Conner Bender
//5th hour
//3/14/2013

import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class RockHound extends Critter
{
	public void processActors(ArrayList<Actor> actors)
	{
		for(Actor i : actors)
		{
			if(i instanceof Rock)
			{
				i.removeSelfFromGrid();
			}
		}
	}
}