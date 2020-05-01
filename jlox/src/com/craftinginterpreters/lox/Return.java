package com.craftinginterpreters.lox;

class Return extends RuntimeException {
  private static final long serialVersionUID = -6173954884348620549L;
  final Object value;

  Return(Object value) {
    super(null, null, false, false);
    this.value = value;
  }
}