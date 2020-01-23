/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineereservationsystem;



    
    
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class CUSTOMERS_DETAIL extends JFrame implements ActionListener{
 
    JTable t1;
    JButton b1;
    String x[] = {"Flight_Code","Passport_No","Pnr_No","Address","Nationality","Name","Gender","Phone_No"};
    String y[][] = new String[20][8];
    int i=0, j=0;
    public static void main(String[] args){
        new CUSTOMERS_DETAIL().setVisible(true);
    }
   public CUSTOMERS_DETAIL (){
        super("CUSTOMERS_DETAIL");
        setSize(1200,650);
        setLocation(200,200);
         try{
            Conn c  = new Conn();
            String str = "select * from passenger";
            ResultSet rs  = c.s.executeQuery(str);
            while(rs.next()){
                y[i][j++]=rs.getString("fl_code");
                y[i][j++]=rs.getString("passport_No");
                y[i][j++]=rs.getString("pnr_no");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("nationality");
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("gender");
                y[i][j++]=rs.getString("ph_no");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    

        
        b1 = new JButton("Print");
        add(b1,"South");
        JScrollPane sp = new JScrollPane(t1);
        add(sp);
        b1.addActionListener(this);
    
   }
    public void actionPerformed(ActionEvent ae){
        
       
        try{
            t1.print();
        } catch( Exception e){
                    e.printStackTrace();
    }
    
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    
    }

       }
               


