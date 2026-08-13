            package p000;

            import java.util.LinkedHashMap;
            
            public final class Il1OOloOIl1 {
                public static final Il1OOloOIl1 I00000oOI;
                public static final Il1OOloOIl1 I0000Il00O;
                public final OoI1iOioli I00000oIO;

                static {
/* 5 */             LinkedHashMap linkedHashMap = null;
/* 8 */             IlI1o11l0 ilI1o11l0 = null;
/* 9 */             Ol0oo1IioO ol0oo1IioO = null;
/* 10 */            IO100o1 iO100o1 = null;
/* 11 */            OiO0oIloO1oI oiO0oIloO1oI = null;
/* 18 */            I00000oOI = new Il1OOloOIl1(new OoI1iOioli(ilI1o11l0, ol0oo1IioO, iO100o1, oiO0oIloO1oI, linkedHashMap, 127));
/* 32 */            I0000Il00O = new Il1OOloOIl1(new OoI1iOioli(ilI1o11l0, ol0oo1IioO, iO100o1, oiO0oIloO1oI, linkedHashMap, 95));
                }

                public Il1OOloOIl1(OoI1iOioli ooI1iOioli) {
/* 4 */             this.I00000oIO = ooI1iOioli;
                }

                public final Il1OOloOIl1 I00000oIO(Il1OOloOIl1 il1OOloOIl1) {
/* 5 */             OoI1iOioli ooI1iOioli = il1OOloOIl1.I00000oIO;
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
/* 56 */            return new Il1OOloOIl1(new OoI1iOioli(ilI1o11l0, ol0oo1IioO, iO100o1, oiO0oIloO1oI, ooI1iOioli.I0000oI00 || ooI1iOioli2.I0000oI00, O1Oii0O0loo.I0001Ioi1lo(ooI1iOioli2.I0001Ioi1lo, ooI1iOioli.I0001Ioi1lo)));
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Il1OOloOIl1) && ((Il1OOloOIl1) obj).I00000oIO.equals(this.I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 7 */             if (equals(I00000oOI)) {
/* 9 */                 return "ExitTransition.None";
                    }
/* 18 */            if (equals(I0000Il00O)) {
/* 20 */                return "ExitTransition.KeepUntilTransitionsFinished";
                    }
/* 23 */            OoI1iOioli ooI1iOioli = this.I00000oIO;
/* 25 */            IlI1o11l0 ilI1o11l0 = ooI1iOioli.I00000oIO;
/* 35 */            String string = ilI1o11l0 != null ? ilI1o11l0.toString() : null;
/* 36 */            Ol0oo1IioO ol0oo1IioO = ooI1iOioli.I00000oOI;
/* 45 */            String string2 = ol0oo1IioO != null ? ol0oo1IioO.toString() : null;
/* 46 */            IO100o1 iO100o1 = ooI1iOioli.I0000Il00O;
/* 55 */            String string3 = iO100o1 != null ? iO100o1.toString() : null;
/* 56 */            OiO0oIloO1oI oiO0oIloO1oI = ooI1iOioli.I0000O;
/* 60 */            String string4 = oiO0oIloO1oI != null ? oiO0oIloO1oI.toString() : null;
/* 64 */            boolean z = ooI1iOioli.I0000oI00;
/* 72 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("ExitTransition:  Fade - ", string, ",  Slide - ", string2, ",  Shrink - ");
/* 80 */            IIl001iO0Io.I001lIiIIo1O(sbI00111O, string3, ",  Scale - ", string4, ",  Veil - null,  KeepUntilTransitionsFinished - ");
/* 83 */            sbI00111O.append(z);
/* 86 */            return sbI00111O.toString();
                }
            }
