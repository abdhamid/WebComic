package abdhamid.webcomic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TheGamerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView title = findViewById(R.id.details_title);
        title.setText("The Gamer");

        TextView desc = findViewById(R.id.details_desc);
        desc.setText("Bagaimana kalau hidupmu seperti bermain game? Dunia penuh fantasi akan datang padamu!");

        LinearLayout layout = findViewById(R.id.details_parent);
        layout.setBackground(getDrawable(R.drawable.tg_header));

        CardView cardView = findViewById(R.id.details_episode);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TheGamerActivity.this, ReadTheGamer.class);
                startActivity(intent);
            }
        });

    }
}
