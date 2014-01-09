//Conner Bender
//5th hour
//3/25/2013

/**
 * BlusterRunner.java  06/20/07
 *
 * @author - Robert Glen Martin
 * @author - School for the Talented and Gifted
 * @author - Dallas ISD
 *
 * Copyright(c) 2007 Robert Glen Martin
 * (http://martin.apluscomputerscience.com/)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;

import java.awt.Color;

public class BlusterRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(30,30));

        int r = 9;
        int c = 9;
        for(int row = r-2; row < r+3; row++)
        	for(int col = c-2; col<c+3; col++)
        	{
        		if(!(row == r && col == c))
        		{
        			int red = (int)(Math.random() * 256);
        			int green = (int)(Math.random() * 256);
        			int blue = (int)(Math.random() * 256);
        			Critter temp = new Critter();
        			temp.setColor(new Color(red, green, blue));
        			world.add(new Location(row, col), temp);
        		}
        	}

        	for(int row = r-3; row < r+4; row ++)
        		world.add(new Location(row, c-3), new Rock());
        	for(int row = r-3; row < r+4; row ++)
        		world.add(new Location(row, c+3), new Rock());

        	for(int col = c-2; col < c+3; col++)
        		world.add(new Location(r-3, col), new Rock());
        	for(int col = c-2; col < c+3; col++)
        		world.add(new Location(r+3, col), new Rock());

			BlusterCritter bud = new BlusterCritter(25);
			bud.setColor(new Color(10,10,10));
        world.add(new Location(r, c), bud);

        r=20;
        c = 20;

        for(int row = r-2; row < r+3; row++)
        	for(int col = c-2; col<c+3; col++)
        	{
        		if(!(row == r && col == c))
        		{
        			int red = (int)(Math.random() * 256);
        			int green = (int)(Math.random() * 256);
        			int blue = (int)(Math.random() * 256);
        			Critter temp = new Critter();
        			temp.setColor(new Color(red, green, blue));
        			world.add(new Location(row, col), temp);
        		}
        	}

        	for(int row = r-3; row < r+4; row ++)
        		world.add(new Location(row, c-3), new Rock());
        	for(int row = r-3; row < r+4; row ++)
        		world.add(new Location(row, c+3), new Rock());

        	for(int col = c-2; col < c+3; col++)
        		world.add(new Location(r-3, col), new Rock());
        	for(int col = c-2; col < c+3; col++)
        		world.add(new Location(r+3, col), new Rock());

        world.add(new Location(r, c), new BlusterCritter(1));

         r=21;
        c = 5;

        for(int row = r-2; row < r+3; row++)
        	for(int col = c-2; col<c+3; col++)
        	{
        		if(!(row == r && col == c))
        		{
        			int red = (int)(Math.random() * 256);
        			int green = (int)(Math.random() * 256);
        			int blue = (int)(Math.random() * 256);
        			Rock temp = new Rock();
        			temp.setColor(new Color(red, green, blue));
        			world.add(new Location(row, col), temp);
        		}
        	}

        	for(int row = r-3; row < r+4; row ++)
        		world.add(new Location(row, c-3), new Rock());
        	for(int row = r-3; row < r+4; row ++)
        		world.add(new Location(row, c+3), new Rock());

        	for(int col = c-2; col < c+3; col++)
        		world.add(new Location(r-3, col), new Rock());
        	for(int col = c-2; col < c+3; col++)
        		world.add(new Location(r+3, col), new Rock());
			BlusterCritter chloe = new BlusterCritter(5);
			chloe.setColor(new Color(10, 10, 10));
        world.add(new Location(r, c), chloe);
        world.show();
    }
}