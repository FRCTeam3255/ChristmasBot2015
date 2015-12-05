package org.usfirst.frc.team3255.christmasbot2015;

import edu.wpi.first.wpilibj.Preferences;

public class RobotPreferences {
	
	//Shooter
	public static double ShooterHighSpeed() {
		return Preferences.getInstance().getDouble("ShooterSpeedHigh", 1.0);
	}
	
	public static double ShooterMediumSpeed() {
		return Preferences.getInstance().getDouble("ShooterMediumHigh", 0.7);
	}

	public static double ShooterLowSpeed() {
		return Preferences.getInstance().getDouble("ShooterMediumHigh", 0.5);
	}
	
	//Collector
	public static double collectorSpeed() {
		return Preferences.getInstance().getDouble("CollectorSpeed", 1.0);
	}
	
	//Hopper
	public static double loadSpeed() {
		return Preferences.getInstance().getDouble("LoadSpeed", 1.0);
	}
	
	//Drivetrain
	public static double driveSensitivity() {
		return Preferences.getInstance().getDouble("DriveSensitivity", 1.0);
	}
	
	public static double getPulsesPer5Feet() {
		return Preferences.getInstance().getDouble("PulsesPer5Feet", 1200.0);
	}

	// Camera
	public static String cameraName() {
        return Preferences.getInstance().getString("CameraName", "cam2");
		// return "cam1";
	}	
}
