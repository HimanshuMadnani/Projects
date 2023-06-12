import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;    

class TicTacToe
{   
    public volatile static int value=0;
    public static void Game(JFrame frame){
        frame.setVisible(true); 
        JButton btn1 = new JButton();    
        JButton btn2 = new JButton();    
        JButton btn3 = new JButton();    
        JButton btn4 = new JButton();    
        JButton btn5 = new JButton();    
        JButton btn6 = new JButton();    
        JButton btn7 = new JButton();    
        JButton btn8 = new JButton();    
        JButton btn9 = new JButton();    

        frame.add(btn1); frame.add(btn2); frame.add(btn3);  
        frame.add(btn4); frame.add(btn5); frame.add(btn6);  
        frame.add(btn7); frame.add(btn8); frame.add(btn9);    
        frame.setLayout(new GridLayout(3,3));
        frame.setSize(900, 900);    
        btn1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                         value=1;
            }  
            });
        btn2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                         value=2;
            }  
            });
        btn3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                         value=3;
            }  
            });
        btn4.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                         value=4;
            }  
            });
        btn5.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                         value=5;
            }  
            });
        btn6.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                         value=6;
            }  
            });
        btn7.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                         value=7;
            }  
            });
        btn8.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                         value=8;
            }  
            });
        btn9.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                         value=9;
            }  
            });
        int player=0;
        
            switch(player){
                case 0:
                if(value==1 && btn1.getText()==""){
                    btn1.setText("x");
                }
                else if(value==2 && btn1.getText()==""){
                    btn2.setText("x");
                }
                else if(value==3 && btn1.getText()==""){
                    btn3.setText("x");
                }
                else if(value==4 && btn1.getText()==""){
                    btn4.setText("x");
                }
                else if(value==5 && btn1.getText()==""){
                    btn5.setText("x");
                }
                else if(value==6 && btn1.getText()==""){
                    btn6.setText("x");
                }
                else if(value== 7&& btn1.getText()==""){
                    btn7.setText("x");
                }
                else if(value==8 && btn1.getText()==""){
                    btn8.setText("x");
                }
                else if(value==9 && btn1.getText()==""){
                    btn9.setText("x");
                }
                player =(player+1)%2;
                break;
            
            case 1:
                if(value==1 && btn1.getText()==""){
                    btn1.setText("o");
                }
                else if(value==2 && btn1.getText()==""){
                    btn2.setText("o");
                }
                else if(value== 3&& btn1.getText()==""){
                    btn3.setText("o");
                }
                else if(value==4 && btn1.getText()==""){
                    btn4.setText("o");
                }
                else if(value==5 && btn1.getText()==""){
                    btn5.setText("o");
                }
                else if(value==6 && btn1.getText()==""){
                    btn6.setText("o");
                }
                else if(value==7 && btn1.getText()==""){
                    btn7.setText("o");
                }
                else if(value==8 && btn1.getText()==""){
                    btn8.setText("o");
                }
                else if(value==9 && btn1.getText()==""){
                    btn9.setText("o");
                }
                player =(player+1)%2;
                break;
            }
        
        }

    JFrame frame = new JFrame(); 
        
      
    TicTacToe(){
          
        Game(frame); 
        
    } 
    public static void main(String[] args) {
        new TicTacToe();
    }
}