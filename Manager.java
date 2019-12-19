public class Manager {
    private DocumentCreator creator;

    public void setCreator(DocumentCreator creator) {
        this.creator = creator;
    }

    public void doWork() {
        creator.create();
    }
}
