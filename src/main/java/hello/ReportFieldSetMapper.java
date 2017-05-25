package hello;

import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;


/**
 * Created by devsun on 15. 1. 15..
 */
public class ReportFieldSetMapper implements FieldSetMapper<Report> {
    @Override
	public Report mapFieldSet(FieldSet fieldSet) throws BindException {
	  String ip=fieldSet.readString("ip");
	  return new Report(ip);
	}    
}