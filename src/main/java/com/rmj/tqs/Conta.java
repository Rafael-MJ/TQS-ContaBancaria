package com.rmj.tqs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Rafael Jakubovsky
 * @version 0.0.12
 * @since Release 0.0.1 da aplicação
 *
 * Classe de utilização do Cucumber
 */
public class Conta {
    private int accountBalance;
    private boolean isSpecial;
    private int transferCount;

    // Cenários de conta especial.

    /**
     * Simula uma tentativa de operação de um cliente especial com saldo negativo.
     *
     * @param arg1 Define o valor do saldo
     */
    @Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
    public void um_cliente_especial_com_saldo_atual_de_reais(int arg1) {
        isSpecial = true;
        accountBalance = arg1;
    }

    /**
     * Simula uma tentativa de operação de um cliente especial com
     * saldo negativo realizando um saque.
     *
     * @param arg1 Define o valor da transação
     */
    @When("^for solicitado um saque no valor de (\\d+) reais$")
    public void for_solicitado_un_saque_no_valor_de_reais(int arg1) {
        saque(arg1);
    }

    /**
     * Simula um cenário da realização de uma operação de um cliente
     * especial com saldo negativo.
     *
     * @param arg1 Define o valor final do saldo
     */
    @Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int arg1) {
        assert arg1 == accountBalance;
    }

    /**
     * Simulação de resultados alternativos.
     */
    @Then("^check more outcomes$")
    public void check_more_outcomes() {
        assert isSpecial;
    }

    // Cenários de conta comum.

    /**
     * Simula uma tentativa de operação de um cliente comum com saldo negativo.
     *
     * @param arg1 Define o valor do saldo
     */
    @Given("^Um cliente comum com saldo atual de -(\\d+) reais$")
    public void um_cliente_comum_com_saldo_atual_de_reais(int arg1) {
        accountBalance = arg1;
        isSpecial = false;
    }

    /**
     * Simula uma tentativa de operação de um cliente comum com
     * saldo negativo realizando um saque.
     *
     * @param arg1 Define o valor da transação
     */
    @When("^solicitar um saque no valor de (\\d+) reais$")
    public void solicitar_um_saque_no_valor_de_reais(int arg1) {
        saque(arg1);
    }

    /**
     * Simula um cenário da realização de uma operação de um cliente
     * comum com saldo negativo.
     */
    @Then("^não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente$")
    public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_Saldo_Insuficiente() {
        assert transferCount == 0;
    }

    /**
     * Realiza a operação de saque.
     *
     * @param ammount Define o valor do saque
     */
    public void saque(int ammount) {
        if(accountBalance >= ammount || isSpecial) {
            accountBalance -= ammount;
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