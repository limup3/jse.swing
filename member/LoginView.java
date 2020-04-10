package com.jse.member;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener {
	
	JButton save, cancel;
	JTextField name_text,id_text,pwd_text,ssn_text;
	JTextField[] textFields;
	JLabel join,name,id,pwd,ssn;
	JLabel[] labels;
	JPanel panel;
	JPanel[] panels;
	
	private static final long serialVersionUID = 1L;
	public void open() {
//		JFrame frame = new JFrame("회원 관리");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		panels = new JPanel[5];
		labels = new JLabel[5];
		textFields = new JTextField[5];
		
		String[] names = {"회원가입","이름", "아이디", "패스워드", "주민번호"} ; 
		
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(names[i]);
			panel.add(labels[i]);
			
		}
		
		for (int i = 0; i < textFields.length; i++) {
			textFields[i] = new JTextField();
			panel.add(textFields[i]);
		}

//		join = new JLabel("회원가입");
//		name = new JLabel("이름");
//		id = new JLabel("아이디");
//		pwd = new JLabel("패스워드");
//		ssn = new JLabel("주민번호");
		
		//폰트 크기설정
		join.setFont(new Font("Serif", Font.BOLD, 20));
		
		//좌표값 설정
		join.setBounds(250, 20, 200, 80);
		labels[0].setBounds(100, 100, 100, 40);
		labels[1].setBounds(100, 150, 100, 40);
		labels[2].setBounds(100, 200, 100, 40);
		labels[3].setBounds(100, 250, 100, 40);
		
		//패널에 추가
		
		
		panels[0] = panel;
		
//		panel.add(join);
//		panel.add(id);
//		panel.add(name);
//		panel.add(pwd);
//		panel.add(ssn);		
		this.add(panel);
		
		//텍스트 입력
		name_text = new JTextField(); 
		id_text = new JTextField(); 
		pwd_text = new JTextField(); 
		ssn_text = new JTextField(); 
		
		//좌표값 설정
		textFields[0].setBounds(250, 100,200,30);
		textFields[1].setBounds(250, 150,200,30);
		textFields[2].setBounds(250, 200,200,30);
		textFields[3].setBounds(250, 250,200,30);
		
		//패널에 추가
		panel.add(name_text);
		panel.add(id_text);
		panel.add(pwd_text);
		panel.add(ssn_text);
		
		save = new JButton("저장");
	    cancel = new JButton("취소");
	    save.addActionListener(this);
	    cancel.addActionListener(this);

	    //버튼 위치와 크기 설정
	    
	    save.setBounds(100, 350, 122, 30);
	    
	    cancel.setBounds(300, 350, 122, 30);

	    // 프레임에다가 버튼 추가
	    panel.add(save);
	    panel.add(cancel);
		
		
	    this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == save) {
			JOptionPane.showMessageDialog(this, textFields[0].getText());
			
		} else if(e.getSource() == cancel) {
			JOptionPane.showMessageDialog(this, "취소");
		}
		
	}
	

}
	

