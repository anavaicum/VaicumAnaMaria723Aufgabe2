package Model;

import java.util.ArrayList;
import java.util.List;

public class Vereine implements HasID {
    private int id;
    private String name;
    private String stadt;
    private List<Vereine> spielerList;

    public Vereine(int id, String name, String stadt) {
        this.id = id;
        this.name = name;
        this.stadt = stadt;
        this.spielerList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public List<Vereine> getSpielerList() {
        return spielerList;
    }

    public void setSpielerList(List<Vereine> spielerList) {
        this.spielerList = spielerList;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vereine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stadt='" + stadt + '\'' +
                ", spielerList=" + spielerList +
                '}';
    }

}

