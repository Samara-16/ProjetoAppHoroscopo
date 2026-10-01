/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Image;
import java.time.LocalDate;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

/**
 *
 * @author SamaraTavares
 */
public class Signos extends javax.swing.JFrame {
    
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Signos.class.getName());

    /**
     * Creates new form Signos
     */
    // CRIANDO VÁRIAVEL PARA GUARDAR A MUSICA
    Clip musica;
    
    public Signos() {
    initComponents();
    RedimensionarImagens(); 
    PreencherPevisao();
    PreencherMensagem();
    CorrigirAreasTextos();
   
    }

    // TODA FUNÇÃO É CRIADA ABAIXO DO CONSTRUTOR
    
public void RedimensionarImagens(){
        // capturar as imagens que estão dentro da label
        ImageIcon aries = (ImageIcon) imgSignoAries.getIcon();
        ImageIcon touro = (ImageIcon) imgSignoTouro.getIcon();
        ImageIcon gemeos = (ImageIcon) imgSignoGemeos.getIcon();
        ImageIcon cancer = (ImageIcon) imgSignoCancer.getIcon();
        ImageIcon leao = (ImageIcon) imgSignoLeao.getIcon();
        ImageIcon virgem = (ImageIcon) imgSignoVirgem.getIcon();
        ImageIcon libras = (ImageIcon) imgSignoLibras.getIcon();
        ImageIcon escorpiao = (ImageIcon) imgSignoEscorpiao.getIcon();
        ImageIcon sagitario = (ImageIcon) imgSignoSagitario.getIcon();
        ImageIcon capricornio = (ImageIcon) imgSignoCapricornio.getIcon();
        ImageIcon aquario = (ImageIcon) imgSignoAquario.getIcon();
        ImageIcon peixes = (ImageIcon) imgSignoPeixes.getIcon();
        
        // redimensionar o tamanho delas
        Image imgAries = aries.getImage().getScaledInstance(390,364, Image.SCALE_SMOOTH);
        Image imgTouro = touro.getImage().getScaledInstance(390,364, Image.SCALE_SMOOTH);
        Image imgGemeos = gemeos.getImage().getScaledInstance(390,364, Image.SCALE_SMOOTH);
        Image imgCancer = cancer.getImage().getScaledInstance(390,364, Image.SCALE_SMOOTH);
        Image imgLeao = leao.getImage().getScaledInstance(390,364, Image.SCALE_SMOOTH);
        Image imgVirgem = virgem.getImage().getScaledInstance(390,364, Image.SCALE_SMOOTH);
        Image imgLibras= libras.getImage().getScaledInstance(390,364, Image.SCALE_SMOOTH);
        Image imgEscorpiao= escorpiao.getImage().getScaledInstance(390,364, Image.SCALE_SMOOTH);
        Image imgSagitario = sagitario.getImage().getScaledInstance(390,364, Image.SCALE_SMOOTH);
        Image imgCapricornio = capricornio.getImage().getScaledInstance(390,364, Image.SCALE_SMOOTH);
        Image imgAquario = aquario.getImage().getScaledInstance(390,364, Image.SCALE_SMOOTH);
        Image imgPeixes = peixes.getImage().getScaledInstance(390,364, Image.SCALE_SMOOTH);
        
        // JOGAR A IMAGEM REDIMENSIONADA DA LABEL NOVAMENTE
        imgSignoAries.setIcon(new ImageIcon (imgAries));
        imgSignoTouro.setIcon(new ImageIcon (imgTouro));
        imgSignoGemeos.setIcon(new ImageIcon (imgGemeos));
        imgSignoCancer.setIcon(new ImageIcon (imgCancer));
        imgSignoLeao.setIcon(new ImageIcon (imgLeao));
        imgSignoVirgem.setIcon(new ImageIcon (imgVirgem));
        imgSignoLibras.setIcon(new ImageIcon (imgLibras));
        imgSignoEscorpiao.setIcon(new ImageIcon (imgEscorpiao));
        imgSignoSagitario.setIcon(new ImageIcon (imgSagitario));
        imgSignoCapricornio.setIcon(new ImageIcon (imgCapricornio));
        imgSignoAquario.setIcon(new ImageIcon (imgAquario));
        imgSignoPeixes.setIcon(new ImageIcon (imgPeixes));
        
    }// fim da função
    
    
public void PreencherPevisao(){
        //verificar o dia da semana
        //LocalDate - puxa a data do computador
        int diaSemana = LocalDate.now().getDayOfWeek().getValue();
        
        // CRIAR A CONDICIONAL PARA PREENCHER O CAMPO PREVISÃO.
        switch(diaSemana){
            case 1://segunda-feira
                 txtPrevisaoAries.setText("");
                 txtPrevisaoTouro.setText("");
                 txtPrevisaoGemeos.setText("");
                 txtPrevisaoCancer.setText("");
                 txtPrevisaoLeao.setText("");
                 txtPrevisaoVirgem.setText("");
                 txtPrevisaoLibras.setText("");
                 txtPrevisaoEscorpiao.setText("");
                 txtPrevisaoSagitario.setText("");
                 txtPrevisaoCapricornio.setText("");
                 txtPrevisaoAquario.setText("");
                 txtPrevisaoPeixes.setText("");
                break;
            case 2://terça-feira
                 txtPrevisaoAries.setText("");
                 txtPrevisaoTouro.setText("");
                 txtPrevisaoGemeos.setText("");
                 txtPrevisaoCancer.setText("");
                 txtPrevisaoLeao.setText("");
                 txtPrevisaoVirgem.setText("");
                 txtPrevisaoLibras.setText("");
                 txtPrevisaoEscorpiao.setText("");
                 txtPrevisaoSagitario.setText("");
                 txtPrevisaoCapricornio.setText("");
                 txtPrevisaoAquario.setText("");
                 txtPrevisaoPeixes.setText("");
                break;   
            case 3://quarta-feira
                 txtPrevisaoAries.setText("");
                 txtPrevisaoTouro.setText("");
                 txtPrevisaoGemeos.setText("");
                 txtPrevisaoCancer.setText("");
                 txtPrevisaoLeao.setText("");
                 txtPrevisaoVirgem.setText("");
                 txtPrevisaoLibras.setText("");
                 txtPrevisaoEscorpiao.setText("");
                 txtPrevisaoSagitario.setText("");
                 txtPrevisaoCapricornio.setText("");
                 txtPrevisaoAquario.setText("");
                 txtPrevisaoPeixes.setText("");
                 break;
            case 4://quinta-feira
                 txtPrevisaoAries.setText("");
                 txtPrevisaoTouro.setText("");
                 txtPrevisaoGemeos.setText("");
                 txtPrevisaoCancer.setText("");
                 txtPrevisaoLeao.setText("");
                 txtPrevisaoVirgem.setText("");
                 txtPrevisaoLibras.setText("");
                 txtPrevisaoEscorpiao.setText("");
                 txtPrevisaoSagitario.setText("");
                 txtPrevisaoCapricornio.setText("");
                 txtPrevisaoAquario.setText("");
                 txtPrevisaoPeixes.setText("");
                 break;
            case 5://sexta-feira
                 txtPrevisaoAries.setText("");
                 txtPrevisaoTouro.setText("");
                 txtPrevisaoGemeos.setText("");
                 txtPrevisaoCancer.setText("");
                 txtPrevisaoLeao.setText("");
                 txtPrevisaoVirgem.setText("");
                 txtPrevisaoLibras.setText("");
                 txtPrevisaoEscorpiao.setText("");
                 txtPrevisaoSagitario.setText("");
                 txtPrevisaoCapricornio.setText("");
                 txtPrevisaoAquario.setText("");
                 txtPrevisaoPeixes.setText("");
                 break;     
            case 6://sábado
                 txtPrevisaoAries.setText("");
                 txtPrevisaoTouro.setText("");
                 txtPrevisaoGemeos.setText("");
                 txtPrevisaoCancer.setText("");
                 txtPrevisaoLeao.setText("");
                 txtPrevisaoVirgem.setText("");
                 txtPrevisaoLibras.setText("");
                 txtPrevisaoEscorpiao.setText("");
                 txtPrevisaoSagitario.setText("");
                 txtPrevisaoCapricornio.setText("");
                 txtPrevisaoAquario.setText("");
                 txtPrevisaoPeixes.setText("");
                 break;     
            case 7://domingo
                 txtPrevisaoAries.setText("");
                 txtPrevisaoTouro.setText("");
                 txtPrevisaoGemeos.setText("");
                 txtPrevisaoCancer.setText("");
                 txtPrevisaoLeao.setText("");
                 txtPrevisaoVirgem.setText("");
                 txtPrevisaoLibras.setText("");
                 txtPrevisaoEscorpiao.setText("");
                 txtPrevisaoSagitario.setText("");
                 txtPrevisaoCapricornio.setText("");
                 txtPrevisaoAquario.setText("");
                 txtPrevisaoPeixes.setText("");
                 break;     
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
    }       
        
    }
    
    
public void PreencherMensagem(){
        //CAPTURAR DIA DA SEMANA
        int diaSemana = LocalDate.now().getDayOfWeek().getValue();
        //CONDICIONAL
        switch(diaSemana){
            case 1:
                txMensagemAries.setText("");
                txMensagemTouro.setText("");
                txMensagemGemeos.setText("");
                txMensagemCancer.setText("");
                txMensagemLeao.setText("");
                txMensagemVirgem.setText("");
                txMensagemLibras.setText("");
                txMensagemEscorpiao.setText("");
                txMensagemSagitario.setText("");
                txMensagemCapricornio.setText("");
                txMensagemAquario.setText("");
                txMensagemPeixes.setText("");
                break;
            case 2:
                txMensagemAries.setText("");
                txMensagemTouro.setText("");
                txMensagemGemeos.setText("");
                txMensagemCancer.setText("");
                txMensagemLeao.setText("");
                txMensagemVirgem.setText("");
                txMensagemLibras.setText("");
                txMensagemEscorpiao.setText("");
                txMensagemSagitario.setText("");
                txMensagemCapricornio.setText("");
                txMensagemAquario.setText("");
                txMensagemPeixes.setText("");
                break;
            case 3:   
                txMensagemAries.setText("");
                txMensagemTouro.setText("");
                txMensagemGemeos.setText("");
                txMensagemCancer.setText("");
                txMensagemLeao.setText("");
                txMensagemVirgem.setText("");
                txMensagemLibras.setText("");
                txMensagemEscorpiao.setText("");
                txMensagemSagitario.setText("");
                txMensagemCapricornio.setText("");
                txMensagemAquario.setText("");
                txMensagemPeixes.setText("");
                break;
            case 4:
                txMensagemAries.setText("");
                txMensagemTouro.setText("");
                txMensagemGemeos.setText("");
                txMensagemCancer.setText("");
                txMensagemLeao.setText("");
                txMensagemVirgem.setText("");
                txMensagemLibras.setText("");
                txMensagemEscorpiao.setText("");
                txMensagemSagitario.setText("");
                txMensagemCapricornio.setText("");
                txMensagemAquario.setText("");
                txMensagemPeixes.setText("");
                break;
            case 5: 
                txMensagemAries.setText("");
                txMensagemTouro.setText("");
                txMensagemGemeos.setText("");
                txMensagemCancer.setText("");
                txMensagemLeao.setText("");
                txMensagemVirgem.setText("");
                txMensagemLibras.setText("");
                txMensagemEscorpiao.setText("");
                txMensagemSagitario.setText("");
                txMensagemCapricornio.setText("");
                txMensagemAquario.setText("");
                txMensagemPeixes.setText("");
                break;
            case 6:    
                txMensagemAries.setText("");
                txMensagemTouro.setText("");
                txMensagemGemeos.setText("");
                txMensagemCancer.setText("");
                txMensagemLeao.setText("");
                txMensagemVirgem.setText("");
                txMensagemLibras.setText("");
                txMensagemEscorpiao.setText("");
                txMensagemSagitario.setText("");
                txMensagemCapricornio.setText("");
                txMensagemAquario.setText("");
                txMensagemPeixes.setText("");
                break;
            case 7:    
                txMensagemAries.setText("");
                txMensagemTouro.setText("");
                txMensagemGemeos.setText("");
                txMensagemCancer.setText("");
                txMensagemLeao.setText("");
                txMensagemVirgem.setText("");
                txMensagemLibras.setText("");
                txMensagemEscorpiao.setText("");
                txMensagemSagitario.setText("");
                txMensagemCapricornio.setText("");
                txMensagemAquario.setText("");
                txMensagemPeixes.setText("");
                break;
                  
        }// fim do switch
    }// fim de preencherMensagem
    
    
public void CorrigirAreasTextos(){
        //CORRIGIR MENSAGEM
        txMensagemAries.setLineWrap(true);
        txMensagemAries.setWrapStyleWord(true);
        //CORRIGIR PREVISÃO
        txtPrevisaoTouro.setLineWrap(true);
        txtPrevisaoTouro.setWrapStyleWord(true);
         //CORRIGIR PONTOS FORTES
        txFortesTouro.setLineWrap(true);
        txFortesTouro.setWrapStyleWord(true);
         //CORRIGIR PONTOS A MELHORAR
        txMelhorarTouro.setLineWrap(true);
        txMelhorarTouro.setWrapStyleWord(true);
        
         //CORRIGIR MENSAGEM
        txMensagemGemeos.setLineWrap(true);
        txMensagemGemeos.setWrapStyleWord(true);
        //CORRIGIR PREVISÃO
        txtPrevisaoGemeos.setLineWrap(true);
        txtPrevisaoGemeos.setWrapStyleWord(true);
         //CORRIGIR PONTOS FORTES
        txFortesGemeos.setLineWrap(true);
        txFortesGemeos.setWrapStyleWord(true);
         //CORRIGIR PONTOS A MELHORAR
        txMelhorarGemeos.setLineWrap(true);
        txMelhorarGemeos.setWrapStyleWord(true);
        
         //CORRIGIR MENSAGEM
        txMensagemCancer.setLineWrap(true);
        txMensagemCancer.setWrapStyleWord(true);
        //CORRIGIR PREVISÃO
        txtPrevisaoCancer.setLineWrap(true);
        txtPrevisaoCancer.setWrapStyleWord(true);
         //CORRIGIR PONTOS FORTES
        txFortesCancer.setLineWrap(true);
        txFortesCancer.setWrapStyleWord(true);
         //CORRIGIR PONTOS A MELHORAR
        txMelhorarCancer.setLineWrap(true);
        txMelhorarCancer.setWrapStyleWord(true);
        
         //CORRIGIR MENSAGEM
        txMensagemLeao.setLineWrap(true);
        txMensagemLeao.setWrapStyleWord(true);
        //CORRIGIR PREVISÃO
        txtPrevisaoLeao.setLineWrap(true);
        txtPrevisaoLeao.setWrapStyleWord(true);
         //CORRIGIR PONTOS FORTES
        txFortesLeao.setLineWrap(true);
        txFortesLeao.setWrapStyleWord(true);
         //CORRIGIR PONTOS A MELHORAR
        txMelhorarLeao.setLineWrap(true);
        txMelhorarLeao.setWrapStyleWord(true);
        
         //CORRIGIR MENSAGEM
        txMensagemVirgem.setLineWrap(true);
        txMensagemVirgem.setWrapStyleWord(true);
        //CORRIGIR PREVISÃO
        txtPrevisaoVirgem.setLineWrap(true);
        txtPrevisaoVirgem.setWrapStyleWord(true);
         //CORRIGIR PONTOS FORTES
        txFortesVirgem.setLineWrap(true);
        txFortesVirgem.setWrapStyleWord(true);
         //CORRIGIR PONTOS A MELHORAR
        txMelhorarVirgem.setLineWrap(true);
        txMelhorarVirgem.setWrapStyleWord(true);
        
         //CORRIGIR MENSAGEM
        txMensagemLibras.setLineWrap(true);
        txMensagemLibras.setWrapStyleWord(true);
        //CORRIGIR PREVISÃO
        txtPrevisaoLibras.setLineWrap(true);
        txtPrevisaoLibras.setWrapStyleWord(true);
         //CORRIGIR PONTOS FORTES
        txFortesLibras.setLineWrap(true);
        txFortesLibras.setWrapStyleWord(true);
         //CORRIGIR PONTOS A MELHORAR
        txMelhorarLibras.setLineWrap(true);
        txMelhorarLibras.setWrapStyleWord(true);
        
        // CORRIGIR MENSAGEM
        txMensagemEscorpiao.setLineWrap(true);
        txMensagemEscorpiao.setWrapStyleWord(true);
        // CORRIGIR PREVISÃO
        txtPrevisaoEscorpiao.setLineWrap(true);
        txtPrevisaoEscorpiao.setWrapStyleWord(true);
        // CORRIGIR PONTOS FORTES
        txFortesEscorpiao.setLineWrap(true);
        txFortesEscorpiao.setWrapStyleWord(true);
        // CORRIGIR PONTOS A MELHORAR
        txMelhorarEscorpiao.setLineWrap(true);
        txMelhorarEscorpiao.setWrapStyleWord(true);
        
        // CORRIGIR MENSAGEM
        txMensagemEscorpiao.setLineWrap(true);
        txMensagemEscorpiao.setWrapStyleWord(true);
        // CORRIGIR PREVISÃO
        txtPrevisaoEscorpiao.setLineWrap(true);
        txtPrevisaoEscorpiao.setWrapStyleWord(true);
        // CORRIGIR PONTOS FORTES
        txFortesEscorpiao.setLineWrap(true);
        txFortesEscorpiao.setWrapStyleWord(true);
        // CORRIGIR PONTOS A MELHORAR
        txMelhorarEscorpiao.setLineWrap(true);
        txMelhorarEscorpiao.setWrapStyleWord(true);

        // CORRIGIR MENSAGEM
        txMensagemCapricornio.setLineWrap(true);
        txMensagemCapricornio.setWrapStyleWord(true);
        // CORRIGIR PREVISÃO
        txtPrevisaoCapricornio.setLineWrap(true);
        txtPrevisaoCapricornio.setWrapStyleWord(true);
        // CORRIGIR PONTOS FORTES
        txFortesCapricornio.setLineWrap(true);
        txFortesCapricornio.setWrapStyleWord(true);
        // CORRIGIR PONTOS A MELHORAR
        txMelhorarCapricornio.setLineWrap(true);
        txMelhorarCapricornio.setWrapStyleWord(true);

        // CORRIGIR MENSAGEM
        txMensagemAquario.setLineWrap(true);
        txMensagemAquario.setWrapStyleWord(true);
        // CORRIGIR PREVISÃO
        txtPrevisaoAquario.setLineWrap(true);
        txtPrevisaoAquario.setWrapStyleWord(true);
        // CORRIGIR PONTOS FORTES
        txFortesAquario.setLineWrap(true);
        txFortesAquario.setWrapStyleWord(true);
        // CORRIGIR PONTOS A MELHORAR
        txMelhorarAquario.setLineWrap(true);
        txMelhorarAquario.setWrapStyleWord(true);

        // CORRIGIR MENSAGEM
        txMensagemPeixes.setLineWrap(true);
        txMensagemPeixes.setWrapStyleWord(true);
        // CORRIGIR PREVISÃO
        txtPrevisaoPeixes.setLineWrap(true);
        txtPrevisaoPeixes.setWrapStyleWord(true);
        // CORRIGIR PONTOS FORTES
        txFortesPeixes.setLineWrap(true);
        txFortesPeixes.setWrapStyleWord(true);
        // CORRIGIR PONTOS A MELHORAR
        txMelhorarPeixes.setLineWrap(true);
        txMelhorarPeixes.setWrapStyleWord(true);




        
    }// FIM DO METODO
    
    
public void CalcularSigno(){
        //capturar dados da comboBox
        //convertendo texto em numero inteiro (Integer, Double, Boolean)
        int dia = Integer.parseInt(cbDia.getSelectedItem().toString());
        String mes = cbMes.getSelectedItem().toString();
        ImageIcon imagem = null;
        
        //verificar dia e mes ndos signos com if else
        if((mes.equalsIgnoreCase("Março") && dia>=21) ||(mes.equalsIgnoreCase("Abril") && dia<=19)){
            signo.setText("Aries");// preenche o nome do signo
            imagem = (ImageIcon) imgSignoAries.getIcon();//captura sua img
            
        }else if((mes.equalsIgnoreCase("Abril") && dia>=20) ||(mes.equalsIgnoreCase("Maio") && dia<=20)){
            signo.setText("Touro");// preenche o nome do signo
            imagem = (ImageIcon) imgSignoAries.getIcon();//captura sua img
            
        }else if((mes.equalsIgnoreCase("Maio") && dia>=21) ||(mes.equalsIgnoreCase("Junho") && dia<=20)){
            signo.setText("Gemeos");// preenche o nome do signo
            imagem = (ImageIcon) imgSignoGemeos.getIcon();// captura sua img
            
        }else if((mes.equalsIgnoreCase("Junho") && dia>=21) ||(mes.equalsIgnoreCase("Julho") && dia<=22)){
            signo.setText("Cancer");// preenche o nome do signo
            imagem = (ImageIcon) imgSignoCancer.getIcon();// captura sua img
            
        }else if((mes.equalsIgnoreCase("Julho") && dia>=23) ||(mes.equalsIgnoreCase("Agosto") && dia<=22)){
            signo.setText("Leao");// preenche o nome do signo
            imagem = (ImageIcon) imgSignoLeao.getIcon();// captura sua img
            
        }else if((mes.equalsIgnoreCase("Agosto") && dia>=23) ||(mes.equalsIgnoreCase("Setembro") && dia<=22)){
            signo.setText("Virgem");// preenche o nome do signo
            imagem = (ImageIcon) imgSignoVirgem.getIcon();// captura sua img
            
        }else if((mes.equalsIgnoreCase("Setembro") && dia>=23) ||(mes.equalsIgnoreCase("Outubro") && dia<=22)){
            signo.setText("Libra");// preenche o nome do signo
            imagem = (ImageIcon) imgSignoLibras.getIcon();// captura sua img
            
        }else if((mes.equalsIgnoreCase("Outubro") && dia>=23) ||(mes.equalsIgnoreCase("Novembro") && dia<=21)){
            signo.setText("Escorpiao");// preenche o nome do signo
            imagem = (ImageIcon) imgSignoEscorpiao.getIcon();// captura sua img 
            
        }else if((mes.equalsIgnoreCase("Novembro") && dia>=22) ||(mes.equalsIgnoreCase("Dezembro") && dia<=21)){
            signo.setText("Sagitario");// preenche o nome do signo
            imagem = (ImageIcon) imgSignoSagitario.getIcon();// captura sua img
            
        }else if((mes.equalsIgnoreCase("Dezembro") && dia>=22) ||(mes.equalsIgnoreCase("Janeiro") && dia<=19)){
            signo.setText("Capricornio");// preenche o nome do signo
            imagem = (ImageIcon) imgSignoCapricornio.getIcon();// captura sua img
            
        }else if((mes.equalsIgnoreCase("Janeiro") && dia>=20) ||(mes.equalsIgnoreCase("Fevereiro") && dia<=18)){
            signo.setText("Aquario");// preenche o nome do signo
            imagem = (ImageIcon) imgSignoAquario.getIcon();// captura sua img 
            
        }else if((mes.equalsIgnoreCase("Fevereiro") && dia>=19) ||(mes.equalsIgnoreCase("Marco") && dia<=20)){
            signo.setText("Peixes");// preenche o nome do signo
            imagem = (ImageIcon) imgSignoPeixes.getIcon();// captura sua img    
        }
        
        Image imgRedimensionada = imagem.getImage().getScaledInstance(250, 310, Image.SCALE_SMOOTH);
        
        // Para preencher o botão azul, substitua btnSigno pelo nome dele:
        btnSigno.setIcon(new ImageIcon(imgRedimensionada));
        
        
        
    }// fim do calcular signo
    
    
public void CalcularCompatibilidade(){
    //capturar os dados da comboBox
    String signo1 =cbSigno1.getSelectedItem().toString();
    String signo2 =cbSigno1.getSelectedItem().toString();
       
       
     
    if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Áries")){
    tfCompatibilidade.setText("100% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Touro")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Gêmeos")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Câncer")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Leão")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Virgem")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Libra")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Escorpião")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Sagitário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Capricórnio")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Aquário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Peixes")){
    tfCompatibilidade.setText("50% compatibilidade!");
    
    if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Áries")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Touro")){
    tfCompatibilidade.setText("100% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Gêmeos")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Câncer")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Leão")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Virgem")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Libra")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Escorpião")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Sagitário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Capricórnio")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Aquário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Peixes")){
    tfCompatibilidade.setText("50% compatibilidade!");
    
    if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Áries")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Touro")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Gêmeos")){
    tfCompatibilidade.setText("100% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Câncer")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Leão")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Virgem")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Libra")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Escorpião")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Sagitário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Capricórnio")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Aquário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Peixes")){
    tfCompatibilidade.setText("50% compatibilidade!");
    
    if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Áries")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Touro")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Gêmeos")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Câncer")){
    tfCompatibilidade.setText("100% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Leão")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Virgem")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Libra")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Escorpião")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Sagitário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Capricórnio")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Aquário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Peixes")){
    tfCompatibilidade.setText("50% compatibilidade!");
            
    if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Áries")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Touro")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Gêmeos")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Câncer")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Leão")){
    tfCompatibilidade.setText("100% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Virgem")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Libra")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Escorpião")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Sagitário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Capricórnio")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Aquário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Peixes")){
    tfCompatibilidade.setText("50% compatibilidade!");
    
    if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Áries")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Touro")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Gêmeos")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Câncer")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Leão")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Virgem")){
    tfCompatibilidade.setText("100% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Libra")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Escorpião")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Sagitário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Capricórnio")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Aquário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Peixes")){
    tfCompatibilidade.setText("50% compatibilidade!");
            
    if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Áries")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Touro")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Gêmeos")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Câncer")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Leão")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Virgem")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Libra")){
    tfCompatibilidade.setText("100% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Escorpião")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Sagitário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Capricórnio")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Aquário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Peixes")){
    tfCompatibilidade.setText("50% compatibilidade!");
    
    if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Áries")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Touro")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Gêmeos")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Câncer")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Leão")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Virgem")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Libra")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Escorpião")){
    tfCompatibilidade.setText("100% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Sagitário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Capricórnio")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Aquário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Peixes")){
    tfCompatibilidade.setText("50% compatibilidade!");
            
    if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Áries")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Touro")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Gêmeos")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Câncer")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Leão")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Virgem")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Libra")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Escorpião")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Sagitário")){
    tfCompatibilidade.setText("100% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Capricórnio")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Aquário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Peixes")){
    tfCompatibilidade.setText("50% compatibilidade!");
            
    if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Áries")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Touro")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Gêmeos")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Câncer")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Leão")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Virgem")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Libra")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Escorpião")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Sagitário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Capricórnio")){
    tfCompatibilidade.setText("100% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Aquário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Peixes")){
    tfCompatibilidade.setText("50% compatibilidade!");
            
    if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Áries")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Touro")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Gêmeos")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Câncer")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Leão")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Virgem")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Libra")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Escorpião")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Sagitário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Capricórnio")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Aquário")){
    tfCompatibilidade.setText("100% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Peixes")){
    tfCompatibilidade.setText("50% compatibilidade!");
    
    if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Áries")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Touro")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Gêmeos")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Câncer")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Leão")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Virgem")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Libra")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Escorpião")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Sagitário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Capricórnio")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Aquário")){
    tfCompatibilidade.setText("50% compatibilidade!");
  }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Peixes")){
    tfCompatibilidade.setText("100% compatibilidade!");
   }
   }        
   }      
   }       
   }
   }        
   }
   }
   }
   }
   }
   }
   } 
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        inicio = new javax.swing.JPanel();
        areaDescobrirSigno = new javax.swing.JPanel();
        tituloDescobrirSigno = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        diaNascimento = new javax.swing.JLabel();
        mesNascimento = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        btDescobrirSigno = new javax.swing.JButton();
        areaCompabilidade = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tituloCompatibilidade = new javax.swing.JLabel();
        signo1 = new javax.swing.JLabel();
        signo2 = new javax.swing.JLabel();
        cbSigno1 = new javax.swing.JComboBox<>();
        cbSigno2 = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        areaResultado = new javax.swing.JPanel();
        signo = new javax.swing.JLabel();
        resultadoCompatibilidade = new javax.swing.JLabel();
        btnSigno = new javax.swing.JButton();
        tfCompatibilidade = new javax.swing.JTextField();
        fundoInicio = new javax.swing.JLabel();
        aries = new javax.swing.JPanel();
        areaInformacoesAries = new javax.swing.JPanel();
        imgSignoAries = new javax.swing.JLabel();
        tituloAries = new javax.swing.JLabel();
        periodoAries = new javax.swing.JLabel();
        elementoAries = new javax.swing.JLabel();
        planetaAries = new javax.swing.JLabel();
        corAries = new javax.swing.JLabel();
        numeroAries = new javax.swing.JLabel();
        tfPeriodoAries = new javax.swing.JTextField();
        tfElementoAries = new javax.swing.JTextField();
        tfPlanetaAries = new javax.swing.JTextField();
        tfCorAries = new javax.swing.JTextField();
        tfNumeroAries = new javax.swing.JTextField();
        areaCaracteristicaAries = new javax.swing.JPanel();
        tituloCaracteristicasAries = new javax.swing.JLabel();
        pFortesAries = new javax.swing.JLabel();
        pMelhorarAries = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txFortesAries = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txMelhorarAries = new javax.swing.JTextArea();
        areaMensagemAries = new javax.swing.JPanel();
        tituloMensagemAries = new javax.swing.JLabel();
        btnCopiarMsgAries = new javax.swing.JButton();
        jScrollPane26 = new javax.swing.JScrollPane();
        txMensagemAries = new javax.swing.JTextArea();
        areaEnergiaAries = new javax.swing.JPanel();
        tituloEnergiaAries = new javax.swing.JLabel();
        amorAries = new javax.swing.JLabel();
        tfAmorAries = new javax.swing.JTextField();
        trabalhoAries = new javax.swing.JLabel();
        tfTrabalhoAries = new javax.swing.JTextField();
        saudeAries = new javax.swing.JLabel();
        tfSaudeAries = new javax.swing.JTextField();
        sorteAries = new javax.swing.JLabel();
        tfSorteAries = new javax.swing.JTextField();
        areaPrevisaoAries = new javax.swing.JPanel();
        previsaoAries = new javax.swing.JLabel();
        btnAtualizarPrevisaoAries = new javax.swing.JButton();
        prev = new javax.swing.JScrollPane();
        txtPrevisaoAries = new javax.swing.JTextArea();
        fundoAries = new javax.swing.JLabel();
        touro = new javax.swing.JPanel();
        areaInformacoesTouro = new javax.swing.JPanel();
        imgSignoTouro = new javax.swing.JLabel();
        tituloTouro = new javax.swing.JLabel();
        periodoTouro = new javax.swing.JLabel();
        elementoTouro = new javax.swing.JLabel();
        planetaTouro = new javax.swing.JLabel();
        corTouro = new javax.swing.JLabel();
        numeroTouro = new javax.swing.JLabel();
        tfPeriodoTouro = new javax.swing.JTextField();
        tfElementoTouro = new javax.swing.JTextField();
        tfPlanetaTouro = new javax.swing.JTextField();
        tfCorTouro = new javax.swing.JTextField();
        tfNumeroTouro = new javax.swing.JTextField();
        areaCaracteristicaTouro = new javax.swing.JPanel();
        tituloCaracteristicasTouro = new javax.swing.JLabel();
        pFortesTouro = new javax.swing.JLabel();
        pMelhorarTouro = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txFortesTouro = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txMelhorarTouro = new javax.swing.JTextArea();
        areaPrevisaoTouro = new javax.swing.JPanel();
        previsaoTouro = new javax.swing.JLabel();
        btnAtualizarPrevisaoTouro = new javax.swing.JButton();
        prev1 = new javax.swing.JScrollPane();
        txtPrevisaoTouro = new javax.swing.JTextArea();
        areaEnergiaTouro = new javax.swing.JPanel();
        tituloEnergiaTouro = new javax.swing.JLabel();
        amorTouro = new javax.swing.JLabel();
        tfAmorTouro = new javax.swing.JTextField();
        trabalhoTouro = new javax.swing.JLabel();
        tfTrabalhoTouro = new javax.swing.JTextField();
        saudeTouro = new javax.swing.JLabel();
        tfSaudeTouro = new javax.swing.JTextField();
        sorteTouro = new javax.swing.JLabel();
        tfSorteTouro = new javax.swing.JTextField();
        areaMensagemTouro = new javax.swing.JPanel();
        tituloMensagemTouro = new javax.swing.JLabel();
        btnCopiarMsgTouro = new javax.swing.JButton();
        jScrollPane27 = new javax.swing.JScrollPane();
        txMensagemTouro = new javax.swing.JTextArea();
        fundoTouro = new javax.swing.JLabel();
        gemeos = new javax.swing.JPanel();
        areaInformacoesGemeos = new javax.swing.JPanel();
        imgSignoGemeos = new javax.swing.JLabel();
        tituloGemeos = new javax.swing.JLabel();
        periodoGemeos = new javax.swing.JLabel();
        elementoGemeos = new javax.swing.JLabel();
        planetaGemeos = new javax.swing.JLabel();
        corGemeos = new javax.swing.JLabel();
        numeroGemeos = new javax.swing.JLabel();
        tfPeriodoGemeos = new javax.swing.JTextField();
        tfElementoGemeos = new javax.swing.JTextField();
        tfPlanetaGemeos = new javax.swing.JTextField();
        tfCorGemeos = new javax.swing.JTextField();
        tfNumeroGemeos = new javax.swing.JTextField();
        areaCaracteristicaGemeos = new javax.swing.JPanel();
        tituloCaracteristicasGemeos = new javax.swing.JLabel();
        pFortesGemeos = new javax.swing.JLabel();
        pMelhorarGemeos = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txFortesGemeos = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txMelhorarGemeos = new javax.swing.JTextArea();
        areaPrevisaoGemeos = new javax.swing.JPanel();
        previsaoGemeos = new javax.swing.JLabel();
        btnAtualizarPrevisaoGemeos = new javax.swing.JButton();
        prev2 = new javax.swing.JScrollPane();
        txtPrevisaoGemeos = new javax.swing.JTextArea();
        areaEnergiaGemeos = new javax.swing.JPanel();
        tituloEnergiaGemeos = new javax.swing.JLabel();
        amorGemeos = new javax.swing.JLabel();
        tfAmorGemeos = new javax.swing.JTextField();
        trabalhoGemeos = new javax.swing.JLabel();
        tfTrabalhoGemeos = new javax.swing.JTextField();
        saudeGemeos = new javax.swing.JLabel();
        tfSaudeGemeos = new javax.swing.JTextField();
        sorteGemeos = new javax.swing.JLabel();
        tfSorteGemeos = new javax.swing.JTextField();
        areaMensagemGemeos = new javax.swing.JPanel();
        tituloMensagemGemeos = new javax.swing.JLabel();
        btnCopiarMsgGemeos = new javax.swing.JButton();
        jScrollPane28 = new javax.swing.JScrollPane();
        txMensagemGemeos = new javax.swing.JTextArea();
        fundoGemeos = new javax.swing.JLabel();
        cancer = new javax.swing.JPanel();
        areaInformacoesCancer = new javax.swing.JPanel();
        imgSignoCancer = new javax.swing.JLabel();
        tituloCancer = new javax.swing.JLabel();
        periodoCancer = new javax.swing.JLabel();
        elementoCancer = new javax.swing.JLabel();
        planetaCancer = new javax.swing.JLabel();
        corCancer = new javax.swing.JLabel();
        numeroCancer = new javax.swing.JLabel();
        tfPeriodoCancer = new javax.swing.JTextField();
        tfElementoCancer = new javax.swing.JTextField();
        tfPlanetaCancer = new javax.swing.JTextField();
        tfCorCancer = new javax.swing.JTextField();
        tfNumeroCancer = new javax.swing.JTextField();
        areaCaracteristicaCancer = new javax.swing.JPanel();
        tituloCaracteristicasCancer = new javax.swing.JLabel();
        pFortesCancer = new javax.swing.JLabel();
        pMelhorarCancer = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txFortesCancer = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txMelhorarCancer = new javax.swing.JTextArea();
        areaPrevisaoCancer = new javax.swing.JPanel();
        previsaoCancer = new javax.swing.JLabel();
        btnAtualizarPrevisaoCancer = new javax.swing.JButton();
        prev3 = new javax.swing.JScrollPane();
        txtPrevisaoCancer = new javax.swing.JTextArea();
        areaEnergiaCancer = new javax.swing.JPanel();
        tituloEnergiaCancer = new javax.swing.JLabel();
        amorCancer = new javax.swing.JLabel();
        tfAmorCancer = new javax.swing.JTextField();
        trabalhoCancer = new javax.swing.JLabel();
        tfTrabalhoCancer = new javax.swing.JTextField();
        saudeCancer = new javax.swing.JLabel();
        tfSaudeCancer = new javax.swing.JTextField();
        sorteCancer = new javax.swing.JLabel();
        tfSorteCancer = new javax.swing.JTextField();
        areaMensagemCancer = new javax.swing.JPanel();
        tituloMensagemCancer = new javax.swing.JLabel();
        btnCopiarMsgCancer = new javax.swing.JButton();
        jScrollPane25 = new javax.swing.JScrollPane();
        txMensagemCancer = new javax.swing.JTextArea();
        fundoCancer = new javax.swing.JLabel();
        leao = new javax.swing.JPanel();
        areaInformacoesLeao = new javax.swing.JPanel();
        imgSignoLeao = new javax.swing.JLabel();
        tituloLeao = new javax.swing.JLabel();
        periodoLeao = new javax.swing.JLabel();
        elementoLeao = new javax.swing.JLabel();
        planetaLeao = new javax.swing.JLabel();
        corLeao = new javax.swing.JLabel();
        numeroLeao = new javax.swing.JLabel();
        tfPeriodoCancer1 = new javax.swing.JTextField();
        tfElementoCancer1 = new javax.swing.JTextField();
        tfPlanetaCancer1 = new javax.swing.JTextField();
        tfCorCancer1 = new javax.swing.JTextField();
        tfNumeroCancer1 = new javax.swing.JTextField();
        areaCaracteristicaLeao = new javax.swing.JPanel();
        tituloCaracteristicasLeao = new javax.swing.JLabel();
        pFortesLeao = new javax.swing.JLabel();
        pMelhorarLeao = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txFortesLeao = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txMelhorarLeao = new javax.swing.JTextArea();
        areaPrevisaoLeao = new javax.swing.JPanel();
        previsaoLeao = new javax.swing.JLabel();
        btnAtualizarPrevisaoLeao = new javax.swing.JButton();
        prev4 = new javax.swing.JScrollPane();
        txtPrevisaoLeao = new javax.swing.JTextArea();
        areaEnergiaLeao = new javax.swing.JPanel();
        tituloEnergiaLeao = new javax.swing.JLabel();
        amorLeao = new javax.swing.JLabel();
        tfAmorLeao = new javax.swing.JTextField();
        trabalhoLeao = new javax.swing.JLabel();
        tfTrabalhoLeao = new javax.swing.JTextField();
        saudeLeao = new javax.swing.JLabel();
        tfSaudeLeao = new javax.swing.JTextField();
        sorteLeao = new javax.swing.JLabel();
        tfSorteLeao = new javax.swing.JTextField();
        areaMensagemLeao = new javax.swing.JPanel();
        tituloMensagemLeao = new javax.swing.JLabel();
        btnCopiarMsgLeao = new javax.swing.JButton();
        jScrollPane29 = new javax.swing.JScrollPane();
        txMensagemLeao = new javax.swing.JTextArea();
        fundoLeao = new javax.swing.JLabel();
        virgem = new javax.swing.JPanel();
        areaInformacoesVirgem = new javax.swing.JPanel();
        imgSignoVirgem = new javax.swing.JLabel();
        tituloVirgem = new javax.swing.JLabel();
        periodoVirgem = new javax.swing.JLabel();
        elementoVirgem = new javax.swing.JLabel();
        planetaVirgem = new javax.swing.JLabel();
        corVirgem = new javax.swing.JLabel();
        numeroVirgem = new javax.swing.JLabel();
        tfPeriodoVirgem = new javax.swing.JTextField();
        tfElementoVirgem = new javax.swing.JTextField();
        tfPlanetaVirgem = new javax.swing.JTextField();
        tfCorVirgem = new javax.swing.JTextField();
        tfNumeroVirgem = new javax.swing.JTextField();
        areaCaracteristicaVirgem = new javax.swing.JPanel();
        tituloCaracteristicasVirgem = new javax.swing.JLabel();
        pFortesVirgem = new javax.swing.JLabel();
        pMelhorarVirgem = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txFortesVirgem = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        txMelhorarVirgem = new javax.swing.JTextArea();
        areaPrevisaoVirgem = new javax.swing.JPanel();
        previsaoVirgem = new javax.swing.JLabel();
        btnAtualizarPrevisaoVirgem = new javax.swing.JButton();
        prev5 = new javax.swing.JScrollPane();
        txtPrevisaoVirgem = new javax.swing.JTextArea();
        areaEnergiaVirgem = new javax.swing.JPanel();
        tituloEnergiaVirgem = new javax.swing.JLabel();
        amorVirgem = new javax.swing.JLabel();
        tfAmorVirgem = new javax.swing.JTextField();
        trabalhoVirgem = new javax.swing.JLabel();
        tfTrabalhoVirgem = new javax.swing.JTextField();
        saudeVirgem = new javax.swing.JLabel();
        tfSaudeVirgem = new javax.swing.JTextField();
        sorteVirgem = new javax.swing.JLabel();
        tfSorteVirgem = new javax.swing.JTextField();
        areaMensagemVirgem = new javax.swing.JPanel();
        tituloMensagemVirgem = new javax.swing.JLabel();
        btnCopiarMsgVirgem = new javax.swing.JButton();
        jScrollPane30 = new javax.swing.JScrollPane();
        txMensagemVirgem = new javax.swing.JTextArea();
        fundoVirgem = new javax.swing.JLabel();
        libras = new javax.swing.JPanel();
        areaInformacoesLibras = new javax.swing.JPanel();
        imgSignoLibras = new javax.swing.JLabel();
        tituloLibras = new javax.swing.JLabel();
        periodoLibras = new javax.swing.JLabel();
        elementoLibras = new javax.swing.JLabel();
        planetaLibras = new javax.swing.JLabel();
        corLibras = new javax.swing.JLabel();
        numeroLibras = new javax.swing.JLabel();
        tfPeriodoLibras = new javax.swing.JTextField();
        tfElementoLibras = new javax.swing.JTextField();
        tfPlanetaLibras = new javax.swing.JTextField();
        tfCorLibras = new javax.swing.JTextField();
        tfNumeroLibras = new javax.swing.JTextField();
        areaCaracteristicaLibras = new javax.swing.JPanel();
        tituloCaracteristicasLibras = new javax.swing.JLabel();
        pFortesLibras = new javax.swing.JLabel();
        pMelhorarLibras = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txFortesLibras = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txMelhorarLibras = new javax.swing.JTextArea();
        areaPrevisaoLibras = new javax.swing.JPanel();
        previsaoLibras = new javax.swing.JLabel();
        btnAtualizarPrevisaoLibras = new javax.swing.JButton();
        prev6 = new javax.swing.JScrollPane();
        txtPrevisaoLibras = new javax.swing.JTextArea();
        areaEnergiaLibras = new javax.swing.JPanel();
        tituloEnergiaLibras = new javax.swing.JLabel();
        amorLibras = new javax.swing.JLabel();
        tfAmorLibras = new javax.swing.JTextField();
        trabalhoLibras = new javax.swing.JLabel();
        tfTrabalhoLibras = new javax.swing.JTextField();
        saudeLibras = new javax.swing.JLabel();
        tfSaudeLibras = new javax.swing.JTextField();
        sorteLibras = new javax.swing.JLabel();
        tfSorteLibras = new javax.swing.JTextField();
        areaMensagemLibras = new javax.swing.JPanel();
        tituloMensagemLibras = new javax.swing.JLabel();
        btnCopiarMsgLibras = new javax.swing.JButton();
        jScrollPane31 = new javax.swing.JScrollPane();
        txMensagemLibras = new javax.swing.JTextArea();
        fundoLibras = new javax.swing.JLabel();
        escorpiao = new javax.swing.JPanel();
        areaInformacoesEscorpiao = new javax.swing.JPanel();
        imgSignoEscorpiao = new javax.swing.JLabel();
        tituloEscorpiao = new javax.swing.JLabel();
        periodoEscorpiao = new javax.swing.JLabel();
        elementoEscorpiao = new javax.swing.JLabel();
        planetaEscorpiao = new javax.swing.JLabel();
        corEscorpiao = new javax.swing.JLabel();
        numeroEscorpiao = new javax.swing.JLabel();
        tfPeriodoEscorpiao = new javax.swing.JTextField();
        tfElementoEscorpiao = new javax.swing.JTextField();
        tfPlanetaEscorpiao = new javax.swing.JTextField();
        tfCorEscorpiao = new javax.swing.JTextField();
        tfNumeroEscorpiao = new javax.swing.JTextField();
        areaCaracteristicaEscorpiao = new javax.swing.JPanel();
        tituloCaracteristicasEscorpiao = new javax.swing.JLabel();
        pFortesEscorpiao = new javax.swing.JLabel();
        pMelhorarEscorpiao = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txFortesEscorpiao = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        txMelhorarEscorpiao = new javax.swing.JTextArea();
        areaPrevisaoEscorpiao = new javax.swing.JPanel();
        previsaoEscorpiao = new javax.swing.JLabel();
        btnAtualizarPrevisaoEscorpiao = new javax.swing.JButton();
        prev7 = new javax.swing.JScrollPane();
        txtPrevisaoEscorpiao = new javax.swing.JTextArea();
        areaEnergiaEscorpiao = new javax.swing.JPanel();
        tituloEnergiaEscorpiao = new javax.swing.JLabel();
        amorEscorpiao = new javax.swing.JLabel();
        tfAmorEscorpiao = new javax.swing.JTextField();
        trabalhoEscorpiao = new javax.swing.JLabel();
        tfTrabalhoEscorpiao = new javax.swing.JTextField();
        saudeEscorpiao = new javax.swing.JLabel();
        tfSaudeEscorpiao = new javax.swing.JTextField();
        sorteEscorpiao = new javax.swing.JLabel();
        tfSorteEscorpiao = new javax.swing.JTextField();
        areaMensagemEscorpiao = new javax.swing.JPanel();
        tituloMensagemEscorpiao = new javax.swing.JLabel();
        btnCopiarMsgEscorpiao = new javax.swing.JButton();
        jScrollPane32 = new javax.swing.JScrollPane();
        txMensagemEscorpiao = new javax.swing.JTextArea();
        fundoEscorpiao = new javax.swing.JLabel();
        sagitario = new javax.swing.JPanel();
        areaInformacoesSagitario = new javax.swing.JPanel();
        imgSignoSagitario = new javax.swing.JLabel();
        tituloSagitario = new javax.swing.JLabel();
        periodoSagitario = new javax.swing.JLabel();
        elementoSagitario = new javax.swing.JLabel();
        planetaSagitario = new javax.swing.JLabel();
        corSagitario = new javax.swing.JLabel();
        numeroSagitario = new javax.swing.JLabel();
        tfPeriodoSagitario = new javax.swing.JTextField();
        tfElementoSagitario = new javax.swing.JTextField();
        tfPlanetaSagitario = new javax.swing.JTextField();
        tfCorSagitario = new javax.swing.JTextField();
        tfNumeroSagitario = new javax.swing.JTextField();
        areaCaracteristicaSagitario = new javax.swing.JPanel();
        tituloCaracteristicasSagitario = new javax.swing.JLabel();
        pFortesSagitario = new javax.swing.JLabel();
        pMelhorarSagitario = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        txFortesSagitario = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        txMelhorarSagitario = new javax.swing.JTextArea();
        areaPrevisaoSagitario = new javax.swing.JPanel();
        previsaoSagitario = new javax.swing.JLabel();
        btnAtualizarPrevisaoSagitario = new javax.swing.JButton();
        prev8 = new javax.swing.JScrollPane();
        txtPrevisaoSagitario = new javax.swing.JTextArea();
        areaEnergiaSagitario = new javax.swing.JPanel();
        tituloEnergiaSagitario = new javax.swing.JLabel();
        amorSagitario = new javax.swing.JLabel();
        tfAmorSagitario = new javax.swing.JTextField();
        trabalhoSagitario = new javax.swing.JLabel();
        tfTrabalhoSagitario = new javax.swing.JTextField();
        saudeSagitario = new javax.swing.JLabel();
        tfSaudeSagitario = new javax.swing.JTextField();
        sorteSagitario = new javax.swing.JLabel();
        tfSorteSagitario = new javax.swing.JTextField();
        areaMensagemSagitario = new javax.swing.JPanel();
        tituloMensagemSagitario = new javax.swing.JLabel();
        btnCopiarMsgSagitario = new javax.swing.JButton();
        jScrollPane33 = new javax.swing.JScrollPane();
        txMensagemSagitario = new javax.swing.JTextArea();
        fundoSagitario = new javax.swing.JLabel();
        capricornio = new javax.swing.JPanel();
        areaInformacoesCapricornio = new javax.swing.JPanel();
        imgSignoCapricornio = new javax.swing.JLabel();
        tituloCapriconio = new javax.swing.JLabel();
        periodoCapricornio = new javax.swing.JLabel();
        elementoCapricornio = new javax.swing.JLabel();
        planetaCapricornio = new javax.swing.JLabel();
        corCapricornio = new javax.swing.JLabel();
        numeroCapricornio = new javax.swing.JLabel();
        tfPeriodoCapricornio = new javax.swing.JTextField();
        tfElementoCapricornio = new javax.swing.JTextField();
        tfPlanetaCapricornio = new javax.swing.JTextField();
        tfCorCapricornio = new javax.swing.JTextField();
        tfNumeroCapricornio = new javax.swing.JTextField();
        areaCaracteristicaCapricornio = new javax.swing.JPanel();
        tituloCaracteristicasCapricornio = new javax.swing.JLabel();
        pFortesCapricornio = new javax.swing.JLabel();
        pMelhorarCapricornio = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txFortesCapricornio = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        txMelhorarCapricornio = new javax.swing.JTextArea();
        areaPrevisaoCapricornio = new javax.swing.JPanel();
        previsaoCapricornio = new javax.swing.JLabel();
        btnAtualizarPrevisaoCapricornio = new javax.swing.JButton();
        prev9 = new javax.swing.JScrollPane();
        txtPrevisaoCapricornio = new javax.swing.JTextArea();
        areaEnergiaCapricornio = new javax.swing.JPanel();
        tituloEnergiaCapricornio = new javax.swing.JLabel();
        amorCapricornio = new javax.swing.JLabel();
        tfAmorCapricornio = new javax.swing.JTextField();
        trabalhoCapricornio = new javax.swing.JLabel();
        tfTrabalhoCapricornio = new javax.swing.JTextField();
        saudeCapricornio = new javax.swing.JLabel();
        tfSaudeCapricornio = new javax.swing.JTextField();
        sorteCapricornio = new javax.swing.JLabel();
        tfSorteCapricornio = new javax.swing.JTextField();
        areaMensagemCapricornio = new javax.swing.JPanel();
        tituloMensagemCapricornio = new javax.swing.JLabel();
        btnCopiarMsgCapricornio = new javax.swing.JButton();
        jScrollPane34 = new javax.swing.JScrollPane();
        txMensagemCapricornio = new javax.swing.JTextArea();
        fundoCapricornio = new javax.swing.JLabel();
        aquario = new javax.swing.JPanel();
        areaInformacoesAquario = new javax.swing.JPanel();
        imgSignoAquario = new javax.swing.JLabel();
        tituloAquario = new javax.swing.JLabel();
        periodoAquario = new javax.swing.JLabel();
        elementoAquario = new javax.swing.JLabel();
        planetaAquario = new javax.swing.JLabel();
        corAquario = new javax.swing.JLabel();
        numeroAquario = new javax.swing.JLabel();
        tfPeriodoAquario = new javax.swing.JTextField();
        tfElementoAquario = new javax.swing.JTextField();
        tfPlanetaAquario = new javax.swing.JTextField();
        tfCorAquario = new javax.swing.JTextField();
        tfNumeroAquario = new javax.swing.JTextField();
        areaCaracteristicaAquario = new javax.swing.JPanel();
        tituloCaracteristicasAquario = new javax.swing.JLabel();
        pFortesAquario = new javax.swing.JLabel();
        pMelhorarAquario = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        txFortesAquario = new javax.swing.JTextArea();
        jScrollPane22 = new javax.swing.JScrollPane();
        txMelhorarAquario = new javax.swing.JTextArea();
        areaPrevisaoAquario = new javax.swing.JPanel();
        previsaoAquario = new javax.swing.JLabel();
        btnAtualizarPrevisaoAquario = new javax.swing.JButton();
        prev10 = new javax.swing.JScrollPane();
        txtPrevisaoAquario = new javax.swing.JTextArea();
        areaEnergiaAquario = new javax.swing.JPanel();
        tituloEnergiaAquario = new javax.swing.JLabel();
        amorAquario = new javax.swing.JLabel();
        tfAmorAquario = new javax.swing.JTextField();
        trabalhoAquario = new javax.swing.JLabel();
        tfTrabalhoAquario = new javax.swing.JTextField();
        saudeAquario = new javax.swing.JLabel();
        tfSaudeAquario = new javax.swing.JTextField();
        sorteAquario = new javax.swing.JLabel();
        tfSorteAquario = new javax.swing.JTextField();
        areaMensagemAquario = new javax.swing.JPanel();
        tituloMensagemAquario = new javax.swing.JLabel();
        btnCopiarMsgAquario = new javax.swing.JButton();
        jScrollPane35 = new javax.swing.JScrollPane();
        txMensagemAquario = new javax.swing.JTextArea();
        fundoAquario = new javax.swing.JLabel();
        peixes = new javax.swing.JPanel();
        areaInformacoesPeixes = new javax.swing.JPanel();
        imgSignoPeixes = new javax.swing.JLabel();
        tituloPeixes = new javax.swing.JLabel();
        periodoPeixes = new javax.swing.JLabel();
        elementoPeixes = new javax.swing.JLabel();
        planetaPeixes = new javax.swing.JLabel();
        corPeixes = new javax.swing.JLabel();
        numeroPeixes = new javax.swing.JLabel();
        tfPeriodoPeixes = new javax.swing.JTextField();
        tfElementoPeixes = new javax.swing.JTextField();
        tfPlanetaPeixes = new javax.swing.JTextField();
        tfCorPeixes = new javax.swing.JTextField();
        tfNumeroPeixes = new javax.swing.JTextField();
        areaCaracteristicaPeixes = new javax.swing.JPanel();
        tituloCaracteristicasPeixes = new javax.swing.JLabel();
        pFortesPeixes = new javax.swing.JLabel();
        pMelhorarPeixes = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txFortesPeixes = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        txMelhorarPeixes = new javax.swing.JTextArea();
        areaPrevisaoPeixes = new javax.swing.JPanel();
        previsaoPeixes = new javax.swing.JLabel();
        btnAtualizarPrevisaoPeixes = new javax.swing.JButton();
        prev11 = new javax.swing.JScrollPane();
        txtPrevisaoPeixes = new javax.swing.JTextArea();
        areaEnergiaPeixes = new javax.swing.JPanel();
        tituloEnergiaPeixes = new javax.swing.JLabel();
        amorPeixes = new javax.swing.JLabel();
        tfAmorPeixes = new javax.swing.JTextField();
        trabalhoPeixes = new javax.swing.JLabel();
        tfTrabalhoPeixes = new javax.swing.JTextField();
        saudePeixes = new javax.swing.JLabel();
        tfSaudePeixes = new javax.swing.JTextField();
        sortePeixes = new javax.swing.JLabel();
        tfSortePeixes = new javax.swing.JTextField();
        areaMensagemPeixes = new javax.swing.JPanel();
        tituloMensagemPeixes = new javax.swing.JLabel();
        btnCopiarMsgPeixes = new javax.swing.JButton();
        jScrollPane36 = new javax.swing.JScrollPane();
        txMensagemPeixes = new javax.swing.JTextArea();
        fundoPeixes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jTabbedPane1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jTabbedPane1.setInheritsPopupMenu(true);

        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaDescobrirSigno.setBackground(new java.awt.Color(6, 61, 80));

        tituloDescobrirSigno.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloDescobrirSigno.setForeground(new java.awt.Color(255, 255, 255));
        tituloDescobrirSigno.setText("Descubra Seu Signo");

        nome.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setText("Nome:");

        diaNascimento.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        diaNascimento.setForeground(new java.awt.Color(255, 255, 255));
        diaNascimento.setText("Dia de Nascimento:");

        mesNascimento.setBackground(new java.awt.Color(255, 255, 255));
        mesNascimento.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        mesNascimento.setForeground(new java.awt.Color(255, 255, 255));
        mesNascimento.setText("Mês de Nascimento:");

        tfNome.setBackground(new java.awt.Color(236, 234, 225));
        tfNome.setFont(new java.awt.Font("Candara", 0, 15)); // NOI18N

        cbDia.setFont(new java.awt.Font("Microsoft Uighur", 1, 18)); // NOI18N
        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbMes.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        btDescobrirSigno.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btDescobrirSigno.setText("Descobrir Signo");
        btDescobrirSigno.addActionListener(this::btDescobrirSignoActionPerformed);

        javax.swing.GroupLayout areaDescobrirSignoLayout = new javax.swing.GroupLayout(areaDescobrirSigno);
        areaDescobrirSigno.setLayout(areaDescobrirSignoLayout);
        areaDescobrirSignoLayout.setHorizontalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(nome)
                                .addGap(42, 42, 42)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diaNascimento)
                                    .addComponent(mesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                        .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btDescobrirSigno))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(tituloDescobrirSigno)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        areaDescobrirSignoLayout.setVerticalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(tituloDescobrirSigno)
                .addGap(41, 41, 41)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesNascimento)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btDescobrirSigno)
                .addGap(30, 30, 30))
        );

        inicio.add(areaDescobrirSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 420, 350));

        areaCompabilidade.setBackground(new java.awt.Color(6, 61, 80));

        jLabel1.setText("jLabel1");

        tituloCompatibilidade.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloCompatibilidade.setForeground(new java.awt.Color(255, 255, 255));
        tituloCompatibilidade.setText("Compatibilidade");

        signo1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        signo1.setForeground(new java.awt.Color(255, 255, 255));
        signo1.setText("Primeiro Signo:");

        signo2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        signo2.setForeground(new java.awt.Color(255, 255, 255));
        signo2.setText("Segundo Signo:");

        cbSigno1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbSigno2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCalcular.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);

        javax.swing.GroupLayout areaCompabilidadeLayout = new javax.swing.GroupLayout(areaCompabilidade);
        areaCompabilidade.setLayout(areaCompabilidadeLayout);
        areaCompabilidadeLayout.setHorizontalGroup(
            areaCompabilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompabilidadeLayout.createSequentialGroup()
                .addGroup(areaCompabilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCompabilidadeLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(areaCompabilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(areaCompabilidadeLayout.createSequentialGroup()
                                .addGroup(areaCompabilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(signo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(signo1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(areaCompabilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbSigno1, 0, 98, Short.MAX_VALUE)
                                    .addComponent(cbSigno2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(areaCompabilidadeLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(tituloCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        areaCompabilidadeLayout.setVerticalGroup(
            areaCompabilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompabilidadeLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloCompatibilidade)
                .addGap(44, 44, 44)
                .addGroup(areaCompabilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(areaCompabilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo2)
                    .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(23, 23, 23))
        );

        inicio.add(areaCompabilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 420, 290));

        signo.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        signo.setText("Signo");

        resultadoCompatibilidade.setFont(new java.awt.Font("Segoe Script", 1, 21)); // NOI18N
        resultadoCompatibilidade.setText("Resultado Compatibilidade");

        btnSigno.setBackground(new java.awt.Color(6, 61, 80));
        btnSigno.setForeground(new java.awt.Color(101, 114, 153));

        tfCompatibilidade.setBackground(new java.awt.Color(6, 61, 80));

        javax.swing.GroupLayout areaResultadoLayout = new javax.swing.GroupLayout(areaResultado);
        areaResultado.setLayout(areaResultadoLayout);
        areaResultadoLayout.setHorizontalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resultadoCompatibilidade)
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(signo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        areaResultadoLayout.setVerticalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(signo)
                .addGap(4, 4, 4)
                .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(resultadoCompatibilidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        inicio.add(areaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 320, 670));

        fundoInicio.setBackground(new java.awt.Color(225, 208, 170));
        fundoInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagem_1890x1100.png")); // NOI18N
        inicio.add(fundoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 1890));

        jTabbedPane1.addTab("Inicio", inicio);

        aries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesAries.setBackground(new java.awt.Color(6, 61, 80));

        imgSignoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\aries-.png")); // NOI18N

        tituloAries.setFont(new java.awt.Font("Lucida Handwriting", 1, 28)); // NOI18N
        tituloAries.setForeground(new java.awt.Color(255, 255, 255));
        tituloAries.setText("Áries");

        periodoAries.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        periodoAries.setForeground(new java.awt.Color(255, 255, 255));
        periodoAries.setText("Periodo:");

        elementoAries.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        elementoAries.setForeground(new java.awt.Color(255, 255, 255));
        elementoAries.setText("Elemento:");

        planetaAries.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        planetaAries.setForeground(new java.awt.Color(255, 255, 255));
        planetaAries.setText("Planeta Regente:");

        corAries.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        corAries.setForeground(new java.awt.Color(255, 255, 255));
        corAries.setText("Cor:");

        numeroAries.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        numeroAries.setForeground(new java.awt.Color(255, 255, 255));
        numeroAries.setText("Numero da Sorte:");

        tfPeriodoAries.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tfPeriodoAries.setText("21/03 a 19/04");
        tfPeriodoAries.addActionListener(this::tfPeriodoAriesActionPerformed);

        tfElementoAries.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tfElementoAries.setText("Fogo");
        tfElementoAries.addActionListener(this::tfElementoAriesActionPerformed);

        tfPlanetaAries.setText("Marte");

        tfCorAries.setText("Vermelho");

        tfNumeroAries.setText("9");

        javax.swing.GroupLayout areaInformacoesAriesLayout = new javax.swing.GroupLayout(areaInformacoesAries);
        areaInformacoesAries.setLayout(areaInformacoesAriesLayout);
        areaInformacoesAriesLayout.setHorizontalGroup(
            areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAriesLayout.createSequentialGroup()
                        .addComponent(numeroAries)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                            .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(periodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(elementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                                .addComponent(corAries, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                                .addComponent(planetaAries)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tituloAries, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(imgSignoAries, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        areaInformacoesAriesLayout.setVerticalGroup(
            areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloAries, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoAries))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAries)
                    .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAries)
                    .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAries)
                    .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAries)
                    .addComponent(tfNumeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 119, Short.MAX_VALUE))
        );

        aries.add(areaInformacoesAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 390, 790));

        areaCaracteristicaAries.setBackground(new java.awt.Color(8, 61, 80));

        tituloCaracteristicasAries.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        tituloCaracteristicasAries.setForeground(new java.awt.Color(255, 255, 255));
        tituloCaracteristicasAries.setText("Características");

        pFortesAries.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        pFortesAries.setForeground(new java.awt.Color(255, 255, 255));
        pFortesAries.setText("Pontos Fortes:");

        pMelhorarAries.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        pMelhorarAries.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarAries.setText("Pontos a Melhorar:");

        txFortesAries.setColumns(20);
        txFortesAries.setRows(5);
        txFortesAries.setText("Corajoso, determinado, independente, energético e sincero. \nGosta de desafios e costuma tomar iniciativa para alcançar seus objetivos.");
        jScrollPane1.setViewportView(txFortesAries);

        txMelhorarAries.setColumns(20);
        txMelhorarAries.setRows(5);
        txMelhorarAries.setText("Pode ser impulsivo, impaciente e agir sem pensar nas consequências. \nPrecisa desenvolver mais paciência e controlar a ansiedade.");
        jScrollPane2.setViewportView(txMelhorarAries);

        javax.swing.GroupLayout areaCaracteristicaAriesLayout = new javax.swing.GroupLayout(areaCaracteristicaAries);
        areaCaracteristicaAries.setLayout(areaCaracteristicaAriesLayout);
        areaCaracteristicaAriesLayout.setHorizontalGroup(
            areaCaracteristicaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaAriesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaCaracteristicaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(tituloCaracteristicasAries)
                    .addComponent(pFortesAries)
                    .addComponent(pMelhorarAries))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaCaracteristicaAriesLayout.setVerticalGroup(
            areaCaracteristicaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaAriesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloCaracteristicasAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhorarAries)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        aries.add(areaCaracteristicaAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 480, 440));

        areaMensagemAries.setBackground(new java.awt.Color(6, 61, 80));

        tituloMensagemAries.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloMensagemAries.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemAries.setText("Mensagem do Dia");

        btnCopiarMsgAries.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnCopiarMsgAries.setText("Copiar Mensagem");

        txMensagemAries.setColumns(20);
        txMensagemAries.setRows(5);
        jScrollPane26.setViewportView(txMensagemAries);

        javax.swing.GroupLayout areaMensagemAriesLayout = new javax.swing.GroupLayout(areaMensagemAries);
        areaMensagemAries.setLayout(areaMensagemAriesLayout);
        areaMensagemAriesLayout.setHorizontalGroup(
            areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemAriesLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(btnCopiarMsgAries, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemAries))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemAriesLayout.setVerticalGroup(
            areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloMensagemAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgAries, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        aries.add(areaMensagemAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 390, 330));

        areaEnergiaAries.setBackground(new java.awt.Color(6, 61, 80));

        tituloEnergiaAries.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloEnergiaAries.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaAries.setText("Energia do Dia");

        amorAries.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        amorAries.setForeground(new java.awt.Color(255, 255, 255));
        amorAries.setText("Amor:");

        trabalhoAries.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        trabalhoAries.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoAries.setText("Trabalho:");

        saudeAries.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        saudeAries.setForeground(new java.awt.Color(255, 255, 255));
        saudeAries.setText("Saúde:");

        sorteAries.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        sorteAries.setForeground(new java.awt.Color(255, 255, 255));
        sorteAries.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaAriesLayout = new javax.swing.GroupLayout(areaEnergiaAries);
        areaEnergiaAries.setLayout(areaEnergiaAriesLayout);
        areaEnergiaAriesLayout.setHorizontalGroup(
            areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saudeAries)
                    .addComponent(amorAries)
                    .addComponent(tituloEnergiaAries)
                    .addComponent(tfAmorAries)
                    .addComponent(trabalhoAries)
                    .addComponent(tfTrabalhoAries)
                    .addComponent(tfSaudeAries)
                    .addComponent(sorteAries)
                    .addComponent(tfSorteAries, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        areaEnergiaAriesLayout.setVerticalGroup(
            areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        aries.add(areaEnergiaAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 920, 480, 330));

        areaPrevisaoAries.setBackground(new java.awt.Color(6, 61, 80));

        previsaoAries.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        previsaoAries.setForeground(new java.awt.Color(255, 255, 255));
        previsaoAries.setText("Previsão do Dia");

        btnAtualizarPrevisaoAries.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnAtualizarPrevisaoAries.setText("Atualizar Previsão");
        btnAtualizarPrevisaoAries.addActionListener(this::btnAtualizarPrevisaoAriesActionPerformed);

        txtPrevisaoAries.setColumns(20);
        txtPrevisaoAries.setRows(5);
        prev.setViewportView(txtPrevisaoAries);

        javax.swing.GroupLayout areaPrevisaoAriesLayout = new javax.swing.GroupLayout(areaPrevisaoAries);
        areaPrevisaoAries.setLayout(areaPrevisaoAriesLayout);
        areaPrevisaoAriesLayout.setHorizontalGroup(
            areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                .addGroup(areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAtualizarPrevisaoAries))
                    .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoAries)
                            .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        areaPrevisaoAriesLayout.setVerticalGroup(
            areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(previsaoAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAtualizarPrevisaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        aries.add(areaPrevisaoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 480, 320));

        fundoAries.setBackground(new java.awt.Color(225, 208, 170));
        fundoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagem_1890x1100.png")); // NOI18N
        aries.add(fundoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 1890));

        jTabbedPane1.addTab("Áries", aries);

        touro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesTouro.setBackground(new java.awt.Color(6, 61, 80));

        imgSignoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\touro-.png")); // NOI18N

        tituloTouro.setFont(new java.awt.Font("Pristina", 1, 48)); // NOI18N
        tituloTouro.setForeground(new java.awt.Color(255, 255, 255));
        tituloTouro.setText("Touro");

        periodoTouro.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        periodoTouro.setForeground(new java.awt.Color(255, 255, 255));
        periodoTouro.setText("Periodo:");

        elementoTouro.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        elementoTouro.setForeground(new java.awt.Color(255, 255, 255));
        elementoTouro.setText("Elemento:");

        planetaTouro.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        planetaTouro.setForeground(new java.awt.Color(255, 255, 255));
        planetaTouro.setText("Planeta Regente:");

        corTouro.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        corTouro.setForeground(new java.awt.Color(255, 255, 255));
        corTouro.setText("Cor:");

        numeroTouro.setFont(new java.awt.Font("Poor Richard", 0, 20)); // NOI18N
        numeroTouro.setForeground(new java.awt.Color(255, 255, 255));
        numeroTouro.setText("Numero da Sorte:");

        tfPeriodoTouro.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tfPeriodoTouro.setText("20/04 a 20/05");
        tfPeriodoTouro.addActionListener(this::tfPeriodoTouroActionPerformed);

        tfElementoTouro.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tfElementoTouro.setText("Terra");
        tfElementoTouro.addActionListener(this::tfElementoTouroActionPerformed);

        tfPlanetaTouro.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tfPlanetaTouro.setText("Vênus");

        tfCorTouro.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tfCorTouro.setText("Verde");

        tfNumeroTouro.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        tfNumeroTouro.setText("6");

        javax.swing.GroupLayout areaInformacoesTouroLayout = new javax.swing.GroupLayout(areaInformacoesTouro);
        areaInformacoesTouro.setLayout(areaInformacoesTouroLayout);
        areaInformacoesTouroLayout.setHorizontalGroup(
            areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoTouro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesTouroLayout.createSequentialGroup()
                        .addComponent(numeroTouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                            .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(periodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(elementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfElementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                                .addComponent(corTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                                .addComponent(planetaTouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tituloTouro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaInformacoesTouroLayout.setVerticalGroup(
            areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoTouro))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoTouro)
                    .addComponent(tfElementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaTouro)
                    .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corTouro)
                    .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroTouro)
                    .addComponent(tfNumeroTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 108, Short.MAX_VALUE))
        );

        touro.add(areaInformacoesTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 390, 790));

        areaCaracteristicaTouro.setBackground(new java.awt.Color(8, 61, 80));

        tituloCaracteristicasTouro.setFont(new java.awt.Font("Viner Hand ITC", 1, 30)); // NOI18N
        tituloCaracteristicasTouro.setForeground(new java.awt.Color(255, 255, 255));
        tituloCaracteristicasTouro.setText("Características");

        pFortesTouro.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        pFortesTouro.setForeground(new java.awt.Color(255, 255, 255));
        pFortesTouro.setText("Pontos Fortes:");

        pMelhorarTouro.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        pMelhorarTouro.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarTouro.setText("Pontos a Melhorar:");

        txFortesTouro.setColumns(20);
        txFortesTouro.setFont(new java.awt.Font("Goudy Old Style", 0, 20)); // NOI18N
        txFortesTouro.setRows(5);
        txFortesTouro.setText("Paciente, confiável, determinado, leal e prático.  \nValoriza a estabilidade e costuma persistir até\nalcançar seus objetivos.");
        jScrollPane3.setViewportView(txFortesTouro);

        txMelhorarTouro.setColumns(20);
        txMelhorarTouro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txMelhorarTouro.setRows(5);
        txMelhorarTouro.setText("Pode ser teimoso, resistente a mudanças e possessivo.\nPrecisa aprender a ser mais flexível e aberto a novas ideias.");
        jScrollPane4.setViewportView(txMelhorarTouro);

        javax.swing.GroupLayout areaCaracteristicaTouroLayout = new javax.swing.GroupLayout(areaCaracteristicaTouro);
        areaCaracteristicaTouro.setLayout(areaCaracteristicaTouroLayout);
        areaCaracteristicaTouroLayout.setHorizontalGroup(
            areaCaracteristicaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaTouroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaCaracteristicaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(tituloCaracteristicasTouro)
                    .addComponent(pFortesTouro)
                    .addComponent(pMelhorarTouro))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaCaracteristicaTouroLayout.setVerticalGroup(
            areaCaracteristicaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaTouroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloCaracteristicasTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhorarTouro)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        touro.add(areaCaracteristicaTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 480, 440));

        areaPrevisaoTouro.setBackground(new java.awt.Color(6, 61, 80));

        previsaoTouro.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        previsaoTouro.setForeground(new java.awt.Color(255, 255, 255));
        previsaoTouro.setText("Previsão do Dia");

        btnAtualizarPrevisaoTouro.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnAtualizarPrevisaoTouro.setText("Atualizar Previsão");
        btnAtualizarPrevisaoTouro.addActionListener(this::btnAtualizarPrevisaoTouroActionPerformed);

        txtPrevisaoTouro.setColumns(20);
        txtPrevisaoTouro.setRows(5);
        prev1.setViewportView(txtPrevisaoTouro);

        javax.swing.GroupLayout areaPrevisaoTouroLayout = new javax.swing.GroupLayout(areaPrevisaoTouro);
        areaPrevisaoTouro.setLayout(areaPrevisaoTouroLayout);
        areaPrevisaoTouroLayout.setHorizontalGroup(
            areaPrevisaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                .addGroup(areaPrevisaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAtualizarPrevisaoTouro))
                    .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoTouro)
                            .addComponent(prev1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        areaPrevisaoTouroLayout.setVerticalGroup(
            areaPrevisaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(previsaoTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prev1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAtualizarPrevisaoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        touro.add(areaPrevisaoTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 480, 320));

        areaEnergiaTouro.setBackground(new java.awt.Color(6, 61, 80));

        tituloEnergiaTouro.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloEnergiaTouro.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaTouro.setText("Energia do Dia");

        amorTouro.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        amorTouro.setForeground(new java.awt.Color(255, 255, 255));
        amorTouro.setText("Amor:");

        trabalhoTouro.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        trabalhoTouro.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoTouro.setText("Trabalho:");

        saudeTouro.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        saudeTouro.setForeground(new java.awt.Color(255, 255, 255));
        saudeTouro.setText("Saúde:");

        sorteTouro.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        sorteTouro.setForeground(new java.awt.Color(255, 255, 255));
        sorteTouro.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaTouroLayout = new javax.swing.GroupLayout(areaEnergiaTouro);
        areaEnergiaTouro.setLayout(areaEnergiaTouroLayout);
        areaEnergiaTouroLayout.setHorizontalGroup(
            areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saudeTouro)
                    .addComponent(amorTouro)
                    .addComponent(tituloEnergiaTouro)
                    .addComponent(tfAmorTouro)
                    .addComponent(trabalhoTouro)
                    .addComponent(tfTrabalhoTouro)
                    .addComponent(tfSaudeTouro)
                    .addComponent(sorteTouro)
                    .addComponent(tfSorteTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        areaEnergiaTouroLayout.setVerticalGroup(
            areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        touro.add(areaEnergiaTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 920, 480, 330));

        areaMensagemTouro.setBackground(new java.awt.Color(6, 61, 80));

        tituloMensagemTouro.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloMensagemTouro.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemTouro.setText("Mensagem do Dia");

        btnCopiarMsgTouro.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnCopiarMsgTouro.setText("Copiar Mensagem");

        txMensagemTouro.setColumns(20);
        txMensagemTouro.setRows(5);
        jScrollPane27.setViewportView(txMensagemTouro);

        javax.swing.GroupLayout areaMensagemTouroLayout = new javax.swing.GroupLayout(areaMensagemTouro);
        areaMensagemTouro.setLayout(areaMensagemTouroLayout);
        areaMensagemTouroLayout.setHorizontalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemTouroLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(btnCopiarMsgTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemTouro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemTouroLayout.setVerticalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloMensagemTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        touro.add(areaMensagemTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 390, 330));

        fundoTouro.setBackground(new java.awt.Color(225, 208, 170));
        fundoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagem_1890x1100.png")); // NOI18N
        touro.add(fundoTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 1890));

        jTabbedPane1.addTab("Touro", touro);

        gemeos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesGemeos.setBackground(new java.awt.Color(6, 61, 80));

        imgSignoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\gemeos-.png")); // NOI18N

        tituloGemeos.setFont(new java.awt.Font("Pristina", 1, 48)); // NOI18N
        tituloGemeos.setForeground(new java.awt.Color(255, 255, 255));
        tituloGemeos.setText("Gêmeos");

        periodoGemeos.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        periodoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        periodoGemeos.setText("Periodo:");

        elementoGemeos.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        elementoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        elementoGemeos.setText("Elemento:");

        planetaGemeos.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        planetaGemeos.setForeground(new java.awt.Color(255, 255, 255));
        planetaGemeos.setText("Planeta Regente:");

        corGemeos.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        corGemeos.setForeground(new java.awt.Color(255, 255, 255));
        corGemeos.setText("Cor:");

        numeroGemeos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        numeroGemeos.setForeground(new java.awt.Color(255, 255, 255));
        numeroGemeos.setText("Numero da Sorte:");

        tfPeriodoGemeos.setText("21/05 a 20/06");
        tfPeriodoGemeos.addActionListener(this::tfPeriodoGemeosActionPerformed);

        tfElementoGemeos.setText("Ar");
        tfElementoGemeos.addActionListener(this::tfElementoGemeosActionPerformed);

        tfPlanetaGemeos.setText("Mercúrio");

        tfCorGemeos.setText("Amarelo");

        tfNumeroGemeos.setText("5");

        javax.swing.GroupLayout areaInformacoesGemeosLayout = new javax.swing.GroupLayout(areaInformacoesGemeos);
        areaInformacoesGemeos.setLayout(areaInformacoesGemeosLayout);
        areaInformacoesGemeosLayout.setHorizontalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoGemeos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesGemeosLayout.createSequentialGroup()
                        .addComponent(numeroGemeos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                            .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(periodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(elementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfElementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                .addComponent(corGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                .addComponent(planetaGemeos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tituloGemeos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaInformacoesGemeosLayout.setVerticalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoGemeos))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoGemeos)
                    .addComponent(tfElementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaGemeos)
                    .addComponent(tfPlanetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corGemeos)
                    .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroGemeos)
                    .addComponent(tfNumeroGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 123, Short.MAX_VALUE))
        );

        gemeos.add(areaInformacoesGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 390, 790));

        areaCaracteristicaGemeos.setBackground(new java.awt.Color(8, 61, 80));

        tituloCaracteristicasGemeos.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        tituloCaracteristicasGemeos.setForeground(new java.awt.Color(255, 255, 255));
        tituloCaracteristicasGemeos.setText("Características");

        pFortesGemeos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        pFortesGemeos.setForeground(new java.awt.Color(255, 255, 255));
        pFortesGemeos.setText("Pontos Fortes:");

        pMelhorarGemeos.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        pMelhorarGemeos.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarGemeos.setText("Pontos a Melhorar:");

        txFortesGemeos.setColumns(20);
        txFortesGemeos.setRows(5);
        txFortesGemeos.setText("Comunicativo, curioso, inteligente, versátil e criativo. \nAprende com facilidade, gosta de trocar ideias e se adapta bem a \ndiferentes situações.");
        jScrollPane5.setViewportView(txFortesGemeos);

        txMelhorarGemeos.setColumns(20);
        txMelhorarGemeos.setRows(5);
        txMelhorarGemeos.setText("Inquietação, indecisão, dispersão, impaciência e dificuldade em \nmanter o foco. \nPode mudar de opinião com facilidade, começar várias coisas ao mesmo\ntempo e ter dificuldade em concluir o que iniciou.");
        jScrollPane6.setViewportView(txMelhorarGemeos);

        javax.swing.GroupLayout areaCaracteristicaGemeosLayout = new javax.swing.GroupLayout(areaCaracteristicaGemeos);
        areaCaracteristicaGemeos.setLayout(areaCaracteristicaGemeosLayout);
        areaCaracteristicaGemeosLayout.setHorizontalGroup(
            areaCaracteristicaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaGemeosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaCaracteristicaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addComponent(tituloCaracteristicasGemeos)
                    .addComponent(pFortesGemeos)
                    .addComponent(pMelhorarGemeos))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaCaracteristicaGemeosLayout.setVerticalGroup(
            areaCaracteristicaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaGemeosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloCaracteristicasGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhorarGemeos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        gemeos.add(areaCaracteristicaGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 480, 440));

        areaPrevisaoGemeos.setBackground(new java.awt.Color(6, 61, 80));

        previsaoGemeos.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        previsaoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        previsaoGemeos.setText("Previsão do Dia");

        btnAtualizarPrevisaoGemeos.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnAtualizarPrevisaoGemeos.setText("Atualizar Previsão");
        btnAtualizarPrevisaoGemeos.addActionListener(this::btnAtualizarPrevisaoGemeosActionPerformed);

        txtPrevisaoGemeos.setColumns(20);
        txtPrevisaoGemeos.setRows(5);
        prev2.setViewportView(txtPrevisaoGemeos);

        javax.swing.GroupLayout areaPrevisaoGemeosLayout = new javax.swing.GroupLayout(areaPrevisaoGemeos);
        areaPrevisaoGemeos.setLayout(areaPrevisaoGemeosLayout);
        areaPrevisaoGemeosLayout.setHorizontalGroup(
            areaPrevisaoGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                .addGroup(areaPrevisaoGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAtualizarPrevisaoGemeos))
                    .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisaoGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoGemeos)
                            .addComponent(prev2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        areaPrevisaoGemeosLayout.setVerticalGroup(
            areaPrevisaoGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(previsaoGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prev2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAtualizarPrevisaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        gemeos.add(areaPrevisaoGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 480, 320));

        areaEnergiaGemeos.setBackground(new java.awt.Color(6, 61, 80));

        tituloEnergiaGemeos.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloEnergiaGemeos.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaGemeos.setText("Energia do Dia");

        amorGemeos.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        amorGemeos.setForeground(new java.awt.Color(255, 255, 255));
        amorGemeos.setText("Amor:");

        trabalhoGemeos.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        trabalhoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoGemeos.setText("Trabalho:");

        saudeGemeos.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        saudeGemeos.setForeground(new java.awt.Color(255, 255, 255));
        saudeGemeos.setText("Saúde:");

        sorteGemeos.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        sorteGemeos.setForeground(new java.awt.Color(255, 255, 255));
        sorteGemeos.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaGemeosLayout = new javax.swing.GroupLayout(areaEnergiaGemeos);
        areaEnergiaGemeos.setLayout(areaEnergiaGemeosLayout);
        areaEnergiaGemeosLayout.setHorizontalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saudeGemeos)
                    .addComponent(amorGemeos)
                    .addComponent(tituloEnergiaGemeos)
                    .addComponent(tfAmorGemeos)
                    .addComponent(trabalhoGemeos)
                    .addComponent(tfTrabalhoGemeos)
                    .addComponent(tfSaudeGemeos)
                    .addComponent(sorteGemeos)
                    .addComponent(tfSorteGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        areaEnergiaGemeosLayout.setVerticalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        gemeos.add(areaEnergiaGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 920, 480, 330));

        areaMensagemGemeos.setBackground(new java.awt.Color(6, 61, 80));

        tituloMensagemGemeos.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloMensagemGemeos.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemGemeos.setText("Mensagem do Dia");

        btnCopiarMsgGemeos.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnCopiarMsgGemeos.setText("Copiar Mensagem");

        txMensagemGemeos.setColumns(20);
        txMensagemGemeos.setRows(5);
        jScrollPane28.setViewportView(txMensagemGemeos);

        javax.swing.GroupLayout areaMensagemGemeosLayout = new javax.swing.GroupLayout(areaMensagemGemeos);
        areaMensagemGemeos.setLayout(areaMensagemGemeosLayout);
        areaMensagemGemeosLayout.setHorizontalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemGemeosLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(btnCopiarMsgGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemGemeos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemGemeosLayout.setVerticalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloMensagemGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        gemeos.add(areaMensagemGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 390, 330));

        fundoGemeos.setBackground(new java.awt.Color(225, 208, 170));
        fundoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagem_1890x1100.png")); // NOI18N
        gemeos.add(fundoGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 1890));

        jTabbedPane1.addTab("Gêmeos", gemeos);

        cancer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesCancer.setBackground(new java.awt.Color(6, 61, 80));

        imgSignoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\cancer-.png")); // NOI18N

        tituloCancer.setFont(new java.awt.Font("Pristina", 1, 48)); // NOI18N
        tituloCancer.setForeground(new java.awt.Color(255, 255, 255));
        tituloCancer.setText("Câncer");

        periodoCancer.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        periodoCancer.setForeground(new java.awt.Color(255, 255, 255));
        periodoCancer.setText("Periodo:");

        elementoCancer.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        elementoCancer.setForeground(new java.awt.Color(255, 255, 255));
        elementoCancer.setText("Elemento:");

        planetaCancer.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        planetaCancer.setForeground(new java.awt.Color(255, 255, 255));
        planetaCancer.setText("Planeta Regente:");

        corCancer.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        corCancer.setForeground(new java.awt.Color(255, 255, 255));
        corCancer.setText("Cor:");

        numeroCancer.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        numeroCancer.setForeground(new java.awt.Color(255, 255, 255));
        numeroCancer.setText("Numero da Sorte:");

        tfPeriodoCancer.setText("21/06 a 22/07");
        tfPeriodoCancer.addActionListener(this::tfPeriodoCancerActionPerformed);

        tfElementoCancer.setText("Água");
        tfElementoCancer.addActionListener(this::tfElementoCancerActionPerformed);

        tfPlanetaCancer.setText("Lua");

        tfCorCancer.setText("Branco");

        tfNumeroCancer.setText("2");

        javax.swing.GroupLayout areaInformacoesCancerLayout = new javax.swing.GroupLayout(areaInformacoesCancer);
        areaInformacoesCancer.setLayout(areaInformacoesCancerLayout);
        areaInformacoesCancerLayout.setHorizontalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoCancer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCancerLayout.createSequentialGroup()
                        .addComponent(numeroCancer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                            .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(periodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(elementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                .addComponent(corCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                .addComponent(planetaCancer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tituloCancer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaInformacoesCancerLayout.setVerticalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoCancer))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoCancer)
                    .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCancer)
                    .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCancer)
                    .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCancer)
                    .addComponent(tfNumeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 123, Short.MAX_VALUE))
        );

        cancer.add(areaInformacoesCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 390, 790));

        areaCaracteristicaCancer.setBackground(new java.awt.Color(8, 61, 80));

        tituloCaracteristicasCancer.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        tituloCaracteristicasCancer.setForeground(new java.awt.Color(255, 255, 255));
        tituloCaracteristicasCancer.setText("Características");

        pFortesCancer.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        pFortesCancer.setForeground(new java.awt.Color(255, 255, 255));
        pFortesCancer.setText("Pontos Fortes:");

        pMelhorarCancer.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        pMelhorarCancer.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarCancer.setText("Pontos a Melhorar:");

        txFortesCancer.setColumns(20);
        txFortesCancer.setRows(5);
        txFortesCancer.setText("Sensível, cuidadoso, protetor, intuitivo, carinhoso, empático, \nleal, dedicado, acolhedor e atencioso.\nValoriza muito a família, os amigos e costuma estar\npresente para ajudar quem ama.");
        jScrollPane7.setViewportView(txFortesCancer);

        txMelhorarCancer.setColumns(20);
        txMelhorarCancer.setRows(5);
        txMelhorarCancer.setText("Sensibilidade excessiva, insegurança, apego ao passado, mudanças de humor, \npreocupação excessiva e dificuldade em desapegar.\nPode guardar mágoas, levar críticas para o lado pessoal e \nter dificuldade em expressar o que sente.");
        jScrollPane8.setViewportView(txMelhorarCancer);

        javax.swing.GroupLayout areaCaracteristicaCancerLayout = new javax.swing.GroupLayout(areaCaracteristicaCancer);
        areaCaracteristicaCancer.setLayout(areaCaracteristicaCancerLayout);
        areaCaracteristicaCancerLayout.setHorizontalGroup(
            areaCaracteristicaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaCancerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaCaracteristicaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane7)
                    .addComponent(tituloCaracteristicasCancer)
                    .addComponent(pFortesCancer)
                    .addComponent(pMelhorarCancer))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaCaracteristicaCancerLayout.setVerticalGroup(
            areaCaracteristicaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaCancerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloCaracteristicasCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhorarCancer)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        cancer.add(areaCaracteristicaCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 480, 440));

        areaPrevisaoCancer.setBackground(new java.awt.Color(6, 61, 80));

        previsaoCancer.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        previsaoCancer.setForeground(new java.awt.Color(255, 255, 255));
        previsaoCancer.setText("Previsão do Dia");

        btnAtualizarPrevisaoCancer.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnAtualizarPrevisaoCancer.setText("Atualizar Previsão");
        btnAtualizarPrevisaoCancer.addActionListener(this::btnAtualizarPrevisaoCancerActionPerformed);

        txtPrevisaoCancer.setColumns(20);
        txtPrevisaoCancer.setRows(5);
        prev3.setViewportView(txtPrevisaoCancer);

        javax.swing.GroupLayout areaPrevisaoCancerLayout = new javax.swing.GroupLayout(areaPrevisaoCancer);
        areaPrevisaoCancer.setLayout(areaPrevisaoCancerLayout);
        areaPrevisaoCancerLayout.setHorizontalGroup(
            areaPrevisaoCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                .addGroup(areaPrevisaoCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAtualizarPrevisaoCancer))
                    .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisaoCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoCancer)
                            .addComponent(prev3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        areaPrevisaoCancerLayout.setVerticalGroup(
            areaPrevisaoCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(previsaoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prev3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAtualizarPrevisaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        cancer.add(areaPrevisaoCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 480, 320));

        areaEnergiaCancer.setBackground(new java.awt.Color(6, 61, 80));

        tituloEnergiaCancer.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloEnergiaCancer.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaCancer.setText("Energia do Dia");

        amorCancer.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        amorCancer.setForeground(new java.awt.Color(255, 255, 255));
        amorCancer.setText("Amor:");

        trabalhoCancer.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        trabalhoCancer.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoCancer.setText("Trabalho:");

        saudeCancer.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        saudeCancer.setForeground(new java.awt.Color(255, 255, 255));
        saudeCancer.setText("Saúde:");

        sorteCancer.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        sorteCancer.setForeground(new java.awt.Color(255, 255, 255));
        sorteCancer.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaCancerLayout = new javax.swing.GroupLayout(areaEnergiaCancer);
        areaEnergiaCancer.setLayout(areaEnergiaCancerLayout);
        areaEnergiaCancerLayout.setHorizontalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saudeCancer)
                    .addComponent(amorCancer)
                    .addComponent(tituloEnergiaCancer)
                    .addComponent(tfAmorCancer)
                    .addComponent(trabalhoCancer)
                    .addComponent(tfTrabalhoCancer)
                    .addComponent(tfSaudeCancer)
                    .addComponent(sorteCancer)
                    .addComponent(tfSorteCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        areaEnergiaCancerLayout.setVerticalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        cancer.add(areaEnergiaCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 920, 480, 330));

        areaMensagemCancer.setBackground(new java.awt.Color(6, 61, 80));

        tituloMensagemCancer.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloMensagemCancer.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemCancer.setText("Mensagem do Dia");

        btnCopiarMsgCancer.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnCopiarMsgCancer.setText("Copiar Mensagem");

        txMensagemCancer.setColumns(20);
        txMensagemCancer.setRows(5);
        jScrollPane25.setViewportView(txMensagemCancer);

        javax.swing.GroupLayout areaMensagemCancerLayout = new javax.swing.GroupLayout(areaMensagemCancer);
        areaMensagemCancer.setLayout(areaMensagemCancerLayout);
        areaMensagemCancerLayout.setHorizontalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemCancerLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(btnCopiarMsgCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemCancer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemCancerLayout.setVerticalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloMensagemCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        cancer.add(areaMensagemCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 390, 330));

        fundoCancer.setBackground(new java.awt.Color(225, 208, 170));
        fundoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagem_1890x1100.png")); // NOI18N
        cancer.add(fundoCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 1890));

        jTabbedPane1.addTab("Câncer", cancer);

        leao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesLeao.setBackground(new java.awt.Color(6, 61, 80));

        imgSignoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\leao-.png")); // NOI18N

        tituloLeao.setFont(new java.awt.Font("Lucida Handwriting", 1, 28)); // NOI18N
        tituloLeao.setForeground(new java.awt.Color(255, 255, 255));
        tituloLeao.setText("Leão");

        periodoLeao.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        periodoLeao.setForeground(new java.awt.Color(255, 255, 255));
        periodoLeao.setText("Periodo:");

        elementoLeao.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        elementoLeao.setForeground(new java.awt.Color(255, 255, 255));
        elementoLeao.setText("Elemento:");

        planetaLeao.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        planetaLeao.setForeground(new java.awt.Color(255, 255, 255));
        planetaLeao.setText("Planeta Regente:");

        corLeao.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        corLeao.setForeground(new java.awt.Color(255, 255, 255));
        corLeao.setText("Cor:");

        numeroLeao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        numeroLeao.setForeground(new java.awt.Color(255, 255, 255));
        numeroLeao.setText("Numero da Sorte:");

        tfPeriodoCancer1.addActionListener(this::tfPeriodoCancer1ActionPerformed);

        tfElementoCancer1.addActionListener(this::tfElementoCancer1ActionPerformed);

        javax.swing.GroupLayout areaInformacoesLeaoLayout = new javax.swing.GroupLayout(areaInformacoesLeao);
        areaInformacoesLeao.setLayout(areaInformacoesLeaoLayout);
        areaInformacoesLeaoLayout.setHorizontalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoLeao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLeaoLayout.createSequentialGroup()
                        .addComponent(numeroLeao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroCancer1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                            .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(periodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(elementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPeriodoCancer1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfElementoCancer1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                .addComponent(corLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCorCancer1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                .addComponent(planetaLeao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaCancer1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tituloLeao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaInformacoesLeaoLayout.setVerticalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoCancer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoLeao))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLeao)
                    .addComponent(tfElementoCancer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLeao)
                    .addComponent(tfPlanetaCancer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLeao)
                    .addComponent(tfCorCancer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLeao)
                    .addComponent(tfNumeroCancer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 123, Short.MAX_VALUE))
        );

        leao.add(areaInformacoesLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 390, 790));

        areaCaracteristicaLeao.setBackground(new java.awt.Color(8, 61, 80));

        tituloCaracteristicasLeao.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        tituloCaracteristicasLeao.setForeground(new java.awt.Color(255, 255, 255));
        tituloCaracteristicasLeao.setText("Características");

        pFortesLeao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        pFortesLeao.setForeground(new java.awt.Color(255, 255, 255));
        pFortesLeao.setText("Pontos Fortes:");

        pMelhorarLeao.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        pMelhorarLeao.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarLeao.setText("Pontos a Melhorar:");

        txFortesLeao.setColumns(20);
        txFortesLeao.setRows(5);
        jScrollPane9.setViewportView(txFortesLeao);

        txMelhorarLeao.setColumns(20);
        txMelhorarLeao.setRows(5);
        jScrollPane10.setViewportView(txMelhorarLeao);

        javax.swing.GroupLayout areaCaracteristicaLeaoLayout = new javax.swing.GroupLayout(areaCaracteristicaLeao);
        areaCaracteristicaLeao.setLayout(areaCaracteristicaLeaoLayout);
        areaCaracteristicaLeaoLayout.setHorizontalGroup(
            areaCaracteristicaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaLeaoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaCaracteristicaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane9)
                    .addComponent(tituloCaracteristicasLeao)
                    .addComponent(pFortesLeao)
                    .addComponent(pMelhorarLeao))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaCaracteristicaLeaoLayout.setVerticalGroup(
            areaCaracteristicaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaLeaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloCaracteristicasLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhorarLeao)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        leao.add(areaCaracteristicaLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 480, 440));

        areaPrevisaoLeao.setBackground(new java.awt.Color(6, 61, 80));

        previsaoLeao.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        previsaoLeao.setForeground(new java.awt.Color(255, 255, 255));
        previsaoLeao.setText("Previsão do Dia");

        btnAtualizarPrevisaoLeao.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnAtualizarPrevisaoLeao.setText("Atualizar Previsão");
        btnAtualizarPrevisaoLeao.addActionListener(this::btnAtualizarPrevisaoLeaoActionPerformed);

        txtPrevisaoLeao.setColumns(20);
        txtPrevisaoLeao.setRows(5);
        prev4.setViewportView(txtPrevisaoLeao);

        javax.swing.GroupLayout areaPrevisaoLeaoLayout = new javax.swing.GroupLayout(areaPrevisaoLeao);
        areaPrevisaoLeao.setLayout(areaPrevisaoLeaoLayout);
        areaPrevisaoLeaoLayout.setHorizontalGroup(
            areaPrevisaoLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                .addGroup(areaPrevisaoLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAtualizarPrevisaoLeao))
                    .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisaoLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoLeao)
                            .addComponent(prev4, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        areaPrevisaoLeaoLayout.setVerticalGroup(
            areaPrevisaoLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(previsaoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prev4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAtualizarPrevisaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        leao.add(areaPrevisaoLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 480, 320));

        areaEnergiaLeao.setBackground(new java.awt.Color(6, 61, 80));

        tituloEnergiaLeao.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloEnergiaLeao.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaLeao.setText("Energia do Dia");

        amorLeao.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        amorLeao.setForeground(new java.awt.Color(255, 255, 255));
        amorLeao.setText("Amor:");

        trabalhoLeao.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        trabalhoLeao.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoLeao.setText("Trabalho:");

        saudeLeao.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        saudeLeao.setForeground(new java.awt.Color(255, 255, 255));
        saudeLeao.setText("Saúde:");

        sorteLeao.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        sorteLeao.setForeground(new java.awt.Color(255, 255, 255));
        sorteLeao.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaLeaoLayout = new javax.swing.GroupLayout(areaEnergiaLeao);
        areaEnergiaLeao.setLayout(areaEnergiaLeaoLayout);
        areaEnergiaLeaoLayout.setHorizontalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saudeLeao)
                    .addComponent(amorLeao)
                    .addComponent(tituloEnergiaLeao)
                    .addComponent(tfAmorLeao)
                    .addComponent(trabalhoLeao)
                    .addComponent(tfTrabalhoLeao)
                    .addComponent(tfSaudeLeao)
                    .addComponent(sorteLeao)
                    .addComponent(tfSorteLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        areaEnergiaLeaoLayout.setVerticalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        leao.add(areaEnergiaLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 920, 480, 330));

        areaMensagemLeao.setBackground(new java.awt.Color(6, 61, 80));

        tituloMensagemLeao.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloMensagemLeao.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemLeao.setText("Mensagem do Dia");

        btnCopiarMsgLeao.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnCopiarMsgLeao.setText("Copiar Mensagem");

        txMensagemLeao.setColumns(20);
        txMensagemLeao.setRows(5);
        jScrollPane29.setViewportView(txMensagemLeao);

        javax.swing.GroupLayout areaMensagemLeaoLayout = new javax.swing.GroupLayout(areaMensagemLeao);
        areaMensagemLeao.setLayout(areaMensagemLeaoLayout);
        areaMensagemLeaoLayout.setHorizontalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemLeaoLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(btnCopiarMsgLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemLeao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemLeaoLayout.setVerticalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloMensagemLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        leao.add(areaMensagemLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 390, 330));

        fundoLeao.setBackground(new java.awt.Color(225, 208, 170));
        fundoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagem_1890x1100.png")); // NOI18N
        leao.add(fundoLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 1890));

        jTabbedPane1.addTab("Leão", leao);

        virgem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesVirgem.setBackground(new java.awt.Color(6, 61, 80));

        imgSignoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\virgem-.png")); // NOI18N

        tituloVirgem.setFont(new java.awt.Font("Lucida Handwriting", 1, 28)); // NOI18N
        tituloVirgem.setForeground(new java.awt.Color(255, 255, 255));
        tituloVirgem.setText("Virgem");

        periodoVirgem.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        periodoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        periodoVirgem.setText("Periodo:");

        elementoVirgem.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        elementoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        elementoVirgem.setText("Elemento:");

        planetaVirgem.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        planetaVirgem.setForeground(new java.awt.Color(255, 255, 255));
        planetaVirgem.setText("Planeta Regente:");

        corVirgem.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        corVirgem.setForeground(new java.awt.Color(255, 255, 255));
        corVirgem.setText("Cor:");

        numeroVirgem.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        numeroVirgem.setForeground(new java.awt.Color(255, 255, 255));
        numeroVirgem.setText("Numero da Sorte:");

        tfPeriodoVirgem.addActionListener(this::tfPeriodoVirgemActionPerformed);

        tfElementoVirgem.addActionListener(this::tfElementoVirgemActionPerformed);

        javax.swing.GroupLayout areaInformacoesVirgemLayout = new javax.swing.GroupLayout(areaInformacoesVirgem);
        areaInformacoesVirgem.setLayout(areaInformacoesVirgemLayout);
        areaInformacoesVirgemLayout.setHorizontalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoVirgem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesVirgemLayout.createSequentialGroup()
                        .addComponent(numeroVirgem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                            .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(periodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(elementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                .addComponent(corVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                .addComponent(planetaVirgem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tituloVirgem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaInformacoesVirgemLayout.setVerticalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoVirgem))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoVirgem)
                    .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaVirgem)
                    .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corVirgem)
                    .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroVirgem)
                    .addComponent(tfNumeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 123, Short.MAX_VALUE))
        );

        virgem.add(areaInformacoesVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 390, 790));

        areaCaracteristicaVirgem.setBackground(new java.awt.Color(8, 61, 80));

        tituloCaracteristicasVirgem.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        tituloCaracteristicasVirgem.setForeground(new java.awt.Color(255, 255, 255));
        tituloCaracteristicasVirgem.setText("Características");

        pFortesVirgem.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        pFortesVirgem.setForeground(new java.awt.Color(255, 255, 255));
        pFortesVirgem.setText("Pontos Fortes:");

        pMelhorarVirgem.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        pMelhorarVirgem.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarVirgem.setText("Pontos a Melhorar:");

        txFortesVirgem.setColumns(20);
        txFortesVirgem.setRows(5);
        jScrollPane11.setViewportView(txFortesVirgem);

        txMelhorarVirgem.setColumns(20);
        txMelhorarVirgem.setRows(5);
        jScrollPane12.setViewportView(txMelhorarVirgem);

        javax.swing.GroupLayout areaCaracteristicaVirgemLayout = new javax.swing.GroupLayout(areaCaracteristicaVirgem);
        areaCaracteristicaVirgem.setLayout(areaCaracteristicaVirgemLayout);
        areaCaracteristicaVirgemLayout.setHorizontalGroup(
            areaCaracteristicaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaVirgemLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaCaracteristicaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane11)
                    .addComponent(tituloCaracteristicasVirgem)
                    .addComponent(pFortesVirgem)
                    .addComponent(pMelhorarVirgem))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaCaracteristicaVirgemLayout.setVerticalGroup(
            areaCaracteristicaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaVirgemLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloCaracteristicasVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhorarVirgem)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        virgem.add(areaCaracteristicaVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 480, 440));

        areaPrevisaoVirgem.setBackground(new java.awt.Color(6, 61, 80));

        previsaoVirgem.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        previsaoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        previsaoVirgem.setText("Previsão do Dia");

        btnAtualizarPrevisaoVirgem.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnAtualizarPrevisaoVirgem.setText("Atualizar Previsão");
        btnAtualizarPrevisaoVirgem.addActionListener(this::btnAtualizarPrevisaoVirgemActionPerformed);

        txtPrevisaoVirgem.setColumns(20);
        txtPrevisaoVirgem.setRows(5);
        prev5.setViewportView(txtPrevisaoVirgem);

        javax.swing.GroupLayout areaPrevisaoVirgemLayout = new javax.swing.GroupLayout(areaPrevisaoVirgem);
        areaPrevisaoVirgem.setLayout(areaPrevisaoVirgemLayout);
        areaPrevisaoVirgemLayout.setHorizontalGroup(
            areaPrevisaoVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                .addGroup(areaPrevisaoVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAtualizarPrevisaoVirgem))
                    .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisaoVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoVirgem)
                            .addComponent(prev5, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        areaPrevisaoVirgemLayout.setVerticalGroup(
            areaPrevisaoVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(previsaoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prev5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAtualizarPrevisaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        virgem.add(areaPrevisaoVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 480, 320));

        areaEnergiaVirgem.setBackground(new java.awt.Color(6, 61, 80));

        tituloEnergiaVirgem.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloEnergiaVirgem.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaVirgem.setText("Energia do Dia");

        amorVirgem.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        amorVirgem.setForeground(new java.awt.Color(255, 255, 255));
        amorVirgem.setText("Amor:");

        trabalhoVirgem.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        trabalhoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoVirgem.setText("Trabalho:");

        saudeVirgem.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        saudeVirgem.setForeground(new java.awt.Color(255, 255, 255));
        saudeVirgem.setText("Saúde:");

        sorteVirgem.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        sorteVirgem.setForeground(new java.awt.Color(255, 255, 255));
        sorteVirgem.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaVirgemLayout = new javax.swing.GroupLayout(areaEnergiaVirgem);
        areaEnergiaVirgem.setLayout(areaEnergiaVirgemLayout);
        areaEnergiaVirgemLayout.setHorizontalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saudeVirgem)
                    .addComponent(amorVirgem)
                    .addComponent(tituloEnergiaVirgem)
                    .addComponent(tfAmorVirgem)
                    .addComponent(trabalhoVirgem)
                    .addComponent(tfTrabalhoVirgem)
                    .addComponent(tfSaudeVirgem)
                    .addComponent(sorteVirgem)
                    .addComponent(tfSorteVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        areaEnergiaVirgemLayout.setVerticalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        virgem.add(areaEnergiaVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 920, 480, 330));

        areaMensagemVirgem.setBackground(new java.awt.Color(6, 61, 80));

        tituloMensagemVirgem.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloMensagemVirgem.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemVirgem.setText("Mensagem do Dia");

        btnCopiarMsgVirgem.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnCopiarMsgVirgem.setText("Copiar Mensagem");

        txMensagemVirgem.setColumns(20);
        txMensagemVirgem.setRows(5);
        jScrollPane30.setViewportView(txMensagemVirgem);

        javax.swing.GroupLayout areaMensagemVirgemLayout = new javax.swing.GroupLayout(areaMensagemVirgem);
        areaMensagemVirgem.setLayout(areaMensagemVirgemLayout);
        areaMensagemVirgemLayout.setHorizontalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemVirgemLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(btnCopiarMsgVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemVirgem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemVirgemLayout.setVerticalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloMensagemVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        virgem.add(areaMensagemVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 390, 330));

        fundoVirgem.setBackground(new java.awt.Color(225, 208, 170));
        fundoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagem_1890x1100.png")); // NOI18N
        virgem.add(fundoVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 1890));

        jTabbedPane1.addTab("Virgem", virgem);

        libras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesLibras.setBackground(new java.awt.Color(6, 61, 80));

        imgSignoLibras.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\libras-.png")); // NOI18N

        tituloLibras.setFont(new java.awt.Font("Lucida Handwriting", 1, 28)); // NOI18N
        tituloLibras.setForeground(new java.awt.Color(255, 255, 255));
        tituloLibras.setText("Libras");

        periodoLibras.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        periodoLibras.setForeground(new java.awt.Color(255, 255, 255));
        periodoLibras.setText("Periodo:");

        elementoLibras.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        elementoLibras.setForeground(new java.awt.Color(255, 255, 255));
        elementoLibras.setText("Elemento:");

        planetaLibras.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        planetaLibras.setForeground(new java.awt.Color(255, 255, 255));
        planetaLibras.setText("Planeta Regente:");

        corLibras.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        corLibras.setForeground(new java.awt.Color(255, 255, 255));
        corLibras.setText("Cor:");

        numeroLibras.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        numeroLibras.setForeground(new java.awt.Color(255, 255, 255));
        numeroLibras.setText("Numero da Sorte:");

        tfPeriodoLibras.addActionListener(this::tfPeriodoLibrasActionPerformed);

        tfElementoLibras.addActionListener(this::tfElementoLibrasActionPerformed);

        javax.swing.GroupLayout areaInformacoesLibrasLayout = new javax.swing.GroupLayout(areaInformacoesLibras);
        areaInformacoesLibras.setLayout(areaInformacoesLibrasLayout);
        areaInformacoesLibrasLayout.setHorizontalGroup(
            areaInformacoesLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoLibras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(areaInformacoesLibrasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLibrasLayout.createSequentialGroup()
                        .addComponent(numeroLibras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroLibras, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(areaInformacoesLibrasLayout.createSequentialGroup()
                            .addGroup(areaInformacoesLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(periodoLibras, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(elementoLibras, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPeriodoLibras, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfElementoLibras, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaInformacoesLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesLibrasLayout.createSequentialGroup()
                                .addComponent(corLibras, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCorLibras, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesLibrasLayout.createSequentialGroup()
                                .addComponent(planetaLibras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaLibras, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tituloLibras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaInformacoesLibrasLayout.setVerticalGroup(
            areaInformacoesLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibrasLayout.createSequentialGroup()
                .addComponent(imgSignoLibras, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloLibras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoLibras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoLibras))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLibras)
                    .addComponent(tfElementoLibras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(areaInformacoesLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLibras)
                    .addComponent(tfPlanetaLibras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLibras)
                    .addComponent(tfCorLibras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(areaInformacoesLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLibras)
                    .addComponent(tfNumeroLibras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 123, Short.MAX_VALUE))
        );

        libras.add(areaInformacoesLibras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 390, 790));

        areaCaracteristicaLibras.setBackground(new java.awt.Color(8, 61, 80));

        tituloCaracteristicasLibras.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        tituloCaracteristicasLibras.setForeground(new java.awt.Color(255, 255, 255));
        tituloCaracteristicasLibras.setText("Características");

        pFortesLibras.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        pFortesLibras.setForeground(new java.awt.Color(255, 255, 255));
        pFortesLibras.setText("Pontos Fortes:");

        pMelhorarLibras.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        pMelhorarLibras.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarLibras.setText("Pontos a Melhorar:");

        txFortesLibras.setColumns(20);
        txFortesLibras.setRows(5);
        jScrollPane13.setViewportView(txFortesLibras);

        txMelhorarLibras.setColumns(20);
        txMelhorarLibras.setRows(5);
        jScrollPane14.setViewportView(txMelhorarLibras);

        javax.swing.GroupLayout areaCaracteristicaLibrasLayout = new javax.swing.GroupLayout(areaCaracteristicaLibras);
        areaCaracteristicaLibras.setLayout(areaCaracteristicaLibrasLayout);
        areaCaracteristicaLibrasLayout.setHorizontalGroup(
            areaCaracteristicaLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaLibrasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaCaracteristicaLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane13)
                    .addComponent(tituloCaracteristicasLibras)
                    .addComponent(pFortesLibras)
                    .addComponent(pMelhorarLibras))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaCaracteristicaLibrasLayout.setVerticalGroup(
            areaCaracteristicaLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaLibrasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloCaracteristicasLibras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesLibras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhorarLibras)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        libras.add(areaCaracteristicaLibras, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 480, 440));

        areaPrevisaoLibras.setBackground(new java.awt.Color(6, 61, 80));

        previsaoLibras.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        previsaoLibras.setForeground(new java.awt.Color(255, 255, 255));
        previsaoLibras.setText("Previsão do Dia");

        btnAtualizarPrevisaoLibras.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnAtualizarPrevisaoLibras.setText("Atualizar Previsão");
        btnAtualizarPrevisaoLibras.addActionListener(this::btnAtualizarPrevisaoLibrasActionPerformed);

        txtPrevisaoLibras.setColumns(20);
        txtPrevisaoLibras.setRows(5);
        prev6.setViewportView(txtPrevisaoLibras);

        javax.swing.GroupLayout areaPrevisaoLibrasLayout = new javax.swing.GroupLayout(areaPrevisaoLibras);
        areaPrevisaoLibras.setLayout(areaPrevisaoLibrasLayout);
        areaPrevisaoLibrasLayout.setHorizontalGroup(
            areaPrevisaoLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLibrasLayout.createSequentialGroup()
                .addGroup(areaPrevisaoLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoLibrasLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAtualizarPrevisaoLibras))
                    .addGroup(areaPrevisaoLibrasLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisaoLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoLibras)
                            .addComponent(prev6, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        areaPrevisaoLibrasLayout.setVerticalGroup(
            areaPrevisaoLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLibrasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(previsaoLibras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prev6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAtualizarPrevisaoLibras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        libras.add(areaPrevisaoLibras, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 480, 320));

        areaEnergiaLibras.setBackground(new java.awt.Color(6, 61, 80));

        tituloEnergiaLibras.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloEnergiaLibras.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaLibras.setText("Energia do Dia");

        amorLibras.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        amorLibras.setForeground(new java.awt.Color(255, 255, 255));
        amorLibras.setText("Amor:");

        trabalhoLibras.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        trabalhoLibras.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoLibras.setText("Trabalho:");

        saudeLibras.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        saudeLibras.setForeground(new java.awt.Color(255, 255, 255));
        saudeLibras.setText("Saúde:");

        sorteLibras.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        sorteLibras.setForeground(new java.awt.Color(255, 255, 255));
        sorteLibras.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaLibrasLayout = new javax.swing.GroupLayout(areaEnergiaLibras);
        areaEnergiaLibras.setLayout(areaEnergiaLibrasLayout);
        areaEnergiaLibrasLayout.setHorizontalGroup(
            areaEnergiaLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibrasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(areaEnergiaLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saudeLibras)
                    .addComponent(amorLibras)
                    .addComponent(tituloEnergiaLibras)
                    .addComponent(tfAmorLibras)
                    .addComponent(trabalhoLibras)
                    .addComponent(tfTrabalhoLibras)
                    .addComponent(tfSaudeLibras)
                    .addComponent(sorteLibras)
                    .addComponent(tfSorteLibras, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        areaEnergiaLibrasLayout.setVerticalGroup(
            areaEnergiaLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaLibras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorLibras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLibras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoLibras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoLibras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeLibras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeLibras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteLibras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteLibras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        libras.add(areaEnergiaLibras, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 920, 480, 330));

        areaMensagemLibras.setBackground(new java.awt.Color(6, 61, 80));

        tituloMensagemLibras.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloMensagemLibras.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemLibras.setText("Mensagem do Dia");

        btnCopiarMsgLibras.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnCopiarMsgLibras.setText("Copiar Mensagem");

        txMensagemLibras.setColumns(20);
        txMensagemLibras.setRows(5);
        jScrollPane31.setViewportView(txMensagemLibras);

        javax.swing.GroupLayout areaMensagemLibrasLayout = new javax.swing.GroupLayout(areaMensagemLibras);
        areaMensagemLibras.setLayout(areaMensagemLibrasLayout);
        areaMensagemLibrasLayout.setHorizontalGroup(
            areaMensagemLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemLibrasLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(btnCopiarMsgLibras, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(areaMensagemLibrasLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaMensagemLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemLibras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemLibrasLayout.setVerticalGroup(
            areaMensagemLibrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibrasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloMensagemLibras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgLibras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        libras.add(areaMensagemLibras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 390, 330));

        fundoLibras.setBackground(new java.awt.Color(225, 208, 170));
        fundoLibras.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagem_1890x1100.png")); // NOI18N
        libras.add(fundoLibras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 1890));

        jTabbedPane1.addTab("Libras", libras);

        escorpiao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesEscorpiao.setBackground(new java.awt.Color(6, 61, 80));

        imgSignoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\escorpiao-.png")); // NOI18N

        tituloEscorpiao.setFont(new java.awt.Font("Lucida Handwriting", 1, 28)); // NOI18N
        tituloEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        tituloEscorpiao.setText("Escorpião");

        periodoEscorpiao.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        periodoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        periodoEscorpiao.setText("Periodo:");

        elementoEscorpiao.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        elementoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        elementoEscorpiao.setText("Elemento:");

        planetaEscorpiao.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        planetaEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        planetaEscorpiao.setText("Planeta Regente:");

        corEscorpiao.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        corEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        corEscorpiao.setText("Cor:");

        numeroEscorpiao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        numeroEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        numeroEscorpiao.setText("Numero da Sorte:");

        tfPeriodoEscorpiao.addActionListener(this::tfPeriodoEscorpiaoActionPerformed);

        tfElementoEscorpiao.addActionListener(this::tfElementoEscorpiaoActionPerformed);

        javax.swing.GroupLayout areaInformacoesEscorpiaoLayout = new javax.swing.GroupLayout(areaInformacoesEscorpiao);
        areaInformacoesEscorpiao.setLayout(areaInformacoesEscorpiaoLayout);
        areaInformacoesEscorpiaoLayout.setHorizontalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addComponent(numeroEscorpiao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(periodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(elementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addComponent(corEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addComponent(planetaEscorpiao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tituloEscorpiao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaInformacoesEscorpiaoLayout.setVerticalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoEscorpiao))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoEscorpiao)
                    .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaEscorpiao)
                    .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corEscorpiao)
                    .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroEscorpiao)
                    .addComponent(tfNumeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 123, Short.MAX_VALUE))
        );

        escorpiao.add(areaInformacoesEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 390, 790));

        areaCaracteristicaEscorpiao.setBackground(new java.awt.Color(8, 61, 80));

        tituloCaracteristicasEscorpiao.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        tituloCaracteristicasEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        tituloCaracteristicasEscorpiao.setText("Características");

        pFortesEscorpiao.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        pFortesEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        pFortesEscorpiao.setText("Pontos Fortes:");

        pMelhorarEscorpiao.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        pMelhorarEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarEscorpiao.setText("Pontos a Melhorar:");

        txFortesEscorpiao.setColumns(20);
        txFortesEscorpiao.setRows(5);
        jScrollPane15.setViewportView(txFortesEscorpiao);

        txMelhorarEscorpiao.setColumns(20);
        txMelhorarEscorpiao.setRows(5);
        jScrollPane16.setViewportView(txMelhorarEscorpiao);

        javax.swing.GroupLayout areaCaracteristicaEscorpiaoLayout = new javax.swing.GroupLayout(areaCaracteristicaEscorpiao);
        areaCaracteristicaEscorpiao.setLayout(areaCaracteristicaEscorpiaoLayout);
        areaCaracteristicaEscorpiaoLayout.setHorizontalGroup(
            areaCaracteristicaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaEscorpiaoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaCaracteristicaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane15)
                    .addComponent(tituloCaracteristicasEscorpiao)
                    .addComponent(pFortesEscorpiao)
                    .addComponent(pMelhorarEscorpiao))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaCaracteristicaEscorpiaoLayout.setVerticalGroup(
            areaCaracteristicaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaEscorpiaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloCaracteristicasEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhorarEscorpiao)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        escorpiao.add(areaCaracteristicaEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 480, 440));

        areaPrevisaoEscorpiao.setBackground(new java.awt.Color(6, 61, 80));

        previsaoEscorpiao.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        previsaoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        previsaoEscorpiao.setText("Previsão do Dia");

        btnAtualizarPrevisaoEscorpiao.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnAtualizarPrevisaoEscorpiao.setText("Atualizar Previsão");
        btnAtualizarPrevisaoEscorpiao.addActionListener(this::btnAtualizarPrevisaoEscorpiaoActionPerformed);

        txtPrevisaoEscorpiao.setColumns(20);
        txtPrevisaoEscorpiao.setRows(5);
        prev7.setViewportView(txtPrevisaoEscorpiao);

        javax.swing.GroupLayout areaPrevisaoEscorpiaoLayout = new javax.swing.GroupLayout(areaPrevisaoEscorpiao);
        areaPrevisaoEscorpiao.setLayout(areaPrevisaoEscorpiaoLayout);
        areaPrevisaoEscorpiaoLayout.setHorizontalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAtualizarPrevisaoEscorpiao))
                    .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoEscorpiao)
                            .addComponent(prev7, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        areaPrevisaoEscorpiaoLayout.setVerticalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(previsaoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prev7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAtualizarPrevisaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        escorpiao.add(areaPrevisaoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 480, 320));

        areaEnergiaEscorpiao.setBackground(new java.awt.Color(6, 61, 80));

        tituloEnergiaEscorpiao.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloEnergiaEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaEscorpiao.setText("Energia do Dia");

        amorEscorpiao.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        amorEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        amorEscorpiao.setText("Amor:");

        trabalhoEscorpiao.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        trabalhoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoEscorpiao.setText("Trabalho:");

        saudeEscorpiao.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        saudeEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        saudeEscorpiao.setText("Saúde:");

        sorteEscorpiao.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        sorteEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        sorteEscorpiao.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaEscorpiaoLayout = new javax.swing.GroupLayout(areaEnergiaEscorpiao);
        areaEnergiaEscorpiao.setLayout(areaEnergiaEscorpiaoLayout);
        areaEnergiaEscorpiaoLayout.setHorizontalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saudeEscorpiao)
                    .addComponent(amorEscorpiao)
                    .addComponent(tituloEnergiaEscorpiao)
                    .addComponent(tfAmorEscorpiao)
                    .addComponent(trabalhoEscorpiao)
                    .addComponent(tfTrabalhoEscorpiao)
                    .addComponent(tfSaudeEscorpiao)
                    .addComponent(sorteEscorpiao)
                    .addComponent(tfSorteEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        areaEnergiaEscorpiaoLayout.setVerticalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        escorpiao.add(areaEnergiaEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 920, 480, 330));

        areaMensagemEscorpiao.setBackground(new java.awt.Color(6, 61, 80));

        tituloMensagemEscorpiao.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloMensagemEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemEscorpiao.setText("Mensagem do Dia");

        btnCopiarMsgEscorpiao.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnCopiarMsgEscorpiao.setText("Copiar Mensagem");

        txMensagemEscorpiao.setColumns(20);
        txMensagemEscorpiao.setRows(5);
        jScrollPane32.setViewportView(txMensagemEscorpiao);

        javax.swing.GroupLayout areaMensagemEscorpiaoLayout = new javax.swing.GroupLayout(areaMensagemEscorpiao);
        areaMensagemEscorpiao.setLayout(areaMensagemEscorpiaoLayout);
        areaMensagemEscorpiaoLayout.setHorizontalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(btnCopiarMsgEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemEscorpiao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemEscorpiaoLayout.setVerticalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloMensagemEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        escorpiao.add(areaMensagemEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 390, 330));

        fundoEscorpiao.setBackground(new java.awt.Color(225, 208, 170));
        fundoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagem_1890x1100.png")); // NOI18N
        escorpiao.add(fundoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 1890));

        jTabbedPane1.addTab("Escorpião", escorpiao);

        sagitario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesSagitario.setBackground(new java.awt.Color(6, 61, 80));

        imgSignoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\sagitario-.png")); // NOI18N

        tituloSagitario.setFont(new java.awt.Font("Lucida Handwriting", 1, 28)); // NOI18N
        tituloSagitario.setForeground(new java.awt.Color(255, 255, 255));
        tituloSagitario.setText("Sagitário");

        periodoSagitario.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        periodoSagitario.setForeground(new java.awt.Color(255, 255, 255));
        periodoSagitario.setText("Periodo:");

        elementoSagitario.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        elementoSagitario.setForeground(new java.awt.Color(255, 255, 255));
        elementoSagitario.setText("Elemento:");

        planetaSagitario.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        planetaSagitario.setForeground(new java.awt.Color(255, 255, 255));
        planetaSagitario.setText("Planeta Regente:");

        corSagitario.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        corSagitario.setForeground(new java.awt.Color(255, 255, 255));
        corSagitario.setText("Cor:");

        numeroSagitario.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        numeroSagitario.setForeground(new java.awt.Color(255, 255, 255));
        numeroSagitario.setText("Numero da Sorte:");

        tfPeriodoSagitario.addActionListener(this::tfPeriodoSagitarioActionPerformed);

        tfElementoSagitario.addActionListener(this::tfElementoSagitarioActionPerformed);

        javax.swing.GroupLayout areaInformacoesSagitarioLayout = new javax.swing.GroupLayout(areaInformacoesSagitario);
        areaInformacoesSagitario.setLayout(areaInformacoesSagitarioLayout);
        areaInformacoesSagitarioLayout.setHorizontalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoSagitario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createSequentialGroup()
                        .addComponent(numeroSagitario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(periodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(elementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfElementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                .addComponent(corSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                .addComponent(planetaSagitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tituloSagitario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaInformacoesSagitarioLayout.setVerticalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoSagitario))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoSagitario)
                    .addComponent(tfElementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaSagitario)
                    .addComponent(tfPlanetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corSagitario)
                    .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroSagitario)
                    .addComponent(tfNumeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 123, Short.MAX_VALUE))
        );

        sagitario.add(areaInformacoesSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 390, 790));

        areaCaracteristicaSagitario.setBackground(new java.awt.Color(8, 61, 80));

        tituloCaracteristicasSagitario.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        tituloCaracteristicasSagitario.setForeground(new java.awt.Color(255, 255, 255));
        tituloCaracteristicasSagitario.setText("Características");

        pFortesSagitario.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        pFortesSagitario.setForeground(new java.awt.Color(255, 255, 255));
        pFortesSagitario.setText("Pontos Fortes:");

        pMelhorarSagitario.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        pMelhorarSagitario.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarSagitario.setText("Pontos a Melhorar:");

        txFortesSagitario.setColumns(20);
        txFortesSagitario.setRows(5);
        jScrollPane17.setViewportView(txFortesSagitario);

        txMelhorarSagitario.setColumns(20);
        txMelhorarSagitario.setRows(5);
        jScrollPane18.setViewportView(txMelhorarSagitario);

        javax.swing.GroupLayout areaCaracteristicaSagitarioLayout = new javax.swing.GroupLayout(areaCaracteristicaSagitario);
        areaCaracteristicaSagitario.setLayout(areaCaracteristicaSagitarioLayout);
        areaCaracteristicaSagitarioLayout.setHorizontalGroup(
            areaCaracteristicaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaSagitarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaCaracteristicaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane17)
                    .addComponent(tituloCaracteristicasSagitario)
                    .addComponent(pFortesSagitario)
                    .addComponent(pMelhorarSagitario))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaCaracteristicaSagitarioLayout.setVerticalGroup(
            areaCaracteristicaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaSagitarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloCaracteristicasSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhorarSagitario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        sagitario.add(areaCaracteristicaSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 480, 440));

        areaPrevisaoSagitario.setBackground(new java.awt.Color(6, 61, 80));

        previsaoSagitario.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        previsaoSagitario.setForeground(new java.awt.Color(255, 255, 255));
        previsaoSagitario.setText("Previsão do Dia");

        btnAtualizarPrevisaoSagitario.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnAtualizarPrevisaoSagitario.setText("Atualizar Previsão");
        btnAtualizarPrevisaoSagitario.addActionListener(this::btnAtualizarPrevisaoSagitarioActionPerformed);

        txtPrevisaoSagitario.setColumns(20);
        txtPrevisaoSagitario.setRows(5);
        prev8.setViewportView(txtPrevisaoSagitario);

        javax.swing.GroupLayout areaPrevisaoSagitarioLayout = new javax.swing.GroupLayout(areaPrevisaoSagitario);
        areaPrevisaoSagitario.setLayout(areaPrevisaoSagitarioLayout);
        areaPrevisaoSagitarioLayout.setHorizontalGroup(
            areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                .addGroup(areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAtualizarPrevisaoSagitario))
                    .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoSagitario)
                            .addComponent(prev8, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        areaPrevisaoSagitarioLayout.setVerticalGroup(
            areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(previsaoSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prev8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAtualizarPrevisaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        sagitario.add(areaPrevisaoSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 480, 320));

        areaEnergiaSagitario.setBackground(new java.awt.Color(6, 61, 80));

        tituloEnergiaSagitario.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloEnergiaSagitario.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaSagitario.setText("Energia do Dia");

        amorSagitario.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        amorSagitario.setForeground(new java.awt.Color(255, 255, 255));
        amorSagitario.setText("Amor:");

        trabalhoSagitario.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        trabalhoSagitario.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoSagitario.setText("Trabalho:");

        saudeSagitario.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        saudeSagitario.setForeground(new java.awt.Color(255, 255, 255));
        saudeSagitario.setText("Saúde:");

        sorteSagitario.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        sorteSagitario.setForeground(new java.awt.Color(255, 255, 255));
        sorteSagitario.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaSagitarioLayout = new javax.swing.GroupLayout(areaEnergiaSagitario);
        areaEnergiaSagitario.setLayout(areaEnergiaSagitarioLayout);
        areaEnergiaSagitarioLayout.setHorizontalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saudeSagitario)
                    .addComponent(amorSagitario)
                    .addComponent(tituloEnergiaSagitario)
                    .addComponent(tfAmorSagitario)
                    .addComponent(trabalhoSagitario)
                    .addComponent(tfTrabalhoSagitario)
                    .addComponent(tfSaudeSagitario)
                    .addComponent(sorteSagitario)
                    .addComponent(tfSorteSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        areaEnergiaSagitarioLayout.setVerticalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        sagitario.add(areaEnergiaSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 920, 480, 330));

        areaMensagemSagitario.setBackground(new java.awt.Color(6, 61, 80));

        tituloMensagemSagitario.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloMensagemSagitario.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemSagitario.setText("Mensagem do Dia");

        btnCopiarMsgSagitario.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnCopiarMsgSagitario.setText("Copiar Mensagem");

        txMensagemSagitario.setColumns(20);
        txMensagemSagitario.setRows(5);
        jScrollPane33.setViewportView(txMensagemSagitario);

        javax.swing.GroupLayout areaMensagemSagitarioLayout = new javax.swing.GroupLayout(areaMensagemSagitario);
        areaMensagemSagitario.setLayout(areaMensagemSagitarioLayout);
        areaMensagemSagitarioLayout.setHorizontalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemSagitarioLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(btnCopiarMsgSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemSagitario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemSagitarioLayout.setVerticalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloMensagemSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        sagitario.add(areaMensagemSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 390, 330));

        fundoSagitario.setBackground(new java.awt.Color(225, 208, 170));
        fundoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagem_1890x1100.png")); // NOI18N
        sagitario.add(fundoSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 1890));

        jTabbedPane1.addTab("Sagitário", sagitario);

        capricornio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesCapricornio.setBackground(new java.awt.Color(6, 61, 80));

        imgSignoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\capricornio-.png")); // NOI18N

        tituloCapriconio.setFont(new java.awt.Font("Lucida Handwriting", 1, 28)); // NOI18N
        tituloCapriconio.setForeground(new java.awt.Color(255, 255, 255));
        tituloCapriconio.setText("Capricórnio");

        periodoCapricornio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        periodoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        periodoCapricornio.setText("Periodo:");

        elementoCapricornio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        elementoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        elementoCapricornio.setText("Elemento:");

        planetaCapricornio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        planetaCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        planetaCapricornio.setText("Planeta Regente:");

        corCapricornio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        corCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        corCapricornio.setText("Cor:");

        numeroCapricornio.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        numeroCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        numeroCapricornio.setText("Numero da Sorte:");

        tfPeriodoCapricornio.addActionListener(this::tfPeriodoCapricornioActionPerformed);

        tfElementoCapricornio.addActionListener(this::tfElementoCapricornioActionPerformed);

        javax.swing.GroupLayout areaInformacoesCapricornioLayout = new javax.swing.GroupLayout(areaInformacoesCapricornio);
        areaInformacoesCapricornio.setLayout(areaInformacoesCapricornioLayout);
        areaInformacoesCapricornioLayout.setHorizontalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createSequentialGroup()
                        .addComponent(numeroCapricornio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(periodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(elementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfElementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                                .addComponent(corCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                                .addComponent(planetaCapricornio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tituloCapriconio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaInformacoesCapricornioLayout.setVerticalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloCapriconio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoCapricornio))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoCapricornio)
                    .addComponent(tfElementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCapricornio)
                    .addComponent(tfPlanetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCapricornio)
                    .addComponent(tfCorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCapricornio)
                    .addComponent(tfNumeroCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 123, Short.MAX_VALUE))
        );

        capricornio.add(areaInformacoesCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 390, 790));

        areaCaracteristicaCapricornio.setBackground(new java.awt.Color(8, 61, 80));

        tituloCaracteristicasCapricornio.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        tituloCaracteristicasCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        tituloCaracteristicasCapricornio.setText("Características");

        pFortesCapricornio.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        pFortesCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        pFortesCapricornio.setText("Pontos Fortes:");

        pMelhorarCapricornio.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        pMelhorarCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarCapricornio.setText("Pontos a Melhorar:");

        txFortesCapricornio.setColumns(20);
        txFortesCapricornio.setRows(5);
        jScrollPane19.setViewportView(txFortesCapricornio);

        txMelhorarCapricornio.setColumns(20);
        txMelhorarCapricornio.setRows(5);
        jScrollPane20.setViewportView(txMelhorarCapricornio);

        javax.swing.GroupLayout areaCaracteristicaCapricornioLayout = new javax.swing.GroupLayout(areaCaracteristicaCapricornio);
        areaCaracteristicaCapricornio.setLayout(areaCaracteristicaCapricornioLayout);
        areaCaracteristicaCapricornioLayout.setHorizontalGroup(
            areaCaracteristicaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaCapricornioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaCaracteristicaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane19)
                    .addComponent(tituloCaracteristicasCapricornio)
                    .addComponent(pFortesCapricornio)
                    .addComponent(pMelhorarCapricornio))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaCaracteristicaCapricornioLayout.setVerticalGroup(
            areaCaracteristicaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaCapricornioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloCaracteristicasCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhorarCapricornio)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        capricornio.add(areaCaracteristicaCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 480, 440));

        areaPrevisaoCapricornio.setBackground(new java.awt.Color(6, 61, 80));

        previsaoCapricornio.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        previsaoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        previsaoCapricornio.setText("Previsão do Dia");

        btnAtualizarPrevisaoCapricornio.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnAtualizarPrevisaoCapricornio.setText("Atualizar Previsão");
        btnAtualizarPrevisaoCapricornio.addActionListener(this::btnAtualizarPrevisaoCapricornioActionPerformed);

        txtPrevisaoCapricornio.setColumns(20);
        txtPrevisaoCapricornio.setRows(5);
        prev9.setViewportView(txtPrevisaoCapricornio);

        javax.swing.GroupLayout areaPrevisaoCapricornioLayout = new javax.swing.GroupLayout(areaPrevisaoCapricornio);
        areaPrevisaoCapricornio.setLayout(areaPrevisaoCapricornioLayout);
        areaPrevisaoCapricornioLayout.setHorizontalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addGroup(areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAtualizarPrevisaoCapricornio))
                    .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoCapricornio)
                            .addComponent(prev9, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        areaPrevisaoCapricornioLayout.setVerticalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(previsaoCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prev9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAtualizarPrevisaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        capricornio.add(areaPrevisaoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 480, 320));

        areaEnergiaCapricornio.setBackground(new java.awt.Color(6, 61, 80));

        tituloEnergiaCapricornio.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloEnergiaCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaCapricornio.setText("Energia do Dia");

        amorCapricornio.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        amorCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        amorCapricornio.setText("Amor:");

        trabalhoCapricornio.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        trabalhoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoCapricornio.setText("Trabalho:");

        saudeCapricornio.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        saudeCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        saudeCapricornio.setText("Saúde:");

        sorteCapricornio.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        sorteCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        sorteCapricornio.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaCapricornioLayout = new javax.swing.GroupLayout(areaEnergiaCapricornio);
        areaEnergiaCapricornio.setLayout(areaEnergiaCapricornioLayout);
        areaEnergiaCapricornioLayout.setHorizontalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saudeCapricornio)
                    .addComponent(amorCapricornio)
                    .addComponent(tituloEnergiaCapricornio)
                    .addComponent(tfAmorCapricornio)
                    .addComponent(trabalhoCapricornio)
                    .addComponent(tfTrabalhoCapricornio)
                    .addComponent(tfSaudeCapricornio)
                    .addComponent(sorteCapricornio)
                    .addComponent(tfSorteCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        areaEnergiaCapricornioLayout.setVerticalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        capricornio.add(areaEnergiaCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 920, 480, 330));

        areaMensagemCapricornio.setBackground(new java.awt.Color(6, 61, 80));

        tituloMensagemCapricornio.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloMensagemCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemCapricornio.setText("Mensagem do Dia");

        btnCopiarMsgCapricornio.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnCopiarMsgCapricornio.setText("Copiar Mensagem");

        txMensagemCapricornio.setColumns(20);
        txMensagemCapricornio.setRows(5);
        jScrollPane34.setViewportView(txMensagemCapricornio);

        javax.swing.GroupLayout areaMensagemCapricornioLayout = new javax.swing.GroupLayout(areaMensagemCapricornio);
        areaMensagemCapricornio.setLayout(areaMensagemCapricornioLayout);
        areaMensagemCapricornioLayout.setHorizontalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemCapricornioLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(btnCopiarMsgCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemCapricornio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemCapricornioLayout.setVerticalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloMensagemCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        capricornio.add(areaMensagemCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 390, 330));

        fundoCapricornio.setBackground(new java.awt.Color(225, 208, 170));
        fundoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagem_1890x1100.png")); // NOI18N
        capricornio.add(fundoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 1890));

        jTabbedPane1.addTab("Capricórnio", capricornio);

        aquario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesAquario.setBackground(new java.awt.Color(6, 61, 80));

        imgSignoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\aquario-.png")); // NOI18N

        tituloAquario.setFont(new java.awt.Font("Lucida Handwriting", 1, 28)); // NOI18N
        tituloAquario.setForeground(new java.awt.Color(255, 255, 255));
        tituloAquario.setText("Aquario");

        periodoAquario.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        periodoAquario.setForeground(new java.awt.Color(255, 255, 255));
        periodoAquario.setText("Periodo:");

        elementoAquario.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        elementoAquario.setForeground(new java.awt.Color(255, 255, 255));
        elementoAquario.setText("Elemento:");

        planetaAquario.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        planetaAquario.setForeground(new java.awt.Color(255, 255, 255));
        planetaAquario.setText("Planeta Regente:");

        corAquario.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        corAquario.setForeground(new java.awt.Color(255, 255, 255));
        corAquario.setText("Cor:");

        numeroAquario.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        numeroAquario.setForeground(new java.awt.Color(255, 255, 255));
        numeroAquario.setText("Numero da Sorte:");

        tfPeriodoAquario.addActionListener(this::tfPeriodoAquarioActionPerformed);

        tfElementoAquario.addActionListener(this::tfElementoAquarioActionPerformed);

        javax.swing.GroupLayout areaInformacoesAquarioLayout = new javax.swing.GroupLayout(areaInformacoesAquario);
        areaInformacoesAquario.setLayout(areaInformacoesAquarioLayout);
        areaInformacoesAquarioLayout.setHorizontalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoAquario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAquarioLayout.createSequentialGroup()
                        .addComponent(numeroAquario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(periodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(elementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                .addComponent(corAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                .addComponent(planetaAquario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tituloAquario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaInformacoesAquarioLayout.setVerticalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoAquario))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAquario)
                    .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAquario)
                    .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAquario)
                    .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAquario)
                    .addComponent(tfNumeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 123, Short.MAX_VALUE))
        );

        aquario.add(areaInformacoesAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 390, 790));

        areaCaracteristicaAquario.setBackground(new java.awt.Color(8, 61, 80));

        tituloCaracteristicasAquario.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        tituloCaracteristicasAquario.setForeground(new java.awt.Color(255, 255, 255));
        tituloCaracteristicasAquario.setText("Características");

        pFortesAquario.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        pFortesAquario.setForeground(new java.awt.Color(255, 255, 255));
        pFortesAquario.setText("Pontos Fortes:");

        pMelhorarAquario.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        pMelhorarAquario.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarAquario.setText("Pontos a Melhorar:");

        txFortesAquario.setColumns(20);
        txFortesAquario.setRows(5);
        jScrollPane21.setViewportView(txFortesAquario);

        txMelhorarAquario.setColumns(20);
        txMelhorarAquario.setRows(5);
        jScrollPane22.setViewportView(txMelhorarAquario);

        javax.swing.GroupLayout areaCaracteristicaAquarioLayout = new javax.swing.GroupLayout(areaCaracteristicaAquario);
        areaCaracteristicaAquario.setLayout(areaCaracteristicaAquarioLayout);
        areaCaracteristicaAquarioLayout.setHorizontalGroup(
            areaCaracteristicaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaAquarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaCaracteristicaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane21)
                    .addComponent(tituloCaracteristicasAquario)
                    .addComponent(pFortesAquario)
                    .addComponent(pMelhorarAquario))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaCaracteristicaAquarioLayout.setVerticalGroup(
            areaCaracteristicaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaAquarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloCaracteristicasAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhorarAquario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        aquario.add(areaCaracteristicaAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 480, 440));

        areaPrevisaoAquario.setBackground(new java.awt.Color(6, 61, 80));

        previsaoAquario.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        previsaoAquario.setForeground(new java.awt.Color(255, 255, 255));
        previsaoAquario.setText("Previsão do Dia");

        btnAtualizarPrevisaoAquario.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnAtualizarPrevisaoAquario.setText("Atualizar Previsão");
        btnAtualizarPrevisaoAquario.addActionListener(this::btnAtualizarPrevisaoAquarioActionPerformed);

        txtPrevisaoAquario.setColumns(20);
        txtPrevisaoAquario.setRows(5);
        prev10.setViewportView(txtPrevisaoAquario);

        javax.swing.GroupLayout areaPrevisaoAquarioLayout = new javax.swing.GroupLayout(areaPrevisaoAquario);
        areaPrevisaoAquario.setLayout(areaPrevisaoAquarioLayout);
        areaPrevisaoAquarioLayout.setHorizontalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addGroup(areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAtualizarPrevisaoAquario))
                    .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoAquario)
                            .addComponent(prev10, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        areaPrevisaoAquarioLayout.setVerticalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(previsaoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prev10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAtualizarPrevisaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        aquario.add(areaPrevisaoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 480, 320));

        areaEnergiaAquario.setBackground(new java.awt.Color(6, 61, 80));

        tituloEnergiaAquario.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloEnergiaAquario.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaAquario.setText("Energia do Dia");

        amorAquario.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        amorAquario.setForeground(new java.awt.Color(255, 255, 255));
        amorAquario.setText("Amor:");

        trabalhoAquario.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        trabalhoAquario.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoAquario.setText("Trabalho:");

        saudeAquario.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        saudeAquario.setForeground(new java.awt.Color(255, 255, 255));
        saudeAquario.setText("Saúde:");

        sorteAquario.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        sorteAquario.setForeground(new java.awt.Color(255, 255, 255));
        sorteAquario.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaAquarioLayout = new javax.swing.GroupLayout(areaEnergiaAquario);
        areaEnergiaAquario.setLayout(areaEnergiaAquarioLayout);
        areaEnergiaAquarioLayout.setHorizontalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saudeAquario)
                    .addComponent(amorAquario)
                    .addComponent(tituloEnergiaAquario)
                    .addComponent(tfAmorAquario)
                    .addComponent(trabalhoAquario)
                    .addComponent(tfTrabalhoAquario)
                    .addComponent(tfSaudeAquario)
                    .addComponent(sorteAquario)
                    .addComponent(tfSorteAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        areaEnergiaAquarioLayout.setVerticalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        aquario.add(areaEnergiaAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 920, 480, 330));

        areaMensagemAquario.setBackground(new java.awt.Color(6, 61, 80));

        tituloMensagemAquario.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloMensagemAquario.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemAquario.setText("Mensagem do Dia");

        btnCopiarMsgAquario.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnCopiarMsgAquario.setText("Copiar Mensagem");

        txMensagemAquario.setColumns(20);
        txMensagemAquario.setRows(5);
        jScrollPane35.setViewportView(txMensagemAquario);

        javax.swing.GroupLayout areaMensagemAquarioLayout = new javax.swing.GroupLayout(areaMensagemAquario);
        areaMensagemAquario.setLayout(areaMensagemAquarioLayout);
        areaMensagemAquarioLayout.setHorizontalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemAquarioLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(btnCopiarMsgAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemAquario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemAquarioLayout.setVerticalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloMensagemAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        aquario.add(areaMensagemAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 390, 330));

        fundoAquario.setBackground(new java.awt.Color(225, 208, 170));
        fundoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagem_1890x1100.png")); // NOI18N
        aquario.add(fundoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 1890));

        jTabbedPane1.addTab("Aquário", aquario);

        peixes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesPeixes.setBackground(new java.awt.Color(6, 61, 80));

        imgSignoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\peixes-.png")); // NOI18N

        tituloPeixes.setFont(new java.awt.Font("Lucida Handwriting", 1, 28)); // NOI18N
        tituloPeixes.setForeground(new java.awt.Color(255, 255, 255));
        tituloPeixes.setText("Peixes");

        periodoPeixes.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        periodoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        periodoPeixes.setText("Periodo:");

        elementoPeixes.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        elementoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        elementoPeixes.setText("Elemento:");

        planetaPeixes.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        planetaPeixes.setForeground(new java.awt.Color(255, 255, 255));
        planetaPeixes.setText("Planeta Regente:");

        corPeixes.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 16)); // NOI18N
        corPeixes.setForeground(new java.awt.Color(255, 255, 255));
        corPeixes.setText("Cor:");

        numeroPeixes.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        numeroPeixes.setForeground(new java.awt.Color(255, 255, 255));
        numeroPeixes.setText("Numero da Sorte:");

        tfPeriodoPeixes.addActionListener(this::tfPeriodoPeixesActionPerformed);

        tfElementoPeixes.addActionListener(this::tfElementoPeixesActionPerformed);

        javax.swing.GroupLayout areaInformacoesPeixesLayout = new javax.swing.GroupLayout(areaInformacoesPeixes);
        areaInformacoesPeixes.setLayout(areaInformacoesPeixesLayout);
        areaInformacoesPeixesLayout.setHorizontalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoPeixes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesPeixesLayout.createSequentialGroup()
                        .addComponent(numeroPeixes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                            .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(periodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(elementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfElementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                                .addComponent(corPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                                .addComponent(planetaPeixes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tituloPeixes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaInformacoesPeixesLayout.setVerticalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodoPeixes))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoPeixes)
                    .addComponent(tfElementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaPeixes)
                    .addComponent(tfPlanetaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corPeixes)
                    .addComponent(tfCorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroPeixes)
                    .addComponent(tfNumeroPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 123, Short.MAX_VALUE))
        );

        peixes.add(areaInformacoesPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 390, 790));

        areaCaracteristicaPeixes.setBackground(new java.awt.Color(8, 61, 80));

        tituloCaracteristicasPeixes.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        tituloCaracteristicasPeixes.setForeground(new java.awt.Color(255, 255, 255));
        tituloCaracteristicasPeixes.setText("Características");

        pFortesPeixes.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        pFortesPeixes.setForeground(new java.awt.Color(255, 255, 255));
        pFortesPeixes.setText("Pontos Fortes:");

        pMelhorarPeixes.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        pMelhorarPeixes.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarPeixes.setText("Pontos a Melhorar:");

        txFortesPeixes.setColumns(20);
        txFortesPeixes.setRows(5);
        jScrollPane23.setViewportView(txFortesPeixes);

        txMelhorarPeixes.setColumns(20);
        txMelhorarPeixes.setRows(5);
        jScrollPane24.setViewportView(txMelhorarPeixes);

        javax.swing.GroupLayout areaCaracteristicaPeixesLayout = new javax.swing.GroupLayout(areaCaracteristicaPeixes);
        areaCaracteristicaPeixes.setLayout(areaCaracteristicaPeixesLayout);
        areaCaracteristicaPeixesLayout.setHorizontalGroup(
            areaCaracteristicaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaPeixesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(areaCaracteristicaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane23)
                    .addComponent(tituloCaracteristicasPeixes)
                    .addComponent(pFortesPeixes)
                    .addComponent(pMelhorarPeixes))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        areaCaracteristicaPeixesLayout.setVerticalGroup(
            areaCaracteristicaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaPeixesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tituloCaracteristicasPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhorarPeixes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        peixes.add(areaCaracteristicaPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 480, 440));

        areaPrevisaoPeixes.setBackground(new java.awt.Color(6, 61, 80));

        previsaoPeixes.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        previsaoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        previsaoPeixes.setText("Previsão do Dia");

        btnAtualizarPrevisaoPeixes.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnAtualizarPrevisaoPeixes.setText("Atualizar Previsão");
        btnAtualizarPrevisaoPeixes.addActionListener(this::btnAtualizarPrevisaoPeixesActionPerformed);

        txtPrevisaoPeixes.setColumns(20);
        txtPrevisaoPeixes.setRows(5);
        prev11.setViewportView(txtPrevisaoPeixes);

        javax.swing.GroupLayout areaPrevisaoPeixesLayout = new javax.swing.GroupLayout(areaPrevisaoPeixes);
        areaPrevisaoPeixes.setLayout(areaPrevisaoPeixesLayout);
        areaPrevisaoPeixesLayout.setHorizontalGroup(
            areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                .addGroup(areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAtualizarPrevisaoPeixes))
                    .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previsaoPeixes)
                            .addComponent(prev11, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        areaPrevisaoPeixesLayout.setVerticalGroup(
            areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(previsaoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prev11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAtualizarPrevisaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        peixes.add(areaPrevisaoPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 480, 320));

        areaEnergiaPeixes.setBackground(new java.awt.Color(6, 61, 80));

        tituloEnergiaPeixes.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloEnergiaPeixes.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaPeixes.setText("Energia do Dia");

        amorPeixes.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        amorPeixes.setForeground(new java.awt.Color(255, 255, 255));
        amorPeixes.setText("Amor:");

        trabalhoPeixes.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        trabalhoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoPeixes.setText("Trabalho:");

        saudePeixes.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        saudePeixes.setForeground(new java.awt.Color(255, 255, 255));
        saudePeixes.setText("Saúde:");

        sortePeixes.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        sortePeixes.setForeground(new java.awt.Color(255, 255, 255));
        sortePeixes.setText("Sorte:");

        javax.swing.GroupLayout areaEnergiaPeixesLayout = new javax.swing.GroupLayout(areaEnergiaPeixes);
        areaEnergiaPeixes.setLayout(areaEnergiaPeixesLayout);
        areaEnergiaPeixesLayout.setHorizontalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saudePeixes)
                    .addComponent(amorPeixes)
                    .addComponent(tituloEnergiaPeixes)
                    .addComponent(tfAmorPeixes)
                    .addComponent(trabalhoPeixes)
                    .addComponent(tfTrabalhoPeixes)
                    .addComponent(tfSaudePeixes)
                    .addComponent(sortePeixes)
                    .addComponent(tfSortePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        areaEnergiaPeixesLayout.setVerticalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudePeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sortePeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSortePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        peixes.add(areaEnergiaPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 920, 480, 330));

        areaMensagemPeixes.setBackground(new java.awt.Color(6, 61, 80));

        tituloMensagemPeixes.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        tituloMensagemPeixes.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemPeixes.setText("Mensagem do Dia");

        btnCopiarMsgPeixes.setFont(new java.awt.Font("Juice ITC", 1, 28)); // NOI18N
        btnCopiarMsgPeixes.setText("Copiar Mensagem");

        txMensagemPeixes.setColumns(20);
        txMensagemPeixes.setRows(5);
        jScrollPane36.setViewportView(txMensagemPeixes);

        javax.swing.GroupLayout areaMensagemPeixesLayout = new javax.swing.GroupLayout(areaMensagemPeixes);
        areaMensagemPeixes.setLayout(areaMensagemPeixesLayout);
        areaMensagemPeixesLayout.setHorizontalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemPeixesLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(btnCopiarMsgPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemPeixes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemPeixesLayout.setVerticalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloMensagemPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        peixes.add(areaMensagemPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 390, 330));

        fundoPeixes.setBackground(new java.awt.Color(225, 208, 170));
        fundoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\SamaraTavares\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagem_1890x1100.png")); // NOI18N
        peixes.add(fundoPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 1890));

        jTabbedPane1.addTab("Peixes", peixes);

        getContentPane().add(jTabbedPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarPrevisaoAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoAriesActionPerformed

    private void tfPeriodoAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoAriesActionPerformed

    private void tfElementoAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoAriesActionPerformed

    private void tfPeriodoTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoTouroActionPerformed

    private void tfElementoTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoTouroActionPerformed

    private void tfPeriodoGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoGemeosActionPerformed

    private void tfElementoGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoGemeosActionPerformed

    private void tfPeriodoCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoCancerActionPerformed

    private void tfElementoCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoCancerActionPerformed

    private void tfPeriodoCancer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoCancer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoCancer1ActionPerformed

    private void tfElementoCancer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoCancer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoCancer1ActionPerformed

    private void tfPeriodoVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoVirgemActionPerformed

    private void tfElementoVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoVirgemActionPerformed

    private void tfPeriodoLibrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoLibrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoLibrasActionPerformed

    private void tfElementoLibrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoLibrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoLibrasActionPerformed

    private void tfPeriodoEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoEscorpiaoActionPerformed

    private void tfElementoEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoEscorpiaoActionPerformed

    private void tfPeriodoSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoSagitarioActionPerformed

    private void tfElementoSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoSagitarioActionPerformed

    private void tfPeriodoCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoCapricornioActionPerformed

    private void tfElementoCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoCapricornioActionPerformed

    private void tfPeriodoAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoAquarioActionPerformed

    private void tfElementoAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoAquarioActionPerformed

    private void tfPeriodoPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoPeixesActionPerformed

    private void tfElementoPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoPeixesActionPerformed

    private void btnAtualizarPrevisaoTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoTouroActionPerformed

    private void btnAtualizarPrevisaoGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoGemeosActionPerformed

    private void btnAtualizarPrevisaoCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoCancerActionPerformed

    private void btnAtualizarPrevisaoLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoLeaoActionPerformed

    private void btnAtualizarPrevisaoVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoVirgemActionPerformed

    private void btnAtualizarPrevisaoLibrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoLibrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoLibrasActionPerformed

    private void btnAtualizarPrevisaoEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoEscorpiaoActionPerformed

    private void btnAtualizarPrevisaoSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoSagitarioActionPerformed

    private void btnAtualizarPrevisaoCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoCapricornioActionPerformed

    private void btnAtualizarPrevisaoAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoAquarioActionPerformed

    private void btnAtualizarPrevisaoPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoPeixesActionPerformed

    private void btDescobrirSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDescobrirSignoActionPerformed
        // TODO add your handling code here:
        CalcularSigno();
    }//GEN-LAST:event_btDescobrirSignoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        CalcularCompatibilidade();
    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Signos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amorAquario;
    private javax.swing.JLabel amorAries;
    private javax.swing.JLabel amorCancer;
    private javax.swing.JLabel amorCapricornio;
    private javax.swing.JLabel amorEscorpiao;
    private javax.swing.JLabel amorGemeos;
    private javax.swing.JLabel amorLeao;
    private javax.swing.JLabel amorLibras;
    private javax.swing.JLabel amorPeixes;
    private javax.swing.JLabel amorSagitario;
    private javax.swing.JLabel amorTouro;
    private javax.swing.JLabel amorVirgem;
    private javax.swing.JPanel aquario;
    private javax.swing.JPanel areaCaracteristicaAquario;
    private javax.swing.JPanel areaCaracteristicaAries;
    private javax.swing.JPanel areaCaracteristicaCancer;
    private javax.swing.JPanel areaCaracteristicaCapricornio;
    private javax.swing.JPanel areaCaracteristicaEscorpiao;
    private javax.swing.JPanel areaCaracteristicaGemeos;
    private javax.swing.JPanel areaCaracteristicaLeao;
    private javax.swing.JPanel areaCaracteristicaLibras;
    private javax.swing.JPanel areaCaracteristicaPeixes;
    private javax.swing.JPanel areaCaracteristicaSagitario;
    private javax.swing.JPanel areaCaracteristicaTouro;
    private javax.swing.JPanel areaCaracteristicaVirgem;
    private javax.swing.JPanel areaCompabilidade;
    private javax.swing.JPanel areaDescobrirSigno;
    private javax.swing.JPanel areaEnergiaAquario;
    private javax.swing.JPanel areaEnergiaAries;
    private javax.swing.JPanel areaEnergiaCancer;
    private javax.swing.JPanel areaEnergiaCapricornio;
    private javax.swing.JPanel areaEnergiaEscorpiao;
    private javax.swing.JPanel areaEnergiaGemeos;
    private javax.swing.JPanel areaEnergiaLeao;
    private javax.swing.JPanel areaEnergiaLibras;
    private javax.swing.JPanel areaEnergiaPeixes;
    private javax.swing.JPanel areaEnergiaSagitario;
    private javax.swing.JPanel areaEnergiaTouro;
    private javax.swing.JPanel areaEnergiaVirgem;
    private javax.swing.JPanel areaInformacoesAquario;
    private javax.swing.JPanel areaInformacoesAries;
    private javax.swing.JPanel areaInformacoesCancer;
    private javax.swing.JPanel areaInformacoesCapricornio;
    private javax.swing.JPanel areaInformacoesEscorpiao;
    private javax.swing.JPanel areaInformacoesGemeos;
    private javax.swing.JPanel areaInformacoesLeao;
    private javax.swing.JPanel areaInformacoesLibras;
    private javax.swing.JPanel areaInformacoesPeixes;
    private javax.swing.JPanel areaInformacoesSagitario;
    private javax.swing.JPanel areaInformacoesTouro;
    private javax.swing.JPanel areaInformacoesVirgem;
    private javax.swing.JPanel areaMensagemAquario;
    private javax.swing.JPanel areaMensagemAries;
    private javax.swing.JPanel areaMensagemCancer;
    private javax.swing.JPanel areaMensagemCapricornio;
    private javax.swing.JPanel areaMensagemEscorpiao;
    private javax.swing.JPanel areaMensagemGemeos;
    private javax.swing.JPanel areaMensagemLeao;
    private javax.swing.JPanel areaMensagemLibras;
    private javax.swing.JPanel areaMensagemPeixes;
    private javax.swing.JPanel areaMensagemSagitario;
    private javax.swing.JPanel areaMensagemTouro;
    private javax.swing.JPanel areaMensagemVirgem;
    private javax.swing.JPanel areaPrevisaoAquario;
    private javax.swing.JPanel areaPrevisaoAries;
    private javax.swing.JPanel areaPrevisaoCancer;
    private javax.swing.JPanel areaPrevisaoCapricornio;
    private javax.swing.JPanel areaPrevisaoEscorpiao;
    private javax.swing.JPanel areaPrevisaoGemeos;
    private javax.swing.JPanel areaPrevisaoLeao;
    private javax.swing.JPanel areaPrevisaoLibras;
    private javax.swing.JPanel areaPrevisaoPeixes;
    private javax.swing.JPanel areaPrevisaoSagitario;
    private javax.swing.JPanel areaPrevisaoTouro;
    private javax.swing.JPanel areaPrevisaoVirgem;
    private javax.swing.JPanel areaResultado;
    private javax.swing.JPanel aries;
    private javax.swing.JButton btDescobrirSigno;
    private javax.swing.JButton btnAtualizarPrevisaoAquario;
    private javax.swing.JButton btnAtualizarPrevisaoAries;
    private javax.swing.JButton btnAtualizarPrevisaoCancer;
    private javax.swing.JButton btnAtualizarPrevisaoCapricornio;
    private javax.swing.JButton btnAtualizarPrevisaoEscorpiao;
    private javax.swing.JButton btnAtualizarPrevisaoGemeos;
    private javax.swing.JButton btnAtualizarPrevisaoLeao;
    private javax.swing.JButton btnAtualizarPrevisaoLibras;
    private javax.swing.JButton btnAtualizarPrevisaoPeixes;
    private javax.swing.JButton btnAtualizarPrevisaoSagitario;
    private javax.swing.JButton btnAtualizarPrevisaoTouro;
    private javax.swing.JButton btnAtualizarPrevisaoVirgem;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCopiarMsgAquario;
    private javax.swing.JButton btnCopiarMsgAries;
    private javax.swing.JButton btnCopiarMsgCancer;
    private javax.swing.JButton btnCopiarMsgCapricornio;
    private javax.swing.JButton btnCopiarMsgEscorpiao;
    private javax.swing.JButton btnCopiarMsgGemeos;
    private javax.swing.JButton btnCopiarMsgLeao;
    private javax.swing.JButton btnCopiarMsgLibras;
    private javax.swing.JButton btnCopiarMsgPeixes;
    private javax.swing.JButton btnCopiarMsgSagitario;
    private javax.swing.JButton btnCopiarMsgTouro;
    private javax.swing.JButton btnCopiarMsgVirgem;
    private javax.swing.JButton btnSigno;
    private javax.swing.JPanel cancer;
    private javax.swing.JPanel capricornio;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbSigno1;
    private javax.swing.JComboBox<String> cbSigno2;
    private javax.swing.JLabel corAquario;
    private javax.swing.JLabel corAries;
    private javax.swing.JLabel corCancer;
    private javax.swing.JLabel corCapricornio;
    private javax.swing.JLabel corEscorpiao;
    private javax.swing.JLabel corGemeos;
    private javax.swing.JLabel corLeao;
    private javax.swing.JLabel corLibras;
    private javax.swing.JLabel corPeixes;
    private javax.swing.JLabel corSagitario;
    private javax.swing.JLabel corTouro;
    private javax.swing.JLabel corVirgem;
    private javax.swing.JLabel diaNascimento;
    private javax.swing.JLabel elementoAquario;
    private javax.swing.JLabel elementoAries;
    private javax.swing.JLabel elementoCancer;
    private javax.swing.JLabel elementoCapricornio;
    private javax.swing.JLabel elementoEscorpiao;
    private javax.swing.JLabel elementoGemeos;
    private javax.swing.JLabel elementoLeao;
    private javax.swing.JLabel elementoLibras;
    private javax.swing.JLabel elementoPeixes;
    private javax.swing.JLabel elementoSagitario;
    private javax.swing.JLabel elementoTouro;
    private javax.swing.JLabel elementoVirgem;
    private javax.swing.JPanel escorpiao;
    private javax.swing.JLabel fundoAquario;
    private javax.swing.JLabel fundoAries;
    private javax.swing.JLabel fundoCancer;
    private javax.swing.JLabel fundoCapricornio;
    private javax.swing.JLabel fundoEscorpiao;
    private javax.swing.JLabel fundoGemeos;
    private javax.swing.JLabel fundoInicio;
    private javax.swing.JLabel fundoLeao;
    private javax.swing.JLabel fundoLibras;
    private javax.swing.JLabel fundoPeixes;
    private javax.swing.JLabel fundoSagitario;
    private javax.swing.JLabel fundoTouro;
    private javax.swing.JLabel fundoVirgem;
    private javax.swing.JPanel gemeos;
    private javax.swing.JLabel imgSignoAquario;
    private javax.swing.JLabel imgSignoAries;
    private javax.swing.JLabel imgSignoCancer;
    private javax.swing.JLabel imgSignoCapricornio;
    private javax.swing.JLabel imgSignoEscorpiao;
    private javax.swing.JLabel imgSignoGemeos;
    private javax.swing.JLabel imgSignoLeao;
    private javax.swing.JLabel imgSignoLibras;
    private javax.swing.JLabel imgSignoPeixes;
    private javax.swing.JLabel imgSignoSagitario;
    private javax.swing.JLabel imgSignoTouro;
    private javax.swing.JLabel imgSignoVirgem;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel leao;
    private javax.swing.JPanel libras;
    private javax.swing.JLabel mesNascimento;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numeroAquario;
    private javax.swing.JLabel numeroAries;
    private javax.swing.JLabel numeroCancer;
    private javax.swing.JLabel numeroCapricornio;
    private javax.swing.JLabel numeroEscorpiao;
    private javax.swing.JLabel numeroGemeos;
    private javax.swing.JLabel numeroLeao;
    private javax.swing.JLabel numeroLibras;
    private javax.swing.JLabel numeroPeixes;
    private javax.swing.JLabel numeroSagitario;
    private javax.swing.JLabel numeroTouro;
    private javax.swing.JLabel numeroVirgem;
    private javax.swing.JLabel pFortesAquario;
    private javax.swing.JLabel pFortesAries;
    private javax.swing.JLabel pFortesCancer;
    private javax.swing.JLabel pFortesCapricornio;
    private javax.swing.JLabel pFortesEscorpiao;
    private javax.swing.JLabel pFortesGemeos;
    private javax.swing.JLabel pFortesLeao;
    private javax.swing.JLabel pFortesLibras;
    private javax.swing.JLabel pFortesPeixes;
    private javax.swing.JLabel pFortesSagitario;
    private javax.swing.JLabel pFortesTouro;
    private javax.swing.JLabel pFortesVirgem;
    private javax.swing.JLabel pMelhorarAquario;
    private javax.swing.JLabel pMelhorarAries;
    private javax.swing.JLabel pMelhorarCancer;
    private javax.swing.JLabel pMelhorarCapricornio;
    private javax.swing.JLabel pMelhorarEscorpiao;
    private javax.swing.JLabel pMelhorarGemeos;
    private javax.swing.JLabel pMelhorarLeao;
    private javax.swing.JLabel pMelhorarLibras;
    private javax.swing.JLabel pMelhorarPeixes;
    private javax.swing.JLabel pMelhorarSagitario;
    private javax.swing.JLabel pMelhorarTouro;
    private javax.swing.JLabel pMelhorarVirgem;
    private javax.swing.JPanel peixes;
    private javax.swing.JLabel periodoAquario;
    private javax.swing.JLabel periodoAries;
    private javax.swing.JLabel periodoCancer;
    private javax.swing.JLabel periodoCapricornio;
    private javax.swing.JLabel periodoEscorpiao;
    private javax.swing.JLabel periodoGemeos;
    private javax.swing.JLabel periodoLeao;
    private javax.swing.JLabel periodoLibras;
    private javax.swing.JLabel periodoPeixes;
    private javax.swing.JLabel periodoSagitario;
    private javax.swing.JLabel periodoTouro;
    private javax.swing.JLabel periodoVirgem;
    private javax.swing.JLabel planetaAquario;
    private javax.swing.JLabel planetaAries;
    private javax.swing.JLabel planetaCancer;
    private javax.swing.JLabel planetaCapricornio;
    private javax.swing.JLabel planetaEscorpiao;
    private javax.swing.JLabel planetaGemeos;
    private javax.swing.JLabel planetaLeao;
    private javax.swing.JLabel planetaLibras;
    private javax.swing.JLabel planetaPeixes;
    private javax.swing.JLabel planetaSagitario;
    private javax.swing.JLabel planetaTouro;
    private javax.swing.JLabel planetaVirgem;
    private javax.swing.JScrollPane prev;
    private javax.swing.JScrollPane prev1;
    private javax.swing.JScrollPane prev10;
    private javax.swing.JScrollPane prev11;
    private javax.swing.JScrollPane prev2;
    private javax.swing.JScrollPane prev3;
    private javax.swing.JScrollPane prev4;
    private javax.swing.JScrollPane prev5;
    private javax.swing.JScrollPane prev6;
    private javax.swing.JScrollPane prev7;
    private javax.swing.JScrollPane prev8;
    private javax.swing.JScrollPane prev9;
    private javax.swing.JLabel previsaoAquario;
    private javax.swing.JLabel previsaoAries;
    private javax.swing.JLabel previsaoCancer;
    private javax.swing.JLabel previsaoCapricornio;
    private javax.swing.JLabel previsaoEscorpiao;
    private javax.swing.JLabel previsaoGemeos;
    private javax.swing.JLabel previsaoLeao;
    private javax.swing.JLabel previsaoLibras;
    private javax.swing.JLabel previsaoPeixes;
    private javax.swing.JLabel previsaoSagitario;
    private javax.swing.JLabel previsaoTouro;
    private javax.swing.JLabel previsaoVirgem;
    private javax.swing.JLabel resultadoCompatibilidade;
    private javax.swing.JPanel sagitario;
    private javax.swing.JLabel saudeAquario;
    private javax.swing.JLabel saudeAries;
    private javax.swing.JLabel saudeCancer;
    private javax.swing.JLabel saudeCapricornio;
    private javax.swing.JLabel saudeEscorpiao;
    private javax.swing.JLabel saudeGemeos;
    private javax.swing.JLabel saudeLeao;
    private javax.swing.JLabel saudeLibras;
    private javax.swing.JLabel saudePeixes;
    private javax.swing.JLabel saudeSagitario;
    private javax.swing.JLabel saudeTouro;
    private javax.swing.JLabel saudeVirgem;
    private javax.swing.JLabel signo;
    private javax.swing.JLabel signo1;
    private javax.swing.JLabel signo2;
    private javax.swing.JLabel sorteAquario;
    private javax.swing.JLabel sorteAries;
    private javax.swing.JLabel sorteCancer;
    private javax.swing.JLabel sorteCapricornio;
    private javax.swing.JLabel sorteEscorpiao;
    private javax.swing.JLabel sorteGemeos;
    private javax.swing.JLabel sorteLeao;
    private javax.swing.JLabel sorteLibras;
    private javax.swing.JLabel sortePeixes;
    private javax.swing.JLabel sorteSagitario;
    private javax.swing.JLabel sorteTouro;
    private javax.swing.JLabel sorteVirgem;
    private javax.swing.JTextField tfAmorAquario;
    private javax.swing.JTextField tfAmorAries;
    private javax.swing.JTextField tfAmorCancer;
    private javax.swing.JTextField tfAmorCapricornio;
    private javax.swing.JTextField tfAmorEscorpiao;
    private javax.swing.JTextField tfAmorGemeos;
    private javax.swing.JTextField tfAmorLeao;
    private javax.swing.JTextField tfAmorLibras;
    private javax.swing.JTextField tfAmorPeixes;
    private javax.swing.JTextField tfAmorSagitario;
    private javax.swing.JTextField tfAmorTouro;
    private javax.swing.JTextField tfAmorVirgem;
    private javax.swing.JTextField tfCompatibilidade;
    private javax.swing.JTextField tfCorAquario;
    private javax.swing.JTextField tfCorAries;
    private javax.swing.JTextField tfCorCancer;
    private javax.swing.JTextField tfCorCancer1;
    private javax.swing.JTextField tfCorCapricornio;
    private javax.swing.JTextField tfCorEscorpiao;
    private javax.swing.JTextField tfCorGemeos;
    private javax.swing.JTextField tfCorLibras;
    private javax.swing.JTextField tfCorPeixes;
    private javax.swing.JTextField tfCorSagitario;
    private javax.swing.JTextField tfCorTouro;
    private javax.swing.JTextField tfCorVirgem;
    private javax.swing.JTextField tfElementoAquario;
    private javax.swing.JTextField tfElementoAries;
    private javax.swing.JTextField tfElementoCancer;
    private javax.swing.JTextField tfElementoCancer1;
    private javax.swing.JTextField tfElementoCapricornio;
    private javax.swing.JTextField tfElementoEscorpiao;
    private javax.swing.JTextField tfElementoGemeos;
    private javax.swing.JTextField tfElementoLibras;
    private javax.swing.JTextField tfElementoPeixes;
    private javax.swing.JTextField tfElementoSagitario;
    private javax.swing.JTextField tfElementoTouro;
    private javax.swing.JTextField tfElementoVirgem;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumeroAquario;
    private javax.swing.JTextField tfNumeroAries;
    private javax.swing.JTextField tfNumeroCancer;
    private javax.swing.JTextField tfNumeroCancer1;
    private javax.swing.JTextField tfNumeroCapricornio;
    private javax.swing.JTextField tfNumeroEscorpiao;
    private javax.swing.JTextField tfNumeroGemeos;
    private javax.swing.JTextField tfNumeroLibras;
    private javax.swing.JTextField tfNumeroPeixes;
    private javax.swing.JTextField tfNumeroSagitario;
    private javax.swing.JTextField tfNumeroTouro;
    private javax.swing.JTextField tfNumeroVirgem;
    private javax.swing.JTextField tfPeriodoAquario;
    private javax.swing.JTextField tfPeriodoAries;
    private javax.swing.JTextField tfPeriodoCancer;
    private javax.swing.JTextField tfPeriodoCancer1;
    private javax.swing.JTextField tfPeriodoCapricornio;
    private javax.swing.JTextField tfPeriodoEscorpiao;
    private javax.swing.JTextField tfPeriodoGemeos;
    private javax.swing.JTextField tfPeriodoLibras;
    private javax.swing.JTextField tfPeriodoPeixes;
    private javax.swing.JTextField tfPeriodoSagitario;
    private javax.swing.JTextField tfPeriodoTouro;
    private javax.swing.JTextField tfPeriodoVirgem;
    private javax.swing.JTextField tfPlanetaAquario;
    private javax.swing.JTextField tfPlanetaAries;
    private javax.swing.JTextField tfPlanetaCancer;
    private javax.swing.JTextField tfPlanetaCancer1;
    private javax.swing.JTextField tfPlanetaCapricornio;
    private javax.swing.JTextField tfPlanetaEscorpiao;
    private javax.swing.JTextField tfPlanetaGemeos;
    private javax.swing.JTextField tfPlanetaLibras;
    private javax.swing.JTextField tfPlanetaPeixes;
    private javax.swing.JTextField tfPlanetaSagitario;
    private javax.swing.JTextField tfPlanetaTouro;
    private javax.swing.JTextField tfPlanetaVirgem;
    private javax.swing.JTextField tfSaudeAquario;
    private javax.swing.JTextField tfSaudeAries;
    private javax.swing.JTextField tfSaudeCancer;
    private javax.swing.JTextField tfSaudeCapricornio;
    private javax.swing.JTextField tfSaudeEscorpiao;
    private javax.swing.JTextField tfSaudeGemeos;
    private javax.swing.JTextField tfSaudeLeao;
    private javax.swing.JTextField tfSaudeLibras;
    private javax.swing.JTextField tfSaudePeixes;
    private javax.swing.JTextField tfSaudeSagitario;
    private javax.swing.JTextField tfSaudeTouro;
    private javax.swing.JTextField tfSaudeVirgem;
    private javax.swing.JTextField tfSorteAquario;
    private javax.swing.JTextField tfSorteAries;
    private javax.swing.JTextField tfSorteCancer;
    private javax.swing.JTextField tfSorteCapricornio;
    private javax.swing.JTextField tfSorteEscorpiao;
    private javax.swing.JTextField tfSorteGemeos;
    private javax.swing.JTextField tfSorteLeao;
    private javax.swing.JTextField tfSorteLibras;
    private javax.swing.JTextField tfSortePeixes;
    private javax.swing.JTextField tfSorteSagitario;
    private javax.swing.JTextField tfSorteTouro;
    private javax.swing.JTextField tfSorteVirgem;
    private javax.swing.JTextField tfTrabalhoAquario;
    private javax.swing.JTextField tfTrabalhoAries;
    private javax.swing.JTextField tfTrabalhoCancer;
    private javax.swing.JTextField tfTrabalhoCapricornio;
    private javax.swing.JTextField tfTrabalhoEscorpiao;
    private javax.swing.JTextField tfTrabalhoGemeos;
    private javax.swing.JTextField tfTrabalhoLeao;
    private javax.swing.JTextField tfTrabalhoLibras;
    private javax.swing.JTextField tfTrabalhoPeixes;
    private javax.swing.JTextField tfTrabalhoSagitario;
    private javax.swing.JTextField tfTrabalhoTouro;
    private javax.swing.JTextField tfTrabalhoVirgem;
    private javax.swing.JLabel tituloAquario;
    private javax.swing.JLabel tituloAries;
    private javax.swing.JLabel tituloCancer;
    private javax.swing.JLabel tituloCapriconio;
    private javax.swing.JLabel tituloCaracteristicasAquario;
    private javax.swing.JLabel tituloCaracteristicasAries;
    private javax.swing.JLabel tituloCaracteristicasCancer;
    private javax.swing.JLabel tituloCaracteristicasCapricornio;
    private javax.swing.JLabel tituloCaracteristicasEscorpiao;
    private javax.swing.JLabel tituloCaracteristicasGemeos;
    private javax.swing.JLabel tituloCaracteristicasLeao;
    private javax.swing.JLabel tituloCaracteristicasLibras;
    private javax.swing.JLabel tituloCaracteristicasPeixes;
    private javax.swing.JLabel tituloCaracteristicasSagitario;
    private javax.swing.JLabel tituloCaracteristicasTouro;
    private javax.swing.JLabel tituloCaracteristicasVirgem;
    private javax.swing.JLabel tituloCompatibilidade;
    private javax.swing.JLabel tituloDescobrirSigno;
    private javax.swing.JLabel tituloEnergiaAquario;
    private javax.swing.JLabel tituloEnergiaAries;
    private javax.swing.JLabel tituloEnergiaCancer;
    private javax.swing.JLabel tituloEnergiaCapricornio;
    private javax.swing.JLabel tituloEnergiaEscorpiao;
    private javax.swing.JLabel tituloEnergiaGemeos;
    private javax.swing.JLabel tituloEnergiaLeao;
    private javax.swing.JLabel tituloEnergiaLibras;
    private javax.swing.JLabel tituloEnergiaPeixes;
    private javax.swing.JLabel tituloEnergiaSagitario;
    private javax.swing.JLabel tituloEnergiaTouro;
    private javax.swing.JLabel tituloEnergiaVirgem;
    private javax.swing.JLabel tituloEscorpiao;
    private javax.swing.JLabel tituloGemeos;
    private javax.swing.JLabel tituloLeao;
    private javax.swing.JLabel tituloLibras;
    private javax.swing.JLabel tituloMensagemAquario;
    private javax.swing.JLabel tituloMensagemAries;
    private javax.swing.JLabel tituloMensagemCancer;
    private javax.swing.JLabel tituloMensagemCapricornio;
    private javax.swing.JLabel tituloMensagemEscorpiao;
    private javax.swing.JLabel tituloMensagemGemeos;
    private javax.swing.JLabel tituloMensagemLeao;
    private javax.swing.JLabel tituloMensagemLibras;
    private javax.swing.JLabel tituloMensagemPeixes;
    private javax.swing.JLabel tituloMensagemSagitario;
    private javax.swing.JLabel tituloMensagemTouro;
    private javax.swing.JLabel tituloMensagemVirgem;
    private javax.swing.JLabel tituloPeixes;
    private javax.swing.JLabel tituloSagitario;
    private javax.swing.JLabel tituloTouro;
    private javax.swing.JLabel tituloVirgem;
    private javax.swing.JPanel touro;
    private javax.swing.JLabel trabalhoAquario;
    private javax.swing.JLabel trabalhoAries;
    private javax.swing.JLabel trabalhoCancer;
    private javax.swing.JLabel trabalhoCapricornio;
    private javax.swing.JLabel trabalhoEscorpiao;
    private javax.swing.JLabel trabalhoGemeos;
    private javax.swing.JLabel trabalhoLeao;
    private javax.swing.JLabel trabalhoLibras;
    private javax.swing.JLabel trabalhoPeixes;
    private javax.swing.JLabel trabalhoSagitario;
    private javax.swing.JLabel trabalhoTouro;
    private javax.swing.JLabel trabalhoVirgem;
    private javax.swing.JTextArea txFortesAquario;
    private javax.swing.JTextArea txFortesAries;
    private javax.swing.JTextArea txFortesCancer;
    private javax.swing.JTextArea txFortesCapricornio;
    private javax.swing.JTextArea txFortesEscorpiao;
    private javax.swing.JTextArea txFortesGemeos;
    private javax.swing.JTextArea txFortesLeao;
    private javax.swing.JTextArea txFortesLibras;
    private javax.swing.JTextArea txFortesPeixes;
    private javax.swing.JTextArea txFortesSagitario;
    private javax.swing.JTextArea txFortesTouro;
    private javax.swing.JTextArea txFortesVirgem;
    private javax.swing.JTextArea txMelhorarAquario;
    private javax.swing.JTextArea txMelhorarAries;
    private javax.swing.JTextArea txMelhorarCancer;
    private javax.swing.JTextArea txMelhorarCapricornio;
    private javax.swing.JTextArea txMelhorarEscorpiao;
    private javax.swing.JTextArea txMelhorarGemeos;
    private javax.swing.JTextArea txMelhorarLeao;
    private javax.swing.JTextArea txMelhorarLibras;
    private javax.swing.JTextArea txMelhorarPeixes;
    private javax.swing.JTextArea txMelhorarSagitario;
    private javax.swing.JTextArea txMelhorarTouro;
    private javax.swing.JTextArea txMelhorarVirgem;
    private javax.swing.JTextArea txMensagemAquario;
    private javax.swing.JTextArea txMensagemAries;
    private javax.swing.JTextArea txMensagemCancer;
    private javax.swing.JTextArea txMensagemCapricornio;
    private javax.swing.JTextArea txMensagemEscorpiao;
    private javax.swing.JTextArea txMensagemGemeos;
    private javax.swing.JTextArea txMensagemLeao;
    private javax.swing.JTextArea txMensagemLibras;
    private javax.swing.JTextArea txMensagemPeixes;
    private javax.swing.JTextArea txMensagemSagitario;
    private javax.swing.JTextArea txMensagemTouro;
    private javax.swing.JTextArea txMensagemVirgem;
    private javax.swing.JTextArea txtPrevisaoAquario;
    private javax.swing.JTextArea txtPrevisaoAries;
    private javax.swing.JTextArea txtPrevisaoCancer;
    private javax.swing.JTextArea txtPrevisaoCapricornio;
    private javax.swing.JTextArea txtPrevisaoEscorpiao;
    private javax.swing.JTextArea txtPrevisaoGemeos;
    private javax.swing.JTextArea txtPrevisaoLeao;
    private javax.swing.JTextArea txtPrevisaoLibras;
    private javax.swing.JTextArea txtPrevisaoPeixes;
    private javax.swing.JTextArea txtPrevisaoSagitario;
    private javax.swing.JTextArea txtPrevisaoTouro;
    private javax.swing.JTextArea txtPrevisaoVirgem;
    private javax.swing.JPanel virgem;
    // End of variables declaration//GEN-END:variables
}
