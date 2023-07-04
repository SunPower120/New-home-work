package io.codelex.oop.Computers;

import java.util.Objects;

public class Computers {

    private String processor;
    private String ram;
    private String gpu;
    private String company;
    private String model;

    public Computers(String processor, String ram, String gpu, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.gpu = gpu;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computers{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", gpu='" + gpu + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computers computers = (Computers) o;
        return Objects.equals(processor, computers.processor) && Objects.equals(ram, computers.ram) && Objects.equals(gpu, computers.gpu) && Objects.equals(company, computers.company) && Objects.equals(model, computers.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, gpu, company, model);
    }
}
