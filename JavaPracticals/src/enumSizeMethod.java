enum SizeMethod {
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public String getSize() {
        return switch (this) {
            case SMALL -> "SMALL";
            case MEDIUM -> "MEDIUM";
            case LARGE -> "LARGE";
            case EXTRALARGE -> "EXTRALARGE";
        };
    }
    public static void main(String []args){
            System.out.println("The size of the pizza is "+SizeMethod.LARGE.getSize());
    }
}
