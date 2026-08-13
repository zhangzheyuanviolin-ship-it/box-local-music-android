            package p000;
            
            public final class OI0i1o0iOo0 {
                public long I00000oIO;
                public Oiii0oI1o I00000oOI;
                public Oiii0oI1o I0000Il00O;
                public Oiii0oI1o I0000O;
                public III0Ii I0000oI00;
                public OI0i1o0iOo0 I0001Ioi1lo;
                public Oo0iil0o0oI I000II;
                public int I000O01llI0;

                public final long I00000oIO(OiiOlI0I oiiOlI0I, boolean z) {
                    Oo0iil0o0oI oo0iil0o0oI;
/* 1 */             OiiOOli oiiOOli = oiiOlI0I.I00000oOI;
/* 3 */             OiiOOli oiiOOli2 = oiiOlI0I.I00000oIO;
/* 5 */             long j = this.I00000oIO;
/* 7 */             if (z && oiiOOli2.I0000Il00O != j) {
/* 41 */                return 9205357640488583168L;
                    }
/* 15 */            if ((!z && oiiOOli.I0000Il00O != j) || I0000Il00O() == null || (oo0iil0o0oI = (Oo0iil0o0oI) this.I0000Il00O.invoke()) == null) {
/* 41 */                return 9205357640488583168L;
                    }
/* 65 */            return lOliOi11oo1.I00000oIO(oo0iil0o0oI, lIiioliIlo.I0000Il00O(z ? oiiOOli2.I00000oOI : oiiOOli.I00000oOI, 0, I00000oOI(oo0iil0o0oI)), z, oiiOlI0I.I0000Il00O);
                }

                public final int I00000oOI(Oo0iil0o0oI oo0iil0o0oI) {
                    int i;
                    int iI0000oI00;
                    synchronized (this.I0001Ioi1lo) {
                        try {
/* 6 */                     if (this.I000II != oo0iil0o0oI) {
/* 13 */                        if (oo0iil0o0oI.I0000O()) {
/* 15 */                            OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 19 */                            if (oI0OIIiOi.I0000Il00O) {
/* 74 */                                iI0000oI00 = oo0iil0o0oI.I00000oOI.I0001Ioi1lo - 1;
/* 81 */                                this.I000O01llI0 = oo0iil0o0oI.I00000oOI.I0000Il00O(iI0000oI00, true);
/* 83 */                                this.I000II = oo0iil0o0oI;
                                    } else {
/* 32 */                                iI0000oI00 = oI0OIIiOi.I0000oI00((int) (oo0iil0o0oI.I0000Il00O & 4294967295L));
/* 40 */                                int i2 = oo0iil0o0oI.I00000oOI.I0001Ioi1lo - 1;
/* 41 */                                if (iI0000oI00 > i2) {
/* 43 */                                    iI0000oI00 = i2;
                                        }
/* 44 */                                while (iI0000oI00 >= 0 && oo0iil0o0oI.I00000oOI.I0001Ioi1lo(iI0000oI00) >= ((int) (oo0iil0o0oI.I0000Il00O & 4294967295L))) {
                                            iI0000oI00--;
                                        }
/* 66 */                                if (iI0000oI00 < 0) {
/* 68 */                                    iI0000oI00 = 0;
                                        }
/* 81 */                                this.I000O01llI0 = oo0iil0o0oI.I00000oOI.I0000Il00O(iI0000oI00, true);
/* 83 */                                this.I000II = oo0iil0o0oI;
                                    }
                                } else {
/* 74 */                            iI0000oI00 = oo0iil0o0oI.I00000oOI.I0001Ioi1lo - 1;
/* 81 */                            this.I000O01llI0 = oo0iil0o0oI.I00000oOI.I0000Il00O(iI0000oI00, true);
/* 83 */                            this.I000II = oo0iil0o0oI;
                                }
                            }
/* 85 */                    i = this.I000O01llI0;
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
/* 88 */            return i;
                }

                public final O0iOOo0Ii I0000Il00O() {
/* 7 */             O0iOOo0Ii o0iOOo0Ii = (O0iOOo0Ii) this.I00000oOI.invoke();
/* 9 */             if (o0iOOo0Ii == null || !o0iOOo0Ii.I0010o()) {
/* 19 */                return null;
                    }
/* 18 */            return o0iOOo0Ii;
                }

                public final OiiOlI0I I0000O() {
/* 1 */             long j = this.I00000oIO;
/* 9 */             Oo0iil0o0oI oo0iil0o0oI = (Oo0iil0o0oI) this.I0000Il00O.invoke();
/* 11 */            if (oo0iil0o0oI == null) {
/* 13 */                return null;
                    }
/* 21 */            int length = oo0iil0o0oI.I00000oIO.I00000oIO.I00iiI.length();
/* 52 */            return new OiiOlI0I(new OiiOOli(oo0iil0o0oI.I00000oIO(0), 0, j), new OiiOOli(oo0iil0o0oI.I00000oIO(Math.max(length - 1, 0)), length, j), false);
                }

                public final I1111OO10i I0000oI00() {
/* 7 */             Oo0iil0o0oI oo0iil0o0oI = (Oo0iil0o0oI) this.I0000Il00O.invoke();
                    return oo0iil0o0oI == null ? new I1111OO10i("") : oo0iil0o0oI.I00000oIO.I00000oIO;
                }
            }
