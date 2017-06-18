package com.example.juanm.stovesoccerv2;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by JuanM on 6/17/2017.
 */

public class Model {

    // THE MOST VALUABLE PLAYERS - OVERALL
    private String mvpURL = "https://www.transfermarkt.com" +
            "/spieler-statistik/wertvollstespieler/marktwertetop";

    public Model() {
        new Data().execute();
    }

    // MVPData AsyncTask
    private class Data extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }
        @Override
        protected Void doInBackground(Void... params) {
            try {
                Document doc = Jsoup.connect(mvpURL).get();
                System.out.println("PENIS " + doc.html());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}
