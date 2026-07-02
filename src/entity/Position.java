package entity;

public class Position {

    private int id;
    private String positionName;
    private int levelPosition;

    public Position(){}

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getPositionName(){
        return positionName;
    }

    public void setPositionName(String positionName){
        this.positionName=positionName;
    }

    public int getLevelPosition(){
        return levelPosition;
    }

    public void setLevelPosition(int levelPosition){
        this.levelPosition=levelPosition;
    }

}