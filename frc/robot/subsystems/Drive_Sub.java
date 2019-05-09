/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.Drive_Command;

/**
 * Add your docs here.
 */
public class Drive_Sub extends Subsystem {
  WPI_TalonSRX Front_L = new WPI_TalonSRX(RobotMap.Drive_LF);
  WPI_TalonSRX Back_L = new WPI_TalonSRX(RobotMap.Drive_LB);
  WPI_TalonSRX Front_R = new WPI_TalonSRX(RobotMap.Drive_RF);
  WPI_TalonSRX Back_R = new WPI_TalonSRX(RobotMap.Lift_BR);

  SpeedControllerGroup Left_Group = new SpeedControllerGroup(Front_L, Back_L);
  SpeedControllerGroup Right_Group = new SpeedControllerGroup(Front_R, Back_R);
    public DifferentialDrive Drive = new DifferentialDrive(Left_Group, Right_Group);


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new Drive_Command());
  }
}
