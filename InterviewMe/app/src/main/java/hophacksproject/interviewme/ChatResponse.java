package hophacksproject.interviewme;

import java.util.Iterator;
import java.util.Random;
import java.util.ArrayList;

public class ChatResponse
{
    //questions in an array
    private String[] genQuestions = {"Tell me a little bit about yourself.",
            "Where do you see yourself in five years?",
            "Tell me about a challenge you've faced, how did you overcome it?", "If I asked your " +
            "best friend to describe you in three words, how do you think they would do it?",
            "What is something you want me to know about you that isn't on your application" +
            " or resume?", "How did you become interested in your field of study?",
            "What have been some of your favorite courses that you have taken thus far?",
            "Who do you consider a role model?", "What is your favorite book?"};
    private String[] techQuestions = {"What programming language are you most familiar with?",
            "How do you keep your technology skills current?", "What are you favorite and least " +
            "favorite technology products?", "Tell me about a tech project that you've worked on" +
            " in your spare time.", "What development tools have you used?", "What do you know " +
            "about our company?", "Why do you want this position?", "Why should we hire you, what" +
            " can you bring to our company?"};
    private String[] businessQuestions = {"Do you work well under pressure, deadlines, etc.? Give" +
            " me an example.", "What qualifications do you have that make you think you will be " +
            "successful in this business?", "Have you ever had a conflict with a boss or " +
            "professor? How did you resolve it?", "Tell me about a situation where you had to" +
            " make a decision without much information.", "What do you know about our company?",
            "Why do you want this position?", "Why should we hire you, what can you bring to our " +
            "company?"};
    private String[] collegeAppQuestions = {"Why are you interested in our school?", "What do" +
            " you plan to major in and why?", "What are your academic strengths?", "What are your" +
            " academic weaknesses and how do you overcome them?", "What do you plan to " +
            "contribute to this school?", "What would you change about your high school?",
            "Why do you want to go to college?"};

    //key words in an array
    private String[] keyWords = {"um", "like", "well", "stuff", "things", "uh", "ugh"};

    private ArrayList<Integer> usedGenQuestions;
    private ArrayList<Integer> usedTechQuestions;
    private ArrayList<Integer> usedBusQuestions;
    private ArrayList<Integer> usedColAppQuestions;

    public String name;
    public char iFlag; //'t' = tech, 'b' = business, 'c' = college
    private Random random;

    public ChatResponse(String name, char interviewFlag)
    {
        this.name = name;
        this.iFlag = interviewFlag;
        this.random = new Random();
        this.usedGenQuestions = new ArrayList<>();
        this.usedTechQuestions = new ArrayList<>();
        this.usedBusQuestions = new ArrayList<>();
        this.usedColAppQuestions = new ArrayList<>();
    }


    public String beginInterview()
    {
        String str = name + ", my name is Steve, it's nice to meet you, thanks for coming to see" +
                " us for your interview today. We are going to begin the interview today with a " +
                "few general questions. ";
        int i = random.nextInt(genQuestions.length);
        this.usedGenQuestions.add(i);
        str += genQuestions[i];
        return str;
    }

    public String askGenQuestion()
    {
        int i = random.nextInt(genQuestions.length);
        while(usedGenQuestions.contains(i))
            i = random.nextInt(genQuestions.length);

        this.usedGenQuestions.add(i);
        return genQuestions[i];
    }

    private String askTechQuestion()
    {
        int i = random.nextInt(techQuestions.length);
        while(usedTechQuestions.contains(i))
            i = random.nextInt(techQuestions.length);

        this.usedTechQuestions.add(i);
        return techQuestions[i];
    }

    private String askBusinessQuestion()
    {
        int i = random.nextInt(businessQuestions.length);
        while(usedBusQuestions.contains(i))
            i = random.nextInt(businessQuestions.length);

        this.usedBusQuestions.add(i);
        return businessQuestions[i];
    }

    private String askCollegeQuestion()
    {
        int i = random.nextInt(collegeAppQuestions.length);
        while(usedColAppQuestions.contains(i))
            random.nextInt(businessQuestions.length);

        this.usedColAppQuestions.add(i);
        return collegeAppQuestions[i];
    }

    public String askTypeQuestion()
    {
        if(iFlag == 't')
            return this.askTechQuestion();
        else if(iFlag == 'b')
            return this.askBusinessQuestion();
        else if(iFlag == 'c')
            return askCollegeQuestion();
        else
            return askGenQuestion();

    }


    public ArrayList<Integer> keyWordsInResponse(String response)
    {
        ArrayList<Integer> indexes = new ArrayList<>();
        for(int i = 0; i < keyWords.length; i++)
            if(response.contains(keyWords[i]))
                indexes.add(i);
         return indexes;

    }

    public String analyzeResponse(String response)
    {
        String str = "";
        ArrayList<Integer> indexes = keyWordsInResponse(response);
        if(!indexes.isEmpty())
        {
            str += "Try to avoid using words like ";
            for(Iterator<Integer> iter = indexes.iterator(); iter.hasNext();)
             str +=  " '" + keyWords[iter.next()] + "' ";
            str += " during your interview. ";
        }

        if(response.length() > 150)
            str += "Your response was a little too long, try to keep your responses to about 60 " +
                    "seconds long, as you do not want to come off as self-centered or " +
                    "braggadocious.";

        if(response.length() < 20)
            str += "Your response was a little too short, try to keep your responses about 60 " +
                    "seconds long, it is important to let the interviewer get to know you so " +
                    "that they are able to determine that you are the best candidate for the job. ";

        return str;
    }

}
