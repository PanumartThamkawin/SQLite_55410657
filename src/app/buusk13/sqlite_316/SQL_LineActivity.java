package app.buusk13.sqlite_316;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class SQL_LineActivity extends Activity {
	SQLiteDatabase db;
	private Button btninsert;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql__line);
        control__657DB control__657db = new control__657DB(this);
        control__657db.getWritableDatabase();
        
        btninsert = (Button) findViewById(R.id.btn_insert);
        btninsert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),AddActivity.class);
				startActivity(intent);
			}
		});
        
    }
}
