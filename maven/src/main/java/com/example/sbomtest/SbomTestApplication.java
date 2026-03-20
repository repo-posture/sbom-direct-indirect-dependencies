package com.example.sbomtest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.yaml.snakeyaml.Yaml;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.joda.time.DateTime;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class SbomTestApplication {

    public static void main(String[] args) {
        System.out.println("SBOM Test Java Application - Maven Project");
        System.out.println("============================================");
        
        demonstrateApacheCommons();
        demonstrateYaml();
        demonstrateDateTime();
        demonstrateXml();
        
        System.out.println("\nAll dependency demonstrations completed successfully!");
    }
    
    private static void demonstrateApacheCommons() {
        System.out.println("\n1. Apache Commons Libraries:");
        
        String text = "hello world";
        String encoded = Base64.encodeBase64String(text.getBytes());
        System.out.println("   - Base64 encoded: " + encoded);
        
        String html = "<script>alert('test')</script>";
        String escaped = StringEscapeUtils.escapeHtml4(html);
        System.out.println("   - HTML escaped: " + escaped);
        
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("b", "c", "d");
        System.out.println("   - Collection intersection: " + CollectionUtils.intersection(list1, list2));
    }
    
    private static void demonstrateYaml() {
        System.out.println("\n2. YAML Processing:");
        Yaml yaml = new Yaml();
        Map<String, Object> data = new HashMap<>();
        data.put("name", "SBOM Test");
        data.put("version", "1.0.0");
        data.put("dependencies", Arrays.asList("commons-io", "snakeyaml", "dom4j"));
        String yamlString = yaml.dump(data);
        System.out.println("   - YAML output: " + yamlString.replace("\n", " "));
    }
    
    private static void demonstrateDateTime() {
        System.out.println("\n3. Joda Time:");
        DateTime now = DateTime.now();
        System.out.println("   - Current time: " + now.toString());
        System.out.println("   - Plus 7 days: " + now.plusDays(7).toString());
    }
    
    private static void demonstrateXml() {
        System.out.println("\n4. XML Processing (Dom4j):");
        try {
            Document document = DocumentHelper.createDocument();
            document.addElement("root")
                   .addElement("dependency")
                   .addAttribute("name", "dom4j")
                   .addText("XML Processing Library");
            System.out.println("   - XML created: " + document.asXML().replace("\n", " "));
        } catch (Exception e) {
            System.out.println("   - XML processing: " + e.getMessage());
        }
    }
}
