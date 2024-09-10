//package com.live2train.Liv2Train.model;
//
//import jakarta.persistence.Embeddable;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Pattern;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Embeddable
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Address {
//    @NotBlank(message = "Detailed address is required")
//    private String detailedAddress;
//
//    @NotBlank(message = "City is required")
//    private String city;
//
//    @NotBlank(message = "State is required")
//    private String state;
//
//    @NotNull(message = "Pincode is required")
//    @Pattern(regexp = "^\\d{6}$", message = "Pincode must be 6 digits")
//    private String pincode;
//}