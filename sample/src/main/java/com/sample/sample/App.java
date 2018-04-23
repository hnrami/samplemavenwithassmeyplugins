package com.sample.sample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        try {
			System.out.println(PropertyHandler.getInstance().getValue("db.ip"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
