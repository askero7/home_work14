public class Singer extends Person{
    private String bandName;
    private String singing;
    private String playGuitar;

    public Singer(String name, String designation,String bandName, String learn, String walk,String eat, String singing, String playGuitar) {
        super(name, designation, learn, walk, eat);
        this.bandName = bandName;
        this.singing = singing;
        this.playGuitar = playGuitar;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getSinging() {
        return singing;
    }

    public void setSinging(String singing) {
        this.singing = singing;
    }

    public String getPlayGuitar() {
        return playGuitar;
    }

    public void setPlayGuitar(String playGuitar) {
        this.playGuitar = playGuitar;
    }

    @Override
    public String toString() {
        return "Singer" + " " +
                "name:"+getName() + " "+
                "designation:"+getDesignation() + " " +
                "bandName:"+getBandName()+ " "+
                "learn:"+getLearn()+ " "+
                "walk:"+getWalk()+ " "+
                "eat"+getEat()+" "+
                "singing:"+getSinging()+ " "+
                "playGuitar:"+getPlayGuitar();
    }
}
