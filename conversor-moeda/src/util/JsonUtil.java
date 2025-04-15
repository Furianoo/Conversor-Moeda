package util;

import com.google.gson.Gson;

public class JsonUtil {

    // Converte um objeto para uma string JSON
    public static String toJson(Object objeto) {
        Gson gson = new Gson();
        return gson.toJson(objeto);
    }

    // Converte uma string JSON de volta para o objeto especificado
    public static <T> T fromJson(String json, Class<T> classe) {
        Gson gson = new Gson();
        return gson.fromJson(json, classe);
    }
}
