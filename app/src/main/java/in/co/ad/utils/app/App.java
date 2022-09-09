/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package in.co.ad.utils.app;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import in.co.ad.utils.app.dto.ServiceResponse;

public class App {
    public static void main(String[] args) {
        XmlMapper mapper = new XmlMapper();

        try {
            File tempDirectory = new File("C:\\Users\\ACDA-Term01\\temp\\");
            ServiceResponse x = mapper.readValue(new File(tempDirectory.getAbsolutePath(), "input.xml"),
                    ServiceResponse.class);

            Field[] fields = x.getClass().getDeclaredFields();
            Map<Field, Object> firstMap = new HashMap<>();
            Arrays.asList(fields).forEach(field -> {
                firstMap.put(field, x);
            });
            Map<Field, Object> secondMap = new HashMap<>();

            Object result = null;
            Class<?> fieldType = null;
            Field newField = null;
            boolean firstSetFieldFound = false;
            boolean secondSetFieldFound = false;
            do {
                for (Entry<Field, Object> fieldEntry : firstMap.entrySet()) {
                    newField = fieldEntry.getKey();
                    newField.setAccessible(true);

                    if (newField.getName().equalsIgnoreCase("imgDocURI")) {
                        result = newField.get(fieldEntry.getValue());
                        System.out.println((String) result);
                        firstSetFieldFound = true;
                    } else {
                        fieldType = newField.getType();
                        if (!fieldType.isPrimitive() && !fieldType.getPackageName().equalsIgnoreCase("java.lang")) {

                            if (fieldType.isArray()) {
                                Object[] divs = (Object[]) newField.get(fieldEntry.getValue());
                                Arrays.asList(divs).stream().forEach(div -> {
                                    Field[] divFields = div.getClass().getDeclaredFields();
                                    Arrays.asList(divFields).forEach(field -> {
                                        secondMap.put(field, div);
                                    });
                                });
                            } else {
                                Object temp = newField.get(fieldEntry.getValue());
                                Arrays.asList(fieldType.getDeclaredFields()).forEach(field -> {
                                    secondMap.put(field, temp);
                                });
                            }

                        }
                    }
                }

                firstMap.clear();
                fieldType = null;
                newField = null;

                for (Entry<Field, Object> fieldEntry : secondMap.entrySet()) {
                    newField = fieldEntry.getKey();
                    newField.setAccessible(true);

                    if (newField.getName().equalsIgnoreCase("imgDocURI")) {
                        result = newField.get(fieldEntry.getValue());
                        System.out.println((String) result);
                        secondSetFieldFound = true;
                    } else {
                        fieldType = newField.getType();
                        if (!fieldType.isPrimitive() && !fieldType.getPackageName().equalsIgnoreCase("java.lang")) {

                            if (fieldType.isArray()) {
                                Object[] divs = (Object[]) newField.get(fieldEntry.getValue());
                                Arrays.asList(divs).stream().forEach(div -> {
                                    Field[] divFields = div.getClass().getDeclaredFields();
                                    Arrays.asList(divFields).forEach(field -> {
                                        firstMap.put(field, div);
                                    });
                                });
                            } else {
                                Object temp = newField.get(fieldEntry.getValue());
                                Arrays.asList(fieldType.getDeclaredFields()).forEach(field -> {
                                    firstMap.put(field, temp);
                                });
                            }

                        }
                    }
                }
                secondMap.clear();

            } while (!firstSetFieldFound && !secondSetFieldFound);

        } catch (IOException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
