package DemoAWT;

import java.awt.*;

public class DemoOuterClass {
    Frame f;
    Button btn1, btn2;
    Label lb1, lb2;
    public DemoOuterClass(){
        f = new Frame("Testing");
        btn1 = new Button("Click 1");
        btn2 = new Button("Click 2");
        lb1 = new Label("Label 1");
        lb2 = new Label("Label 2");

        OuterEvent outer = new OuterEvent(this);
        btn1.addActionListener(outer);
        btn2.addActionListener(outer);

        f.add(btn1);
        f.add(lb1);
        f.add(btn2);
        f.add(lb2);
        f.setSize(500,200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
