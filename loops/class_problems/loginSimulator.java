public class LoginSimulator {
    public static void simulateLogin(String correctCode, String[] attempts) {
        boolean accessGranted = false;
        for (int i = 0; i < attempts.length && i < 3; i++) {
            if (attempts[i].equals(correctCode)) {
                System.out.println("Access granted on attempt " + (i + 1));
                accessGranted = true;
                break;
            }
        }
        if (!accessGranted) {
            System.out.println("Access denied all attempts used");
        }
    }
}
