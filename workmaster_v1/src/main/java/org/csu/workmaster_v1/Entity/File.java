package org.csu.workmaster_v1.Entity;

public class File {
    public long FileId;
    public File file;
    public long Uploader;
    public long TaskId;

    
    public File(long fileId, File file, long uploader, long taskId) {
        FileId = fileId;
        this.file = file;
        Uploader = uploader;
        TaskId = taskId;
    }

    public long getFileId() {
        return FileId;
    }

    public void setFileId(long fileId) {
        FileId = fileId;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public long getUploader() {
        return Uploader;
    }

    public void setUploader(long uploader) {
        Uploader = uploader;
    }

    public long getTaskId() {
        return TaskId;
    }

    public void setTaskId(long taskId) {
        TaskId = taskId;
    }
}
