import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

import javax.xml.transform.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, TransformerException {


        String path = "D:\\pdf\\demo.pdf";
        String html = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><table cellpadding=\"2\" cellspacing=\"2\" border=\"1\"><tr><th>Id</th><th>Name</th><th>Price</th></tr><tr><td>p01</td><td>Product 1</td><td>100</td></tr><tr><td>p02</td><td>Product 2</td><td>200</td></tr><tr><td>p03</td><td>Product 3</td><td>300</td></tr></table>";

        ConverterProperties properties = new ConverterProperties();
        properties.setBaseUri(path);

        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);
        HtmlConverter.convertToPdf(html,pdfDocument,properties);

    }
}
