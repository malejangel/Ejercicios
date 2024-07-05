public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double numeroDou = Double.parseDouble(realStr);
        System.out.println("numeroDou = " + numeroDou);

        String logicoStr = "false";
        Boolean numeroBu = Boolean.parseBoolean(logicoStr);
        System.out.println("numeroBu = " + numeroBu);
    }
}
