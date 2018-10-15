package rikkeisoft.nguyenducdung.com.homework01activitysinhvien;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {

    private String name, address, birthday, sex, class1, khoaHoc;

    public Student() {
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    private Student(Parcel input){
        name = input.readString();
        address = input.readString();
        birthday = input.readString();
        class1 = input.readString();
        sex = input.readString();
        khoaHoc = input.readString();

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(address);
        dest.writeString(birthday);
        dest.writeString(class1);
        dest.writeString(sex);
        dest.writeString(khoaHoc);
    }
}
