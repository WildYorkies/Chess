import java.util.ArrayList;


public class Queen extends Piece {
	
	@Override
	public ArrayList<Location> calculatePossibleMoves(int a, int b) {
		ArrayList<Location> theChoices = new ArrayList<Location>();
		int x = a;
		int y = b;
		
		// Bishop style moves
		for(int i=1; i<8;i++) {
			Location one = new Location();
			one.y = y+i;
			one.x = x-i;
			if (one.y<8 && one.y>=0 && one.x<8 && one.x>=0) {
				if (Game.grid[one.x][one.y] == null) {
					theChoices.add(one);
				} else if (Game.grid[one.x][one.y].owner.equals(this.owner) == false) {
					// else if the move has the opposing player's piece in it
					// add the move as well
					theChoices.add(one);
					break;
				} else {
					break;
				}
			}
		}
		
		for(int i=1; i<8;i++) {
			Location one = new Location();
			one.y = y+i;
			one.x = x+i;
			if (one.y<8 && one.y>=0 && one.x<8 && one.x>=0) {
				if (Game.grid[one.x][one.y] == null) {
					theChoices.add(one);
				} else if (Game.grid[one.x][one.y].owner.equals(this.owner) == false) {
					// else if the move has the opposing player's piece in it
					// add the move as well
					theChoices.add(one);
					break;
				} else {
					break;
				}
			}
		}
		
		for(int i=1; i<8;i++) {
			Location one = new Location();
			one.y = y-i;
			one.x = x+i;
			if (one.y<8 && one.y>=0 && one.x<8 && one.x>=0) {
				if (Game.grid[one.x][one.y] == null) {
					theChoices.add(one);
				} else if (Game.grid[one.x][one.y].owner.equals(this.owner) == false) {
					// else if the move has the opposing player's piece in it
					// add the move as well
					theChoices.add(one);
					break;
				} else {
					break;
				}
			}
		}
		
		for(int i=1; i<8;i++) {
			Location one = new Location();
			one.y = y-i;
			one.x = x-i;
			if (one.y<8 && one.y>=0 && one.x<8 && one.x>=0) {
				if (Game.grid[one.x][one.y] == null) {
					theChoices.add(one);
				} else if (Game.grid[one.x][one.y].owner.equals(this.owner) == false) {
					// else if the move has the opposing player's piece in it
					// add the move as well
					theChoices.add(one);
					break;
				} else {
					break;
				}
			}
		}
		
		
		// Rook style moves
		for(int i=1; i<8;i++) {
			Location one = new Location();
			one.y = y+i;
			one.x = xCurrentPlace;
			if (one.y<8 && one.y>=0 && one.x<8 && one.x>=0) {
				if (Game.grid[one.x][one.y] == null) {
					theChoices.add(one);
				} else if (Game.grid[one.x][one.y].owner.equals(this.owner) == false) {
					// else if the move has the opposing player's piece in it
					// add the move as well
					theChoices.add(one);
					break;
				} else {
					break;
				}
			}
		}
		
		for(int i=1; i<8;i++) {
			Location one = new Location();
			one.y = y-i;
			one.x = xCurrentPlace;
			if (one.y<8 && one.y>=0 && one.x<8 && one.x>=0) {
				if (Game.grid[one.x][one.y] == null) {
					theChoices.add(one);
				} else if (Game.grid[one.x][one.y].owner.equals(this.owner) == false) {
					// else if the move has the opposing player's piece in it
					// add the move as well
					theChoices.add(one);
					break;
				} else {
					break;
				}
			}
		}
		
		for(int i=1; i<8;i++) {
			Location one = new Location();
			one.y = yCurrentPlace;
			one.x = x+i;
			if (one.y<8 && one.y>=0 && one.x<8 && one.x>=0) {
				if (Game.grid[one.x][one.y] == null) {
					theChoices.add(one);
				} else if (Game.grid[one.x][one.y].owner.equals(this.owner) == false) {
					// else if the move has the opposing player's piece in it
					// add the move as well
					theChoices.add(one);
					break;
				} else {
					break;
				}
			}
		}
		
		for(int i=1; i<8;i++) {
			Location one = new Location();
			one.y = yCurrentPlace;
			one.x = x-i;
			if (one.y<8 && one.y>=0 && one.x<8 && one.x>=0) {
				if (Game.grid[one.x][one.y] == null) {
					theChoices.add(one);
				} else if (Game.grid[one.x][one.y].owner.equals(this.owner) == false) {
					// else if the move has the opposing player's piece in it
					// add the move as well
					theChoices.add(one);
					break;
				} else {
					break;
				}
			}
		}
			
		return theChoices;
		
	} // close method
	
	
	public Queen(int a, int b, String s, String o) {
		super(a, b, "Q " +s, "queen"+s, o);
	}
}
