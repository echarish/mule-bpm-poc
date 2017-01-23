package com.mule.bpm.poc;

import java.io.Serializable;

public class Order implements Serializable {
    
    public String merchant;
    public double weight;
    public boolean expedited;
    
    public String destination;
    
    public String getMerchant() {
        return merchant;
    }
    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }
    
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public boolean isExpedited() {
        return expedited;
    }
    public void setExpedited(boolean expedited) {
        this.expedited = expedited;
    }
    
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
}