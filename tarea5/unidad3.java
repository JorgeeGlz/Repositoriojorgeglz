public class Main {
    public static void main(String[] args) {

                String nacionalidad = "no es residente"; // o "residente"
                String tipoVisa = "trabajo";
                int aniosExperiencia = 4;

                if (nacionalidad.equals("no es residente")) {
                    if (tipoVisa.equals("trabajo") && aniosExperiencia >= 5) {
                        System.out.println("Elegible para un puesto calificado.");
                    } else if (tipoVisa.equals("trabajo") && aniosExperiencia < 5) {
                        System.out.println("Elegible para un puesto no calificado.");
                    } else {
                        System.out.println("Visa no válida o experiencia insuficiente.");
                    }
                } else if (nacionalidad.equals("residente")) {
                    System.out.println("Automáticamente elegible para cualquier puesto según experiencia.");
                }


                String pais = "USA";
                String codigoPostal = "91234";
                boolean comprasPrevias = false;

                if (pais.equals("USA")) {
                    if (codigoPostal.startsWith("9")) {
                        if (comprasPrevias) {
                            System.out.println("Pago por PayPal permitido.");
                        } else {
                            System.out.println("Se requiere verificación de crédito.");
                        }
                    } else {
                        System.out.println("Se requiere verificación de tarjeta de crédito.");
                    }
                } else if (pais.equals("Europa")) {
                    if (codigoPostal.length() == 5) {
                        if (comprasPrevias) {
                            System.out.println("Pago por transferencia bancaria permitido.");
                        } else {
                            System.out.println("Se requiere verificación bancaria.");
                        }
                    } else {
                        System.out.println("Código postal no válido.");
                    }
                } else {
                    System.out.println("Se requiere verificación manual.");
                }


                String preferenciaHabitacion = "suite"; // "estándar" o "suite"
                int personas = 2;
                int nochesEstancia = 4;

                if (personas == 1) {
                    if (preferenciaHabitacion.equals("suite")) {
                        System.out.println("Se verifica la disponibilidad de suites.");
                    }
                    if (nochesEstancia >= 3) {
                        System.out.println("Se ofrece un descuento del 10% por más de 3 noches.");
                    } else {
                        System.out.println("Se asigna una habitación estándar.");
                    }
                } else if (personas >= 2) {
                    if (preferenciaHabitacion.equals("suite")) {
                        System.out.println("Se verifica la disponibilidad de suites.");
                    } else {
                        System.out.println("Se asigna una habitación estándar.");
                    }
                    if (nochesEstancia >= 5) {
                        System.out.println("Se ofrece una habitación contigua adicional.");
                    }
                } else {
                    System.out.println("Número de personas no válido.");
                }
            }
        }
