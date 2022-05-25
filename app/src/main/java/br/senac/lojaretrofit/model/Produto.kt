package br.senac.lojaretrofit.model

data class Produto(
    var descontoPromocao: Double?,
    var ativoProduto: Boolean,
    var idCategoria: Int?,
    var descProduto: String = "",
    var idProduto: Int?,
    var precProduto: Float?,
    var nomeProduto: String = "",
    var qtMinEstoque: Int?
)
