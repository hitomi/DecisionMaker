package org.kuuhaku.decisionmaker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    TextView decisionLaber;
    RelativeLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get widget
        decisionLaber = (TextView) findViewById(R.id.decisionLaber);
        container = (RelativeLayout) findViewById(R.id.container);
        // first action
        twoWayDecision();
    }

    public void twoWayDecision() {
        int seed = (int) Math.abs(Math.random()*1000);
        if(seed>500) {
            decisionLaber.setText(R.string.two_way_yes);
            container.setBackgroundColor(getResources().getColor(R.color.two_way_yes));
        } else {
            decisionLaber.setText(R.string.two_way_no);
            container.setBackgroundColor(getResources().getColor(R.color.two_way_no));
        }
    }
}
