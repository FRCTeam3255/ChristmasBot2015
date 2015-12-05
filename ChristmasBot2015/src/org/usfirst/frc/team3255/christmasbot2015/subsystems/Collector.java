
package org.usfirst.frc.team3255.christmasbot2015.subsystems;

import org.usfirst.frc.team3255.christmasbot2015.RobotMap;
import org.usfirst.frc.team3255.christmasbot2015.RobotPreferences;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Collector extends Subsystem {
    //Motor Controllers
	Talon collectorTalon = null;

    public Collector() {
		super();
		
		init();
	}

	public Collector(String name) {
		super(name);
		
		init();
	}

	public void init() {
		collectorTalon = new Talon(RobotMap.COLLECTOR_TALON);
	}

	public void setCollectorSpeed(double s) {
		collectorTalon.set(s);
	}
	
	public void collect() {
    	double s = RobotPreferences.collectorSpeed();
    	setCollectorSpeed(s);
    }
	
	public void stopCollecting() {
		collectorTalon.set(0.0);
	}
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
		//setDefaultCommand();
    }
}

