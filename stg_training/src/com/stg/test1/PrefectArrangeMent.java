package com.stg.test1;

public class PrefectArrangeMent {

	public static void main(String[] args) {


		/*
		
		select id,concat(first_name,' ',last_name)as fullname from customer where
length(concat(first_name,last_name))<12 order by
length(concat(upper(first_name),'',upper(last_name))) asc,
concat(upper(first_name),'',upper(last_name)) asc,
id asc;
		
*/
	}

}
