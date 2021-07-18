package com.work.bean;

/**
 * Created by Peacoke on 2021/7/16.
 */
public class Score {

    private String sid;
    private String cid;
    private long score;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "sid='" + sid + '\'' +
                ", cid='" + cid + '\'' +
                ", score=" + score +
                '}';
    }
}
