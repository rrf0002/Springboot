/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MysqlCRUD.demo.interfaceService;

import com.MysqlCRUD.demo.modelo.Persona;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author rruizfer
 */
public interface IPersonaService {
  public List<Persona>listar();
  public Optional<Persona>listarId(int id);
  public int save(Persona p);
  public void Delete(int id);
}
