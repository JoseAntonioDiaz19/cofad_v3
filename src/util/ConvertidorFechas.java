package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertidorFechas {
    
    public static Date ParseFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }
    
    public static String capturarFecha(Date fecha){
        String formato = "yyyy-MM-dd";
        Date fechaInicio = fecha;
        SimpleDateFormat sdf  = new SimpleDateFormat(formato);
        return sdf.format(fechaInicio);
    }   
}