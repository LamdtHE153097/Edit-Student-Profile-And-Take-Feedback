/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DAO extends DBContext {

    PreparedStatement ps = null; // chuẩn bị câu lệnh 
    ResultSet rs = null;    // lưu 

    public account login(String user, String pass) {
        String query = "select * from account"
                + " where username = ? and password = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new account(rs.getString(1), rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public student getByUser(String user) {
        List<student> list = new ArrayList<>();
        String query = "select FullName, DateOfBirth, Gender, IDCard, PhoneNumber, Email from event where FullName = ? ";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new student(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),
                        rs.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public student getByStudentname(String name) {
        String query = "select * from Event\n"
                + "where FullName = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new student(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public lecturer getByLecname(String name) {
        String query = "select * from lecturer\n"
                + "where LecName = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new lecturer(rs.getString(1), rs.getString(2), rs.getInt(2),
                        rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public student change(String date, String gender, String id, String phone, String mail, String name) {
        String query = "update Event set DateOfBirth=?, Gender=?, IDCard=?, PhoneNumber=?, Email=? where FullName=? ";
        try {
            ps = connection.prepareStatement(query);
            //ps.setString(1, name);
            ps.setString(1, date);
            ps.setString(2, gender);
            ps.setString(3, id);
            ps.setString(4, phone);
            ps.setString(5, mail);
            ps.setString(6, name);
            ps.executeUpdate();
        } catch (Exception ex) {
        }
        return null;
    }

    public void change2(String time, String cover, String response, String skill, String support, String name) {
        String query = "update Lecturer set Time=?, Cover=?,  Response=?, Skill=?, Support=?  where LecName=? ";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, time);
            ps.setString(2, cover);
            ps.setString(3, response);
            ps.setString(4, skill);
            ps.setString(5, support);
            ps.setString(6, name);
            ps.executeUpdate();
        } catch (Exception ex) {
        }
    }

    public List<lecturer> getAllLecturer() {
        List<lecturer> list = new ArrayList<>();
        String query = "SELECT LecName, Subject, Time, Cover, Response, Skill, Support from Lecturer";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new lecturer(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }
}
