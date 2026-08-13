            package p000;

            import android.os.LocaleList;
            import android.text.Spannable;
            import android.text.style.AbsoluteSizeSpan;
            import android.text.style.ForegroundColorSpan;
            import android.text.style.LocaleSpan;
            import android.text.style.RelativeSizeSpan;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Locale;
            
            public abstract class lOO1lI1o {
                public static final float I00000oIO(long j, float f, IiIooOOOI iiIooOOOI) {
/* 7 */             if (Oo0o1OiIo.I00000oOI(j, Oo0o1OiIo.I0000Il00O)) {
/* 9 */                 return f;
                    }
/* 10 */            long jI0000Il00O = Oo0o1OiIo.I0000Il00O(j);
/* 23 */            if (Oo0o1iioOiO.I00000oOI(jI0000Il00O, 4294967296L)) {
/* 25 */                return iiIooOOOI.I00oO101o(j);
                    }
/* 39 */            if (Oo0o1iioOiO.I00000oOI(jI0000Il00O, 8589934592L)) {
/* 45 */                return Oo0o1OiIo.I0000O(j) * f;
                    }
/* 47 */            return Float.NaN;
                }

                public static final float I00000oOI(long j, float f, IiIooOOOI iiIooOOOI) {
                    float fI0000O;
/* 1 */             long jI0000Il00O = Oo0o1OiIo.I0000Il00O(j);
/* 14 */            if (Oo0o1iioOiO.I00000oOI(jI0000Il00O, 4294967296L)) {
/* 28 */                if (iiIooOOOI.I00Ol00() <= 1.05d) {
/* 45 */                    return iiIooOOOI.I00oO101o(j);
                        }
/* 42 */                fI0000O = Oo0o1OiIo.I0000O(j) / Oo0o1OiIo.I0000O(iiIooOOOI.I00Io1o110i(f));
                    } else {
/* 59 */                if (!Oo0o1iioOiO.I00000oOI(jI0000Il00O, 8589934592L)) {
/* 66 */                    return Float.NaN;
                        }
/* 61 */                fI0000O = Oo0o1OiIo.I0000O(j);
                    }
/* 43 */            return fI0000O * f;
                }

                public static final void I0000Il00O(Spannable spannable, long j, int i, int i2) {
/* 5 */             if (j != 16) {
/* 18 */                spannable.setSpan(new ForegroundColorSpan(iiO01ll11o1l.I000OOo1O(j)), i, i2, 33);
                    }
                }

                public static final void I0000O(Spannable spannable, long j, IiIooOOOI iiIooOOOI, int i, int i2) {
/* 1 */             long jI0000Il00O = Oo0o1OiIo.I0000Il00O(j);
/* 16 */            if (Oo0o1iioOiO.I00000oOI(jI0000Il00O, 4294967296L)) {
/* 32 */                spannable.setSpan(new AbsoluteSizeSpan(O1OooO0IlOo.I000II(iiIooOOOI.I00oO101o(j)), false), i, i2, 33);
                    } else if (Oo0o1iioOiO.I00000oOI(jI0000Il00O, 8589934592L)) {
/* 56 */                spannable.setSpan(new RelativeSizeSpan(Oo0o1OiIo.I0000O(j)), i, i2, 33);
                    }
                }

                public static final void I0000oI00(Spannable spannable, O11oiiOIl0O o11oiiOIl0O, int i, int i2) {
/* 1 */             if (o11oiiOIl0O != null) {
/* 11 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(o11oiiOIl0O, 10));
/* 16 */                Iterator it = o11oiiOIl0O.I00iOIl.iterator();
/* 24 */                while (it.hasNext()) {
/* 34 */                    arrayList.add(((O11oOOio1iO) it.next()).I00000oIO);
                        }
/* 45 */                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
/* 66 */                spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
                    }
                }
            }
