
package org.usfirst.frc.team3255.christmasbot2015.subsystems;

import org.usfirst.frc.team3255.christmasbot2015.RobotMap;
import org.usfirst.frc.team3255.christmasbot2015.RobotPreferences;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
    //Motor Controllers
	Talon topTalon = null;
	Talon bottomTalon = null;

    public Shooter() {
		super();
		
		init();
	}

	public Shooter(String name) {
		super(name);
		
		init();
	}

	public void init() {
		topTalon = new Talon(RobotMap.SHOOTER_TOP_TALON);
		bottomTalon = new Talon(RobotMap.SHOOTER_BOTTOM_TALON);
	}
	
	public void setShooterSpeed(double s) {
		topTalon.set(s);
		bottomTalon.set(s);
	}
	
	public void shootHigh() {
    	double s = RobotPreferences.ShooterHighSpeed();
    	setShooterSpeed(s);
    }
	
	public void shootMedium() {
    	double s = RobotPreferences.ShooterMediumSpeed();
    	setShooterSpeed(s);
    }
	
	public void shootLow() {
    	double s = RobotPreferences.ShooterLowSpeed();
    	setShooterSpeed(s);
    }
	
	public void stopShooting() {
		topTalon.set(0.0);
		bottomTalon.set(0.0);
	}

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
		//setDefaultCommand();
    }
}

