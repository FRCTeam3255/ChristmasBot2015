package org.usfirst.frc.team3255.christmasbot2015.commands;

import org.usfirst.frc.team3255.christmasbot2015.OI;
import org.usfirst.frc.team3255.christmasbot2015.subsystems.*;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public abstract class CommandBase extends Command {
	
	public static final Drivetrain drivetrain = new Drivetrain();
    public static final Shooter shooter = new Shooter();
    public static final Collector collector = new Collector();
    public static final Hopper hopper = new Hopper();
	public static OI oi;
	
    public CommandBase() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

	public static void init() {
		oi = new OI();	
	}
}
