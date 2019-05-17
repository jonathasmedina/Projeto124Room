package com.example.projeto124room;



import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    static FragmentManager fragmentManager;
    static MyAppDatabase myAppDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAppDatabase = Room.databaseBuilder(getApplicationContext(),
                MyAppDatabase.class, "userdb").
                allowMainThreadQueries().build();

        String caminhoBanco = getDatabasePath("userdb").getAbsolutePath();


        fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().
                add(R.id.frame_layout, new HomeFragment()).
                commit();
    }
}
