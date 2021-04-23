package it.objectmethod.world.model;

public class Country {

	private String codiceNazione;
	private String nomeNazione;
	private String nomeContinente;
	private String nomeRegione;
	private int superfice;
	private int annoInipendenza;
	private int popolazione;

	public String getCodiceNazione() {
		return codiceNazione;
	}

	public void setCodiceNazione(String codiceNazione) {
		this.codiceNazione = codiceNazione;
	}

	public String getNomeNazione() {
		return nomeNazione;
	}

	public void setNomeNazione(String nomeNazione) {
		this.nomeNazione = nomeNazione;
	}

	public String getNomeContinente() {
		return nomeContinente;
	}

	public void setNomeContinente(String nomeContinente) {
		this.nomeContinente = nomeContinente;
	}

	public String getNomeRegione() {
		return nomeRegione;
	}

	public void setNomeRegione(String nomeRegione) {
		this.nomeRegione = nomeRegione;
	}

	public int getSuperfice() {
		return superfice;
	}

	public void setSuperfice(int sperfice) {
		this.superfice = sperfice;
	}

	public int getAnnoInipendenza() {
		return annoInipendenza;
	}

	public void setAnnoInipendenza(int annoInipendenza) {
		this.annoInipendenza = annoInipendenza;
	}

	public int getPopolazione() {
		return popolazione;
	}

	public void setPopolazione(int popolazione) {
		this.popolazione = popolazione;
	}
	
	@Override
	public String toString() {
		return codiceNazione+nomeNazione+nomeContinente+nomeRegione+superfice+annoInipendenza+popolazione;
	}

}
