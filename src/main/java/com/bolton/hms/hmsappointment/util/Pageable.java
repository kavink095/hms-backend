package com.bolton.hms.hmsappointment.util;

import org.springframework.data.domain.Sort;

public class Pageable implements org.springframework.data.domain.Pageable {
  private int size;
  private int page;

  public Pageable(int size, int page) {
    if (page < 0) {
      throw new IllegalArgumentException("Page index must not be less than zero!");
    } else if (size < 1) {
      throw new IllegalArgumentException("Page size must not be less than one!");
    } else {
      this.page = page;
      this.size = size;
    }
  }


  @Override
  public int getPageNumber() {
    return page;
  }

  @Override
  public int getPageSize() {
    return size;
  }

  @Override
  public long getOffset() {
    return (long)this.page * (long)this.size;
  }

  @Override
  public Sort getSort() {
    return null;
  }

  @Override
  public org.springframework.data.domain.Pageable next() {
    return null;
  }

  @Override
  public org.springframework.data.domain.Pageable previousOrFirst() {
    return null;
  }

  @Override
  public org.springframework.data.domain.Pageable first() {
    return null;
  }

  @Override
  public boolean hasPrevious() {
    return this.page > 0;
  }
}
