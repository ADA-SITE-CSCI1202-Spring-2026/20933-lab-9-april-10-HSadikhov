
public class GenericNumeric<T extends Number> {
    
    private T num;

    
    public GenericNumeric(T num) {
        this.num = num;
    }

    
    public double getReciprocal() {
        
        return 1.0 / num.doubleValue();
    }

   
    public double getFractionalPart() {
        return num.doubleValue() - num.intValue();
    }

    
    public boolean absEqual(GenericNumeric<?> otherObj) {
        return Math.abs(this.num.doubleValue()) == Math.abs(otherObj.num.doubleValue());
    }

    public static void main(String[] args) {
        
        
        GenericNumeric<Double> dNum = new GenericNumeric<>(7.65);
        System.out.println("Value: 7.65");
        System.out.println("Reciprocal: " + dNum.getReciprocal());
        System.out.println("Fractional Part: " + dNum.getFractionalPart());
        
        System.out.println("\n-------------------\n");

        
        GenericNumeric<Double> num1 = new GenericNumeric<>(-12.5);
        GenericNumeric<Float> num2 = new GenericNumeric<>(12.5f);
        GenericNumeric<Integer> num3 = new GenericNumeric<>(7);

        System.out.println("num1 (-12.5 Double) & num2 (12.5 Float) absolute equality: " 
                            + num1.absEqual(num2)); 
                            
        System.out.println("num1 (-12.5 Double) & num3 (7 Integer) absolute equality: " 
                            + num1.absEqual(num3)); 
    }
}