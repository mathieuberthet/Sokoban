package fr.iutvalence.info.m2103.project.sokoban;

/**
 * Class representing a Sokoban game map. A map is a 2D grid where are placed some objects (walls, boxes, character, ... ).
 * 
 * @author hugo, virgil
 *
 */
public class Map {

	/**
	 * map's width (fixed).
	 */
	private final static int NUMBER_OF_COLUMNS = 64;

	/**
	 * map's height (fixed).
	 */
	private final static int NUMBER_OF_LINES = 64;

	/**
	 * map's grid (can contain objects (square types ))
	 */
	private SquareType[][] grid;
	
	// TODO (done) (felt? you mean filled?)
	/**
	 * constructor which makes a new map COLUMNS by LINES filled with squares.
	 */
	public Map()
	{
		this.setMap();
		this.fillMap();
	}
	
	// TODO (done)rename this method (confusing)
	/**
	 * fill the grid with void squares.
	 */
	private void setMap()
	{
		this.grid = new SquareType[NUMBER_OF_COLUMNS][NUMBER_OF_LINES];
		for (int columnNumber = 0; columnNumber < NUMBER_OF_COLUMNS; columnNumber++)
			for (int lineNumber = 0; lineNumber < NUMBER_OF_LINES; lineNumber++)
				this.grid[columnNumber][lineNumber]= SquareType.VOID;
	
		
	}
	
	// TODO (done) rename this method (confusing)
	/**
	 * replace some void squares by other type of squares
	 */
	private void fillMap()
	{
		
	}
}