package br.com.caelum.tubaina.parser.html.desktop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.caelum.tubaina.Chunk;
import br.com.caelum.tubaina.TubainaException;
import br.com.caelum.tubaina.parser.Parser;
import br.com.caelum.tubaina.parser.Tag;
import br.com.caelum.tubaina.parser.html.ImageTagTemplate;

public class ImageTag implements Tag {

	private ImageTagTemplate template;
	
	public ImageTag(Parser parser) {
		template = new ImageTagTemplate(parser);
	}
	
	public String parse(Chunk chunk) {
	    Pattern label = Pattern.compile("(?s)(?i)label=(\\w+)?");
        Matcher labelMatcher = label.matcher(options);
        if (labelMatcher.matches()) {
            throw new TubainaException("Image labels are not yet supported for html output");
        }
	    
		return template.parse(path, options, false);
	}

	public Integer getScale(final String string) {
		return template.getScale(string);
	}
	
	public boolean shouldResize(final String options) {
	    return template.shouldScale(options);
	}
}
