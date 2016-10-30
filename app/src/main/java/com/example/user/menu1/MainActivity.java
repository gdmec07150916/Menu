package com.example.user.menu1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1= (TextView) findViewById(R.id.textView);
        registerForContextMenu(tv1);
    }
    public boolean onCreateOptionMenu(Menu menu){
        menu.add(0,1,0,R.string.m1);
        menu.add(0,1,0,R.string.m2);
        return super.onCreateOptionsMenu(menu);

    }
    public boolean onOptonsItemSelected(MenuItem item){
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);

    }
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.add(0,1,0,R.string.m1);
        menu.add(0,1,0,R.string.m2);
    }
    public boolean onContextItemSelected(MenuItem item){
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        return super.onContextItemSelected(item);
    }
}
