package br.com.senai.secapisenai;

public class ValidadorDeAcesso {

	public void validar(Usuario usuario) {
		if (!usuario.getLogin().equals("user1") || !usuario.getSenha().equals("123")) {
			throw new IllegalArgumentException("O Usuario " + usuario.getLogin() + " ou a senha sao invalidos");
		}
	}

}
