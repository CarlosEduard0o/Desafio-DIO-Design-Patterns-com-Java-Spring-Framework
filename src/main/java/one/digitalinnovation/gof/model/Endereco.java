package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 */

 @Entity
public class Endereco {

    //Essa classe representa a entidade Endereco,
    //que possui diversos atributos.
    //Além disso tem seus métodos toString, getters
    //e setters.

    @Id
    private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;

    
    @Override
    public String toString() {
        return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + ", bairro="
                + bairro + ", localidade=" + localidade + ", uf=" + uf + ", ibge=" + ibge + ", gia=" + gia + ", ddd="
                + ddd + ", siafi=" + siafi + "]";
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getIbge() {
        return ibge;
    }
    public void setIbge(String ibge) {
        this.ibge = ibge;
    }
    public String getGia() {
        return gia;
    }
    public void setGia(String gia) {
        this.gia = gia;
    }
    public String getDdd() {
        return ddd;
    }
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    public String getSiafi() {
        return siafi;
    }
    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }
	

}