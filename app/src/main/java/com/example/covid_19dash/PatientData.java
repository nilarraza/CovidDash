package com.example.covid_19dash;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PatientData extends AppCompatActivity {
    TextView localTotal,localNew,localDeath,localRecover;
    Button globalbtn,localbtn;
    Retrofit retrofit;
    jsonPlaceHolderApi jsonApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_data);
        localTotal=(TextView) findViewById(R.id.localtotal);
        localNew=(TextView) findViewById(R.id.localnew);
        localDeath=(TextView) findViewById(R.id.localdeaths);
        localRecover=(TextView) findViewById(R.id.localrecover);
        globalbtn = (Button) findViewById(R.id.glocalbtn);
        localbtn= (Button) findViewById(R.id.localbtn2);



        retrofit=Client.getRetrofit();
        jsonApi=retrofit.create(jsonPlaceHolderApi.class);

        getData();
    }

    private void getData() {

        globalbtn.setVisibility(View.VISIBLE);
        Call<Dataf> call=jsonApi.getDaata();
     call.enqueue(new Callback<Dataf>() {
         @Override
         public void onResponse(Call<Dataf> call, Response<Dataf> response) {
             //textView.setText(response.body().getData().getGlobal_deaths());
             Dataf data=response.body();
             localTotal.setText("Local Total Cases : "+data.data.getLocal_total_cases());
             localNew.setText("Local New Cases : "+data.data.getLocal_new_cases());
             localDeath.setText("Local Total Deaths : "+data.data.getLocal_deaths());
             localRecover.setText("Local Total Recover : "+data.data.getLocal_recovered());
             localbtn.setVisibility(View.INVISIBLE);

         }

         @Override
         public void onFailure(Call<Dataf> call, Throwable t) {
             localTotal.setText("Failed to Load");
             localNew.setText("Failed to Load");
             localDeath.setText("Failed to Load");
             localRecover.setText("Failed to Load");
             localbtn.setVisibility(View.INVISIBLE);
         }
     });
    }

    public void globalCase(View view) {


        localbtn.setVisibility(View.VISIBLE);
        Call<Dataf> call=jsonApi.getDaata();
        call.enqueue(new Callback<Dataf>() {
            @Override
            public void onResponse(Call<Dataf> call, Response<Dataf> response) {
                Dataf data=response.body();
//                localTotal.setText("Global Total Cases : "+data.data.getGlobal_total_cases());
//                localNew.setText("Global New Cases : "+data.data.getGlobal_new_cases());
//                localDeath.setText("Global Total Deaths : "+data.data.getGlobal_deaths());
//                localRecover.setText("Global Total Recover : "+data.data.getGlobal_recovered());
//                globalbtn.setVisibility(View.INVISIBLE);
                hData data1[]=data.data.getHospital_data();
                hData.hospital h=data1[1].new hospital();
                localTotal.setText(h.name);


            }

            @Override
            public void onFailure(Call<Dataf> call, Throwable t) {
                localTotal.setText("Failed to Load");
                localNew.setText("Failed to Load");
                localDeath.setText("Failed to Load");
                localRecover.setText("Failed to Load");
                globalbtn.setVisibility(View.INVISIBLE);
            }

        });

    }

    public void localCase(View view) {
        getData();
    }
}
