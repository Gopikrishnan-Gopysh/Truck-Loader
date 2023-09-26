# Software Development 1, Coursework 1

This is individual-assessed coursework. You are allowed to discuss this assessment with other students, but you should not copy their code or share your own code with other students. We will carry out plagiarism checks on submissions.

## Objectives
This coursework contributes **20%** of your overall mark for the course. It assesses your understanding of the learning materials from the first half of the course, including:
- Using GitLab to pull and push code
- Creating, storing, and accessing variables
- Understanding the role of types
- Creating expressions from operators, variables and values
- Using conditional execution to implement decision-making
- Creating, storing to, accessing, and iterating through arrays
- Using loops to implement repetitive behaviour
- Nesting conditional execution within loops, or vice versa
  
These topics are all covered in the learning materials. You should work through the Canvas material and the lab exercises from the first five weeks of the course before attempting the coursework. These help build the understanding you need to complete the coursework.

## Submission

The deadline for completing this coursework is Monday, 23rd October. Make sure you do these two things:
1. Commit your work to GitLab before this deadline. If you don’t do this, a late penalty may be applied. There are instructions on using GitLab in the familiarisation tutorial.
2. Submit a link to your Gitlab repository on Canvas.
3. Attend the quiz related to this coursework in week 7.
   

### Do This First

Fork and Import the GitLab Project
You will be adding your code to an existing project in GitLab. The first thing you need to do is fork this project so that you’ll be working on your own copy and import it into Eclipse

1.	Fork the project
3.	Import your forked project into Eclipse

**Don’t forget to fork the project before you import it**

If you don’t do this, you won’t be able to save your changes back to Gitlab.

If you don’t know how to do any of this, then make sure you first work through the Gitlab tutorial, which will take you through the process step by step. If you’re having trouble getting it to work, then come to a timetabled lab session and talk to a lab helper well before the submission deadline.



## The Behaviour of Your Programme

The GitLab project contains a single class, TruckLoader.java, where you will add your code. You must write a very simple database implementation, which will read data records from the user, store them in arrays, and then allow the user to print out selected records according to some criteria.

Here’s an example of what your program’s behaviour could look like:
```

Welcome to Truck Loader
What is the maximum number of boxes that can fit inside the truck?
3
Please enter the customer name for box 1:
GreenTech
Please enter the weight(kg) for box 1:
50.4
Does box 1 contain dangerous goods (y/n)?
n
Please enter the customer name for box 2:
BioWave
Please enter the weight(kg) for box 2:
60.2
Does box 2 contain dangerous goods (y/n)?
y
Please enter the customer name for box 3:
GreenTech
Please enter the weight (kg) for box 3:
65.1
Does box 3 contain dangerous goods (y/n)?
n
All the information regarding the boxes has been entered.
List (a)ll boxes information, search boxes by (c)ustomer name or (d)angerous cargo, or (q)uit?
a
Here is the list of all the boxes:
Box 1 Customer name: GreenTech Weight kg):50.4 Non Dangerous Goods
Box 2 Customer name: BioWave Weight(kg):60.2 Dangerous Goods
Box 3 Customer name: GreenTech Weight(kg):65.1 Non Dangerous Goods
List (a)ll boxes information, search boxes by (c)ustomer name or (d)angerous cargo, or (q)uit?
c
What is the customer's name? greentech
Box 1 Customer name: GreenTech Weight (kg):50.4 Non Dangerous Goods
Box 3 Customer name: GreenTech Weight (kg):65.1 Non Dangerous Goods
List (a)ll boxes information, search boxes by (c)ustomer name or (d)angerous cargo, or (q)uit?
d
Search for (d)angerous or (n)on-dangerous? d
Box 2 Customer name: BioWave Weight (kg):60.2 Dangerous Goods
List (a)ll boxes information, search boxes by (c)ustomer name or (d)angerous cargo, or (q)uit?
q
Thank you for using the Truck Loader.
```

Specifically, you should write code so that:
- The user specifies how many boxes can fit in the truck, which sets how many data records will be read. 
- The customer’s name, weight and if the box contains a dangerous good, should then be sequentially read in from the user and stored in arrays.
  - This data should be stored in three separate arrays: one for customer names, one for weight, and one for dangerous goods, i.e. the first element of the names array should be the first box customer name, the first element of the weight array should be the weight of the first box, the first element of the dangerous goods array should be the if the first box contains dangerous goods.
  - To keep things simple, assuming that names will be entered as single words, as in the example, is okay. This will allow you to use Scanner’s next() method rather than nextLine()since the latter can be a bit troublesome.
- The dangerous goods array should be a boolean array, since this is more efficient than storing binary values as strings or characters.
  - That is, “Dangerous Goods” should be stored as true, and “Non-Dangerous Goods” should be stored as false.
- Once the user has finished entering the data, they should be given the option to:
  - List all the entries in the database. You can print every box information, as in the example.
  - List all the entries that match a customer name, as specified by the user.
  - List all the entries that match a particular Dangerous or Non-Dangerous Goods, as specified by the user. 
  - Quit, at which point the program should display a farewell message and exit.
- The program should keep asking the user what they want to do until they choose to exit.
  - You will need an outer loop to implement this behaviour.
  - Note that your program will automatically exit when execution reaches the end of the main method. You should not use `System.exit()` to achieve this.
  
As usual, it is recommended that you commit your changes to GitLab every time you get something working. Restoring the earlier working version will be easy if you break the code later. Once you’ve finished, make sure you commit your code to GitLab before you submit on canvas. If you have not finished everything, please commit to what you have been able to finish. 


## Marks
You will get a mark out of 10 for your work. Here is a guide to how your work will be marked, though the final mark is up to the person marking your work and will reflect the understanding of the course materials shown in your work:
- 3 marks for correctly reading data from the user and storing it in arrays
- 3 marks for correctly accessing the arrays and displaying the correct data
- 2 marks for correctly implementing the user interface
- 1 mark for programming style, including whether you’ve made good design choices, how your code is formatted and commented, and whether it follows Java’s naming conventions 
- 1 mark for using GitLab correctly, i.e. forking, checking out the code stub, and committing

>Late submissions will be marked according to the university's late submissions policy, i.e. a 30% deduction if submitted within 5 working days of the original deadline, and no mark after that.
If you have mitigating circumstances (e.g. illness), please submit a mitigating circumstances application, as described at:
https://www.hw.ac.uk/students/studies/examinations/mitigating-circumstances.htm

