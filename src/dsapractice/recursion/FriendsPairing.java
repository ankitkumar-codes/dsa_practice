package dsapractice.recursion;

public class FriendsPairing {
    private static int friendsPairing(int n) {
        if (n == 2 || n == 1) {
            return n;
        }

        return friendsPairing(n-1) + friendsPairing(n-2) * (n-1);
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(5));
    }
}
