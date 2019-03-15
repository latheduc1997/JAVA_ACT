package edu.fithou.java.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import edu.fithou.java.dto.NhaSanXuat;



public class NhaSanXuatIO {

	public static ArrayList<NhaSanXuat> docFile() {
		ArrayList<NhaSanXuat> lst = new ArrayList<>();
		try {
			FileInputStream fout = new FileInputStream("NhaSanXuat.dat");
			ObjectInputStream oos = new ObjectInputStream(fout);
			lst = (ArrayList<NhaSanXuat>) oos.readObject();
			oos.close();
			fout.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
	
	public static void ghiFile(ArrayList<NhaSanXuat> lst) {
		try {
			FileOutputStream fout = new FileOutputStream("NhaSanXuat.dat");
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
