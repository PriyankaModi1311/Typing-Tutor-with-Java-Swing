/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Name: Priyanka 
Student Number: c0717925
Date: Apr 9, 2016

General description of what your code does:
	This code will make a virtual keyboard 
General description of the variables used in your code:
	build a GUI application and make a virtual keyboard
Expected good results:
	This code will print ==>  a virtual keyboard    
Anticipated bad results:
	No bad results are anticipated since this program is not interactive and does not require user interaction
***********************************/

 
package assignment3;





import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Assignment3 {

	private JFrame frmTypingTutor;
	Color btncolor = Color.LIGHT_GRAY ; 	
	
	// Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment3 window = new Assignment3();
					window.frmTypingTutor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//create/call initialize frame
	public Assignment3() {
		initialize();
	}

	
	private void initialize() {
		
		frmTypingTutor = new JFrame();
		frmTypingTutor.setTitle("Typing Tutor");
		frmTypingTutor.setBounds(50, 100, 727, 550);
		frmTypingTutor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTypingTutor.getContentPane().setLayout(null);
		frmTypingTutor.setResizable(false); 
		frmTypingTutor.setVisible(true);	
		
		//Create components
		JLabel label1 = new JLabel("Type some text using your keyboard. The keys you press will be highlighted and the next text will be displayed.");
		JLabel label2 = new JLabel("Note: Clicking the buttons with your mouse will not perform any action.");
		JButton btnNewButton = new JButton("~");
		JButton button_0 = new JButton("1");
		JButton button_1 = new JButton("2");
		JButton button_2 = new JButton("3");
		JButton button_3 = new JButton("4");
		JButton button_4 = new JButton("5");
		JButton button_5 = new JButton("6");
		JButton button_6 = new JButton("7");
		JButton button_7 = new JButton("8");
		JButton button_8 = new JButton("9");
		JButton button_9 = new JButton("0");
		JButton button_10 = new JButton("-");
		JButton button_11 = new JButton("+");
		JButton button_12 = new JButton("Backspace");
		JButton button_13 = new JButton("Tab");
		JButton btnQ = new JButton("Q");
		JButton btnW = new JButton("W");
		JButton btnE = new JButton("E");
		JButton btnR = new JButton("R");
		JButton btnT = new JButton("T");
		JButton btnY = new JButton("Y");
		JButton btnU = new JButton("U");
		JButton btnI = new JButton("I");
		JButton btnO = new JButton("O");
		JButton btnP = new JButton("P");
		JButton button = new JButton("[");
		JButton button_14 = new JButton("]");
		JButton button_15 = new JButton("\\");
		JButton btnCaps = new JButton("Caps");
		JButton btnA = new JButton("A");
		JButton btnS = new JButton("S");
		JButton btnD = new JButton("D");
		JButton btnF = new JButton("F");
		JButton btnG = new JButton("G");
		JButton btnH = new JButton("H");
		JButton btnJ = new JButton("J");
		JButton btnK = new JButton("K");
		JButton btnL = new JButton("L");
		JButton button_26 = new JButton(";");
		JButton button_27 = new JButton("\"");
		JButton btnEnter = new JButton("Enter");
		JButton btnShift = new JButton("Shift");
		JButton btnZ = new JButton("Z");
		JButton btnX = new JButton("X");
		JButton btnC = new JButton("C");
		JButton btnV = new JButton("V");
		JButton btnB = new JButton("B");
		JButton btnN = new JButton("N");
		JButton btnM = new JButton("M");
		JButton button_23 = new JButton(",");
		JButton button_24 = new JButton(".");
		JButton button_25 = new JButton("?");
		JButton button_16 = new JButton("^");
		JButton btnV_1 = new JButton("v");
		JButton button_18 = new JButton(">");
		JButton button_19 = new JButton("<");
		JButton button_20 = new JButton(" ");
		
		//Set size and coordinates or positioning
		label1.setBounds(10, 11, 680, 14);
		label2.setBounds(10, 28, 680, 14);
		btnNewButton.setBounds(10, 312, 47, 38);
		button_0.setBounds(56, 312, 47, 38);
		button_1.setBounds(102, 312, 47, 38);
		button_2.setBounds(148, 312, 47, 38);
		button_3.setBounds(194, 312, 47, 38);
		button_4.setBounds(240, 312, 47, 38);
		button_5.setBounds(286, 312, 47, 38);
		button_6.setBounds(332, 312, 47, 38);
		button_7.setBounds(378, 312, 47, 38);
		button_8.setBounds(424, 312, 47, 38);
		button_9.setBounds(470, 312, 47, 38);
		button_10.setBounds(516, 312, 47, 38);
		button_11.setBounds(562, 312, 47, 38);
		button_12.setBounds(608, 312, 101, 38);
		button_13.setBounds(10, 350, 72, 38);
		btnQ.setBounds(81, 350, 47, 38);
		btnW.setBounds(127, 350, 47, 38);
		btnE.setBounds(173, 350, 47, 38);
		btnR.setBounds(219, 350, 47, 38);
		btnT.setBounds(265, 350, 47, 38);
		btnY.setBounds(311, 350, 47, 38);
		btnU.setBounds(357, 350, 47, 38);
		btnI.setBounds(403, 350, 47, 38);
		btnO.setBounds(449, 350, 47, 38);
		btnP.setBounds(495, 350, 47, 38);
		button.setBounds(541, 350, 47, 38);
		button_14.setBounds(587, 350, 47, 38);
		button_15.setBounds(633, 350, 76, 38);
		btnCaps.setBounds(10, 388, 82, 38);
		btnA.setBounds(91, 388, 47, 38);
		btnS.setBounds(137, 388, 47, 38);
		btnD.setBounds(183, 388, 47, 38);
		btnF.setBounds(229, 388, 47, 38);
		btnG.setBounds(275, 388, 47, 38);
		btnH.setBounds(321, 388, 47, 38);
		btnJ.setBounds(367, 388, 47, 38);
		btnK.setBounds(413, 388, 47, 38);
		btnL.setBounds(459, 388, 47, 38);
		button_26.setBounds(505, 388, 47, 38);
		button_27.setBounds(551, 388, 47, 38);
		btnEnter.setBounds(597, 388, 112, 38);
		btnShift.setBounds(10, 426, 103, 38);
		btnZ.setBounds(112, 426, 47, 38);
		btnX.setBounds(158, 426, 47, 38);
		btnC.setBounds(204, 426, 47, 38);
		btnV.setBounds(250, 426, 47, 38);
		btnB.setBounds(296, 426, 47, 38);
		btnN.setBounds(342, 426, 47, 38);
		btnM.setBounds(388, 426, 47, 38);
		button_23.setBounds(434, 426, 47, 38);
		button_24.setBounds(480, 426, 47, 38);
		button_25.setBounds(526, 426, 45, 38);
		button_16.setBounds(616, 426, 47, 38);
		btnV_1.setBounds(616, 463, 47, 38);
		button_18.setBounds(662, 463, 47, 38);
		button_19.setBounds(570, 463, 47, 38);
		button_20.setBounds(10, 463, 561, 38);
		
		//adding components
		frmTypingTutor.getContentPane().add(label1);
		frmTypingTutor.getContentPane().add(label2);
		frmTypingTutor.getContentPane().add(btnNewButton);
		frmTypingTutor.getContentPane().add(button_0);
		frmTypingTutor.getContentPane().add(button_1);
		frmTypingTutor.getContentPane().add(button_2);
		frmTypingTutor.getContentPane().add(button_3);
		frmTypingTutor.getContentPane().add(button_4);
		frmTypingTutor.getContentPane().add(button_5);
		frmTypingTutor.getContentPane().add(button_6);
		frmTypingTutor.getContentPane().add(button_7);
		frmTypingTutor.getContentPane().add(button_8);
		frmTypingTutor.getContentPane().add(button_9);
		frmTypingTutor.getContentPane().add(button_10);
		frmTypingTutor.getContentPane().add(button_11);
		frmTypingTutor.getContentPane().add(button_12);
		frmTypingTutor.getContentPane().add(button_13);
		frmTypingTutor.getContentPane().add(btnQ);
		frmTypingTutor.getContentPane().add(btnW);
		frmTypingTutor.getContentPane().add(btnE);
		frmTypingTutor.getContentPane().add(btnR);
		frmTypingTutor.getContentPane().add(btnT);
		frmTypingTutor.getContentPane().add(btnY);
		frmTypingTutor.getContentPane().add(btnU);
		frmTypingTutor.getContentPane().add(btnI);
		frmTypingTutor.getContentPane().add(btnO);
		frmTypingTutor.getContentPane().add(btnP);
		frmTypingTutor.getContentPane().add(button);
		frmTypingTutor.getContentPane().add(button_14);
		frmTypingTutor.getContentPane().add(button_15);
		frmTypingTutor.getContentPane().add(btnCaps);
		frmTypingTutor.getContentPane().add(btnA);
		frmTypingTutor.getContentPane().add(btnS);
		frmTypingTutor.getContentPane().add(btnD);
		frmTypingTutor.getContentPane().add(btnF);
		frmTypingTutor.getContentPane().add(btnG);
		frmTypingTutor.getContentPane().add(btnH);
		frmTypingTutor.getContentPane().add(btnJ);
		frmTypingTutor.getContentPane().add(btnK);
		frmTypingTutor.getContentPane().add(btnL);
		frmTypingTutor.getContentPane().add(button_26);
		frmTypingTutor.getContentPane().add(button_27);
		frmTypingTutor.getContentPane().add(btnEnter);
		frmTypingTutor.getContentPane().add(btnShift);
		frmTypingTutor.getContentPane().add(btnZ);
		frmTypingTutor.getContentPane().add(btnX);
		frmTypingTutor.getContentPane().add(btnC);
		frmTypingTutor.getContentPane().add(btnV);
		frmTypingTutor.getContentPane().add(btnB);
		frmTypingTutor.getContentPane().add(btnN);
		frmTypingTutor.getContentPane().add(btnM);
		frmTypingTutor.getContentPane().add(button_23);
		frmTypingTutor.getContentPane().add(button_24);
		frmTypingTutor.getContentPane().add(button_25);
		frmTypingTutor.getContentPane().add(button_16);
		frmTypingTutor.getContentPane().add(btnV_1);
		frmTypingTutor.getContentPane().add(button_18);
		frmTypingTutor.getContentPane().add(button_19);
		frmTypingTutor.getContentPane().add(button_20);
		
		//Create JtextArea and add keylisterner
		//Specific Button changes color depending on KeyEvent 
		JTextArea textArea1 = new JTextArea();
		
		textArea1.addKeyListener(new KeyAdapter() {
			Color iniC = btnQ.getBackground();
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode){
					case 192:
						btnNewButton.setBackground(btncolor);
						break;
					case KeyEvent.VK_1:
						button_0.setBackground(btncolor);
						break;
					case KeyEvent.VK_2:
						button_1.setBackground(btncolor);
						break;
					case KeyEvent.VK_3:
						button_2.setBackground(btncolor);
						break;
					case KeyEvent.VK_4:
						button_3.setBackground(btncolor);
						break;
					case KeyEvent.VK_5:
						button_4.setBackground(btncolor);
						break;
					case KeyEvent.VK_6:
						button_5.setBackground(btncolor);
						break;
					case KeyEvent.VK_7:
						button_6.setBackground(btncolor);
						break;
					case KeyEvent.VK_8:
						button_7.setBackground(btncolor);
						break;
					case KeyEvent.VK_9:
						button_8.setBackground(btncolor);
						break;
					case KeyEvent.VK_0:
						button_9.setBackground(btncolor);
						break;
					case KeyEvent.VK_MINUS:
						button_10.setBackground(btncolor);
						break;
					case KeyEvent.VK_EQUALS: 
						button_11.setBackground(btncolor);
						break;
					case KeyEvent.VK_BACK_SPACE:
						button_12.setBackground(btncolor);
						break;
					case KeyEvent.VK_TAB:
						button_13.setBackground(btncolor);
						break;
					case KeyEvent.VK_Q:
						btnQ.setBackground(btncolor);
						break;
					case KeyEvent.VK_W:
						btnW.setBackground(btncolor);
						break;
					case KeyEvent.VK_E:
						btnE.setBackground(btncolor);
						break;
					case KeyEvent.VK_R:
						btnR.setBackground(btncolor);
						break;
					case KeyEvent.VK_T:
						btnT.setBackground(btncolor);
						break;
					case KeyEvent.VK_Y:
						btnY.setBackground(btncolor);
						break;
					case KeyEvent.VK_U:
						btnU.setBackground(btncolor);
						break;
					case KeyEvent.VK_I:
						btnI.setBackground(btncolor);
						break;
					case KeyEvent.VK_O:
						btnO.setBackground(btncolor);
						break;
					case KeyEvent.VK_P:
						btnP.setBackground(btncolor);
						break;
					case KeyEvent.VK_OPEN_BRACKET:
						button.setBackground(btncolor);
						break;
					case KeyEvent.VK_CLOSE_BRACKET:
						button_14.setBackground(btncolor);
						break;
					case KeyEvent.VK_BACK_SLASH:
						button_15.setBackground(btncolor);
						break;
					case KeyEvent.VK_CAPS_LOCK:
						btnCaps.setBackground(btncolor);
						break;
					case KeyEvent.VK_A:
						btnA.setBackground(btncolor);
						break;
					case KeyEvent.VK_S:
						btnS.setBackground(btncolor);
						break;
					case KeyEvent.VK_D:
						btnD.setBackground(btncolor);
						break;
					case KeyEvent.VK_F:
						btnF.setBackground(btncolor);
						break;
					case KeyEvent.VK_G:
						btnG.setBackground(btncolor);
						break;
					case KeyEvent.VK_H:
						btnH.setBackground(btncolor);
						break;
					case KeyEvent.VK_J:
						btnJ.setBackground(btncolor);
						break;
					case KeyEvent.VK_K:
						btnK.setBackground(btncolor);
						break;
					case KeyEvent.VK_L:
						btnL.setBackground(btncolor);
						break;
					case KeyEvent.VK_SEMICOLON:
						button_26.setBackground(btncolor);
						break;
					case KeyEvent.VK_QUOTE:
						button_27.setBackground(btncolor);
						break;
					case KeyEvent.VK_ENTER:
						btnEnter.setBackground(btncolor);
						break;
					case KeyEvent.VK_SHIFT:
						btnShift.setBackground(btncolor);
						break;
					case KeyEvent.VK_Z:
						btnZ.setBackground(btncolor);
						break;
					case KeyEvent.VK_X:
						btnX.setBackground(btncolor);
						break;
					case KeyEvent.VK_C:
						btnC.setBackground(btncolor);
						break;
					case KeyEvent.VK_V:
						btnV.setBackground(btncolor);
						break;
					case KeyEvent.VK_B:
						btnB.setBackground(btncolor);
						break;
					case KeyEvent.VK_N:
						btnN.setBackground(btncolor);
						break;
					case KeyEvent.VK_M:
						btnM.setBackground(btncolor);
						break;
					case KeyEvent.VK_COMMA:
						button_23.setBackground(btncolor);
						break;
					case KeyEvent.VK_PERIOD:
						button_24.setBackground(btncolor);
						break;
					case KeyEvent.VK_SLASH:
						button_25.setBackground(btncolor);
						break;
					case KeyEvent.VK_SPACE:
						button_20.setBackground(btncolor);
						break;
					case KeyEvent.VK_LEFT:
						button_19.setBackground(btncolor);
						break;
					case KeyEvent.VK_DOWN:
						btnV_1.setBackground(btncolor);
						break;
					case KeyEvent.VK_RIGHT:
						button_18.setBackground(btncolor);
						break;
					case KeyEvent.VK_UP:
						button_16.setBackground(btncolor);
						break;
				
				}
				
			}
			//Changes button color to default
			@Override
			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode){
					case 192:
						btnNewButton.setBackground(iniC);
						String newText1 = textArea1.getText();
						textArea1.setText(newText1.substring(0, newText1.length() - 1));
						textArea1.append("~");
						break;
					case KeyEvent.VK_1:
						button_0.setBackground(iniC);
						break;
					case KeyEvent.VK_2:
						button_1.setBackground(iniC);
						break;
					case KeyEvent.VK_3:
						button_2.setBackground(iniC);
						break;
					case KeyEvent.VK_4:
						button_3.setBackground(iniC);
						break;
					case KeyEvent.VK_5:
						button_4.setBackground(iniC);
						break;
					case KeyEvent.VK_6:
						button_5.setBackground(iniC);
						break;
					case KeyEvent.VK_7:
						button_6.setBackground(iniC);
						break;
					case KeyEvent.VK_8:
						button_7.setBackground(iniC);
						break;
					case KeyEvent.VK_9:
						button_8.setBackground(iniC);
						break;
					case KeyEvent.VK_0:
						button_9.setBackground(iniC);
						break;
					case KeyEvent.VK_MINUS: 
						button_10.setBackground(iniC);
						break;
					case KeyEvent.VK_EQUALS: 
						button_11.setBackground(iniC);
						break;
					case KeyEvent.VK_BACK_SPACE:
						button_12.setBackground(iniC);
						break;
					case KeyEvent.VK_TAB:
						button_13.setBackground(iniC);
						break;
					case KeyEvent.VK_Q:
						btnQ.setBackground(iniC);
						break;
					case KeyEvent.VK_W:
						btnW.setBackground(iniC);
						break;
					case KeyEvent.VK_E:
						btnE.setBackground(iniC);
						break;
					case KeyEvent.VK_R:
						btnR.setBackground(iniC);
						break;
					case KeyEvent.VK_T:
						btnT.setBackground(iniC);
						break;
					case KeyEvent.VK_Y:
						btnY.setBackground(iniC);
						break;
					case KeyEvent.VK_U:
						btnU.setBackground(iniC);
						break;
					case KeyEvent.VK_I:
						btnI.setBackground(iniC);
						break;
					case KeyEvent.VK_O:
						btnO.setBackground(iniC);
						break;
					case KeyEvent.VK_P:
						btnP.setBackground(iniC);
						break;
					case KeyEvent.VK_OPEN_BRACKET:
						button.setBackground(iniC);
						break;
					case KeyEvent.VK_CLOSE_BRACKET:
						button_14.setBackground(iniC);
						break;
					case KeyEvent.VK_BACK_SLASH:
						button_15.setBackground(iniC);
						break;
					case KeyEvent.VK_CAPS_LOCK:
						btnCaps.setBackground(iniC);
						break;
					case KeyEvent.VK_A:
						btnA.setBackground(iniC);
						break;
					case KeyEvent.VK_S:
						btnS.setBackground(iniC);
						break;
					case KeyEvent.VK_D:
						btnD.setBackground(iniC);
						break;
					case KeyEvent.VK_F:
						btnF.setBackground(iniC);
						break;
					case KeyEvent.VK_G:
						btnG.setBackground(iniC);
						break;
					case KeyEvent.VK_H:
						btnH.setBackground(iniC);
						break;
					case KeyEvent.VK_J:
						btnJ.setBackground(iniC);
						break;
					case KeyEvent.VK_K:
						btnK.setBackground(iniC);
						break;
					case KeyEvent.VK_L:
						btnL.setBackground(iniC);
						break;
					case KeyEvent.VK_SEMICOLON:
						button_26.setBackground(iniC);
						break;
					case KeyEvent.VK_QUOTE:
						button_27.setBackground(iniC);
						break;
					case KeyEvent.VK_ENTER:
						btnEnter.setBackground(iniC);
						break;
					case KeyEvent.VK_SHIFT:
						btnShift.setBackground(iniC);
						break;
					case KeyEvent.VK_Z:
						btnZ.setBackground(iniC);
						break;
					case KeyEvent.VK_X:
						btnX.setBackground(iniC);
						break;
					case KeyEvent.VK_C:
						btnC.setBackground(iniC);
						break;
					case KeyEvent.VK_V:
						btnV.setBackground(iniC);
						break;
					case KeyEvent.VK_B:
						btnB.setBackground(iniC);
						break;
					case KeyEvent.VK_N:
						btnN.setBackground(iniC);
						break;
					case KeyEvent.VK_M:
						btnM.setBackground(iniC);
						break;
					case KeyEvent.VK_COMMA:
						button_23.setBackground(iniC);
						break;
					case KeyEvent.VK_PERIOD:
						button_24.setBackground(iniC);
						break;
					case KeyEvent.VK_SLASH:
						button_25.setBackground(iniC);
						String newText = textArea1.getText();
						textArea1.setText(newText.substring(0, newText.length() - 1));
						textArea1.append("?");
						break;
					case KeyEvent.VK_SPACE:
						button_20.setBackground(iniC);
						break;
					case KeyEvent.VK_LEFT:
						button_19.setBackground(iniC);
						break;
					case KeyEvent.VK_DOWN:
						btnV_1.setBackground(iniC);
						break;
					case KeyEvent.VK_RIGHT:
						button_18.setBackground(iniC);
						break;
					case KeyEvent.VK_UP:
						button_16.setBackground(iniC);
						break;
				}
				
			}
		});
		textArea1.setBounds(17, 47, 687, 242);
		frmTypingTutor.getContentPane().add(textArea1);
	}
}
