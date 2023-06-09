package Frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	BuyFrame buyFrame = new BuyFrame(this);
	ShootNumImage shootNumImage;
	private JButton btnNewButton_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame(); // 메인 프레임
					Dimension frameSize = frame.getSize(); // 프레임 사이즈
					Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
					frame.setLocation((screenSize.width - frameSize.width) / 2,
							(screenSize.height - frameSize.height) / 2);
					JLabel label = new JLabel("그냥 해봤쓤", JLabel.CENTER);
					frame.getContentPane().add(label, BorderLayout.CENTER);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//	 public void abc() {
//         File bgm;
//         AudioInputStream stream;
//         AudioFormat format;
//         DataLine.Info info;
//
//         bgm = new File("C:\\롤큐잡히는소리.wav"); // 사용시에는 개별 폴더로 변경할 것
//         
//         Clip clip;
//         
//         try {
//                stream = AudioSystem.getAudioInputStream(bgm);
//                format = stream.getFormat();
//                info = new DataLine.Info(Clip.class, format);
//                clip = (Clip)AudioSystem.getLine(info);
//                clip.open(stream);
//                clip.start();
//                
//         } catch (Exception e) {
//                System.out.println("err : " + e);
//                }
//  }

	public MainFrame() {
		// Play("/imagepackage/롤큐잡히는소리.mp3");

		setTitle("4조 대박당첨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buyFrame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(MainFrame.class.getResource("/imagepackage/게임시작1.png")));
		btnNewButton_4.setRolloverIcon(new ImageIcon(MainFrame.class.getResource("/imagepackage/게임시작2.png")));
		btnNewButton_4.setBounds(95, 302, 164, 41);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setDisabledIcon(new ImageIcon(MainFrame.class.getResource("/imagepackage/게임시작3.png")));
		contentPane.add(btnNewButton_4);

//		ImageIcon image = new ImageIcon("img.png");
//		JPanel panel = new JPanel();
//		panel.setBounds(0, 0, 984, 561);
//		contentPane.add(panel);
//		panel.setLayout(null);
//		panel.setBackground(Color.decode("#111111"));

		JLabel backLabel = new JLabel(new ImageIcon(getClass().getResource("/imagepackage/back1.png")));
		backLabel.setBounds(0, 0, 1000, 600);
		contentPane.add(backLabel);

		// bt_img.setRolloverIcon(img2); // 버튼에 마우스가 올라갈떄 이미지 변환
		// bt_img.setBorderPainted(false); // 버튼 테두리 설정해제

		btnNewButton_1 = new JButton(new ImageIcon(getClass().getResource("/imagepackage/Main_Button1.png")));
		backLabel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton_1.setRolloverIcon(new ImageIcon(getClass().getResource("/imagepackage/Main_button1_1.png")));
		btnNewButton_1.setDisabledIcon(new ImageIcon(MainFrame.class.getResource("/imagepackage/Main_button1_2.png")));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuyList buyList = new BuyList(buyFrame.returnMapList(), MainFrame.this);
				buyList.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(100, 420, 180, 61);

		btnNewButton_2 = new JButton(new ImageIcon(getClass().getResource("/imagepackage/Main_Button2.png")));
		backLabel.add(btnNewButton_2);
//		btnNewButton_2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton_2.setRolloverIcon(new ImageIcon(getClass().getResource("/imagepackage/Main_button2_1.png")));
		btnNewButton_2.setDisabledIcon(new ImageIcon(MainFrame.class.getResource("/imagepackage/Main_button2_2.png")));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shootNumImage = new ShootNumImage(MainFrame.this);
				shootNumImage.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setBounds(400, 420, 180, 61);

		btnNewButton_3 = new JButton(new ImageIcon(getClass().getResource("/imagepackage/Main_Button3.png")));
		backLabel.add(btnNewButton_3);
		btnNewButton_3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton_3.setRolloverIcon(new ImageIcon(getClass().getResource("/imagepackage/Main_button3_1.png")));
		btnNewButton_3.setDisabledIcon(new ImageIcon(MainFrame.class.getResource("/imagepackage/Main_button3_2.png")));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WinningDetails winningDetails = new WinningDetails(MainFrame.this, shootNumImage,
						buyFrame.returnMapList());
				winningDetails.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_3.setBounds(700, 420, 180, 61);

		JLabel Main_Logo = new JLabel(new ImageIcon(getClass().getResource("/imagepackage/img.png")));
		backLabel.add(Main_Logo);
		Main_Logo.setBounds(30, 50, 300, 250);

		JLabel Main_Logo2 = new JLabel(new ImageIcon(getClass().getResource("/imagepackage/리그오브로또.png")));
		backLabel.add(Main_Logo2);
		Main_Logo2.setBounds(160, 100, 800, 280);

	}

	public JButton getBtnNewButton_3() {
		return btnNewButton_3;
	}

	public JButton getBtnNewButton_2() {
		return btnNewButton_2;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public JButton getBtnNewButton_4() {
		return btnNewButton_4;
	}
}
