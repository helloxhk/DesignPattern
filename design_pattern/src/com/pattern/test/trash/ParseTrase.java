package com.pattern.test.trash;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

public class ParseTrase {

	public static void fillBin(String filename,Fillable bin) {
		try {
			@SuppressWarnings("resource")
			BufferedReader data = new BufferedReader(new FileReader(new File(filename)));
			String buf;
			while((buf = data.readLine()) != null){
				String type = buf.substring(0, buf.indexOf(":")).trim();
				double weight = Double.valueOf(buf.substring(buf.indexOf(":") + 1).trim()).doubleValue();
				bin.addTrash(Trash.factory(new Info(type, weight)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void fillBin(String filename, Vector<Object> v){
		fillBin(filename, new FillableVector(v));
	}

}
