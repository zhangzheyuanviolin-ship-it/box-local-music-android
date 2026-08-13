            package p000;

            import android.os.LocaleList;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            
            public final class O11oilI {
                public static final O11oilI I00000oOI = I0000Il00O(new LocaleList(new Locale[0]));
                public O11olI1o I00000oIO;

                public static O11oilI I0000Il00O(LocaleList localeList) {
/* 5 */             O11olI1o o11olI1o = new O11olI1o();
/* 8 */             o11olI1o.I00000oIO = localeList;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            O11oilI o11oilI = new O11oilI();
/* 16 */            o11oilI.I00000oIO = o11olI1o;
/* 18 */            VarHandle.storeStoreFence();
/* 29 */            return o11oilI;
                }

                public final Locale I00000oIO(int i) {
/* 5 */             return this.I00000oIO.I00000oIO.get(i);
                }

                public final int I00000oOI() {
/* 5 */             return this.I00000oIO.I00000oIO.size();
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof O11oilI) && this.I00000oIO.equals(((O11oilI) obj).I00000oIO);
                }

                public final int hashCode() {
/* 5 */             return this.I00000oIO.I00000oIO.hashCode();
                }

                public final String toString() {
/* 5 */             return this.I00000oIO.I00000oIO.toString();
                }
            }
