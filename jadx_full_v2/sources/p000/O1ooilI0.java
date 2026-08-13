            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O1ooilI0 {
                public I0lio1O01i01 I00000oIO;
                public OI0oiiIO0 I00000oOI;
                public OI0oiiIO0 I0000Il00O;
                public OI0oiiIO0 I0000O;
                public OI0oiiIO0 I0000oI00;
                public boolean I0001Ioi1lo;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r4v10 */
                /* JADX WARN: Type inference failed for: r4v11 */
                /* JADX WARN: Type inference failed for: r4v12 */
                /* JADX WARN: Type inference failed for: r4v13 */
                /* JADX WARN: Type inference failed for: r4v5 */
                /* JADX WARN: Type inference failed for: r4v6, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v8 */
                /* JADX WARN: Type inference failed for: r4v9 */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v10 */
                /* JADX WARN: Type inference failed for: r5v11 */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v3, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r5v4 */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* JADX WARN: Type inference failed for: r5v6, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r5v8 */
                /* JADX WARN: Type inference failed for: r5v9 */
                public static void I00000oOI(O1ooOo o1ooOo, OOiIii oOiIii) {
/* 5 */             if (!o1ooOo.I00iOIl.I00lll10) {
/* 9 */                 IolioOO1.I0000Il00O("visitSubtreeIf called on an unattached node");
                    }
/* 18 */            OI110O0 oi110o0 = new OI110O0(new O1ooOo[16]);
/* 21 */            O1ooOo o1ooOo2 = o1ooOo.I00iOIl;
/* 23 */            O1ooOo o1ooOo3 = o1ooOo2.I00ilO0;
/* 25 */            if (o1ooOo3 == null) {
/* 27 */                il0lI1i1olii.I00000oIO(oi110o0, o1ooOo2);
                    } else {
/* 31 */                oi110o0.I00000oOI(o1ooOo3);
                    }
                    while (true) {
/* 34 */                int i = oi110o0.I00iiO;
/* 36 */                if (i == 0) {
/* 332 */                   return;
                        }
/* 44 */                O1ooOo o1ooOo4 = (O1ooOo) oi110o0.I000l1(i - 1);
/* 50 */                if ((o1ooOo4.I00iio & 32) != 0) {
/* 53 */                    for (O1ooOo o1ooOo5 = o1ooOo4; o1ooOo5 != null && o1ooOo5.I00lll10; o1ooOo5 = o1ooOo5.I00ilO0) {
/* 63 */                        if ((o1ooOo5.I00iiO & 32) != 0) {
/* 66 */                            IiIioO0ol1oI iiIioO0ol1oII0000Il00O = o1ooOo5;
/* 67 */                            ?? oi110o02 = 0;
/* 68 */                            while (iiIioO0ol1oII0000Il00O != 0) {
/* 72 */                                if (iiIioO0ol1oII0000Il00O instanceof O1oolIO0) {
/* 84 */                                    if (((O1oolIO0) iiIioO0ol1oII0000Il00O).I00OilO00Il().I00000oIO(oOiIii)) {
                                                break;
                                            }
                                        } else if ((iiIioO0ol1oII0000Il00O.I00iiO & 32) != 0 && (iiIioO0ol1oII0000Il00O instanceof IiIioO0ol1oI)) {
/* 100 */                                   O1ooOo o1ooOo6 = iiIioO0ol1oII0000Il00O.I00o0l1o1o0;
/* 102 */                                   int i2 = 0;
                                            iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                            oi110o02 = oi110o02;
/* 104 */                                   while (o1ooOo6 != null) {
/* 110 */                                       if ((o1ooOo6.I00iiO & 32) != 0) {
/* 112 */                                           i2++;
                                                    oi110o02 = oi110o02;
/* 114 */                                           if (i2 == 1) {
/* 116 */                                               iiIioO0ol1oII0000Il00O = o1ooOo6;
                                                    } else {
/* 118 */                                               if (oi110o02 == 0) {
/* 124 */                                                   oi110o02 = new OI110O0(new O1ooOo[16]);
                                                        }
/* 127 */                                               if (iiIioO0ol1oII0000Il00O != 0) {
/* 129 */                                                   oi110o02.I00000oOI(iiIioO0ol1oII0000Il00O);
/* 132 */                                                   iiIioO0ol1oII0000Il00O = 0;
                                                        }
/* 133 */                                               oi110o02.I00000oOI(o1ooOo6);
                                                    }
                                                }
/* 136 */                                       o1ooOo6 = o1ooOo6.I00ilO0;
                                                iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                                oi110o02 = oi110o02;
                                            }
/* 139 */                                   if (i2 == 1) {
                                            }
                                        }
/* 142 */                               iiIioO0ol1oII0000Il00O = il0lI1i1olii.I0000Il00O(oi110o02);
                                    }
                                }
                            }
                        }
/* 150 */               il0lI1i1olii.I00000oIO(oi110o0, o1ooOo4);
                    }
                }

                public final void I00000oIO() {
/* 3 */             if (this.I0001Ioi1lo) {
/* 55 */                return;
                    }
/* 6 */             this.I0001Ioi1lo = true;
/* 8 */             I0lio1O01i01 i0lio1O01i01 = this.I00000oIO;
/* 14 */            IlIi0Il ilIi0Il = new IlIi0Il(23);
/* 17 */            ilIi0Il.I00iiI = this;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            OI0oiiIO0 oI0oiiIO0 = i0lio1O01i01.I01I1Oo0oll;
/* 28 */            if (oI0oiiIO0.I000O01llI0(ilIi0Il) >= 0) {
/* 55 */                return;
                    }
/* 31 */            oI0oiiIO0.I00000oOI(ilIi0Il);
                }
            }
