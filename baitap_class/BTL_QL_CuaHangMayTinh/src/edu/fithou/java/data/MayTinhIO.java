package edu.fithou.java.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import edu.fithou.java.dto.MayTinh;



public class MayTinhIO {

	public static ArrayList<MayTinh> docFile() {
		ArrayList<MayTinh> lst = new ArrayList<>();
		try {
			FileInputStream fout = new FileInputStream("MayTinh.dat");
			ObjectInputStream oos = new ObjectInputStream(fout);
			lst = (ArrayList<MayTinh>) oos.readObject();
			oos.close();
			fout.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
	
	public static void ghiFile(ArrayList<MayTinh> lst) {
		try {
			FileOutputStream fout = new FileOutputStream("MayTinh.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(lst);
			oos.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
