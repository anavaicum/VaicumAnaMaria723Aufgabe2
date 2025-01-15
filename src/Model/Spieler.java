package Model;

import java.util.ArrayList;
import java.util.List;

public class Spieler implements HasID{
    private String name;
    private Integer alter;
    private String position;
    private Integer marktwert;

    public Spieler(String name, Integer alter, String position, Integer marktwert) {
       this.name = name;
       this.alter = alter;
       this.position = position;
       this.marktwert = marktwert;
    }



    public Integer getAlter() {return alter;}
    public void setAlter(Integer alter) {this.alter = alter;}

    public String getPosition() {return position;}
    public void setPosition(String position) {this.position = position;}

    public Integer getMarktwert() {return marktwert;}
    public void setMarktwert(Integer marktwert) {this.marktwert = marktwert;}


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Spieler{" +
                "name=" + name+
                ", alter='" + alter + '\'' +
                ", position='" + position + '\'' +
                ", marktwer=" + marktwert +
                '}';
    }
}
