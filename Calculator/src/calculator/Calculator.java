package calculator;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener{
    JTextField res;
    JLabel l;
    JRadioButton on,off;
    ButtonGroup grp;
    JButton btn[]=new JButton[21];
    double a=0,b=0,result=0;
    int calc=0;
    Calculator(){
        super("Calculator");
        setSize(380,550);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        res=new JTextField();
        res.setEditable(false);
        res.setBounds(15,60,340,40);
        res.setBackground(Color.WHITE);
        res.setFont(new Font("System",Font.BOLD,20));
        res.setHorizontalAlignment(SwingConstants.RIGHT);
        add(res);
        
        l=new JLabel();
        l.setForeground(Color.WHITE);
        l.setFont(new Font("System",Font.ITALIC,14));
        l.setBounds(280,20,50,30);
        add(l);
        
        grp=new ButtonGroup();
        on=new JRadioButton("ON");
        on.setForeground(Color.WHITE);
        on.setFocusable(false);
        on.setBounds(15,120,60,20);
        on.setFont(new Font("System",Font.BOLD,16));
        on.setBackground(Color.BLACK);
        grp.add(on);
        on.setSelected(true);
        add(on);
        
        off=new JRadioButton("OFF");
        off.setForeground(Color.WHITE);
        off.setFocusable(false);
        off.setBounds(15,150,60,20);
        off.setFont(new Font("System",Font.BOLD,16));
        off.setBackground(Color.BLACK);
        grp.add(off);
        add(off);
        on.addActionListener(this);
        off.addActionListener(this);
        
        btn[10]=new JButton("C");
        btn[10].setFont(new Font("System",Font.BOLD,20));
        btn[10].setBackground(Color.red);
        btn[10].setForeground(Color.WHITE);
        btn[10].setBounds(100,125,75,40);
        btn[10].setFocusable(false);
        add(btn[10]);
        
        btn[11]=new JButton("Del");
        btn[11].setFont(new Font("System",Font.BOLD,20));
        btn[11].setBackground(Color.red);
        btn[11].setForeground(Color.WHITE);
        btn[11].setBounds(190,125,75,40);
        btn[11].setFocusable(false);
        add(btn[11]);
        
        btn[12]=new JButton("+");
        btn[12].setFont(new Font("System",Font.BOLD,20));
        btn[12].setBackground(Color.YELLOW);
        btn[12].setBounds(280,125,75,40);
        btn[12].setFocusable(false);
        add(btn[12]);
        
        btn[13]=new JButton("x\u00B2");
        btn[13].setFont(new Font("System",Font.BOLD,20));
        btn[13].setBounds(15,190,75,40);
        btn[13].setFocusable(false);
        add(btn[13]);
        
        btn[14]=new JButton("1/x");
        btn[14].setFont(new Font("System",Font.BOLD,20));
        btn[14].setBounds(100,190,75,40);
        btn[14].setFocusable(false);
        add(btn[14]);
        
        btn[15]=new JButton("\u221A");
        btn[15].setFont(new Font("System",Font.BOLD,20));
        btn[15].setBounds(190,190,75,40);
        btn[15].setFocusable(false);
        add(btn[15]);
        
        btn[16]=new JButton("-");
        btn[16].setFont(new Font("System",Font.BOLD,20));
        btn[16].setBackground(Color.YELLOW);
        btn[16].setBounds(280,190,75,40);
        btn[16].setFocusable(false);
        add(btn[16]);
        
        btn[7]=new JButton("7");
        btn[7].setFont(new Font("System",Font.BOLD,20));
        btn[7].setBounds(15,250,75,40);
        btn[7].setFocusable(false);
        add(btn[7]);
        
        btn[8]=new JButton("8");
        btn[8].setFont(new Font("System",Font.BOLD,20));
        btn[8].setBounds(100,250,75,40);
        btn[8].setFocusable(false);
        add(btn[8]);
        
        btn[9]=new JButton("9");
        btn[9].setFont(new Font("System",Font.BOLD,20));
        btn[9].setBounds(190,250,75,40);
        btn[9].setFocusable(false);
        add(btn[9]);
        
        btn[17]=new JButton("X");
        btn[17].setFont(new Font("System",Font.BOLD,20));
        btn[17].setBackground(Color.YELLOW);
        btn[17].setBounds(280,250,75,40);
        btn[17].setFocusable(false);
        add(btn[17]);
        
        btn[4]=new JButton("4");
        btn[4].setFont(new Font("System",Font.BOLD,20));
        btn[4].setBounds(15,310,75,40);
        btn[4].setFocusable(false);
        add(btn[4]);
        
        btn[5]=new JButton("5");
        btn[5].setFont(new Font("System",Font.BOLD,20));
        btn[5].setBounds(100,310,75,40);
        btn[5].setFocusable(false);
        add(btn[5]);
        
        btn[6]=new JButton("6");
        btn[6].setFont(new Font("System",Font.BOLD,20));
        btn[6].setBounds(190,310,75,40);
        btn[6].setFocusable(false);
        add(btn[6]);
        
        btn[18]=new JButton("/");
        btn[18].setFont(new Font("System",Font.BOLD,20));
        btn[18].setBackground(Color.YELLOW);
        btn[18].setBounds(280,310,75,40);
        btn[18].setFocusable(false);
        add(btn[18]);
        
        btn[1]=new JButton("1");
        btn[1].setFont(new Font("System",Font.BOLD,20));
        btn[1].setBounds(15,370,75,40);
        btn[1].setFocusable(false);
        add(btn[1]);
        
        btn[2]=new JButton("2");
        btn[2].setFont(new Font("System",Font.BOLD,20));
        btn[2].setBounds(100,370,75,40);
        btn[2].setFocusable(false);
        add(btn[2]);
        
        btn[3]=new JButton("3");
        btn[3].setFont(new Font("System",Font.BOLD,20));
        btn[3].setBounds(190,370,75,40);
        btn[3].setFocusable(false);
        add(btn[3]);
        
        btn[19]=new JButton("=");
        btn[19].setFont(new Font("System",Font.BOLD,20));
        btn[19].setBackground(Color.YELLOW);
        btn[19].setBounds(280,370,75,110);
        btn[19].setFocusable(false);
        add(btn[19]);
        
        btn[0]=new JButton("0");
        btn[0].setFont(new Font("System",Font.BOLD,20));
        btn[0].setBounds(15,440,155,40);
        btn[0].setFocusable(false);
        add(btn[0]);
        
        btn[20]=new JButton(".");
        btn[20].setFont(new Font("System",Font.BOLD,20));
        btn[20].setBounds(190,440,75,40);
        btn[20].setFocusable(false);
        add(btn[20]);
        
        for(JButton i:btn)
            i.addActionListener(this);
        
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==off){
           for(JButton i:btn)
                i.setEnabled(false);
           res.setEnabled(false);
           l.setEnabled(false);
        }
        if(e.getSource()==on){
            for(JButton i:btn)
                i.setEnabled(true);
            res.setEnabled(true);
            l.setEnabled(true);
        }
        if(e.getSource()==btn[10]){
            res.setText("");
            l.setText("");
        }
        for(int i=0;i<10;i++){
            if(e.getSource()==btn[i])
                res.setText(res.getText()+i);
        }
        if(e.getSource()==btn[11]){
            int len=res.getText().length();
            int pos=len-1;
            StringBuilder str=new StringBuilder(res.getText());
            str.deleteCharAt(pos);
            res.setText(str.toString());
        }
        if(e.getSource()==btn[20]){
            if(res.getText().contains("."))
                return;
            else
                res.setText(res.getText()+".");
        }
        if(e.getSource()==btn[12]&& !res.getText().equals("")){
            String str=res.getText();
            a=Double.parseDouble(res.getText());
            calc=1;
            l.setText(str+"+");
            res.setText("");
        }else if(e.getSource()==btn[16]&& !res.getText().equals("")){
            String str=res.getText();
            a=Double.parseDouble(res.getText());
            calc=2;
            l.setText(str+"-");
            res.setText("");
        }else if(e.getSource()==btn[17]&& !res.getText().equals("")){
            String str=res.getText();
            a=Double.parseDouble(res.getText());
            calc=3;
            l.setText(str+"x");
            res.setText("");
        }else if(e.getSource()==btn[18]&& !res.getText().equals("")){
            String str=res.getText();
            a=Double.parseDouble(res.getText());
            calc=4;
            l.setText(str+"/");
            res.setText("");
        }else if(e.getSource()==btn[13]&& !res.getText().equals("")){
            String str=res.getText();
            double val=Double.parseDouble(res.getText());
            val*=val;
            if(Double.toString(val).endsWith(".0"))
                    res.setText(String.valueOf(val).replace(".0", ""));
            else
                    res.setText(String.valueOf(val));
        }else if(e.getSource()==btn[15]&& !res.getText().equals("")){
            String str=res.getText();
            double val=Double.parseDouble(res.getText());
            val=Math.sqrt(val);
            if(Double.toString(val).endsWith(".0"))
                    res.setText(String.valueOf(val).replace(".0", ""));
            else
                    res.setText(String.valueOf(val));
        }else if(e.getSource()==btn[14]&& !res.getText().equals("")){
            String str=res.getText();
            double val=Double.parseDouble(res.getText());
            val=1/val;
            if(Double.toString(val).endsWith(".0"))
                    res.setText(String.valueOf(val).replace(".0", ""));
            else
                    res.setText(String.valueOf(val));
        }else if(e.getSource()==btn[19] && !res.getText().equals("")){
            b=Double.parseDouble(res.getText());
            switch(calc){
                case 1:
                    result=a+b;
                    break;
                case 2:
                    result=a-b;
                    break;
                case 3:
                    result=a*b;
                    break;
                case 4:
                    result=a/b;
                    break;
            }
            if(Double.toString(result).endsWith(".0"))
                res.setText(Double.toString(result).replace(".0", ""));
            else
                res.setText(Double.toString(result));
            l.setText("");
        }
    }
    public static void main(String[] args) {
        new Calculator();
    }
    
}
