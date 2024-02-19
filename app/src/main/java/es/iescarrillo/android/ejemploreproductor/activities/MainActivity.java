package es.iescarrillo.android.ejemploreproductor.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import es.iescarrillo.android.ejemploreproductor.R;
import es.iescarrillo.android.ejemploreproductor.adapter.SongAdapter;
import es.iescarrillo.android.ejemploreproductor.models.Song;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnPrevious, btnNext, btnStop, btnPlayOrPause;
    private SongAdapter adapter;
    private ListView lvSongs;
    private List<Song> songs;
    private MediaPlayer mediaPlayer;
    private AssetManager assetManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadComponents();


    }

    private void loadComponents(){
        btnNext = findViewById(R.id.btnNext);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnStop = findViewById(R.id.btnStop);
        btnPlayOrPause = findViewById(R.id.btnPlayOrPause);
        lvSongs = findViewById(R.id.lvSongs);
        songs = new ArrayList<>();
    }
}