package edu.fithou.java.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import edu.fithou.java.dto.KhachHang;

public class KhachHangIO {

	public static ArrayList<KhachHang> docFileKhachHang() {
		ArrayList<KhachHang> lst = new ArrayList<>();
		try {
			FileInputStream fout = new FileInputStream("khachHang.dat");
			ObjectInputStream oos = new ObjectInputStream(fout);
			lst = (ArrayList<KhachHang>) oos.readObject();
			oos.close();
			fout.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
	
	public static void ghiFile(ArrayList<KhachHang> lst) {
		try {
			FileOutputStream fout = new FileOutputStream("khachHang.dat");
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
