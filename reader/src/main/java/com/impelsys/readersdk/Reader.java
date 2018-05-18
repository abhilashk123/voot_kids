package com.impelsys.readersdk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by comp5 on 16-05-2018.
 */

public class Reader extends AppCompatActivity {


    private Toolbar mToolbar;
    Button previewData, downloadContent, showControlPanel, hideControlPanel, bookCompleteEvent;
    ImageButton closeButton;
    TextView toolbarTittle;
    private static RecordBookEvent mListner;
    Book book;
    Event event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reader_layout);
        final Event event = new Event();

        mToolbar = (Toolbar) findViewById(R.id.toolbar_library);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbarTittle = (TextView) findViewById(R.id.toolbar_tittle);
        toolbarTittle.setText("Reader");

        previewData = (Button) findViewById(R.id.preview_content);
        previewData.setText(getIntent().getExtras().getString("Type"));

        downloadContent = (Button) findViewById(R.id.download_content);
        downloadContent.setText(getIntent().getExtras().getString("content_path"));

        closeButton = (ImageButton) findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                event.setEventType("bookClose ");
                if (mListner != null) {
                    mListner.recordBookEvent(book, event);
                }
            }
        });

        showControlPanel = (Button) findViewById(R.id.show_control_panel);
        showControlPanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideControlPanel.setVisibility(View.VISIBLE);
                showControlPanel.setVisibility(View.GONE);
                event.setEventType("showControlPanel");
                if (mListner != null) {
                    mListner.recordBookEvent(book, event);
                }
            }
        });
        hideControlPanel = (Button) findViewById(R.id.hide_control_panel);
        hideControlPanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideControlPanel.setVisibility(View.GONE);
                showControlPanel.setVisibility(View.VISIBLE);
                event.setEventType("hideControlPanel");
                if (mListner != null) {
                    mListner.recordBookEvent(book, event);
                }
            }
        });

        bookCompleteEvent = (Button) findViewById(R.id.book_event);
        bookCompleteEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                event.setEventType("Book Completed");
                if (mListner != null) {
                    mListner.recordBookEvent(book, event);
                }
            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;

    }


    public static void recordBookEvent(RecordBookEvent recordBookEvent) {
        mListner = recordBookEvent;

    }
}

