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

public class HospitalData extends AppCompatActivity {
    TextView hosName;
    TextView cumlocal;
    TextView cumfor;
    TextView trlocal;
    TextView trfor;
    Button nxtHos,previous;
    int i;

    Retrofit retrofit;
    jsonPlaceHolderApi jsonApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_data);

        hosName=(TextView) findViewById(R.id.name);
        cumlocal=(TextView) findViewById(R.id.cumulative_local);
        cumfor=(TextView) findViewById(R.id.cumulative_foreign);
        trlocal=(TextView) findViewById(R.id.treatment_local);
        trfor = (TextView) findViewById(R.id.treatment_foreign);
        nxtHos=(Button) findViewById(R.id.next2);
        previous=(Button) findViewById(R.id.previous);

        retrofit=Client.getRetrofit();
        jsonApi=retrofit.create(jsonPlaceHolderApi.class);

        loadHospital(0);

    }

    public  void  loadHospital(final int i){
        Call<Dataf> call=jsonApi.getDaata();
        call.enqueue(new Callback<Dataf>() {
            @Override
            public void onResponse(Call<Dataf> call, Response<Dataf> response) {

               int j = i;

                Dataf data=response.body();
                hData[] data1 =data.data.getHospital_data();
                int s=data1.length-1;
                String sd=Integer.toString(s);
                String ss=Integer.toString(j);
               hosName.setText(sd);
               cumlocal.setText(ss);


                if (j==s){
                    nxtHos.setVisibility(View.INVISIBLE);
                    previous.setVisibility(View.VISIBLE);
                }else if (j==0){
                    previous.setVisibility(View.INVISIBLE);
                    nxtHos.setVisibility(View.VISIBLE);
                }else {
                    previous.setVisibility(View.VISIBLE);
                    nxtHos.setVisibility(View.VISIBLE);
                }

                hData data2=data.data.hospital_data[i];
                Hospital hos=data2.getHospital();

                hosName.setText(hos.getName());
                cumlocal.setText("Total Local : "+ data2.getCumulative_local());
                cumfor.setText("Total Foreign : "+ data2.getCumulative_foreign());
                trlocal.setText("Treatment Local :  "+ data2.getTreatment_local());
                trfor.setText("Treatment Foreign : "+ data2.getTreatment_foreign());

            }

            @Override
            public void onFailure(Call<Dataf> call, Throwable t) {
                hosName.setText("Failed to Load");

            }
        });
    }

    public void nextHospital(View view) {
            i=i+1;
            loadHospital(i);
    }

    public void previousHospital(View view) {
        i=i-1;
        loadHospital(i);
    }
}
