package java_swing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.*;

public class SwingTest extends JFrame{
	private JPanel contentPane;

	public static void main(String[] args) {
		
		Dimension dim = new Dimension(400,150);
		
		JFrame frame = new JFrame("부품 재고 관리");
//		frame.setLocation(null);
		frame.setPreferredSize(dim);
		
		String header[] = {"num","부품번호","부품명","부품 가격","벤더", "부품수량", "구매날짜"};
		String contents[][]= {
				{"1","hkt50","타이어","25000","한국타이어","50","2022-03-22"},
				{"2","prf44","타이어","30000","금호타이어","66","2022-10-21"},
				{"3","ede33", "엔진오일","21000","불스원","22","2022-08-11"}
		};
		
		JTable table = new JTable(contents,header);
		JScrollPane scrollpane = new JScrollPane(table);
		frame.add(scrollpane);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(1920,1080);
		
		
//		Panel contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JButton btnEditComInfo = new JButton("업체정보 수정");
		btnEditComInfo.setBounds(145, 118, 133, 23);
//		contentPane.add(btnEditComInfo);
	}
}
