
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominik
 */
public class AppointmentModell extends AbstractListModel{
    private ArrayList<Appointment> appointments = new ArrayList<>();
       
    public void add(Appointment a){
        appointments.add(a);
        fireIntervalAdded(this, this.getSize()-1, this.getSize()-1);
    }
    
    public void delete(int i){
        appointments.remove(i);
        fireContentsChanged(this, 0, this.getSize()-1);
    }
    
    @Override
    public int getSize() {
        return appointments.size();
    }

    @Override
    public Object getElementAt(int i) {
        return appointments.get(i);
    }
    
}
