package com.planning.dao.implement;

import com.planning.dao.DAO;
import com.planning.model.Groupe;
import com.planning.model.Seance;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;

public class GroupeDAO extends DAO<Groupe> {
    
    public GroupeDAO (Connection conn) {
        super(conn);
    }
    
    @Override
    public boolean create(Groupe obj) {
        try {
            state = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            query = "SELECT NEXTVAL ('NumGroupe') as numgroupe";
            res = state.executeQuery(query);
            if(res.first()) {
                int numgroupe = res.getInt(1);
                PreparedStatement prepare = this.conn.prepareStatement("INSERT INTO GROUPE (NumGroupe, NomGroupe, Niveau) VALUES (?,?,?)");
                prepare.setInt(1,numgroupe);
                prepare.setString(2,obj.getNomGroupe());
                prepare.setInt(3,obj.getNiveau());
                prepare.executeUpdate();
            }
        }
        catch (SQLException e) {
        }    
        return true;
    }
    
    @Override
    public boolean delete(Groupe obj){
        try {
            this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE).executeUpdate("DELETE FROM GROUPE WHERE NumGroupe = " + obj.getNumGroupe());
        } 
        catch (SQLException e) {
        }
        return true;
    }
    
    
    
    @Override
    public boolean update(Groupe obj){
        try {
            state = conn.createStatement();
            query = "UPDATE GROUPE SET NomGroupe = " + obj.getNomGroupe() + ", NumFiliere = " + obj.getNumFiliere() + ", Niveau = " + obj.getNiveau();
            query += " WHERE NumGroupe = " + obj.getNumFiliere();
	}
        catch (SQLException e) {
            System.out.println("SQLException: " + e);
            return false;
        }
        return true;
    }
    
	public ResultSet AfficherAllGrp(){
        try{
            state = conn.createStatement(ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE);
            query = "select * from Groupe";
            res =state.executeQuery(query);
            
//            while(res.next()) {
//                System.out.println(res.getString(1));
//            }
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return res;
        
    }
	
    public boolean updatebyObj(Groupe obj1, Groupe obj2) {
        
        try {
            state = this.conn.createStatement();
            query = "UPDATE GROUPE SET NomGroupe = '" + obj2.getNomGroupe() + "', NumFiliere = " + obj2.getNumFiliere() + ", Niveau = " + obj2.getNiveau();
            query += " WHERE NomGroupe = '" + obj1.getNomGroupe() + "' AND NumFiliere = " + obj1.getNumFiliere() + " and Niveau = " + obj1.getNiveau();
        } catch (Exception e) {
            System.out.println("SQLException: " + e);
            return false;
        }
        return true;
    }
    @Override
    public Groupe find(int numg){
        
        Groupe groupe = null;
        
        try {    
            state = conn.createStatement(ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE);
            query = "SELECT * FROM Groupe WHERE NumGroupe = " + numg;
            res = state.executeQuery(query);
            while(res.next()) {
                groupe = new Groupe(res.getInt(1), res.getInt(2), res.getString(3), res.getInt(4));   
                SeanceDAO seanceDAO = new SeanceDAO(this.conn);
                Set<Seance> seanceList = seanceDAO.findByNumGroupe(res.getInt(1));
                Iterator iterator = seanceList.iterator();
                while(iterator.hasNext()){
                    groupe.addSeance((Seance)iterator.next());
                }
             }   
        }catch (SQLException e) {   
            System.out.println("SQLException: " + e);
        }
        return groupe;
    }
    
    
    @Override
    public Groupe find(String string){
       
        return null;
    }
}

