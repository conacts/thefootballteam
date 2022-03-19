
package Model;
public class Height 
{

    private int feet;
    private int inches;    

    public Height(int feet, int inches) 
    {
        this.feet = feet;
        this.inches = inches;
    } 
    
    public Height() 
    {
        feet = 0;
        inches = 0;   
    }
    @Override
    public String toString() 
    {
        return getFeet() + "\'" + getInches() + "\"";
    }
    /**
     * @return the feet
     */
    public int getFeet() 
    {
        return feet;
    }

    /**
     * @param feet the feet to set
     */
    public void setFeet(int feet) 
    {
        this.feet = feet;
    }

    /**
     * @return the inches
     */
    public int getInches() 
    {
        return inches;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(int inches) 
    {
        this.inches = inches;
    }
    
}