package com.ykeocorp.letsgetfit;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
    }

    /** Open different difficulties for selecting plan **/
    public void openLoseWeight(View view) {
        Intent intent = new Intent(this, LoseWeightTrainingDifficulty.class);
        startActivity(intent);
    }

    public void openGainWeight(View view) {
        Intent intent = new Intent(this, GainWeightTrainingDifficulty.class);
        startActivity(intent);
    }

/*
    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView1, youTubeView2, youTubeView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        youTubeView1 = (YouTubePlayerView) findViewById(R.id.youtube_view1);
        youTubeView2 = (YouTubePlayerView) findViewById(R.id.youtube_view2);
        youTubeView3 = (YouTubePlayerView) findViewById(R.id.youtube_view3);
        youTubeView1.initialize(Config.YOUTUBE_API_KEY, this);
        youTubeView2.initialize(Config.YOUTUBE_API_KEY, this);
        youTubeView3.initialize(Config.YOUTUBE_API_KEY, this);
    }

    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
        if (!wasRestored) {
            player.cueVideo("fhWaJi1Hsfo"); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
            player.cueVideo("fhWaJi1Hsfo"); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
            player.cueVideo("fhWaJi1Hsfo"); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
        }
    }

    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String error = String.format(getString(R.string.player_error), errorReason.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_REQUEST) {
            // Retry initialization if user performed a recovery action
            youTubeView1.initialize(Config.YOUTUBE_API_KEY, this);
            youTubeView2.initialize(Config.YOUTUBE_API_KEY, this);
            youTubeView3.initialize(Config.YOUTUBE_API_KEY, this);
        }
    }
*/
    //protected Provider getYouTubePlayerProvider() { return youTubeView; }
}