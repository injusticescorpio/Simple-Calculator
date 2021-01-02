package calculator;
import  java.awt.*;
import  java.awt.event.*;
public class calculator implements ActionListener{

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    String s1,s2,s3;
    TextField textField,textField1;
    String result,iresult,jresult,fresult;
    Panel p1;
    char a;
    int math;
    calculator()
    {
        int i;
        Frame frame=new Frame("CALCULATOR");
        Panel p = new Panel();
        Panel p1 = new Panel();
        p.setBounds(0,90,500,500);
        p1.setBounds(0,30,500,80);
        p.setLayout(new GridLayout(4,4));
        p1.setLayout(new GridLayout(1,2));
        frame.setSize(508,600);
        frame.setResizable(false);
        textField=new TextField();
        textField.setBounds(100,90,1,1);
        textField.setBackground(Color.LIGHT_GRAY);
        textField1=new TextField();
        textField1.setBounds(100,90,1,1);
        textField1.setBackground(Color.white);
        textField.setVisible(true);
        textField.setVisible(true);

        p1.add(textField1);
        p1.add(textField);
        p.setBackground(Color.PINK);
        p.setLayout(new GridLayout(4,4));
        Button button[]=new Button[16];
        b0=new Button("7 ");
        b1=new Button("8");
        b2=new Button("9");
        b3=new Button("/");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("X");
        b8=new Button("1");
        b9=new Button("2");
        b10=new Button("3");
        b11=new Button("-");
        b12=new Button("C");
        b13=new Button("=");
        b14=new Button("+");
        b15=new Button("0");
        button[0]=(Button)p.add(b0);
        button[1]=(Button)p.add(b1);
        button[2]=(Button)p.add(b2);
        button[3]=(Button)p.add(b3);
        button[4]=(Button)p.add(b4);
        button[5]=(Button)p.add(b5);
        button[6]=(Button)p.add(b6);
        button[7]=(Button)p.add(b7);
        button[8]=(Button)p.add(b8);
        button[9]=(Button)p.add(b9);
        button[10]=(Button)p.add(b10);
        button[11]=(Button)p.add(b11);
        button[12]=(Button)p.add(b12);
        button[13]=(Button)p.add(b13);
        button[14]=(Button)p.add(b14);
        button[15]=(Button)p.add(b15);
        for (i=0;i<=15;i++)
        {
            button[i].addActionListener(this);
        }
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        p.setVisible(true);
        frame.setVisible(true);
        frame.add(p);
        frame.add(p1);
       // frame.add(textField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b0)
        {
            s1=textField.getText();
            s2="7";
            s3=s1+s2;
            textField.setText(s3);

        }
        if(e.getSource()==b1)
        {
            s1=textField.getText();
            s2="8";
            s3=s1+s2;
            textField.setText(s3);

        }
        if(e.getSource()==b2)
        {
            s1=textField.getText();
            s2="9";
            s3=s1+s2;
            textField.setText(s3);

        }
        if(e.getSource()==b3)
        {
            jresult=textField.getText();
            textField.setText("");
            textField1.setText("");
            a='/';

        }
        if(e.getSource()==b4)
        {
            s1=textField.getText();
            s2="4";
            s3=s1+s2;
            textField.setText(s3);

        }
        if(e.getSource()==b5)
        {
            s1=textField.getText();
            s2="5";
            s3=s1+s2;
            textField.setText(s3);

        }
        if(e.getSource()==b6)
        {
            s1=textField.getText();
            s2="6";
            s3=s1+s2;
            textField.setText(s3);

        }
        if(e.getSource()==b7)
        {
            jresult=textField.getText();
            textField.setText("");
            textField1.setText("");
            a='*';

        }
        if(e.getSource()==b8)
        {
            s1=textField.getText();
            s2="1";
            s3=s1+s2;
            textField.setText(s3);

        }
        if(e.getSource()==b9)
        {
            s1=textField.getText();
            s2="2";
            s3=s1+s2;
            textField.setText(s3);

        }
        if(e.getSource()==b10)
        {
            s1=textField.getText();
            s2="3";
            s3=s1+s2;
            textField.setText(s3);

        }
        if(e.getSource()==b11)
        {
            jresult=textField.getText();
            textField.setText("");
            textField1.setText("");
            a='-';

        }
        if(e.getSource()==b12)
        {
            textField.setText("");
            textField1.setText("");

        }
        if(e.getSource()==b13)
        {
            try {
                iresult=textField.getText();
                System.out.println(jresult);  //for checking error occured in program
                System.out.println(iresult); //for checking error occured in program
                switch (a) {

                    case '+':
                        math=Integer.parseInt(jresult)+Integer.parseInt(iresult);
                        break;

                    case '-':
                        math=Integer.valueOf(jresult)-Integer.valueOf(iresult);
                        break;
                    case '*':
                        math=Integer.valueOf(jresult)*Integer.valueOf(iresult);
                        break;
                    case '/':
                        try {
                            math=Integer.valueOf(jresult)/Integer.valueOf(iresult);
                        } catch (Exception e1) {
                            textField1.setText("invalid format clear data");
                        }
                        break;

                }
                fresult=Integer.toString(math);
                textField1.setText(jresult+""+a+""+iresult+""+"=");
                textField.setText(fresult);

            } catch (Exception e1) {
                textField.setText("invalid format clear data");
            }

        }

        if(e.getSource()==b14)
        {
            jresult=textField.getText();
           textField.setText("");
            textField1.setText("");
           a='+';
        }
        if(e.getSource()==b15)
        {
            s1=textField.getText();
            s2="0";
            s3=s1+s2;
            textField.setText(s3);

        }
    }
    public static void main(String[] args) {

        calculator c=new calculator();
    }
}

