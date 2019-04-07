package edmt.dev.hello;

import android.content.res.AssetFileDescriptor;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    try {

                        AssetFileDescriptor afd = null;

                        switch (finalI) {
                            case 0:
                                afd = getAssets().openFd("0.wav");
                                MediaPlayer player = new MediaPlayer();
                                player.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player.prepare();
                                player.start();
                                break;
                            case 1:
                                afd = getAssets().openFd("02.wav");
                                MediaPlayer player1 = new MediaPlayer();
                                player1.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player1.prepare();
                                player1.start();
                                break;
                            case 2:
                                afd = getAssets().openFd("03.wav");
                                MediaPlayer player2 = new MediaPlayer();
                                player2.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player2.prepare();
                                player2.start();
                                break;
                            case 3:
                                afd = getAssets().openFd("04.wav");
                                MediaPlayer player3 = new MediaPlayer();
                                player3.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player3.prepare();
                                player3.start();
                                break;
                            case 4:
                                afd = getAssets().openFd("05.wav");
                                MediaPlayer player4 = new MediaPlayer();
                                player4.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player4.prepare();
                                player4.start();
                                break;
                            case 5:
                                afd = getAssets().openFd("06.wav");
                                MediaPlayer player5 = new MediaPlayer();
                                player5.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player5.prepare();
                                player5.start();
                                break;
                            case 6:
                                afd = getAssets().openFd("07.wav");
                                MediaPlayer player6 = new MediaPlayer();
                                player6.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player6.prepare();
                                player6.start();
                                break;
                            case 7:
                                afd = getAssets().openFd("08.wav");
                                MediaPlayer player7 = new MediaPlayer();
                                player7.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player7.prepare();
                                player7.start();
                                break;
                            case 8:
                                afd = getAssets().openFd("09.wav");
                                MediaPlayer player8 = new MediaPlayer();
                                player8.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player8.prepare();
                                player8.start();
                                break;
                            case 9:
                                afd = getAssets().openFd("10.wav");
                                MediaPlayer player9 = new MediaPlayer();
                                player9.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player9.prepare();
                                player9.start();
                                break;
                            case 10:
                                afd = getAssets().openFd("11.wav");
                                MediaPlayer player10 = new MediaPlayer();
                                player10.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player10.prepare();
                                player10.start();
                                break;
                            case 11:
                                afd = getAssets().openFd("12.wav");
                                MediaPlayer player11 = new MediaPlayer();
                                player11.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player11.prepare();
                                player11.start();
                                break;
                            case 12:
                                afd = getAssets().openFd("13.wav");
                                MediaPlayer player12 = new MediaPlayer();
                                player12.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player12.prepare();
                                player12.start();
                                break;
                            case 13:
                                afd = getAssets().openFd("14.wav");
                                MediaPlayer player13 = new MediaPlayer();
                                player13.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                                player13.prepare();
                                player13.start();
                                break;
                        }
                    }catch(IOException e) {
                        e.printStackTrace();
                    }

                }
            });
        }
    }
}
