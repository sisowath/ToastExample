package www.suonsamnang.com.toastexample;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnShowInfo;
    Button btnShowWarning;
    Button btnShowDanger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnShowInfo = (Button) findViewById(R.id.btnShowInfo);
        btnShowWarning = (Button) findViewById(R.id.btnShowWarning);
        btnShowInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder messageBox = new AlertDialog.Builder(MainActivity.this);
                messageBox.setTitle("Info")
                        .setIcon(R.mipmap.ic_info_outline_black_24dp)
                        .setMessage("This is an info messagebox !")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast toast = Toast.makeText(MainActivity.this, "You've clicked Yes !", Toast.LENGTH_LONG);
                                toast.setGravity(Gravity.TOP, 0, 100);
                                ViewGroup group = (ViewGroup) toast.getView();
                                TextView messageTextView = (TextView) group.getChildAt(0);
                                messageTextView.setTextSize(30);
                                messageTextView.setTextColor(Color.BLACK);
                                messageTextView.setBackgroundColor(Color.parseColor("#ffffb2"));
                                toast.show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast toast = Toast.makeText(MainActivity.this, "You've clicked No !", Toast.LENGTH_LONG);
                                toast.setGravity(Gravity.BOTTOM, 0, 100);
                                ViewGroup group = (ViewGroup) toast.getView();
                                TextView messageTextView = (TextView) group.getChildAt(0);
                                messageTextView.setTextSize(30);
                                messageTextView.setTextColor(Color.BLACK);
                                messageTextView.setBackgroundColor(Color.parseColor("#ffffb2"));
                                toast.show();
                            }
                        })
                        .show();
            }
        });
        btnShowWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder messageBox = new AlertDialog.Builder(MainActivity.this);
                messageBox.setTitle("Warning")
                        .setIcon(R.mipmap.ic_warning_black_24dp)
                        .setMessage("This is a warning messagebox !")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast toast = Toast.makeText(MainActivity.this, "You've clicked Yes !", Toast.LENGTH_LONG);
                                toast.setGravity(Gravity.TOP, 0, 100);
                                ViewGroup group = (ViewGroup) toast.getView();
                                TextView messageTextView = (TextView) group.getChildAt(0);
                                messageTextView.setTextSize(30);
                                messageTextView.setTextColor(Color.BLACK);
                                messageTextView.setBackgroundColor(Color.parseColor("#ffffb2"));
                                toast.show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast toast = Toast.makeText(MainActivity.this, "You've clicked No !", Toast.LENGTH_LONG);
                                toast.setGravity(Gravity.BOTTOM, 0, 100);
                                ViewGroup group = (ViewGroup) toast.getView();
                                TextView messageTextView = (TextView) group.getChildAt(0);
                                messageTextView.setTextSize(30);
                                messageTextView.setTextColor(Color.BLACK);
                                messageTextView.setBackgroundColor(Color.parseColor("#ffffb2"));
                                toast.show();
                            }
                        })
                        .show();
            }
        });
        btnShowDanger = (Button) findViewById(R.id.btnShowDanger);
        btnShowDanger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder messageBox = new AlertDialog.Builder(MainActivity.this);
                messageBox.setTitle("Danger")
                        .setIcon(R.mipmap.ic_error_outline_black_24dp)
                        .setMessage("This is a danger messagebox !")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast toast = Toast.makeText(MainActivity.this, "You've clicked Yes !", Toast.LENGTH_LONG);
                                toast.setGravity(Gravity.TOP, 0, 100);
                                ViewGroup group = (ViewGroup) toast.getView();
                                TextView messageTextView = (TextView) group.getChildAt(0);
                                messageTextView.setTextSize(30);
                                messageTextView.setTextColor(Color.BLACK);
                                messageTextView.setBackgroundColor(Color.parseColor("#ffffb2"));
                                toast.show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast toast = Toast.makeText(MainActivity.this, "You've clicked No !", Toast.LENGTH_LONG);
                                toast.setGravity(Gravity.BOTTOM, 0, 100);
                                ViewGroup group = (ViewGroup) toast.getView();
                                TextView messageTextView = (TextView) group.getChildAt(0);
                                messageTextView.setTextSize(30);
                                messageTextView.setTextColor(Color.BLACK);
                                messageTextView.setBackgroundColor(Color.parseColor("#ffffb2"));
                                toast.show();
                            }
                        })
                        .show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
/*
    Sources from :
    http://www.mkyong.com/android/android-alert-dialog-example/
    http://stackoverflow.com/questions/13675822/android-alertdialog-builder
    http://stackoverflow.com/questions/5274354/how-can-we-increase-the-font-size-in-toast
*/