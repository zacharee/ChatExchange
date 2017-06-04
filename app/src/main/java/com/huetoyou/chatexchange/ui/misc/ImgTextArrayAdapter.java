package com.huetoyou.chatexchange.ui.misc;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.huetoyou.chatexchange.R;

import java.util.ArrayList;

public class ImgTextArrayAdapter extends ArrayAdapter<String>
{
    private final Activity context;
    private final ArrayList<String> chatroomNames;
    private final ArrayList<String> chatroomDescs;
    private final ArrayList<Drawable> icons;

    public ImgTextArrayAdapter(Activity context, ArrayList<String> chatroomNames, ArrayList<String> chatroomDescs, ArrayList<Drawable> icons)
    {
        super(context, R.layout.chatroom_list_item, chatroomNames);
        // TODO Auto-generated constructor stub

        this.context = context;
        this.chatroomNames = chatroomNames;
        this.chatroomDescs = chatroomDescs;
        this.icons = icons;
    }

    @NonNull
    public View getView(int position, View view, @NonNull ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View row = inflater.inflate(R.layout.chatroom_list_item, null,true);

        TextView chatroomNameTextView = (TextView) row.findViewById(R.id.chatroomName);
        ImageView chatroomIconImgView = (ImageView) row.findViewById(R.id.chatroomImg);
        TextView chatroomDescTextView = (TextView) row.findViewById(R.id.chatroomDesc);

        chatroomNameTextView.setText(chatroomNames.get(position));
        chatroomIconImgView.setImageDrawable(icons.get(position));
        chatroomDescTextView.setText(chatroomDescs.get(position));
        return row;
    };
}