package com.pragmatic.lecture7.strings;

import java.util.Scanner;

public class Problem01_AnalyseUrl {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String url = input.nextLine();
		
		int protocolIndex = url.indexOf(':');
		String protocol = url.substring(0, protocolIndex);		
		
		int serverIndexStart = url.indexOf("www");
		int serverIndexEnd = url.indexOf('/', serverIndexStart);
		String server = url.substring(serverIndexStart, serverIndexEnd);
		
		int resourceIndexStart = url.indexOf('/', serverIndexEnd);
		int resourceIndexEnd = url.indexOf('?');
		String resource = url.substring(resourceIndexStart, resourceIndexEnd);
		
		System.out.println("Protocol: " + protocol);
		System.out.println("Server: " + server);
		System.out.println("Resource: " + resource);
	}
}

/*
Напишете програма, която чете URL и анализира компонентите на този URL.
Пример : https://www.google.com/path/to/resource?arg=1
Общият формат на един URL е <protocol>://<server>/<resource>?<arg>=<value>
Резултат :
Protocol = http
Server = www.google.com
Resource = /path/to/resource
*/
