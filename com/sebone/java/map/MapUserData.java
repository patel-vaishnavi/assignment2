/**
 * 
 */
package com.sebone.java.map;

import java.util.ArrayList;
import java.util.HashMap;


import com.sebone.java.collection.UserData;
/**
 * @author Vaishnavi Patel
 *
 */

public interface MapUserData {
	public HashMap<Integer,String> mapByValue(ArrayList<UserData> userDataList);
	public HashMap<String,UserData> mapByName(ArrayList<UserData> userDataList);
	public HashMap<String, ArrayList<UserData>> mapByNameAndList(ArrayList<UserData> userDataList);
	public HashMap<String, ArrayList<UserData>> updateUserAgeByName(ArrayList<UserData> userDataList,String key);
	
}

