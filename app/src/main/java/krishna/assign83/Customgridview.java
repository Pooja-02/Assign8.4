package krishna.assign83;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//new java class with customgridview to show images with Titles
public class Customgridview extends BaseAdapter{
    private Context mContext;
    private final String[] name;
    private final int[] images;

    public Customgridview(Context c,String[] name,int[] images ) {
        mContext = c;
        this.name = name;
        this.images = images;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)//method  getView to display View
     {
        // TODO Auto-generated method stub
        View grid;
       //adapter to fetch data
         LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.rowlayout, null);
            TextView textView = (TextView) grid.findViewById(R.id.textView);
            ImageView imageView = (ImageView)grid.findViewById(R.id.imageView);
            textView.setText(name[position]);//to specify title corresponding to images
            imageView.setImageResource(images[position]);
        } else {
            grid = (View) convertView;
        }
        // grid.setBackgroundColor(Color.BLACK);
        return grid;
    }
}