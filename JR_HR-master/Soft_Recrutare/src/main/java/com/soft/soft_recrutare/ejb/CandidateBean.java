/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.soft_recrutare.ejb;

import com.soft.soft_recrutare.common.CandidateDetails;
import com.soft.soft_recrutare.common.Position;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import java.util.*;

/**
 *
 * @author Admin
 */
@Stateless
public class CandidateBean {
    
       //@Autowired  => instantiere automata(Spring)
      //CandidateRepository candidateRepository;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    //Candidate entity to be done by colleagues
       private List<CandidateDetails> copyCandidatesToDetails(List<Candidate> candidates) {
        
        List<CandidateDetails> detailsList = new ArrayList<>();
        for (Candidate candidate : candidates) {    
            CandidateDetails candidateDetails = new CandidateDetails(candidate.getId(),
                    candidate.getNume(),
                   candidate.getPrenume(),
                   candidate.getEmail());
            detailsList.add(candidateDetails);
        }
        return detailsList;
    }
       
       private List<Candidate> copyCandidateDetailsListToCandidateList(List<CandidateDetails> candidateDetailList) {
        
        List<Candidate> candidateList = new ArrayList<>();
        for (CandidateDetails candidateDetail : candidateDetailList) {    
            Candidate candidate = new Candidate(candidateDetail.getId(),
                    candidateDetail.getNume(),
                   candidateDetail.getPrenume(),
                   candidateDetail.getEmail(),
                    candidateDetail.getPosition());
                                                    
            candidateList.add(candidate);
        }
        return candidateList;
    }
       
       private Candidate  copyCandidateDetailToCandidate(CandidateDetails candidateDetails) {
           return new Candidate( candidateDetails.getId(),
                   candidateDetails.getNume(),
                   candidateDetails.getPrenume(),
                   candidateDetails.getEmail(),
                   candidateDetails.getPosition());  //copiaza obiectul candidateDetails la Candidate
          
        
    }
       
       
    
         public void addPosition(CandidateDetails candidateDetails, Position position)
    {       //parametrii vin din FrontEnd
       
        candidateDetails.setPosition(position.getPosition());  //adaugat verificari ; sa nu am pozitie care sa fie nula
        Candidate candidate = new Candidate();
        candidate = copyCandidateDetailToCandidate(candidateDetails);//apel metoda; in candidate avem toate valorile din candidateDetails
      /* 
            aici vom salva candidate in baza de date
             candidateRepository.save(candidate);  //candidateRepository este declarat la inceputul clasei
                                                    //sau 
             candidateDAO.save(candidate);
        */
    
    }
         
    
         public void editPosition(CandidateDetails candidate,Position position) {  
       candidateDetails.setPosition(position.getPosition());  //adaugat verificari ; sa nu am pozitie care sa fie nula
        Candidate candidate = new Candidate();
        candidate = copyCandidateDetailToCandidate(candidateDetails);//apel metoda; in candidate avem toate valorile din candidateDetails
      /* 
            aici vom salva candidate in baza de date
             candidateRepository.save(candidate);  //candidateRepository este declarat la inceputul clasei
                                                    //sau 
             candidateDAO.save(candidate);
        */        

    }
    
       
    
        public void removePosition(CandidateDetails candidate)
    {
       candidate.setPosition(Position.DEFAULT.getPosition());
        Candidate candidate = new Candidate();
        candidate = copyCandidateDetailToCandidate(candidateDetails);//apel metoda; in candidate avem toate valorile din candidateDetails
      /* 
            aici vom salva candidate in baza de date
        
             candidateRepository.save(candidate);  //candidateRepository este declarat la inceputul clasei
                                                    //sau 
             candidateDAO.save(candidate);
        */
    
    }
        
        public void saveAllCandidates(List<CandidateDetails> candidateDetailsList)
        {
            List<Candidate> candidateList = new ArrayList();
            candidateList = copyCandidateDetailsListToCandidateList(candidateDetailsList);
            /* 
            aici vom salva candidate in baza de date
             candidateRepository.saveAll(candidate);  //candidateRepository este declarat la inceputul clasei
                                                    //sau 
             candidateDAO.saveAll(candidate);
        */
        }

     
}
