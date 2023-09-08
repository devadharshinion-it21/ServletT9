package com.cslc.MainPackage;

public class UserData {
    public void storeUserCredentials(String user_name,String user_password) {
        Connect con=new Connect();
        con.getConnection();
        String query="insert into test.user_credentials values(Null, '"+user_name+"',sha("+user_password+"))";
        con.executeUpdateQuery(query);
        con.closeConnection();

    }
    public void viewUserCredentials() {
        
    }
}
