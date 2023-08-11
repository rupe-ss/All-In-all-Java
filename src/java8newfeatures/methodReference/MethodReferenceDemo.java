package java8newfeatures.methodReference;

interface PrinterString{
    String parse(String str);
}

final class PrinterStringImpl {
    static void printLog(String str, PrinterString p){
        System.out.println(p.parse(str));
    }
}

class ConvertString{
    static String convert(String str){
        if(str.length() > 3) return str.toUpperCase();
        else return str.toLowerCase();
    }
}

public class MethodReferenceDemo {
    public static void main(String[] args) {
        PrinterStringImpl.printLog("Apple", ConvertString::convert);
    }
}
