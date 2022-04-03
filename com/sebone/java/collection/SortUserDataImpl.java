/**
 * 
 */
package com.sebone.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * @author Vaishnavi Patel
 *
 */
public class SortUserDataImpl implements SortUserData {

	@Override
	public ArrayList<UserData> sortByName(ArrayList<UserData> userDataList) {
		Collections.sort(userDataList, new SortByName());
		return userDataList;
	}

	@Override
	public ArrayList<UserData> sortByRollNumber(ArrayList<UserData> userDataList) {
		Collections.sort(userDataList, new SortByRollNumber());
		return userDataList;
	}

	@Override
	public ArrayList<UserData> sortByAge(ArrayList<UserData> userDataList) {
		Collections.sort(userDataList, new SortByAge());
		return userDataList;
	}
    //implementatiion of sort method
	
	
   /* public ArrayList<UserData> sort(ArrayList<UserData> userDataList) {
		// TODO Auto-generated method stub
    	 
    	
    	Collections.sort(userDataList, new SortByAge());
    	Collections.sort(userDataList, new SortByRollNumber());
    	Collections.sort(userDataList, new SortByName());
		return userDataList;
	}*/


	
}	
	



