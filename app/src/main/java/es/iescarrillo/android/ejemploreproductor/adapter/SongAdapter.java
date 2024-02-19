package es.iescarrillo.android.ejemploreproductor.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import es.iescarrillo.android.ejemploreproductor.R;
import es.iescarrillo.android.ejemploreproductor.models.Song;

public class SongAdapter extends ArrayAdapter<Song> {

    private List<Song> songs;
    private Context context;
    private TextView tvTitle, tvArtist;

    public SongAdapter(Context context, List<Song> songs){
        super(context, 0, songs);
        this.context = context;
        this.songs = songs;
    }

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        if(convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.item_song, parent, false);

        Song song = getItem(position);

        tvTitle = convertView.findViewById(R.id.tvTitle);
        tvArtist = convertView.findViewById(R.id.tvArtist);

        tvArtist.setText(song.getArtist());
        tvTitle.setText(song.getTitle());

        return convertView;
    }
}
