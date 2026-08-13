            package p000;

            import android.graphics.text.LineBreakConfig;
            import android.os.Build;
            import android.text.Layout;
            import android.text.StaticLayout;
            import android.text.TextDirectionHeuristic;
            import android.text.TextPaint;
            import android.text.TextUtils;
            
            public abstract class lOOOliiiOOi {
                public static StaticLayout I00000oIO(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
/* 1 */             if (i2 < 0) {
/* 6 */                 Ioliol.I00000oIO("invalid start value");
                    }
/* 9 */             int length = charSequence.length();
/* 13 */            if (i2 < 0 || i2 > length) {
/* 20 */                Ioliol.I00000oIO("invalid end value");
                    }
/* 23 */            if (i3 < 0) {
/* 28 */                Ioliol.I00000oIO("invalid maxLines value");
                    }
/* 31 */            if (i < 0) {
/* 36 */                Ioliol.I00000oIO("invalid width value");
                    }
/* 39 */            if (i4 < 0) {
/* 44 */                Ioliol.I00000oIO("invalid ellipsizedWidth value");
                    }
/* 48 */            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
/* 52 */            builderObtain.setTextDirection(textDirectionHeuristic);
/* 55 */            builderObtain.setAlignment(alignment);
/* 58 */            builderObtain.setMaxLines(i3);
/* 61 */            builderObtain.setEllipsize(truncateAt);
/* 64 */            builderObtain.setEllipsizedWidth(i4);
/* 70 */            builderObtain.setLineSpacing(0.0f, 1.0f);
/* 73 */            builderObtain.setIncludePad(z);
/* 76 */            builderObtain.setBreakStrategy(i6);
/* 79 */            builderObtain.setHyphenationFrequency(i9);
/* 83 */            builderObtain.setIndents(null, null);
/* 86 */            builderObtain.setJustificationMode(i5);
/* 90 */            builderObtain.setUseLineSpacingFromFallbacks(true);
/* 110 */           builderObtain.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
/* 117 */           if (Build.VERSION.SDK_INT >= 35) {
/* 2 */                 builderObtain.setUseBoundsForWidth(false);
                    }
/* 122 */           return builderObtain.build();
                }
            }
