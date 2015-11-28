package pl.pionwit.vpv.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import pl.pionwit.vpv.BisnesLogic.Contragents.ContragentItem;
import pl.pionwit.vpv.R;


public class AdapterClientGrid extends BaseAdapter {

    Context ctx;
    ArrayList<ContragentItem> contragentItems;
    LayoutInflater linflater;

    public AdapterClientGrid(Context context, ArrayList<ContragentItem> contragentItems) {
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
            view = linflater.inflate(R.layout.item_grid_contact, parent, false);
        }
        ContragentItem p = contragentItems.get(position);
        ((TextView) view.findViewById(R.id.tvNameGrid)).setText(p.getContragent());
        ((TextView) view.findViewById(R.id.tvDepartmentGridRez)).setText(p.getContact());
        ((TextView) view.findViewById(R.id.tvPhoneGridRez)).setText(p.getPhone());
        return view;
    }

}
