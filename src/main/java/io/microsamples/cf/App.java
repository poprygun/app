package io.microsamples.cf;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.File;
import java.util.Calendar;


public class App {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            Message data = mapper.readValue(new File(args[0]), Message.class);
            System.out.println(ReflectionToStringBuilder.toString(data, ToStringStyle.MULTI_LINE_STYLE));

            Thread t = new Thread(() -> {
                while (true) {
                    System.out.println("always running program ==> " + Calendar.getInstance().getTime());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
            });
            t.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
