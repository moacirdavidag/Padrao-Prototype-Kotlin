fun main(args: Array<String>) {
    // ADS 2022.2 - IFPB CZ
    // Instanciamos um objeto de uma classe qualquer
    // esse será o objeto protótipo que queremos
    // clonar

    var pessoa = Pessoa("Fernanda", 20)

    // Para copiar o objeto
    // chamamos o seu método clone
    // da interface IPrototype implementada
    var copiaPessoa = pessoa.clone()

    // Ambos objetos retornarão a mesma coisa
    // pois, copiaPessoa é um clone de pessoa
    pessoa.getNome()
    copiaPessoa.getNome()
}