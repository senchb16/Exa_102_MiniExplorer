
import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph
 */
public class Datei extends File {

    @Override
    public String toString() {
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH:mm");
        return String.format("%s %d %s", name,größe/100,änderungsdatum.format(d));
    }
    public Datei(String name, int größe, long modified) {
        super(name);
        this.name = name;
        this.größe = größe;
        this.änderungsdatum = LocalDateTime.ofEpochSecond(modified,0, ZoneOffset.UTC);
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getÄnderungsdatum() {
        return änderungsdatum;
    }

    public int getGröße() {
        return größe;
    }

    public String getAttribut() {
        return attribut;
    }

   
    private String name;
    private LocalDateTime änderungsdatum;
    private int größe;
    private String attribut;
}
