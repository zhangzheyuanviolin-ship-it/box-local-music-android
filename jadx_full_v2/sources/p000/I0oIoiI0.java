            package p000;
            
            public final class I0oIoiI0 implements Io10IIII {
                public I0lio1O01i01 I00000oIO;
                public Object I00000oOI;
                public boolean I0000Il00O;
                public IIlio101Io I0000O;
                public I0oIl0OolO I0000oI00;

                @Override
                public final void I00000oIO(Io10IOI io10IOI) {
                    synchronized (this.I00000oOI) {
/* 6 */                 if (!io10IOI.I0010o) {
/* 9 */                     io10IOI.I0010o = true;
/* 11 */                    io10IOI.I00000oOI();
                        }
                    }
                }

                @Override
                public final IIlio101Io I00000oOI() {
/* 1 */             IIlio101Io iIlio101Io = this.I0000O;
/* 3 */             if (iIlio101Io != null) {
/* 20 */                return iIlio101Io;
                    }
/* 8 */             IIlio101Io iIlio101Io2 = new IIlio101Io(2);
/* 11 */            this.I0000O = iIlio101Io2;
/* 20 */            return iIlio101Io2;
                }

                @Override
                public final Io10IOI I0000Il00O() {
                    Io10IOI io10IOI;
                    synchronized (this.I00000oOI) {
/* 6 */                 this.I00000oIO.getUniqueDrawingId();
/* 16 */                io10IOI = new Io10IOI(new Io10OiIIOi0o());
                    }
/* 20 */            return io10IOI;
                }

                public final void I0000O() {
/* 1 */             IIlio101Io iIlio101Io = this.I0000O;
/* 4 */             if (iIlio101Io != null) {
                        synchronized (iIlio101Io) {
                            try {
/* 9 */                         OI10I1IoI0Ol oI10I1IoI0Ol = (OI10I1IoI0Ol) iIlio101Io.I00iiI;
/* 11 */                        if (oI10I1IoI0Ol != null) {
/* 13 */                            oI10I1IoI0Ol.I00000oIO();
                                }
/* 19 */                        iIlio101Io.I00iiO = null;
                            } catch (Throwable th) {
/* 24 */                        throw th;
                            }
                        }
                    }
/* 25 */            this.I0000O = null;
                }
            }
