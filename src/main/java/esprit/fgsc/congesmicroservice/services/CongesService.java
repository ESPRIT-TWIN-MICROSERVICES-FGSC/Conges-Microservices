package esprit.fgsc.congesmicroservice.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import esprit.fgsc.congesmicroservice.entities.Conges;
import esprit.fgsc.congesmicroservice.repository.ICongesRepository;



@Service
public class CongesService {
	private static final DateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	@Autowired
	private ICongesRepository congesRepository;
	
	public Conges addConges(Conges conge) {
		Date date = new Date();
        String start_date = sdf.format(date);
		conge.setStart_date(start_date);
		Date date1 = new Date();
        String end_date = sdf.format(date1);
        conge.setEnd_date(end_date);
		return congesRepository.save(conge);
		
	}
	public List<Conges>getAllConges(){
		 return congesRepository.findAll();
	}
	
	public String deleteConge(String id) {   

		congesRepository.deleteById(id);
   	return "conge deleted"+id;
	}
          
public Conges updateConge(String id,Conges newConge) {
	if(congesRepository.findById(id).isPresent()) {
		Conges existingConges = congesRepository.findById(id).get();
		existingConges.setType(newConge.getType());
		Date date = new Date();
		 String start_date = sdf.format(date);
		 existingConges.setStart_date(start_date);
			Date date1 = new Date();
	        String end_date = sdf.format(date1);
	        existingConges.setEnd_date(end_date);
		
		return congesRepository.save(newConge);
		
	}else {
		return null;
	}
}

public Conges getCongeById(String id) {
	return congesRepository.findById(id).get();
	
}
}
