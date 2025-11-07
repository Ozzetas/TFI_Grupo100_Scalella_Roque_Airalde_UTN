
package entities;

public abstract class Base {
    
        // Atributos
        private Long id;
        private boolean eliminado;
        
        // Constructor sobrecargado
        public Base(Long id, boolean eliminado) {
            this.id = id;
            this.eliminado = eliminado;
        }
        
        // Constructor vacio
        public Base() {}
        
        // Getters & Setters
        
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public boolean isEliminado() {
            return eliminado;
        }

        public void setEliminado(boolean eliminado) {
            this.eliminado = eliminado;
        }

}
