import java.awt.event.*;
import java.awt.*;
import javax.swing.*;






public class Quiz1 implements ActionListener{

    String[] question={
            "Who is known as father of java programming language ?",
            "In which year java was developed ?",
            "Which of the following is not a java features ?",
            "Which of the following are not java keywords ?",
            "Data type long literal are appended by ?"


    };
    String[][] options={
            {"James gosling","M.P java","Charles Babbage","Blais Pascal"},
            {"1993","1995","1990","1997"},
            {"Dynamic","Architecture Neutral","Use of pointers","Object-oriented"},
            {"double","switch","then","instanceof"},
            {"Uppercase L","Lowercase L","Long","Both A and B"}

    };
    char[] answers=    {
            'A',
            'B',
            'C',
            'C',
            'D'

    };

    String[] question1={
            "Which of the following is not a java features ?",
            "Which of the following are not java keywords ?",
            "Data type long literal are appended by ?",
            "Who is known as father of java programming language ?",
            "In which year java was developed ?"


    };
    String[][] options1={
            {"Object-oriented","Use of pointers","Architecture Neutral","Dynamic"},
            {"then","double","instanceof","switch"},
            {"Lowercase L","Uppercase L","Both A and B","Long"},
            {"M.P java","James gosling","Blais Pascal","Charles Babbage"},
            {"1990","1993","1997","1995"}

    };
    char[] answers1={
            'B',
            'A',
            'C',
            'B',
            'D'

    };

    String[] question2={
            "In which year java was developed ?",
            "Data type long literal are appended by ?",
            "Who is known as father of java programming language ?",
            "Which of the following is not a java features ?",
            "Which of the following are not java keywords ?"


    };
    String[][] options2={
            {"1995","1997","1993","1990"},
            {"Both C and D","Long","Uppercase L","Lowercase L"},
            {"Charles Babbage","Blais Pascal","James gosling","M.P java"},
            {"Architecture Neutral","Dynamic","Object-oriented","Use of pointers"},
            {"instanceof","then","switch","double"}

    };
    char[] answers2={
            'A',
            'A',
            'C',
            'D',
            'B'

    };

    String[] question3={

            "Data type long literal are appended by ?",
            "Who is known as father of java programming language ?",
            "Which of the following are not java keywords ?",
            "In which year java was developed ?",
            "Which of the following is not a java features ?"


    };
    String[][] options3={
            {"Long","Both C and D","Lowercase L","Uppercase L"},
            {"Blais Pascal","Charles Babbage","M.P java","James gosling"},
            {"switch","instanceof","double","then"},
            {"1997","1990","1995","1993"},
            {"Use of pointers","Object-oriented","Dynamic","Architecture Neutral"}

    };
    char[] answers3={
            'B',
            'D',
            'D',
            'C',
            'A'

    };

    char answer;
    int index;
    int correct_guess=0;
    int total_questions=question.length;
    int result;

    JFrame frame=new JFrame();
    JTextField textfield=new JTextField();
    JTextArea textarea=new JTextArea();
    JButton buttonA=new JButton();
    JButton buttonB=new JButton();
    JButton buttonC=new JButton();
    JButton buttonD=new JButton();
    JLabel answer_labelA=new JLabel();
    JLabel answer_labelB=new JLabel();
    JLabel answer_labelC=new JLabel();
    JLabel answer_labelD=new JLabel();
    JLabel NAME=new JLabel();
    JLabel ROLL_NO=new JLabel();
    JTextField number_right=new JTextField();
    JTextField percentage=new JTextField();

    public Quiz1() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1535,830);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(null);
        frame.setResizable(true);

        textfield.setBounds(0,0,1535,75);
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(255,255,0));
        textfield.setFont(new Font("Ink Free",Font.BOLD,60));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);


        textarea.setBounds(0,75,1535,75);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(new Color(25,25,25));
        textarea.setForeground(new Color(0,255,255));
        textarea.setFont(new Font("MV Boli",Font.BOLD,50));
        textarea.setBorder(BorderFactory.createBevelBorder(1));
        textarea.setEditable(false);


        buttonA.setBounds(0,170,100,75);
        buttonA.setFont(new Font("MV Boli",Font.BOLD,65));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        buttonB.setBounds(765,170,100,75);
        buttonB.setFont(new Font("MV Boli",Font.BOLD,65));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");

        buttonC.setBounds(0,360,100,75);
        buttonC.setFont(new Font("MV Boli",Font.BOLD,65));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");

        buttonD.setBounds(765,360,100,75);
        buttonD.setFont(new Font("MV Boli",Font.BOLD,65));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setText("D");

        answer_labelA.setBounds(125,170,750,75);
        answer_labelA.setBackground(new Color(50,50,50));
        answer_labelA.setForeground(new Color(25,255,0));
        answer_labelA.setFont(new Font("MV Boli",Font.PLAIN,65));


        answer_labelB.setBounds(890,170,750,75);
        answer_labelB.setBackground(new Color(50,50,50));
        answer_labelB.setForeground(new Color(25,255,0));
        answer_labelB.setFont(new Font("MV Boli",Font.PLAIN,65));


        answer_labelC.setBounds(125,360,750,75);
        answer_labelC.setBackground(new Color(50,50,50));
        answer_labelC.setForeground(new Color(25,255,0));
        answer_labelC.setFont(new Font("MV Boli",Font.PLAIN,65));


        answer_labelD.setBounds(890,360,750,75);
        answer_labelD.setBackground(new Color(50,50,50));
        answer_labelD.setForeground(new Color(25,255,0));
        answer_labelD.setFont(new Font("MV Boli",Font.PLAIN,65));

        NAME.setBounds(0,265,1535,75);
        NAME.setBackground(new Color(50,50,50));
        NAME.setForeground(new Color(255,255,255));
        NAME.setFont(new Font("MV Boli",Font.PLAIN,65));
        NAME.setBorder(BorderFactory.createBevelBorder(1));
        NAME.setHorizontalAlignment(JTextField.CENTER);
        NAME.setVisible(false);


        ROLL_NO.setBounds(0,365,1535,75);
        ROLL_NO.setBackground(new Color(50,50,50));
        ROLL_NO.setForeground(new Color(255,255,255));
        ROLL_NO.setFont(new Font("MV Boli",Font.PLAIN,65));
        ROLL_NO.setBorder(BorderFactory.createBevelBorder(1));
        ROLL_NO.setHorizontalAlignment(JTextField.CENTER);
        ROLL_NO.setVisible(false);


        number_right.setBounds(600,465,300,100);
        number_right.setBackground(new Color(25,25,25));
        number_right.setForeground(new Color(200,100,255));
        number_right.setFont(new Font("MV Boli",Font.BOLD,45));
        number_right.setBorder(BorderFactory.createBevelBorder(1));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);
        number_right.setVisible(false);

        percentage.setBounds(600,560,300,100);
        percentage.setBackground(new Color(25,25,25));
        percentage.setForeground(new Color(255,150,0));
        percentage.setFont(new Font("MV Boli",Font.BOLD,28));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);
        percentage.setVisible(false);


        frame.add(answer_labelA);
        frame.add(answer_labelB);
        frame.add(answer_labelC);
        frame.add(answer_labelD);
        frame.add(NAME);
        frame.add(ROLL_NO);
        frame.add(number_right);
        frame.add(percentage);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(textarea);
        frame.add(textfield);
        frame.setVisible(true);

        nextQuestion();
    }
    public void nextQuestion(){
        if((Main.t1.getText().equals("jagan"))&&(Main.t2.getText().equals("2020PECCS293"))) {
            if (index >= total_questions) {
                results();
            } else {
                textfield.setText("Question No:" + (index + 1));
                textarea.setText(question[index]);
                answer_labelA.setText(options[index][0]);
                answer_labelB.setText(options[index][1]);
                answer_labelC.setText(options[index][2]);
                answer_labelD.setText(options[index][3]);
            }
        }else if((Main.t1.getText().equals("jagadeesh"))&&(Main.t2.getText().equals("2020PECCS292"))) {
            if (index >= total_questions) {
                results();
            } else {
                textfield.setText("Question No:" + (index + 1));
                textarea.setText(question1[index]);
                answer_labelA.setText(options1[index][0]);
                answer_labelB.setText(options1[index][1]);
                answer_labelC.setText(options1[index][2]);
                answer_labelD.setText(options1[index][3]);
            }
        }else if((Main.t1.getText().equals("tharani"))&&(Main.t2.getText().equals("2020PECCS197"))) {
            if (index >= total_questions) {
                results();
            } else {
                textfield.setText("Question No:" + (index + 1));
                textarea.setText(question2[index]);
                answer_labelA.setText(options2[index][0]);
                answer_labelB.setText(options2[index][1]);
                answer_labelC.setText(options2[index][2]);
                answer_labelD.setText(options2[index][3]);
            }
        }
        else {
            if (index >= total_questions) {
                results();
            } else {
                textfield.setText("Question No:" + (index + 1));
                textarea.setText(question3[index]);
                answer_labelA.setText(options3[index][0]);
                answer_labelB.setText(options3[index][1]);
                answer_labelC.setText(options3[index][2]);
                answer_labelD.setText(options3[index][3]);
            }
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
        if ((Main.t1.getText().equals("jagan")) && (Main.t2.getText().equals("2020PECCS293")))
        {
            if (e.getSource() == buttonA) {
                answer = 'A';
                if (answer == answers[index]) {
                    correct_guess++;
                }
            }

            if (e.getSource() == buttonB) {
                answer = 'B';
                if (answer == answers[index]) {
                    correct_guess++;
                }
            }
            if (e.getSource() == buttonC) {
                answer = 'C';
                if (answer == answers[index]) {
                    correct_guess++;
                }
            }
            if (e.getSource() == buttonD) {
                answer = 'D';
                if (answer == answers[index]) {
                    correct_guess++;
                }
            }
        }else if ((Main.t1.getText().equals("jagadeesh")) && (Main.t2.getText().equals("2020PECCS292"))) {
            if (e.getSource() == buttonA) {
                answer = 'A';
                if (answer == answers1[index]) {
                    correct_guess++;
                }
            }

            if (e.getSource() == buttonB) {
                answer = 'B';
                if (answer == answers1[index]) {
                    correct_guess++;
                }
            }
            if (e.getSource() == buttonC) {
                answer = 'C';
                if (answer == answers1[index]) {
                    correct_guess++;
                }
            }
            if (e.getSource() == buttonD) {
                answer = 'D';
                if (answer == answers1[index]) {
                    correct_guess++;
                }
            }
        }else if ((Main.t1.getText().equals("tharani")) && (Main.t2.getText().equals("2020PECCS197"))) {
            if (e.getSource() == buttonA) {
                answer = 'A';
                if (answer == answers2[index]) {
                    correct_guess++;
                }
            }

            if (e.getSource() == buttonB) {
                answer = 'B';
                if (answer == answers2[index]) {
                    correct_guess++;
                }
            }
            if (e.getSource() == buttonC) {
                answer = 'C';
                if (answer == answers2[index]) {
                    correct_guess++;
                }
            }
            if (e.getSource() == buttonD) {
                answer = 'D';
                if (answer == answers2[index]) {
                    correct_guess++;
                }
            }
        }
        else{
            if (e.getSource() == buttonA) {
                answer = 'A';
                if (answer == answers3[index]) {
                    correct_guess++;
                }
            }

            if (e.getSource() == buttonB) {
                answer = 'B';
                if (answer == answers3[index]) {
                    correct_guess++;
                }
            }
            if (e.getSource() == buttonC) {
                answer = 'C';
                if (answer == answers3[index]) {
                    correct_guess++;
                }
            }
            if (e.getSource() == buttonD) {
                answer = 'D';
                if (answer == answers3[index]) {
                    correct_guess++;
                }
            }
        }
            displayAnswer();
    }
    public void displayAnswer() {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if((Main.t1.getText().equals("jagan")) && (Main.t2.getText().equals("2020PECCS293"))) {
            if (answers[index] != 'A')
                answer_labelA.setForeground(new Color(255, 0, 0));
            if (answers[index] != 'B')
                answer_labelB.setForeground(new Color(255, 0, 0));
            if (answers[index] != 'C')
                answer_labelC.setForeground(new Color(255, 0, 0));
            if (answers[index] != 'D')
                answer_labelD.setForeground(new Color(255, 0, 0));
        }else if((Main.t1.getText().equals("jagadeesh")) && (Main.t2.getText().equals("2020PECCS292"))) {
            if (answers1[index] != 'A')
                answer_labelA.setForeground(new Color(255, 0, 0));
            if (answers1[index] != 'B')
                answer_labelB.setForeground(new Color(255, 0, 0));
            if (answers1[index] != 'C')
                answer_labelC.setForeground(new Color(255, 0, 0));
            if (answers1[index] != 'D')
                answer_labelD.setForeground(new Color(255, 0, 0));
        }else if((Main.t1.getText().equals("tharani")) && (Main.t2.getText().equals("2020PECCS197"))) {
            if (answers2[index] != 'A')
                answer_labelA.setForeground(new Color(255, 0, 0));
            if (answers2[index] != 'B')
                answer_labelB.setForeground(new Color(255, 0, 0));
            if (answers2[index] != 'C')
                answer_labelC.setForeground(new Color(255, 0, 0));
            if (answers2[index] != 'D')
                answer_labelD.setForeground(new Color(255, 0, 0));
        }
        else{
            if (answers3[index] != 'A')
                answer_labelA.setForeground(new Color(255, 0, 0));
            if (answers3[index] != 'B')
                answer_labelB.setForeground(new Color(255, 0, 0));
            if (answers3[index] != 'C')
                answer_labelC.setForeground(new Color(255, 0, 0));
            if (answers3[index] != 'D')
                answer_labelD.setForeground(new Color(255, 0, 0));
        }
        Timer pause= new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                answer_labelA.setForeground(new Color(25, 255, 0));
                answer_labelB.setForeground(new Color(25, 255, 0));
                answer_labelC.setForeground(new Color(25, 255, 0));
                answer_labelD.setForeground(new Color(25, 255, 0));

                answer = ' ';
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);
                index++;
                nextQuestion();
            }
        });
        pause.setRepeats(false);
        pause.start();
    }
    public void results()
    {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        result=(int)((correct_guess/(double)total_questions)*100);
        textfield.setText("RESULT!");
        textarea.setText("CONGRATULATIONS--YOUR SCORE ");

        buttonA.setVisible(false);
        buttonB.setVisible(false);
        buttonC.setVisible(false);
        buttonD.setVisible(false);
        answer_labelA.setText("");
        answer_labelB.setText("");
        answer_labelC.setText("");
        answer_labelD.setText("");
        NAME.setVisible(true);
        ROLL_NO.setVisible(true);
        number_right.setVisible(true);
        percentage.setVisible(true);

        NAME.setText("NAME:"+Main.t1.getText());
        ROLL_NO.setText("ROLL NO:"+Main.t2.getText());
        number_right.setText("MARKS="+correct_guess+"/"+total_questions);
        percentage.setText("PERCENTAGE="+result+"%");
        frame.add(number_right);
        frame.add(percentage);
    }
}