package vttp.ssf.day18.models;

public class Carpark {
    
    private int id;
    private String carpark;
    private String category;
    private String weekday1;
    private String weekday2;
    private String saturdayRate;
    private String sundayPhRate;

    
    public Carpark(){

    }
    
    public Carpark(int id, String carpark, String category, String weekday1, String weekday2, String saturdayRate,
            String sundayPhRate) {
        this.id = id;
        this.carpark = carpark;
        this.category = category;
        this.weekday1 = weekday1;
        this.weekday2 = weekday2;
        this.saturdayRate = saturdayRate;
        this.sundayPhRate = sundayPhRate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCarpark() {
        return carpark;
    }
    public void setCarpark(String carpark) {
        this.carpark = carpark;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getWeekday1() {
        return weekday1;
    }
    public void setWeekday1(String weekday1) {
        this.weekday1 = weekday1;
    }
    public String getWeekday2() {
        return weekday2;
    }
    public void setWeekday2(String weekday2) {
        this.weekday2 = weekday2;
    }
    public String getSaturdayRate() {
        return saturdayRate;
    }
    public void setSaturdayRate(String saturdayRate) {
        this.saturdayRate = saturdayRate;
    }
    public String getSundayPhRate() {
        return sundayPhRate;
    }
    public void setSundayPhRate(String sundayPhRate) {
        this.sundayPhRate = sundayPhRate;
    }
    @Override
    public String toString() {
        return "Carpark [id=" + id + ", carpark=" + carpark + ", category=" + category + ", weekday1=" + weekday1
                + ", weekday2=" + weekday2 + ", saturdayRate=" + saturdayRate + ", sundayPhRate=" + sundayPhRate + "]";
    }

    

    
}
