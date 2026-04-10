public class Pair<K, V> {
    
    private K key;
    private V value;

    
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    
    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    
    @Override
    public String toString() {
        return "[" + key + " : " + value + "]";
    }

    
    public static void main(String[] args) {
        
        
        Pair<String, Double> modelAccuracy = new Pair<>("YOLOv8", 92.5);
        
        
        Pair<String, Integer> fpgaLogic = new Pair<>("Cyclone V", 110000);

        
        System.out.println("Initial Model Data: " + modelAccuracy.toString());
        System.out.println("Initial Hardware Data: " + fpgaLogic.toString());

        System.out.println("\n-------------------\n");

        
        modelAccuracy.setValue(94.1);
        fpgaLogic.setKey("Stratix 10");
        fpgaLogic.setValue(5500000);

        System.out.println("Updated Model Data: " + modelAccuracy.getKey() + " -> " + modelAccuracy.getValue());
        System.out.println("Updated Hardware Data: " + fpgaLogic.getKey() + " -> " + fpgaLogic.getValue());

        
    }
}