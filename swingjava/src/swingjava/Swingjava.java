
package swingjava;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Swingjava {
    public static void main(String[] args) {
          
   JFrame j= new JFrame();
   j.setSize(600, 700);
   j.setTitle("The 7 Wonders Of The World");
   j.setLocationRelativeTo(null);
   j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   j.setLayout(null);
   
    Font f= new Font("Serif", Font.BOLD,35 );
    Font f2= new Font("serif", Font.CENTER_BASELINE ,15);
    Font f3= new Font("serif", Font.HANGING_BASELINE,20);
    
    JPanel heading= new JPanel();
    heading.setLayout(null);
     heading.setBounds(18, 10, 550,600);
     heading.setBackground(new Color(0,0,0,80));
    
    
     ////////////////////////////Label///////////////////////////////////
     JLabel l1= new JLabel("WELCOME ");
     l1.setBounds(200, 30, 300, 30);
     l1.setFont(f);
     l1.setForeground(Color.WHITE);
      heading.add(l1);
      
     JLabel l2= new JLabel();
     l2.setText("THESE ARE THE NEW 7 WONDERS OF WORLD:");
     l2.setBounds(20, 70, 550, 30);
     l2.setFont(f2);
     l2.setForeground(Color.WHITE);
      heading.add(l2);
      
     JLabel l3= new JLabel("CLICK ANY OF THESE TO SEE THE PICTURE:");
     l3.setFont(f2);
     l3.setBounds(20, 90, 500, 60);
     l3.setForeground(Color.WHITE);
      heading.add(l3);
      
      
    ///////////////////////////RadioButton///////////////////////////////////////
    
      JRadioButton rb1= new JRadioButton("Great Wall of China (China)");
      rb1.setBounds(50, 200, 200, 30);
      heading.add(rb1);
      
      JRadioButton rb2= new JRadioButton("Christ the Redeemer Statue (Rio de Janeiro)");
      rb2.setBounds(300, 200, 200, 30);
     heading.add(rb2);
      
      JRadioButton rb3= new JRadioButton("Machu Picchu (Peru)");
      rb3.setBounds(50, 250, 200, 30);
      heading.add(rb3);
      
      JRadioButton rb4= new JRadioButton("Chichen Itza ( Mexico)");     
      rb4.setBounds(300, 250, 200, 30);
      heading.add(rb4);
      
      JRadioButton rb5= new JRadioButton("The Roman Colosseum (Rome)");
      rb5.setBounds(50, 300, 200, 30);
      heading.add(rb5);
      
      JRadioButton rb6= new JRadioButton("Taj Mahal (Agra, India)");
      rb6.setBounds(300, 300, 200, 30);
      heading.add(rb6);
      
      JRadioButton rb7= new JRadioButton("Petra (Jordan)");
      rb7.setBounds(50, 350, 200, 30);
      heading.add(rb7);
      
     
      
      ButtonGroup bg1= new ButtonGroup();
      bg1.add(rb1);
      bg1.add(rb2);
      bg1.add(rb3);
      bg1.add(rb4);
      bg1.add(rb5);
      bg1.add(rb6);
      bg1.add(rb7);
 
      

      
     ///// ///////////////////////BUTTON/////////////////////////////////
      JButton b =new JButton();
      b.setText("SHOW PICTURE");
      b.setBounds(200, 550, 200, 50);
     
      
      
      
      
 ////////////////////////////////////////IMAGE///////////////////////////////////
 
     ImageIcon ic= new ImageIcon("pct/C-R.png");
    
     Image bck= ic.getImage();
     Image temp=bck.getScaledInstance(600,700, Image.SCALE_SMOOTH);
     ic= new ImageIcon(temp);
     JLabel im=new JLabel("",ic, (int) JLabel.CENTER);
    
     im.add(heading);
     im.add(b);
     im.setBounds(0, 0,600,700);
     im.setIcon(ic);
     j.add(im);
    
     
     
    /////////////////////////////////////NAVIGATE///////////////////////////////////////
    
    b.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
           if(rb1.isSelected()){
               imgShow IMG=new imgShow("pct/rb-1.png", "Great Wall of China (China)");
               j.dispose();
           }
           
          else if(rb2.isSelected()){
               imgShow IMG=new imgShow("pct/rb-2.png", "Christ the Redeemer Statue (Rio de Janeiro");
                 j.dispose();
           }
           
         else if(rb3.isSelected()){
               imgShow IMG=new imgShow("pct/rb-3.png", "Machu Picchu (Peru)");
                 j.dispose();
           }
           
          else if(rb4.isSelected()){
               imgShow IMG=new imgShow("pct/rb-4.png", "Chichen Itza ( Mexico)");
                 j.dispose();
           }
           
          else if(rb5.isSelected()){
               imgShow IMG=new imgShow("pct/rb-5.png", "The Roman Colosseum (Rome)");
                 j.dispose();
           }
           
          else if(rb6.isSelected()){
               imgShow IMG=new imgShow("pct/rb-6.png", "Taj Mahal (Agra, India)");
                 j.dispose();
           }
           
          else if(rb7.isSelected()){
               imgShow IMG=new imgShow("pct/rb-7.png", "Petra (Jordan)");
                 j.dispose();
           }
   //////////////////////////CHECKBOX/////////////////////////////////
          else{
              JOptionPane.showMessageDialog(j, " you didn't select anything. Please select something!");
          }
              
           
              }
    });
     
     
       j.setVisible(true);
    }
    
}

