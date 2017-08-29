package math;

import databases.ConnectDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		List<Object> list = new ArrayList<>();
		ConnectDB connectDB = new ConnectDB();
		int counter = 0;

		for(int i = 2; i < 100000; i++){
			if(isPrime(i)){
				counter ++;
				System.out.println(i);
				list.add(i);
			}

	}
		System.out.println("Total prime nums : " + counter );

		connectDB.InsertDataFromIntegerToMySql(counter, "Prime", "Number");
		System.out.println("Prime Numbers:" + counter);

	}

	public static boolean isPrime(int num){
		if(num == 2){
			return true;
		}
		if(num % 2 == 0){
			return false;
		}
		for(int i = 3; i * i <= num; i = i+2){
			if(num % 2 == 0){
				return false;
			}
		}
		return true;
	}


}

