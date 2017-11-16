package com.wangjt.spitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.walden.common.Router;
import com.wangjt.modulea.ADisplay;
import com.wangjt.moduleb.BDisplay;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private TextView et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        et = (TextView) findViewById(R.id.et_spi);
        findViewById(R.id.bt_spi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadMoudle();
            }
        });
    }

    private void loadMoudle() {
        StringBuilder builder = new StringBuilder();

        HashMap map = Router.getInstance().getMap();

        DisplayImp dispalyImp = (DisplayImp) map.get(DisplayImp.class.getName());
        ADisplay aDisplay = (ADisplay) map.get(ADisplay.class.getName());
        BDisplay bDisplay = (BDisplay) map.get(BDisplay.class.getName());

        builder.append(dispalyImp.display() + "\n");
        builder.append(aDisplay.display() + "\n");
        builder.append(bDisplay.display() + "\n");
        et.setText(builder.toString());

    }
}
