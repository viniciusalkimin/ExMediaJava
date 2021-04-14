import javax.swing.JOptionPane;
class exmedia03 {


public static void main (String args [])
{
	String nomealu,cursoalu,dispalu,periodoalu;
	Float nota1,nota2,nota3,media;
	nomealu=JOptionPane.showInputDialog("Qual o nome do aluno?");
	cursoalu=JOptionPane.showInputDialog("Qual o curso do aluno?");
	dispalu=JOptionPane.showInputDialog("Qual a disciplina do aluno?");
	periodoalu=JOptionPane.showInputDialog("Qual o periodo do aluno?");
	nota1=Float.parseFloat(JOptionPane.showInputDialog("Qual a primeira nota do aluno?"));
	nota2=Float.parseFloat(JOptionPane.showInputDialog("Qual a segunda nota do aluno?"));
	nota3=Float.parseFloat(JOptionPane.showInputDialog("Qual a terceira nota do aluno?"));
	media=(nota1+nota2+nota3)/3;
	JOptionPane.showMessageDialog(null,"Nome:"+nomealu+"\n"+"O curso do aluno é:"+cursoalu+
		"\n"+
	"A Disciplina do aluno é:"+dispalu+"\n"+"O Periodo do aluno é:"+periodoalu+"\n"+
		"A média do aluno é:"+media);
}
}