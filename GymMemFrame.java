/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import za.ac.tut.membership.Member;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author GAMING
 */
public class GymMemFrame extends JFrame{
    
    private JPanel headingPnl;
    private JPanel clientPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPnl;
    private JPanel contractsPnl;
    private JPanel personalTrainerOptionPnl;
    private JPanel membershipPnl;
    private JPanel commentsPnl;
    private JPanel btnsPnl;
    private JPanel headingClientCombinedPnl;
    private JPanel membershipCommentsCombinedPnl;
    private JPanel mainPnl;
  
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idNoLbl;
    private JLabel genderLbl;
    private JLabel personalTrainerLbl;
    private JLabel contractTypeLbl;
   
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField idNoTxtFld;
    
    private JComboBox genderComboBox;
    
    private JRadioButton monthToMonthRadBtn;
    private JRadioButton sixMonthsRadBtn;
    private JRadioButton annualRadBtn;
    
    private JCheckBox personalTrainerChkBx;
    
    private ButtonGroup btnGrp;
    
    private JTextArea commentsArea;
    
    private JScrollPane scrollableTxtArea;
    
    private JButton registerBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    private JButton searchBtn;
    private JButton removeBtn;
    private JButton updateBtn;
    private JButton displayBtn;
    
    private ArrayList<Member>members;
    
    public GymMemFrame(){
        
        setTitle("Gym membership");
        setSize(500,550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        members=new ArrayList<>();
        
        headingPnl=new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        clientPnl=new JPanel(new GridLayout(4,1,1,1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Client details"));
        
        namePnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        contractsPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerOptionPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        membershipPnl=new JPanel(new GridLayout(2,1,1,1));
        membershipPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract options"));

        commentsPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        btnsPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingClientCombinedPnl=new JPanel(new BorderLayout());
        membershipCommentsCombinedPnl=new JPanel(new BorderLayout());
        mainPnl=new JPanel(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingLbl=new JLabel("Membership form");
        headingLbl.setFont(new Font(Font.SANS_SERIF,Font.ITALIC + Font.BOLD,20));
        headingLbl.setForeground(Color.BLUE);
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        headingPnl.add(headingLbl);
        
        nameLbl=new JLabel("Name:    ");
        surnameLbl=new JLabel("Surname:    ");
        idNoLbl=new JLabel("Id no:      ");
        genderLbl=new JLabel("Gender:     ");
        contractTypeLbl=new JLabel("Type of ontract:  ");
        personalTrainerLbl=new JLabel("Select the checkbox if you need personal trainer ");
        
        nameTxtFld=new JTextField(10);
        surnameTxtFld=new JTextField(10);
        idNoTxtFld=new JTextField(10);
        
        genderComboBox=new JComboBox();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Female");
        
        monthToMonthRadBtn=new JRadioButton("Month-to-month");
        sixMonthsRadBtn=new JRadioButton("Six months");
        annualRadBtn=new JRadioButton("Annual");
        
        personalTrainerChkBx=new JCheckBox();
        
        btnGrp=new ButtonGroup();
        btnGrp.add(monthToMonthRadBtn);
        btnGrp.add(sixMonthsRadBtn);
        btnGrp.add(annualRadBtn);
        
        commentsArea=new JTextArea(15,50);
        commentsArea.setEditable(false);
        commentsArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Member(s) details"));
        
        scrollableTxtArea=new JScrollPane(commentsArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        registerBtn=new JButton("REGISTER");
        registerBtn.addActionListener(new RegisterBtnLister());
        
        searchBtn=new JButton("SEARCH");
        searchBtn.addActionListener(new SearchBtnListener());
        
        removeBtn=new JButton("REMOVE");
        removeBtn.addActionListener(new RemoveBtnLister());
        
        updateBtn=new JButton("UPDATE");
        updateBtn.addActionListener(new UpdateBtnLister());
        
        displayBtn=new JButton("DISPLAY ALL");
        displayBtn.addActionListener(new DisplayAllBtnLister());
        
        clearBtn=new JButton("CLEAR");
        clearBtn.addActionListener(new ClearBtnLister());
        
        exitBtn=new JButton("EXIT");
        exitBtn.addActionListener(new ExitBtnLister());
        
        headingPnl.add(nameLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        idNoPnl.add(idNoLbl);
        idNoPnl.add(idNoTxtFld);
        
        genderPnl.add(genderLbl);
        genderPnl.add(genderComboBox);
        
        clientPnl.add(namePnl);
        clientPnl.add(surnamePnl);
        clientPnl.add(idNoPnl);
        clientPnl.add(genderPnl);
        
        headingClientCombinedPnl.add(headingPnl,BorderLayout.NORTH);
        headingClientCombinedPnl.add(clientPnl,BorderLayout.CENTER);
        
        contractsPnl.add(contractTypeLbl);
        contractsPnl.add(monthToMonthRadBtn);
        contractsPnl.add(sixMonthsRadBtn);
        contractsPnl.add(annualRadBtn);
        
        personalTrainerOptionPnl.add(personalTrainerLbl);
        personalTrainerOptionPnl.add(personalTrainerChkBx);
        
        membershipPnl.add(contractsPnl);
        membershipPnl.add(personalTrainerOptionPnl);
        
        commentsPnl.add(scrollableTxtArea);
        
        membershipCommentsCombinedPnl.add(membershipPnl,BorderLayout.NORTH);
        membershipCommentsCombinedPnl.add(commentsPnl,BorderLayout.CENTER);
        
        btnsPnl.add(registerBtn);
        btnsPnl.add(searchBtn);
        btnsPnl.add(updateBtn);
        btnsPnl.add(removeBtn);
        btnsPnl.add(displayBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPnl = new JPanel(new BorderLayout());
        mainPnl.add(headingClientCombinedPnl,BorderLayout.NORTH);
        mainPnl.add(membershipCommentsCombinedPnl,BorderLayout.CENTER);
        mainPnl.add(btnsPnl,BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        
        setResizable(false);
        
        setVisible(true);
        
        
        
    }

    private class SearchBtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            String searchId = idNoTxtFld.getText();
            for (Member member : members) {
                if (member.getIdNo().equals(searchId)) {
                    commentsArea.setText("Member found: " + member);
                    return;
                }
            }
            commentsArea.setText("Member not found.");
        }
    }

    private class UpdateBtnLister implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           
                        String searchId = idNoTxtFld.getText();
            for (Member member : members) {
                if (member.getIdNo().equals(searchId)) {
                    member.setName(nameTxtFld.getText());
                    member.setSurname(surnameTxtFld.getText());
                    member.setGender((String) genderComboBox.getSelectedItem());
                    member.setContractType(monthToMonthRadBtn.isSelected() ? "Month-to-month"
                                    : sixMonthsRadBtn.isSelected() ? "Six months" : "Annual");
                    member.setIsPersonalTrainerSelected(personalTrainerChkBx.isSelected());
                    commentsArea.setText("Member updated: " + member);
                    return;
                }
            }
            commentsArea.setText("Member not found for updating.");
        }
    }

    private class DisplayAllBtnLister implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
              if (members.isEmpty()) {
              commentsArea.setText("No members to display.");
            } else {
                StringBuilder allMembers = new StringBuilder("All Members:\n");
                for (Member member : members) {
                    allMembers.append(member).append("\n");
                }
                commentsArea.setText(allMembers.toString());
        }
    }
}
    private class RemoveBtnLister implements ActionListener {

     
        @Override
        public void actionPerformed(ActionEvent e) {
           
            String searchId = idNoTxtFld.getText();
            for (Member member : members) {
                if (member.getIdNo().equals(searchId)) {
                    members.remove(member);
                    commentsArea.setText("Member removed.");
                    clearFields();
                    return;
                }
            }
            commentsArea.setText("Member not found for removal.");
            
            
        }
        

    }

    private class RegisterBtnLister implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
           
            String name=nameTxtFld.getText();
            String surname=surnameTxtFld.getText();
            String idNo=idNoTxtFld.getText();
            String gender=(String)genderComboBox.getSelectedItem();
            Boolean isPersonalTrainerSelected=personalTrainerChkBx.isSelected();
                        String contractType = monthToMonthRadBtn.isSelected() ? "Month-to-month" 
                               : sixMonthsRadBtn.isSelected() ? "Six months" 
                               : annualRadBtn.isSelected() ? "Annual" : null;
            
                if (name.isEmpty() || surname.isEmpty() || idNo.isEmpty() || contractType == null) {
                JOptionPane.showMessageDialog(null, "Please enter all details to register a member.");
                return;
            }
            Member member=new Member(name,surname,idNo,gender,contractType,isPersonalTrainerSelected);
            
            members.add(member);
            
            commentsArea.setText("The member has been successfully added: " + member);
        }
    }

    private class ClearBtnLister implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           
            clearFields();
            commentsArea.setText("");
            

            nameTxtFld.setFocusable(true);
            
        }
    
    

    }
    private static class ExitBtnLister implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
           System.exit(1);
        }
    }
    
            private void clearFields() {
                
                nameTxtFld.setText("");
                surnameTxtFld.setText("");
                idNoTxtFld.setText("");
                personalTrainerChkBx.setSelected(false);
                btnGrp.clearSelection();
            
            }

    }