/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.hospitalKennedy.logica.interfaces;

import co.edu.uniandes.csw.hospitalKennedy.dto.Paciente;
import co.edu.uniandes.csw.hospitalKennedy.dto.Reporte;
import co.edu.uniandes.csw.hospitalKennedy.dto.ReporteDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public interface IServicioPacienteMock {
 
    
    public List<Reporte> getReportes(String idPaciente);
    public ReporteDTO agregarReporte(String idPaciente, ReporteDTO reporte);
    public Reporte removerReporte(Long idPaciente, Long idReporte);
    public Paciente darPaciente(String idPaciente);
    public List<Paciente> darPacientes();
    public Reporte getReportePorPaciente(Long idPaciente, Long idReporte);

    public List<Reporte> getReportesEntreFechas(String idPaciente, String codFecha1, String codFecha2);
    
    
}
