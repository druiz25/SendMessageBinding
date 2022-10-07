package com.example.sendmessageBinding.iu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.sendmessageBinding.R;
import com.example.sendmessageBinding.SendMessageApplication;
import com.vansuita.materialabout.builder.AboutBuilder;
import com.vansuita.materialabout.views.AboutView;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        AboutView view = AboutBuilder.with(this)
                .setPhoto(R.drawable.foto)
                .setCover(R.drawable.cover)
                .setName(R.string.nombreAboutUs)
                .setSubTitle(R.string.subTituloAboutUs)
                .setBrief(R.string.descripcionAboutUs)
                .setAppIcon(R.mipmap.ic_launcher)
                .setAppName(R.string.app_name)
                .addGooglePlayStoreLink(R.string.googlePlayStoreLinkAboutUs)
                .addGitHubLink(R.string.gitHubUserAboutUs)
                .addFacebookLink(R.string.facebookUser)
                .addFiveStarsAction()
                .setVersionNameAsAppSubTitle()
                .addShareAction(R.string.app_name)
                .setWrapScrollView(true)
                .setLinksAnimated(true)
                .setShowAsCard(true)
                .build();

        setContentView(view);
    }
}