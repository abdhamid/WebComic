package abdhamid.webcomic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PakInyongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView title = findViewById(R.id.details_title);
        title.setText("Pak Guru Inyong");

        TextView desc = findViewById(R.id.details_desc);
        desc.setText("Sisi kehidupan seorang Guru Honorer");

        LinearLayout layout = findViewById(R.id.details_parent);
        layout.setBackground(getDrawable(R.drawable.pi_header));

        CardView cardView = findViewById(R.id.details_episode);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PakInyongActivity.this, ReadInyong.class);
                startActivity(intent);
            }
        });
    }
}
