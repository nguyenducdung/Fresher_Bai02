package rikkeisoft.nguyenducdung.com.homework01activitysinhvien;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_name;
    private EditText edt_country;
    private EditText edt_birthday;
    private EditText edt_sex;
    private EditText edt_class;
    private EditText edt_khoahoc;
    private Button btn_info;
    private String name1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        init();
        receiveData();
//        intiData();
        btn_info.setOnClickListener(this);
    }



    private void receiveData() {
        Intent intent = getIntent();
        name1 = intent.getStringExtra("key_1");
        Toast.makeText(this, name1,Toast.LENGTH_SHORT).show();
        tv_name.setText(name1);
    }

    private void init() {
        tv_name = (TextView) findViewById(R.id.tv_name);
        edt_country = (EditText) findViewById(R.id.edt_country);
        edt_birthday = (EditText) findViewById(R.id.edt_birthday);
        edt_class = (EditText) findViewById(R.id.edt_class);
        edt_khoahoc = (EditText) findViewById(R.id.edt_class_grade);
        edt_sex = (EditText) findViewById(R.id.edt_sex);
        btn_info = (Button) findViewById(R.id.btn_info);
    }

//    private void intiData(){
//
//   }

    @Override
    public void onClick(View v) {
        Student student = new Student();
        student.setAddress(edt_country.getText().toString());
        student.setBirthday(edt_birthday.getText().toString());
        student.setClass1(edt_class.getText().toString());
        student.setKhoaHoc(edt_khoahoc.getText().toString());
        student.setSex(edt_sex.getText().toString());
        student.setName(name1);

        Intent i = new Intent(this, StudentInfoActivity.class);
        Bundle args = new Bundle();
        args.putParcelable("student", student);
        i.putExtra("info", args);
        startActivity(i);
    }
}
