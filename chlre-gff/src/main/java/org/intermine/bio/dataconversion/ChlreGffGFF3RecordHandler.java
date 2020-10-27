package org.intermine.bio.dataconversion;

/*
 * Copyright (C) 2002-2019 FlyMine
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  See the LICENSE file for more
 * information or http://www.gnu.org/copyleft/lesser.html.
 *
 */

import org.intermine.bio.io.gff3.GFF3Record;
import org.intermine.metadata.Model;
import org.intermine.xml.full.Item;

/**
 * A converter/retriever for the ChlreGff dataset via GFF files.
 */

public class ChlreGffGFF3RecordHandler extends GFF3RecordHandler
{

    /**
     * Create a new ChlreGffGFF3RecordHandler for the given data model.
     * @param model the model for which items will be created
     */
    public ChlreGffGFF3RecordHandler (Model model) {
        super(model);
         // refsAndCollections controls references and collections that are set from the
         // Parent= attributes in the GFF3 file.
         
         refsAndCollections.put("Exon", "transcripts");
         refsAndCollections.put("MRNA", "gene");
    }

    /**
     * {@inheritDoc}
     */
    public void process(GFF3Record record) {
        Item feature = getFeature();

        String clsName = feature.getClassName();

       // if ("Exon".equals(clsName)) {
            // move Exon.primaryIdentifier to Gene.secondaryIdentifier

            //if (feature.getAttribute("primaryIdentifier") != null) {
            //    String symbol = feature.getAttribute("primaryIdentifier").getValue();
            //    feature.setAttribute("symbol", symbol);
            //}
       // }
    }
}
