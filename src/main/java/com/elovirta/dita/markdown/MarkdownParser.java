package com.elovirta.dita.markdown;

import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.net.URI;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;

/**
 * Interface for Markdown parser that produces SAX events for a DITA document.
 */
public interface MarkdownParser {
  /**
   * Parse a Markdown document.
   *
   * @param sequence Markdown document content.
   * @param input    Markdown document URI.
   * @throws ParseException if parsing failed
   */
  void convert(BasedSequence sequence, URI input) throws ParseException;

  /**
   * Set the content event handler.
   *
   * @param handler the new content handler
   */
  void setContentHandler(ContentHandler handler);

  /**
   * Allow an application to register an error event handler.
   *
   * @param errorHandler the error handler.
   */
  void setErrorHandler(ErrorHandler errorHandler);
}
