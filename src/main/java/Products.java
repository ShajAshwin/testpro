
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class Products {
    public static void main(String[] args) {
        try {

            StreamSource ss = new StreamSource(new File("src\\main\\resources\\products.xml"));
            StreamResult sr = new StreamResult(new File("src\\main\\resources\\products.html"));

            TransformerFactory tff = TransformerFactory.newInstance();
            Transformer tf =tff.newTransformer(new StreamSource(new File("src\\main\\resources\\products.xslt")));


            tf.transform(ss,sr);
            System.out.println("*******Done******");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
