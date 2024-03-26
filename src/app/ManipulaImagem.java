package app;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ManipulaImagem {
    public static BufferedImage carregarImagem(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void exibirImagens(BufferedImage ...imagens) {
        JFrame painel = new JFrame("exibição de imagem");

        for(BufferedImage imgs : imagens){
            painel.getContentPane().add(new JLabel(new ImageIcon(imgs)));
        }

        painel.getContentPane().setLayout(new FlowLayout());
        painel.pack();

        painel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setVisible(true);
    }
    private static void salvarImagem(BufferedImage imagem) {
        try {
            ImageIO.write(imagem, "jpg", new File("bluepen_resultado.jpg"));
        } catch (IOException e) {
            System.out.println("Erro caralho");
            throw new RuntimeException(e);
        }
    }
}
