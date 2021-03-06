/*
 * Copyright 2017 The Mifos Initiative.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.teller.api.v1.domain;

import io.mifos.core.lang.validation.constraints.ValidIdentifier;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

public class TellerTransaction {

  public enum State {
    PENDING,
    CANCELED,
    CONFIRMED
  }

  @ValidIdentifier(optional = true)
  private String identifier;
  @NotNull
  private String transactionType;
  @NotNull
  private String transactionDate;
  @ValidIdentifier
  private String customerIdentifier;
  @ValidIdentifier
  private String productIdentifier;
  @ValidIdentifier(optional = true)
  private String productCaseIdentifier;
  @ValidIdentifier
  private String customerAccountIdentifier;
  @ValidIdentifier(optional = true)
  private String targetAccountIdentifier;
  @ValidIdentifier
  private String clerk;
  @NotNull
  @DecimalMin("0.00")
  private Double amount;
  private State state;

  public TellerTransaction() {
    super();
  }

  public String getIdentifier() {
    return this.identifier;
  }

  public void setIdentifier(final String identifier) {
    this.identifier = identifier;
  }

  public String getTransactionType() {
    return this.transactionType;
  }

  public void setTransactionType(final String transactionType) {
    this.transactionType = transactionType;
  }

  public String getTransactionDate() {
    return this.transactionDate;
  }

  public void setTransactionDate(final String transactionDate) {
    this.transactionDate = transactionDate;
  }

  public String getCustomerIdentifier() {
    return this.customerIdentifier;
  }

  public void setCustomerIdentifier(final String customerIdentifier) {
    this.customerIdentifier = customerIdentifier;
  }

  public String getProductIdentifier() {
    return this.productIdentifier;
  }

  public void setProductIdentifier(final String productIdentifier) {
    this.productIdentifier = productIdentifier;
  }

  public String getProductCaseIdentifier() {
    return this.productCaseIdentifier;
  }

  public void setProductCaseIdentifier(final String productCaseIdentifier) {
    this.productCaseIdentifier = productCaseIdentifier;
  }

  public String getCustomerAccountIdentifier() {
    return this.customerAccountIdentifier;
  }

  public void setCustomerAccountIdentifier(final String customerAccountIdentifier) {
    this.customerAccountIdentifier = customerAccountIdentifier;
  }

  public String getTargetAccountIdentifier() {
    return this.targetAccountIdentifier;
  }

  public void setTargetAccountIdentifier(final String targetAccountIdentifier) {
    this.targetAccountIdentifier = targetAccountIdentifier;
  }

  public String getClerk() {
    return this.clerk;
  }

  public void setClerk(final String clerk) {
    this.clerk = clerk;
  }

  public Double getAmount() {
    return this.amount;
  }

  public void setAmount(final Double amount) {
    this.amount = amount;
  }

  public String getState() {
    return this.state.name();
  }

  public void setState(final String state) {
    this.state = State.valueOf(state);
  }
}
