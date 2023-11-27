import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code= calculator.class width=600 height=600>
</applet>
*/
public class calculator extends applet impliments ActionListener
{
	TextField inp;
	public void init()
	{
	setBackground(color.white);
	setLayout(null);
	int i;
	inp=newTextField();inp.setBounds(150,100,270,50);
	this.add(inp);
	Buttonbutton[]=new Button[10];
	for (i=0;i<10;i++)
	{
	button [i]=new Button(string.valueOf(9-i));
	button[i].set Bounds(150+(i%3*50,150+((i/3*50)50,50);
	this.add(button[i]);
	button[i].addActionListner(this);
	}
	button dec=new Button(".");
	dec.setBounds(200,300,50,50);
	this.add(dec);
	dec.addActionListner(this);
	Button clr=new Button("c");
	clr.setBounds(250,300,50,50);
	this.add(clr);
	clr.addActionListner(this);
	Button operator[]=new button[5];
	operator[0]=new Button("/");
	operator[1]=new Button("*");
    operator[2]=new Button("-");
    operator[3]=new Button("+");
    operator[4]=new Button("=");
    for(i=0;i<4;i++)
    {
    	operator[i].setBounds(300,150+(i*50),50,50);
    	this.add operator[i]);
	operator[4].setBounds(350,300,70,50);
	this.add(operator[4]);
	operator[4].addActionListner(this);
}
string num1="";
string op="";
string num2="";
public=lic void actionperformed(ActionEvent e)
{
	string button=e.getActionCommand();
	char ch=button.charAt(0);
	if (ch>'0'&&ch<='9'||ch=='.')
	{
		if(!op.equals(""))
	}
num2=num2+button;
     }
     else
     {

     }
     num1=num1=button;
     inp.setText(num1+op+num2);
 }
 else if(ch=='c')
 {
 	num1=op=num2="";
 	inp.setText("");
 }
 else if(ch=='=')
 {
 	if(!num1.equals("")&&!num2.equals(""))
 	{
 		double temp;
 		double n1=Double.parseDouble(num1);
 		double n2=Double.parseDouble(num2);
 		if(n2==0&&op.equals("/"))
 		{
 			inp.setText(num1+op+num2+"=zero Division Error");
 			num1=op=num2="";
 		}
 		else
          {
          	if(op.equals("+"))
          		temp=n1+n2;
          	elseif(op.equals("/"))
          		temp=n1/n2;
          	else
          		temp=n1/n2;
          	else
          		temp=n1*n2;
          	inp.setText(num1+op=num2+"="+temp);
          	num1=Double.tostring(temp);
          	op=num2="";
          }
      }
      else
      {
      	num1=op=num2="";
      	inp.setText("");
      }
}
else
{
	if(op.equals("")||num2.equals(""))
		op=button;
	else
	{
		double temp;
		double n1=Double.parseDouble(num1);
		double n2=Double.parseDouble (num2);
		if(n2==0&&op.equals("/"))
		{
inp.setText(num1+op+num2+"=zeroDivisionError");
num1=op=num2="";
}
else
{
	if(op.equals("+"))
		temp=n1+n2;
	elseif(op.equals("-"))
		temp=n1-n2;
	elseif(op.equals("/"))
		temp=n1/n2;
	else
		temp=n1*n2;
	num1=Double.toString(temp);
	op=button;
	num2="";
}
}
inp.setText(num1+op+num2);
}
}
}

