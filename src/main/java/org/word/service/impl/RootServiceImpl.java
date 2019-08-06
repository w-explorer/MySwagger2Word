package org.word.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.word.dto.Info;
import org.word.dto.Root;
import org.word.service.RootService;
import org.word.utils.JsonUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wenc
 * @create 2019-08-05 9:18
 */
@Slf4j
@Service
public class RootServiceImpl implements RootService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Root getRoot(String swaggerUrl) {
        Root root = new Root();
        try{
            String jsonStr = restTemplate.getForObject(swaggerUrl, String.class);
            // convert JSON string to Map
            Map<String, Object> map = JsonUtils.readValue(jsonStr, HashMap.class);
            root.setSwagger((String)map.get("swagger"));
            root.setHost((String)map.get("host"));
            root.setBasePath((String)map.get("basePath"));
            Map<String,String> infoMap = (Map<String, String>) map.get("info");
            Info info = new Info();
            info.setDescription(infoMap.get("description"));
            info.setTermsofservice(infoMap.get("termsofservice"));
            info.setVersion(infoMap.get("version"));
            info.setTitle(infoMap.get("title"));
            root.setInfo(info);
        }
        catch (Exception e) {
            log.error("parse error", e);
        }

        return root;
    }
}
