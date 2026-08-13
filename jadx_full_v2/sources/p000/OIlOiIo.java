            package p000;
            
/* 3 */     public abstract class OIlOiIo extends OIliIIlo11I0 {
                private OIlolo I00iiI;

                public OIlOiIo() {
                }

                public static String I00000oOI(float[] fArr) {
/* 5 */             StringBuilder sb = new StringBuilder("[");
/* 10 */            for (int i = 0; i < fArr.length; i++) {
/* 12 */                if (i > 0) {
/* 16 */                    sb.append(", ");
                        }
/* 21 */                sb.append(fArr[i]);
                    }
/* 29 */            sb.append(']');
/* 32 */            return sb.toString();
                }

                public static String I0000Il00O(Object[] objArr) {
/* 5 */             StringBuilder sb = new StringBuilder("[");
/* 10 */            for (int i = 0; i < objArr.length; i++) {
/* 12 */                if (i > 0) {
/* 16 */                    sb.append(", ");
                        }
/* 21 */                sb.append(objArr[i]);
                    }
/* 29 */            sb.append(']');
/* 32 */            return sb.toString();
                }

                public static OIlOiIo I0000O(IIOoi0ooOoO iIOoi0ooOoO) {
/* 3 */             String strI010101Oo1lO = iIOoi0ooOoO.I010101Oo1lO(IIi0I0I0o.I0I0Oi);
                    return OIo0O1iOoool.I00iiO.equals(strI010101Oo1lO) ? new OIo0O1iOoool(iIOoi0ooOoO) : OIlllOo01.I00iio.equals(strI010101Oo1lO) ? new OIlllOo01(iIOoi0ooOoO) : OIloIiI0oI.I00iio.equals(strI010101Oo1lO) ? new OIloIiI0oI(iIOoi0ooOoO) : "Table".equals(strI010101Oo1lO) ? new OIloo1iol0o(iIOoi0ooOoO) : OIllioIilO.I00iio.equals(strI010101Oo1lO) ? new OIllioIilO(iIOoi0ooOoO) : (OIliiiIOo.I01Ol1o0.equals(strI010101Oo1lO) || OIliiiIOo.I01OlIoIl.equals(strI010101Oo1lO) || OIliiiIOo.I01OlOoii0.equals(strI010101Oo1lO) || OIliiiIOo.I01Olioli.equals(strI010101Oo1lO) || OIliiiIOo.I01OoIoio00O.equals(strI010101Oo1lO) || OIliiiIOo.I01OoOi.equals(strI010101Oo1lO) || OIliiiIOo.I01OooO0o0o.equals(strI010101Oo1lO)) ? new OIliiiIOo(iIOoi0ooOoO) : new OIlOoi00(iIOoi0ooOoO);
                }

                private OIlolo I0001Ioi1lo() {
/* 1 */             return this.I00iiI;
                }

                private boolean I000O01llI0(IIOoOiOI iIOoOiOI, IIOoOiOI iIOoOiOI2) {
                    return iIOoOiOI == null ? iIOoOiOI2 != null : true ^ iIOoOiOI.equals(iIOoOiOI2);
                }

                public String I0000oI00() {
/* 7 */             return I00Io1lO().I010101Oo1lO(IIi0I0I0o.I0I0Oi);
                }

                public boolean I000II() {
                    return I00Io1lO().I00iOIl.size() == 1 && I0000oI00() != null;
                }

                public void I000OOo1O() {
/* 5 */             if (I0001Ioi1lo() != null) {
/* 11 */                I0001Ioi1lo().I001IO000(this);
                    }
                }

                public void I000OiO(IIOoOiOI iIOoOiOI, IIOoOiOI iIOoOiOI2) {
/* 5 */             if (I000O01llI0(iIOoOiOI, iIOoOiOI2)) {
/* 7 */                 I000OOo1O();
                    }
                }

                public void I000iOII(String str) {
/* 7 */             I00Io1lO().I010l10O(IIi0I0I0o.I0I0Oi, str);
                }

                public void I000l1(OIlolo oIlolo) {
/* 1 */             this.I00iiI = oIlolo;
                }

                public String toString() {
/* 15 */            return "O=" + I0000oI00();
                }

/* 4 */         public OIlOiIo(IIOoi0ooOoO iIOoi0ooOoO) {
/* 5 */             super(iIOoi0ooOoO);
                }
            }
