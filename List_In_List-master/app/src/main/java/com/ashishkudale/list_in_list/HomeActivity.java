package com.ashishkudale.list_in_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.ashishkudale.list_in_list.adapters.SubjectAdapter;
import com.ashishkudale.list_in_list.models.Chapter;
import com.ashishkudale.list_in_list.models.Subject;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements RecyclerViewClickListner{

    private RecyclerView rvSubject;
    private SubjectAdapter subjectAdapter;
    private ArrayList<Subject> subjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

        subjects = prepareData();

        subjectAdapter = new SubjectAdapter(subjects, this, this );
        rvSubject.setAdapter(subjectAdapter);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvSubject.setLayoutManager(manager);


    }

    private void initComponents() {
        rvSubject = findViewById(R.id.rvSubject);
    }

    private ArrayList<Subject> prepareData() {
        ArrayList<Subject> subjects = new ArrayList<Subject>();

        Subject city = new Subject();
        city.subjectName = "City_name";
        city.chapters = new ArrayList<Chapter>();

        Chapter chapter1 = new Chapter();
        chapter1.chapterName = "Delhi";
//        chapter1.isSelected = "false";

        Chapter chapter2 = new Chapter();
        chapter2.chapterName = "Mumbai";
//        chapter2.isSelected = "false";

        Chapter chapter3 = new Chapter();
        chapter3.chapterName = "Gurgaon";
//        chapter3.isSelected = "false";

        Chapter chapter4 = new Chapter();
        chapter4.chapterName = "Chennai";
//        chapter4.isSelected = "false";

        Chapter chapter5 = new Chapter();
        chapter5.chapterName = "Kolkata";
//        chapter5.isSelected = "false";

        city.chapters.add(chapter1);
        city.chapters.add(chapter2);
        city.chapters.add(chapter3);
        city.chapters.add(chapter4);
        city.chapters.add(chapter5);



        Subject fruit = new Subject();
        fruit.subjectName = "Fruit name";
        fruit.chapters = new ArrayList<Chapter>();

        Chapter chapter6 = new Chapter();
        chapter6.chapterName = "Anar";
//        chapter6.isSelected = "false";


        Chapter chapter7 = new Chapter();
        chapter7.chapterName = "Mango";
//        chapter7.isSelected = "false";


        Chapter chapter8 = new Chapter();
        chapter8.chapterName = "litchi";
//        chapter8.isSelected = "false";

        Chapter chapter9 = new Chapter();
        chapter9.chapterName = "orange";
//        chapter9.isSelected = "false";

        Chapter chapter20 = new Chapter();
        chapter20.chapterName = "kiwi";
//        chapter20.isSelected = "false";

        Chapter chapter21 = new Chapter();
        chapter21.chapterName = "straberry";
//        chapter21.isSelected = "false";

        Chapter chapter22 = new Chapter();
        chapter22.chapterName = "banana";
//        chapter22.isSelected = "false";

        fruit.chapters.add(chapter6);
        fruit.chapters.add(chapter7);
        fruit.chapters.add(chapter8);
        fruit.chapters.add(chapter9);
        fruit.chapters.add(chapter20);
        fruit.chapters.add(chapter21);
        fruit.chapters.add(chapter22);

        Subject name = new Subject();
        name.subjectName = "UC_person_name";
        name.chapters = new ArrayList<Chapter>();

        Chapter chapter10 = new Chapter();
        chapter10.chapterName = "Sachin";
//        chapter10.isSelected = "false";

        Chapter chapter11 = new Chapter();
        chapter11.chapterName = "Vivek";
//        chapter11.isSelected = "false";

        Chapter chapter12 = new Chapter();
        chapter12.chapterName = "Akash";
//        chapter12.isSelected = "false";

        Chapter chapter13 = new Chapter();
        chapter13.chapterName = "shrey";
//        chapter13.isSelected = "false";

        Chapter chapter31 = new Chapter();
        chapter31.chapterName = "Harshit";
//        chapter31.isSelected = "false";

        Chapter chapter32 = new Chapter();
        chapter32.chapterName = "Rohan";
//        chapter32.isSelected = "false";

        Chapter chapter33 = new Chapter();
        chapter33.chapterName = "Satyam";
//        chapter33.isSelected = "false";

        Chapter chapter34 = new Chapter();
        chapter34.chapterName = "Akhil";
//        chapter34.isSelected = "false";


        name.chapters.add(chapter10);
        name.chapters.add(chapter11);
        name.chapters.add(chapter12);
        name.chapters.add(chapter13);
        name.chapters.add(chapter31);
        name.chapters.add(chapter32);
        name.chapters.add(chapter33);
        name.chapters.add(chapter34);

        Subject sport = new Subject();
        sport.subjectName = "Sports name";
        sport.chapters = new ArrayList<Chapter>();

        Chapter chapter14 = new Chapter();
        chapter14.chapterName = "Cricket";
//        chapter14.isSelected = "false";

        Chapter chapter15 = new Chapter();
        chapter15.chapterName = "football";
//        chapter15.isSelected = "false";

        Chapter chapter16 = new Chapter();
        chapter16.chapterName = "hockey";
//        chapter16.isSelected = "false";

        Chapter chapter17 = new Chapter();
        chapter17.chapterName = "wrestling";
//        chapter17.isSelected = "false";

        Chapter chapter18 = new Chapter();
        chapter18.chapterName = "Boxing";
//        chapter18.isSelected = "false";

        sport.chapters.add(chapter14);
        sport.chapters.add(chapter18);
        sport.chapters.add(chapter15);
        sport.chapters.add(chapter16);
        sport.chapters.add(chapter17);


        Subject name11 = new Subject();
        name11.subjectName = "UC_person_name";
        name11.chapters = new ArrayList<Chapter>();
        Chapter chapter101 = new Chapter();
        chapter101.chapterName = "Sachin";
        name11.chapters.add(chapter101);


        Subject name12 = new Subject();
        name12.subjectName = "UC_person_name";
        name12.chapters = new ArrayList<Chapter>();
        Chapter chapter102 = new Chapter();
        chapter102.chapterName = "Sachin";
        name12.chapters.add(chapter102);

        Subject name13 = new Subject();
        name13.subjectName = "UC_person_name";
        name13.chapters = new ArrayList<Chapter>();
        Chapter chapter103 = new Chapter();
        chapter103.chapterName = "Sachin";
        name13.chapters.add(chapter103);

        Subject name14 = new Subject();
        name14.subjectName = "UC_person_name";
        name14.chapters = new ArrayList<Chapter>();
        Chapter chapter104 = new Chapter();
        chapter14.chapterName = "Sachin";
        name14.chapters.add(chapter104);


        Subject name15 = new Subject();
        name15.subjectName = "UC_person_name";
        name15.chapters = new ArrayList<Chapter>();
        Chapter chapter105 = new Chapter();
        chapter105.chapterName = "Sachin";
        name15.chapters.add(chapter105);

        Subject name16 = new Subject();
        name16.subjectName = "UC_person_name";
        name16.chapters = new ArrayList<Chapter>();
        Chapter chapter106 = new Chapter();
        chapter106.chapterName = "Sachin";
        name16.chapters.add(chapter106);

        Subject name17 = new Subject();
        name17.subjectName = "UC_person_name";
        name17.chapters = new ArrayList<Chapter>();
        Chapter chapter107 = new Chapter();
        chapter107.chapterName = "Sachin";
        name17.chapters.add(chapter107);

        Subject name18 = new Subject();
        name18.subjectName = "UC_person_name";
        name18.chapters = new ArrayList<Chapter>();
        Chapter chapter108 = new Chapter();
        chapter108.chapterName = "Sachin";
        name18.chapters.add(chapter108);


        subjects.add(city);
        subjects.add(fruit);
        subjects.add(sport);
        subjects.add(name);
        subjects.add(name11);
        subjects.add(name12);
        subjects.add(name13);
        subjects.add(name14);
        subjects.add(name15);
        subjects.add(name16);
        subjects.add(name17);
        subjects.add(name18);


        return subjects;
    }

    @Override
    public void OnClickOnItem(int position) {
        Toast.makeText(this,"position clicked is  "+position,Toast.LENGTH_SHORT).show();
    }
}
