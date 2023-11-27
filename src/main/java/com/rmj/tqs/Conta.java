package com.rmj.tqs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Rafael Jakubovsky
 * @version 0.0.21
 * @since Release 0.0.1
 *
 * Classe de utilizacao do Cucumber
 */
public class Conta {
    private int accountBalance;
    private boolean isSpecial;
    private int transferCount;

    // cenarios de conta especial.

    /**
     * Simula uma tentativa de operacao de um cliente especial com saldo negativo.
     *
     * @param int1 Define o valor do saldo
     */
    @Given("Um cliente especial com saldo atual de {int} reais")
    public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
        isSpecial = true;
        accountBalance = int1;
    }

    /**
     * Simula uma tentativa de operacao de um cliente especial com
     * saldo negativo realizando um saque.
     *
     * @param int1 Define o valor da transacao
     */
    @When("for solicitado um saque no valor de {int} reais")
    public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
        saque(int1);
    }

    /**
     * Simula um cenario da realização de uma operacao de um cliente
     * especial com saldo negativo.
     *
     * @param int1 Define o valor final do saldo
     */
    @Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
        assert int1 == accountBalance;
    }

    /**
     * Simulação de resultados alternativos.
     */
    @Then("check more outcomes")
    public void check_more_outcomes() {
        assert isSpecial;
    }

    // cenarios de conta comum.

    /**
     * Simula uma tentativa de operacao de um cliente comum com saldo negativo.
     *
     * @param int1 Define o valor do saldo
     */
    @Given("Um cliente comum com saldo atual de {int} reais")
    public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
        accountBalance = int1;
        isSpecial = false;
    }

    /**
     * Simula uma tentativa de operacao de um cliente comum com
     * saldo negativo realizando um saque.
     *
     * @param int1 Define o valor da transacao
     */
    @When("solicitar um saque no valor de {int} reais")
    public void solicitar_um_saque_no_valor_de_reais(Integer int1) {
        saque(int1);
    }

    /**
     * Simula um cenario da realização de uma operacao de um cliente
     * comum com saldo negativo.
     */
    @Then("não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
    public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
        assert transferCount == 0;
    }

    /**
     * Realiza a operacao de saque.
     *
     * @param amount Define o valor do saque
     */
    public void saque(int amount) {
        if(accountBalance >= amount || isSpecial) {
            accountBalance -= amount;
            transferCount++;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    /**
     * Verifica o saldo da conta.
     *
     * @return O saldo da conta
     */
    public int getAccountBalance() {
        return accountBalance;
    }

    /**
     * Define o saldo da conta.
     *
     * @param accountBalance Definir novo saldo
     */
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * Verifica o status da conta.
     *
     * @return {@code true} se a conta é especial, {@code false} se a conta for comum
     */
    public boolean isSpecial() {
        return isSpecial;
    }

    /**
     * Define o status da conta.
     *
     * @param special {@code true} define como especial, {@code false} define como comum
     */
    public void setSpecial(boolean special) {
        isSpecial = special;
    }
}