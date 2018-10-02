/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominik
 */
public class Appointment {
    private int tag;
    private int monat;
    private int jahr;
    private int stunde;
    private int minute;
    private String text;

    public Appointment(int tag, int monat, int jahr, int stunde, int minute, String text) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
        this.stunde = stunde;
        this.minute = minute;
        this.text = text;
    }

    public int getTag() {
        return tag;
    }

    public int getMonat() {
        return monat;
    }

    public int getJahr() {
        return jahr;
    }

    public int getStunde() {
        return stunde;
    }

    public int getMinute() {
        return minute;
    }

    public String getText() {
        return text;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public void setStunde(int stunde) {
        this.stunde = stunde;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public String toString(){
        return String.format("%d.%d.%d - %d.%d --> %s",tag,monat,jahr,stunde,minute,text);
    }
}
