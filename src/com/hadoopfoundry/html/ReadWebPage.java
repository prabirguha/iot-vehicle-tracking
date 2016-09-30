package com.hadoopfoundry.html;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadWebPage {

	public static void main(String[] args) {
<<<<<<< HEAD
		String urlText = "http://www.hortonworks.com";
=======
		String urlText = "http://www.google.com";
>>>>>>> refs/remotes/origin/master
		BufferedReader in = null;
		try {
			URL url = new URL(urlText);
			in = new BufferedReader (new InputStreamReader(url.openStream()));
			
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
