public class UncommonErrorExample {

    public static void main(String[] args) {
        try {
            // Simulate an uncommon error scenario where a resource is accessed
            // after it has already been closed.
            Resource resource = new Resource();
            resource.performOperation();
            resource.close();
            resource.performOperation(); // This will cause an error after closure
        } catch (IllegalStateException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    static class Resource {
        private boolean isOpen = true;

        public void performOperation() {
            if (!isOpen) {
                throw new IllegalStateException("Resource is closed");
            }
            System.out.println("Performing operation...");
        }

        public void close() {
            isOpen = false;
            System.out.println("Resource closed.");
        }
    }
}