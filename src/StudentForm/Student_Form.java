package StudentForm;

import javax.swing.*;
import java.awt.*;

public class Student_Form extends JFrame {
    private JLabel lblStudentForm,lblID,lblName,jblGroup;
    private JTextField txtID,txtName,txtGroup;
    private JButton btnAdd;
    private Container c;
    private JTextArea jtaDisplay,output;
    private JComboBox cboGroup;

    public Student_Form() {
        initForm();
        initUI();

        insert();
    }
    public void initUI(){
        lblStudentForm = new JLabel("Student Form");
        lblStudentForm.setBounds(230,30,100,20);
        c.add(lblStudentForm);

        lblID = new JLabel("ID");
        lblID.setBounds(100,60,100,20);
        c.add(lblID);
        txtID = new JTextField();
        txtID.setBounds(170,60,150,20);
        c.add(txtID);

        lblName = new JLabel("Name");
        lblName.setBounds(100,90,100,20);
        c.add(lblName);
        txtName = new JTextField();
        txtName.setBounds(170,90,150,20);
        c.add(txtName);

        jblGroup = new JLabel("Group");
        jblGroup.setBounds(100,120,100,20);
        c.add(jblGroup);
        cboGroup = new JComboBox();
        cboGroup.addItem("A1");
        cboGroup.addItem("A2");
        cboGroup.addItem("A3");
        cboGroup.addItem("A4");
        cboGroup.addItem("A5");
        cboGroup.addItem("A6");
        cboGroup.setBounds(170,120,150,20);
        c.add(cboGroup);

        btnAdd = new JButton("Add");
        btnAdd.setBounds(100,150,80,20);
        c.add(btnAdd);

        jtaDisplay = new JTextArea();
        jtaDisplay.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jtaDisplay.setBounds(100, 180, 300, 100);
        c.add(jtaDisplay);

        output = new JTextArea();
        output.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        output.setBounds(100,220,300,100);

    }
    public void insert(){
        btnAdd.addActionListener(e -> {
            String id= txtID.getText();
            String name = txtName.getText();
            String group = ((String) cboGroup.getSelectedItem()).toString();
            jtaDisplay.setText("ID: " +id +  " ,Name: " +name +  " ,Group: " +group+"\n");
        });
    }
    public void initForm(){
        c=getContentPane();
        c.setLayout(null);
        setSize(500,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Student_Form();
    }
}