public class Player{
	private String name;
	private int playerspotted=0;
	public Player(String name){
	this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setplayerspotted(int playerspotted){
		this.playerspotted=playerspotted;
	}
	public int getPlayerspotted(){
		return playerspotted;
	}
}
