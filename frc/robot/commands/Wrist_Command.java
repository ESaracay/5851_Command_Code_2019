/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;





import edu.wpi.first.wpilibj.command.Command;

import frc.robot.Robot;
import frc.robot.RobotMap;

public class Wrist_Command extends Command {
  public Wrist_Command() {
    // Use requires() here to declare subsystem dependencies
     requires(Robot.Wrist);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
 /*   Robot.Wrist.wristEncoder.setMaxPeriod(.1);
    Robot.Wrist.wristEncoder.setMinRate(10);
    Robot.Wrist.wristEncoder.setDistancePerPulse(5);
    Robot.Wrist.wristEncoder.setReverseDirection(true);
    Robot.Wrist.wristEncoder.setSamplesToAverage(7);
    SmartDashboard.putNumber("Wrist Encoder", (Robot.Wrist.wristEncoder.getDistance()/-100));  
  */
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
 double Wrist = Robot.oi.Simon.getRawAxis(RobotMap.Simon_Right);
 Robot.Wrist.WRIST_MOTOR.set(-Wrist);
 //SmartDashboard.putNumber("Wrist Encoder", (Robot.Wrist.wristEncoder.getDistance()/-100)); 
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
