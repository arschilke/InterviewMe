// This file contains the data for the InterviewMe Alexa Skill
// The functional file that uses this information is index.js

/*
* Interview tips section
*/
const collegeInterviewTips = [
  "Bring specific questions to the table about the school to show your interest.",
  "Put some energy into coming up with creative questiopns with answers that cannot be easily found on the college's website",
  "Practice, practice, practice!",
  "Be yourself. Remember the key to getting admitted and being happy at college is finding your best fit school",
  "Before the interview, think about why the school appeals to you, what you want to study, and what you might do after graduation",
  "Wear what makes you feel comfortable and confident! But makes sure you wear something that makes you look professional, mature, and poised.",
  "Send a thank you e-mail after the interview and let your interviewer know that you are thankful that they took the time to meet with you"
];

const jobInterviewTips = [
  "Research the company, research the position you are applying for, and practive interviewing!",
  "Wear simple clothes that are appropriate for the position you are applying for.",
  "Keep to your middle school dress code; nothing too revealing, no open-toed sandals, and such.",
  "Stay calm. Anxiety will cause you to lose focus on what is being asked or your own train of thought.",
  "Be confident in yourself and your abilities.",
  "Incorporate what you know about the company in your responses",
  "Listen, take notes, and be honest!",
  "Use the STAR method when responding to questions to ace the interview. Describe the situation, task, action, and result.",
  "Figure out your strengths and weaknesses before the interview to be prepared",
  "Anticipate the interviewer's concerns and expectations.",
  "Research about the company's competitiors and their industry."
];

/*
* Job Interveiw Questions Section
*/
const generalJobQuestions = [
  "Can you tell me a little about yourself?",
  "What do you know about the company?",
  "Why do you want to work here?",
  "Why should we hire you?",
  "Where do you see yourself in 5 years?",
  "Tell me about a challenge you’ve faced, and how you dealt with it.",
  "Tell me about a time that you demonstrated leadership.",
  "What are your hobbies outside of work?"
];

const codingQuestions = [
  // Array based questions
  "How do you find the missing number in a given integer array of 1 to 100?",
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
];

const techInterviewQuestions = [
  "What programming languages are you most familiar with?",
  "Tell me about a project you worked on where you coded using object-oriented programming.",
  "Tell me about your latest project.",
  "Tell me about a time where you worked in a group to develop a program.",
  "How you keep your technology skills current?",
  "What are your favorite and least favorite technology products?",
  "Tell me about a tech project that you've worked on in your spare time.",
  "What development tools have you used?",
  "What would you hope to achieve in the first six months after being hired?",
  "What do you know about our company?",
  "Tell me about a time where you were a leader in a project and what you accomplished?",
  "Why do you want this position?",
  "Why should we hire you, what can you bring to our company?"
];

const businessQuestions = [
  "Do you work well under pressure and with deadlines? Give me an example.",
  "What qualifications do you have that make you think you will be successful in this business",
  "Have you ever had a conflict with a boss or professor? How did you resolve it?",
  "Tell me about a situation where you had to make a decision without much information.",
  "What do you know about our company?",
  "Why should we hire you? What can you bring to our company?",
  "Explain a time where technology helped you solve an organizational issue",
  "What is the biggest risk you have taken?",
  "Describe a time where you used technology to accomplish a difficult task",
  "Why do you want to join our team?",
  "What is your biggest weakness? How have you addressed it?",
  "When was a time you worked on a team?",
  "Why would you be a good fit for us?",
  "What teams have you been on where you took on a leadership role?",
  "Describe a time you used data. What was the result of your analysis?",
  "How would you plan to market our products?",
  "If you graduated right now, what types of companies would you be applying for?"
];

const miscQuestions = [

];

// Final question in practice interview
const finalQuestion = "Do you have any questions for us?";

/*
* College Interview Questions Section
*/
const collegeInterviewQuestions = [
  "Why are you interested in our school?",
  "Tell me about youself.",
  "What is your favorite subject in school and why?",
  "What do you enjoy doing when you are not in class?",
  "What clubs or extracurriculars re you a part of outside of class?",
  "What is an example of an obstacle, a failure, or a mistake that you have learned from?",
  "What are three interesting things about you that I wouldn't know from your application?",
  "What do you expect to be doing 10 years from now?",
  "What would you change about your high school?",
  "What leadership roles have you taken on at your school?",
  "Walk me through your resume.",
  "Why are you interested in this college?",
  "What do you plan to major in and why?",
  "Whom do you most admire?",
  "What is your favorite book and why?",
  "Why do you want to go to college?",
  "What do you like to do for fun?",
  "What makes you unique?",
  "Describe a time where you faced adversity and how you overcame it",
  "What are your academic strengths?",
  "What are you academic weaknesses and how do you overcome them?",
  "What do you plan to contribute to this school?"
];

exports.generalJobQuestions = generalJobQuestions;
