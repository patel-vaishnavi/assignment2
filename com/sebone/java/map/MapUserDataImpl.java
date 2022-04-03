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
public class MapUserDataImpl implements MapUserData
{

	@Override
	public HashMap<Integer, String> mapByValue(ArrayList<UserData> userDataList) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		for(UserData userData : userDataList) {
			map.put(userData.getRollNumber(),userData.getName());
		}
		return map;
	}
	@Override
	public HashMap<String,UserData> mapByName(ArrayList<UserData> userDataList){
		HashMap<String,UserData> map=new HashMap<String,UserData>();
		for(UserData userData : userDataList) {
			map.put(userData.getName(), userData);
		}
	    return map;	
	}
	@Override
	public HashMap<String, ArrayList<UserData>> mapByNameAndList(ArrayList<UserData> userDataList) {
        HashMap<String, ArrayList<UserData>> map=new HashMap<String, ArrayList<UserData>>();
		for(UserData userData : userDataList) {
	        if(map.containsKey(userData.getName())){
	        ArrayList<UserData> userSame=map.get(userData.getName());
	        userSame.add(userData);
	       	//map.get(userData.getName()).add(userData);
		    }
		    else{
		    ArrayList<UserData> userNew=new ArrayList<UserData>();	
		    userNew.add(userData);
		    map.put(userData.getName(),userNew);
		    }
		}
		
		return map;
	}
	@Override
	public HashMap<String, ArrayList<UserData>> updateUserAgeByName(ArrayList<UserData> userDataList,String key) {
		HashMap<String, ArrayList<UserData>> map=this.mapByNameAndList(userDataList);
		ArrayList<UserData> resultList=map.get(key);
		for(UserData userData : resultList)
			userData.setAge(20);
		return map;
	}
		    
}

 