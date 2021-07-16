//package fr.almamy.springboot.exception.exceptions;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
//
//import java.util.Properties;
//
//@Configuration
//public class MySimpleMappingExceptionResolver {
//    @Bean
//    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
//        var resolver = new SimpleMappingExceptionResolver();
//        var mapping = new Properties();
//        /// key=exception full name. value, view name
//        mapping.put("java.lang.ArithmeticException", "mathError");
//        mapping.put("java.lang.NullPointerException", "nullPointer");
//        resolver.setExceptionMappings(mapping);
//        return resolver;
//    }
//}
