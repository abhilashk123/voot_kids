package com.impelsys.readersdk;

/**
 * Created by comp5 on 18-05-2018.
 */

public class Book {
    private String bookId,bookTitle,bookDesc,bookDownloadStatus,contentPath,bookCoverArtPath;
    private boolean isPreviewContent;

    public Book() {
    }

    public Book(String bookId, String bookTitle, String bookDesc, String bookDownloadStatus, String contentPath, String bookCoverArtPath, boolean isPreviewContent) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookDesc = bookDesc;
        this.bookDownloadStatus = bookDownloadStatus;
        this.contentPath = contentPath;
        this.bookCoverArtPath = bookCoverArtPath;
        this.isPreviewContent = isPreviewContent;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public String getBookDownloadStatus() {
        return bookDownloadStatus;
    }

    public void setBookDownloadStatus(String bookDownloadStatus) {
        this.bookDownloadStatus = bookDownloadStatus;
    }

    public String getContentPath() {
        return contentPath;
    }

    public void setContentPath(String contentPath) {
        this.contentPath = contentPath;
    }

    public String getBookCoverArtPath() {
        return bookCoverArtPath;
    }

    public void setBookCoverArtPath(String bookCoverArtPath) {
        this.bookCoverArtPath = bookCoverArtPath;
    }

    public boolean isPreviewContent() {
        return isPreviewContent;
    }

    public void setPreviewContent(boolean previewContent) {
        isPreviewContent = previewContent;
    }
}
