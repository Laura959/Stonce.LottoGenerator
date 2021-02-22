package lt.vtmc.stoncelottogenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText inputText;
    private Button button1;
    private TextView string1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);
        button1 = findViewById(R.id.button1);
        string1 = findViewById(R.id.string1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int number = Integer.parseInt(inputText.getText().toString());
                    string1.setText("Your number for a lottery is ");
                    loterija(number);
                } catch (NumberFormatException ignored) {

                }
            }


            private int metodas() {
                double a = 0.0;
                double b = 100.0;
                double rand = ((Math.random() * (b - a)) + a);
                return (int) rand;

            }

//            private void loterija(int number) {
//                int c;
//                if (number == 0) {
//                    System.out.println("0");
//                } else {
//                    for (int i = 1; i <= number; i++) {
//                        c = metodas();
//                        System.out.print(c + " ");
//                    }
//                }
//            }

            private Object loterija(int number) {
                int c;
                List<Integer> skaiciai = new ArrayList<Integer>();
                if (number == 0) {
                    return 0;
                } else {
                    for (int i = 1; i <= number; i++) {
                        c = metodas();
                        skaiciai.add(c);
                    }
                }
                return skaiciai;
            }
        });
}
}

