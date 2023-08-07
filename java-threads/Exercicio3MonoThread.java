
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Exercicio3MonoThread {
    public static void main(String[] args) {
        String sourceFolderPath = "caminho_da_pasta_com_imagens"; // Substitua pelo caminho da pasta correta

        File sourceFolder = new File(sourceFolderPath);
        if (!sourceFolder.exists() || !sourceFolder.isDirectory()) {
            System.out.println("Caminho inválido ou pasta não encontrada.");
            return;
        }

        File outputFolder = new File(sourceFolderPath + File.separator + "imagens_pb");
        if (!outputFolder.exists()) {
            outputFolder.mkdir();
        }

        File[] imageFiles = sourceFolder.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpg") ||
                name.toLowerCase().endsWith(".png") ||
                name.toLowerCase().endsWith(".jpeg"));

        if (imageFiles == null || imageFiles.length == 0) {
            System.out.println("Nenhuma imagem encontrada na pasta.");
            return;
        }

        System.out.println("Iniciando conversão para PB (monothread)...");
        long startTime = System.currentTimeMillis();

        for (File imageFile : imageFiles) {
            try {
                BufferedImage originalImage = ImageIO.read(imageFile);
                BufferedImage convertedImage = convertToBlackAndWhite(originalImage);
                String outputFilePath = outputFolder.getPath() + File.separator + imageFile.getName();
                File outputFile = new File(outputFilePath);
                ImageIO.write(convertedImage, "jpg", outputFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Conversão concluída (monothread)!");
        System.out.println("Tempo total de execução (em milissegundos): " + (endTime - startTime));
    }

    private static BufferedImage convertToBlackAndWhite(BufferedImage originalImage) {
        BufferedImage convertedImage = new BufferedImage(originalImage.getWidth(),
                originalImage.getHeight(),
                BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < originalImage.getWidth(); x++) {
            for (int y = 0; y < originalImage.getHeight(); y++) {
                Color pixelColor = new Color(originalImage.getRGB(x, y));
                int blackAndWhiteNumber = (int) (pixelColor.getRed() * 0.3 +
                        pixelColor.getGreen() * 0.59 +
                        pixelColor.getBlue() * 0.11);
                Color grayscalePixel = new Color(blackAndWhiteNumber, blackAndWhiteNumber, blackAndWhiteNumber);
                convertedImage.setRGB(x, y, grayscalePixel.getRGB());
            }
        }

        return convertedImage;
    }
}
