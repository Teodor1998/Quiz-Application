import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Q1 extends JPanel {
	private JTextArea textField;
	private JTextField txtAcordPuternic;
	
	private ArrayList<String> intrebari;
	int index = 0;
	private ArrayList<Integer> raspunsuri;
	private JTextField textField_1;
	/**
	 * Create the panel.
	 */
	public Q1(JFrame mother) {
		intrebari = new ArrayList<String>();
		raspunsuri = new ArrayList<Integer>();
		//introduc intrebarile:
		intrebari.add("Ma consider o persoana creativa.");
		intrebari.add("In mod regulat, sunt implicat intr-o activitate creativa.");
		intrebari.add("Ideile creative imi apar pur si simplu fara sa ma gandesc la ele.");
		intrebari.add("De obicei, astept un moment de inspiratie inainte de a incepe sa lucrez.");
		intrebari.add("Stilul meu creativ este inegal si nesistematic.");
		intrebari.add("Am avut iluminari/inspiratii pe care sunt incapabil sa le explic sau sa le inteleg.");
		intrebari.add("Cred in importanta informatiilor din inconstient care faciliteaza activitatea creativa.");
		intrebari.add("In timpul in care rezolv probleme care cer de la mine creativitate le intrerup adesea prin lungi pauze.");
		intrebari.add("Sunt capabil sa utilizez in activitatea mea creativa multe idei care imi apar in vis.");
		intrebari.add("Pentru a avea idei creative trebuie sa fiu puternic emotionat.");
		intrebari.add("Trebuie sa am o dispozitie foarte buna pentru a fi creativ.");
		intrebari.add("Cand am o idee noua sunt total absorbit de ea.");
		intrebari.add("Simt ca ideea noua pe care o am ma ia in stapanirea ei si ma conduce aproape automat spre elaborarea/finalizarea ei.");
		intrebari.add("Consider ca ideil creative vin din munca grea si persistenta.");
		intrebari.add("Creativitatea mea vine din planificarea muncii si reflectie.");
		intrebari.add("Imi exersez mereu creativitatea.");
		intrebari.add("In cazul meu, creativitatea, apare datorita autodisciplinei.");
		intrebari.add("Imi atribui creativitatea inspiratiei.");
		intrebari.add("Tind sa pierd sensul timpului cand sunt implicat intr-o activitate de creatie.");
		intrebari.add("Cand imi apar idei noi, le notez pe ce am la indemana.");
		intrebari.add("Adesea, imi las mintea sa hoinareasca pentru a veni cu idei noi.");
		intrebari.add("De obicei, creez noi idei prin modificarea sistematica (inlocuire, rearanjare, elaborare) a celor existente.");
		intrebari.add("Creez noi idei prin combinarea celor existente.");
		intrebari.add("Cand examinez produsele existente, de obicei, le evaluez criti pentru a vedea ce pot imbunatati.");
		intrebari.add("Adesea, ma intorc la ideile pe care le-am respins inainte.");
		intrebari.add("Ma gandesc, mereu, cum cum sa fac lucrurile de zi cu zi, intr-un mod diferit.");
		intrebari.add("De obicei, modific usor o idee existenta.");
		intrebari.add("In mod deliberat, resping sau ignor idei conventionale sau deja acceptate pentru a veni cu noi idei.");
		intrebari.add("Caut noi idei din afara sferei mele de pregatire si incerc sa le aplic domeniului meu.");
		intrebari.add("Am tendinta de a lucra mai multe idei, simultan.");
		intrebari.add("Adesea, utilizez tehinca brainstormingului pentru a veni cu idei noi.");
		intrebari.add("Am un carnet/ un jurnal pe care imi notez ideile pe care as vrea sa le folosesc intr-o zi.");
		intrebari.add("Nu evaluez ideile pe care le generez decat dupa ce am strans un numar mai mare de idei.");
		intrebari.add("Fac o serie de experimentari (incercari si erori) pentru a veni la final cu o idee realizabila.");
		intrebari.add("Cand am un blocaj, tind sa las ideile deoparte pentru o vreme, ma apuc de altceva, apoi ma reintorc la munca mea.");
		intrebari.add("Pentru a avea idei noi recurg la o plimbare.");
		intrebari.add("Citesc foarte mult pentru a avea idei noi.");
		intrebari.add("Cand am o idee noua tind sa discut cu cineva pentru a-mi da seama de potentialul ei.");
		intrebari.add("Cand am un blocaj ma consult sau vorbesc cu alte persoane despre cum sa procedez.");
		intrebari.add("Sunt mai creativ cand lucrez singur.");
		intrebari.add("Sunt mai creativ cand lucrez cu altcineva.");
		intrebari.add("Sunt mai creativ cand lucrez intr-o echipa.");
		intrebari.add("Sunt discret in privinta ideilor mele noi; nu le comunic imediat.");
		intrebari.add("De obicei, arat ideile mele creative altor persoane.");
		intrebari.add("Am nevoie sa ma izolez fizic de alte persoane cand sunt in activitatea de creatie.");
		intrebari.add("Am nevoie sa ma izolez fizic de alte persoane pentru a avea inspiratie.");
		intrebari.add("Am adesea idei proaste sau inaplicabile.");
		intrebari.add("De obicei am atât idei bune cât și idei care nu pot fi aplicate.");
		intrebari.add("Sunt foarte creativ atunci când am termene limită (deadline-uri).");
		intrebari.add("Când nu am un produs creativ concret (vizibil) pentru a-l arăta (exemplu: compoziție scrisă, muzicală, pictură), mă gândesc că am eșuat.");
		intrebari.add("Mă bucură procesul de a crea noi idei chiar dacă ele conduc sau nu la un nou produs.");
		intrebari.add("După ce am terminat o activitate care are un rezultat creativ, o lungă perioadă de timp nu pot să încep un nou produs.");
		intrebari.add("Chiar dacă un produs nu este observabil prin simțuri poate deveni un act creativ.");
		intrebari.add("Am un loc (sau locuri) anume când îmi realizez activitatea care presupune creație.");
		intrebari.add("Am o perioadă anume din zi (sau mai multe) când îmi realizez activitatea care presupune creație.");
		intrebari.add("Am un loc (sau locuri) anume unde îmi apar cele mai multe idei creative.");
		intrebari.add("Am o perioadă anume din zi (sau mai multe) când îmi apar cele mai multe idei creative.");
		intrebari.add("Am tendința de a fuma înainte să încep o muncă de creație.");
		intrebari.add("Am tendința să beau cafea/ceai/alte băuturi cu cofeină înainte de a începe munca de creație.");
		intrebari.add("Am tendința să fumez frecvent când sunt implicat în muncă de creație.");
		intrebari.add("Am tendința să beau cafea/ceai/alte băuturi cu cofeină când sunt implicat în munca de creație.");
		intrebari.add("De obicei, fumez după ce am terminat o muncă ce necesită creativitate.");
		intrebari.add("De obicei, beau ceai/cafea/alte băuturi cu cafeina după ce am terminat o muncă de creație.");
		intrebari.add("Găsesc modalități să mă recompensez după ce am terminat o muncă de creație.");
		intrebari.add("Am tendința să-mi realizez lucrul creativ într-un loc liniștit.");
		intrebari.add("De obicei, am muzica de fundal când sunt implicat într-o muncă de creație.");
		intrebari.add("Folosesc alcool pentru a obține o dispoziție necesară muncii creative.");
		intrebari.add("Folosesc substanțe de modificare a conștienței (altele decât alcoolul) pentru a obține o dispoziție necesară muncii creative.");
		intrebari.add("De obicei, încep lucrul cu o rugăciune.");
		intrebari.add("Înainte de a începe o activitate creativă fac o scurtă meditație.");
		intrebari.add("Am tendința să iau o gustare când sunt implicat în rezolvarea unei probleme care necesită creativitate.");
		intrebari.add("Am un instrument favorit (de exemplu, un anumit stilou) fără de care mi-ar fi foarte greu să mă concentrez când sunt implicat în rezolvarea unei probleme care necesită creativitate.");
		intrebari.add("Am o amuletă sau o haină favorită fără de care mi-ar fi foarte greu să mă concentrez în rezolvarea unei probleme care necesită creativitate.");
		intrebari.add("Am tendința să utilizez din plin simțul vizual în lucrul meu creativ.");
		intrebari.add("Am tendința să utilizez din plin simțul auditiv în lucrul meu creativ.");
		intrebari.add("Am tendința să utilizez din plin simțul tactil în lucrul meu creativ.");
		intrebari.add("Am tendința să utilizez din plin simțul gustativ în lucrul meu creativ.");
		intrebari.add("Am tendința să utilizez din plin simțul olfactiv în lucrul meu creativ.");
		
		//pana aici am hardcodat intrebarile
		
		setBounds(100, 100, 1000, 620);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Imaginea de fundal:
		JLabel label = new JLabel();
		label.setBounds(0, 0, 1000, 620);
		Image img = new ImageIcon(this.getClass().getResource("background_app.jpg")).getImage();
		
		String s = "( " + 1 + " / " + intrebari.size() + " ) ";
		s += intrebari.get(0);
		
		int n = s.length();
		if (n > 75)
		{
			char[] s2 = s.toCharArray();
			for (int i = 75; i >= 0; i--)
			{
				if (s2[i] == ' ')
				{
					s2[i] = '\n';
					break;
				}
			}
			s = "";
			for (int i = 0; i < n; i++)
			{
				s += s2[i];
			}
		}
		textField = new JTextArea();
		textField.setBounds(80, 150, 826, 87);
		add(textField);
		textField.setColumns(10);
		textField.setText(s);
		Font font = textField.getFont();
		textField.setFont(new Font ("Sans",font.PLAIN , 20));
		textField.setEditable(false);
		
		JButton btnNewButton = new JButton("Mai departe");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (index == intrebari.size() - 1)
				{
					int rasp = Integer.parseInt(textField_1.getText());
					raspunsuri.add(index, rasp);
					JOptionPane.showMessageDialog(null, calcul_rezultat());
					mother.dispose();
				}
				else
				{
				if (textField_1.getText().length() == 1)
				{
					int rasp = Integer.parseInt(textField_1.getText());
					if(rasp >= 1 && rasp <= 5)
					{
						raspunsuri.add(index, rasp);
						index ++;
					
						//String incape:
						String s = "( " + (index + 1) + " / " + intrebari.size() + " ) ";
						s += intrebari.get(index);
						int n = s.length();
						if (n > 75 && n < 2 * 75 - 6)
						{
							char[] s2 = s.toCharArray();
							for (int i = 75; i >= 0; i--)
							{
								if (s2[i] == ' ')
								{
									s2[i] = '\n';
									break;
								}
							}
							s = "";
							for (int i = 0; i < n; i++)
							{
								s += s2[i];
							}
						}
						if (n >= 2 * 75 - 6)
						{
							char[] s2 = s.toCharArray();
							for (int i = 2 * 75 - 6; i >= 0; i--)
							{
								if (s2[i] == ' ')
								{
									s2[i] = '\n';
									break;
								}
							}
							for (int i = 75; i >= 0; i--)
							{
								if (s2[i] == ' ')
								{
									s2[i] = '\n';
									break;
								}
							}
							s = "";
							for (int i = 0; i < n; i++)
							{
								s += s2[i];
							}
						}
					textField.setText(s);
					textField_1.setText("");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Introduceti o valoare valida!");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Introduceti o valoare valida!");
				}
			}
			}
		});
		btnNewButton.setBounds(310, 380, 330, 49);
		add(btnNewButton);
		
		txtAcordPuternic = new JTextField();
		txtAcordPuternic.setText("1- Acord puternic; 2 - Acord; 3 - Nesigur; 4 - Dezacord; 5 - Puternic dezacord");
		txtAcordPuternic.setEditable(false);
		txtAcordPuternic.setBounds(100, 37, 770, 33);
		txtAcordPuternic.setFont(new Font ("Sans",font.PLAIN , 20));

		add(txtAcordPuternic);
		txtAcordPuternic.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(340, 290, 265, 40);
		textField_1.setFont(new Font ("Sans",font.PLAIN , 20));
		add(textField_1);
		textField_1.setColumns(10);
		label.setIcon(new ImageIcon(img));
		add(label);
		setLayout(null);
	}
	
	String calcul_rezultat()
	{
		int sum = inversare_rasp(raspunsuri.get(0));
		sum += inversare_rasp(raspunsuri.get(1));
		String s = "1. Masura globala a capacitatii creative (SPCC): " + sum;
		s += '\n';
		sum = 0;
		for (int i = 2; i < 13; i ++)
		{
			sum += inversare_rasp(raspunsuri.get(i));
		}
		for (int i = 13; i < 17; i ++)
		{
			sum += raspunsuri.get(i);
		}
		sum += inversare_rasp(raspunsuri.get(17));
		sum += inversare_rasp(raspunsuri.get(18));
		double rezultat = sum / 17;
		s += "2. Credinta in importanta proceselor inconstiente: " + rezultat;
		s += '\n';
		sum = 0;
		for (int i = 19; i < 37; i++)
		{
			sum += inversare_rasp(raspunsuri.get(i));
		}
		rezultat = sum / 18;
		s += "3. Utilizarea de tehnici: " + rezultat;
		s += '\n';
		sum = 0;
		for (int i = 37; i < 47; i++)
		{
			sum += raspunsuri.get(i);
		}
		rezultat = sum / 9;
		s += "4. Activitatea cu alte persoane (echipa): " + rezultat;
		s += '\n';
		sum = 0;
		sum += raspunsuri.get(46);
		sum += raspunsuri.get(47);
		sum += inversare_rasp(raspunsuri.get(48));
		sum += inversare_rasp(raspunsuri.get(49));
		sum += raspunsuri.get(50);
		sum += inversare_rasp(raspunsuri.get(51));
		sum += inversare_rasp(52);
		rezultat = sum / 7;
		s += "5. Orientarea catre produsul final: " + rezultat;
		s += '\n';
		sum = 0;
		for (int i = 53; i < 71; i++)
		{
			sum += inversare_rasp(raspunsuri.get(i));
		}
		rezultat = sum / 18;
		s += "6. Controlul comportamentului si al mediului: " + rezultat;
		s += '\n';
		sum = 0;
		sum += inversare_rasp(raspunsuri.get(71));
		sum += inversare_rasp(raspunsuri.get(72));
		rezultat = sum / 2;
		s += "7. Mistica: " + rezultat;
		s += '\n';
		sum = 0;
		for (int i = 73; i < 78; i++)
		{
			sum += inversare_rasp(raspunsuri.get(i));
		}
		rezultat = sum / 5;
		s += "8. Utilizarea simturilor: " + rezultat;
		return s;
	}
	
	int inversare_rasp(int rasp)
	{
		if (rasp == 1)
			return 5;
		if (rasp == 2)
			return 4;
		if (rasp == 3)
			return 3;
		if (rasp == 4)
			return 2;
		if (rasp == 5)
			return 1;
		return 0;
	}
}
