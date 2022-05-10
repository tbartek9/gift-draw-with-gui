package drawApp;

import java.util.concurrent.TimeUnit;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import javax.swing.*;
public class Gui extends JFrame implements ActionListener{
	
	
	private JPanel contentPane;
	private int quantity;
	private Draw draw;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	
	public Gui() {
		super("Losowanie prezentów");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(700,600));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(1,2,1,1));
		setContentPane(contentPane);
		draw=new Draw();
		JMenuBar menu=new JMenuBar();
		JMenu sizeMenu=new JMenu("Size");
		JMenuItem size1=new JMenuItem("700x600");
		JMenuItem size2=new JMenuItem("800x700");
		JMenuItem size3=new JMenuItem("900x800");
		sizeMenu.add(size1);
		sizeMenu.add(size2);
		sizeMenu.add(size3);
		menu.add(sizeMenu);
		setJMenuBar(menu);
		repaint();
		size1.addActionListener(new ActionListener() { 
	         public void actionPerformed(ActionEvent e) {
	        	 setSize(700,600);
	        		}
	      });
		size2.addActionListener(new ActionListener() { 
	         public void actionPerformed(ActionEvent e) {
	        	 setSize(800,700);
	        		}
	      });
		size3.addActionListener(new ActionListener() { 
	         public void actionPerformed(ActionEvent e) {
	        	 setSize(900,800);
	        		}
	      });
		
		Container c1=new Container(); 
		Container c2=new Container(); 
		c1.setLayout(new GridLayout(2,1,1,1));
		c2.setLayout(new GridLayout(4,1,1,1));
		contentPane.add(c1);
		contentPane.add(c2);
		Container c1_1 = new Container();
		c1.add(c1_1);
		c1_1.setLayout(new GridLayout(1,2,1,1));
		Container c1_1_1 = new Container();
		c1_1.add(c1_1_1);
		c1_1_1.setLayout(new GridLayout(1,2,1,1));
		JLabel wprowadz=new JLabel("Wprowadz imiona:");
		c1_1.add(wprowadz);
		Container slider_con=new Container();
		slider_con.setLayout(new GridLayout(2,1,1,1));
		JSlider slider =new JSlider(3,10);
		slider.setValue(10);
		JLabel slider_show=new JLabel(""+draw.ile_osob,JLabel.CENTER);
		JLabel ile_osob=new JLabel("Iloœæ osób:",JLabel.CENTER);
		slider_con.add(slider);
		slider_con.add(slider_show);
		c1_1_1.add(ile_osob);
		slider.setPaintTrack(true);
		slider.setPaintTicks(true);
        slider.setPaintLabels(true);
		c1_1_1.add(slider_con);
		c1_1.add(c1_1_1);
		Container c1_2 = new Container();
		c1.add(c1_2);
		c1_2.setLayout(new GridLayout(1,2,1,1));
		JTextField name1=new JTextField(); 
		JTextField name2=new JTextField();
		JTextField name3=new JTextField();
		JTextField name4=new JTextField();
		JTextField name5=new JTextField();
		JTextField name6=new JTextField();
		JTextField name7=new JTextField();
		JTextField name8=new JTextField();
		JTextField name9=new JTextField();
		JTextField name10=new JTextField();
		Container c1_2_1 = new Container();
		c1_2_1.add(name1);
		c1_2_1.add(name2);
		c1_2_1.add(name3);
		c1_2_1.add(name4);
		c1_2_1.add(name5);
		c1_2.add(c1_2_1);
		c1_2_1.setLayout(new GridLayout(5,1,1,1));
		Container c1_2_2 = new Container();
		c1_2_2.add(name6);
		c1_2_2.add(name7);
		c1_2_2.add(name8);
		c1_2_2.add(name9);
		c1_2_2.add(name10);
		c1_2.add(c1_2_2);
		c1_2_2.setLayout(new GridLayout(5,1,1,1));
		JButton losuj_jawnie =new JButton("LOSUJ JAWNIE");
		JButton losuj_do_plikow=new JButton("LOSUJ DO PLIKÓW");
		JButton resetuj=new JButton("RESETUJ");
		Container c2_1 = new Container();
		c2_1.setLayout(new GridLayout(1,2,1,1));
		Container c2_1_1 = new Container();
		c2_1_1.setLayout(new GridLayout(5,1,1,1));
		Container c2_1_2 = new Container();
		c2_1_2.setLayout(new GridLayout(5,1,1,1));
		JLabel name1_show=new JLabel();
		JLabel name2_show=new JLabel();
		JLabel name3_show=new JLabel();
		JLabel name4_show=new JLabel();
		JLabel name5_show=new JLabel();
		JLabel name6_show=new JLabel();
		JLabel name7_show=new JLabel();
		JLabel name8_show=new JLabel();
		JLabel name9_show=new JLabel();
		JLabel name10_show=new JLabel();
		c2_1_1.add(name1_show);
		c2_1_1.add(name2_show);
		c2_1_1.add(name3_show);
		c2_1_1.add(name4_show);
		c2_1_1.add(name5_show);
		c2_1_2.add(name6_show);
		c2_1_2.add(name7_show);
		c2_1_2.add(name8_show);
		c2_1_2.add(name9_show);
		c2_1_2.add(name10_show);
		c2.add(losuj_jawnie);
		c2_1.add(c2_1_1);
		c2_1.add(c2_1_2);
		c2.add(c2_1);
		c2.add(losuj_do_plikow);
		c2.add(resetuj);
		slider.addChangeListener(new ChangeListener() { /// RVR ACTION DODAC TEZ DO CSR I CVR
	        @Override
			public void stateChanged(ChangeEvent e) {
	        	if(slider.getValue() > 2) {
	        		draw.ile_osob=slider.getValue();
	        		slider_show.setText(""+draw.ile_osob);
	        	}
	        	else {
	        		draw.ile_osob=3;
	        		slider.setValue(3);
	        		slider_show.setText(""+draw.ile_osob);
	        	} 
	        	if (draw.ile_osob==1) {
	        		name1.setEditable(true);
	        		name2.setEditable(false);
	        		name3.setEditable(false);
	        		name4.setEditable(false);
	        		name5.setEditable(false);
	        		name6.setEditable(false);
	        		name7.setEditable(false);
	        		name8.setEditable(false);
	        		name9.setEditable(false);
	        		name10.setEditable(false);
	        	}
	        	else if (draw.ile_osob==2) {
	        		name1.setEditable(true);
	        		name2.setEditable(true);
	        		name3.setEditable(false);
	        		name4.setEditable(false);
	        		name5.setEditable(false);
	        		name6.setEditable(false);
	        		name7.setEditable(false);
	        		name8.setEditable(false);
	        		name9.setEditable(false);
	        		name10.setEditable(false);
	        	}
	        	else if (draw.ile_osob==3) {
	        		name1.setEditable(true);
	        		name2.setEditable(true);
	        		name3.setEditable(true);
	        		name4.setEditable(false);
	        		name5.setEditable(false);
	        		name6.setEditable(false);
	        		name7.setEditable(false);
	        		name8.setEditable(false);
	        		name9.setEditable(false);
	        		name10.setEditable(false);
	        	}
	        	else if (draw.ile_osob==4) {
	        		name1.setEditable(true);
	        		name2.setEditable(true);
	        		name3.setEditable(true);
	        		name4.setEditable(true);
	        		name5.setEditable(false);
	        		name6.setEditable(false);
	        		name7.setEditable(false);
	        		name8.setEditable(false);
	        		name9.setEditable(false);
	        		name10.setEditable(false);
	        	}
	        	else if (draw.ile_osob==5) {
	        		name1.setEditable(true);
	        		name2.setEditable(true);
	        		name3.setEditable(true);
	        		name4.setEditable(true);
	        		name5.setEditable(true);
	        		name6.setEditable(false);
	        		name7.setEditable(false);
	        		name8.setEditable(false);
	        		name9.setEditable(false);
	        		name10.setEditable(false);
	        	}
	        	else if (draw.ile_osob==6) {
	        		name1.setEditable(true);
	        		name2.setEditable(true);
	        		name3.setEditable(true);
	        		name4.setEditable(true);
	        		name5.setEditable(true);
	        		name6.setEditable(true);
	        		name7.setEditable(false);
	        		name8.setEditable(false);
	        		name9.setEditable(false);
	        		name10.setEditable(false);
	        	}
	        	else if (draw.ile_osob==7) {
	        		name1.setEditable(true);
	        		name2.setEditable(true);
	        		name3.setEditable(true);
	        		name4.setEditable(true);
	        		name5.setEditable(true);
	        		name6.setEditable(true);
	        		name7.setEditable(true);
	        		name8.setEditable(false);
	        		name9.setEditable(false);
	        		name10.setEditable(false);
	        	}
	        	else if (draw.ile_osob==8) {
	        		name1.setEditable(true);
	        		name2.setEditable(true);
	        		name3.setEditable(true);
	        		name4.setEditable(true);
	        		name5.setEditable(true);
	        		name6.setEditable(true);
	        		name7.setEditable(true);
	        		name8.setEditable(true);
	        		name9.setEditable(false);
	        		name10.setEditable(false);
	        	}
	        	else if (draw.ile_osob==9) {
	        		name1.setEditable(true);
	        		name2.setEditable(true);
	        		name3.setEditable(true);
	        		name4.setEditable(true);
	        		name5.setEditable(true);
	        		name6.setEditable(true);
	        		name7.setEditable(true);
	        		name8.setEditable(true);
	        		name9.setEditable(true);
	        		name10.setEditable(false);
	        	}
	        	else if (draw.ile_osob==10) {
	        		name1.setEditable(true);
	        		name2.setEditable(true);
	        		name3.setEditable(true);
	        		name4.setEditable(true);
	        		name5.setEditable(true);
	        		name6.setEditable(true);
	        		name7.setEditable(true);
	        		name8.setEditable(true);
	        		name9.setEditable(true);
	        		name10.setEditable(true);
	        	}
				
				
			}});
		losuj_jawnie.addActionListener(new ActionListener() { /// RVR ACTION DODAC TEZ DO CSR I CVR
	         public void actionPerformed(ActionEvent e) {
	        	 String names[]= {name1.getText(),name2.getText(),name3.getText(),name4.getText(),name5.getText(),name6.getText(),name7.getText(),name8.getText(),name9.getText(),name10.getText()};
	        	 String losy[]=draw.losuj_jawnie(names);
	        	 if(draw.ile_osob==3) {
	        		 name1_show.setText(names[0]+": "+losy[0]);
	        		 name2_show.setText(names[1]+": "+losy[1]);
	        		 name3_show.setText(names[2]+": "+losy[2]);
	        	 }
	        	 if(draw.ile_osob==4) {
	        		 name1_show.setText(names[0]+": "+losy[0]);
	        		 name2_show.setText(names[1]+": "+losy[1]);
	        		 name3_show.setText(names[2]+": "+losy[2]);
	        		 name4_show.setText(names[3]+": "+losy[3]);
	        	 }
	        	 if(draw.ile_osob==5) {
	        		 name1_show.setText(names[0]+": "+losy[0]);
	        		 name2_show.setText(names[1]+": "+losy[1]);
	        		 name3_show.setText(names[2]+": "+losy[2]);
	        		 name4_show.setText(names[3]+": "+losy[3]);
	        		 name5_show.setText(names[4]+": "+losy[4]);
	        	 }
	        	 if(draw.ile_osob==6) {
	        		 name1_show.setText(names[0]+": "+losy[0]);
	        		 name2_show.setText(names[1]+": "+losy[1]);
	        		 name3_show.setText(names[2]+": "+losy[2]);
	        		 name4_show.setText(names[3]+": "+losy[3]);
	        		 name5_show.setText(names[4]+": "+losy[4]);
	        		 name6_show.setText(names[5]+": "+losy[5]);
	        	 }
	        	 if(draw.ile_osob==7) {
	        		 name1_show.setText(names[0]+": "+losy[0]);
	        		 name2_show.setText(names[1]+": "+losy[1]);
	        		 name3_show.setText(names[2]+": "+losy[2]);
	        		 name4_show.setText(names[3]+": "+losy[3]);
	        		 name5_show.setText(names[4]+": "+losy[4]);
	        		 name6_show.setText(names[5]+": "+losy[5]);
	        		 name7_show.setText(names[6]+": "+losy[6]);
	        		 
	        	 }
	        	 if(draw.ile_osob==8) {
	        		 name1_show.setText(names[0]+": "+losy[0]);
	        		 name2_show.setText(names[1]+": "+losy[1]);
	        		 name3_show.setText(names[2]+": "+losy[2]);
	        		 name4_show.setText(names[3]+": "+losy[3]);
	        		 name5_show.setText(names[4]+": "+losy[4]);
	        		 name6_show.setText(names[5]+": "+losy[5]);
	        		 name7_show.setText(names[6]+": "+losy[6]);
	        		 name8_show.setText(names[7]+": "+losy[7]);
	        	 }
	        	 if(draw.ile_osob==9) {
	        		 name1_show.setText(names[0]+": "+losy[0]);
	        		 name2_show.setText(names[1]+": "+losy[1]);
	        		 name3_show.setText(names[2]+": "+losy[2]);
	        		 name4_show.setText(names[3]+": "+losy[3]);
	        		 name5_show.setText(names[4]+": "+losy[4]);
	        		 name6_show.setText(names[5]+": "+losy[5]);
	        		 name7_show.setText(names[6]+": "+losy[6]);
	        		 name8_show.setText(names[7]+": "+losy[7]);
	        		 name9_show.setText(names[8]+": "+losy[8]);
	        	 }
	        	 if(draw.ile_osob==10) {
	        		 name1_show.setText(names[0]+": "+losy[0]);
	        		 name2_show.setText(names[1]+": "+losy[1]);
	        		 name3_show.setText(names[2]+": "+losy[2]);
	        		 name4_show.setText(names[3]+": "+losy[3]);
	        		 name5_show.setText(names[4]+": "+losy[4]);
	        		 name6_show.setText(names[5]+": "+losy[5]);
	        		 name7_show.setText(names[6]+": "+losy[6]);
	        		 name8_show.setText(names[7]+": "+losy[7]);
	        		 name9_show.setText(names[8]+": "+losy[8]);
	        		 name10_show.setText(names[9]+": "+losy[9]);
	        	 }
	        	}
	      });
		losuj_do_plikow.addActionListener(new ActionListener() { /// RVR ACTION DODAC TEZ DO CSR I CVR
	         public void actionPerformed(ActionEvent e) {
	        	 String names[]= {name1.getText(),name2.getText(),name3.getText(),name4.getText(),name5.getText(),name6.getText(),name7.getText(),name8.getText(),name9.getText(),name10.getText()};
	        	 try {
					draw.losuj_do_plikow(names);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	 name1_show.setText(" ");
        		 name2_show.setText(" ");
        		 name3_show.setText(" ");
        		 name4_show.setText(" ");
        		 name5_show.setText(" ");
        		 name6_show.setText(" ");
        		 name7_show.setText(" ");
        		 name8_show.setText(" ");
        		 name9_show.setText(" ");
        		 name10_show.setText(" ");
	        	}
	      });
		resetuj.addActionListener(new ActionListener() { /// RVR ACTION DODAC TEZ DO CSR I CVR
	         public void actionPerformed(ActionEvent e) {
	        	 name1_show.setText(" ");
        		 name2_show.setText(" ");
        		 name3_show.setText(" ");
        		 name4_show.setText(" ");
        		 name5_show.setText(" ");
        		 name6_show.setText(" ");
        		 name7_show.setText(" ");
        		 name8_show.setText(" ");
        		 name9_show.setText(" ");
        		 name10_show.setText(" ");
        		 name1.setText(" ");
        		 name2.setText(" ");
        		 name3.setText(" ");
        		 name4.setText(" ");
        		 name5.setText(" ");
        		 name6.setText(" ");
        		 name7.setText(" ");
        		 name8.setText(" ");
        		 name9.setText(" ");
        		 name10.setText(" ");
	        	}
	      });
		
		}
		
		
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}


