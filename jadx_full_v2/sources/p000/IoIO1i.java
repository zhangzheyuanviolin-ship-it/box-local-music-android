            package p000;

            import java.io.IOException;
            
            public final class IoIO1i extends OloIi00i {
                public final int I0000oI00;
                public final Object I0001Ioi1lo;
                public final Object I000II;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoIO1i(String str, Object obj, Object obj2, int i) {
/* 8 */             super(str, true);
/* 1 */             this.I0000oI00 = i;
/* 3 */             this.I0001Ioi1lo = obj;
/* 5 */             this.I000II = obj2;
                }

                @Override
                public final long I00000oIO() {
                    int i;
                    long jI00000oIO;
/* 5 */             IoIi1I11l11[] ioIi1I11l11Arr = null;
                    switch (this.I0000oI00) {
                        case 0:
/* 264 */                   OOll1O oOll1O = ((IoIOii01O) this.I0001Ioi1lo).I00iOIl;
/* 272 */                   Oio10I11IIi oio10I11IIi = (Oio10I11IIi) ((OOo0ooi) this.I000II).I00iOIl;
                            synchronized (oOll1O) {
/* 289 */                       oOll1O.I000o00OoI0I = (oio10I11IIi.I00000oIO & 16) != 0 ? oio10I11IIi.I00000oOI[4] : Integer.MAX_VALUE;
                            }
/* 6 */                     return -1L;
                        case 1:
                            try {
/* 217 */                       ((IoIi1I11l11) this.I000II).I0000Il00O(8, null);
                            } catch (IOException e) {
/* 222 */                       OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 224 */                       OO1I1IllO oO1I1IllO2 = OO1I1IllO.I00000oIO;
/* 242 */                       String str = "Http2Connection.Listener failure for " + ((IoIOii01O) this.I0001Ioi1lo).I00iiO;
/* 246 */                       oO1I1IllO2.getClass();
/* 249 */                       OO1I1IllO.I0001Ioi1lo(str, e, 4);
                                try {
/* 256 */                           ((IoIi1I11l11) this.I000II).I0000Il00O(2, e);
                                } catch (IOException unused) {
                                }
                            }
/* 6 */                     return -1L;
                        default:
/* 13 */                    I01illiil1Oo i01illiil1Oo = (I01illiil1Oo) this.I0001Ioi1lo;
/* 17 */                    Oio10I11IIi oio10I11IIi2 = (Oio10I11IIi) this.I000II;
/* 21 */                    OOo0ooi oOo0ooi = new OOo0ooi();
/* 26 */                    IoIOii01O ioIOii01O = (IoIOii01O) i01illiil1Oo.I00iiI;
                            synchronized (ioIOii01O.I00ol1) {
                                synchronized (ioIOii01O) {
                                    try {
/* 32 */                                Oio10I11IIi oio10I11IIi3 = ioIOii01O.I00o101lO;
/* 36 */                                Oio10I11IIi oio10I11IIi4 = new Oio10I11IIi();
/* 39 */                                i = 0;
/* 44 */                                for (int i2 = 0; i2 < 10; i2++) {
/* 51 */                                    if (((1 << i2) & oio10I11IIi3.I00000oIO) != 0) {
/* 57 */                                        oio10I11IIi4.I00000oOI(i2, oio10I11IIi3.I00000oOI[i2]);
                                            }
                                        }
/* 64 */                                for (int i3 = 0; i3 < 10; i3++) {
/* 71 */                                    if (((1 << i3) & oio10I11IIi2.I00000oIO) != 0) {
/* 77 */                                        oio10I11IIi4.I00000oOI(i3, oio10I11IIi2.I00000oOI[i3]);
                                            }
                                        }
/* 83 */                                oOo0ooi.I00iOIl = oio10I11IIi4;
/* 95 */                                jI00000oIO = oio10I11IIi4.I00000oIO() - oio10I11IIi3.I00000oIO();
/* 100 */                               if (jI00000oIO != 0 && !ioIOii01O.I00iiI.isEmpty()) {
/* 123 */                                   ioIi1I11l11Arr = (IoIi1I11l11[]) ioIOii01O.I00iiI.values().toArray(new IoIi1I11l11[0]);
                                        }
/* 132 */                               ioIOii01O.I00o101lO = (Oio10I11IIi) oOo0ooi.I00iOIl;
/* 160 */                               ioIOii01O.I00l0OO0IO.I0000Il00O(new IoIO1i(ioIOii01O.I00iiO + " onSettings", ioIOii01O, oOo0ooi, i), 0L);
                                    } finally {
                                    }
                                }
                                try {
/* 170 */                           ioIOii01O.I00ol1.I00000oIO((Oio10I11IIi) oOo0ooi.I00iOIl);
                                } catch (IOException e2) {
/* 177 */                           ioIOii01O.I00000oIO(2, 2, e2);
                                }
                            }
/* 181 */                   if (ioIi1I11l11Arr != null) {
/* 183 */                       int length = ioIi1I11l11Arr.length;
/* 184 */                       while (i < length) {
/* 186 */                           IoIi1I11l11 ioIi1I11l11 = ioIi1I11l11Arr[i];
                                    synchronized (ioIi1I11l11) {
                                        ioIi1I11l11.I0001Ioi1lo += jI00000oIO;
/* 194 */                               if (jI00000oIO > 0) {
/* 196 */                                   ioIi1I11l11.notifyAll();
                                        }
                                    }
/* 200 */                           i++;
                                }
                            }
/* 6 */                     return -1L;
                    }
                }
            }
