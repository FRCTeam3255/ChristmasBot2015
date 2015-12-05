
package org.usfirst.frc.team3255.christmasbot2015.subsystems;

import org.usfirst.frc.team3255.christmasbot2015.RobotMap;
import org.usfirst.frc.team3255.christmasbot2015.RobotPreferences;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Hopper extends Subsystem {
    //Motor Controllers
	Talon hopperTalon = null;

    public Hopper() {
		super();
		
		init();
	}

	public Hopper(String name) {
		super(name);
		
		init();
	}

	public void init() {
		hopperTalon = new Talon(RobotMap.HOPPER_LOADING_TALON);
	}
	
	
	public void setLoadingSpeed(double s) {
		hopperTalon.set(s);
	}
	
	public void loadShooter() {
    	double s = RobotPreferences.loadSpeed();
    	setLoadingSpeed(s);
    }
	
	public void stopLoading() {
		hopperTalon.set(0.0);
	}

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
		//setDefaultCommand();
    }
}

