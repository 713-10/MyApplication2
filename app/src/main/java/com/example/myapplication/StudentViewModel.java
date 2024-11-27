package com.example.myapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StudentViewModel extends ViewModel {
    private final MutableLiveData<Student> student = new MutableLiveData<>();

    public void setStudent(Student newStudent) {
        student.setValue(newStudent);
    }

    public LiveData<Student> getStudent() {
        return student;
    }
}