package com.hellobank.hellobank.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.hellobank.hellobank.dao.AdministradorDAO;
import com.hellobank.hellobank.model.Administrador;

@Service
public class AdministradorService implements IAdministradorService {
    @Autowired
    private AdministradorDAO dao;

    @Override
    public ArrayList<Administrador> listarTodos() {
        return (ArrayList<Administrador>)dao.findAll();
    }
}