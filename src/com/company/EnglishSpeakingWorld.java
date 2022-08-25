package com.company;

 class EnglishSpeakingWorld {
    // field mars
    String mars = "   red planet";

    // method
    void visitPennsylvania(){
        System.out.println("visitPA is running:");

        // method-local variable
        String mars = "   Janine's home town";

        // print the string
        System.out.println(mars);
        // printing the field
        System.out.println(this.mars);
    }
}
