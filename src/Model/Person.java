package Model;

class Person {

    //attributes
    private String name;
    Height height;
    private int weight;
    private String hometown;
    private String highSchool;
    

    //parameter
    Person(String localName, Height localHeight, int localWeight, String localHometown, String localHighSchool) {
        name = localName;
        height = localHeight;
        weight = localWeight;
        hometown = localHometown;
        highSchool = localHighSchool;
    }

    //no parameter
    Person() {
        name = "";
        height = new Height();
        weight = 0;
        hometown = "N/A";
        highSchool = "N/A";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the hometown
     */
    public String getHometown() {
        return hometown;
    }

    /**
     * @param hometown the hometown to set
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    /**
     * @return the highSchool
     */
    public String getHighSchool() {
        return highSchool;
    }

    /**
     * @param highSchool the highSchool to set
     */
    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    //getString
    @Override
    public String toString() {
        return "Person{" + "name=" + getName() + ", height=" + getHeight().toString() + ", weight=" + getWeight() + ", hometown=" + getHometown() + ", highSchool=" + getHighSchool() + "}";
    }

    public String getPlayerDetails() {
        return "";
    }

    /**
     * @return the height
     */
    public Height getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Height height) {
        this.height = height;
    }
}
