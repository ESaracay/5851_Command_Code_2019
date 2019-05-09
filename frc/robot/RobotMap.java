/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // drive
  public static int Drive_LF = 13, Drive_LB = 12, Drive_RF = 10, Drive_RB = 11;
  // Intake System
  public static int Wrist_Motor = 7, Claw = 3, Claw_Intake_Right = 2, Claw_Intake_Left = 4;
  // Lift System
  public static int Lift_FL = 0, Lift_BL = 1, Lift_FR = 5, Lift_BR = 6, Lift_Sensor = 14;
  // Joystick values
  public static int Joystick_LA = 1, Joystick_RA = 5, Simon_Right = 3;
  

}
