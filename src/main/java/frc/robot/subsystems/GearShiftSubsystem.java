/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
 
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
 public class GearShiftSubsystem extends Subsystem {

	private DoubleSolenoid shifter;
	
	public GearShiftSubsystem() {
		shifter = new DoubleSolenoid(RobotMap.GEAR_SHIFT_SOLENOID_PORTS[0], RobotMap.GEAR_SHIFT_SOLENOID_PORTS[1]);
		//shifter.set(RobotMap.DRIVETRAIN_SHIFT_DOWN);
	}
	
	public void ShiftUp() {
		shifter.set(RobotMap.DRIVETRAIN_SHIFT_UP);
	}
	
	public void ShiftDown() {
		shifter.set(RobotMap.DRIVETRAIN_SHIFT_DOWN);
	}
	
	public Value ShiftedState() {
		return shifter.get();
	}
	
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
