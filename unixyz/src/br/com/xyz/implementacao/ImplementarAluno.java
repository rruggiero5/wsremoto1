package br.com.xyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.beans.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("RM")));
		aluno.setNome(JOptionPane.showInputDialog("Nome"));
		aluno.setEmail(JOptionPane.showInputDialog("Email"));
		System.out.println("RM: " + aluno.getRm());
		System.out.println("RM: " + aluno.getNome());
		System.out.println("RM: " + aluno.getEmail());

	}



	


}
