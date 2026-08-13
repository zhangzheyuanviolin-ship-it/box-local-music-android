            package p000;

            import android.os.DeadObjectException;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            
/* 10 */    public final class i0OoOioOOio extends i0OlOlO {
                public final OloIlI0ll I00000oOI;
                public final int I0000Il00O;
                public Object I0000O;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public i0OoOioOOio(O10oo000lo o10oo000lo, OloIlI0ll oloIlI0ll) {
/* 6 */             this(4, oloIlI0ll, (byte) 0);
/* 2 */             this.I0000Il00O = 1;
/* 9 */             this.I0000O = o10oo000lo;
                }

                @Override
                public final IlIII1l[] I00000oIO(i0Ol1Ool00 i0ol1ool00) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 37 */                    return (IlIII1l[]) ((i0OliI1oo1) this.I0000O).I00000oIO.I0000Il00O;
                        default:
/* 16 */                    i0OliI1oo1 i0olii1oo1 = (i0OliI1oo1) i0ol1ool00.I000l1.get((O10oo000lo) this.I0000O);
/* 18 */                    if (i0olii1oo1 == null) {
/* 20 */                        return null;
                            }
/* 26 */                    return (IlIII1l[]) i0olii1oo1.I00000oIO.I0000Il00O;
                    }
                }

                @Override
                public final boolean I00000oOI(i0Ol1Ool00 i0ol1ool00) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 36 */                    return ((i0OliI1oo1) this.I0000O).I00000oIO.I00000oIO;
                        default:
/* 16 */                    i0OliI1oo1 i0olii1oo1 = (i0OliI1oo1) i0ol1ool00.I000l1.get((O10oo000lo) this.I0000O);
                            return i0olii1oo1 != null && i0olii1oo1.I00000oIO.I00000oIO;
                    }
                }

                @Override
                public final int I0000Il00O(i0Ol1Ool00 i0ol1ool00) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 28 */                    I1ii1l10IO i1ii1l10IO = ((i0OliI1oo1) this.I0000O).I00000oIO;
                            break;
                        default:
/* 19 */                    if (((i0OliI1oo1) i0ol1ool00.I000l1.get((O10oo000lo) this.I0000O)) != null) {
                            }
                            break;
                    }
/* 3 */             return 0;
                }

                @Override
                public final void I0000O(Status status) {
/* 8 */             this.I00000oOI.I0000Il00O(new I11OiOl(status));
                }

                @Override
                public final void I0000oI00(Exception exc) {
/* 3 */             this.I00000oOI.I0000Il00O(exc);
                }

                @Override
                public final void I0001Ioi1lo(OoIol00Ool ooIol00Ool, boolean z) {
/* 1 */             int i = this.I0000Il00O;
                }

                @Override
                public final void I000II(i0Ol1Ool00 i0ol1ool00) throws DeadObjectException {
                    try {
/* 1 */                 I000iOII(i0ol1ool00);
                    } catch (DeadObjectException e) {
/* 26 */                I0000O(i0OlOlO.I000O01llI0(e));
/* 29 */                throw e;
                    } catch (RemoteException e2) {
/* 17 */                I0000O(i0OlOlO.I000O01llI0(e2));
                    } catch (RuntimeException e3) {
/* 8 */                 this.I00000oOI.I0000Il00O(e3);
                    }
                }

                public final void I000iOII(i0Ol1Ool00 i0ol1ool00) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 59 */                    i0OliI1oo1 i0olii1oo1 = (i0OliI1oo1) this.I0000O;
/* 61 */                    I1ii1l10IO i1ii1l10IO = i0olii1oo1.I00000oIO;
/* 75 */                    ((l1Il1IliOI1l) ((IOI0oloi01) i1ii1l10IO.I0000O).I00000oOI).accept(i0ol1ool00.I000O01llI0, this.I00000oOI);
/* 84 */                    O10oo000lo o10oo000lo = (O10oo000lo) ((IOoi01o) i1ii1l10IO.I00000oOI).I00000oOI;
/* 86 */                    if (o10oo000lo != null) {
/* 90 */                        i0ol1ool00.I000l1.put(o10oo000lo, i0olii1oo1);
                                break;
                            }
                            break;
                        default:
/* 16 */                    i0OliI1oo1 i0olii1oo12 = (i0OliI1oo1) i0ol1ool00.I000l1.remove((O10oo000lo) this.I0000O);
/* 18 */                    if (i0olii1oo12 == null) {
/* 53 */                        this.I00000oOI.I0000O(Boolean.FALSE);
                                break;
                            } else {
/* 20 */                        Io0OoIoOo io0OoIoOo = i0ol1ool00.I000O01llI0;
/* 32 */                        ((lo1iloiI1) ((IOI0oloi01) i0olii1oo12.I00000oOI.I00iiI).I0000Il00O).getClass();
/* 37 */                        int i = lI1i1OI1O0l.I000iOII;
/* 46 */                        ((IOoi01o) i0olii1oo12.I00000oIO.I00000oOI).I00000oOI = null;
                                break;
                            }
                    }
                }

/* 11 */        public i0OoOioOOio(int i, OloIlI0ll oloIlI0ll, byte b) {
/* 12 */            super(i);
/* 13 */            this.I00000oOI = oloIlI0ll;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 13 */        public i0OoOioOOio(int i, OloIlI0ll oloIlI0ll) {
/* 14 */            this(i, oloIlI0ll, (byte) 0);
/* 14 */            this.I0000Il00O = 0;
                }

/* 36 */        private final void I000OOo1O(OoIol00Ool ooIol00Ool, boolean z) {
                }

/* 36 */        private final void I000OiO(OoIol00Ool ooIol00Ool, boolean z) {
                }
            }
