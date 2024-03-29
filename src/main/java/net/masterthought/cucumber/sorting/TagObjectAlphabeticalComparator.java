package net.masterthought.cucumber.sorting;

import net.masterthought.cucumber.json.support.TagObject;

import java.util.Comparator;

/**
 * @author Damian Szczepanik (damianszczepanik@github)
 */
public class TagObjectAlphabeticalComparator implements Comparator<TagObject> {

    @Override
    public int compare(TagObject tagObject1, TagObject tagObject2) {
        // since there might be the only one TagObject with given tagName, compare by location only
        return Integer.signum(tagObject1.getName().compareTo(tagObject2.getName()));
    }
}
