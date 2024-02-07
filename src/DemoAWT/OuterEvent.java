package DemoAWT;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuterEvent implements ActionListener {
    DemoOuterClass obj;
    public OuterEvent(DemoOuterClass obj){
        this.obj= obj;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==obj.btn1){
            obj.lb1.setText("Clicked 1");
        } else if (e.getSource()==obj.btn2) {
            obj.lb2.setText("Clicked 2");
        }
    }
}
