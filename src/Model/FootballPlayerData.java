package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FootballPlayerData implements TableData, Displayable, Sortable, Searchable {

	private ArrayList<TableMember> players;
	private int sortField;

	public FootballPlayerData() {
		players = new ArrayList<>();
		loadTable();
	}

  public boolean search(String searchTerm)
  {
	  boolean out  = false;
	
	  for (int y = 0; y < players.size(); y++)
		  for (int i = 0; i > 7; i++)
		  {
			  if (searchTerm == players.get(y).getAttribute(i))
			  {
				  out = true;
				  System.out.println("you hit");
			  }
			  else
			  {
				  System.out.println("you failed");
			  }
		  
	  }
	  return out;
  }

  public int getFoundIndex()
  {
	  return 4;
  }
  public void setFoundIndex(int tableMemberindex)
  {
	  this.setFoundIndex(tableMemberindex);
  }

  public boolean getFound()
  {
	  return true;
  }
  
  public void setFound(boolean searchResult)
  {
	  this.setFound(searchResult);
  }

  public int getSearchByField()
  {
	return 4;
  }
  
  public void setSearchByField(int fieldIndex)
  {
	  this.setSearchByField(fieldIndex);
  }
  
	public void sort(String task) {
		getSortField();
		Collections.shuffle(players);
		System.out.println("Shuffled");

		Comparator<TableMember> sortPlayersByStr = new Comparator<TableMember>() {
			@Override
			public int compare(TableMember p1, TableMember p2) {

				if (Character.isDigit(p1.getAttribute(sortField).charAt(0)) == true) {
					String aNum = extractDigits(p1.getAttribute(sortField));
					String aNum2 = extractDigits(p2.getAttribute(sortField));

					int theNum = 0;
					if (Double.parseDouble(aNum) < Double.parseDouble(aNum2)) {
						theNum = -1;
					} else if (Double.parseDouble(aNum) == Double.parseDouble(aNum2)) {
						theNum = 0;
					} else if (Double.parseDouble(aNum) > Double.parseDouble(aNum2)) {
						theNum = 1;
					}
					return theNum;
				} else {
					return p1.getAttribute(getSortField()).compareTo(p2.getAttribute(getSortField()));
				}
			}
		};
		Collections.sort(players, sortPlayersByStr);
		System.out.println("sorted");
	}

	String extractDigits(String input) 
	{
		char[] chars = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		int count = 0;
		
		for (char c : chars) 
		{
			if (c == '\'')
			{
				sb.append(".");
				System.out.println("found '");
			}
			if (Character.isDigit(c)) 
			{
				sb.append(c);

			}
			if (c =='\"')
				System.out.println("found \"");
			count++;
			System.out.println(c);

		}
		String end = sb.toString();
		System.out.println(end);
		int integerPlaces = end.indexOf('.');
		int decimalPlaces = end.length() - integerPlaces - 1;
	
		if (decimalPlaces == 1)
		{
			System.out.println("hit");
			end = end.replace(".", ".0");
			System.out.println(end);
		}
		
		return end;
	}

	public int getSortField() {
		return sortField;
	}

	public void SetSortField(int sortField) {
		this.sortField = sortField;
	}

	@Override
	public int getFirstLineToDisplay() {
		return players.size() - players.size();
	}

	@Override
	public int getLineToHighlight() {
		return 0;
	}

	@Override
	public int getLastLineToDisplay() {
		return players.size();
	}

	@Override
	public int getLinesBeingDisplayed() {
		return getLastLineToDisplay() - getFirstLineToDisplay();
	}

	public void setFirstLineToDisplay(int firstLine) {
		this.setFirstLineToDisplay(firstLine);
	}

	public void setLineToHighlight(int highlightedLine) {
		this.setLineToHighlight(highlightedLine);
	}

	public void setLastLineToDisplay(int lastLine) {
		this.setLastLineToDisplay(lastLine);
	}

	public void setLinesBeingDisplayed(int numberOfLines) {
		this.setLinesBeingDisplayed(numberOfLines);
	}

	@Override
	public void loadTable() {
		ReadPlayersFromXML();
	}

	public ArrayList<TableMember> getTable() {
		return players;
	}

	public ArrayList<String> getHeaders() {
		return players.get(1).getAttributeNames();
	}

	public ArrayList<String> getLine(int line) {
		return players.get(line).getAttributes();
	}

	@Override
	public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
		ArrayList<ArrayList<String>> LineArray = new ArrayList<ArrayList<String>>();
		int i = firstLine;
		while (i != lastLine) {
			LineArray.add(getLine(i));
			i++;
		}
		return LineArray;
	}

	public void ReadPlayersFromXML() {
		try {
			FootballPlayer fp;
			XMLDecoder decoder;
			decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
			fp = new FootballPlayer();
			while (fp != null) {
				try {
					fp = (FootballPlayer) decoder.readObject();
					players.add(fp);

				} catch (ArrayIndexOutOfBoundsException theend) {
					//System.out.println("end of file");
					break;
				}
			}
			decoder.close();
		} catch (Exception xx) {
			xx.printStackTrace();
		}
	}
}
