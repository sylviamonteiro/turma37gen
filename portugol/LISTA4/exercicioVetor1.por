programa
{
	
	funcao inicio()
	{
		inteiro vetor [5], i, maiorPontuacao=0
		para(i=0;i<=4;i++){
			escreva("Escreva sua " , i+1, "ª nota ")
			leia(vetor[i])
			se(vetor[i]>= maiorPontuacao){
				maiorPontuacao = vetor[i]
			}
		}
		escreva("Sua maior nota foi: ", maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 137; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */