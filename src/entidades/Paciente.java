package entidades;

    public class Paciente {

        //variables de instancia
        private int idPaciente;
        private String nombrePaciente;
        private int edadPaciente;
        private int pesoPaciente;
        private String correo;
        private Date fechaNacimiento;

        //constructor
        public Paciente(int idPaciente, String nombrePaciente, int edadPaciente, int pesoPaciente, String correo,
                        Date fechaNacimiento) {
            this.idPaciente = idPaciente;
            this.nombrePaciente = nombrePaciente;
            this.edadPaciente = edadPaciente;
            this.pesoPaciente = pesoPaciente;
            this.correo = correo;
            this.fechaNacimiento = fechaNacimiento;
        }

        //metodos getter y setters
        public int getIdPaciente() {
            return idPaciente;
        }

        public void setIdPaciente(int idPaciente) {
            this.idPaciente = idPaciente;
        }

        public String getNombrePaciente() {
            return nombrePaciente;
        }

        public void setNombrePaciente(String nombrePaciente) {
            this.nombrePaciente = nombrePaciente;
        }

        public int getEdadPaciente() {
            return edadPaciente;
        }

        public void setEdadPaciente(int edadPaciente) {
            this.edadPaciente = edadPaciente;
        }

        public int getPesoPaciente() {
            return pesoPaciente;
        }

        public void setPesoPaciente(int pesoPaciente) {
            this.pesoPaciente = pesoPaciente;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public Date getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(Date fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }
    }

