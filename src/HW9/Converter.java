package HW9;

public class Converter {

        private String name;

        public Converter(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int convertToInt(Object value) {
            if (value instanceof Byte) {
                return (int) (byte) value;
            } else if (value instanceof Short) {
                return (int) (short) value;
            } else if (value instanceof Integer) {
                return (int) value;
            } else if (value instanceof Long) {
                return (int) (long) value;
            } else if (value instanceof Character) {
                return (int) (char) value;
            } else if (value instanceof Float) {
                return (int) (float) value;
            } else if (value instanceof Double) {
                return (int) (double) value;
            } else if (value instanceof String) {
                try {
                    return Integer.parseInt((String) value);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input for int conversion");
                    return 0;
                }
            } else if (value instanceof Boolean) {
                System.out.println("Input is of type boolean");
                return 0;
            } else {
                System.out.println("Unsupported data type for int conversion");
                return 0;
            }
        }

        public double convertToDouble(Object value) {
            if (value instanceof Byte) {
                return (double) (byte) value;
            } else if (value instanceof Short) {
                return (double) (short) value;
            } else if (value instanceof Integer) {
                return (double) (int) value;
            } else if (value instanceof Long) {
                return (double) (long) value;
            } else if (value instanceof Character) {
                return (double) (char) value;
            } else if (value instanceof Float) {
                return (double) (float) value;
            } else if (value instanceof Double) {
                return (double) value;
            } else if (value instanceof String) {
                try {
                    return Double.parseDouble((String) value);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input for double conversion");
                    return 0.0;
                }
            } else if (value instanceof Boolean) {
                System.out.println("Input is of type boolean");
                return 0.0;
            } else {
                System.out.println("Unsupported data type for double conversion");
                return 0.0;
            }
        }

        public String convertToString(Object value) {
            if (value instanceof Byte || value instanceof Short || value instanceof Integer
                    || value instanceof Long || value instanceof Character
                    || value instanceof Boolean || value instanceof Float
                    || value instanceof Double || value instanceof String) {
                return String.valueOf(value);
            } else {
                System.out.println("Unsupported data type for string conversion");
                return "";
            }
        }

        public static void main(String[] args) {
            Converter converter = new Converter("MyConverter");

            int intValue = converter.convertToInt(42);
            double doubleValue = converter.convertToDouble(3.14);
            String stringValue = converter.convertToString(true);

            System.out.println("Int value: " + intValue);
            System.out.println("Double value: " + doubleValue);
            System.out.println("String value: " + stringValue);

            converter.getName(); // To get the name of the converter
        }
    }