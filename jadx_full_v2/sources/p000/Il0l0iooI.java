            package p000;

            import java.util.LinkedHashMap;
            
            public final class Il0l0iooI {
                public static final Il0l0iooI I00000oOI = new Il0l0iooI(new OoI1iOioli((IlI1o11l0) null, (Ol0oo1IioO) null, (IO100o1) null, (OiO0oIloO1oI) null, (LinkedHashMap) null, 127));
                public final OoI1iOioli I00000oIO;

                public Il0l0iooI(OoI1iOioli ooI1iOioli) {
/* 4 */             this.I00000oIO = ooI1iOioli;
                }

                public final Il0l0iooI I00000oIO(Il0l0iooI il0l0iooI) {
/* 5 */             OoI1iOioli ooI1iOioli = il0l0iooI.I00000oIO;
/* 7 */             IlI1o11l0 ilI1o11l0 = ooI1iOioli.I00000oIO;
/* 9 */             OoI1iOioli ooI1iOioli2 = this.I00000oIO;
/* 11 */            if (ilI1o11l0 == null) {
/* 13 */                ilI1o11l0 = ooI1iOioli2.I00000oIO;
                    }
/* 15 */            Ol0oo1IioO ol0oo1IioO = ooI1iOioli.I00000oOI;
/* 17 */            if (ol0oo1IioO == null) {
/* 19 */                ol0oo1IioO = ooI1iOioli2.I00000oOI;
                    }
/* 21 */            IO100o1 iO100o1 = ooI1iOioli.I0000Il00O;
/* 23 */            if (iO100o1 == null) {
/* 25 */                iO100o1 = ooI1iOioli2.I0000Il00O;
                    }
/* 27 */            OiO0oIloO1oI oiO0oIloO1oI = ooI1iOioli.I0000O;
/* 29 */            if (oiO0oIloO1oI == null) {
/* 31 */                oiO0oIloO1oI = ooI1iOioli2.I0000O;
                    }
/* 46 */            return new Il0l0iooI(new OoI1iOioli(ilI1o11l0, ol0oo1IioO, iO100o1, oiO0oIloO1oI, O1Oii0O0loo.I0001Ioi1lo(ooI1iOioli2.I0001Ioi1lo, ooI1iOioli.I0001Ioi1lo), 32));
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Il0l0iooI) && ((Il0l0iooI) obj).I00000oIO.equals(this.I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 7 */             if (equals(I00000oOI)) {
/* 9 */                 return "EnterTransition.None";
                    }
/* 12 */            OoI1iOioli ooI1iOioli = this.I00000oIO;
/* 14 */            IlI1o11l0 ilI1o11l0 = ooI1iOioli.I00000oIO;
/* 24 */            String string = ilI1o11l0 != null ? ilI1o11l0.toString() : null;
/* 25 */            Ol0oo1IioO ol0oo1IioO = ooI1iOioli.I00000oOI;
/* 34 */            String string2 = ol0oo1IioO != null ? ol0oo1IioO.toString() : null;
/* 35 */            IO100o1 iO100o1 = ooI1iOioli.I0000Il00O;
/* 44 */            String string3 = iO100o1 != null ? iO100o1.toString() : null;
/* 45 */            OiO0oIloO1oI oiO0oIloO1oI = ooI1iOioli.I0000O;
/* 67 */            return IIl001iO0Io.I00100o1O0lo(IIl001iO0Io.I00111O("EnterTransition: Fade - ", string, ", Slide - ", string2, ", Shrink - "), string3, ", Scale - ", oiO0oIloO1oI != null ? oiO0oIloO1oI.toString() : null, ", Veil - null");
                }
            }
