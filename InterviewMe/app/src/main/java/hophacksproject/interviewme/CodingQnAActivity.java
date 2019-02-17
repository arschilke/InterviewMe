
package hophacksproject.interviewme;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class CodingQnAActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    final private String[][] qAndA = {{"How do you find the missing number in a given integer array of 1 to 100?",
            "How do you find the duplicate number on a given integer array?",
            "How do you find the largest and smallest number in an unsorted integer array?",
            "How do you find all pairs of an integer array whose sum is equal to a given number?",
            "How do you find duplicate numbers in an array if it contains multiple duplicates?",
            "How are duplicates removed from a given array in Java?",
            "How is an integer array sorted in place using the quicksort algorithm?",
            "How do you reverse an array in place?",
            // Linked List Questions
            "How do you find the middle element of a singly linked list in one pass?",
            "How do you reverse a linked list?",
            "How do you reverse a singly linked list without recursion?",
            "How are duplicate nodes removed in an unsorted linked list?",
            "How do you find the length of a singly linked list?",
            "How do you find the third node from the end in a singly linked list?",

            // String Questions:
            "How do you print duplicate characters from a string?",
            "How do you check if two strings are anagrams of each other?",
            "How do you print the first non-repeated character from a string?",
            "How can a given string be reversed using recursion?",
            "How do you check if a string contains only digits?",
            "How are duplicate characters found in a string?",
            "How do you count a number of vowels and consonants in a given string?",
            "How do you count the occurrence of a given character in a string?",
            "How do you reverse words in a given sentence without using any library method?",
            "How do you check if a given string is a palindrome?"
    },{"http://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html",
            "http://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html",
            "http://java67.blogspot.com/2014/02/how-to-find-largest-and-smallest-number-array-in-java.html",
            "http://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html",
            "http://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html",
            "http://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html",
            "http://javarevisited.blogspot.com/2014/08/quicksort-sorting-algorithm-in-java-in-place-example.html",
            "http://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html",
            "http://javarevisited.blogspot.com/2013/03/how-to-reverse-array-in-java-int-String-array-example.html",
            "http://javarevisited.blogspot.sg/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html",
            //linked list questions
            "http://javarevisited.blogspot.sg/2012/12/how-to-find-middle-element-of-linked-list-one-pass.html",
            "http://www.java67.com/2016/07/how-to-reverse-singly-linked-list-in-java-example.html",
            "http://javarevisited.blogspot.sg/2017/03/how-to-reverse-linked-list-in-java-using-iteration-and-recursion.html",
            "https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/",
            "http://javarevisited.blogspot.sg/2016/05/how-do-you-find-length-of-singly-linked.html",
            "http://javarevisited.blogspot.sg/2016/07/how-to-find-3rd-element-from-end-in-linked-list-java.html",
            //String questions
            "http://java67.blogspot.sg/2014/03/how-to-find-duplicate-characters-in-String-Java-program.html",
            "http://javarevisited.blogspot.sg/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html",
            "http://javarevisited.blogspot.sg/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html",
            "http://javarevisited.blogspot.sg/2012/01/how-to-reverse-string-in-java-using.html",
            "http://javarevisited.blogspot.sg/2012/10/regular-expression-example-in-java-to-check-String-number.html",
            "http://java67.blogspot.sg/2014/03/how-to-find-duplicate-characters-in-String-Java-program.html",
            "http://java67.blogspot.sg/2013/11/how-to-count-vowels-and-consonants-in-Java-String-word.html",
            "http://javarevisited.blogspot.sg/2012/12/how-to-count-occurrence-of-character-in-String.html",
            "http://java67.blogspot.com/2015/06/how-to-reverse-words-in-string-java.html",
            "http://java67.blogspot.com/2015/06/how-to-check-is-string-is-palindrome-in.html"


    }};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_qn_a);
        linearLayout = findViewById(R.id.ll2);


        for( int i = 0; i < qAndA[0].length; i++){

            final String text = qAndA[0][i];
            final String message = qAndA[1][i];
            Button btn = new Button(getApplicationContext());

            btn.setText(text);
            btn.setBackgroundColor(getResources().getColor(R.color.colorPrimaryLight));
            btn.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    methodAlert(text, message);
                }
            });
            linearLayout.addView(btn);
        }



    }
    public void methodAlert(String text, String message){
        Intent solution = new Intent(getApplicationContext(), CodingWeb.class);
        Bundle bun = new Bundle();
        bun.putString("url", message);
        bun.putString("Question", text);
        solution.putExtras(bun);

        startActivity(solution);
    }
}