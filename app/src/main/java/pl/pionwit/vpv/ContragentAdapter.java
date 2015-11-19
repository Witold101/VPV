package pl.pionwit.vpv;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ContragentAdapter extends BaseAdapter {

    Context ctx;
    ArrayList<ContragentItem> contragentItems;
    LayoutInflater linflater;

    ContragentAdapter(Context context, ArrayList<ContragentItem> contragentItems) {
        ctx = context;
        this.contragentItems = contragentItems;
        linflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return contragentItems.size();
    }

    @Override
    public Object getItem(int position) {
        return contragentItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = linflater.inflate(R.layout.item_contragent, parent, false);
        }
        ContragentItem p = contragentItems.get(position);
        ((TextView) view.findViewById(R.id.contragent)).setText(p.getContragent());
        ((TextView) view.findViewById(R.id.contact)).setText(p.getContact());
        ((TextView) view.findViewById(R.id.phone)).setText(p.getPhone());
        ((ImageView) view.findViewById(R.id.imageStar)).setImageResource(p.getImgIcon());
        return view;
    }

}
