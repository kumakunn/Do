package org.csu.workmaster_v1.Entity;

public class File {
    public long fileid;
    public File file;
    public long uploader;
    public long taskid;

    public File(long fileid, File file, long uploader, long taskid) {
        this.fileid = fileid;
        this.file = file;
        this.uploader = uploader;
        this.taskid = taskid;
    }

    public long getFileid() {
        return fileid;
    }

    public void setFileid(long fileid) {
        this.fileid = fileid;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public long getUploader() {
        return uploader;
    }

    public void setUploader(long uploader) {
        this.uploader = uploader;
    }

    public long getTaskid() {
        return taskid;
    }

    public void setTaskid(long taskid) {
        this.taskid = taskid;
    }
}
