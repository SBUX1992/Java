package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 10, 185, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(12, 49, 110, 35);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setBounds(12, 94, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2.setBounds(127, 94, 97, 23);
		contentPane.add(btn2);
		
		JButton bnt3 = new JButton("버튼3");
		bnt3.setBounds(236, 94, 97, 23);
		contentPane.add(bnt3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.setBounds(337, 94, 97, 23);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_2 = new JLabel("TextField 컴포넌트");
		lblNewLabel_2.setBounds(12, 127, 110, 15);
		contentPane.add(lblNewLabel_2);
		
		txtf1 = new JTextField();
		txtf1.setBounds(22, 152, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(22, 179, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(22, 210, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lbltxtresult1 = new JLabel("결과 : ");
		lbltxtresult1.setBounds(222, 155, 97, 15);
		contentPane.add(lbltxtresult1);
		
		JLabel lbltxtresult2 = new JLabel("결과 : ");
		lbltxtresult2.setBounds(222, 182, 97, 15);
		contentPane.add(lbltxtresult2);
		
		JLabel lbltxtresult3 = new JLabel("결과 : ");
		lbltxtresult3.setBounds(222, 213, 97, 15);
		contentPane.add(lbltxtresult3);
		
		JButton btntxtf1 = new JButton("확인");
		btntxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf1.getText();
				lbltxtresult1.setText("결과 : "+txt);
				
			}
		});
		btntxtf1.setBounds(150, 151, 60, 23);
		contentPane.add(btntxtf1);
		
		JButton btntxtf2 = new JButton("확인");
		btntxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf2.getText();
				lbltxtresult2.setText("결과 : "+txt);
			}
		});
		btntxtf2.setBounds(150, 178, 60, 23);
		contentPane.add(btntxtf2);
		
		JButton btntxtf3 = new JButton("확인");
		btntxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf3.getText();
				lbltxtresult3.setText("결과 : "+txt);
			}
		});
		btntxtf3.setBounds(150, 209, 60, 23);
		contentPane.add(btntxtf3);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_3.setBounds(12, 261, 140, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("취미를 고르세요.");
		lblNewLabel_4.setBounds(12, 298, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(12, 319, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(65, 319, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(127, 319, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(188, 319, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(249, 319, 57, 23);
		contentPane.add(chk5);
		
		JLabel lblChkResult = new JLabel("결과 : ");
		lblChkResult.setBounds(12, 348, 294, 29);
		contentPane.add(lblChkResult);
		
		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> chks = new ArrayList<>();
				
				if(chk1.isSelected()) {
					chks.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					chks.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					chks.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					chks.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				
				lblChkResult.setText("결과 : "+chks.toString());
				
			}
		});
		btnChk.setBounds(314, 319, 97, 23);
		contentPane.add(btnChk);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_5.setBounds(12, 387, 130, 15);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rbMale = new JRadioButton("남자");
		rbMale.setBounds(12, 408, 57, 23);
		contentPane.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("여자");
		rbFemale.setBounds(81, 408, 57, 23);
		contentPane.add(rbFemale);
		
		JButton btnGender = new JButton("확인");
		btnGender.setBounds(150, 408, 97, 23);
		contentPane.add(btnGender);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbFemale);
		bg.add(rbMale);
		
		JLabel lblGenderResult = new JLabel("결과 : ");
		lblGenderResult.setBounds(12, 437, 57, 15);
		contentPane.add(lblGenderResult);
		

		

	}
}
