package View;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.*;


public class CenterPanel extends JPanel 
{
	private ArrayList <JButton> headerButtonsArray;
	private ArrayList <JButton> theButtonsArray;
	private ArrayList counter;
	private Color defaultColor;
	public CenterPanel()
	{
	super();
	setVisible(true);
	theButtonsArray = new ArrayList();
	headerButtonsArray = new ArrayList();
	counter = new ArrayList();
	defaultColor = new JButton().getBackground();
	setBackground(Color.CYAN);
	}
	
	public CenterPanel(int param, int para)
	{
		
	}
	public void buildButtons(int rows, int cols)
	{
		for (int x = 0; x < (rows); x++)
		{
			for (int i = 0; i < cols; i++)
		{
		JButton button = new JButton();
		button.setText("row=" + String.valueOf(x) + "cols=" + String.valueOf(i));
		add(button);
		getTheButtonsArray().add(button);
		}
		}
	}
	public void row(ArrayList<String>data)
	{
	
		for (String att : data)
		{
			getTheButtonsArray().get(counter.size()).setText(att);
			getTheButtonsArray().get(counter.size()).setPreferredSize(new Dimension(100, 50));
			if (getCounter().size() > 865)
				break;
			getCounter().add("");
		}
		validate();
	}

	public void table(ArrayList<ArrayList<String>>data)
	{
		for (ArrayList<String> line : data)
		{
			row(line);
		}
		validate();
	}
	public void setGridDimesions(int rows, int cols)
	{
		GridLayout grid = new GridLayout(rows + 1,cols, 2, 0);
		setLayout(grid);
		validate();
	}


	/**
	 * @return the headerButtonsArray
	 */
	public ArrayList <JButton> getHeaderButtonsArray() {
		return headerButtonsArray;
	}

	/**
	 * @param headerButtonsArray the headerButtonsArray to set
	 */
	public void setHeaderButtonsArray(ArrayList <JButton> headerButtonsArray) {
		this.headerButtonsArray = headerButtonsArray;
	}

	/**
	 * @return the theButtonsArray
	 */
	public ArrayList <JButton> getTheButtonsArray() {
		return theButtonsArray;
	}

	/**
	 * @param theButtonsArray the theButtonsArray to set
	 */
	public void setTheButtonsArray(ArrayList <JButton> theButtonsArray) {
		this.theButtonsArray = theButtonsArray;
	}


	/**
	 * @return the counter
	 */
	public ArrayList getCounter() {
		return counter;
	}

	/**
	 * @param counter the counter to set
	 */
	public void setCounter(ArrayList counter) {
		this.counter = counter;
	}

	/**
	 * @return the defaultColor
	 */
	public Color getDefaultColor() {
		return defaultColor;
	}

	/**
	 * @param defaultColor the defaultColor to set
	 */
	public void setDefaultColor(Color defaultColor) {
		this.defaultColor = defaultColor;
	}
}
