public class Moto extends Veiculo{    
    private int cilindradas;   
    public Moto(String placa, String marca, String modelo, int ano, int cilindradas) { 
               super(placa, marca, modelo);              
               this.cilindradas = cilindradas;  
    }   
    public void empinar() { 
    System.out.println("Estou empinando a moto....");    
    }    
    public String toString() {       
        return "\nMoto: \n"               
         + "Placa: "+ this.getPlaca() +"\n"               
         + "Marca: "+ this.getMarca() +"\n"                
         + "Modelo: "+ this.getModelo() +"\n"             
         + "Portas: " + this.cilindradas;             
        }
    }
