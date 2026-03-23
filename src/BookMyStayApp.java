//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

class AddOnService {
    private String serviceName;
    private double price;

    public AddOnService(String var1, double var2) {
        this.serviceName = var1;
        this.price = var2;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return this.serviceName + " ($" + this.price + ")";
    }
}