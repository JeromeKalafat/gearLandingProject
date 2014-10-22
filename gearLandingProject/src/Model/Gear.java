package Model;

public class Gear {
	
	public enum GearStatus{up, down, goingUp, goingDown, stuck}
	private GearStatus status;
	
	public Gear(){
		this.status = GearStatus.down;
	}
	
	public GearStatus getStatus(){return this.status;}	
	public void setStatus(GearStatus gearStatus){this.status = gearStatus;}	

}
