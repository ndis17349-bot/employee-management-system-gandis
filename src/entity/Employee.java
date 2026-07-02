package entity;

public class Employee {

    private int id;
    private String name;
    private String email;

    private int divisionId;
    private int positionId;

    public Employee(){}

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public int getDivisionId(){
        return divisionId;
    }

    public void setDivisionId(int divisionId){
        this.divisionId=divisionId;
    }

    public int getPositionId(){
        return positionId;
    }

    public void setPositionId(int positionId){
        this.positionId=positionId;
    }

}