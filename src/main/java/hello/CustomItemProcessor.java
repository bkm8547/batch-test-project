package hello;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by devsun on 15. 1. 15..
 */
public class CustomItemProcessor implements ItemProcessor<Report, Report> {
    @Override
    public Report process(Report report) throws Exception {
    	if(report.getIp().startsWith("210")){
    		report.setTrue(true);
    	}
        return report;
    }
}