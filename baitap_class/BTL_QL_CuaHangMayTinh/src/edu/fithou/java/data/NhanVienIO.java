package edu.fithou.java.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import edu.fithou.java.dto.NhanVien;


public class NhanVienIO {

	public static ArrayList<NhanVien> docFile() {
		ArrayList<NhanVien> lst = new ArrayList<>();
		try {
			FileInputStream fout = new FileInputStream("NhanVien.dat");
			ObjectInputStream oos = new ObjectInputStream(fout);
			lst = (ArrayList<NhanVien>) oos.readObject();
			oos.close();
			fout.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
	
	public static void ghiFile(ArrayList<NhanVien> lst) {
		try {
			FileOutputStream fout = new FileOutputStream("NhanVien.dat");
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
