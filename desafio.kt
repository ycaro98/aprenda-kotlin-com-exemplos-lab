// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario (val username: String, val matricula: String)


data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    
    fun addUsuario(){
        for(usuario in inscritos){
            println("nome: ${usuario.username}")
        }
    }
    
       fun listarInscritos() {
        inscritos.forEach { u -> println("Nome: ${u.username} - Matrícula: ${u.matricula}") }
    }
       
    fun printConteudoEducacional(){
        for(cont in conteudos){
            println("${cont.nome} - ${cont.duracao}min - (${cont.nivel})")
        }
    
    }
}

fun main() {
    val kotlinExperience = listOf(ConteudoEducacional("Abstraindo Formações da DIO Usando Orientação a Objetos com Kotlin", 120, Nivel.BASICO),
  	  ConteudoEducacional("Estruturas de Controle de Fluxo e Coleções em Kotlin", 120, Nivel.BASICO))
    	
  		val formacaoKotlin = Formacao("Kotlin Experience", kotlinExperience, )
        
        formacaoKotlin.matricular(Usuario("Ycaro Rodrigues", "553322"))
        formacaoKotlin.listarInscritos()
        formacaoKotlin.printConteudoEducacional()
   		  
}
