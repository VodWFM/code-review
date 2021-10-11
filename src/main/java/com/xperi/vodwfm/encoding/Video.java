package com.xperi.vodwfm.encoding;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Video {

  private final Path path;

  public Video(String path) {

    this.path = Paths.get(path);
  }

  public Path getPath() {

    return path;
  }
}
