package esprit.fgsc.congesmicroservice.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import esprit.fgsc.congesmicroservice.entities.Conges;
import esprit.fgsc.congesmicroservice.repository.ICongesRepository;



@Service
public class CongesService {
	private static final DateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	@Autowired
	private ICongesRepository congesRepository;
	
	public Conges addConges(String employeId) {
		Conges conge= new Conges();
		Date date = new Date();
        String start_date = sdf.format(date);
		conge.setStart_date(start_date);
		Date date1 = new Date();
        String end_date = sdf.format(date1);
        conge.setEnd_date(end_date);
		return congesRepository.save(conge);
		
	}
}
