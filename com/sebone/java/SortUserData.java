/**
 * 
 */
package com.sebone.java.collection;

import java.util.ArrayList;

/**
 * @author Vaishnavi Patel
 * 
 */
public interface SortUserData {
       //ArrayList<UserData> sort(ArrayList<UserData> userDataList);
       
       ArrayList<UserData> sortByName(ArrayList<UserData> userDataList);
       ArrayList<UserData> sortByRollNumber(ArrayList<UserData> userDataList);
       ArrayList<UserData> sortByAge(ArrayList<UserData> userDataList);
       
}
