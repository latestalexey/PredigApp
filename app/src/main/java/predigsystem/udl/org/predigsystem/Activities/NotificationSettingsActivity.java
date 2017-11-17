package predigsystem.udl.org.predigsystem.Activities;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import predigsystem.udl.org.predigsystem.R;

public class NotificationSettingsActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        addPreferencesFromResource(R.xml.pref_notification);

    }

    private void showUserSettings() {
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);

        StringBuilder builder = new StringBuilder();

        builder.append("\n" + "Customized Notification Ringtone:\t" + sharedPrefs.getString("notification_ringtone", ""));

        TextView settingsTextView = (TextView) findViewById(R.id.notificationsContent);
        settingsTextView.setText(builder.toString());
    }
}
