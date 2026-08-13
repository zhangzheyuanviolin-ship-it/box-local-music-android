            package p000;

            import android.hardware.camera2.CaptureResult;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.concurrent.CopyOnWriteArrayList;
            
            public final class O10ol1o1O implements Oi01Ooii1Ol, Io0o0l0i1Il {
                public CopyOnWriteArrayList I00iOIl;

                @Override
                public final void I00000oIO() {
/* 3 */             Iterator it = this.I00iOIl.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((Oi10iO1) it.next()).I0000O();
                    }
                }

                @Override
                public final void I00000oOI() {
/* 3 */             Iterator it = this.I00iOIl.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((Oi10iO1) it.next()).I0000O();
                    }
                }

                @Override
                public final void I0000O() {
/* 3 */             Iterator it = this.I00iOIl.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((Oi10iO1) it.next()).I0000O();
                    }
                }

                public final void I0000oI00(Oi10iO1 oi10iO1) {
/* 3 */             this.I00iOIl.add(oi10iO1);
                }

                public final void I0001Ioi1lo(long j, I0oIl0101 i0oIl0101) {
                    Integer num;
/* 3 */             Iterator it = this.I00iOIl.iterator();
/* 11 */            while (it.hasNext()) {
/* 17 */                Oi10iO1 oi10iO1 = (Oi10iO1) it.next();
/* 25 */                if (!oi10iO1.I00iio.I00oII() && !oi10iO1.I00iio.isCancelled()) {
                            synchronized (oi10iO1) {
/* 38 */                        Oi0Il00oOio1 oi0Il00oOio1 = oi10iO1.I00io1l;
/* 40 */                        if (oi0Il00oOio1 != null && j >= oi0Il00oOio1.I00000oIO) {
/* 59 */                            Long l = (Long) i0oIl0101.I00iOIl.get(CaptureResult.SENSOR_TIMESTAMP);
/* 63 */                            long frameNumber = i0oIl0101.I00iOIl.getFrameNumber();
/* 67 */                            if (l != null && oi10iO1.I00ilO0 == null) {
/* 73 */                                oi10iO1.I00ilO0 = l;
                                    }
/* 75 */                            Long l2 = oi10iO1.I00ilO0;
/* 79 */                            if (oi10iO1.I00iiO == null || l2 == null || l == null || l.longValue() - l2.longValue() <= oi10iO1.I00iiO.longValue()) {
/* 118 */                               if (oi10iO1.I00ilI0I1 == null) {
/* 122 */                                   IllIiOlOoIll illIiOlOoIll = new IllIiOlOoIll();
/* 125 */                                   illIiOlOoIll.I00000oIO = frameNumber;
/* 127 */                                   VarHandle.storeStoreFence();
/* 130 */                                   oi10iO1.I00ilI0I1 = illIiOlOoIll;
                                        }
/* 132 */                               IllIiOlOoIll illIiOlOoIll2 = oi10iO1.I00ilI0I1;
/* 134 */                               if (illIiOlOoIll2 != null && (num = oi10iO1.I00iiI) != null && frameNumber - illIiOlOoIll2.I00000oIO > num.intValue()) {
/* 160 */                                   oi10iO1.I00iio.I00O10llo(new Oi10OoO0l(1, i0oIl0101));
                                        } else if (((Boolean) oi10iO1.I00iOIl.invoke(i0oIl0101)).booleanValue()) {
/* 188 */                                   oi10iO1.I00iio.I00O10llo(new Oi10OoO0l(0, i0oIl0101));
                                        }
                                    } else {
/* 112 */                               oi10iO1.I00iio.I00O10llo(new Oi10OoO0l(2, i0oIl0101));
                                    }
                                }
                            }
                        }
/* 201 */               this.I00iOIl.remove(oi10iO1);
                    }
                }

                @Override
                public final void I000O01llI0(Oi0Iil oi0Iil) {
/* 3 */             Iterator it = this.I00iOIl.iterator();
/* 11 */            while (it.hasNext()) {
/* 17 */                Oi10iO1 oi10iO1 = (Oi10iO1) it.next();
/* 19 */                long jI00iOIl = oi0Iil.I00iOIl();
                        synchronized (oi10iO1) {
/* 26 */                    if (oi10iO1.I00io1l == null) {
/* 30 */                        Oi0Il00oOio1 oi0Il00oOio1 = new Oi0Il00oOio1();
/* 33 */                        oi0Il00oOio1.I00000oIO = jI00iOIl;
/* 35 */                        VarHandle.storeStoreFence();
/* 38 */                        oi10iO1.I00io1l = oi0Il00oOio1;
                            }
                        }
                    }
                }

                @Override
                public final void I00IOO(Oi0Iil oi0Iil, long j, I0oIili1iI i0oIili1iI) {
/* 7 */             I0001Ioi1lo(oi0Iil.I00iOIl(), i0oIili1iI.I00iiI);
                }

                @Override
                public final void I00Io1lO(Oi0Iil oi0Iil, long j, I0oIl0101 i0oIl0101) {
/* 5 */             I0001Ioi1lo(oi0Iil.I00iOIl(), i0oIl0101);
                }
            }
