package br.com.cod3r.template.sales.after.template;

import br.com.cod3r.template.sales.after.model.Cart;

public abstract class BestOfferTemplate {

    protected Cart cart;
    protected Double regularItemsPrice;
    protected Double deliveryTax;
    protected Double priceFactor;
    protected Double deliveryFactor;

    public BestOfferTemplate(Cart cart) {
        this.cart = cart;
        regularItemsPrice = calculateRegularItemsPrice();
        deliveryTax = calculateDeliveryTax();
        priceFactor = 1.0;
        deliveryFactor = 1.0;
    }

    protected Double calculateDeliveryTax() {
        Integer distance = cart.getBuyer().getDistance();
        Double totalWeight = cart.getItems().stream()
                .reduce(0d, (acc, item) -> acc + item.getValue(), Double::sum);
        return (distance * totalWeight) / 100;
    }

    private Double calculateRegularItemsPrice() {
        return cart.getItems().stream()
                .reduce(0d, (acc, item) -> acc + item.getValue(), Double::sum);
    }

    public Double calculateOffer(Cart cart) {
        calibrateVariables();

        return (regularItemsPrice * priceFactor) + (deliveryTax * deliveryFactor);
    }

    public abstract boolean isApplicable();
    protected abstract void calibrateVariables();

}
