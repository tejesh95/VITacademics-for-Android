package com.collegecode.objects.NowListFiles;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.collegecode.VITacademics.R;

/**
 * Created by saurabh on 4/24/14.
 */
public class NowListHeader implements NowItem {
    String Header;

    public NowListHeader(String Header) {
        this.Header = Header;

    }

    @Override
    public int getViewType() {
        return NowType.LIST_HEADER.ordinal();
    }

    @Override
    public View getView(LayoutInflater inflater, View convertView) {
        View view;

        if(convertView == null)
            view = inflater.inflate(R.layout.now_list_item_header, null);
        else
            view = convertView;

        ((TextView) view.findViewById(R.id.lbl_now_header_title)).setText(Header);

        return view;
    }
}
