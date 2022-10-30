/***************************************************************************************
 *
 * TESTE DE PERFORMANCE - TP1
 * Instituto Infnet
 * Engenharia de Software
 *
 * Fundamentos do Desenvolvimento Java
 *
 * Aluno: Nelson Kenji Idehara
 * Professor: Elberth Moraes
 * Data: 31 Outubro 2022
 *
 ***************************************************************************************/
import java.util.Scanner;

class Main {
    public static int opcao;
    
    public static String [] nomes;
    public static float  [] av1;
    public static float  [] av2;
    
    public static void main(String[] args) {
        final int TAMANHO = 100;
        
        Scanner in = new Scanner(System.in);
        nomes = new String[TAMANHO];
        av1   = new float[TAMANHO];         
        av2   = new float[TAMANHO];         

        // SOMENTE PARA TESTE
        teste(nomes, av1, av2);
        
        do {
            System.out.println("[1] Registrar as notas de um novo aluno");
            System.out.println("[2] Consultar boletim de um aluno");
            System.out.println("[3] Consultar notas da turma");
            System.out.println("[4] Sair");
            opcao = Integer.valueOf(in.nextLine());
            
            //
            if (opcao < 1 || opcao > 4){
                System.out.println("Opção inexistente!\n");                
            }
        } while (opcao != 4);
    }

    public static void teste(String[] nomes, float[] av1, float[] av2) {
        nomes[0]="Agatha Pires";         av1[0]=5.4f;  av2[0]=8.1f;
        nomes[1]="Alexandre Marques";    av1[1]=3.5f;  av2[1]=2f;
        nomes[2]="Amanda Coelho";        av1[2]=8.8f;  av2[2]=3.4f;
        nomes[3]="Ana Barbosa";          av1[3]=3.2f;  av2[3]=6.8f;
        nomes[4]="André Santos";         av1[4]=6.7f;  av2[4]=0.2f;
        nomes[5]="Antonela Santiago";    av1[5]=1.7f;  av2[5]=6f;
        nomes[6]="Antônio Lopes";        av1[6]=3.5f;  av2[6]=9.2f;
        nomes[7]="Augusto Martins";      av1[7]=5.3f;  av2[7]=7.8f;
        nomes[8]="Aurora Gonçalves";     av1[8]=8.4f;  av2[8]=3.2f;
        nomes[9]="Bárbara Monteiro";     av1[9]=3.8f;  av2[9]=7.9f;
        nomes[10]="Beatriz Albuquerque"; av1[10]=9f;   av2[10]=3f;
        nomes[11]="Bianca Cardoso";      av1[11]=3.9f; av2[11]=9.9f;
        nomes[12]="Breno Carmo";         av1[12]=7.3f; av2[12]=7.5f;
        nomes[13]="Bruna Mesquita";      av1[13]=8.3f; av2[13]=9.4f;
        nomes[14]="Bruno Carvalho";      av1[14]=4f;   av2[14]=6.2f;
        nomes[15]="Caio Machado";        av1[15]=7.2f; av2[15]=4.8f;
        nomes[16]="Camila Ribeiro";      av1[16]=2.2f; av2[16]=1.2f;
        nomes[17]="Carolina Silva";      av1[17]=5.4f; av2[17]=0.4f;
        nomes[18]="Catarina Moraes";     av1[18]=5.6f; av2[18]=0.7f;
        nomes[19]="Cecília Gomes";       av1[19]=4.2f; av2[19]=9.6f;
        nomes[20]="Clara Ramos";         av1[20]=1.8f; av2[20]=1f;
        nomes[21]="Clarice Cruz";        av1[21]=6.8f; av2[21]=3.8f;
        nomes[22]="Daniel Souza";        av1[22]=1.6f; av2[22]=8.3f;
        nomes[23]="Danilo Dias";         av1[23]=9.3f; av2[23]=8.7f;
        nomes[24]="Eduarda Mendes";      av1[24]=7.3f; av2[24]=1.6f;
        nomes[25]="Eduardo Moreira";     av1[25]=0.3f; av2[25]=6.1f;
        nomes[26]="Elisa Dias";          av1[26]=5f;   av2[26]=1.2f;
        nomes[27]="Emanuelly Gomes";     av1[27]=0.4f; av2[27]=2.6f;
        nomes[28]="Emilly Neves";        av1[28]=6.4f; av2[28]=4.7f;
        nomes[29]="Enzo Garcia";         av1[29]=6.2f; av2[29]=0.7f;
        nomes[30]="Erick Costa";         av1[30]=5f;   av2[30]=7.5f;
        nomes[31]="Esther Pereira";      av1[31]=9.4f; av2[31]=6.7f;
        nomes[32]="Felipe Rocha";        av1[32]=2.5f; av2[32]=6.6f;
        nomes[33]="Fernanda Castro";     av1[33]=2.6f; av2[33]=9.5f;
        nomes[34]="Fernando Ferreira";   av1[34]=9f;   av2[34]=3.5f;
        nomes[35]="Francisco Marques";   av1[35]=1.3f; av2[35]=9.1f;
        nomes[36]="Frederico Araújo";    av1[36]=7.5f; av2[36]=9f;
        nomes[37]="Gabriela Cunha";      av1[37]=5.8f; av2[37]=4.8f;
        nomes[38]="Gabrielle Oliveira";  av1[38]=2.1f; av2[38]=8.8f;
        nomes[39]="Giovanna Pires";      av1[39]=0.7f; av2[39]=2.5f;
        nomes[40]="Giulia Almeida";      av1[40]=6.3f; av2[40]=7.8f;
        nomes[41]="Guilherme Neves";     av1[41]=8.2f; av2[41]=9.9f;
        nomes[42]="Gustavo Azevedo";     av1[42]=1.7f; av2[42]=4.8f;
        nomes[43]="Heloísa Moura";       av1[43]=2.7f; av2[43]=9.4f;
        nomes[44]="Henrique Couto";      av1[44]=5.4f; av2[44]=7.8f;
        nomes[45]="Isabel Lima";         av1[45]=7.4f; av2[45]=1.9f;
        nomes[46]="Isabelly Monteiro";   av1[46]=4.3f; av2[46]=3.4f;
        nomes[47]="Isadora Furtado";     av1[47]=8.3f; av2[47]=7.9f;
        nomes[48]="Isis Fernandes";      av1[48]=1.3f; av2[48]=8.9f;
        nomes[49]="Joana Camargo";       av1[49]=3.4f; av2[49]=3.3f;
        nomes[50]="João Martins";        av1[50]=2.1f; av2[50]=3.2f;
        nomes[51]="Kaique Bastos";       av1[51]=0.6f; av2[51]=1.1f;
        nomes[52]="Laís Aragão";         av1[52]=7f;   av2[52]=9.4f;
        nomes[53]="Lara Rocha";          av1[53]=5.1f; av2[53]=3.7f;
        nomes[54]="Larissa Fonseca";     av1[54]=0.9f; av2[54]=2.6f;
        nomes[55]="Lavínia Freitas";     av1[55]=3f;   av2[55]=9.7f;
        nomes[56]="Leonardo Santiago";   av1[56]=5.8f; av2[56]=5.9f;
        nomes[57]="Letícia Botelho";     av1[57]=8.1f; av2[57]=9.7f;
        nomes[58]="Lorena Pedrosa";      av1[58]=2.2f; av2[58]=4.2f;
        nomes[59]="Luan Amorim";         av1[59]=9f;   av2[59]=1.7f;
        nomes[60]="Luana Soares";        av1[60]=2.2f; av2[60]=8f;
        nomes[61]="Lucas Duarte";        av1[61]=8.4f; av2[61]=7.2f;
        nomes[62]="Maitê Amorim";        av1[62]=4.1f; av2[62]=0.5f;
        nomes[63]="Malu Pedrosa";        av1[63]=7f;   av2[63]=9.7f;
        nomes[64]="Maria Alves";         av1[64]=0.8f; av2[64]=2.6f;
        nomes[65]="Mariah Alvares";      av1[65]=6.8f; av2[65]=0.3f;
        nomes[66]="Mariana Frota";       av1[66]=7.7f; av2[66]=8.7f;
        nomes[67]="Marina Nunes";        av1[67]=3f;   av2[67]=7.6f;
        nomes[68]="Mathias Rodrigues";   av1[68]=8.5f; av2[68]=1.6f;
        nomes[69]="Maya Lima";           av1[69]=1.4f; av2[69]=3.8f;
        nomes[70]="Melissa Cardoso";     av1[70]=3.7f; av2[70]=9.8f;
        nomes[71]="Milena Nascimento";   av1[71]=8.6f; av2[71]=1.1f;
        nomes[72]="Mirella Frota";       av1[72]=6.7f; av2[72]=6.2f;
        nomes[73]="Murilo Nunes";        av1[73]=6.3f; av2[73]=3.2f;
        nomes[74]="Natália Pereira";     av1[74]=9.4f; av2[74]=2.4f;
        nomes[75]="Nathan Bernardes";    av1[75]=4f;   av2[75]=5.1f;
        nomes[76]="Nicole Figueiredo";   av1[76]=2.2f; av2[76]=8.2f;
        nomes[77]="Olívia Lopes";        av1[77]=5.7f; av2[77]=4f;
        nomes[78]="Otávio Pimentel";     av1[78]=6.9f; av2[78]=7.9f;
        nomes[79]="Pietra Moura";        av1[79]=8f;   av2[79]=9.7f;
        nomes[80]="Pietro Moreira";      av1[80]=0.7f; av2[80]=5.8f;
        nomes[81]="Rafael Bernardes";    av1[81]=2.9f; av2[81]=4.7f;
        nomes[82]="Rafaela Almeida";     av1[82]=9.1f; av2[82]=2.2f;
        nomes[83]="Raul Barbosa";        av1[83]=3f;   av2[83]=4.8f;
        nomes[84]="Rebeca Teixeira";     av1[84]=9.3f; av2[84]=3.1f;
        nomes[85]="Rian Andrade";        av1[85]=2.1f; av2[85]=5.2f;
        nomes[86]="Ricardo Batista";     av1[86]=3f;   av2[86]=5.4f;
        nomes[87]="Rodrigo Garcia";      av1[87]=7.8f; av2[87]=2.1f;
        nomes[88]="Samuel Couto";        av1[88]=5f;   av2[88]=7.4f;
        nomes[89]="Sara Vieira";         av1[89]=10f;  av2[89]=4.4f;
        nomes[90]="Sophie Soares";       av1[90]=2.5f; av2[90]=2.2f;
        nomes[91]="Stella Antunes";      av1[91]=3.6f; av2[91]=6.2f;
        nomes[92]="Thiago Aragão";       av1[92]=0.8f; av2[92]=5.8f;
        nomes[93]="Thomas Simões";       av1[93]=0f;   av2[93]=6.3f;
        nomes[94]="Vicente Castro";      av1[94]=8f;   av2[94]=5.4f;
        nomes[95]="Vinícius Ferreira";   av1[95]=0.8f; av2[95]=7.6f;
        nomes[96]="Vitor Mesquita";      av1[96]=7.3f; av2[96]=2.2f;
        nomes[97]="Vitória Santana";     av1[97]=5.3f; av2[97]=5.6f;
        nomes[98]="Yago Teixeira";       av1[98]=8.1f; av2[98]=6.8f;
        nomes[99]="Yasmin Freitas";      av1[99]=7.7f; av2[99]=6.9f;
    }
}