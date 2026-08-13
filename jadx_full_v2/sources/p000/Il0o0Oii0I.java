            package p000;
            
            public final class Il0o0Oii0I extends IOo0i1 {
                public final IOIOill I00000oOI;
                public final OI1Iio0ii1 I0000Il00O;

                public Il0o0Oii0I(IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii1) {
/* 6 */             super(new OIoi0IIoi(iOIOill, oI1Iio0ii1));
/* 9 */             this.I00000oOI = iOIOill;
/* 11 */            this.I0000Il00O = oI1Iio0ii1;
                }

                @Override
                public final O0iIl1 I00000oIO(OI0010oo1o oI0010oo1o) {
                    Ol0O0iI0l0O ol0O0iI0l0OI00Ol10;
/* 1 */             IOIOill iOIOill = this.I00000oOI;
/* 3 */             OI000ilOol oI000ilOolI00000oIO = ilOOOOloO.I00000oIO(oI0010oo1o, iOIOill);
/* 7 */             if (oI000ilOolI00000oIO != null) {
/* 9 */                 int i = IiOiIO0i1Oil.I00000oIO;
/* 17 */                if (!IiOiIO0i1Oil.I000l1(oI000ilOolI00000oIO, IOIOllO1oli.I00iiO)) {
/* 20 */                    oI000ilOolI00000oIO = null;
                        }
/* 21 */                if (oI000ilOolI00000oIO != null && (ol0O0iI0l0OI00Ol10 = oI000ilOolI00000oIO.I00Ol10()) != null) {
/* 29 */                    return ol0O0iI0l0OI00Ol10;
                        }
                    }
/* 44 */            return Il0ooiloI.I00000oOI(Il0ooO1IO.I00oo1iO0ll, iOIOill.toString(), this.I0000Il00O.I00iOIl);
                }

                @Override
                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 12 */            sb.append(this.I00000oOI.I0001Ioi1lo());
/* 17 */            sb.append('.');
/* 22 */            sb.append(this.I0000Il00O);
/* 25 */            return sb.toString();
                }
            }
