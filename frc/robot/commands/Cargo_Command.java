/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class Cargo_Command extends Command {
  public Cargo_Command() {
    // Use requires() here to declare subsystem dependencies
     requires(Robot.Lift);
     
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
   if((Robot.Lift.Lift_Sensor.getSelectedSensorPosition()/1000)<179){
   Robot.Lift.Arm_up_Auto();
  
   } 
else{ if((Robot.Lift.Lift_Sensor.getSelectedSensorPosition()/1000)>=179){
Robot.Lift.Arm_static();
}
}
}
  

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
   // return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  //Robot.Lift.Arm_static();
  
  }
  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}