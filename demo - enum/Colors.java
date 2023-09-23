public enum Colors {
  RED("#FF000"),
  BLUE("#00FF00"),
  GREEN("#0000FF"), id;

  private String hexCode;

  Colors(String hexCode) {
      this.hexCode = hexCode;
  }

  public String getHexCode() {
      return hexCode;
  }
}

