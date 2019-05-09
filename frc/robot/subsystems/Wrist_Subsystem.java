/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Victor;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.Wrist_Command;

/**
 * Add your docs here.
 */
public class Wrist_Subsystem extends Subsystem {
 public Victor WRIST_MOTOR = new Victor(RobotMap.Wrist_Motor);
// public Encoder wristEncoder;
//public Encoder wristEncoder = new Encoder(8, 9, false, EncodingType.k4X);
  @Override
  public void initDefaultCommand() {
    
     setDefaultCommand(new Wrist_Command());
  }
public void Wrist_Down(){
WRIST_MOTOR.set(-1);
}
public void Wrist_Static(){
WRIST_MOTOR.set(0);
}
}
