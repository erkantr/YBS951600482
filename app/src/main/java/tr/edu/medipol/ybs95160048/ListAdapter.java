package tr.edu.medipol.ybs95160048;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;

    private List<Listv> coursesListv;

    ListAdapter(Activity activity, List<Listv> coursesListv) {
        layoutInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        this.coursesListv = coursesListv;

    }

    @Override
    public int getCount() {
        return coursesListv.size();
    }

    @Override
    public Object getItem(int position) {
        return coursesListv.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View lineView = null;
        lineView = layoutInflater.inflate(R.layout.courses_item, null);
        TextView courseName = lineView.findViewById(R.id.courseName);
        ImageView courseImage = lineView.findViewById(R.id.courseImage);

        Listv listv = coursesListv.get(position);

        courseName.setText(listv.getCourse());

        courseImage.setImageResource(listv.getCourseImage());


        return lineView;
    }
}
