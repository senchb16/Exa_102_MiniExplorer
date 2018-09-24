
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph
 */
public class DateiBL extends AbstractListModel {
    ArrayList<Datei> files = new ArrayList<Datei>();
    
    
    public void add(Datei e){
        files.add(e);
        fireIntervalAdded(this, files.size()-1, files.size()-1);
    }
    @Override
    public int getSize() {
       return files.size();
    }

    @Override
    public Object getElementAt(int i) {
        return files.get(i);
    }
}
