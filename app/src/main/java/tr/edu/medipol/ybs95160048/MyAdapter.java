package tr.edu.medipol.ybs95160048;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    Context context;
    int[] images;
    String[] myCity;
    LayoutInflater layoutInflater;

    public MyAdapter(Context context, int[] images, String[] myCity) {
        this.context = context;
        this.images = images;
        this.myCity = myCity;

    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.spinner_style, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.spinner_image);
        TextView textView = convertView.findViewById(R.id.spinner_text);
        imageView.setImageResource(images[position]);
        textView.setText(myCity[position]);
        return convertView;
    }
}
