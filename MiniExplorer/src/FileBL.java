
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
public class FileBL extends AbstractListModel {
    ArrayList<File> files = new ArrayList<File>();

    @Override
    public int getSize() {
       return files.size();
    }

    @Override
    public Object getElementAt(int i) {
        return files.get(i);
    }
}
