            package p000;

            import android.view.inputmethod.ExtractedText;
            
            public abstract class lIioo1OOlO {
                public static final ExtractedText I00000oIO(Oo0OI01Il oo0OI01Il) {
/* 3 */             ExtractedText extractedText = new ExtractedText();
/* 8 */             String str = oo0OI01Il.I00000oIO.I00iiI;
/* 10 */            extractedText.text = str;
/* 13 */            extractedText.startOffset = 0;
/* 19 */            extractedText.partialEndOffset = str.length();
/* 22 */            extractedText.partialStartOffset = -1;
/* 24 */            long j = oo0OI01Il.I00000oOI;
/* 30 */            extractedText.selectionStart = Oo0lI00l.I000II(j);
/* 36 */            extractedText.selectionEnd = Oo0lI00l.I0001Ioi1lo(j);
/* 50 */            extractedText.flags = !OlOoOIi0o.I00100l0(oo0OI01Il.I00000oIO.I00iiI, '\n') ? 1 : 0;
/* 77 */            return extractedText;
                }
            }
