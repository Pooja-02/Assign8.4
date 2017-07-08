package krishna.assign83;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridview;

   //name of titles passed in String array
    public static String[] name = {
            "GingerBread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop"
    };
    //images for all android versions
    public static int[] images = {
            R.drawable.gingerbread,
            R.drawable.honeycomb,
            R.drawable.icecream,
            R.drawable.jellybean,
            R.drawable.kitkat,
            R.drawable.lollipop
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Customgridview
                adapter = new Customgridview(MainActivity.this, name, images);
            gridview = (GridView) findViewById(R.id.gv);
            gridview.setAdapter(adapter);
            gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    Toast.makeText(MainActivity.this, "You Clicked at " + name[+position], Toast.LENGTH_SHORT).show();

                }
            });

        }
    }