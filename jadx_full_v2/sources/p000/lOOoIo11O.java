            package p000;

            import android.text.Spanned;
            import java.text.BreakIterator;
            
            public abstract class lOOoIo11O {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final int I00000oIO(int i, String str) {
                    String str2;
                    int spanEnd;
/* 1 */             IiollO1llli iiollO1llliI0000Il00O = I0000Il00O();
/* 5 */             Integer num = null;
/* 6 */             if (iiollO1llliI0000Il00O != null) {
/* 20 */                lII1OI11o1I.I0000oI00("Not initialized yet", iiollO1llliI0000Il00O.I0000Il00O() == 1);
/* 25 */                lII1OI11o1I.I0000O("charSequence cannot be null", str);
/* 30 */                IOO000ilo iOO000ilo = iiollO1llliI0000Il00O.I0000oI00.I00000oOI;
/* 32 */                iOO000ilo.getClass();
/* 36 */                if (i < 0 || i >= str.length()) {
/* 44 */                    str2 = str;
/* 109 */                   spanEnd = -1;
                        } else if (str instanceof Spanned) {
/* 51 */                    Spanned spanned = (Spanned) str;
/* 61 */                    OoOlI0ii[] ooOlI0iiArr = (OoOlI0ii[]) spanned.getSpans(i, i + 1, OoOlI0ii.class);
/* 64 */                    if (ooOlI0iiArr.length > 0) {
/* 68 */                        spanEnd = spanned.getSpanEnd(ooOlI0iiArr[0]);
/* 72 */                        str2 = str;
                            } else {
/* 99 */                        str2 = str;
/* 106 */                       spanEnd = ((Iiooiil01lII) iOO000ilo.I001lloI(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new Iiooiil01lII(i))).I00iiO;
                            }
                        }
/* 110 */               Integer numValueOf = Integer.valueOf(spanEnd);
/* 114 */               if (spanEnd != -1) {
/* 117 */                   num = numValueOf;
                        }
                    } else {
/* 119 */               str2 = str;
                    }
/* 120 */           if (num != null) {
/* 122 */               return num.intValue();
                    }
/* 127 */           BreakIterator characterInstance = BreakIterator.getCharacterInstance();
/* 131 */           characterInstance.setText(str2);
/* 134 */           return characterInstance.following(i);
                }

                public static final int I00000oOI(int i, String str) {
/* 1 */             IiollO1llli iiollO1llliI0000Il00O = I0000Il00O();
/* 5 */             Integer num = null;
/* 6 */             if (iiollO1llliI0000Il00O != null) {
/* 19 */                Integer numValueOf = Integer.valueOf(iiollO1llliI0000Il00O.I00000oOI(Math.max(0, i - 1), str));
/* 28 */                if (numValueOf.intValue() != -1) {
/* 31 */                    num = numValueOf;
                        }
                    }
/* 32 */            if (num != null) {
/* 34 */                return num.intValue();
                    }
/* 39 */            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
/* 43 */            characterInstance.setText(str);
/* 46 */            return characterInstance.preceding(i);
                }

                public static final IiollO1llli I0000Il00O() {
/* 5 */             if (!IiollO1llli.I0000O()) {
/* 19 */                return null;
                    }
/* 7 */             IiollO1llli iiollO1llliI00000oIO = IiollO1llli.I00000oIO();
/* 16 */            if (iiollO1llliI00000oIO.I0000Il00O() == 1) {
/* 18 */                return iiollO1llliI00000oIO;
                    }
/* 19 */            return null;
                }
            }
