package Controller;
import Model.Gear;
import Model.Sensors;
import Model.Gear.GearStatus;

public class System {
	private Gear gearSet;
	private Sensors sensorSet;
	
	public System(){
		gearSet = new Gear();
		sensorSet = new Sensors();
	}
	
	public bool gearsRetracting(){
		if(sensorSet.getForce() > -Sensors.planeWeight){
			if(gearSet.getStatus() != GearStatus.up){
				gearSet.setStatus(GearStatus.up);
				return true;
			}
		}
		else return false;
	}
	
	public Gear getGear(){return this.gearSet;}
	public Sensors getSensors(){return this.sensorSet;}

}
