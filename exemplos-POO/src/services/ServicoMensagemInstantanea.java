package services;

public abstract class ServicoMensagemInstantanea {
	
	public void enviarMensagem() {
		validarConetadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
		
	}
	private void validarConetadoInternet() {
		System.out.println("Validando se esta conetado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando historico da mensagem");
	}
	
	public abstract void enviarMensagemABS();
	public abstract void receberMensagemABS();
}
