package com.hkjava.demo.demofinnhub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class Symbol {
  private String symbol;
  private String currency;
  private String description;
  private String displaySymbol;

  @JsonProperty("figi")
  private String figiIdentifier;
  private String isin;
  @JsonProperty("mic")
  private String exchangeMic;
  private String shareClassFIGI;
  @JsonProperty("symbol2")
  private String altSymbol;
  private String type;
}
