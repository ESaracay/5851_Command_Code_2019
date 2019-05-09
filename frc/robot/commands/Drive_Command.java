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

public class Drive_Command extends Command {
  public Drive_Command() {
    // Use requires() here to declare subsystem dependencies
     requires(Robot.drive);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  double move_r= Robot.oi.Danny.getRawAxis(RobotMap.Joystick_LA);
  double move_l= Robot.oi.Danny.getRawAxis(RobotMap.Joystick_RA);
  
  if(Robot.oi.Danny.getRawButton(5)== true){
    Robot.drive.Drive.tankDrive(move_r*.5,move_l*.5);
  }
  else{
    Robot.drive.Drive.tankDrive(move_r*.7,move_l*.7);
}
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
