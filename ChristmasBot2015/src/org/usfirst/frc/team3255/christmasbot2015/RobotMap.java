package org.usfirst.frc.team3255.christmasbot2015;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	// Joysticks
	public static final int JOYSTICK_DRIVER = 0;
	public static final int JOYSTICK_MANIPLUATOR = 1;
	
	// Axes
	public static final int AXIS_TANK_LEFT = 1;
	public static final int AXIS_TANK_RIGHT = 5;
	public static final int AXIS_ARCADE_MOVE = 1;
	public static final int AXIS_ARCADE_ROTATE = 2;
	public static final int AXIS_HDRIVE = 0;
	
	public static final int AXIS_COLLECTOR_PAN = 0;
	public static final int AXIS_COLLECTOR_SPEED = 1;
	public static final int AXIS_CASSETTE_SPEED = 1;
	public static final int AXIS_SHOOTER_SPEED_FACTOR = 3;
	//public static final int AXIS_CASSETTE_FEEDER_MODE = 3;
	
	// PWMs
	public static final int DRIVETRAIN_FRONT_LEFT_TALON = 0;
	public static final int DRIVETRAIN_BACK_LEFT_TALON = 1;
	public static final int DRIVETRAIN_FRONT_RIGHT_TALON = 2;
	public static final int DRIVETRAIN_BACK_RIGHT_TALON = 3;
	
	public static final int SHOOTER_TOP_TALON = 4;
	public static final int SHOOTER_BOTTOM_TALON = 5;
	public static final int HOPPER_LOADING_TALON = 6;
	
	public static final int COLLECTOR_TALON = 7;
	
	//Analog Inputs
	public static final int DRIVETRAIN_GYRO = 0;
	
	// Subsystem PCM Modules
	public static final int DRIVETRAIN_PCM = 0;
	public static final int CASSETTE_PCM = 0;
	public static final int COLLECTOR_PCM = 1;
	
	// Module 0 Solenoids
	public static final int DRIVETRAIN_SHIFT_RETRACT_SOLENOID = 2;
	public static final int DRIVETRAIN_SHIFT_DEPLOY_SOLENOID = 3;

	// Module 1 Solenoids
	public static final int COLLECTOR_WHEEL_DEPLOY = 2;
	public static final int COLLECTOR_WHEEL_RETRACT = 3;
	
	//Digital Inputs
	public static final int DRIVETRAIN_ENCODER_LEFT_CHANNEL_A = 0;
	public static final int DRIVETRAIN_ENCODER_LEFT_CHANNEL_B = 1;
	public static final int DRIVETRAIN_ENCODER_RIGHT_CHANNEL_A = 2;
	public static final int DRIVETRAIN_ENCODER_RIGHT_CHANNEL_B = 3;
	
	public static final int CASSETTE_TOP_MAGSWITCH = 9;
	public static final int CASSETTE_TRASH_HOLD_MAGSWITCH = 8;
	public static final int CASSETTE_TOTE_HOLD_MAGSWITCH = 7;
	public static final int CASSETTE_STEP_MAGSWITCH = 6;
	public static final int CASSETTE_TOTE_PICKUP_MAGSWITCH = 5;
	public static final int CASSETTE_BOTTOM_MAGSWITCH = 4;
		
	public static final int CASSTTE_TOTE_DETECT_LIMITSWITCH = 10;
	
	public static final int CASSETTE_LIFT_ENCODER_CHANNEL_A = 13;
	public static final int CASSETTE_LIFT_ENCODER_CHANNEL_B = 14;
	
	//Testboard ports - Since the test board does not have a more board, these are temporary ports
	/*
	public static final int CASSETTE_LIFT_ENCODER_CHANNEL_A = 4;
	public static final int CASSETTE_LIFT_ENCODER_CHANNEL_B = 5;
	public static final int CASSTTE_TOTE_DETECT_LIMITSWITCH = 6;
	public static final int CASSETTE_TOP_MAGSWITCH = 8;
	public static final int CASSETTE_TRASH_HOLD_MAGSWITCH = 14;
	public static final int CASSETTE_TOTE_HOLD_MAGSWITCH = 7;
	public static final int CASSETTE_STEP_MAGSWITCH = 15;
	public static final int CASSETTE_TOTE_PICKUP_MAGSWITCH = 13;
	public static final int CASSETTE_BOTTOM_MAGSWITCH = 9;*/
}
