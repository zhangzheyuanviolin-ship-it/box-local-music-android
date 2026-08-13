            package p000;
            
            public final class I01loo1IoIl0 extends I01loIooI {
                public static I01loo1IoIl0 I0000O;
                public static final Oi0il01O01IO I0000oI00 = Oi0il01O01IO.I00iiI;
                public static final Oi0il01O01IO I0001Ioi1lo = Oi0il01O01IO.I00iOIl;
                public Oo0iil0o0oI I0000Il00O;

                @Override
                public final int[] I000iOII(int i) {
                    int iI0000O;
/* 10 */            if (I000oI1ioi().length() > 0 && i < I000oI1ioi().length()) {
/* 24 */                Oo0iil0o0oI oo0iil0o0oI = this.I0000Il00O;
/* 26 */                Oi0il01O01IO oi0il01O01IO = I0000oI00;
/* 30 */                if (i < 0) {
/* 32 */                    if (oo0iil0o0oI == null) {
/* 42 */                        O0000Ioio00.I000OOo1O("layoutResult");
/* 45 */                        throw null;
                            }
/* 37 */                    iI0000O = oo0iil0o0oI.I00000oOI.I0000O(0);
                        } else {
/* 46 */                    if (oo0iil0o0oI == null) {
/* 96 */                        O0000Ioio00.I000OOo1O("layoutResult");
/* 168 */                       throw null;
                            }
/* 50 */                    int iI0000O2 = oo0iil0o0oI.I00000oOI.I0000O(i);
/* 62 */                    iI0000O = I001l0I00(iI0000O2, oi0il01O01IO) == i ? iI0000O2 : iI0000O2 + 1;
                        }
/* 64 */                Oo0iil0o0oI oo0iil0o0oI2 = this.I0000Il00O;
/* 66 */                if (oo0iil0o0oI2 == null) {
/* 92 */                    O0000Ioio00.I000OOo1O("layoutResult");
/* 95 */                    throw null;
                        }
/* 72 */                if (iI0000O < oo0iil0o0oI2.I00000oOI.I0001Ioi1lo) {
/* 87 */                    return I000o00OoI0I(I001l0I00(iI0000O, oi0il01O01IO), I001l0I00(iI0000O, I0001Ioi1lo) + 1);
                        }
                    }
/* 9 */             return null;
                }

                @Override
                public final int[] I001i1lo1io(int i) {
                    int iI0000O;
/* 10 */            if (I000oI1ioi().length() > 0 && i > 0) {
/* 20 */                int length = I000oI1ioi().length();
/* 24 */                Oo0iil0o0oI oo0iil0o0oI = this.I0000Il00O;
/* 26 */                Oi0il01O01IO oi0il01O01IO = I0001Ioi1lo;
/* 30 */                if (i > length) {
/* 32 */                    if (oo0iil0o0oI == null) {
/* 49 */                        O0000Ioio00.I000OOo1O("layoutResult");
/* 52 */                        throw null;
                            }
/* 44 */                    iI0000O = oo0iil0o0oI.I00000oOI.I0000O(I000oI1ioi().length());
                        } else {
/* 53 */                    if (oo0iil0o0oI == null) {
/* 93 */                        O0000Ioio00.I000OOo1O("layoutResult");
/* 168 */                       throw null;
                            }
/* 57 */                    int iI0000O2 = oo0iil0o0oI.I00000oOI.I0000O(i);
/* 71 */                    iI0000O = I001l0I00(iI0000O2, oi0il01O01IO) + 1 == i ? iI0000O2 : iI0000O2 - 1;
                        }
/* 73 */                if (iI0000O >= 0) {
/* 88 */                    return I000o00OoI0I(I001l0I00(iI0000O, I0000oI00), I001l0I00(iI0000O, oi0il01O01IO) + 1);
                        }
                    }
/* 9 */             return null;
                }

                public final int I001l0I00(int i, Oi0il01O01IO oi0il01O01IO) {
/* 1 */             Oo0iil0o0oI oo0iil0o0oI = this.I0000Il00O;
/* 6 */             if (oo0iil0o0oI == null) {
/* 55 */                O0000Ioio00.I000OOo1O("layoutResult");
/* 106 */               throw null;
                    }
/* 8 */             int iI000O01llI0 = oo0iil0o0oI.I000O01llI0(i);
/* 12 */            Oo0iil0o0oI oo0iil0o0oI2 = this.I0000Il00O;
/* 14 */            if (oo0iil0o0oI2 == null) {
/* 51 */                O0000Ioio00.I000OOo1O("layoutResult");
/* 54 */                throw null;
                    }
/* 16 */            Oi0il01O01IO oi0il01O01IOI000OOo1O = oo0iil0o0oI2.I000OOo1O(iI000O01llI0);
/* 20 */            Oo0iil0o0oI oo0iil0o0oI3 = this.I0000Il00O;
/* 22 */            if (oi0il01O01IO != oi0il01O01IOI000OOo1O) {
/* 24 */                if (oo0iil0o0oI3 != null) {
/* 26 */                    return oo0iil0o0oI3.I000O01llI0(i);
                        }
/* 31 */                O0000Ioio00.I000OOo1O("layoutResult");
/* 34 */                throw null;
                    }
/* 35 */            if (oo0iil0o0oI3 != null) {
/* 44 */                return oo0iil0o0oI3.I00000oOI.I0000Il00O(i, false) - 1;
                    }
/* 47 */            O0000Ioio00.I000OOo1O("layoutResult");
/* 50 */            throw null;
                }
            }
