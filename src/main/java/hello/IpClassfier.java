package hello;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemWriter;
import org.springframework.classify.Classifier;

public class IpClassfier implements Classifier<Report,ItemWriter<Report>> {
    private Map<Boolean, ItemWriter<Report>> writerMap = new HashMap<Boolean, ItemWriter<Report>>();

    @Override
    public ItemWriter<Report> classify(Report Report) {
        return writerMap.get(Report.isTrue());
    }

    public void setWriterMap(Map<Boolean, ItemWriter<Report>> writerMap) {
        this.writerMap = writerMap;
    }
}