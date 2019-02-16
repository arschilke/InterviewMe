package hophacksproject.interviewme;

import java.util.Random;

public class ChatResponse
{
    //questions in an array
    private String[] genQuestions = {"Tell me a little bit about yourself.",
            "Where do you see yourself in five years?",
            "Tell me about a challenge you've faced, how did you overcome it?"};
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
    private String[] collegeAppQuestions = {"Why are you interested in our School?", "What do" +
            " you plan to major in and why?", "What are your academic strengths?", "What are your" +
            " academic weaknesses and how do you overcome them?", "What do you plan to " +
            "contribute to this school?"};

    //key words in an array
    private String[] keyWords = {"um", "like", "well", "stuff", "things"};

    //save interviewee's name
    public String name;
    //type of interview flag
    public char iFlag; //'t' = tech, 'b' = business, 'c' = college
    private Random random;

    public ChatResponse(String name, char interviewFlag)
    {
        this.name = name;
        this.iFlag = interviewFlag;
        this.random = new Random();
    }


    public String beginInterview()
    {
        String str = "Hello, " + name + " my name is Steve, thanks for coming to see us " +
                "for your interview today. We are going to begin the interview today with a few " +
                "general questions. ";
        str += genQuestions[random.nextInt(genQuestions.length)];
        return str;
    }

    public String askGenQuestion()
    {
        return genQuestions[random.nextInt(genQuestions.length)];
    }

    public String askTechQuestion()
    {
        return techQuestions[random.nextInt(techQuestions.length)];
    }

    public String askBusinessQuestion()
    {
        return businessQuestions[random.nextInt(businessQuestions.length)];
    }

    public String askCollegeQuestion()
    {
        return collegeAppQuestions[random.nextInt(collegeAppQuestions.length)];
    }

    public int keyWordsInResponse(String response)
    {
        for(int i = 0; i < keyWords.length; i++)
            if(response.contains(keyWords[i]))
                return i;
         return -42;

    }

    public String analyzeResponse(String response)
    {
        String str = "";
        if(keyWordsInResponse(response) >= 0)
            str += "Try to avoid using words like '" + keyWords[keyWordsInResponse(response)]
                    + "' during your interview. ";

        if(response.length() > 150)
            str += "Your response was a little too long, try to keep your responses to about 60 " +
                    "seconds long. ";

        if(response.length() < 20)
            str += "Your response was a little too short, try to keep your responses about 60 " +
                    "seconds long. ";

        return str;
    }

}