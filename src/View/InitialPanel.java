package View;

import java.awt.*;
import javax.swing.*;

import java.util.ArrayList;

public class InitialPanel extends JPanel {

	private CenterPanel cp;
	private NorthPanel np;

	public InitialPanel() {
		super();
		//initializes center panel
		cp = new CenterPanel();
		np = new NorthPanel();
		BorderLayout border = new BorderLayout();
		//BorderLayout border2 = new BorderLayout();

		//np.setLayout(border);
		//cp.setLayout(border);
		add(np, BorderLayout.PAGE_START);

		add(cp, BorderLayout.CENTER);
		revalidate();
		repaint();
	}
	
	public InitialPanel(int Param, int para)
	{
		
	}
	/**
	 * @return the cp
	 */
	public CenterPanel getCp() {
		return cp;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(CenterPanel cp) {
		this.cp = cp;
	}

	/**
	 * @return the np
	 */
	public NorthPanel getNp() {
		return np;
	}

	/**
	 * @param np the np to set
	 */
	public void setNp(NorthPanel np) {
		this.np = np;
	}
}
