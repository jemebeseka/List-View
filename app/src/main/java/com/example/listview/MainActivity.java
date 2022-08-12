package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.EventLogTags;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayList<Person> arrayList = new ArrayList<>();

        arrayList.add(new Person(R.drawable.Bruno, "Bruno 'Magnifico' Fernandes", "Portuguese Playmaker playing for Manchester United. He wears the No. 8 jersey."));
        arrayList.add(new Person(R.drawable.Cavani, "Edison 'El Matador' Cavani", "Uruguayan Goalscorer, left Man Utd this Summer. He wore the number 21."));
        arrayList.add(new Person(R.drawable.David, "David de Gea Quintana", "Spanish Shot-stopper, David de Gea Quintana is amongst the best in the world and sports the number 1 for Man Utd."));
        arrayList.add(new Person(R.drawable.Mason, "Mason 'Mace' Greenwood", "Homegrown talent, Mace is regarded as the bright sparks of Man Utd's future. He wears the No 11."));
        arrayList.add(new Person(R.drawable.Rashford, "Marcus 'MBE' Rashford", "Another homegrown talent, Marcus is one of the best wingers and wide forward in the EPL. He wears the jersey No 10."));
        arrayList.add(new Person(R.drawable.Scott, "Scott 'McSauce' McTominay", "The Tenacious Scot is one of our best ball winners in the midfield. An academy talent as well, he wears the No 39."));
        arrayList.add(new Person(R.drawable.Team, "Manchester United", "Manchester United -Otherwise known as the Red Devils- is the Greatest English Team of All Time...and arguably one of the best in the world."));

        PersonAdapter personAdapter = new PersonAdapter(this, R.layout.list_row,arrayList);

        listView.setAdapter(personAdapter);

    }
}