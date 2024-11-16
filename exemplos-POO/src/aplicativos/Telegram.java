package aplicativos;

import services.ServicoMensagemInstantanea;

public class Telegram extends ServicoMensagemInstantanea  {

	@Override
	public void enviarMensagemABS() {
		// TODO Auto-generated method stub
		validarConectadoInternetPoli();
		System.out.println("Enviando mensagem Telegram abstract");
	}

	@Override
	public void receberMensagemABS() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem Telegram abstract");
	}

}
