            package p000;

            import java.util.Collections;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class Oo0I01o {
                public I1111OO10i I00000oIO;
                public long I00000oOI;
                public Oo0iil0o0oI I0000Il00O;
                public OIOlOI I0000O;
                public Oo0l1Ooo I0000oI00;
                public long I0001Ioi1lo;
                public I1111OO10i I000II;
                public Oo0OI01Il I000O01llI0;
                public Oo0il0olo1l I000OOo1O;

                public final List I00000oIO(Function1 function1) {
/* 7 */             if (!Oo0lI00l.I0000O(this.I0001Ioi1lo)) {
/* 57 */                return IOOi1I.I000O01llI0(new IOi0OoOOIlli("", 0), new Oio0ilI1l(Oo0lI00l.I000II(this.I0001Ioi1lo), Oo0lI00l.I000II(this.I0001Ioi1lo)));
                    }
/* 13 */            Iioi1O iioi1O = (Iioi1O) function1.invoke(this);
/* 15 */            if (iioi1O != null) {
/* 17 */                return Collections.singletonList(iioi1O);
                    }
/* 22 */            return null;
                }

                public final Integer I00000oOI() {
/* 1 */             OIOlOI oIOlOI = this.I0000O;
/* 3 */             Oo0iil0o0oI oo0iil0o0oI = this.I0000Il00O;
/* 5 */             if (oo0iil0o0oI == null) {
/* 37 */                return null;
                    }
/* 7 */             OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 32 */            return Integer.valueOf(oIOlOI.I000O01llI0(oI0OIIiOi.I0000Il00O(oI0OIIiOi.I0000O(oIOlOI.I000o00OoI0I(Oo0lI00l.I0001Ioi1lo(this.I0001Ioi1lo))), true)));
                }

                public final Integer I0000Il00O() {
/* 1 */             OIOlOI oIOlOI = this.I0000O;
/* 3 */             Oo0iil0o0oI oo0iil0o0oI = this.I0000Il00O;
/* 5 */             if (oo0iil0o0oI == null) {
/* 36 */                return null;
                    }
/* 31 */            return Integer.valueOf(oIOlOI.I000O01llI0(oo0iil0o0oI.I000O01llI0(oo0iil0o0oI.I00000oOI.I0000O(oIOlOI.I000o00OoI0I(Oo0lI00l.I000II(this.I0001Ioi1lo))))));
                }

                public final Integer I0000O() {
                    int length;
/* 1 */             Oo0iil0o0oI oo0iil0o0oI = this.I0000Il00O;
/* 3 */             if (oo0iil0o0oI == null) {
/* 69 */                return null;
                    }
/* 5 */             int iI0010I0i = I0010I0i();
/* 9 */             I1111OO10i i1111OO10i = this.I00000oIO;
                    while (true) {
/* 17 */                if (iI0010I0i < i1111OO10i.I00iiI.length()) {
                            int length2 = this.I000II.I00iiI.length() - 1;
/* 36 */                    if (iI0010I0i <= length2) {
/* 39 */                        length2 = iI0010I0i;
                            }
/* 40 */                    long jI000iOII = oo0iil0o0oI.I000iOII(length2);
/* 44 */                    int i = Oo0lI00l.I0000Il00O;
/* 52 */                    int i2 = (int) (jI000iOII & 4294967295L);
/* 53 */                    if (i2 > iI0010I0i) {
/* 60 */                        length = this.I0000O.I000O01llI0(i2);
                                break;
                            }
/* 55 */                    iI0010I0i++;
                        } else {
/* 21 */                    length = i1111OO10i.I00iiI.length();
                            break;
                        }
                    }
/* 64 */            return Integer.valueOf(length);
                }

                public final Integer I0000oI00() {
                    int iI000O01llI0;
/* 1 */             Oo0iil0o0oI oo0iil0o0oI = this.I0000Il00O;
/* 3 */             if (oo0iil0o0oI == null) {
/* 53 */                return null;
                    }
/* 5 */             int iI0010I0i = I0010I0i();
                    while (true) {
/* 9 */                 if (iI0010I0i <= 0) {
/* 11 */                    iI000O01llI0 = 0;
                            break;
                        }
                        int length = this.I000II.I00iiI.length() - 1;
/* 23 */                if (iI0010I0i <= length) {
/* 26 */                    length = iI0010I0i;
                        }
/* 27 */                long jI000iOII = oo0iil0o0oI.I000iOII(length);
/* 31 */                int i = Oo0lI00l.I0000Il00O;
/* 36 */                int i2 = (int) (jI000iOII >> 32);
/* 37 */                if (i2 < iI0010I0i) {
/* 44 */                    iI000O01llI0 = this.I0000O.I000O01llI0(i2);
                            break;
                        }
                        iI0010I0i--;
                    }
/* 48 */            return Integer.valueOf(iI000O01llI0);
                }

                public final boolean I0001Ioi1lo() {
/* 1 */             Oo0iil0o0oI oo0iil0o0oI = this.I0000Il00O;
                    return (oo0iil0o0oI != null ? oo0iil0o0oI.I000OOo1O(I0010I0i()) : null) != Oi0il01O01IO.I00iiI;
                }

                public final int I000II(Oo0iil0o0oI oo0iil0o0oI, int i) {
/* 1 */             int iI0010I0i = I0010I0i();
/* 5 */             Oo0l1Ooo oo0l1Ooo = this.I0000oI00;
/* 9 */             if (oo0l1Ooo.I00000oIO == null) {
/* 21 */                oo0l1Ooo.I00000oIO = Float.valueOf(oo0iil0o0oI.I0000Il00O(iI0010I0i).I00000oIO);
                    }
/* 23 */            OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 29 */            int iI0000O = oI0OIIiOi.I0000O(iI0010I0i) + i;
/* 30 */            if (iI0000O < 0) {
/* 32 */                return 0;
                    }
/* 36 */            if (iI0000O >= oI0OIIiOi.I0001Ioi1lo) {
/* 42 */                return this.I000II.I00iiI.length();
                    }
/* 53 */            float fI00000oOI = oI0OIIiOi.I00000oOI(iI0000O) - 1.0f;
/* 54 */            Float f = oo0l1Ooo.I00000oIO;
/* 56 */            float fFloatValue = f.floatValue();
/* 64 */            if ((I0001Ioi1lo() && fFloatValue >= oo0iil0o0oI.I000II(iI0000O)) || (!I0001Ioi1lo() && fFloatValue <= oo0iil0o0oI.I0001Ioi1lo(iI0000O))) {
/* 89 */                return oI0OIIiOi.I0000Il00O(iI0000O, true);
                    }
/* 124 */           return this.I0000O.I000O01llI0(oI0OIIiOi.I000II((Float.floatToRawIntBits(fI00000oOI) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
                }

                /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000O01llI0(Oo0il0olo1l oo0il0olo1l, int i) {
                    OOo0IO oOo0IOI00IoiI;
/* 1 */             OIOlOI oIOlOI = this.I0000O;
/* 3 */             O0iOOo0Ii o0iOOo0Ii = oo0il0olo1l.I00000oOI;
/* 5 */             Oo0iil0o0oI oo0iil0o0oI = oo0il0olo1l.I00000oIO;
/* 7 */             if (o0iOOo0Ii == null) {
/* 22 */                oOo0IOI00IoiI = OOo0IO.I0000oI00;
                    } else {
/* 9 */                 O0iOOo0Ii o0iOOo0Ii2 = oo0il0olo1l.I0000Il00O;
/* 19 */                oOo0IOI00IoiI = o0iOOo0Ii2 != null ? o0iOOo0Ii2.I00IoiI(o0iOOo0Ii, true) : null;
/* 20 */                if (oOo0IOI00IoiI == null) {
                        }
                    }
/* 26 */            long j = this.I000O01llI0.I00000oOI;
/* 28 */            int i2 = Oo0lI00l.I0000Il00O;
/* 41 */            OOo0IO oOo0IOI0000Il00O = oo0iil0o0oI.I0000Il00O(oIOlOI.I000o00OoI0I((int) (j & 4294967295L)));
/* 45 */            float f = oOo0IOI0000Il00O.I00000oIO;
/* 61 */            float fIntBitsToFloat = (Float.intBitsToFloat((int) (oOo0IOI00IoiI.I0000O() & 4294967295L)) * i) + oOo0IOI0000Il00O.I00000oOI;
/* 83 */            return oIOlOI.I000O01llI0(oo0iil0o0oI.I00000oOI.I000II((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
                }

                public final void I000OOo1O() {
/* 1 */             Oo0l1Ooo oo0l1Ooo = this.I0000oI00;
/* 4 */             oo0l1Ooo.I00000oIO = null;
/* 6 */             I1111OO10i i1111OO10i = this.I000II;
/* 14 */            if (i1111OO10i.I00iiI.length() > 0) {
/* 20 */                if (I0001Ioi1lo()) {
/* 22 */                    I000iOII();
/* 25 */                    return;
                        }
/* 26 */                oo0l1Ooo.I00000oIO = null;
/* 34 */                if (i1111OO10i.I00iiI.length() > 0) {
/* 36 */                    String str = i1111OO10i.I00iiI;
/* 38 */                    long j = this.I0001Ioi1lo;
/* 40 */                    int i = Oo0lI00l.I0000Il00O;
/* 49 */                    int iI00000oIO = lOOoIo11O.I00000oIO((int) (j & 4294967295L), str);
/* 54 */                    if (iI00000oIO != -1) {
/* 56 */                        I00100o1O0lo(iI00000oIO, iI00000oIO);
                            }
                        }
                    }
                }

                public final void I000OiO() {
/* 4 */             this.I0000oI00.I00000oIO = null;
/* 6 */             I1111OO10i i1111OO10i = this.I000II;
/* 8 */             String str = i1111OO10i.I00iiI;
/* 10 */            String str2 = i1111OO10i.I00iiI;
/* 16 */            if (str.length() > 0) {
/* 24 */                int iI00000oIO = lOOlo0i1i0.I00000oIO(Oo0lI00l.I0001Ioi1lo(this.I0001Ioi1lo), str2);
/* 34 */                if (iI00000oIO == Oo0lI00l.I0001Ioi1lo(this.I0001Ioi1lo) && iI00000oIO != str2.length()) {
/* 44 */                    iI00000oIO = lOOlo0i1i0.I00000oIO(iI00000oIO + 1, str2);
                        }
/* 48 */                I00100o1O0lo(iI00000oIO, iI00000oIO);
                    }
                }

                public final void I000iOII() {
/* 4 */             this.I0000oI00.I00000oIO = null;
/* 6 */             I1111OO10i i1111OO10i = this.I000II;
/* 14 */            if (i1111OO10i.I00iiI.length() > 0) {
/* 16 */                String str = i1111OO10i.I00iiI;
/* 18 */                long j = this.I0001Ioi1lo;
/* 20 */                int i = Oo0lI00l.I0000Il00O;
/* 29 */                int iI00000oOI = lOOoIo11O.I00000oOI((int) (j & 4294967295L), str);
/* 34 */                if (iI00000oOI != -1) {
/* 36 */                    I00100o1O0lo(iI00000oOI, iI00000oOI);
                        }
                    }
                }

                public final void I000l1() {
/* 4 */             this.I0000oI00.I00000oIO = null;
/* 6 */             I1111OO10i i1111OO10i = this.I000II;
/* 8 */             String str = i1111OO10i.I00iiI;
/* 10 */            String str2 = i1111OO10i.I00iiI;
/* 16 */            if (str.length() > 0) {
/* 24 */                int iI00000oOI = lOOlo0i1i0.I00000oOI(Oo0lI00l.I000II(this.I0001Ioi1lo), str2);
/* 34 */                if (iI00000oOI == Oo0lI00l.I000II(this.I0001Ioi1lo) && iI00000oOI != 0) {
/* 40 */                    iI00000oOI = lOOlo0i1i0.I00000oOI(iI00000oOI - 1, str2);
                        }
/* 44 */                I00100o1O0lo(iI00000oOI, iI00000oOI);
                    }
                }

                public final void I000lI() {
/* 1 */             Oo0l1Ooo oo0l1Ooo = this.I0000oI00;
/* 4 */             oo0l1Ooo.I00000oIO = null;
/* 6 */             I1111OO10i i1111OO10i = this.I000II;
/* 14 */            if (i1111OO10i.I00iiI.length() > 0) {
/* 20 */                if (!I0001Ioi1lo()) {
/* 56 */                    I000iOII();
/* 110 */                   return;
                        }
/* 22 */                oo0l1Ooo.I00000oIO = null;
/* 30 */                if (i1111OO10i.I00iiI.length() > 0) {
/* 32 */                    String str = i1111OO10i.I00iiI;
/* 34 */                    long j = this.I0001Ioi1lo;
/* 36 */                    int i = Oo0lI00l.I0000Il00O;
/* 45 */                    int iI00000oIO = lOOoIo11O.I00000oIO((int) (j & 4294967295L), str);
/* 50 */                    if (iI00000oIO != -1) {
/* 52 */                        I00100o1O0lo(iI00000oIO, iI00000oIO);
                            }
                        }
                    }
                }

                public final void I000o00OoI0I() {
                    Integer numI00000oOI;
/* 4 */             this.I0000oI00.I00000oIO = null;
/* 14 */            if (this.I000II.I00iiI.length() <= 0 || (numI00000oOI = I00000oOI()) == null) {
/* 55 */                return;
                    }
/* 22 */            int iIntValue = numI00000oOI.intValue();
/* 26 */            I00100o1O0lo(iIntValue, iIntValue);
                }

                public final void I000oI1ioi() {
                    Integer numI0000Il00O;
/* 4 */             this.I0000oI00.I00000oIO = null;
/* 14 */            if (this.I000II.I00iiI.length() <= 0 || (numI0000Il00O = I0000Il00O()) == null) {
/* 55 */                return;
                    }
/* 22 */            int iIntValue = numI0000Il00O.intValue();
/* 26 */            I00100o1O0lo(iIntValue, iIntValue);
                }

                public final void I00100l0() {
/* 9 */             if (this.I000II.I00iiI.length() > 0) {
/* 11 */                long j = this.I00000oOI;
/* 13 */                int i = Oo0lI00l.I0000Il00O;
/* 32 */                this.I0001Ioi1lo = lOliOi0Oi.I00000oIO((int) (j >> 32), (int) (this.I0001Ioi1lo & 4294967295L));
                    }
                }

                public final void I00100o1O0lo(int i, int i2) {
/* 5 */             this.I0001Ioi1lo = lOliOi0Oi.I00000oIO(i, i2);
                }

                public final int I0010I0i() {
/* 1 */             OIOlOI oIOlOI = this.I0000O;
/* 3 */             long j = this.I0001Ioi1lo;
/* 5 */             int i = Oo0lI00l.I0000Il00O;
/* 14 */            return oIOlOI.I000o00OoI0I((int) (j & 4294967295L));
                }
            }
