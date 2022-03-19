package View;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class View 
{
	//Initializes all of all the displays to have get and set methods for use in view
	    private InitialFrame inf;

    public View()
    {
	    
    }
    //Calls getlines (firstLineToDisplay, lastLineToDisplay)
    //then calls get headers
    public void CenterUpdate(ArrayList<ArrayList<String>> table, ArrayList<String> headers)
    {
	    inf.getIp().getCp().getCounter().clear();
	    inf.getIp().getCp().row(headers);
	    inf.getIp().getCp().table(table);
	    inf.getIp().getNp().addnp();
	    

	    
    }

 
    //Calls linesBeingDisplayed, and # of headers
    public void CenterInitialSetup(int rows, int cols)
    {
	//creates an instance of initialFrame to set everything in motion
	inf = new InitialFrame();
	inf.getIp().getCp().setGridDimesions(rows, cols);
	inf.getIp().getCp().buildButtons(rows, cols);
	System.out.println("CIS ended");
    }

    public void basicDisplay(String s)
    {
        System.out.println(s);
    }

    public void basicDisplay(ArrayList<String> arr)
    {
        for (String s : arr)
        {
            System.out.print(s + " ");
        }
        System.out.println("");
    }
	public void linesDisplay(ArrayList<ArrayList<String>> arrOfarr) 
	{
		
        for (ArrayList<String> s : arrOfarr)
        {
            basicDisplay(s);
        }
        System.out.println("");
	}

	/**
	 * @return the inf
	 */
	public InitialFrame getInf() {
		return inf;
	}

	/**
	 * @param inf the inf to set
	 */
	public void setInf(InitialFrame inf) {
		this.inf = inf;
	}
	}
