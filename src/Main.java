public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(, String.class);
    }
}