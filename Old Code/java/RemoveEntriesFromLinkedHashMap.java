import java.util.LinkedHashMap;

public class RemoveEntriesFromLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> husbandWifeMapping = new LinkedHashMap<>();

        husbandWifeMapping.put("Rajeev", "Jennifer");
        husbandWifeMapping.put("John", "Maria");
        husbandWifeMapping.put("Chris", "Lisa");
        husbandWifeMapping.put("Steve", "Susan");
        System.out.println("husbandWifeMapping : " + husbandWifeMapping);
        String wife = husbandWifeMapping.remove("John");
        System.out.println("Removed John and his wife " + wife + " from the mapping. New husbandWifeMapping : " + husbandWifeMapping);
        boolean isRemoved = husbandWifeMapping.remove("John", "Susan");
        System.out.println("Did John get removed from the mapping? : " + isRemoved);
    }
}
