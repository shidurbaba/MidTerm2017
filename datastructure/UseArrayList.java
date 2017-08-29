package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		List<Object> list = new ArrayList<>();
		list.add("Cat");
		list.add("Dog");
		list.add("Bird");
		list.add("Fox");

		printAnimal(list);

		ConnectDB connectDB = new ConnectDB();
		connectDB.InsertDataFromArrayListToMySql(list,"Username", "Name");
		connectDB.readDataBase("Username", "Name");
	}
	public static void printForEach(ArrayList<Object>list) {
		Iterator<Object> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
		public static void printAnimal(List<Object>list)
		{
			for( Object obj : list){
				System.out.println(obj);
			}

		}
		}



