package com.example.rypta.nthexam;

import android.graphics.Bitmap;

import java.util.Date;

public class Profile {
    String Name;

    public Profile(String name, String sequenceNumber, String createddate, String examName) {
        Name = name;
        SequenceNumber = sequenceNumber;
        this.createddate = createddate;
        ExamName = examName;
    }

    String SequenceNumber;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSequenceNumber() {
        return SequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        SequenceNumber = sequenceNumber;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public String getExamName() {
        return ExamName;
    }

    public void setExamName(String examName) {
        ExamName = examName;
    }

    String createddate;
    String ExamName;
}
