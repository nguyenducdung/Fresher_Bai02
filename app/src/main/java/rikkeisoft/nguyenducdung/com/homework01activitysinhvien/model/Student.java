package rikkeisoft.nguyenducdung.com.homework01activitysinhvien.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {

    private String name, address, birthday, sex, classes, course;

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

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    private Student(Parcel input){
        name = input.readString();
        address = input.readString();
        birthday = input.readString();
        classes = input.readString();
        sex = input.readString();
        course = input.readString();

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
        dest.writeString(classes);
        dest.writeString(sex);
        dest.writeString(course);
    }
}
