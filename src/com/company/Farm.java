package com.company;

import java.util.Arrays;

public class Farm  {
    private String adress;
    private Cow[]cows;
    private Hors[] horses;
    private Sheep[] sheeps;
    private String owerName;

    public Farm(String adress, Cow[] cows, Hors[] horses, Sheep[] sheeps, String owerName) {
        this.adress = adress;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
        this.owerName = owerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Hors[] getHorses() {
        return horses;
    }

    public void setHorses(Hors[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public String getOwerName() {
        return owerName;
    }

    public void setOwerName(String owerName) {
        this.owerName = owerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "adress='" + adress + '\'' +
                ", \ncows=\n" + Arrays.toString(cows) +
                ",\n horses=\n" + Arrays.toString(horses) +
                ",\n sheeps=\n" + Arrays.toString(sheeps) +
                ",\n owerName=" + owerName + '\'' +
                '}';
    }
}
