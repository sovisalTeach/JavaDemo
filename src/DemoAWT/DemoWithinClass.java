package DemoAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoWithinClass implements ActionListener{
    Frame f;
    Button btn1, btn2;
    Label lb1, lb2;
    public DemoWithinClass(){
        f = new Frame("Testing");
        btn1 = new Button("Click 1");
        btn2 = new Button("Click 2");
        lb1 = new Label("Label 1");
        lb2 = new Label("Label 2");

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        f.add(btn1);
        f.add(lb1);
        f.add(btn2);
        f.add(lb2);
        f.setSize(500,200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            lb1.setText("Clicked 1");
        } else if (e.getSource()==btn2) {
            lb2.setText("Clicked 2");
        }
    }
}
