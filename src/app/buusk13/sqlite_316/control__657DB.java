package app.buusk13.sqlite_316;

import java.security.PublicKey;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class control__657DB extends SQLiteOpenHelper {
	
	private static final String DATABASE_NAME= "mydata657";
	private static final String TABLE_MEMBER = "members";
	private static final int DATABASE_VERSION = 1;

	public control__657DB(Context context) {
		super(context,DATABASE_NAME,null,DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE " + TABLE_MEMBER 
				+ "(MemberID INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ "Nickname  TEXT(100),"  + "Age                  TEXT(100)," 
				+ "BloodGounp TEXT(100),"  + "EducationsBackground TEXT(100)," 
				+ "Country   TEXT(100),"  + "Email                TEXT(100));"); 
		
			Log.d("CREATE TABLE", "Create table Successfully");
				
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXSIS" + TABLE_MEMBER);
		onCreate(db);
	
	}
	public long InsertData(String strNickname , String strAge , String strBloodGounp , String strEducationsBackground , 
			String strCountry ,  String strEmail ) {
		try {
			SQLiteDatabase db;
			db = this.getWritableDatabase();
			ContentValues values = new ContentValues();
			values.put("Nickname", strNickname);
			values.put("Age", strAge);
			values.put("BloodGounp", strBloodGounp);
			values.put("EducationsBackground", strEducationsBackground);
			values.put("Country", strCountry);
			values.put("Email", strEmail);
			long l = db.insert(TABLE_MEMBER, null, values);
			db.close();
			return l;
		}catch (Exception e){
			
		}
			return -1;
		
	}
	}


