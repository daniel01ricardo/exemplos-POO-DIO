
import aplicativos.FacebookMessenger;
import aplicativos.MSNMessenger;
import aplicativos.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
	System.out.println("MSN: ");
	MSNMessenger msn = new MSNMessenger();
	
	msn.enviarMensagem();
	msn.receberMensagem();
	msn.enviarMensagemABS();
	
	System.out.println("Facebook: ");
	FacebookMessenger fcb = new FacebookMessenger();
	
	fcb.enviarMensagem();
	fcb.receberMensagem();
	fcb.enviarMensagemABS();
	
	System.out.println("Telegram: ");
	Telegram tlg = new Telegram();
	
	tlg.enviarMensagem();
	tlg.receberMensagem();
	tlg.enviarMensagemABS();
}
}