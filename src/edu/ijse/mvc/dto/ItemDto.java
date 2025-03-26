/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author disni-maleesha
 */
public class ItemDto {
  private String itemCode;
  private String descrition;
  private String packSize;
  private int qoh;
  private double uniptrice;

    public ItemDto() {
    }

    public ItemDto(String itemCode, String descrition, String packSize, int qoh, double uniptrice) {
        this.itemCode = itemCode;
        this.descrition = descrition;
        this.packSize = packSize;
        this.qoh = qoh;
        this.uniptrice = uniptrice;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the descrition
     */
    public String getDescrition() {
        return descrition;
    }

    /**
     * @param descrition the descrition to set
     */
    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    /**
     * @return the packSize
     */
    public String getPackSize() {
        return packSize;
    }

    /**
     * @param packSize the packSize to set
     */
    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    /**
     * @return the qoh
     */
    public int getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    /**
     * @return the uniptrice
     */
    public double getUniptrice() {
        return uniptrice;
    }

    /**
     * @param uniptrice the uniptrice to set
     */
    public void setUniptrice(double uniptrice) {
        this.uniptrice = uniptrice;
    }
 
  
 
    }

