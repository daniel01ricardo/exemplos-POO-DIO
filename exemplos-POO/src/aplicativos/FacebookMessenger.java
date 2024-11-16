package aplicativos;

import services.ServicoMensagemInstantanea;

public class FacebookMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagemABS() {
		// TODO Auto-generated method stub
		validarConectadoInternetPoli();
		System.out.println("Enviando mensagem Facebook abstract");
	}

	@Override
	public void receberMensagemABS() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem Facebook abstract");
	}

}
