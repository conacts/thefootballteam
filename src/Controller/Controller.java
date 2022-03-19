package Controller;

import Model.Model;
import View.View;
import java.awt.event.*;
import java.util.ArrayList;

public class Controller {

	Model model;
	View view;

	public Controller(View v, Model m) {
		model = m;
		view = v;

		view.CenterInitialSetup(model.getFpData().getLinesBeingDisplayed(), model.getFpData().getHeaders().size()); 
		view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders()); //adds the data from start line to end line
		
		view.getInf().revalidate();
		view.getInf().repaint();

		this.addListners();
	}

	private void addListners()
	{
		view.getInf().getIp().getCp().addMouseWheelListener(
			new MouseWheelListener()
			{
				int z;
				int ScrollLineStart;
				int ScrollLineEnd;
				int ll = model.getFpData().getLastLineToDisplay();
				int fl = model.getFpData().getFirstLineToDisplay();
				ArrayList <Integer> UnitWheel = new ArrayList();
				
				@Override
		public void mouseWheelMoved(MouseWheelEvent e) 
		{
				int UnitsToScroll = e.getUnitsToScroll();
				int WheelRotation = e.getWheelRotation();
				
				System.out.println(UnitsToScroll  + "<----->" + WheelRotation); // add first and last lines to display
				z = z + UnitsToScroll;
				System.out.println("This is z: " + z);
		
				ScrollLineStart = fl + z;
				if (ScrollLineStart < 0)
				{
					ScrollLineStart = Math.abs(ll + z - 1) % ll;
				}
				else if (ScrollLineStart >= ScrollLineEnd)
				{
					ScrollLineStart = (ll + z - 1) % ll;
				}
				System.out.println("Start: " + ScrollLineStart);
					System.out.println("Last Line " + ll);
					System.out.println((fl +  ll -1) % ll);
				ScrollLineEnd = (fl + ll -1) % ll;
				view.CenterUpdate(model.getFpData().getLines(ScrollLineStart,ScrollLineEnd), model.getFpData().getHeaders()); 
		}
			});

						view.getInf().getIp().getNp().getSearch_bar().addActionListener(
		new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{	
					System.out.println("enter has been presned");
					System.out.println(view.getInf().getIp().getNp().getSearch_bar().getText());
					System.out.println(model.getFpData().getLine(4));
					boolean theSearch = model.getFpData().search(view.getInf().getIp().getNp().getSearch_bar().getText());
					if (theSearch == true)
					{
						System.out.println("you hit my guy");
					}
					if(theSearch != false)
					{
						System.out.println("you didn't hti");
					}
				view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
				}
				
			}
		);
						
		view.getInf().getIp().getCp().getTheButtonsArray().get(0).addActionListener(
		new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{	
				java.awt.Color awtColor = java.awt.Color.white;
				view.getInf().getIp().repaint();
				for (int t = 0; t<7; t++)
				view.getInf().getIp().getCp().getTheButtonsArray().get(t).setBackground(view.getInf().getIp().getCp().getDefaultColor());
				view.getInf().getIp().getCp().getTheButtonsArray().get(0).setBackground(awtColor);
				model.getFpData().SetSortField(0);				
				model.getFpData().sort("sortPlayersByNum");
				view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
				}
			}
		);
				view.getInf().getIp().getCp().getTheButtonsArray().get(1).addActionListener(
		new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{	
				java.awt.Color awtColor = java.awt.Color.white;
				view.getInf().getIp().repaint();
				for (int t = 0; t<7; t++)
				view.getInf().getIp().getCp().getTheButtonsArray().get(t).setBackground(view.getInf().getIp().getCp().getDefaultColor());
				view.getInf().getIp().getCp().getTheButtonsArray().get(1).setBackground(awtColor);
				model.getFpData().SetSortField(1);				
				model.getFpData().sort("sortPlayersByStr");
				view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
				}
			}
		);
				view.getInf().getIp().getCp().getTheButtonsArray().get(2).addActionListener(
		new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{	
				java.awt.Color awtColor = java.awt.Color.white;
				view.getInf().getIp().repaint();
				for (int t = 0; t<7; t++)
				view.getInf().getIp().getCp().getTheButtonsArray().get(t).setBackground(view.getInf().getIp().getCp().getDefaultColor());
				view.getInf().getIp().getCp().getTheButtonsArray().get(2).setBackground(awtColor);
				model.getFpData().SetSortField(2);				
				model.getFpData().sort("sortPlayersByStr");
				view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
				}
			}
		);
				view.getInf().getIp().getCp().getTheButtonsArray().get(3).addActionListener(
		new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{	
				java.awt.Color awtColor = java.awt.Color.white;
				view.getInf().getIp().repaint();
				for (int t = 0; t<7; t++)
				view.getInf().getIp().getCp().getTheButtonsArray().get(t).setBackground(view.getInf().getIp().getCp().getDefaultColor());
				view.getInf().getIp().getCp().getTheButtonsArray().get(3).setBackground(awtColor);
				model.getFpData().SetSortField(3);			
				model.getFpData().sort("sortPlayersByNum");
				view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
				}
			}
		);
				view.getInf().getIp().getCp().getTheButtonsArray().get(4).addActionListener(
		new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{	
				java.awt.Color awtColor = java.awt.Color.white;
				view.getInf().getIp().repaint();
				for (int t = 0; t<7; t++)
				view.getInf().getIp().getCp().getTheButtonsArray().get(t).setBackground(view.getInf().getIp().getCp().getDefaultColor());
				view.getInf().getIp().getCp().getTheButtonsArray().get(4).setBackground(awtColor);
				model.getFpData().SetSortField(4);				
				model.getFpData().sort("sortPlayersByStr");
				view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
				}
			}
		);
				view.getInf().getIp().getCp().getTheButtonsArray().get(5).addActionListener(
		new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{	
				java.awt.Color awtColor = java.awt.Color.white;
				view.getInf().getIp().repaint();
				for (int t = 0; t<7; t++)
				view.getInf().getIp().getCp().getTheButtonsArray().get(t).setBackground(view.getInf().getIp().getCp().getDefaultColor());
				view.getInf().getIp().getCp().getTheButtonsArray().get(5).setBackground(awtColor);
				model.getFpData().SetSortField(5);
				model.getFpData().sort("sortPlayersByStr");
				view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
				}
			}
		);
				view.getInf().getIp().getCp().getTheButtonsArray().get(6).addActionListener(
		new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{	
				java.awt.Color awtColor = java.awt.Color.white;
				view.getInf().getIp().repaint();
				for (int t = 0; t<7; t++)
				view.getInf().getIp().getCp().getTheButtonsArray().get(t).setBackground(view.getInf().getIp().getCp().getDefaultColor());
				view.getInf().getIp().getCp().getTheButtonsArray().get(6).setBackground(awtColor);
				model.getFpData().SetSortField(6);
				model.getFpData().sort("sortPlayersByStr");
				view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
				}
			}
		);

	}
}

