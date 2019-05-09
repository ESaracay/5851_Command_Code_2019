/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.commands.Arm_Extend;
import frc.robot.commands.Arm_Retract;
import frc.robot.commands.Cargo_Command;
import frc.robot.commands.Claw_Close;
import frc.robot.commands.Claw_Open;
import frc.robot.commands.Intake_Command;
import frc.robot.commands.Shoot_Ball_Command;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {
  public Joystick Danny = new Joystick(0);
  public Joystick Simon = new Joystick(1);
  // Buttons
  public Button Lift_up = new JoystickButton(Danny, 1);
 public Button Lift_Down = new JoystickButton(Danny,2);
 public Button Intake_Ball= new JoystickButton(Simon,5 );
 public Button Shoot_Ball= new JoystickButton(Simon,6 );
 public Button Claw_Open = new JoystickButton(Simon,7);
 public Button Claw_Close = new JoystickButton(Simon,8);
 public Button Cargo= new JoystickButton(Danny,7);

  public OI() {
     Lift_up.whileHeld(new Arm_Extend() );
     Lift_Down.whileHeld(new Arm_Retract());
     Intake_Ball.whileHeld(new Intake_Command());
     Shoot_Ball.whileHeld(new Shoot_Ball_Command() );
     Claw_Open.whileHeld(new Claw_Open());
     Claw_Close.whileHeld(new Claw_Close());
     Cargo.whenPressed(new Cargo_Command());
    }
}