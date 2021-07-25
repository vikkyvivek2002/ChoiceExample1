import java.awt.*;   import java.awt.event.*;  
public class ChoiceExample1  
{ public static void main(String args[])  
{  
        Frame f= new Frame("Choice Example");  
        Choice c1=new Choice();  
        c1.setBounds(100,100, 75,75);  
        c1.add("Cricket");  
        c1.add("Football");  
        c1.add("Hockey"); 
        c1.add("Tennis"); 
        c1.add("Chess");
        c1.add("Carroms");
        c1.add("Vollyball");
        f.add(c1);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true); 
f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });
 
       
}  
}  