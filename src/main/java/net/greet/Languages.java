package net.greet;

public enum Languages {
    English("Hello, "),
    French("Bonjour, "),
    Italian("Ciao, ");

    String lang;

  Languages(String lang){
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
