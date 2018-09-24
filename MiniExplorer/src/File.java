
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph
 */
public class File {

    public String getName() {
        return name;
    }

    public Date getÄnderungsdatum() {
        return änderungsdatum;
    }

    public int getGröße() {
        return größe;
    }

    public String getAttribut() {
        return attribut;
    }

    public File(String name, Date änderungsdatum, int größe, String attribut) {
        this.name = name;
        this.änderungsdatum = änderungsdatum;
        this.größe = größe;
        this.attribut = attribut;
    }
    private String name;
    private Date änderungsdatum;
    private int größe;
    private String attribut;
}
