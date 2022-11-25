package com.example.myapplication;

import android.view.View;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
    import android.content.Intent;
    

public class MainActivity extends Activity
{
  
   ListView simpleList;
   String student[] = {"Orgasan Claire", "Romelo Anne Grace", "Gutierrez Jerome", "Damgo Juanito"};

    @Override  
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);      setContentView(R.layout.activity_main);
  simpleList = (ListView)findViewById(R.id.List);
 ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list, R.id.list,student);
  simpleList.setAdapter(arrayAdapter);
simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
  public void onItemClick(AdapterView<?> parent, View view,int position, long id) {

               if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(),orgasan.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), romelo.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), jerome.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), damgo.class);
                    startActivityForResult(myIntent, 0);
                }

                
                
            }
        });  
    }
}