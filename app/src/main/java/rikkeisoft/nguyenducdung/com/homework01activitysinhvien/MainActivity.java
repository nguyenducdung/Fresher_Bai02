package rikkeisoft.nguyenducdung.com.homework01activitysinhvien;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_name;
    private Button btn_login;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name = (EditText) findViewById(R.id.edt_name);
        btn_login = (Button) findViewById(R.id.btn_main);
//

        btn_login.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, StudentActivity.class);
        name = edt_name.getText().toString();
        intent.putExtra("key_1", name);
        startActivity(intent);
    }
}
