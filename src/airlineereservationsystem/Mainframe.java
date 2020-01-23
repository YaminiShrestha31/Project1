

package airlineereservationsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Mainframe extends JFrame{

    public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
   
    public Mainframe() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        initialize();
    }

   
    private void initialize() {
   
        setForeground(Color.CYAN);
        setLayout(null);

        JLabel NewLabel = new JLabel("");
    NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airlineereservationsystem/icons/plane.jpg")));
    NewLabel.setBounds(0, 0, 1920, 990);
    add(NewLabel);
       
        JLabel AirlineManagementSystem = new JLabel("AIR INDIA WELCOMES YOU");
    AirlineManagementSystem.setForeground(Color.BLACK);
        AirlineManagementSystem.setFont(new Font("ALGERIAN", Font.PLAIN, 36));
    AirlineManagementSystem.setBounds(420, 60, 1000, 55);
    NewLabel.add(AirlineManagementSystem);
       
       
        JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);
       
        JMenu AirlineSystem = new JMenu("AIRLINE SYSTEM");
        AirlineSystem.setForeground(Color.BLUE);
    menuBar.add(AirlineSystem);
       
        JMenuItem FlightDetails = new JMenuItem("FLIGHT_INFO");
    AirlineSystem.add(FlightDetails);
       
    JMenuItem ReservationDetails = new JMenuItem("ADD_CUSTOMER_DETAILS");
    AirlineSystem.add(ReservationDetails);
         JMenuItem CustomerDetails = new JMenuItem("CUSTOMERS_DETAIL");
    AirlineSystem.add(CustomerDetails);
    JMenuItem PassengerDetails = new JMenuItem("JOURNEY_DETAILS");
    AirlineSystem.add(PassengerDetails);
       
    JMenuItem SectorDetails_1 = new JMenuItem("PAYMENT_DETAILS");
    AirlineSystem.add(SectorDetails_1);
       
    JMenuItem Cancellation = new JMenuItem("CANCELLATION");
    AirlineSystem.add(Cancellation);
       
    JMenu Ticket = new JMenu("TICKET");
        Ticket.setForeground(Color.RED);
    menuBar.add(Ticket);
       
        JMenu List = new JMenu("LIST");
        List.setForeground(Color.BLUE);
    menuBar.add(List);
       
    JMenu Misc = new JMenu("MISC");
        Misc.setForeground(Color.RED);
    menuBar.add(Misc);
      
       
    CustomerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
              new CUSTOMERS_DETAIL();
          
            }
            
       });
    FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new FLIGHT_INFO();
            }
    });
       
    ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new ADD_CUSTOMERS_DETAILS();
        } catch (Exception e) {
                    e.printStackTrace();
        }
            }
    });
     
        PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new JOURNEY_DETAILS();
                } catch (Exception e) {
                    e.printStackTrace();
        }
            }
    });
       
        SectorDetails_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new PAYMENT_DETAILS();
        } catch (Exception e) {
                    e.printStackTrace();
        }
            }
    });
       
        Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Cancel();
            }
    });
       
       
        setSize(1950,1090);
    setVisible(true);
    }
}
