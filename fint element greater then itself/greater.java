//ques- given an array count number of elements having at least one element greater than itself.

class greater {
    public static void main(String[] args) {
        System.out.println("enter array size:");
        int n = Integer.parseInt(System.console().readLine());
        int[] arr = new int[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(System.console().readLine());
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                count++;
            }
        }
        System.out.println(count);
    }
}
