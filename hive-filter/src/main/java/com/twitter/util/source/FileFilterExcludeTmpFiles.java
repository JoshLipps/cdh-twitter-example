package com.twitter.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.PathFilter;

public class FileFilterExcludeTmpFiles implements PathFilter {
	public boolean accept(Path p) {
		String name = p.getName();
		return (!name.startsWith("_") && !name.startsWith(".") && !name.endsWith(".tmp"));
}
}
