/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.soft_recrutare.ejb;

import com.soft.soft_recrutare.common.CandidateDetails;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Admin
 */
@Stateless
public class CandidateBean {

/*    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
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
           */
}
