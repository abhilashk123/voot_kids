package com.impelsys.readersdk;

import android.content.Context;
import android.content.Intent;

/**
 * Created by comp5 on 17-05-2018.
 */

public class RenderClass {
    private Context context;
    private Book book;
    private Event event;


    public RenderClass(Context context) {
        this.context = context;
    }


    public void openePubBook(Book book) {
        Intent intent = new Intent(context, Reader.class);
        intent.putExtra("Type", book.getBookDesc());
        intent.putExtra("content_path",book.getContentPath());
        context.startActivity(intent);
    }


    public  void recordBookEvent(Book book,Event event) {
        book = book;
        event = event;
    }
}
