package Model;

import java.util.ArrayList;

public class Model
{

    private FootballPlayerData fpData;

    public Model()
    {
        fpData = new FootballPlayerData();
    }

    public FootballPlayerData getFpData()
    {
        return fpData;
    }

    public void setFpData(FootballPlayerData fpd)
    {
        this.fpData = fpd;
    }
}
