            package p000;

            import java.util.Collections;
            
            public final class IIio0010i1l implements Oi01Ooii1Ol {
                public Object I00iOIl;
                public Object I00iiI;
                public IIl0lo1oi I00iiO;
                public IOi10loi I00iio;
                public IOi10loi I00ilI0I1;

                public final void I00000oIO(IIloOI iIloOI) {
                    synchronized (this.I00iOIl) {
/* 16 */                for (I1ioiI i1ioiI : iIloOI.I0000Il00O()) {
/* 34 */                    this.I00iiO.I00iiI.I000lI(i1ioiI, IOlOo0.I00iOIl, iIloOI.I0000O(i1ioiI));
                        }
                    }
                }

                public final IOi10loi I00000oOI(Ool1lo ool1lo, boolean z) {
                    IIl0oI iIl0oII00000oIO;
/* 3 */             IOi10loi iOi10loi = new IOi10loi();
                    synchronized (this.I00iOIl) {
/* 11 */                iIl0oII00000oIO = this.I00iiO.I00000oIO();
                    }
                    synchronized (this.I00iiI) {
                        try {
/* 20 */                    if (ool1lo != null) {
/* 22 */                        IOi10loi iOi10loi2 = this.I00iio;
/* 24 */                        if (z) {
/* 26 */                            if (iOi10loi2 != null) {
/* 35 */                                iOi10loi2.I00iIO(new I1o1lOlooI1("Camera2CameraControl was updated with new options.", 1));
                                    }
                                } else if (iOi10loi2 != null) {
/* 41 */                            iiolOOio1.I0000Il00O(iOi10loi, iOi10loi2);
                                }
/* 47 */                        this.I00iio = iOi10loi;
/* 63 */                        ool1lo.I000II(iIl0oII00000oIO, Collections.singletonMap("Camera2CameraControl.tag", Integer.valueOf(iOi10loi.hashCode())));
                            } else {
/* 67 */                        IOi10loi iOi10loi3 = this.I00ilI0I1;
/* 69 */                        if (iOi10loi3 != null) {
/* 78 */                            iOi10loi3.I00iIO(new I1o1lOlooI1("Camera2CameraControl was updated with new options.", 1));
                                }
/* 81 */                        this.I00ilI0I1 = iOi10loi;
                            }
                        } catch (Throwable th) {
/* 86 */                    throw th;
                        }
                    }
/* 84 */            return iOi10loi;
                }

                @Override
                public final void I00OIl(Oi0Iil oi0Iil, long j, I0oIili1iI i0oIili1iI) {
                    synchronized (this.I00iiI) {
/* 4 */                 IOi10loi iOi10loi = this.I00iio;
/* 6 */                 if (iOi10loi != null) {
/* 38 */                    if (O0000Ioio00.I0000O(((Olo0o1II0) oi0Iil.I00000oIO(Olo10o10.I00000oIO, Olo0o1II0.I00000oOI)).I00000oIO.get("Camera2CameraControl.tag"), Integer.valueOf(iOi10loi.hashCode()))) {
/* 41 */                        iOi10loi.I00O10llo(null);
/* 44 */                        this.I00iio = null;
/* 46 */                        IOi10loi iOi10loi2 = this.I00ilI0I1;
/* 48 */                        if (iOi10loi2 != null) {
/* 50 */                            iOi10loi2.I00O10llo(null);
/* 53 */                            this.I00ilI0I1 = null;
                                }
                            }
                        }
                    }
                }
            }
