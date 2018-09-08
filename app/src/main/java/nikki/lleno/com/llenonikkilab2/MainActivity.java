package nikki.lleno.com.llenonikkilab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linearButton = (Button)findViewById(R.id.lButton);
        Button relativeButton = (Button)findViewById(R.id.rButton);
        Button constraintButton = (Button)findViewById(R.id.cButton);
        linearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent moveSecond= new Intent(getApplicationContext(), second.class);
                startActivity(moveSecond);
            }
        });
        relativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  moveSecond = new Intent(getApplicationContext(), third.class);
                startActivity(moveSecond);
            }
        });
        constraintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveSecond = new Intent(getApplicationContext(), fourth.class);
                startActivity(moveSecond);
            }
        });
    }
}
