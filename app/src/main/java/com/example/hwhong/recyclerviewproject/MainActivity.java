package com.example.hwhong.recyclerviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Company> companyList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CompanyAdapter adapter;

    private String[] name = {"Airbnb", "Apple", "Facebook", "Google", "New York Times"};
    private int[] images = {R.drawable.airbnb, R.drawable.apple, R.drawable.facebook,
            R.drawable.google, R.drawable.nyt};

    private String[] descriptions = {
            "Airbnb is an online marketplace that enables people to list, find, then rent vacation homes for a processing fee. It has over 1,500,000 listings in 34,000 cities and 191 countries.",
            "Apple Inc. is an American multinational technology company headquartered in Cupertino, California, that designs, develops, and sells consumer electronics, computer software, and online services.",
            "Facebook is a for-profit corporation and online social networking service based in Menlo Park, California, United States.",
            "Google is an American multinational technology company specializing in Internet-related services and products that include online advertising technologies, search, cloud computing, and software.",
            "The New York Times (sometimes abbreviated to NYT) is an American daily newspaper, founded and continuously published in New York City since September 18, 1851, by The New York Times Company."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        for (int i = 0; i < name.length; i++) {
            companyList.add(new Company(name[i], descriptions[i], images[i]));
        }

        adapter = new CompanyAdapter(companyList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}
