package com.groupdocs.comparison;

import org.apache.velocity.tools.view.tools.ViewTool;

public class EmbedGroupDocsComparison implements ViewTool {
    @Override
    public void init(Object o) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public String RenderIframe(String compareKey, String guid, int width, int height, String frameborder) {
        return "<iframe src=\"http://apps.groupdocs.com/document-comparison/embed/" + compareKey + "/" + guid + "?referer=DotCms-Comparison/1.0.0\" frameborder=\"" + frameborder + "\" width=\"" + Integer.toString(width) + "\" height=\"" + Integer.toString(height) +  "\">If you can see this text, your browser does not support iframes. Please enable iframe support in your browser or use the latest version of any popular web browser such as Mozilla Firefox or Google Chrome. For more help, please check our documentation Wiki: <a href=\"http://groupdocs.com/docs/display/comparison/GroupDocs+Comparison+Integration+with+3rd+Party+Platforms\">http://groupdocs.com/docs/display/comparison/GroupDocs+Comparison+Integration+with+3rd+Party+Platforms</a></iframe>";
    }

    public String RenderIframe(String compareKey, String guid, int width, int height) {
        return RenderIframe(compareKey, guid, width, height, "0");
    }
}