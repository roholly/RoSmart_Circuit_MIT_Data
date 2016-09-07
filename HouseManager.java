package edu.acc.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

import javax.sql.DataSource;

public class HouseManager extends DataManager {

	private DataSource ds;
	
	public HouseManager(DataSource ds) {
		this.ds = ds;
	}

public ArrayList<House> getHouseIds()  {
		
    	ArrayList<House> houseIds = new ArrayList<>();
    	
    	Connection connection = null;
        Statement statement = null;
        ResultSet results = null;
    	
    	try {

            connection = ds.getConnection();
            statement = connection.createStatement();
            results = statement.executeQuery("select id from redd_low_freq.houses");
            
            while (results.next())
            	{
            		House hb = new House();
            		hb.setId(results.getString("id"));
            		
            		houseIds.add(hb);
            	}
            		    		
            } catch(SQLException ex) {
            	ex.printStackTrace();
            } finally {
            		close(results);
            		close(statement);
            		close(connection);
            }
            
    	return houseIds;

    }
	
	public ArrayList<House> getHouses(String houseID)  {
		
    	ArrayList<House> houseList = new ArrayList<>();
    	
    	Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;
    	
    	try {

            connection = ds.getConnection();
            statement = connection.prepareStatement("select * from redd_low_freq.houses where id=?");
            statement.setString(1, houseID);
            results = statement.executeQuery();
            
            while (results.next())
            	{
            		House house = new House();
            		house.setId(results.getString("id"));
            		house.setAc(results.getInt("ac"));
            		house.setBath_outlet(results.getInt("bath_outlet"));
            		house.setDishwasher(results.getInt("dishwasher"));
            		house.setDisposal(results.getInt("disposal"));
            		house.setElectronics(results.getInt("electronics"));
            		house.setFurnace(results.getInt("furnace"));
            		house.setHeat(results.getInt("heat"));
            		house.setKitchen_outlet(results.getInt("kitchen_outlet"));
            		house.setLighting(results.getInt("lighting"));
            		house.setMain(results.getInt("main"));
            		house.setMicrowave(results.getInt("microwave"));
            		house.setMisc(results.getInt("misc"));
            		house.setOutdoor_outlet(results.getInt("outdoor_outlet"));
            		house.setOven(results.getInt("oven"));
            		house.setRefrigerator(results.getInt("refrigerator"));
            		house.setSmoke_alarm(results.getInt("smoke_alarm"));
            		house.setStove(results.getInt("stove"));
            		house.setSubpanel(results.getInt("subpanel"));
            		house.setUnknown_outlet(results.getInt("unknown_outlet"));
            		house.setWasher_dryer(results.getInt("washer_dryer"));
            		houseList.add(house);
            	}
            		    		
            } catch(SQLException ex) {
            	ex.printStackTrace();
            } finally {
            		close(results);
            		close(statement);
            		close(connection);
            }
            
    	return houseList;

    }
	
public ArrayList<HouseDailyAverages> getDailyAverages(String houseID)  {
		
    	ArrayList<HouseDailyAverages> houseAvgsList = new ArrayList<>();
    	
    	Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;
    	
    	try {

            connection = ds.getConnection();
            statement = connection.prepareStatement("select * from redd_low_freq.daily_avg where houses_id=?");
            statement.setString(1, houseID);
            results = statement.executeQuery();
            
            while (results.next())
            	{
            		HouseDailyAverages houseAvgs = new HouseDailyAverages();
            		houseAvgs.setHouseId(results.getString("houses_id"));
            		houseAvgs.setCircuit(results.getString("circuit"));
            		houseAvgs.setOverallAvg(results.getDouble("overall_avg"));
            		houseAvgs.setMinAvg(results.getDouble("min"));
            		houseAvgs.setMinDate(toEDT(results.getLong("min_dt")));
            		houseAvgs.setMaxAvg(results.getDouble("max"));
            		houseAvgs.setMaxDate(toEDT(results.getLong("max_dt")));
            		houseAvgsList.add(houseAvgs);
            	}
            		    		
            } catch(SQLException ex) {
            	ex.printStackTrace();
            } finally {
            		close(results);
            		close(statement);
            		close(connection);
            }
            
    	return houseAvgsList;

    }

private String toEDT(long utc) {
	Date d = new Date(utc * 1000);
	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	TimeZone edt = TimeZone.getTimeZone("America/New_York");
	formatter.setTimeZone(edt);
	String edtDate = formatter.format(d);
	
	return edtDate;
}

}
