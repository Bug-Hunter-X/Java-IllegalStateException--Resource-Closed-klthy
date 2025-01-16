public class UncommonErrorExampleSolution {

    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            // Using try-with-resources ensures automatic resource closure.
            resource.performOperation();
        } catch (IllegalStateException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    static class Resource implements AutoCloseable {
        private boolean isOpen = true;

        public void performOperation() {
            if (!isOpen) {
                throw new IllegalStateException("Resource is closed");
            }
            System.out.println("Performing operation...");
        }

        @Override
        public void close() throws Exception {
            isOpen = false;
            System.out.println("Resource closed.");
        }
    }
} 