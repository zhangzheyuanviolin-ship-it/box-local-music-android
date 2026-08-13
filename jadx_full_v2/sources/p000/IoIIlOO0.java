            package p000;

            import android.text.Editable;
            import android.text.Html;
            import java.lang.invoke.VarHandle;
            import org.xml.sax.ContentHandler;
            import org.xml.sax.XMLReader;
            
            public final class IoIIlOO0 implements Html.TagHandler {
                @Override
                public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
/* 1 */             if (xMLReader == null || editable == null || !z || !O0000Ioio00.I0000O(str, "ContentHandlerReplacementTag")) {
/* 204 */               return;
                    }
/* 16 */            ContentHandler contentHandler = xMLReader.getContentHandler();
/* 22 */            I111o1Oil1i i111o1Oil1i = new I111o1Oil1i();
/* 25 */            i111o1Oil1i.I00000oIO = contentHandler;
/* 27 */            i111o1Oil1i.I00000oOI = editable;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            xMLReader.setContentHandler(i111o1Oil1i);
                }
            }
