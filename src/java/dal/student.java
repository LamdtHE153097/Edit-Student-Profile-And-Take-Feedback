/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

/**
 *
 * @author Admin
 */
public class student {

    String fullName;
    String dateOfBirth;
    int gender;
    String iDCard;
    String phoneNumber;
    String email;

    public student() {
    }

    public student(String FullName, String DateOfBirth, int gender, String IDCard, String PhoneNumber, String Email) {
        this.fullName = FullName;
        this.dateOfBirth = DateOfBirth;
        this.gender = gender;
        this.iDCard = IDCard;
        this.phoneNumber = PhoneNumber;
        this.email = Email;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String FullName) {
        this.fullName = FullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.dateOfBirth = DateOfBirth;
    }

    public String getGender() {
        if (gender == 1) {
            return "Male";
        } else {
            return "FeMale";
        }
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getIDCard() {
        return iDCard;
    }

    public void setIDCard(String IDCard) {
        this.iDCard = IDCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.phoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    @Override
    public String toString() {
        return "evt{" + "FullName=" + fullName + ", DateOfBirth=" + dateOfBirth + ", gender=" + gender + ", IDCard=" + iDCard + ", PhoneNumber=" + phoneNumber + ", Email=" + email;
    }
}
