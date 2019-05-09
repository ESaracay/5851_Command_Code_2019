/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.Arm_Static;


public class Lift_Subsystem extends Subsystem {
 public Victor Lift_FL_Motor = new Victor(RobotMap.Lift_FL);
 public Victor Lift_FR_Motor = new Victor(RobotMap.Lift_FR);
 public Victor Lift_BL_Motor = new Victor(RobotMap.Lift_BL);
 public Victor Lift_BR_Motor = new Victor(RobotMap.Lift_BR);
 public WPI_TalonSRX Lift_Sensor = new WPI_TalonSRX(RobotMap.Lift_Sensor);

  @Override
  public void initDefaultCommand() {
 setDefaultCommand(new Arm_Static());
     }
public void Arm_up(){
  Lift_FL_Motor.set(.4);
  Lift_BL_Motor.set(.4);
  Lift_FR_Motor.set(.4);
  Lift_BR_Motor.set(.4);
}
public void Arm_up_Auto(){
  Lift_FL_Motor.set(.6);
  Lift_BL_Motor.set(.6);
  Lift_FR_Motor.set(.6);
  Lift_BR_Motor.set(.6);
}
public void Arm_down(){
  Lift_FL_Motor.set(-.4);
  Lift_BL_Motor.set(-.4);
  Lift_FR_Motor.set(-.4);
  Lift_BR_Motor.set(-.4);
}
public void Arm_static(){
  Lift_FL_Motor.set(0);
  Lift_BL_Motor.set(0);
  Lift_FR_Motor.set(0);
  Lift_BR_Motor.set(0);
}


}
