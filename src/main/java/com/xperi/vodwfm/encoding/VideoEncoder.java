package com.xperi.vodwfm.encoding;

import org.springframework.stereotype.Component;

@Component
public class VideoEncoder {

  public Video encode(Video sourceVideo) {

    //assume this is correctly doing the encoding
    return new Video("result/" + sourceVideo.getPath().toString());
  }

}
