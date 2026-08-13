            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public abstract class iliI1i0 {
                public static final IliIO10oO0 I00000oIO(IliIO10oO0 iliIO10oO0) {
/* 13 */            IliIO10oO0 iliIO10oO0I000II = ((Ili1ioOlo0oO) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(iliIO10oO0)).getFocusOwner()).I000II();
/* 17 */            if (iliIO10oO0I000II == null || !iliIO10oO0I000II.I00lll10) {
/* 24 */                return null;
                    }
/* 23 */            return iliIO10oO0I000II;
                }

                public static final OOo0IO I00000oOI(IliIO10oO0 iliIO10oO0) {
                    OIIlIII0Ili oIIlIII0Ili;
/* 3 */             if (iliIO10oO0.I00lll10 && (oIIlIII0Ili = iliIO10oO0.I00ioIO) != null) {
/* 10 */                O0iOOo0Ii o0iOOo0IiI0000Il00O = l0o0IlOil1.I0000Il00O(oIIlIII0Ili);
/* 18 */                if (!o0iOOo0IiI0000Il00O.I0010o()) {
/* 21 */                    o0iOOo0IiI0000Il00O = null;
                        }
/* 22 */                if (o0iOOo0IiI0000Il00O != null) {
/* 25 */                    return iliIO10oO0.I010o0o0oO(o0iOOo0IiI0000Il00O);
                        }
                    }
/* 30 */            return OOo0IO.I0000oI00;
                }

                /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
                
                    return r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
                
                    continue;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final IliIO10oO0 I0000Il00O(IliIO10oO0 iliIO10oO0) {
/* 3 */             boolean z = iliIO10oO0.I00iOIl.I00lll10;
/* 6 */             if (z) {
/* 10 */                if (!z) {
/* 14 */                    IolioOO1.I0000Il00O("visitChildren called on an unattached node");
                        }
/* 23 */                OI110O0 oi110o0 = new OI110O0(new O1ooOo[16]);
/* 26 */                O1ooOo o1ooOo = iliIO10oO0.I00iOIl;
/* 28 */                O1ooOo o1ooOo2 = o1ooOo.I00ilO0;
/* 30 */                if (o1ooOo2 == null) {
/* 32 */                    il0lI1i1olii.I00000oIO(oi110o0, o1ooOo);
                        } else {
/* 36 */                    oi110o0.I00000oOI(o1ooOo2);
                        }
                        loop0: while (true) {
/* 39 */                    int i = oi110o0.I00iiO;
/* 41 */                    if (i == 0) {
                                break;
                            }
/* 49 */                    O1ooOo o1ooOoI0000Il00O = (O1ooOo) oi110o0.I000l1(i - 1);
/* 55 */                    if ((o1ooOoI0000Il00O.I00iio & Barcode.FORMAT_UPC_E) == 0) {
/* 57 */                        il0lI1i1olii.I00000oIO(oi110o0, o1ooOoI0000Il00O);
                            } else {
                                while (true) {
/* 61 */                            if (o1ooOoI0000Il00O == null) {
                                        break;
                                    }
/* 67 */                            if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 69 */                                OI110O0 oi110o02 = null;
/* 70 */                                while (o1ooOoI0000Il00O != null) {
/* 75 */                                    if (o1ooOoI0000Il00O instanceof IliIO10oO0) {
/* 77 */                                        IliIO10oO0 iliIO10oO02 = (IliIO10oO0) o1ooOoI0000Il00O;
/* 83 */                                        if (iliIO10oO02.I00iOIl.I00lll10) {
/* 89 */                                            int iOrdinal = iliIO10oO02.I01101IOlO().ordinal();
/* 93 */                                            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                                        break loop0;
                                                    }
/* 101 */                                           if (iOrdinal != 3) {
/* 104 */                                               I000II.I00000oIO();
/* 5 */                                                 return null;
                                                    }
                                                }
                                            } else if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 124 */                                       int i2 = 0;
/* 125 */                                       for (O1ooOo o1ooOo3 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo3 != null; o1ooOo3 = o1ooOo3.I00ilO0) {
/* 131 */                                           if ((o1ooOo3.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 133 */                                               i2++;
/* 135 */                                               if (i2 == 1) {
/* 137 */                                                   o1ooOoI0000Il00O = o1ooOo3;
                                                        } else {
/* 139 */                                                   if (oi110o02 == null) {
/* 145 */                                                       oi110o02 = new OI110O0(new O1ooOo[16]);
                                                            }
/* 148 */                                                   if (o1ooOoI0000Il00O != null) {
/* 150 */                                                       oi110o02.I00000oOI(o1ooOoI0000Il00O);
/* 153 */                                                       o1ooOoI0000Il00O = null;
                                                            }
/* 154 */                                                   oi110o02.I00000oOI(o1ooOo3);
                                                        }
                                                    }
                                                }
/* 160 */                                       if (i2 == 1) {
                                                }
                                            }
/* 163 */                                   o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o02);
                                        }
                                    } else {
/* 168 */                               o1ooOoI0000Il00O = o1ooOoI0000Il00O.I00ilO0;
                                    }
                                }
                            }
                        }
                    }
/* 5 */             return null;
                }

                public static final boolean I0000O(IliIO10oO0 iliIO10oO0) {
                    O0iiOioolIi o0iiOioolIi;
                    OIIlIII0Ili oIIlIII0Ili;
                    O0iiOioolIi o0iiOioolIi2;
/* 1 */             OIIlIII0Ili oIIlIII0Ili2 = iliIO10oO0.I00ioIO;
                    return (oIIlIII0Ili2 == null || (o0iiOioolIi = oIIlIII0Ili2.I00oO101o) == null || !o0iiOioolIi.I00Io1o110i() || (oIIlIII0Ili = iliIO10oO0.I00ioIO) == null || (o0iiOioolIi2 = oIIlIII0Ili.I00oO101o) == null || !o0iiOioolIi2.I00Io1lO()) ? false : true;
                }
            }
