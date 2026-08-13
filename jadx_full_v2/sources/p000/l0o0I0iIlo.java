            package p000;

            import android.text.Layout;
            
            public abstract class l0o0I0iIlo {
                public static final int I00000oIO(Layout layout, int i, boolean z) {
/* 1 */             if (i <= 0) {
/* 3 */                 return 0;
                    }
/* 13 */            if (i >= layout.getText().length()) {
/* 19 */                return layout.getLineCount() - 1;
                    }
/* 22 */            int lineForOffset = layout.getLineForOffset(i);
/* 26 */            int lineStart = layout.getLineStart(lineForOffset);
/* 30 */            int lineEnd = layout.getLineEnd(lineForOffset);
/* 34 */            if (lineStart == i || lineEnd == i) {
/* 39 */                if (lineStart == i) {
/* 41 */                    if (z) {
/* 43 */                        return lineForOffset - 1;
                            }
                        } else if (!z) {
/* 49 */                    return lineForOffset + 1;
                        }
                    }
/* 48 */            return lineForOffset;
                }
            }
