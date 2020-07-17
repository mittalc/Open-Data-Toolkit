// this is the class that will collect the data from the client or over the internet and store it into MySql file 
import java.util.*;

public class Collect(){
  private String data; // data attribute
  private String user_info; // attribute for user information 
  private String section_info; // attribute for section information
  private String date_type; // attribute to store data_type
  
  // getter and setter methods
  
  public void setdata(String data){
    this.data = data;
  }
  
  public void setuser_info(String user_info){
    this.user_info = user_info;
  }
  
  public void setsection_info(String section_info){
    this.section_info = section_info;
  }
  
  public void setdata_type(String data_type){
    this.data_type = data_type;
  }
  
  public String getdata(){
    return data;
  }
  
  public String getuser_info(){
    return user_info;
  }
  
public String getsection_info(){
    return section_info;
  }
  
  public String getdata_type(){
    return data_type;
  }
  
  public void collect(){
    // this method collects the data and store it into sql file or database
  }
}
