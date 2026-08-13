            package p000;

            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.text.Layout;
            import android.text.TextPaint;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.text.BreakIterator;
            import java.util.ArrayList;
            import java.util.Locale;
            
            public final class Oo0iOioO {
                public TextPaint I00000oIO;
                public TextUtils.TruncateAt I00000oOI;
                public boolean I0000Il00O;
                public boolean I0000O;
                public I1I1OO00o1o I0000oI00;
                public Layout I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public float I000OiO;
                public float I000iOII;
                public Paint.FontMetricsInt I000l1;
                public int I000lI;
                public O0oo10OIOO11[] I000o00OoI0I;
                public Rect I000oI1ioi;
                public I1ii1o0 I00100l0;

                public final int I00000oIO() {
/* 1 */             boolean z = this.I0000O;
/* 3 */             Layout layout = this.I0001Ioi1lo;
/* 28 */            return (z ? layout.getLineBottom(this.I000II - 1) : layout.getHeight()) + this.I000O01llI0 + this.I000OOo1O + this.I000lI;
                }

                public final float I00000oOI(int i) {
/* 5 */             if (i == this.I000II - 1) {
/* 11 */                return this.I000OiO + this.I000iOII;
                    }
/* 13 */            return 0.0f;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final I1ii1o0 I0000Il00O() {
/* 1 */             I1ii1o0 i1ii1o0 = this.I00100l0;
/* 3 */             if (i1ii1o0 != null) {
/* 110 */               return i1ii1o0;
                    }
/* 7 */             Layout layout = this.I0001Ioi1lo;
/* 12 */            I1ii1o0 i1ii1o02 = new I1ii1o0(11, 0 == true ? 1 : 0);
/* 15 */            i1ii1o02.I00iiI = layout;
/* 19 */            ArrayList arrayList = new ArrayList();
/* 22 */            int length = 0;
/* 62 */            do {
/* 30 */                int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(layout.getText(), '\n', length, 4);
/* 45 */                length = iI001i1O0Ol < 0 ? layout.getText().length() : iI001i1O0Ol + 1;
/* 51 */                arrayList.add(Integer.valueOf(length));
/* 62 */            } while (length < layout.getText().length());
/* 64 */            i1ii1o02.I00iiO = arrayList;
/* 66 */            int size = arrayList.size();
/* 72 */            ArrayList arrayList2 = new ArrayList(size);
/* 75 */            for (int i = 0; i < size; i++) {
/* 78 */                arrayList2.add(null);
                    }
/* 84 */            i1ii1o02.I00iio = arrayList2;
/* 92 */            i1ii1o02.I00ilI0I1 = new boolean[arrayList.size()];
/* 94 */            arrayList.size();
/* 97 */            VarHandle.storeStoreFence();
/* 100 */           this.I00100l0 = i1ii1o02;
/* 102 */           return i1ii1o02;
                }

                public final float I0000O(int i) {
/* 30 */            return this.I000O01llI0 + ((i != this.I000II + (-1) || this.I000l1 == null) ? this.I0001Ioi1lo.getLineBaseline(i) : I000O01llI0(i) - r0.ascent);
                }

                public final float I0000oI00(int i) {
/* 1 */             Layout layout = this.I0001Ioi1lo;
/* 3 */             Paint.FontMetricsInt fontMetricsInt = this.I000l1;
/* 5 */             int i2 = this.I000II;
/* 9 */             if (i != i2 - 1 || fontMetricsInt == null) {
/* 43 */                return this.I000O01llI0 + layout.getLineBottom(i) + (i == i2 + (-1) ? this.I000OOo1O : 0);
                    }
/* 23 */            return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
                }

                public final int I0001Ioi1lo(int i) {
/* 1 */             Layout layout = this.I0001Ioi1lo;
/* 3 */             ThreadLocal threadLocal = Oo0iliIolI.I00000oIO;
                    return (layout.getEllipsisCount(i) <= 0 || this.I00000oOI != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
                }

                public final int I000II(int i) {
/* 1 */             int i2 = this.I000II;
/* 3 */             if (i2 <= 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int lineForOffset = this.I0001Ioi1lo.getLineForOffset(i);
                    int i3 = i2 - 1;
                    return lineForOffset > i3 ? i3 : lineForOffset;
                }

                public final float I000O01llI0(int i) {
/* 15 */            return this.I0001Ioi1lo.getLineTop(i) + (i == 0 ? 0 : this.I000O01llI0);
                }

                public final float I000OOo1O(int i, boolean z) {
/* 18 */            return I00000oOI(I000II(i)) + I0000Il00O().I00IO1oi11O(i, true, z);
                }

                public final float I000OiO(int i, boolean z) {
/* 18 */            return I00000oOI(I000II(i)) + I0000Il00O().I00IO1oi11O(i, false, z);
                }

                public final I1I1OO00o1o I000iOII() {
/* 1 */             Layout layout = this.I0001Ioi1lo;
/* 3 */             I1I1OO00o1o i1I1OO00o1o = this.I0000oI00;
/* 5 */             if (i1I1OO00o1o != null) {
/* 7 */                 return i1I1OO00o1o;
                    }
/* 10 */            CharSequence text = layout.getText();
/* 18 */            int length = layout.getText().length();
/* 24 */            Locale textLocale = this.I00000oIO.getTextLocale();
/* 29 */            I1I1OO00o1o i1I1OO00o1o2 = new I1I1OO00o1o(3);
/* 32 */            i1I1OO00o1o2.I0000O = text;
/* 38 */            if (text.length() < 0) {
/* 43 */                Ioliol.I00000oIO("input start index is outside the CharSequence");
                    }
/* 46 */            if (length < 0 || length > text.length()) {
/* 57 */                Ioliol.I00000oIO("input end index is outside the CharSequence");
                    }
/* 60 */            BreakIterator wordInstance = BreakIterator.getWordInstance(textLocale);
/* 64 */            i1I1OO00o1o2.I0000oI00 = wordInstance;
/* 73 */            i1I1OO00o1o2.I00000oOI = Math.max(0, -50);
/* 85 */            i1I1OO00o1o2.I0000Il00O = Math.min(text.length(), length + 50);
/* 92 */            wordInstance.setText(new IO11o1i0olIO(length, text));
/* 95 */            VarHandle.storeStoreFence();
/* 98 */            this.I0000oI00 = i1I1OO00o1o2;
/* 110 */           return i1I1OO00o1o2;
                }
            }
