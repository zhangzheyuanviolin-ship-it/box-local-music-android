            package p000;

            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            
            public final class Oo0ll0I1OO00 extends O1ooOo implements O0iOoioOoI, Iillo1il11l, OiiooOl {
                public String I00o0iI0io1;
                public Oo0lloOiiIOI I00o0l1o1o0;
                public IliO0o11i01 I00o101lO;
                public int I00oI0i;
                public boolean I00oII;
                public int I00oIiI10;
                public int I00oO101o;
                public IOOioI10Il1 I00oOio10iI1;
                public HashMap I00ol1;
                public OIoiOoo0 I00olI;
                public Oo0liI100 I00oli;
                public Oo0lioo I00oliIiO01i;

                /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0033, B:20:0x003a, B:21:0x0042, B:22:0x006f, B:12:0x0015), top: B:28:0x0005 }] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
                    OIoiOoo0 oIoiOoo0I010l1O;
/* 3 */             Trace.beginSection("TextStringSimpleNode::measure");
                    try {
/* 6 */                 Oo0lioo oo0lioo = this.I00oliIiO01i;
/* 8 */                 if (oo0lioo == null) {
/* 22 */                    oIoiOoo0I010l1O = I010l1O();
                        } else {
/* 12 */                    if (!oo0lioo.I0000Il00O) {
/* 15 */                        oo0lioo = null;
                            }
/* 16 */                    if (oo0lioo == null || (oIoiOoo0I010l1O = oo0lioo.I0000O) == null) {
                            }
                        }
/* 26 */                oIoiOoo0I010l1O.I0000O(o1iOIoOiO0);
/* 33 */                boolean zI00000oOI = oIoiOoo0I010l1O.I00000oOI(j, o1iOIoOiO0.getLayoutDirection());
/* 37 */                OIoiOo11o oIoiOo11o = oIoiOoo0I010l1O.I000o00OoI0I;
/* 39 */                if (oIoiOo11o != null) {
/* 41 */                    oIoiOo11o.I0000O();
                        }
/* 44 */                I0oilIol11i i0oilIol11i = oIoiOoo0I010l1O.I000OiO;
/* 46 */                Oo0iOioO oo0iOioO = i0oilIol11i.I0000Il00O;
/* 48 */                long j2 = oIoiOoo0I010l1O.I000l1;
/* 50 */                if (zI00000oOI) {
/* 52 */                    l0o11Oi.I00000oIO(this);
/* 55 */                    HashMap map = this.I00ol1;
/* 57 */                    if (map == null) {
/* 62 */                        map = new HashMap(2);
/* 65 */                        this.I00ol1 = map;
                            }
/* 85 */                    map.put(I0l00ioI.I00000oIO, Integer.valueOf(Math.round(oo0iOioO.I0000O(0) + i0oilIol11i.I0001Ioi1lo)));
/* 109 */                   map.put(I0l00ioI.I00000oOI, Integer.valueOf(Math.round(oo0iOioO.I0000O(oo0iOioO.I000II - 1) + i0oilIol11i.I0001Ioi1lo)));
                        }
/* 116 */               int i = (int) (j2 >> 32);
/* 123 */               int i2 = (int) (4294967295L & j2);
/* 128 */               OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(iio0lo1i.I00000oOI(i, i, i2, i2));
/* 132 */               Map map2 = this.I00ol1;
/* 138 */               I0li0o i0li0o = new I0li0o(16);
/* 141 */               i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 143 */               VarHandle.storeStoreFence();
/* 146 */               return o1iOIoOiO0.I001i1lo1io(i, i2, map2, i0li0o);
                    } finally {
/* 155 */               Trace.endSection();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I0001Ioi1lo(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
                    OIoiOoo0 oIoiOoo0I010l1O;
/* 1 */             Oo0lioo oo0lioo = this.I00oliIiO01i;
/* 3 */             if (oo0lioo == null) {
/* 17 */                oIoiOoo0I010l1O = I010l1O();
                    } else {
/* 7 */                 if (!oo0lioo.I0000Il00O) {
/* 10 */                    oo0lioo = null;
                        }
/* 11 */                if (oo0lioo == null || (oIoiOoo0I010l1O = oo0lioo.I0000O) == null) {
                        }
                    }
/* 21 */            oIoiOoo0I010l1O.I0000O(o1IiO0l);
/* 36 */            return lOiooi0lII0.I00000oIO(oIoiOoo0I010l1O.I0000oI00(o1IiO0l.getLayoutDirection()).I000l1());
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00Ol10(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
                    OIoiOoo0 oIoiOoo0I010l1O;
/* 1 */             Oo0lioo oo0lioo = this.I00oliIiO01i;
/* 3 */             if (oo0lioo == null) {
/* 17 */                oIoiOoo0I010l1O = I010l1O();
                    } else {
/* 7 */                 if (!oo0lioo.I0000Il00O) {
/* 10 */                    oo0lioo = null;
                        }
/* 11 */                if (oo0lioo == null || (oIoiOoo0I010l1O = oo0lioo.I0000O) == null) {
                        }
                    }
/* 21 */            oIoiOoo0I010l1O.I0000O(o1IiO0l);
/* 28 */            return oIoiOoo0I010l1O.I00000oIO(i, o1IiO0l.getLayoutDirection());
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00iOIl(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
                    OIoiOoo0 oIoiOoo0I010l1O;
/* 1 */             Oo0lioo oo0lioo = this.I00oliIiO01i;
/* 3 */             if (oo0lioo == null) {
/* 17 */                oIoiOoo0I010l1O = I010l1O();
                    } else {
/* 7 */                 if (!oo0lioo.I0000Il00O) {
/* 10 */                    oo0lioo = null;
                        }
/* 11 */                if (oo0lioo == null || (oIoiOoo0I010l1O = oo0lioo.I0000O) == null) {
                        }
                    }
/* 21 */            oIoiOoo0I010l1O.I0000O(o1IiO0l);
/* 28 */            return oIoiOoo0I010l1O.I00000oIO(i, o1IiO0l.getLayoutDirection());
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00l0I0l0lO1(O0iiliOio o0iiliOio) {
                    OIoiOoo0 oIoiOoo0I010l1O;
/* 3 */             if (!this.I00lll10) {
/* 157 */               return;
                    }
/* 7 */             Oo0lioo oo0lioo = this.I00oliIiO01i;
/* 9 */             if (oo0lioo == null) {
/* 23 */                oIoiOoo0I010l1O = I010l1O();
                    } else {
/* 13 */                if (!oo0lioo.I0000Il00O) {
/* 16 */                    oo0lioo = null;
                        }
/* 17 */                if (oo0lioo == null || (oIoiOoo0I010l1O = oo0lioo.I0000O) == null) {
                        }
                    }
/* 27 */            I0oilIol11i i0oilIol11i = oIoiOoo0I010l1O.I000OiO;
/* 29 */            if (i0oilIol11i == null) {
/* 195 */               Ioll0IliO1l.I00000oOI("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.I00olI + ", textSubstitution=" + this.I00oliIiO01i + ")");
/* 198 */               IOOlIIilOl0.I0000Il00O();
/* 437 */               return;
                    }
/* 35 */            IIolOo iIolOoI0010o = o0iiliOio.I00iOIl.I00iiI.I0010o();
/* 39 */            boolean z = oIoiOoo0I010l1O.I000iOII;
/* 41 */            if (z) {
/* 43 */                long j = oIoiOoo0I010l1O.I000l1;
/* 59 */                iIolOoI0010o.I000II();
/* 65 */                iIolOoI0010o.I000lI(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
                    }
                    try {
/* 68 */                Oo0lloOiiIOI oo0lloOiiIOI = this.I00o0l1o1o0;
/* 70 */                OlIIi1oIIOlo olIIi1oIIOlo = oo0lloOiiIOI.I00000oIO;
/* 72 */                OlooIOI0O olooIOI0O = olIIi1oIIOlo.I000lI;
/* 74 */                if (olooIOI0O == null) {
/* 76 */                    olooIOI0O = OlooIOI0O.I00000oOI;
                        }
/* 78 */                OlooIOI0O olooIOI0O2 = olooIOI0O;
/* 83 */                OioOII0oI oioOII0oI = olIIi1oIIOlo.I000o00OoI0I;
/* 85 */                if (oioOII0oI == null) {
/* 87 */                    oioOII0oI = OioOII0oI.I0000O;
                        }
/* 89 */                OioOII0oI oioOII0oI2 = oioOII0oI;
/* 90 */                Iilloo0IOoIo iilloo0IOoIo = olIIi1oIIOlo.I00100l0;
/* 92 */                if (iilloo0IOoIo == null) {
/* 94 */                    iilloo0IOoIo = IlIl1I110o0I.I00000oIO;
                        }
/* 96 */                Iilloo0IOoIo iilloo0IOoIo2 = iilloo0IOoIo;
/* 97 */                III11l1I iII11l1II0000Il00O = oo0lloOiiIOI.I0000Il00O();
/* 101 */               if (iII11l1II0000Il00O != null) {
/* 111 */                   i0oilIol11i.I000O01llI0(iIolOoI0010o, iII11l1II0000Il00O, oo0lloOiiIOI.I00000oIO.I00000oIO.I0000Il00O(), oioOII0oI2, olooIOI0O2, iilloo0IOoIo2);
                        } else {
/* 115 */                   IOOioI10Il1 iOOioI10Il1 = this.I00oOio10iI1;
/* 124 */                   long jI00000oIO = iOOioI10Il1 != null ? iOOioI10Il1.I00000oIO() : IOOiio0i.I000o00OoI0I;
/* 130 */                   if (jI00000oIO == 16) {
/* 146 */                       jI00000oIO = oo0lloOiiIOI.I0000O() != 16 ? oo0lloOiiIOI.I0000O() : IOOiio0i.I00000oOI;
                            }
/* 149 */                   i0oilIol11i.I000II(iIolOoI0010o, jI00000oIO, oioOII0oI2, olooIOI0O2, iilloo0IOoIo2, 3);
                        }
/* 152 */               if (z) {
/* 154 */                   iIolOoI0010o.I00100l0();
                        }
                    } finally {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I00li1OI(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
                    OIoiOoo0 oIoiOoo0I010l1O;
/* 1 */             Oo0lioo oo0lioo = this.I00oliIiO01i;
/* 3 */             if (oo0lioo == null) {
/* 17 */                oIoiOoo0I010l1O = I010l1O();
                    } else {
/* 7 */                 if (!oo0lioo.I0000Il00O) {
/* 10 */                    oo0lioo = null;
                        }
/* 11 */                if (oo0lioo == null || (oIoiOoo0I010l1O = oo0lioo.I0000O) == null) {
                        }
                    }
/* 21 */            oIoiOoo0I010l1O.I0000O(o1IiO0l);
/* 36 */            return lOiooi0lII0.I00000oIO(oIoiOoo0I010l1O.I0000oI00(o1IiO0l.getLayoutDirection()).I000II());
                }

                @Override
                public final void I00oOio10iI1(Oil0O0I oil0O0I) {
/* 1 */             Oo0liI100 oo0liI100 = this.I00oli;
/* 3 */             if (oo0liI100 == null) {
/* 8 */                 oo0liI100 = new Oo0liI100(0);
/* 11 */                oo0liI100.I00iiI = this;
/* 13 */                VarHandle.storeStoreFence();
/* 16 */                this.I00oli = oo0liI100;
                    }
/* 22 */            I1111OO10i i1111OO10i = new I1111OO10i(this.I00o0iI0io1);
/* 25 */            O0O00I1Ili[] o0O00I1IliArr = Oil0Io.I00000oIO;
/* 33 */            oil0O0I.I00000oOI(Oil0I1O.I001lloI, Collections.singletonList(i1111OO10i));
/* 36 */            Oo0lioo oo0lioo = this.I00oliIiO01i;
/* 38 */            if (oo0lioo != null) {
/* 40 */                boolean z = oo0lioo.I0000Il00O;
/* 42 */                Oil0IoooOio oil0IoooOio = Oil0I1O.I00II0oii1o;
/* 44 */                O0O00I1Ili[] o0O00I1IliArr2 = Oil0Io.I00000oIO;
/* 48 */                O0O00I1Ili o0O00I1Ili = o0O00I1IliArr2[17];
/* 50 */                Boolean boolValueOf = Boolean.valueOf(z);
/* 54 */                oil0IoooOio.getClass();
/* 57 */                oil0O0I.I00000oOI(oil0IoooOio, boolValueOf);
/* 64 */                I1111OO10i i1111OO10i2 = new I1111OO10i(oo0lioo.I00000oOI);
/* 67 */                Oil0IoooOio oil0IoooOio2 = Oil0I1O.I00II0Ol1O0l;
/* 71 */                O0O00I1Ili o0O00I1Ili2 = o0O00I1IliArr2[16];
/* 73 */                oil0IoooOio2.getClass();
/* 76 */                oil0O0I.I00000oOI(oil0IoooOio2, i1111OO10i2);
                    }
/* 82 */            Oo0liI100 oo0liI1002 = new Oo0liI100(1);
/* 85 */            oo0liI1002.I00iiI = this;
/* 87 */            VarHandle.storeStoreFence();
/* 98 */            oil0O0I.I00000oOI(Oiioi1IoIIli.I000l1, new I01lOOlO0o(null, oo0liI1002));
/* 104 */           Oo0liI100 oo0liI1003 = new Oo0liI100(2);
/* 107 */           oo0liI1003.I00iiI = this;
/* 109 */           VarHandle.storeStoreFence();
/* 119 */           oil0O0I.I00000oOI(Oiioi1IoIIli.I000lI, new I01lOOlO0o(null, oo0liI1003));
/* 126 */           OlOi0iollo olOi0iollo = new OlOi0iollo(9);
/* 129 */           olOi0iollo.I00iiI = this;
/* 131 */           VarHandle.storeStoreFence();
/* 141 */           oil0O0I.I00000oOI(Oiioi1IoIIli.I000o00OoI0I, new I01lOOlO0o(null, olOi0iollo));
/* 144 */           Oil0Io.I00000oIO(oil0O0I, oo0liI100);
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                public final OIoiOoo0 I010l1O() {
/* 1 */             Oo0lloOiiIOI oo0lloOiiIOI = this.I00o0l1o1o0;
/* 3 */             OIoiOoo0 oIoiOoo0 = this.I00olI;
/* 5 */             if (oIoiOoo0 != null) {
/* 55 */                return oIoiOoo0;
                    }
/* 21 */            OIoiOoo0 oIoiOoo02 = new OIoiOoo0(this.I00o0iI0io1, oo0lloOiiIOI, this.I00o101lO, this.I00oI0i, this.I00oII, this.I00oIiI10, this.I00oO101o);
/* 24 */            this.I00olI = oIoiOoo02;
/* 55 */            return oIoiOoo02;
                }
            }
