package app;
import java.awt.*;
import java.awt.image.BufferedImage;

public class OpPontuais {
    public static BufferedImage pintarRed(BufferedImage imagem){
        int h = imagem.getHeight();
        int w = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(w,h, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int rgb = imagem.getRGB(j, i);

                Color cor = new Color(rgb);
                int red = cor.getRed();
                novaImagem.setRGB(j, i, new Color(red,0,0).getRGB());
            }
        }
        return novaImagem;
    }

    public static BufferedImage pintarBlue(BufferedImage imagem){
        //pegar as infos da imagem passada
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                int rgb = imagem.getRGB(j, i);

                Color cor = new Color(rgb);
                int blue = cor.getRed();
                novaImagem.setRGB(j, i, new Color(0,0,blue).getRGB());
            }
        }

        return novaImagem;
    }

    public static BufferedImage pintarGreen(BufferedImage imagem){
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                int rgb = imagem.getRGB(j, i);

                Color cor = new Color(rgb);
                int green = cor.getGreen();
                novaImagem.setRGB(j, i, new Color(0,green,0).getRGB());
            }
        }
        return novaImagem;
    }

    public static BufferedImage negativa(BufferedImage imagem){
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                int rgb = imagem.getRGB(j, i);

                int red = 255 - new Color(rgb).getRed();
                int green = 255- new Color(rgb).getGreen();
                int blue = 255- new Color(rgb).getBlue();

                novaImagem.setRGB(j, i, new Color(red,green, blue).getRGB());
            }
        }
        return novaImagem;
    }

    //aula 18/03----------------------->
    public static BufferedImage cinzaRed(BufferedImage imagem){
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                int rgb = imagem.getRGB(j, i);

                int red = new Color(rgb).getRed();
                novaImagem.setRGB(j, i, new Color(red, red, red).getRGB());
            }
        }
        return novaImagem;
    }

    public static BufferedImage cinzaGreen(BufferedImage imagem){
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                int rgb = imagem.getRGB(j, i);

                int green = new Color(rgb).getGreen();
                novaImagem.setRGB(j, i, new Color(green, green, green).getRGB());
            }
        }
        return novaImagem;
    }

    public static BufferedImage cinzaBlue(BufferedImage imagem){
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                int rgb = imagem.getRGB(j, i);

                int blue = new Color(rgb).getBlue();
                novaImagem.setRGB(j, i, new Color(blue, blue, blue).getRGB());
            }
        }
        return novaImagem;
    }

    public static BufferedImage cinzaMedia(BufferedImage imagem){
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                int rgb = imagem.getRGB(j, i);

                int red = new Color(rgb).getRed();
                int green = new Color(rgb).getGreen();
                int blue = new Color(rgb).getBlue();

                int media = (red+green+blue)/3;
                novaImagem.setRGB(j, i, new Color(media, media, media).getRGB());
            }
        }
        return novaImagem;
    }

    public static BufferedImage binarizacao(BufferedImage imagem, int limiar){
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                int rgb = imagem.getRGB(j, i);

                int red = new Color(rgb).getRed();
                int green = new Color(rgb).getGreen();
                int blue = new Color(rgb).getBlue();

                int media = (red+green+blue)/3;
                int valor = media>=limiar ? 255 : 0;

                novaImagem.setRGB(j, i, new Color(valor, valor, valor).getRGB());
            }
        }
        return novaImagem;
    }

    public static BufferedImage aumentaTonalidade(BufferedImage imagem, int aumento, String cor){
        if(!cor.equalsIgnoreCase("red")
                &&!cor.equalsIgnoreCase("green")
                &&!cor.equalsIgnoreCase("blue")){
            throw new IllegalThreadStateException("banda invalida");
        }

        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                int rgb = imagem.getRGB(j, i);

                int red = new Color(rgb).getRed();
                int green = new Color(rgb).getGreen();
                int blue = new Color(rgb).getBlue();

                int valor = 0;
                switch (cor){
                    case "red":
                        valor = tratarLimitesRGB(red, aumento);
                        novaImagem.setRGB(j, i, new Color(valor, green, blue).getRGB());
                        break;

                    case "green":
                        valor = tratarLimitesRGB(green, aumento);
                        novaImagem.setRGB(j, i, new Color(valor, aumento+green, blue).getRGB());
                        break;

                    case "blue":
                        valor = tratarLimitesRGB(blue, aumento);
                        novaImagem.setRGB(j, i, new Color(valor, green,   aumento+blue).getRGB());
                        break;
                }

            }
        }
        return novaImagem;
    }

    private static int tratarLimitesRGB(int valor, int acrescimo){
        valor+=acrescimo;
        if(valor>255) valor = 255;
        else if(valor<0)valor = 0;
        return valor;
    }

    private static int tratarLimitesRGB(int valor, float acrescimo){
        float resultado = valor*acrescimo;
        if(resultado>255) resultado = 255;
        else if(resultado<0)resultado = 0;
        return (int) resultado;
    }

    public static int tratarLimitesRGB(int valor) {
        if (valor < 0) return 0;
        if (valor > 255) return 255;
        return valor;
    }
    public static BufferedImage brilhoAditivoRGB(BufferedImage imagem, int valor){

        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                int rgb = imagem.getRGB(j, i);

                int red = new Color(rgb).getRed();
                int green = new Color(rgb).getGreen();
                int blue = new Color(rgb).getBlue();

                novaImagem.setRGB(j, i, new Color(tratarLimitesRGB(red, valor), tratarLimitesRGB(green, valor), tratarLimitesRGB(blue, valor)).getRGB());
            }
        }

        return novaImagem;
    }

    public static BufferedImage brilhoMultiplicativoRGB(BufferedImage imagem, float valor){
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                int rgb = imagem.getRGB(j, i);

                int red = new Color(rgb).getRed();
                int green = new Color(rgb).getGreen();
                int blue = new Color(rgb).getBlue();

                novaImagem.setRGB(j, i, new Color(tratarLimitesRGB(red, valor), tratarLimitesRGB(green, valor), tratarLimitesRGB(blue, valor)).getRGB());
            }
        }

        return novaImagem;
    }

    public static BufferedImage brilhoAditivoY(BufferedImage imagem, int valorAumento) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                int rgb = imagem.getRGB(j, i);
                Color cor = new Color(rgb);

                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                float Y = ((0.299f * red) + (0.587f * green) + (0.114f * blue));
                float I = ((0.596f * red) + (-0.257f * green) + (-0.321f * blue));
                float Q = ((0.212f * red) + (-0.523f * green) + (0.311f * blue));

                Y += valorAumento;

                int novoRed = tratarLimitesRGB((int) (Y + 0.956f*I + 0.621f*Q));
                int novoGreen = tratarLimitesRGB((int) (Y - 0.2721f*I - 0.647f*Q));
                int novoBlue = tratarLimitesRGB((int) (Y - 1.106f*I + 1.703f*Q));

                int novaCor = new Color(novoRed, novoGreen, novoBlue).getRGB();
                novaImagem.setRGB(j, i, novaCor);
            }
        }

        return novaImagem;
    }

    public static BufferedImage brilhoMultiplicativoY(BufferedImage imagem, float valorAumento) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                int rgb = imagem.getRGB(j, i);
                Color cor = new Color(rgb);

                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                float Y = ((0.299f * red) + (0.587f * green) + (0.114f * blue));
                float I = ((0.596f * red) + (-0.257f * green) + (-0.321f * blue));
                float Q = ((0.212f * red) + (-0.523f * green) + (0.311f * blue));

                Y *= valorAumento;

                int novoRed = tratarLimitesRGB((int) (Y + 0.956f*I + 0.621f*Q));
                int novoGreen = tratarLimitesRGB((int) (Y - 0.2721f*I - 0.647f*Q));
                int novoBlue = tratarLimitesRGB((int) (Y - 1.106f*I + 1.703f*Q));

                int novaCor = new Color(novoRed, novoGreen, novoBlue).getRGB();
                novaImagem.setRGB(j, i, novaCor);
            }
        }

        return novaImagem;
    }

}
