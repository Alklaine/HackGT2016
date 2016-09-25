package alexoshin.hackgt2016;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

/**
 * Created by alexo on 9/24/2016.
 */

public class ExpandableListActivity extends ListActivity {
    ListView listView;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_tab_fragment);

        //listView = (ListView) findViewById(R.id.expandable_List);
        String[] values = new String[] {"Test1", "Test2"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                                            android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String) listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Position: " + itemPosition + "ListItem: "
                        + itemValue, Toast.LENGTH_LONG).show();
            }
        });
    }
}
