

public class Map {
	private Element[][] grid;
	private Demon[] demonList;
	private lorann lorann;
	private int nDemon;
	
	
	
	
	public Map() {
		this.grid = new Element[20][13];
		this.demonList = new Demon[8];
		this.nDemon = 0;
	}
	
	
	public void setCell(int X, int Y, Element element) {
		this.grid[X][Y] = element;
	}	
	public Element getCell(int X, int Y) {
		return this.grid[X][Y];
	}	
	public Element[][] getGrid(){
		return this.grid;
	}	
	public Demon getDemon(int n) {
		return demonList[n];
		
	}
	public void setLorann(lorann lorann) {
		this.lorann= lorann;
	}
	public lorann getLorann() {
		return this.lorann;
	}
	public Demon[] getDemonList() {
		return this.demonList;
	}
    public int getnDemon() {
    	return this.nDemon;
    }
    public void setnDemon(int nb) {
    	this.nDemon = nb;
    }
    public void setDemon(int i, Demon demon) {
    	this.demonList[i] = demon;
    }

}
