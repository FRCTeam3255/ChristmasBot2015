
package org.usfirst.frc.team3255.christmasbot2015.subsystems;

import org.usfirst.frc.team3255.christmasbot2015.OI;
import org.usfirst.frc.team3255.christmasbot2015.RobotMap;
import org.usfirst.frc.team3255.christmasbot2015.RobotPreferences;
import org.usfirst.frc.team3255.christmasbot2015.commands.DriveArcade;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    //Motor Controllers
	Talon leftFrontTalon = null;
	Talon leftBackTalon = null;
	Talon rightFrontTalon = null;
	Talon rightBackTalon = null;
	
	// solenoid for shifting
	DoubleSolenoid shiftingSolenoid = null;
	
	// Robot Drive
	RobotDrive robotDrive = null;
	
	// Encoders
	public Encoder leftEncoder = null;
	public Encoder rightEncoder = null;

    public Drivetrain() {
		super();
		
		init();
	}

	public Drivetrain(String name) {
		super(name);
		
		init();
	}

	public void init() {
		// Create Talon motor controller for drive wheels
		leftFrontTalon = new Talon(RobotMap.DRIVETRAIN_FRONT_LEFT_TALON);
		leftBackTalon = new Talon(RobotMap.DRIVETRAIN_BACK_LEFT_TALON);
		rightFrontTalon = new Talon(RobotMap.DRIVETRAIN_FRONT_RIGHT_TALON);
		rightBackTalon = new Talon(RobotMap.DRIVETRAIN_BACK_RIGHT_TALON);
		
		// Create solenoid for shifting
		shiftingSolenoid = new DoubleSolenoid(RobotMap.DRIVETRAIN_PCM, RobotMap.DRIVETRAIN_SHIFT_DEPLOY_SOLENOID, RobotMap.DRIVETRAIN_SHIFT_RETRACT_SOLENOID);
		
		robotDrive = new RobotDrive(leftFrontTalon, leftBackTalon, rightFrontTalon, rightBackTalon);
		
		robotDrive.setSafetyEnabled(false);
		
		leftEncoder = new Encoder(RobotMap.DRIVETRAIN_ENCODER_LEFT_CHANNEL_A,
				RobotMap.DRIVETRAIN_ENCODER_LEFT_CHANNEL_B);
		rightEncoder = new Encoder(RobotMap.DRIVETRAIN_ENCODER_RIGHT_CHANNEL_A, 
				RobotMap.DRIVETRAIN_ENCODER_RIGHT_CHANNEL_B);
	}

	public void setSpeed(double s) {
		leftFrontTalon.set(s);
		leftBackTalon.set(s);
		rightFrontTalon.set(-s);
		rightBackTalon.set(-s);
	}
	
	public void arcadeDrive() {
		// negate the drive axis so that pushing stick forward is +1
		double moveSpeed = -OI.driverStick.getRawAxis(RobotMap.AXIS_ARCADE_MOVE);
		double rotateSpeed = -OI.driverStick.getRawAxis(RobotMap.AXIS_ARCADE_ROTATE);
		
		robotDrive.arcadeDrive(moveSpeed, rotateSpeed);
	}
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new DriveArcade());
    }
}

