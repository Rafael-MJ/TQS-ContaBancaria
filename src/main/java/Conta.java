import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Rafael Jakubovsky
 * @version 0.0.11
 * @since Release 0.0.1 da aplicação
 *
 * Classe de utilização do Cucumber
 */
public class Conta {

    // Cenários de conta especial.

    /**
     * Simula uma tentativa de operação de um cliente especial com saldo negativo.
     *
     * @param arg1 Define o valor da transação
     * @throws Throwable Lançamento de possível exceção
     */
    @Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
    public void um_cliente_especial_com_saldo_atual_de_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Simula uma tentativa de operação de um cliente especial com
     * saldo negativo realizando um saque.
     *
     * @param arg1 Define o valor da transação
     * @throws Throwable Lançamento de possível exceção
     */
    @When("^for solicitado um saque no valor de (\\d+) reais$")
    public void for_solicitado_un_saque_no_valor_de_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Simula um cenário da realização de uma operação de um cliente
     * especial com saldo negativo.
     *
     * @param arg1 Define o valor da transação
     * @throws Throwable Lançamento de possível exceção
     */
    @Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Simulação de resultados alternativos.
     *
     * @throws Throwable Lançamento de possível exceção
     */
    @Then("^check more outcomes$")
    public void check_more_outcomes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    // Cenários de conta comum.

    /**
     * Simula uma tentativa de operação de um cliente comum com saldo negativo.
     *
     * @param arg1 Define o valor da transação
     * @throws Throwable Lançamento de possível exceção
     */
    @Given("^Um cliente comum com saldo atual de -(\\d+) reais$")
    public void um_cliente_comum_com_saldo_atual_de_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Simula uma tentativa de operação de um cliente comum com
     * saldo negativo realizando um saque.
     *
     * @param arg1 Define o valor da transação
     * @throws Throwable Lançamento de possível exceção
     */
    @When("^solicitar um saque no valor de (\\d+) reais$")
    public void solicitar_um_saque_no_valor_de_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Simula um cenário da realização de uma operação de um cliente
     * comum com saldo negativo.
     *
     * @throws Throwable Lançamento de possível exceção
     */
    @Then("^não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente$")
    public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_Saldo_Insuficiente() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
