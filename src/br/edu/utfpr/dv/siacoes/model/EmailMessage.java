package br.edu.utfpr.dv.siacoes.model;

import br.edu.utfpr.dv.siacoes.model.Module.SystemModule;

public class EmailMessage {
	
	public enum MessageType{
		NONE(0), ACTIVITYSUBMITED(1), 
		ACTIVITYFEEDBACK(2),
		INTERNSHIPINCLUDEDSTUDENT(3),
		INTERNSHIPINCLUDEDSUPERVISOR(4),
		PROPOSALREGISTERSTUDENT(5),
		PROPOSALREGISTERSUPERVISOR(6),
		PROPOSALSUBMITEDSTUDENT(7),
		PROPOSALSUBMITEDSUPERVISOR(8),
		PROPOSALCHANGESTUDENT(9),
		PROPOSALCHANGESUPERVISOR(10),
		PROPOSALAPPRAISERREGISTER(11),
		PROPOSALAPPRAISERFEEDBACK(12);
		
		private final int value; 
		MessageType(int value){ 
			this.value = value; 
		}
		
		public int getValue(){ 
			return value;
		}
		
		public static MessageType valueOf(int value){
			for(MessageType p : MessageType.values()){
				if(p.getValue() == value){
					return p;
				}
			}
			
			return null;
		}
		
		public String toString(){
			switch(this){
				case ACTIVITYSUBMITED:
					return "Comprovante de Atividade Complementar Enviado";
				case ACTIVITYFEEDBACK:
					return "Comprovante de Atividade Complementar Apreciado";
				case INTERNSHIPINCLUDEDSTUDENT:
					return "Est�gio Cadastrado (Estudante)";
				case INTERNSHIPINCLUDEDSUPERVISOR:
					return "Est�gio Cadastrado (Orientador)";
				case PROPOSALREGISTERSTUDENT:
					return "Registro de Orienta��o (Estudante)";
				case PROPOSALREGISTERSUPERVISOR:
					return "Registro de Orienta��o (Orientador)";
				case PROPOSALSUBMITEDSTUDENT:
					return "Submiss�o de Proposta de TCC 1 (Estudante)";
				case PROPOSALSUBMITEDSUPERVISOR:
					return "Submiss�o de Proposta de TCC 1 (Orientador)";
				case PROPOSALCHANGESTUDENT:
					return "Ressubmiss�o de Proposta de TCC 1 (Estudante)";
				case PROPOSALCHANGESUPERVISOR:
					return "Ressubmiss�o de Proposta de TCC 1 (Orientador)";
				case PROPOSALAPPRAISERREGISTER:
					return "Cadastro de Avaliador da Proposta de TCC 1";
				case PROPOSALAPPRAISERFEEDBACK:
					return "Feedback da Proposta de TCC 1";
				default:
					return "";
			}
		}
	}
	
	private MessageType idEmailMessage;
	private String subject;
	private String message;
	private String dataFields;
	private SystemModule module;
	
	public EmailMessage(){
		this.setIdEmailMessage(MessageType.NONE);
		this.setSubject("");
		this.setMessage("");
		this.setDataFields("");
		this.setModule(SystemModule.GENERAL);
	}
	
	public MessageType getIdEmailMessage() {
		return idEmailMessage;
	}
	public void setIdEmailMessage(MessageType idEmailMessage) {
		this.idEmailMessage = idEmailMessage;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDataFields() {
		return dataFields;
	}
	public void setDataFields(String dataFields) {
		this.dataFields = dataFields;
	}
	public SystemModule getModule() {
		return module;
	}
	public void setModule(SystemModule module) {
		this.module = module;
	}

}