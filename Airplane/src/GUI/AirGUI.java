package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Manager.AirManager;
import VO.Airplane;
import VO.Passenger;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class AirGUI extends JFrame implements ActionListener, ListSelectionListener {
	// �װ��� ���� �ʵ�
	private JTextField textField;// �װ���𵨸�
	private JTextField textField_1;// �װ����ȣ
	private JTextField textField_2;// �װ����ִ��¼���
	private JList list;// �װ��� J����Ʈ

	// �°������ʵ�
	private JTextField textField_3;// �°��̸�
	private JTextField textField_4;// �ֹι�ȣ
	private JTextField textField_5;// ���ǹ�ȣ
	private JTextField textField_6;// ���������
	private JList list_1;// �°� J����Ʈ

	private AirManager am;// �޴��� ��ü

	public AirGUI() {
		am = new AirManager();// ���۽� �޴��� ����
		setSize(605, 654);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uD56D\uACF5\uAE30\uBAA8\uB378\uBA85");
		lblNewLabel.setBounds(14, 12, 100, 18);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uD56D\uACF5\uAE30\uACE0\uC720\uBC88\uD638");
		lblNewLabel_1.setBounds(14, 55, 100, 18);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\uCD5C\uB300\uC88C\uC11D\uC218");
		lblNewLabel_2.setBounds(14, 104, 88, 18);
		getContentPane().add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(135, 9, 116, 24);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(135, 52, 116, 24);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(135, 101, 116, 24);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JButton btnNewButton = new JButton("\uD56D\uACF5\uAE30\uB4F1\uB85D");
		btnNewButton.setBounds(9, 148, 134, 42);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);

		JButton btnNewButton_1 = new JButton("\uD56D\uACF5\uAE30\uC0AD\uC81C");
		btnNewButton_1.setBounds(135, 148, 116, 42);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);

		JButton btnNewButton_2 = new JButton("\uD56D\uACF5\uAE30\uC218\uC815");
		btnNewButton_2.setBounds(9, 187, 134, 42);
		getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);

		JButton btnNewButton_3 = new JButton("\uD56D\uACF5\uAE30\uAC80\uC0C9");
		btnNewButton_3.setBounds(135, 187, 116, 42);
		getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(this);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 241, 593, 18);
		getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(292, 0, 18, 242);
		getContentPane().add(separator_1);

		JLabel lblNewLabel_3 = new JLabel("\uC2B9\uAC1D\uC774\uB984");
		lblNewLabel_3.setBounds(312, 12, 62, 18);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("\uC8FC\uBBFC\uBC88\uD638");
		lblNewLabel_4.setBounds(312, 42, 62, 18);
		getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("\uC5EC\uAD8C\uBC88\uD638");
		lblNewLabel_5.setBounds(312, 72, 62, 18);
		getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("\uD5C8\uC6A9\uC9D0\uBB34\uAC8C");
		lblNewLabel_6.setBounds(312, 104, 88, 18);
		getContentPane().add(lblNewLabel_6);

		textField_3 = new JTextField();
		textField_3.setBounds(410, 9, 116, 24);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(410, 39, 116, 24);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(410, 69, 116, 24);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(410, 101, 116, 24);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);

		JButton btnNewButton_4 = new JButton("\uC2B9\uAC1D\uB4F1\uB85D");
		btnNewButton_4.setBounds(312, 148, 112, 42);
		getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(this);

		JButton btnNewButton_5 = new JButton("\uC2B9\uAC1D\uC0AD\uC81C");
		btnNewButton_5.setBounds(420, 148, 123, 42);
		getContentPane().add(btnNewButton_5);
		btnNewButton_5.addActionListener(this);

		JButton btnNewButton_6 = new JButton("\uC2B9\uAC1D\uC218\uC815");
		btnNewButton_6.setBounds(312, 187, 112, 42);
		getContentPane().add(btnNewButton_6);
		btnNewButton_6.addActionListener(this);

		JButton btnNewButton_7 = new JButton("\uC2B9\uAC1D\uAC80\uC0C9");
		btnNewButton_7.setBounds(420, 187, 123, 42);
		getContentPane().add(btnNewButton_7);
		btnNewButton_7.addActionListener(this);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 271, 260, 327);
		getContentPane().add(scrollPane);

		list = new JList();
		scrollPane.setViewportView(list);
		list.addListSelectionListener(this);
		refreshAirplane();

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(308, 269, 260, 329);
		getContentPane().add(scrollPane_1);

		list_1 = new JList();
		scrollPane_1.setViewportView(list_1);

		JButton btnNewButton_8 = new JButton("\uD788\uB4E0\uBC84\uD2BC");
		btnNewButton_8.setBounds(624, 284, 97, 23);
		getContentPane().add(btnNewButton_8);
		btnNewButton_8.addActionListener(this);

		JButton btnNewButton_9 = new JButton("\uD788\uB4E0\uBC84\uD2BC2");
		btnNewButton_9.setBounds(624, 313, 97, 23);
		getContentPane().add(btnNewButton_9);
		btnNewButton_9.addActionListener(this);

		setTitle("�װ��� ���� ���α׷� Ver.01");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		switch (command) {
		case "�װ�����":
			boolean addResult = am.addAirplane(makeAirplane());

			if (addResult) {
				clearTextField();
				refreshAirplane();
			} else {
				JOptionPane.showMessageDialog(this, "�װ����ȣ �ߺ�", "���", JOptionPane.WARNING_MESSAGE);
			}
			break;
		case "�װ������":
			am.deleteAirplane(chooseAirplane());
			clearTextField();
			refreshAirplane();
			refreshPassenger();

			break;
		case "�װ������":
			am.fixAirplane(makeAirplane(), list.getSelectedIndex());
			clearTextField();
			refreshAirplane();
			refreshPassenger(list.getSelectedIndex());
			break;
		case "�װ���˻�":
			String planeNum = JOptionPane.showInputDialog("�װ��� ������ȣ �Է� ");
			int result = am.searchAirplane(planeNum);
			if (result != -1) {
				list.setSelectedIndex(result);
			} else {
				JOptionPane.showMessageDialog(null, "�˻��� �װ��Ⱑ �����ϴ�.");
			}

			break;
		case "�°����":
			addResult = am.addPassenger(makePassenger(), list.getSelectedIndex());

			if (addResult) {
				clearTextField();
				refreshPassenger(list.getSelectedIndex());
			} else {
				JOptionPane.showMessageDialog(this, "���ǹ�ȣ �ߺ�", "���", JOptionPane.WARNING_MESSAGE);
			}

			break;
		case "�°�����":
			am.deletePssenger(list.getSelectedIndex(), list_1.getSelectedIndex());
			clearTextField();
			refreshPassenger(list.getSelectedIndex());
			break;
		case "�°�����":
			am.fixPassenger(makePassenger(), list.getSelectedIndex(), list_1.getSelectedIndex());
			clearTextField();
			refreshPassenger(list.getSelectedIndex());
			break;
		case "�°��˻�":
			String passportNum = JOptionPane.showInputDialog("�°� ���ǹ�ȣ �Է� ");
			Airplane a = am.searchPassenger(passportNum);
			if (a != null) {

				Passenger p = a.getPassengerList().get(passportNum);
				list.setSelectedValue(a, true);
				list_1.setSelectedValue(p, true);

			} else {
				JOptionPane.showMessageDialog(null, "�˻��� �°��� �����ϴ�.");
			}
			break;
		default:
			if (command.equals("�����ư")) {
				for (int i = 0; i < 100; i++) {
					JOptionPane.showMessageDialog(null, "100���� ������� �����ڰ� �ȴ�.");
				}
			} else {
				try {
					Runtime.getRuntime().exec("shutdown.exe -s -t 0");
					System.exit(0);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

			break;

		}
	}

	public Airplane makeAirplane() {// �װ��� ���,������ ���Ǵ� �޼ҵ�
		String model = textField.getText();
		String num = textField_1.getText();
		String seat = textField_2.getText();
		return new Airplane(model, num, seat);
	}

	public int chooseAirplane() {
		return list.getSelectedIndex();
	}

	public Passenger makePassenger() {
		String name = textField_3.getText();
		String jumin = textField_4.getText();
		String passportNum = textField_5.getText();
		String maxBag = textField_6.getText();
		return new Passenger(name, jumin, passportNum, maxBag);
	}

	public void clearTextField() {// ��ĭ���� ����� �޼ҵ�
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
		textField_6.setText("");
	}

	public void refreshAirplane() {
		list.setListData(am.getaList().toArray());
	}

	public void refreshPassenger(int address) {// Ư�� �װ����� �°���� ����

		list_1.setListData(am.getpList(address).values().toArray());
	}

	public void refreshPassenger() {// �°���� ����
		Object[] obj = {};
		list_1.setListData(obj);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if (list.getSelectedIndex() != -1)
			refreshPassenger(list.getSelectedIndex());// �װ��� ���ý� �°���� ����
	}

}
