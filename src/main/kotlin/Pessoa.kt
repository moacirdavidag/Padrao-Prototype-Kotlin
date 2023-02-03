// Protótipo
class Pessoa : IPrototype {
    var nome: String ?= null
    var idade: Int ?= null

    constructor(nome: String, idade: Int) {
        this.nome = nome
        this.idade = idade
    }

    fun getNome() {
        println(this.nome)
    }

    override fun clone(): Pessoa {
        return this
    }
}