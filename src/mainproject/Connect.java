
package mainproject;

import javax.swing.JOptionPane;


public class Connect {

private String username;
private String ipAddress;
private String port;

private String realUsername = "12345";
private String realIpAddress = "localhost";
private String realPort = "4567";

public Connect(String un , String ip , String p){

    this.username = un;
    this.ipAddress = ip;
    this.port = p;
}

 public boolean validate(){
        
        boolean control=false;
    
        if (((username.equals(realUsername)) && ipAddress.equals(realIpAddress))&& port.equals(realPort))
        {
          
            CleintChat chat= new CleintChat();
          
           chat.setVisible(true);
            
            control=true;
            
        }
          else{
            JOptionPane.showMessageDialog(null, "Error, username, IP Address or Port number do not match",
                    "Login Error",JOptionPane.ERROR_MESSAGE);
            
            control=false;
        }
        
        return control;
}
}
