            package p000;

            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ScheduledExecutorService;
            
            public final class OOIo0Ol1OO implements Runnable {
                public final int I00iOIl;
                public OoIlIoo1oiOo I00iiI;
                public I1lIII10oIl I00iiO;

                public OOIo0Ol1OO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() throws Exception {
                    switch (this.I00iOIl) {
                        case 0:
/* 125 */                   OoIlIoo1oiOo ooIlIoo1oiOo = this.I00iiI;
/* 127 */                   I1lIII10oIl i1lIII10oIl = this.I00iiO;
/* 131 */                   OOIo1Iiiil oOIo1Iiiil = i1lIII10oIl.I00000oIO;
                            try {
/* 141 */                       I1l1oO0OI1 i1l1oO0OI1 = (I1l1oO0OI1) ((i1O01oOIoI0I) ooIlIoo1oiOo.I00ilI0I1).apply(i1lIII10oIl);
/* 143 */                       int i = i1l1oO0OI1.I0000Il00O;
/* 171 */                       lII1OI11o1I.I00000oIO("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + i, i == 35 || i == 256 || i == 4101);
/* 178 */                       ((iOloo0O0O) ooIlIoo1oiOo.I00li1OI).I000OOo1O(i1l1oO0OI1);
/* 181 */                       ScheduledExecutorService scheduledExecutorServiceI0000O = O1OIIoio0i1.I0000O();
/* 187 */                       OOIl1i1 oOIl1i1 = new OOIl1i1(1);
/* 190 */                       oOIl1i1.I00iiI = oOIo1Iiiil;
/* 192 */                       VarHandle.storeStoreFence();
/* 197 */                       ((Io11oioo) scheduledExecutorServiceI0000O).execute(oOIl1i1);
/* 214 */                       return;
                            } catch (Exception e) {
/* 204 */                       i1lIII10oIl.I00000oOI.close();
/* 211 */                       l11I11lO.I00000oOI("ProcessingNode", "process postview input packet failed.", e);
/* 214 */                       return;
                            }
                        case 1:
/* 85 */                    OoIlIoo1oiOo ooIlIoo1oiOo2 = this.I00iiI;
/* 87 */                    I1lIII10oIl i1lIII10oIl2 = this.I00iiO;
/* 92 */                    OOIo0Ol1OO oOIo0Ol1OO = new OOIo0Ol1OO(2);
/* 95 */                    oOIo0Ol1OO.I00iiI = ooIlIoo1oiOo2;
/* 97 */                    oOIo0Ol1OO.I00iiO = i1lIII10oIl2;
/* 99 */                    VarHandle.storeStoreFence();
/* 110 */                   lOo0I0iOi11O.I00000oIO("CX:".concat("processInputPacket"));
                            try {
/* 113 */                       oOIo0Ol1OO.run();
/* 119 */                       return;
                            } finally {
/* 121 */                       Trace.endSection();
                            }
                        default:
/* 7 */                     OoIlIoo1oiOo ooIlIoo1oiOo3 = this.I00iiI;
/* 9 */                     I1lIII10oIl i1lIII10oIl3 = this.I00iiO;
/* 11 */                    OOIo1Iiiil oOIo1Iiiil2 = i1lIII10oIl3.I00000oIO;
                            try {
/* 19 */                        ((I1lII0lO) ooIlIoo1oiOo3.I00iio).I0000O.size();
/* 22 */                        oOIo1Iiiil2.getClass();
/* 25 */                        IoiO1IO1I1i ioiO1IO1I1iI0001Ioi1lo = ooIlIoo1oiOo3.I0001Ioi1lo(i1lIII10oIl3);
/* 29 */                        ScheduledExecutorService scheduledExecutorServiceI0000O2 = O1OIIoio0i1.I0000O();
/* 37 */                        Io11iII11ll io11iII11ll = new Io11iII11ll(12);
/* 40 */                        io11iII11ll.I00iiI = oOIo1Iiiil2;
/* 42 */                        io11iII11ll.I00iiO = ioiO1IO1I1iI0001Ioi1lo;
/* 44 */                        VarHandle.storeStoreFence();
/* 49 */                        ((Io11oioo) scheduledExecutorServiceI0000O2).execute(io11iII11ll);
/* 84 */                        return;
                            } catch (Ioi1lIO e2) {
/* 81 */                        OoIlIoo1oiOo.I000O01llI0(oOIo1Iiiil2, e2);
/* 84 */                        return;
                            } catch (OutOfMemoryError e3) {
/* 77 */                        OoIlIoo1oiOo.I000O01llI0(oOIo1Iiiil2, new Ioi1lIO("Processing failed due to low memory.", e3, 0));
/* 84 */                        return;
                            } catch (RuntimeException e4) {
/* 66 */                        OoIlIoo1oiOo.I000O01llI0(oOIo1Iiiil2, new Ioi1lIO("Processing failed.", e4, 0));
/* 84 */                        return;
                            }
                    }
                }
            }
