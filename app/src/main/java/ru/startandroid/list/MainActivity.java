package ru.startandroid.list;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.AdapterView;
import java.util.ArrayList;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.HashMap;
public class MainActivity extends ListActivity {

    private ArrayList<HashMap<String, Object>> Spisok;
    private static final String TITLE = "name";
    private static final String ICON = "icon";
    public void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
    ListView listView = (ListView) findViewById(android.R.id.list);
    Spisok=new ArrayList<HashMap<String, Object>>();
    HashMap<String, Object> hm;
    hm=new HashMap<>();
    hm.put(TITLE,"Павел Пароходов");
    hm.put(ICON,R.drawable.opera);
    Spisok.add(hm);

    hm=new HashMap<>();
    hm.put(TITLE,"Сергей Симонов");
    hm.put(ICON,R.drawable.outlook);
    Spisok.add(hm);

    hm=new HashMap<>();
    hm.put(TITLE,"Олег Зайцев");
    hm.put(ICON,R.drawable.maxthon);
    Spisok.add(hm);

    hm=new HashMap<>();
    hm.put(TITLE,"Никита Прокофьев");
    hm.put(ICON,R.drawable.meebo);
    Spisok.add(hm);

    hm=new HashMap<>();
    hm.put(TITLE,"Анатолий Щекотов");
    hm.put(ICON,R.drawable.music);
    Spisok.add(hm);

    hm=new HashMap<>();
    hm.put(TITLE,"Анастасия Солнечная");
    hm.put(ICON,R.drawable.mixx);
    Spisok.add(hm);

     hm=new HashMap<>();
     hm.put(TITLE,"Афанасий Солодов");
     hm.put(ICON,R.drawable.miro);
     Spisok.add(hm);

     hm=new HashMap<>();
     hm.put(TITLE,"Владелен Помыркин");
     hm.put(ICON,R.drawable.pulse);
     Spisok.add(hm);

     hm=new HashMap<>();
     hm.put(TITLE,"Авдотья Павлова");
     hm.put(ICON,R.drawable.prima);
     Spisok.add(hm);

     hm=new HashMap<>();
     hm.put(TITLE,"Артем Михайлов");
     hm.put(ICON,R.drawable.premiere);
     Spisok.add(hm);

    SimpleAdapter adapter = new SimpleAdapter(this, Spisok,
            R.layout.activity_main, new String[]{TITLE, ICON},
            new int[]{R.id.empty, R.id.imageView});

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(itemClickListener);
}

   AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
       @Override
       public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           HashMap<String, Object> itemHashMap = (HashMap<String, Object>) parent.getItemAtPosition(position);
           String titleItem = itemHashMap.get(TITLE).toString();
           int imageItem = (int) itemHashMap.get(ICON);
            Toast.makeText(getApplicationContext(),
                    titleItem , Toast.LENGTH_SHORT).show();

       }
   };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
