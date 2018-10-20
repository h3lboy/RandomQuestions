package com.example.fraulyhenriquez.randomquestions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button btn_Generate;
    EditText edt_Questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_Generate = (Button)findViewById(R.id.btn_Generate);
        edt_Questions = (EditText)findViewById(R.id.edt_Questions);


        final String questions[] = {
                " Who does Jim Carrey play in the 1994 film The Mask?",
                "Which British Formula 1 racing driver survived a Learjet crash in May 2000?",
                "When World Blood Donor Day was observed worldwide?",
                "Which female singer had a hit single with the song What a Girl Wants?",
                " Which continent has the larger land mass: Antarctica or South America?",
                "Malacology’ the scientific study of what?"

        };


        btn_Generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int Questions = rand.nextInt(6);

                edt_Questions.setText(questions[Questions]);
            }
        });
    }
}
