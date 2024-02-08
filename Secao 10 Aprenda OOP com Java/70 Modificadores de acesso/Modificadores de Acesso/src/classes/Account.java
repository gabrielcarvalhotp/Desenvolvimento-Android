package classes;

/*
Private: A única classe que tem acesso ao atributo é a própria classe que o define, ou seja, se uma classe Pessoa
declara um atributo privado chamado nome, somente a classe Pessoa terá acesso a ele.

Default: Tem acesso a um atributo default (identificado pela ausência de modificadores) todas as classes que estiverem
no mesmo pacote que a classe que possui o atributo.

Protected: Esse é o que pega mais gente, ele é praticamente igual ao default, com a diferença de que se uma classe
(mesmo que esteja fora do pacote) estende da classe com o atributo protected, ela terá acesso a ele. Então o acesso é
por pacote e por herança.

Public: Esse é fácil, todos tem acesso :)
* */
public class Account {
    protected int numberAccount;

    public double getBalance() {
        return balance;
    }

    private double balance;

    public void deposit(double value) {
        if (value > 0)
            this.balance = this.balance + value;
    }

    public void withdrawal(double value) {
        if (value < this.balance)
            this.balance = this.balance - value;
    }
}
