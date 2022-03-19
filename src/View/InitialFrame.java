/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.*;
import javax.swing.*;

public class InitialFrame extends JFrame {
	private InitialPanel ip;
	
	public InitialFrame() //no parameter
	{
		super("PSU Football Team");
		//initializes Panel
		ip = new InitialPanel();
		add(ip);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
		ip.setBackground(Color.CYAN);
		pack();
	}
	public InitialFrame(int param, int para)
	{
		
	}

	/**
	 * @return the ip
	 */
	public InitialPanel getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(InitialPanel ip) {
		this.ip = ip;
	}
}
