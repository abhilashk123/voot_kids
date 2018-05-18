package com.impelsys.vootkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.impelsys.readersdk.Book;
import com.impelsys.readersdk.Event;
import com.impelsys.readersdk.Reader;
import com.impelsys.readersdk.RecordBookEvent;
import com.impelsys.readersdk.RenderClass;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private Button openPreviewContenButton, openDownloadedContentButton;
    TextView toolbarTittle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RenderClass renderClass = new RenderClass(MainActivity.this);
        final Book book = new Book();
        final Event event = new Event();
        book.setContentPath("www.abcdef.com");

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle(null);

        toolbarTittle = (TextView) findViewById(R.id.toolbar_tittle);
        toolbarTittle.setText("Bookshelf");


        openPreviewContenButton = (Button) findViewById(R.id.preview_content_button);
        openPreviewContenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                book.setBookDesc("Preview");
                renderClass.openePubBook(book);
                event.setEventType("bookOpen");
                renderClass.recordBookEvent(book, event);

            }
        });
        openDownloadedContentButton = (Button) findViewById(R.id.download_content_button);
        openDownloadedContentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                book.setBookDesc("Download");
                renderClass.openePubBook(book);
            }
        });

        Reader.recordBookEvent(new RecordBookEvent() {
            @Override
            public void recordBookEvent(Book book, Event event) {
                Log.d("Event ", event.getEventType());

            }
        });


    }
}
