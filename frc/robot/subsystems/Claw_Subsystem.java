/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.Victor;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.Intake_Default_Command;

/**
 * Add your docs here.
 */
public class Claw_Subsystem extends Subsystem {
PWMVictorSPX Claw = new PWMVictorSPX(RobotMap.Claw);
Victor Claw_Intake_Right = new Victor(RobotMap.Claw_Intake_Right);
Victor Claw_Intake_Left = new Victor(RobotMap.Claw_Intake_Left);
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new Intake_Default_Command());
     
  }
public void Intake_Default(){
Claw_Intake_Left.set(0);
Claw_Intake_Right.set(0);
Claw.set(0);
}
public void Open(){
Claw.set(.5);
}
public void Close(){
Claw.set(-.5);
}
public void Intake(){
Claw_Intake_Left.set(-.65); 
Claw_Intake_Right.set(.65);
}
public void Out(){
  Claw_Intake_Left.set(.7); 
  Claw_Intake_Right.set(-.7);
}
}
