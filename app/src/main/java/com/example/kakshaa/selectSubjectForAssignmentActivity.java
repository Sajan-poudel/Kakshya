package com.example.kakshaa;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class selectSubjectForAssignmentActivity extends AppCompatActivity {
    TextView physicsTV,chemistryTV,MathsTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_subject_for_assignment);
        initializefields();
        Log.d("selectSubject", "till here its done");
        physicsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("physics", "till here its done");
                startActivity(new Intent(selectSubjectForAssignmentActivity.this,addAssignment.class).putExtra("subjectName","physics"));

            }
        });
        chemistryTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(selectSubjectForAssignmentActivity.this,addAssignment.class).putExtra("subjectName","chemistry"));
            }
        });
        MathsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(selectSubjectForAssignmentActivity.this,addAssignment.class).putExtra("subjectName","mathematics"));
            }
        });

    }

    private void initializefields() {
        physicsTV = findViewById(R.id.physicsSubjectTextView);
        chemistryTV = findViewById(R.id.chemistrySubjectTextView);
        MathsTV = findViewById(R.id.mathsSubjectTextView);
    }

}