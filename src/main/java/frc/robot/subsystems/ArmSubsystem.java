/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class ArmSubsystem extends Subsystem {
	
	private Spark armSpark;
	
	
	public ArmSubsystem() {
		armSpark = new Spark(RobotMap.ARM_SPARK);
		armSpark.setInverted(true);
	}
	
	public void armUp() {
		armSpark.set(RobotMap.ARM_SPEED);
	}
	
	public void armStop() {
		armSpark.set(0);
	}

	public void armDown() {
		armSpark.set(-RobotMap.ARM_SPEED);
	}
	
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
