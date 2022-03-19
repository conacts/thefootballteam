
package View;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.*;

public class NorthPanel extends JPanel
{
	private JTextField search_bar;
	public NorthPanel()
	{
		super();
		System.out.println("North Panel Created");
		setBackground(Color.WHITE);
		search_bar = new JTextField(20);
		search_bar.setSize(300, 50);
		//setLayout("NORTH");
		add(search_bar);
		setVisible(true);
		repaint();

	}
	void addnp()
	{
		add(getSearch_bar(), BorderLayout.PAGE_START);
		repaint();

	}

	/**
	 * @return the search_bar
	 */
	public JTextField getSearch_bar() {
		return search_bar;
	}

	/**
	 * @param search_bar the search_bar to set
	 */
	public void setSearch_bar(JTextField search_bar) {
		this.search_bar = search_bar;
	}
}
