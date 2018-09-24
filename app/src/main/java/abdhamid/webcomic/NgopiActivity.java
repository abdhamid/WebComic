package abdhamid.webcomic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NgopiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView title = findViewById(R.id.details_title);
        title.setText("Ngopi, yuk!");

        TextView desc = findViewById(R.id.details_desc);
        desc.setText("Warung kopi adalah tempat yang paling asik buat ngomongin semua hal. Semua? Iya, semua. Yuk, ikut ngobrol bareng Pak Gundul!" );

        LinearLayout layout = findViewById(R.id.details_parent);
        layout.setBackground(getDrawable(R.drawable.ny_header));

        CardView cardView = findViewById(R.id.details_episode);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NgopiActivity.this, ReadNgopi.class);
                startActivity(intent);
            }
        });
    }
}
