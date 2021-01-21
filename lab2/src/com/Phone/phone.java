package com.Phone;

public class phone {
    int id;
    String surname;
    String name;
    String namedad;
    int numberscore;
    int timecity;
    int timeoutside;

    public phone(int id,String surname,String name,String namedad,
                 int numberscore,int timecity,int timeoutside){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.namedad = namedad;
        this.numberscore = numberscore;
        this.timecity = timecity;
        this.timeoutside = timeoutside;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNamedad() {
        return namedad;
    }
    public void setNamedad(String namedad) {
        this.namedad = namedad;
    }

    public int getNumberscore() {
        return numberscore;
    }
    public void setNumberscore(int numberscore) {
        this.numberscore = numberscore;
    }

    public int getTimecity() {
        return timecity;
    }
    public void setTimecity(int timecity) {
        this.timecity = timecity;
    }

    public int getTimeoutside() {
        return timeoutside;
    }
    public void setTimeoutside(int timeoutside) {
        this.timeoutside = timeoutside;
    }

    @Override
    public String toString() {
        return "\nPhone{" +
                "\nid=" + id +
                ",\nsurname=" + surname +
                ",\nname=" + name +
                ",\nnamedad=" + namedad +
                ",\nnumberscore=" + numberscore +
                ",\ntimecity=" + timecity +
                ",\ntimeoutside=" + timeoutside +
                '}';
    }
}
