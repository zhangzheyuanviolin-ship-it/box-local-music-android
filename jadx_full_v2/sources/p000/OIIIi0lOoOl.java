            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIIIi0lOoOl extends O1ooOo implements OoIOloiIii, OII1lIlol {
                public OII1lIlol I00o0iI0io1;
                public OIIII0oOo1o I00o0l1o1o0;
                public OIIIi0lOoOl I00o101lO;
                public final String I00oI0i;

                public OIIIi0lOoOl(OII1lIlol oII1lIlol, OIIII0oOo1o oIIII0oOo1o) {
/* 4 */             this.I00o0iI0io1 = oII1lIlol;
/* 13 */            this.I00o0l1o1o0 = oIIII0oOo1o == null ? new OIIII0oOo1o() : oIIII0oOo1o;
/* 17 */            this.I00oI0i = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
                }

                @Override
                public final Object I000l1() {
/* 1 */             return this.I00oI0i;
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I001lllioOl(long j, long j2, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    OIIIII oiiiii;
                    long j3;
                    long j4;
                    long j5;
                    long j6;
/* 5 */             if (iOoil1iiIilo instanceof OIIIII) {
/* 8 */                 oiiiii = (OIIIII) iOoil1iiIilo;
/* 10 */                int i = oiiiii.I00ilI0I1;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    oiiiii.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 27 */                    oiiiii = new OIIIII(this, (IOoilo) iOoil1iiIilo);
                        }
                    }
/* 21 */            OIIIII oiiiii2 = oiiiii;
/* 31 */            Object objI001lllioOl = oiiiii2.I00iiO;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i2 = oiiiii2.I00ilI0I1;
/* 37 */            OIIIi0lOoOl oIIIi0lOoOlI010l1ol111 = null;
/* 40 */            if (i2 == 0) {
/* 69 */                lIoii1l01l0i.I00000oOI(objI001lllioOl);
/* 72 */                OII1lIlol oII1lIlol = this.I00o0iI0io1;
/* 74 */                oiiiii2.I00iOIl = j;
/* 77 */                oiiiii2.I00iiI = j2;
/* 79 */                oiiiii2.I00ilI0I1 = 1;
/* 82 */                objI001lllioOl = oII1lIlol.I001lllioOl(j, j2, oiiiii2);
/* 86 */                if (objI001lllioOl != ii0111o) {
/* 89 */                    j3 = j2;
                        }
/* 132 */               return ii0111o;
                    }
/* 42 */            if (i2 != 1) {
/* 44 */                if (i2 != 2) {
/* 54 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                    return null;
                        }
/* 46 */                j6 = oiiiii2.I00iOIl;
/* 48 */                lIoii1l01l0i.I00000oOI(objI001lllioOl);
/* 136 */               j5 = ((OooIOilolOo) objI001lllioOl).I00000oIO;
/* 138 */               j4 = j6;
/* 146 */               return OooIOilolOo.I00000oIO(OooIOilolOo.I0001Ioi1lo(j4, j5));
                    }
/* 58 */            long j7 = oiiiii2.I00iiI;
/* 60 */            long j8 = oiiiii2.I00iOIl;
/* 62 */            lIoii1l01l0i.I00000oOI(objI001lllioOl);
/* 66 */            j3 = j7;
/* 67 */            j = j8;
/* 92 */            j4 = ((OooIOilolOo) objI001lllioOl).I00000oIO;
/* 94 */            boolean z = this.I00lll10;
/* 96 */            if (!z) {
/* 106 */               oIIIi0lOoOlI010l1ol111 = this.I00o101lO;
                    } else if (z) {
/* 100 */               oIIIi0lOoOlI010l1ol111 = I010l1ol111();
                    }
/* 104 */           OII1lIlol oII1lIlol2 = oIIIi0lOoOlI010l1ol111;
/* 109 */           if (oII1lIlol2 == null) {
/* 140 */               j5 = 0;
/* 146 */               return OooIOilolOo.I00000oIO(OooIOilolOo.I0001Ioi1lo(j4, j5));
                    }
/* 111 */           long jI0001Ioi1lo = OooIOilolOo.I0001Ioi1lo(j, j4);
/* 115 */           long jI0000oI00 = OooIOilolOo.I0000oI00(j3, j4);
/* 119 */           oiiiii2.I00iOIl = j4;
/* 121 */           oiiiii2.I00ilI0I1 = 2;
/* 126 */           objI001lllioOl = oII1lIlol2.I001lllioOl(jI0001Ioi1lo, jI0000oI00, oiiiii2);
/* 130 */           if (objI001lllioOl != ii0111o) {
/* 133 */               j6 = j4;
/* 136 */               j5 = ((OooIOilolOo) objI001lllioOl).I00000oIO;
/* 138 */               j4 = j6;
/* 146 */               return OooIOilolOo.I00000oIO(OooIOilolOo.I0001Ioi1lo(j4, j5));
                    }
/* 132 */           return ii0111o;
                }

                @Override
                public final long I00IoIO0lI(int i, long j) {
/* 10 */            OIIIi0lOoOl oIIIi0lOoOlI010l1ol111 = this.I00lll10 ? I010l1ol111() : null;
/* 18 */            long jI00IoIO0lI = oIIIi0lOoOlI010l1ol111 != null ? oIIIi0lOoOlI010l1ol111.I00IoIO0lI(i, j) : 0L;
/* 30 */            return OIOlIiiioi.I000II(jI00IoIO0lI, this.I00o0iI0io1.I00IoIO0lI(i, OIOlIiiioi.I0001Ioi1lo(j, jI00IoIO0lI)));
                }

                @Override
                public final long I00ioIO(int i, long j, long j2) {
/* 6 */             long jI00ioIO = this.I00o0iI0io1.I00ioIO(i, j, j2);
/* 20 */            OIIIi0lOoOl oIIIi0lOoOlI010l1ol111 = this.I00lll10 ? I010l1ol111() : null;
/* 39 */            return OIOlIiiioi.I000II(jI00ioIO, oIIIi0lOoOlI010l1ol111 != null ? oIIIi0lOoOlI010l1ol111.I00ioIO(i, OIOlIiiioi.I000II(j, jI00ioIO), OIOlIiiioi.I0001Ioi1lo(j2, jI00ioIO)) : 0L);
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
                
                    if (r9 == r1) goto L27;
                 */
                /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00ll1(long j, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    OIIIOlOo oIIIOlOo;
                    long j2;
                    long j3;
/* 3 */             if (iOoil1iiIilo instanceof OIIIOlOo) {
/* 6 */                 oIIIOlOo = (OIIIOlOo) iOoil1iiIilo;
/* 8 */                 int i = oIIIOlOo.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oIIIOlOo.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    oIIIOlOo = new OIIIOlOo(this, (IOoilo) iOoil1iiIilo);
                        }
                    }
/* 27 */            Object objI00ll1 = oIIIOlOo.I00iiI;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = oIIIOlOo.I00iio;
/* 36 */            if (i2 == 0) {
/* 60 */                lIoii1l01l0i.I00000oOI(objI00ll1);
/* 67 */                OIIIi0lOoOl oIIIi0lOoOlI010l1ol111 = this.I00lll10 ? I010l1ol111() : null;
/* 71 */                if (oIIIi0lOoOlI010l1ol111 == null) {
/* 89 */                    j2 = 0;
/* 91 */                    OII1lIlol oII1lIlol = this.I00o0iI0io1;
/* 93 */                    long jI0000oI00 = OooIOilolOo.I0000oI00(j, j2);
/* 97 */                    oIIIOlOo.I00iOIl = j2;
/* 99 */                    oIIIOlOo.I00iio = 2;
/* 101 */                   objI00ll1 = oII1lIlol.I00ll1(jI0000oI00, oIIIOlOo);
/* 105 */                   if (objI00ll1 != ii0111o) {
/* 108 */                       j3 = j2;
/* 117 */                       return OooIOilolOo.I00000oIO(OooIOilolOo.I0001Ioi1lo(j3, ((OooIOilolOo) objI00ll1).I00000oIO));
                            }
/* 107 */                   return ii0111o;
                        }
/* 73 */                oIIIOlOo.I00iOIl = j;
/* 75 */                oIIIOlOo.I00iio = 1;
/* 77 */                objI00ll1 = oIIIi0lOoOlI010l1ol111.I00ll1(j, oIIIOlOo);
                    } else {
/* 38 */                if (i2 != 1) {
/* 40 */                    if (i2 != 2) {
/* 50 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                        return null;
                            }
/* 42 */                    j3 = oIIIOlOo.I00iOIl;
/* 44 */                    lIoii1l01l0i.I00000oOI(objI00ll1);
/* 117 */                   return OooIOilolOo.I00000oIO(OooIOilolOo.I0001Ioi1lo(j3, ((OooIOilolOo) objI00ll1).I00000oIO));
                        }
/* 54 */                j = oIIIOlOo.I00iOIl;
/* 56 */                lIoii1l01l0i.I00000oOI(objI00ll1);
                    }
/* 86 */            j2 = ((OooIOilolOo) objI00ll1).I00000oIO;
/* 91 */            OII1lIlol oII1lIlol2 = this.I00o0iI0io1;
/* 93 */            long jI0000oI002 = OooIOilolOo.I0000oI00(j, j2);
/* 97 */            oIIIOlOo.I00iOIl = j2;
/* 99 */            oIIIOlOo.I00iio = 2;
/* 101 */           objI00ll1 = oII1lIlol2.I00ll1(jI0000oI002, oIIIOlOo);
/* 105 */           if (objI00ll1 != ii0111o) {
                    }
/* 107 */           return ii0111o;
                }

                @Override
                public final void I010101Oo1lO() {
/* 1 */             OIIII0oOo1o oIIII0oOo1o = this.I00o0l1o1o0;
/* 3 */             oIIII0oOo1o.I00000oIO = this;
/* 6 */             oIIII0oOo1o.I00000oOI = null;
/* 8 */             this.I00o101lO = null;
/* 14 */            IlIi0Il ilIi0Il = new IlIi0Il(26);
/* 17 */            ilIi0Il.I00iiI = this;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            oIIII0oOo1o.I0000Il00O = ilIi0Il;
/* 28 */            oIIII0oOo1o.I0000O = I00ooiO1I();
                }

                @Override
                public final void I010I0() {
/* 3 */             OOo0ooi oOo0ooi = new OOo0ooi();
/* 9 */             I0lOo1lO i0lOo1lO = new I0lOo1lO(4);
/* 12 */            i0lOo1lO.I00iiI = oOo0ooi;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            lOo1ii0o1.I0000Il00O(this, i0lOo1lO);
/* 24 */            OIIIi0lOoOl oIIIi0lOoOl = (OIIIi0lOoOl) ((OoIOloiIii) oOo0ooi.I00iOIl);
/* 26 */            this.I00o101lO = oIIIi0lOoOl;
/* 28 */            OIIII0oOo1o oIIII0oOo1o = this.I00o0l1o1o0;
/* 30 */            oIIII0oOo1o.I00000oOI = oIIIi0lOoOl;
/* 34 */            if (oIIII0oOo1o.I00000oIO == this) {
/* 37 */                oIIII0oOo1o.I00000oIO = null;
/* 39 */                oIIII0oOo1o.I0000O = null;
/* 43 */                oIIII0oOo1o.I0000Il00O = iO001lollO1l.I00000oIO;
                    }
                }

                public final Ii0110 I010l1O() {
/* 1 */             OIIIi0lOoOl oIIIi0lOoOlI010l1ol111 = I010l1ol111();
/* 13 */            Ii0110 ii0110I010l1O = oIIIi0lOoOlI010l1ol111 != null ? oIIIi0lOoOlI010l1ol111.I010l1O() : null;
/* 14 */            if (ii0110I010l1O != null && il001oo1.I0000O(ii0110I010l1O)) {
/* 23 */                return ii0110I010l1O;
                    }
/* 26 */            Ii0110 ii0110 = this.I00o0l1o1o0.I0000O;
/* 28 */            if (ii0110 != null) {
/* 30 */                return ii0110;
                    }
/* 33 */            I000II.I001IO000("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
/* 5 */             return null;
                }

                public final OIIIi0lOoOl I010l1ol111() {
                    IIlOoolol0ll iIlOoolol0ll;
/* 3 */             OoIOloiIii ooIOloiIii = null;
/* 4 */             if (!this.I00lll10) {
/* 3 */                 return null;
                    }
/* 10 */            if (!this.I00iOIl.I00lll10) {
/* 14 */                IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                    }
/* 19 */            O1ooOo o1ooOo = this.I00iOIl.I00ilI0I1;
/* 21 */            O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(this);
                    loop0: while (true) {
/* 25 */                if (o0iiOioolIiI000O01llI0 == null) {
                            break;
                        }
/* 38 */                if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & 262144) != 0) {
/* 40 */                    while (o1ooOo != null) {
/* 45 */                        if ((o1ooOo.I00iiO & 262144) != 0) {
/* 47 */                            O1ooOo o1ooOoI0000Il00O = o1ooOo;
/* 48 */                            OI110O0 oi110o0 = null;
/* 49 */                            while (o1ooOoI0000Il00O != null) {
/* 53 */                                if (o1ooOoI0000Il00O instanceof OoIOloiIii) {
/* 56 */                                    OoIOloiIii ooIOloiIii2 = (OoIOloiIii) o1ooOoI0000Il00O;
/* 68 */                                    if (O0000Ioio00.I0000O(this.I00oI0i, ooIOloiIii2.I000l1()) && OIIIi0lOoOl.class == ooIOloiIii2.getClass()) {
/* 78 */                                        ooIOloiIii = ooIOloiIii2;
                                                break loop0;
                                            }
                                        }
/* 83 */                                if ((o1ooOoI0000Il00O.I00iiO & 262144) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 94 */                                    int i = 0;
/* 96 */                                    for (O1ooOo o1ooOo2 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 101 */                                       if ((o1ooOo2.I00iiO & 262144) != 0) {
/* 103 */                                           i++;
/* 105 */                                           if (i == 1) {
/* 107 */                                               o1ooOoI0000Il00O = o1ooOo2;
                                                    } else {
/* 109 */                                               if (oi110o0 == null) {
/* 117 */                                                   oi110o0 = new OI110O0(new O1ooOo[16]);
                                                        }
/* 120 */                                               if (o1ooOoI0000Il00O != null) {
/* 122 */                                                   oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 125 */                                                   o1ooOoI0000Il00O = null;
                                                        }
/* 126 */                                               oi110o0.I00000oOI(o1ooOo2);
                                                    }
                                                }
                                            }
/* 132 */                                   if (i == 1) {
                                            }
                                        }
/* 135 */                               o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                    }
                                }
/* 140 */                       o1ooOo = o1ooOo.I00ilI0I1;
                            }
                        }
/* 143 */               o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 159 */               o1ooOo = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                    }
/* 162 */           return (OIIIi0lOoOl) ooIOloiIii;
                }
            }
