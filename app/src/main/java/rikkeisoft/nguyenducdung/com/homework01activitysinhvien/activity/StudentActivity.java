package rikkeisoft.nguyenducdung.com.homework01activitysinhvien.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import rikkeisoft.nguyenducdung.com.homework01activitysinhvien.R;
import rikkeisoft.nguyenducdung.com.homework01activitysinhvien.model.Student;

public class StudentActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvName;
    private EditText etAddress;
    private EditText etBirthDay;
    private EditText etSex;
    private EditText etClass;
    private EditText etCourse;
    private Button btnInfo;
    private String name;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        init();
        receiveData();
//        intiData();
        btnInfo.setOnClickListener(this);
    }


    private void receiveData() {
        Intent intent = getIntent();
        name = intent.getStringExtra("key_1");
        Toast.makeText(this, name,Toast.LENGTH_SHORT).show();
        tvName.setText(name);
    }

    private void init() {
        tvName = (TextView) findViewById(R.id.tv_name);
        etAddress = (EditText) findViewById(R.id.edt_country);
        etBirthDay = (EditText) findViewById(R.id.edt_birthday);
        etClass = (EditText) findViewById(R.id.edt_class);
        etCourse = (EditText) findViewById(R.id.edt_class_grade);
        etSex = (EditText) findViewById(R.id.edt_sex);
        btnInfo = (Button) findViewById(R.id.btn_info);
    }

    @Override
    public void onClick(View v) {
        Student student = new Student();
        student.setAddress(etAddress.getText().toString());
        student.setBirthday(etBirthDay.getText().toString());
        student.setClasses(etClass.getText().toString());
        student.setCourse(etCourse.getText().toString());
        student.setSex(etSex.getText().toString());
        student.setName(name);

        Intent i = new Intent(this, StudentInfoActivity.class);
        Bundle args = new Bundle();
        args.putParcelable("student", student);
        i.putExtra("info", args);
        startActivity(i);
    }
}
