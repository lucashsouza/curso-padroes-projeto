package br.com.cod3r.template.sales.after.template;

import br.com.cod3r.template.sales.after.model.Cart;

public class FreeDelivery extends BestOfferTemplate {

    public FreeDelivery(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isApplicable() {
        return regularItemsPrice > 500;
    }

    @Override
    protected void calibrateVariables() {
        deliveryFactor = 0.0;
    }
}
