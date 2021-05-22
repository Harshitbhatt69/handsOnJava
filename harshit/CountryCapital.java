package harshit;
import java.awt.*;
import java.awt.event.*;
public class CountryCapital extends Frame implements ActionListener
{
	Choice country,capital;
	String a[]={"New Delhi","Islamabad","Tokyo","Beijing","Kathmandu"};
	Button cmp;
	Label lbl,lbl1,lbl2;
	Panel p1,p2,p3;
	CountryCapital()
	{
		setLayout(new FlowLayout());
		lbl1 = new Label("Choose Country");
		lbl2 = new Label("Choose Capital");
		add(lbl1);
		add (lbl2);
		
		p1=new Panel(new FlowLayout());
		p2=new Panel(new FlowLayout());
		p3=new Panel(new FlowLayout());
		country=new Choice();
		country.add("India");
		country.add("Pakistan");
		country.add("Japan");
		country.add("China");
		country.add("Nepal");
		
		capital=new Choice();
		capital.add("Islamabad");
		capital.add("Tokyo");
		capital.add("Beijing");
		capital.add("kathmandu");
		capital.add("New Delhi");
		p1.add(country);
		p1.add(capital);
		cmp=new Button("Compare");
		p2.add(cmp);
		cmp.addActionListener(this);
		lbl=new Label("                                                                                                       ", Label.CENTER);
		p3.add(lbl);
		setSize(350,300);
		add(p1);
		add(p2);
		add(p3);
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String[] agrs)
	{
		// TODO Auto-generated method stub
		new CountryCapital();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if((country.getSelectedItem()=="India")&&(capital.getSelectedItem()=="New Delhi"))
		{
			lbl.setText("Correct Answer");
		}
		else if((country.getSelectedItem()=="Pakistan")&&(capital.getSelectedItem()=="Islamabad"))
		{
			lbl.setText("Correct Answer");
		}
		else if((country.getSelectedItem()=="China")&&(capital.getSelectedItem()=="Beijing"))
		{
			lbl.setText("Correct Answer");
		}
		else if((country.getSelectedItem()=="Japan")&&(capital.getSelectedItem()=="Tokyo"))
		{
			lbl.setText("Correct Answer");
		}
		else if((country.getSelectedItem()=="Nepal")&&(capital.getSelectedItem()=="Kathmandu"))
		{
			lbl.setText("Correct Answer");
		}
		else
		{
			int i;
			i=country.getSelectedIndex();
			lbl.setText("Wrong Answer Correct Answer is "+a[i]);
		}
				
	}
}



	
