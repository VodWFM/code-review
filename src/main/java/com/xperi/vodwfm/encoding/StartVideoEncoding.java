package com.xperi.vodwfm.encoding;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartVideoEncoding implements Encoding {

  private static final Logger logger = LogManager.getLogger(StartVideoEncoding.class);

  @Autowired
  private VideoEncoder videoEncoder;

  public List<Video> encode(List<Video> videos) {

    for (Video v : videos) {
      if (v.getPath() != null) {
        v = encode(v);
      } else {
        logger.log(Level.ERROR, "Encoding failed");
        throw new BusinessException();
      }
    }
    return videos;
  }

  public Video encode(Video v) {

    Video result = videoEncoder.encode(v);
    return result;
  }
}
