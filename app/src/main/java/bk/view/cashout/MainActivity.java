package bk.view.cashout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Double money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        money=0.00;
        TextView text=findViewById(R.id.txtCash);


        text.setText(String.format("$%.2f", money));


        ImageView penny=findViewById(R.id.imgPenny);
        penny.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            addPenny();}
        });



        ImageView nickel=findViewById(R.id.imgNickel);
        nickel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                addNickel();}
        });

        ImageView dime=findViewById(R.id.imgDime);
        dime.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                addDime();}
        });

        ImageView quarter=findViewById(R.id.imgQuarter);
        quarter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                addQuarter();}
        });

        Button cashOut=findViewById(R.id.btn_cashOut);
        cashOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cashOut();}
        });
    }

    private void addPenny() {
        TextView textView=findViewById(R.id.txtCash);
        money=money+0.01;
        textView.setText(String.format("$%.2f", money));
    }
    private void addNickel() {
        TextView textView=findViewById(R.id.txtCash);
        money=money+0.05;
        textView.setText(String.format("$%.2f", money));
    }
    private void addDime() {
        TextView textView=findViewById(R.id.txtCash);
        money=money+0.10;
        textView.setText(String.format("$%.2f", money));
    }
    private void addQuarter() {
        TextView textView=findViewById(R.id.txtCash);
        money=money+0.25;
        textView.setText(String.format("$%.2f", money));
    }
    private void cashOut() {
        TextView textView=findViewById(R.id.txtCash);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.cash);
        mp.start();
        money=0.00;
        textView.setText(String.format("$%.2f", money));
    }
}
