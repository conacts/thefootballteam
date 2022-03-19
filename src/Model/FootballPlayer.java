
package Model;
import java.util.ArrayList;

public class FootballPlayer extends Person implements TableMember  
{


    private int number;
    private String position;
    
    public FootballPlayer(int jnum, String fposition)  
    {
        number = jnum;
        position = fposition;
    }
    
    
    
    public FootballPlayer() {
        super.getName();
        super.getHeight();
        super.getWeight();
        super.getHometown();
        super.getHighSchool();
        number = this.number;
    }
    
    
    @Override
    public String getAttribute(int n) 
    {
        return getAttributes().get(n);
    }
    
    @Override
    public ArrayList<String> getAttributes() 
    {
	    ArrayList <String> atts = new ArrayList();
	    atts.add(String.valueOf(getNumber()));
	    atts.add(getPosition());
	    atts.add(super.getName());
	    atts.add(super.getHeight().toString());
	    atts.add(String.valueOf(super.getWeight()));
	    atts.add(super.getHometown());
	    atts.add(super.getHighSchool());
        return atts;
    }
    
    @Override
    public String getAttributeName(int n){
        return getAttributeNames().get(n);
    }
    
    @Override
    public ArrayList<String> getAttributeNames() {
    ArrayList<String> attNames = new ArrayList();
	    attNames.add("number ");
	    attNames.add("position ");
	    attNames.add("name ");
	    attNames.add("height ");
	    attNames.add("weight ");
	    attNames.add("hometown ");
	    attNames.add("highschool ");
	    return attNames;
    }
    
    // toString( ) overrides the superclass Object toString( ) method
    @Override
    public String toString() {
        return getNumber() + getPosition() + super.toString();
    }
    
    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    } 

  
}
