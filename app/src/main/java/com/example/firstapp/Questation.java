package com.example.firstapp;

public class Questation {
    public String mquestion[]=
            {
                    " Yasir is fifteen years elder than Mujtaba. Five years ago, Yasir was three times as old as Mujtaba. Then Yasir’s present age will be:",
                    " Ten years ago, the age of a person’s mother was three times the age of her son. Ten years hence, the mother’s age will be two times the age of her son. The ratio of their present ages will be:",
                    "The age of a man is 24 years more than his son. In two years, the father’s age will be twice that of his son. Then the present age of his son is:",
                    "After 15 years Ramesh’s age will be 5 times his age 5 years ago. What is the present age of Ramesh?"
            };
    private String mchoice[][]=
    {
            {"29 years"," 30 years ","31 years","32 years"},
            {"10:19 "," 9:5 ","7:4","7:3"},
            {"18 years"," 21 years ","22 years","24 years"},
            {"5 years","10 years","15 years","20 years"}

    };
    private String mcorrect[]={"29 years","7:3","22 years","10 years"};
    public String getQuestion(int a)
    {
        String question=mquestion[a];
        return question;
    }
    public String getchoice1(int a)
    {
        String choice=mchoice[a][0];
        return choice;
    }
    public String getchoice2(int a)
    {
        String choice=mchoice[a][1];
        return choice;
    }
    public String getchoice3(int a)
    {
        String choice=mchoice[a][2];
        return choice;
    }
    public String getchoice4(int a)
    {
        String choice=mchoice[a][3];
        return choice;
    }
    public String getcorrect(int a)
    {
        String ans=mcorrect[a];
        return ans;
    }
}
