package rikkeisoft.nguyenducdung.com.homework01activitysinhvien.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import rikkeisoft.nguyenducdung.com.homework01activitysinhvien.R;
import rikkeisoft.nguyenducdung.com.homework01activitysinhvien.model.Student;

public class StudentInfoActivity extends AppCompatActivity {
    private TextView tvInfo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("info");
        Student st = args.getParcelable("student");

        tvInfo = (TextView) findViewById(R.id.tv_view);
        setStudent(st);
    }
    private void setStudent(Student student){
        String name = student.getName();
        String ad = student.getAddress();
        String bt = student.getBirthday();
        String sex = student.getSex();
        String cl = student.getClasses();
        String kh = student.getCourse();
        tvInfo.setText(name + "\n"+ ad + "\n" + bt + "\n" + sex +"\n" + cl + "\n" + kh);

    }

}
