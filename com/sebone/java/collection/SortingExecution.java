package com.sebone.java.collection;

import java.util.ArrayList;

public class SortingExecution {
	
    public UserData getUserData(int rollNumber, int age, String name) {
    	UserData userData = new UserData();
    	userData.setAge(age);
    	userData.setName(name);
    	userData.setRollNumber(rollNumber);
    	return userData;
    }
	public static void main(String[] args) {
		
		SortingExecution sortingExecution = new SortingExecution();
		//creating objects of UserData class to generate data
		ArrayList<UserData> userDataList = new ArrayList<UserData>();
		//storing userdata object in local object which is returned my mehtod
		UserData userData1=sortingExecution.getUserData(101,22,"vaishnavi");
		//adding object in array list
		userDataList.add(userData1);
		//adding object in arraylist which is returned by method
		userDataList.add(sortingExecution.getUserData(102, 20, "utkarsh"));
		userDataList.add(sortingExecution.getUserData(103, 21, "pari"));
		userDataList.add(sortingExecution.getUserData(104, 19, "ritika"));
		userDataList.add(sortingExecution.getUserData(105, 20, "ayush"));
		userDataList.add(sortingExecution.getUserData(106, 23, "chaaman"));
		
		SortUserDataImpl sortUserDataImpl= new SortUserDataImpl();
		sortUserDataImpl.sortByAge(userDataList);
	    //displaying data
		for (UserData data : userDataList) {
			System.out.println(data.toString());
		}
		System.out.println();
		sortUserDataImpl.sortByName(userDataList);
		for(UserData data : userDataList) {
			System.out.println(data.toString());
        }
		System.out.println();
		sortUserDataImpl.sortByRollNumber(userDataList);
		for(UserData data : userDataList)
			System.out.println(data.toString());
	}

}
