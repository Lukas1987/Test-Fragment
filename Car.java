package sk.itsovy.mati;

public class Car {
    private String type;
    private String mark;
    private String licencenumber;

    public Car() { // bezparametricky konstructor

    }
    public Car(String type, String mark, String licencenumber) {
        this.type=type;
        this.mark = mark;
        this.licencenumber = licencenumber;

    }
    public String getType() {
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark=mark;
    }
    public String getLicencenumber() {
        return licencenumber;
    }
    public void setLicencenumber(String licencenumber) {
        this.licencenumber=licencenumber;
    }


}
