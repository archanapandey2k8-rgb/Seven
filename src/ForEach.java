class ForEach {
    public static void main(String[] args) {
        String[] arr  = new String[]{
                "Rohan","Mohan","Alen","Pk","Jyoti","Mahi"
        };
//        printArray(arr);
        printForEachArray(arr);
    }
//    public static void printArray(String[] array){
//        for (int i =0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
    public static void printForEachArray(String[] array){
        for (String name : array){
            System.out.println(name);
        }
    }
}
