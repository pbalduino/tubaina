package br.com.caelum.tubaina.parser.html.kindle;

import br.com.caelum.tubaina.Chunk;
import br.com.caelum.tubaina.parser.Tag;
import br.com.caelum.tubaina.parser.html.CenteredParagraphTagTemplate;

public class CenteredParagraphTag implements Tag {
	private CenteredParagraphTagTemplate template = new  CenteredParagraphTagTemplate();
	
	public String parse(Chunk chunk) {
		return template.parse(chunk);
	}

}
