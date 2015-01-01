package org.xiangbalao.androidfontdome;





import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.os.Bundle;


public class MainActivity extends ActionBarActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
       
        
     IconTextView  myicon =(IconTextView)findViewById(R.id.myicon);
     IconTextView  myicon2 =(IconTextView)findViewById(R.id.myicon2);
     IconTextView  myicon3 =(IconTextView)findViewById(R.id.myicon3);
     IconTextView  myicon4 =(IconTextView)findViewById(R.id.myicon4);
     myicon.setOnClickListener(this);
     myicon2.setOnClickListener(this);
     myicon3.setOnClickListener(this);
     myicon4.setOnClickListener(this);

}

    @Override
    public void onClick(View v)
    {
        // TODO Auto-generated method stub
        
    }
}
