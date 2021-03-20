package org.masha;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import static org.masha.RepeatUtil.findMostRepeatedLetter;

@Path("wordanalyzer")
public class WordEndpoint {

    @GET
    @Path("/analyze")
    @Produces(MediaType.APPLICATION_JSON)
    public RepeatedSymbol getRepeatedSymbol(@QueryParam("word") String word) {
        return findMostRepeatedLetter(word);
    }
}
