programa
{
	inclua biblioteca Util
	/*
	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação. 
*/
	funcao inicio()
	{
		inteiro lancamento [10]	
		real media= 0.00, total=0.00
		inteiro maiorValor=0
		inteiro MVRepet=0

		para(inteiro x=0; x<10; x++){
			lancamento[x]=Util.sorteia(1,6)
			escreva(lancamento[x])
			total=total+lancamento[x]
			se(lancamento[x]>=maiorValor){
				se(lancamento[x]==maiorValor){
					MVRepet++
				}
				senao se(lancamento[x]>maiorValor){
					MVRepet=1
				}
				maiorValor=lancamento[x]
			}
			
			
				
		escreva("\n")
		}
		media=total/10
		escreva("A media dos lançamentos: ", media, "\n")
		escreva("A soma de números lançandos é: ", total, "\n")
	     escreva("O maior número apareceu ",MVRepet," vez(es).\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 729; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */