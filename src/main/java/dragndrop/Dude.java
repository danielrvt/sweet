package dragndrop;

class Dude {
    
    public String greet(String salute) throws Exception {
        
        if (salute.equals("Hi!")) return "Hellou!";
        else if (salute.equals("Hello")) return "Wazaaaa";
        else throw new Exception("¡¡¡POW!!! - ¡Punch to the face!");
    }
}
