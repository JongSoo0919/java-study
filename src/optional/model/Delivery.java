package optional.model;

public class Delivery {
    private String status;
    private boolean canceled;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    public Delivery(String status, boolean canceled) {
        this.status = status;
        this.canceled = canceled;
    }
}
