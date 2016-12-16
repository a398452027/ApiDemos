package gtq.com.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by guotengqian on 2016/12/15 11:31.
 * def 开始界面
 */

public class StartActivity extends AppCompatActivity{

    RecyclerView mainRecyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        mainRecyclerView= (RecyclerView) findViewById(R.id.testactivity_main_recyclerview);
        //设置布局管理器
        mainRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
