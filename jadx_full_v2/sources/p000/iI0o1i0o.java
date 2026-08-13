            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.AbstractMap;
            import java.util.AbstractSet;
            import java.util.Comparator;
            import java.util.Map;
            import java.util.Set;
            
            public final class iI0o1i0o extends AbstractMap implements Serializable {
                public static final OiOIlO1OII0 I00l0I0l0lO1 = new OiOIlO1OII0(12);
                public static final OiOIlO1OII0 I00l0OO0IO = new OiOIlO1OII0(15);
                public final int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public final Comparator I00iio;
                public Map.Entry I00ilI0I1;
                public final Map.Entry I00ilO0;
                public AbstractSet I00io1l;
                public AbstractSet I00ioIO;

                public iI0o1i0o(int i) {
/* 1 */             this.I00iOIl = i;
/* 4 */             int i2 = 0;
                    switch (i) {
                        case 1:
/* 39 */                    this.I00iiI = 0;
/* 41 */                    this.I00iiO = 0;
/* 45 */                    this.I00iio = I00l0OO0IO;
/* 50 */                    iI0lliloO ii0lliloo = new iI0lliloO(1);
/* 53 */                    ii0lliloo.I00iiI = null;
/* 55 */                    ii0lliloo.I00l0I0l0lO1 = ii0lliloo;
/* 57 */                    ii0lliloo.I00ioIO = ii0lliloo;
/* 59 */                    VarHandle.storeStoreFence();
/* 62 */                    this.I00ilO0 = ii0lliloo;
                            break;
                        default:
/* 11 */                    this.I00iiI = 0;
/* 13 */                    this.I00iiO = 0;
/* 17 */                    this.I00iio = I00l0I0l0lO1;
/* 21 */                    iI0lliloO ii0lliloo2 = new iI0lliloO(i2);
/* 24 */                    ii0lliloo2.I00iiI = null;
/* 26 */                    ii0lliloo2.I00l0I0l0lO1 = ii0lliloo2;
/* 28 */                    ii0lliloo2.I00ioIO = ii0lliloo2;
/* 30 */                    VarHandle.storeStoreFence();
/* 33 */                    this.I00ilO0 = ii0lliloo2;
                            break;
                    }
                }

                public iI0lliloO I00000oIO(Object obj, boolean z) {
                    int iCompareTo;
                    iI0lliloO ii0lliloo;
/* 3 */             OiOIlO1OII0 oiOIlO1OII0 = (OiOIlO1OII0) this.I00iio;
/* 7 */             iI0lliloO ii0lliloo2 = (iI0lliloO) this.I00ilI0I1;
/* 10 */            OiOIlO1OII0 oiOIlO1OII02 = I00l0I0l0lO1;
/* 12 */            if (ii0lliloo2 != null) {
/* 20 */                Comparable comparable = oiOIlO1OII0 == oiOIlO1OII02 ? (Comparable) obj : null;
                        while (true) {
/* 21 */                    Object obj2 = ii0lliloo2.I00iiI;
/* 30 */                    iCompareTo = comparable != null ? comparable.compareTo(obj2) : oiOIlO1OII0.compare(obj, obj2);
/* 34 */                    if (iCompareTo == 0) {
/* 36 */                        return ii0lliloo2;
                            }
/* 41 */                    iI0lliloO ii0lliloo3 = (iI0lliloO) (iCompareTo < 0 ? ii0lliloo2.I00ilO0 : ii0lliloo2.I00io1l);
/* 47 */                    if (ii0lliloo3 == null) {
                                break;
                            }
/* 50 */                    ii0lliloo2 = ii0lliloo3;
                        }
                    } else {
/* 52 */                iCompareTo = 0;
                    }
/* 53 */            if (!z) {
/* 9 */                 return null;
                    }
/* 58 */            iI0lliloO ii0lliloo4 = (iI0lliloO) this.I00ilO0;
/* 61 */            if (ii0lliloo2 != null) {
/* 108 */               ii0lliloo = new iI0lliloO(ii0lliloo2, obj, ii0lliloo4, (iI0lliloO) ii0lliloo4.I00l0I0l0lO1);
/* 111 */               if (iCompareTo < 0) {
/* 113 */                   ii0lliloo2.I00ilO0 = ii0lliloo;
                        } else {
/* 116 */                   ii0lliloo2.I00io1l = ii0lliloo;
                        }
/* 118 */               I000II(ii0lliloo2, true);
                    } else {
/* 63 */                if (oiOIlO1OII0 == oiOIlO1OII02 && !(obj instanceof Comparable)) {
/* 89 */                    throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
                        }
/* 96 */                ii0lliloo = new iI0lliloO(null, obj, ii0lliloo4, (iI0lliloO) ii0lliloo4.I00l0I0l0lO1);
/* 99 */                this.I00ilI0I1 = ii0lliloo;
                    }
                    this.I00iiI++;
                    this.I00iiO++;
/* 332 */           return ii0lliloo;
                }

                public iI0lliloO I00000oOI(Object obj, boolean z) {
                    int iCompareTo;
                    iI0lliloO ii0lliloo;
/* 3 */             OiOIlO1OII0 oiOIlO1OII0 = (OiOIlO1OII0) this.I00iio;
/* 7 */             iI0lliloO ii0lliloo2 = (iI0lliloO) this.I00ilI0I1;
/* 10 */            OiOIlO1OII0 oiOIlO1OII02 = I00l0OO0IO;
/* 12 */            if (ii0lliloo2 != null) {
/* 20 */                Comparable comparable = oiOIlO1OII0 == oiOIlO1OII02 ? (Comparable) obj : null;
                        while (true) {
/* 21 */                    Object obj2 = ii0lliloo2.I00iiI;
/* 30 */                    iCompareTo = comparable != null ? comparable.compareTo(obj2) : oiOIlO1OII0.compare(obj, obj2);
/* 34 */                    if (iCompareTo == 0) {
/* 36 */                        return ii0lliloo2;
                            }
/* 41 */                    iI0lliloO ii0lliloo3 = (iI0lliloO) (iCompareTo < 0 ? ii0lliloo2.I00ilO0 : ii0lliloo2.I00io1l);
/* 47 */                    if (ii0lliloo3 == null) {
                                break;
                            }
/* 51 */                    ii0lliloo2 = ii0lliloo3;
                        }
                    } else {
/* 53 */                iCompareTo = 0;
                    }
/* 49 */            iI0lliloO ii0lliloo4 = ii0lliloo2;
/* 55 */            if (!z) {
/* 9 */                 return null;
                    }
/* 61 */            iI0lliloO ii0lliloo5 = (iI0lliloO) this.I00ilO0;
/* 64 */            if (ii0lliloo4 != null) {
/* 119 */               iI0lliloO ii0lliloo6 = new iI0lliloO(ii0lliloo4, obj, ii0lliloo5, (iI0lliloO) ii0lliloo5.I00l0I0l0lO1, (byte) 0);
/* 122 */               if (iCompareTo < 0) {
/* 124 */                   ii0lliloo4.I00ilO0 = ii0lliloo6;
                        } else {
/* 127 */                   ii0lliloo4.I00io1l = ii0lliloo6;
                        }
/* 129 */               I000O01llI0(ii0lliloo4, true);
/* 132 */               ii0lliloo = ii0lliloo6;
                    } else {
/* 66 */                if (oiOIlO1OII0 == oiOIlO1OII02 && !(obj instanceof Comparable)) {
/* 92 */                    throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
                        }
/* 103 */               ii0lliloo = new iI0lliloO(null, obj, ii0lliloo5, (iI0lliloO) ii0lliloo5.I00l0I0l0lO1, (byte) 0);
/* 106 */               this.I00ilI0I1 = ii0lliloo;
                    }
                    this.I00iiI++;
                    this.I00iiO++;
/* 332 */           return ii0lliloo;
                }

                public void I0000Il00O(iI0lliloO ii0lliloo, boolean z) {
                    iI0lliloO ii0lliloo2;
                    iI0lliloO ii0lliloo3;
                    int i;
/* 1 */             if (z) {
/* 5 */                 iI0lliloO ii0lliloo4 = (iI0lliloO) ii0lliloo.I00l0I0l0lO1;
/* 11 */                ii0lliloo4.I00ioIO = (iI0lliloO) ii0lliloo.I00ioIO;
/* 17 */                ((iI0lliloO) ii0lliloo.I00ioIO).I00l0I0l0lO1 = ii0lliloo4;
                    }
/* 21 */            iI0lliloO ii0lliloo5 = (iI0lliloO) ii0lliloo.I00ilO0;
/* 25 */            iI0lliloO ii0lliloo6 = (iI0lliloO) ii0lliloo.I00io1l;
/* 29 */            iI0lliloO ii0lliloo7 = (iI0lliloO) ii0lliloo.I00ilI0I1;
/* 31 */            int i2 = 0;
/* 33 */            if (ii0lliloo5 == null || ii0lliloo6 == null) {
/* 109 */               if (ii0lliloo5 != null) {
/* 111 */                   I000OOo1O(ii0lliloo, ii0lliloo5);
/* 114 */                   ii0lliloo.I00ilO0 = null;
                        } else if (ii0lliloo6 != null) {
/* 119 */                   I000OOo1O(ii0lliloo, ii0lliloo6);
/* 122 */                   ii0lliloo.I00io1l = null;
                        } else {
/* 125 */                   I000OOo1O(ii0lliloo, null);
                        }
/* 128 */               I000II(ii0lliloo7, false);
                        this.I00iiI--;
                        this.I00iiO++;
/* 332 */               return;
                    }
/* 41 */            if (ii0lliloo5.I00iio > ii0lliloo6.I00iio) {
/* 50 */                do {
/* 48 */                    ii0lliloo3 = ii0lliloo5;
/* 45 */                    ii0lliloo5 = (iI0lliloO) ii0lliloo5.I00io1l;
/* 50 */                } while (ii0lliloo5 != null);
                    } else {
/* 60 */                do {
/* 57 */                    ii0lliloo2 = ii0lliloo6;
/* 55 */                    ii0lliloo6 = (iI0lliloO) ii0lliloo6.I00ilO0;
/* 60 */                } while (ii0lliloo6 != null);
/* 63 */                ii0lliloo3 = ii0lliloo2;
                    }
/* 64 */            I0000Il00O(ii0lliloo3, false);
/* 69 */            iI0lliloO ii0lliloo8 = (iI0lliloO) ii0lliloo.I00ilO0;
/* 71 */            if (ii0lliloo8 != null) {
/* 73 */                i = ii0lliloo8.I00iio;
/* 75 */                ii0lliloo3.I00ilO0 = ii0lliloo8;
/* 77 */                ii0lliloo8.I00ilI0I1 = ii0lliloo3;
/* 79 */                ii0lliloo.I00ilO0 = null;
                    } else {
/* 82 */                i = 0;
                    }
/* 85 */            iI0lliloO ii0lliloo9 = (iI0lliloO) ii0lliloo.I00io1l;
/* 87 */            if (ii0lliloo9 != null) {
/* 89 */                i2 = ii0lliloo9.I00iio;
/* 91 */                ii0lliloo3.I00io1l = ii0lliloo9;
/* 93 */                ii0lliloo9.I00ilI0I1 = ii0lliloo3;
/* 95 */                ii0lliloo.I00io1l = null;
                    }
/* 103 */           ii0lliloo3.I00iio = Math.max(i, i2) + 1;
/* 105 */           I000OOo1O(ii0lliloo, ii0lliloo3);
                }

                public void I0000O(iI0lliloO ii0lliloo, boolean z) {
                    iI0lliloO ii0lliloo2;
                    iI0lliloO ii0lliloo3;
                    int i;
/* 1 */             if (z) {
/* 5 */                 iI0lliloO ii0lliloo4 = (iI0lliloO) ii0lliloo.I00l0I0l0lO1;
/* 11 */                ii0lliloo4.I00ioIO = (iI0lliloO) ii0lliloo.I00ioIO;
/* 17 */                ((iI0lliloO) ii0lliloo.I00ioIO).I00l0I0l0lO1 = ii0lliloo4;
                    }
/* 21 */            iI0lliloO ii0lliloo5 = (iI0lliloO) ii0lliloo.I00ilO0;
/* 25 */            iI0lliloO ii0lliloo6 = (iI0lliloO) ii0lliloo.I00io1l;
/* 29 */            iI0lliloO ii0lliloo7 = (iI0lliloO) ii0lliloo.I00ilI0I1;
/* 31 */            int i2 = 0;
/* 33 */            if (ii0lliloo5 == null || ii0lliloo6 == null) {
/* 109 */               if (ii0lliloo5 != null) {
/* 111 */                   I000OiO(ii0lliloo, ii0lliloo5);
/* 114 */                   ii0lliloo.I00ilO0 = null;
                        } else if (ii0lliloo6 != null) {
/* 119 */                   I000OiO(ii0lliloo, ii0lliloo6);
/* 122 */                   ii0lliloo.I00io1l = null;
                        } else {
/* 125 */                   I000OiO(ii0lliloo, null);
                        }
/* 128 */               I000O01llI0(ii0lliloo7, false);
                        this.I00iiI--;
                        this.I00iiO++;
/* 332 */               return;
                    }
/* 41 */            if (ii0lliloo5.I00iio > ii0lliloo6.I00iio) {
/* 50 */                do {
/* 48 */                    ii0lliloo3 = ii0lliloo5;
/* 45 */                    ii0lliloo5 = (iI0lliloO) ii0lliloo5.I00io1l;
/* 50 */                } while (ii0lliloo5 != null);
                    } else {
/* 60 */                do {
/* 57 */                    ii0lliloo2 = ii0lliloo6;
/* 55 */                    ii0lliloo6 = (iI0lliloO) ii0lliloo6.I00ilO0;
/* 60 */                } while (ii0lliloo6 != null);
/* 63 */                ii0lliloo3 = ii0lliloo2;
                    }
/* 64 */            I0000O(ii0lliloo3, false);
/* 69 */            iI0lliloO ii0lliloo8 = (iI0lliloO) ii0lliloo.I00ilO0;
/* 71 */            if (ii0lliloo8 != null) {
/* 73 */                i = ii0lliloo8.I00iio;
/* 75 */                ii0lliloo3.I00ilO0 = ii0lliloo8;
/* 77 */                ii0lliloo8.I00ilI0I1 = ii0lliloo3;
/* 79 */                ii0lliloo.I00ilO0 = null;
                    } else {
/* 82 */                i = 0;
                    }
/* 85 */            iI0lliloO ii0lliloo9 = (iI0lliloO) ii0lliloo.I00io1l;
/* 87 */            if (ii0lliloo9 != null) {
/* 89 */                i2 = ii0lliloo9.I00iio;
/* 91 */                ii0lliloo3.I00io1l = ii0lliloo9;
/* 93 */                ii0lliloo9.I00ilI0I1 = ii0lliloo3;
/* 95 */                ii0lliloo.I00io1l = null;
                    }
/* 103 */           ii0lliloo3.I00iio = Math.max(i, i2) + 1;
/* 105 */           I000OiO(ii0lliloo, ii0lliloo3);
                }

                /* JADX WARN: Removed duplicated region for block: B:60:0x0092 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0092 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:64:0x008c A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:67:0x008c A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I000II(iI0lliloO ii0lliloo, boolean z) {
/* 1 */             while (ii0lliloo != null) {
/* 5 */                 iI0lliloO ii0lliloo2 = (iI0lliloO) ii0lliloo.I00ilO0;
/* 9 */                 iI0lliloO ii0lliloo3 = (iI0lliloO) ii0lliloo.I00io1l;
/* 11 */                boolean z2 = false;
/* 17 */                int i = ii0lliloo2 != null ? ii0lliloo2.I00iio : 0;
/* 23 */                int i2 = ii0lliloo3 != null ? ii0lliloo3.I00iio : 0;
/* 24 */                int i3 = i - i2;
/* 27 */                boolean z3 = true;
/* 28 */                if (i3 == -2) {
/* 32 */                    iI0lliloO ii0lliloo4 = (iI0lliloO) ii0lliloo3.I00ilO0;
/* 36 */                    iI0lliloO ii0lliloo5 = (iI0lliloO) ii0lliloo3.I00io1l;
/* 50 */                    int i4 = (ii0lliloo4 != null ? ii0lliloo4.I00iio : 0) - (ii0lliloo5 != null ? ii0lliloo5.I00iio : 0);
/* 52 */                    if (i4 != -1) {
/* 54 */                        if (i4 == 0) {
/* 56 */                            if (!z) {
                                    }
/* 72 */                            if (z3) {
/* 332 */                               return;
                                    }
                                } else {
/* 59 */                            z3 = z;
                                }
/* 60 */                        I000lI(ii0lliloo3);
/* 63 */                        I000iOII(ii0lliloo);
/* 72 */                        if (z3) {
                                }
                            } else {
/* 67 */                        z2 = z;
                            }
/* 68 */                    I000iOII(ii0lliloo);
/* 71 */                    z3 = z2;
/* 72 */                    if (z3) {
                            }
                        } else if (i3 == 2) {
/* 80 */                    iI0lliloO ii0lliloo6 = (iI0lliloO) ii0lliloo2.I00ilO0;
/* 84 */                    iI0lliloO ii0lliloo7 = (iI0lliloO) ii0lliloo2.I00io1l;
/* 98 */                    int i5 = (ii0lliloo6 != null ? ii0lliloo6.I00iio : 0) - (ii0lliloo7 != null ? ii0lliloo7.I00iio : 0);
/* 99 */                    if (i5 != 1) {
/* 101 */                       if (i5 == 0) {
/* 103 */                           if (!z) {
                                    }
/* 119 */                           if (z3) {
/* 332 */                               return;
                                    }
                                } else {
/* 106 */                           z3 = z;
                                }
/* 107 */                       I000iOII(ii0lliloo2);
/* 110 */                       I000lI(ii0lliloo);
/* 119 */                       if (z3) {
                                }
                            } else {
/* 114 */                       z2 = z;
                            }
/* 115 */                   I000lI(ii0lliloo);
/* 118 */                   z3 = z2;
/* 119 */                   if (z3) {
                            }
                        } else if (i3 == 0) {
/* 126 */                   ii0lliloo.I00iio = i + 1;
/* 128 */                   if (z) {
/* 332 */                       return;
                            }
                        } else {
/* 136 */                   ii0lliloo.I00iio = Math.max(i, i2) + 1;
/* 138 */                   if (!z) {
/* 332 */                       return;
                            }
                        }
/* 143 */               ii0lliloo = (iI0lliloO) ii0lliloo.I00ilI0I1;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:60:0x0092 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0092 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:64:0x008c A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:67:0x008c A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I000O01llI0(iI0lliloO ii0lliloo, boolean z) {
/* 1 */             while (ii0lliloo != null) {
/* 5 */                 iI0lliloO ii0lliloo2 = (iI0lliloO) ii0lliloo.I00ilO0;
/* 9 */                 iI0lliloO ii0lliloo3 = (iI0lliloO) ii0lliloo.I00io1l;
/* 11 */                boolean z2 = false;
/* 17 */                int i = ii0lliloo2 != null ? ii0lliloo2.I00iio : 0;
/* 23 */                int i2 = ii0lliloo3 != null ? ii0lliloo3.I00iio : 0;
/* 24 */                int i3 = i - i2;
/* 27 */                boolean z3 = true;
/* 28 */                if (i3 == -2) {
/* 32 */                    iI0lliloO ii0lliloo4 = (iI0lliloO) ii0lliloo3.I00ilO0;
/* 36 */                    iI0lliloO ii0lliloo5 = (iI0lliloO) ii0lliloo3.I00io1l;
/* 50 */                    int i4 = (ii0lliloo4 != null ? ii0lliloo4.I00iio : 0) - (ii0lliloo5 != null ? ii0lliloo5.I00iio : 0);
/* 52 */                    if (i4 != -1) {
/* 54 */                        if (i4 == 0) {
/* 56 */                            if (!z) {
                                    }
/* 72 */                            if (z3) {
/* 332 */                               return;
                                    }
                                } else {
/* 59 */                            z3 = z;
                                }
/* 60 */                        I000o00OoI0I(ii0lliloo3);
/* 63 */                        I000l1(ii0lliloo);
/* 72 */                        if (z3) {
                                }
                            } else {
/* 67 */                        z2 = z;
                            }
/* 68 */                    I000l1(ii0lliloo);
/* 71 */                    z3 = z2;
/* 72 */                    if (z3) {
                            }
                        } else if (i3 == 2) {
/* 80 */                    iI0lliloO ii0lliloo6 = (iI0lliloO) ii0lliloo2.I00ilO0;
/* 84 */                    iI0lliloO ii0lliloo7 = (iI0lliloO) ii0lliloo2.I00io1l;
/* 98 */                    int i5 = (ii0lliloo6 != null ? ii0lliloo6.I00iio : 0) - (ii0lliloo7 != null ? ii0lliloo7.I00iio : 0);
/* 99 */                    if (i5 != 1) {
/* 101 */                       if (i5 == 0) {
/* 103 */                           if (!z) {
                                    }
/* 119 */                           if (z3) {
/* 332 */                               return;
                                    }
                                } else {
/* 106 */                           z3 = z;
                                }
/* 107 */                       I000l1(ii0lliloo2);
/* 110 */                       I000o00OoI0I(ii0lliloo);
/* 119 */                       if (z3) {
                                }
                            } else {
/* 114 */                       z2 = z;
                            }
/* 115 */                   I000o00OoI0I(ii0lliloo);
/* 118 */                   z3 = z2;
/* 119 */                   if (z3) {
                            }
                        } else if (i3 == 0) {
/* 126 */                   ii0lliloo.I00iio = i + 1;
/* 128 */                   if (z) {
/* 332 */                       return;
                            }
                        } else {
/* 136 */                   ii0lliloo.I00iio = Math.max(i, i2) + 1;
/* 138 */                   if (!z) {
/* 332 */                       return;
                            }
                        }
/* 143 */               ii0lliloo = (iI0lliloO) ii0lliloo.I00ilI0I1;
                    }
                }

                public void I000OOo1O(iI0lliloO ii0lliloo, iI0lliloO ii0lliloo2) {
/* 3 */             iI0lliloO ii0lliloo3 = (iI0lliloO) ii0lliloo.I00ilI0I1;
/* 6 */             ii0lliloo.I00ilI0I1 = null;
/* 8 */             if (ii0lliloo2 != null) {
/* 10 */                ii0lliloo2.I00ilI0I1 = ii0lliloo3;
                    }
/* 12 */            if (ii0lliloo3 == null) {
/* 26 */                this.I00ilI0I1 = ii0lliloo2;
                    } else if (((iI0lliloO) ii0lliloo3.I00ilO0) == ii0lliloo) {
/* 20 */                ii0lliloo3.I00ilO0 = ii0lliloo2;
                    } else {
/* 23 */                ii0lliloo3.I00io1l = ii0lliloo2;
                    }
                }

                public void I000OiO(iI0lliloO ii0lliloo, iI0lliloO ii0lliloo2) {
/* 3 */             iI0lliloO ii0lliloo3 = (iI0lliloO) ii0lliloo.I00ilI0I1;
/* 6 */             ii0lliloo.I00ilI0I1 = null;
/* 8 */             if (ii0lliloo2 != null) {
/* 10 */                ii0lliloo2.I00ilI0I1 = ii0lliloo3;
                    }
/* 12 */            if (ii0lliloo3 == null) {
/* 26 */                this.I00ilI0I1 = ii0lliloo2;
                    } else if (((iI0lliloO) ii0lliloo3.I00ilO0) == ii0lliloo) {
/* 20 */                ii0lliloo3.I00ilO0 = ii0lliloo2;
                    } else {
/* 23 */                ii0lliloo3.I00io1l = ii0lliloo2;
                    }
                }

                public void I000iOII(iI0lliloO ii0lliloo) {
/* 3 */             iI0lliloO ii0lliloo2 = (iI0lliloO) ii0lliloo.I00ilO0;
/* 7 */             iI0lliloO ii0lliloo3 = (iI0lliloO) ii0lliloo.I00io1l;
/* 11 */            iI0lliloO ii0lliloo4 = (iI0lliloO) ii0lliloo3.I00ilO0;
/* 15 */            iI0lliloO ii0lliloo5 = (iI0lliloO) ii0lliloo3.I00io1l;
/* 17 */            ii0lliloo.I00io1l = ii0lliloo4;
/* 19 */            if (ii0lliloo4 != null) {
/* 21 */                ii0lliloo4.I00ilI0I1 = ii0lliloo;
                    }
/* 23 */            I000OOo1O(ii0lliloo, ii0lliloo3);
/* 26 */            ii0lliloo3.I00ilO0 = ii0lliloo;
/* 28 */            ii0lliloo.I00ilI0I1 = ii0lliloo3;
/* 47 */            int iMax = Math.max(ii0lliloo2 != null ? ii0lliloo2.I00iio : 0, ii0lliloo4 != null ? ii0lliloo4.I00iio : 0) + 1;
/* 49 */            ii0lliloo.I00iio = iMax;
/* 61 */            ii0lliloo3.I00iio = Math.max(iMax, ii0lliloo5 != null ? ii0lliloo5.I00iio : 0) + 1;
                }

                public void I000l1(iI0lliloO ii0lliloo) {
/* 3 */             iI0lliloO ii0lliloo2 = (iI0lliloO) ii0lliloo.I00ilO0;
/* 7 */             iI0lliloO ii0lliloo3 = (iI0lliloO) ii0lliloo.I00io1l;
/* 11 */            iI0lliloO ii0lliloo4 = (iI0lliloO) ii0lliloo3.I00ilO0;
/* 15 */            iI0lliloO ii0lliloo5 = (iI0lliloO) ii0lliloo3.I00io1l;
/* 17 */            ii0lliloo.I00io1l = ii0lliloo4;
/* 19 */            if (ii0lliloo4 != null) {
/* 21 */                ii0lliloo4.I00ilI0I1 = ii0lliloo;
                    }
/* 23 */            I000OiO(ii0lliloo, ii0lliloo3);
/* 26 */            ii0lliloo3.I00ilO0 = ii0lliloo;
/* 28 */            ii0lliloo.I00ilI0I1 = ii0lliloo3;
/* 47 */            int iMax = Math.max(ii0lliloo2 != null ? ii0lliloo2.I00iio : 0, ii0lliloo4 != null ? ii0lliloo4.I00iio : 0) + 1;
/* 49 */            ii0lliloo.I00iio = iMax;
/* 61 */            ii0lliloo3.I00iio = Math.max(iMax, ii0lliloo5 != null ? ii0lliloo5.I00iio : 0) + 1;
                }

                public void I000lI(iI0lliloO ii0lliloo) {
/* 3 */             iI0lliloO ii0lliloo2 = (iI0lliloO) ii0lliloo.I00ilO0;
/* 7 */             iI0lliloO ii0lliloo3 = (iI0lliloO) ii0lliloo.I00io1l;
/* 11 */            iI0lliloO ii0lliloo4 = (iI0lliloO) ii0lliloo2.I00ilO0;
/* 15 */            iI0lliloO ii0lliloo5 = (iI0lliloO) ii0lliloo2.I00io1l;
/* 17 */            ii0lliloo.I00ilO0 = ii0lliloo5;
/* 19 */            if (ii0lliloo5 != null) {
/* 21 */                ii0lliloo5.I00ilI0I1 = ii0lliloo;
                    }
/* 23 */            I000OOo1O(ii0lliloo, ii0lliloo2);
/* 26 */            ii0lliloo2.I00io1l = ii0lliloo;
/* 28 */            ii0lliloo.I00ilI0I1 = ii0lliloo2;
/* 47 */            int iMax = Math.max(ii0lliloo3 != null ? ii0lliloo3.I00iio : 0, ii0lliloo5 != null ? ii0lliloo5.I00iio : 0) + 1;
/* 49 */            ii0lliloo.I00iio = iMax;
/* 61 */            ii0lliloo2.I00iio = Math.max(iMax, ii0lliloo4 != null ? ii0lliloo4.I00iio : 0) + 1;
                }

                public void I000o00OoI0I(iI0lliloO ii0lliloo) {
/* 3 */             iI0lliloO ii0lliloo2 = (iI0lliloO) ii0lliloo.I00ilO0;
/* 7 */             iI0lliloO ii0lliloo3 = (iI0lliloO) ii0lliloo.I00io1l;
/* 11 */            iI0lliloO ii0lliloo4 = (iI0lliloO) ii0lliloo2.I00ilO0;
/* 15 */            iI0lliloO ii0lliloo5 = (iI0lliloO) ii0lliloo2.I00io1l;
/* 17 */            ii0lliloo.I00ilO0 = ii0lliloo5;
/* 19 */            if (ii0lliloo5 != null) {
/* 21 */                ii0lliloo5.I00ilI0I1 = ii0lliloo;
                    }
/* 23 */            I000OiO(ii0lliloo, ii0lliloo2);
/* 26 */            ii0lliloo2.I00io1l = ii0lliloo;
/* 28 */            ii0lliloo.I00ilI0I1 = ii0lliloo2;
/* 47 */            int iMax = Math.max(ii0lliloo3 != null ? ii0lliloo3.I00iio : 0, ii0lliloo5 != null ? ii0lliloo5.I00iio : 0) + 1;
/* 49 */            ii0lliloo.I00iio = iMax;
/* 61 */            ii0lliloo2.I00iio = Math.max(iMax, ii0lliloo4 != null ? ii0lliloo4.I00iio : 0) + 1;
                }

                @Override
                public final void clear() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Map.Entry entry = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 27 */                    this.I00ilI0I1 = null;
/* 29 */                    this.I00iiI = 0;
                            this.I00iiO++;
/* 37 */                    iI0lliloO ii0lliloo = (iI0lliloO) entry;
/* 39 */                    ii0lliloo.I00l0I0l0lO1 = ii0lliloo;
/* 41 */                    ii0lliloo.I00ioIO = ii0lliloo;
                            break;
                        default:
/* 10 */                    this.I00ilI0I1 = null;
/* 12 */                    this.I00iiI = 0;
                            this.I00iiO++;
/* 20 */                    iI0lliloO ii0lliloo2 = (iI0lliloO) entry;
/* 22 */                    ii0lliloo2.I00l0I0l0lO1 = ii0lliloo2;
/* 24 */                    ii0lliloo2.I00ioIO = ii0lliloo2;
                            break;
                    }
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 4 */             iI0lliloO ii0llilooI00000oIO = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    if (obj != null) {
                                try {
/* 22 */                            ii0llilooI00000oIO = I00000oIO(obj, false);
                                } catch (ClassCastException unused) {
                                }
                            }
/* 26 */                    if (ii0llilooI00000oIO == null) {
                                break;
                            }
                            break;
                        default:
/* 9 */                     if (obj != null) {
                                try {
/* 11 */                            ii0llilooI00000oIO = I00000oOI(obj, false);
                                } catch (ClassCastException unused2) {
                                }
                            }
/* 15 */                    if (ii0llilooI00000oIO == null) {
                                break;
                            }
                            break;
                    }
/* 5 */             return false;
                }

                @Override
                public final Set entrySet() {
/* 3 */             int i = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    iI0i1oi0OO0l ii0i1oi0oo0l = (iI0i1oi0OO0l) this.I00io1l;
/* 26 */                    if (ii0i1oi0oo0l != null) {
/* 36 */                        return ii0i1oi0oo0l;
                            }
/* 31 */                    iI0i1oi0OO0l ii0i1oi0oo0l2 = new iI0i1oi0OO0l(this, i);
/* 34 */                    this.I00io1l = ii0i1oi0oo0l2;
/* 36 */                    return ii0i1oi0oo0l2;
                        default:
/* 9 */                     ilII0ii0 ilii0ii0 = (ilII0ii0) this.I00io1l;
/* 11 */                    if (ilii0ii0 != null) {
/* 21 */                        return ilii0ii0;
                            }
/* 16 */                    ilII0ii0 ilii0ii02 = new ilII0ii0(this, i);
/* 19 */                    this.I00io1l = ilii0ii02;
/* 21 */                    return ilii0ii02;
                    }
                }

                @Override
                public final Object get(Object obj) {
                    iI0lliloO ii0llilooI00000oIO;
                    iI0lliloO ii0llilooI00000oOI;
                    switch (this.I00iOIl) {
                        case 0:
/* 21 */                    if (obj != null) {
                                try {
/* 23 */                            ii0llilooI00000oIO = I00000oIO(obj, false);
                                } catch (ClassCastException unused) {
                                }
                            } else {
/* 28 */                        ii0llilooI00000oIO = null;
                            }
/* 29 */                    if (ii0llilooI00000oIO != null) {
/* 31 */                        return ii0llilooI00000oIO.I00iiO;
                            }
/* 4 */                     return null;
                        default:
/* 8 */                     if (obj != null) {
                                try {
/* 10 */                            ii0llilooI00000oOI = I00000oOI(obj, false);
                                } catch (ClassCastException unused2) {
                                }
                            } else {
/* 15 */                        ii0llilooI00000oOI = null;
                            }
/* 16 */                    if (ii0llilooI00000oOI != null) {
/* 18 */                        return ii0llilooI00000oOI.I00iiO;
                            }
/* 4 */                     return null;
                    }
                }

                @Override
                public final Set keySet() {
/* 3 */             int i = 1;
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    iI0i1oi0OO0l ii0i1oi0oo0l = (iI0i1oi0OO0l) this.I00ioIO;
/* 26 */                    if (ii0i1oi0oo0l != null) {
/* 36 */                        return ii0i1oi0oo0l;
                            }
/* 31 */                    iI0i1oi0OO0l ii0i1oi0oo0l2 = new iI0i1oi0OO0l(this, i);
/* 34 */                    this.I00ioIO = ii0i1oi0oo0l2;
/* 36 */                    return ii0i1oi0oo0l2;
                        default:
/* 9 */                     ilII0ii0 ilii0ii0 = (ilII0ii0) this.I00ioIO;
/* 11 */                    if (ilii0ii0 != null) {
/* 21 */                        return ilii0ii0;
                            }
/* 16 */                    ilII0ii0 ilii0ii02 = new ilII0ii0(this, i);
/* 19 */                    this.I00ioIO = ilii0ii02;
/* 21 */                    return ilii0ii02;
                    }
                }

                @Override
                public final Object put(Object obj, Object obj2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 33 */                    if (obj == null) {
/* 50 */                        IOOlIIilOl0.I000II("key == null");
                                break;
                            } else if (obj2 == null) {
/* 46 */                        IOOlIIilOl0.I000II("value == null");
                                break;
                            } else {
/* 37 */                        iI0lliloO ii0llilooI00000oIO = I00000oIO(obj, true);
/* 41 */                        Object obj3 = ii0llilooI00000oIO.I00iiO;
/* 43 */                        ii0llilooI00000oIO.I00iiO = obj2;
                                break;
                            }
                        default:
/* 12 */                    if (obj == null) {
/* 29 */                        IOOlIIilOl0.I000II("key == null");
                                break;
                            } else if (obj2 == null) {
/* 25 */                        IOOlIIilOl0.I000II("value == null");
                                break;
                            } else {
/* 16 */                        iI0lliloO ii0llilooI00000oOI = I00000oOI(obj, true);
/* 20 */                        Object obj4 = ii0llilooI00000oOI.I00iiO;
/* 22 */                        ii0llilooI00000oOI.I00iiO = obj2;
                                break;
                            }
                    }
/* 8 */             return null;
                }

                @Override
                public final Object remove(Object obj) {
                    iI0lliloO ii0llilooI00000oIO;
                    iI0lliloO ii0llilooI00000oOI;
                    switch (this.I00iOIl) {
                        case 0:
/* 27 */                    if (obj != null) {
                                try {
/* 29 */                            ii0llilooI00000oIO = I00000oIO(obj, false);
                                } catch (ClassCastException unused) {
                                }
                            } else {
/* 34 */                        ii0llilooI00000oIO = null;
                            }
/* 35 */                    if (ii0llilooI00000oIO != null) {
/* 37 */                        I0000Il00O(ii0llilooI00000oIO, true);
                            }
/* 40 */                    if (ii0llilooI00000oIO != null) {
/* 42 */                        return ii0llilooI00000oIO.I00iiO;
                            }
/* 5 */                     return null;
                        default:
/* 9 */                     if (obj != null) {
                                try {
/* 11 */                            ii0llilooI00000oOI = I00000oOI(obj, false);
                                } catch (ClassCastException unused2) {
                                }
                            } else {
/* 16 */                        ii0llilooI00000oOI = null;
                            }
/* 17 */                    if (ii0llilooI00000oOI != null) {
/* 19 */                        I0000O(ii0llilooI00000oOI, true);
                            }
/* 22 */                    if (ii0llilooI00000oOI != null) {
/* 24 */                        return ii0llilooI00000oOI.I00iiO;
                            }
/* 5 */                     return null;
                    }
                }

                @Override
                public final int size() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return this.I00iiI;
                }
            }
