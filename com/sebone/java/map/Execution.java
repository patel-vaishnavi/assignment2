package com.sebone.java.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.sebone.java.collection.UserData;

public class Execution {
    public UserData getUserData(int rollNumber,String name,int age) {
    	UserData userData=new UserData();
    	userData.setRollNumber(rollNumber);
    	userData.setName(name);
    	userData.setAge(age);
    	return userData;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Execution execution =new Execution();
        ArrayList<UserData> userDataList=new ArrayList<UserData>();
        userDataList.add(execution.getUserData(101,"vaishnavi",23));
        userDataList.add(execution.getUserData(102,"ram",22));
        userDataList.add(execution.getUserData(103,"sham",20));
        userDataList.add(execution.getUserData(104,"vaishnavi",20));
        userDataList.add(execution.getUserData(105,"utkarsh",20));
        userDataList.add(execution.getUserData(106,"utkarsh",22));
        
        MapUserDataImpl mapUserDataImpl=new MapUserDataImpl();
        //map by value result
        HashMap<Integer,String> map1=mapUserDataImpl.mapByValue(userDataList);
        Set<Integer> keyList1=map1.keySet();
        for(Integer x : keyList1) { 
	    System.out.println("key "+x+" value "+map1.get(x));
	    }
        System.out.println();
        //map by name and object
        HashMap<String,UserData> map2=mapUserDataImpl.mapByName(userDataList);
        Set<String> keyList2=map2.keySet();
        for(String x : keyList2) { 
	    System.out.println("key "+x+" value "+map2.get(x));
	    }
        System.out.println();
        //map by name and list
        HashMap<String, ArrayList<UserData>> map3=mapUserDataImpl.mapByNameAndList(userDataList);
        Set<String> keyList3=map3.keySet();
        for(String x : keyList3) { 
	    System.out.println("key "+x+" value "+map3.get(x));
	    }
		//update age by name
        Scanner scan=new Scanner(System.in);
        String key=scan.next();
        HashMap<String, ArrayList<UserData>> map4=mapUserDataImpl.updateUserAgeByName(userDataList,key);
        ArrayList<UserData> resultList=map4.get(key);
        System.out.println(resultList);
        scan.close();
	}
	
    
}
