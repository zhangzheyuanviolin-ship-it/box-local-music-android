            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.ScheduledExecutorService;
            
            public final class IIl1i10oO extends IIl1Ol {
                public final int I00000oIO;
                public Object I00000oOI;

                @Override
                public void I00000oIO(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 11 */                    Iterator it = ((ArrayList) this.I00000oOI).iterator();
/* 19 */                    while (it.hasNext()) {
/* 27 */                        ((IIl1Ol) it.next()).I00000oIO(i);
                            }
                            break;
                    }
                }

                @Override
                public void I00000oOI(int i, IIlI0I1li iIlI0I1li) {
                    switch (this.I00000oIO) {
                        case 0:
/* 115 */                   Iterator it = ((ArrayList) this.I00000oOI).iterator();
/* 123 */                   while (it.hasNext()) {
/* 131 */                       ((IIl1Ol) it.next()).I00000oOI(i, iIlI0I1li);
                            }
/* 135 */                   return;
                        case 1:
                        default:
/* 6 */                     return;
                        case 2:
/* 77 */                    O1li1Il o1li1Il = (O1li1Il) this.I00000oOI;
                            synchronized (o1li1Il.I00iOIl) {
                                try {
/* 84 */                            if (o1li1Il.I00ilI0I1) {
/* 108 */                               return;
                                    }
/* 101 */                           o1li1Il.I00l0I0l0lO1.put(iIlI0I1li.I0000oI00(), new IIlI0lO(iIlI0I1li));
/* 104 */                           o1li1Il.I000OiO();
/* 108 */                           return;
                                } finally {
                                }
                            }
                        case 3:
/* 15 */                    Oooo00lI oooo00lI = (Oooo00lI) ((WeakReference) this.I00000oOI).get();
/* 17 */                    if (oooo00lI != null) {
/* 21 */                        Iterator it2 = oooo00lI.I00iOIl.iterator();
/* 29 */                        while (it2.hasNext()) {
/* 37 */                            OillooOlI oillooOlI = ((Ool10o) it2.next()).I00100l0;
/* 43 */                            Iterator it3 = oillooOlI.I000II.I0000O.iterator();
/* 51 */                            while (it3.hasNext()) {
/* 70 */                                ((IIl1Ol) it3.next()).I00000oOI(i, new O1Il01(iIlI0I1li, -1L, oillooOlI.I000II.I0000oI00));
                                    }
                                }
/* 74 */                        return;
                            }
/* 74 */                    return;
                    }
                }

                @Override
                public void I0000Il00O(int i, lo1iloiI1 lo1iloii1) {
                    switch (this.I00000oIO) {
                        case 0:
/* 11 */                    Iterator it = ((ArrayList) this.I00000oOI).iterator();
/* 19 */                    while (it.hasNext()) {
/* 27 */                        ((IIl1Ol) it.next()).I0000Il00O(i, lo1iloii1);
                            }
                            break;
                    }
                }

                @Override
                public void I0000O(int i, int i2) {
                    switch (this.I00000oIO) {
                        case 0:
/* 34 */                    Iterator it = ((ArrayList) this.I00000oOI).iterator();
/* 42 */                    while (it.hasNext()) {
/* 50 */                        ((IIl1Ol) it.next()).I0000O(i, i2);
                            }
                            break;
                        case 1:
/* 7 */                     ScheduledExecutorService scheduledExecutorServiceI0000O = O1OIIoio0i1.I0000O();
/* 14 */                    I1010Iil i1010Iil = new I1010Iil(3);
/* 17 */                    i1010Iil.I00iiO = this;
/* 19 */                    i1010Iil.I00iiI = i2;
/* 21 */                    VarHandle.storeStoreFence();
/* 26 */                    ((Io11oioo) scheduledExecutorServiceI0000O).execute(i1010Iil);
                            break;
                    }
                }

                @Override
                public void I0000oI00(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 33 */                    Iterator it = ((ArrayList) this.I00000oOI).iterator();
/* 41 */                    while (it.hasNext()) {
/* 49 */                        ((IIl1Ol) it.next()).I0000oI00(i);
                            }
                            break;
                        case 1:
/* 7 */                     ScheduledExecutorService scheduledExecutorServiceI0000O = O1OIIoio0i1.I0000O();
/* 15 */                    I0100i i0100i = new I0100i(13);
/* 18 */                    i0100i.I00iiI = this;
/* 20 */                    VarHandle.storeStoreFence();
/* 25 */                    ((Io11oioo) scheduledExecutorServiceI0000O).execute(i0100i);
                            break;
                    }
                }
            }
