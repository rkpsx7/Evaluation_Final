package com.example.evaluation_final;

public class Model {
    String date,positive,negative,hospitalised,onVentilation,death,dateChecked;

    public Model(String date, String positive, String negative, String hospitalised, String onVentilation, String death, String dateChecked) {
        this.date = date;
        this.positive = positive;
        this.negative = negative;
        this.hospitalised = hospitalised;
        this.onVentilation = onVentilation;
        this.death = death;
        this.dateChecked = dateChecked;
    }

    public String getDate() {
        return date;
    }

    public String getPositive() {
        return positive;
    }

    public String getNegative() {
        return negative;
    }

    public String getHospitalised() {
        return hospitalised;
    }

    public String getOnVentilation() {
        return onVentilation;
    }

    public String getDeath() {
        return death;
    }

    public String getDateChecked() {
        return dateChecked;
    }
}
