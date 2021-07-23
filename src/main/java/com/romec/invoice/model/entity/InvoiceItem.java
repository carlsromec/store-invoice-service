package com.romec.invoice.model.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "tbl_invoice_items")
@Getter
@Setter
@AllArgsConstructor
@Builder
public class InvoiceItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Positive(message = "el quantity debe ser mayor a 0")
    private  Double quantity;
    private Double price;
    @Column(name = "product_id")
    private Long productId;

    @Transient
    private Double subTotal;

    //@Transient
    //private ProductEnt productEnt;

    public Double getSubTotal() {
        if(this.price>0 && this.quantity > 0){
            return this.price * this.quantity;
        }
        return (double) 0;
    }

    public InvoiceItem() {
        this.quantity=(double) 0;
        this.price=(double) 0;
    }
}
