package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.fonts.Font;
import android.os.Bundle;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;

import java.sql.ClientInfoStatus;

public class MainActivity extends Activity
{
    ListView list;


    String[] name =
            {
                    "Trần Hoàng Lê Hương",
                    "Nguyễn Thị Kiều Oanh",
                    "Trần Thị Thu Sương",
                    "Nguyễn Như Yến Thanh",
                    "Nguyễn Vũ Anh Khoa"
            };
    String[] chucvu =
            {
                    "Trưởng phòng Tài chính",
                    "Phó phòng Tài chính",
                    "Nhân viên",
                    "Nhân viên",
                    "Nhân viên"
            };
    Integer[] hesoluong =
            {
                    3,
                    2,
                    1,
                    1,
                    1
            };

    Integer[] imageId =
            {
                    R.drawable.giamdoc,
                    R.drawable.kieuoanh,
                    R.drawable.thusuong,
                    R.drawable.yenthanh,
                    R.drawable.anhtuan
            };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomList adapter = new CustomList(MainActivity.this, name, imageId,chucvu,hesoluong);

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
      



        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override

            public void onItemClick(AdapterView <? > parent, View view,
                                    int position, long id)
            {

                Toast.makeText(MainActivity.this, "Bạn đã chọn: " + name[+position] +", Chức vụ:" + chucvu[+position] +","
                        + "\n" +"Hệ số lương:" + hesoluong[+position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}