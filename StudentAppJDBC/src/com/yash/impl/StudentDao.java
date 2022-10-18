package com.yash.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;
import com.yash.database.Cp;
import com.yash.entity.Student;

public class StudentDao {

	public static boolean indsertStudentToDB(Student st) {

		boolean f = false;
		try {
			// jdbc code
			Connection con = Cp.create();

			String q = "insert into students (sname,sphone,scity) values (?,?,?)";
			// preparedStatement

			PreparedStatement ps = con.prepareStatement(q);

			ps.setString(1, st.getStudentName());
			ps.setString(2, st.getStudentPhone());
			ps.setString(3, st.getStudentCity());

			ps.executeUpdate();
			f = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return f;

	}

	public static boolean deleteStudent(int d) {
		boolean f = false;
		try {
			// jdbc code
			Connection con = Cp.create();

			String q = "delete from students where sid=?";
			// preparedStatement

			PreparedStatement ps = con.prepareStatement(q);

			ps.setInt(1, d);

			ps.executeUpdate();
			f = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return f;

	}

	public static void showAllStudent() {

		try {
			// jdbc code
			Connection con = Cp.create();

			String q = "select * from students";
			// preparedStatement

			java.sql.Statement stmt = con.createStatement();

			ResultSet s = stmt.executeQuery(q);

			while (s.next()) {

				int id = s.getInt(1);
				String name = s.getString(2);
				String phone = s.getString(3);
				String city = s.getString(4);

				System.out.println("Student id :" + id);
				System.out.println("Student name :" + name);
				System.out.println("Student phone :" + phone);
				System.out.println("Student city :" + city);
				System.out.println("++++++++++++++++++++++++");

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void updateRecord() {

		try {
			Connection con = Cp.create();

			String q = "update students set sname=?,sphone=?,scity=? where sid=?";

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter new name ");

			String newname = sc.nextLine();

			System.out.println("Enter new phone ");

			String newphone = sc.next();

			System.out.println("Enter new city");

			String newcity = sc.next();

			System.out.println("Enter current id ");

			int newid = sc.nextInt();

			PreparedStatement pst = con.prepareStatement(q);

			pst.setString(1, newname);
			pst.setString(2, newphone);
			pst.setString(3, newcity);
			pst.setInt(4, newid);

			pst.executeUpdate();

			System.out.println("Update record successfully...");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
