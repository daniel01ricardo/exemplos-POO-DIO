import aplicativos.FacebookMessenger;
import aplicativos.MSNMessenger;
import aplicativos.Telegram;
import services.ServicoMensagemInstantanea;

public class ComputadorPedrinhoPolimorfismo {
		public static void main(String[] args) {
			ServicoMensagemInstantanea smi = null;
		
			String appEscolhido="tlg";
		
			if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
			else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
			else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			smi.enviarMensagemABS();
			smi.receberMensagemABS();
		
		
	}
}
