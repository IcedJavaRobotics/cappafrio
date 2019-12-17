/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  //DriveTrain
  public static final int FRONT_LEFT_SPARK = 0;
	//public static final int CENTER_LEFT_SPARK =  5;
	public static final int BACK_LEFT_SPARK = 1;
	public static final int FRONT_RIGHT_SPARK = 2;
	//public static final int CENTER_RIGHT_SPARK = 2;
  public static final int BACK_RIGHT_SPARK =  3;
  public static final double JOYSTICK_DEADZONE = .15;
  public static final int CONTROLLER = 0;
  
  //Arm
	public static final int ARM_SPARK = 4;
  public static final double ARM_SPEED = .7;
  
  //GearShift
	public static final int[] GEAR_SHIFT_SOLENOID_PORTS = { 0, 1 };
	public static final Value DRIVETRAIN_SHIFT_UP = Value.kReverse;
	public static final Value DRIVETRAIN_SHIFT_DOWN = Value.kForward;

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
