import java.util.Random;

public abstract class Board {
	
	private int[][] board;
	private int gridSize;
	private int minesNo;
	private boolean[][] mines;
	
	public static final int MINE = 69;
	
	public Board(int gridSize, int minesNo) {
		/* initialize instance variables*/
		this.gridSize = gridSize;
		this.minesNo = minesNo;
		
		
		board = new int [gridSize][gridSize];
		mines = new boolean[gridSize][gridSize];
		
		Random r = new Random();
		
		for (int i = 0; i < minesNo; i++){
			int rnd = r.nextInt(gridSize);
				mines[rnd][rnd] = true; //possible chance of putting 2 bombs on same tile
		}
		
	}
	public abstract void draw();// for interface class
	
    public int select(int x, int y) {
    	if(mines[x][y]){
    		board[x][y] = MINE;
    		System.out.print("mine");
    	} else {
    		board[x][y] = adjacentMines(x,y);
    	}
        return board[x][(y)];
    }
    

    /*method that calculates the number of surrounding mines around (x,y)
     * returns an integer value of mines*/
    private int adjacentMines(int x, int y){
    	int minX, minY, maxX, maxY;
    	int counter = 0;
    	/*For out of bound values*/
    	if (x<=0){
    		minX = 0;
    	} else {
    		minX = x-1;
    	}
    	if (y<=0){
    		minY = 0;
    	} else {
    		minY = y-1;
    	}

    	if(x >= gridSize -1){
    		maxX = gridSize;
    	} else {
    		maxX = x+2;
    	}
    	if(y >= gridSize -1){
    		maxY = gridSize;
    	} else {
    		maxY = y+2;
    	}
    	/*check surrounding tiles for mines*/
    	for (int i = minX; i < maxX; i++){
    		for (int j = minY; j < maxY; j++){
    			if (mines[i][j]){
    				counter++;
    			}
    		}
    	}
		return counter;
    	
    }
    
    public int[][] getBoard(){
    	return board;
    }
    public int getGridSize(){
    	return gridSize;
    }
    public int getMinesNo(){
    	return minesNo;
    }
    public boolean[][] getMines(){
    	return mines;
    }
    public void setBoard(int[][] board){
    	this.board = board;
    }
    public void setGridSize(int gridSize){
    	this.gridSize = gridSize;
    }
    public void setMinseNo(int minesNo){
    	this.minesNo = minesNo;
    }
    public void setMines(boolean[][] mines){
    	this.mines = mines;
    }
}
