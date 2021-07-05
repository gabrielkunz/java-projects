package assignment04;

abstract public class Person {
    private String name;
    private String mothers_name;
    private String fathers_name;
    private String cpf;
    private String cnh;

    public Person(String name, String mothers_name, String fathers_name, String cpf, String cnh) {
        setName(name);
        setMothersName(mothers_name);
        setFathersName(fathers_name);
        setCPF(cpf);
        setCNH(cnh);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMothersName(String mothers_name) {
        this.mothers_name = mothers_name;
    }

    public String getMothersName() {
        return mothers_name;
    }

    public void setFathersName(String fathers_name) {
        this.fathers_name = fathers_name;
    }

    public String getFathersName() {
        return fathers_name;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCNH(String cnh) {
        this.cnh = cnh;
    }

    public String getCNH() {
        return cnh;
    }
}
