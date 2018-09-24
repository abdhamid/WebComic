package abdhamid.webcomic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TahilalatsActivity extends AppCompatActivity {
    private TextView title;
    private TextView desc;
    private LinearLayout layout;
    private CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        title = findViewById(R.id.details_title);
        title.setText("Tahilalats");

        desc = findViewById(R.id.details_desc);
        desc.setText("Cerita random kehidupan masyarakat kekinian.");

        layout = findViewById(R.id.details_parent);
        layout.setBackground(getDrawable(R.drawable.tl_header));

        cardView = findViewById(R.id.details_episode);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TahilalatsActivity.this, ReadTahilalats.class);
                startActivity(intent);
            }
        });
    }
}
