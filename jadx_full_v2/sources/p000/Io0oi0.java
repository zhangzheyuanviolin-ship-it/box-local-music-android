            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public final class Io0oi0 {
                public IIll0Oilo I00000oIO;
                public IIliIi1O0OiO I00000oOI;
                public Io0oO1OiI I0000Il00O;
                public List I0000O;
                public OlO0OIIl1 I0000oI00;

                public final void I00000oIO(Io0oll10il io0oll10il) {
                    Object value;
                    Io101i1I io101i1I;
/* 1 */             toString();
/* 4 */             io0oll10il.toString();
/* 7 */             OlO0OIIl1 olO0OIIl1 = this.I0000oI00;
/* 33 */            do {
/* 9 */                 value = olO0OIIl1.getValue();
/* 14 */                io101i1I = (Io101i1I) value;
/* 33 */            } while (!olO0OIIl1.I000iOII(value, ((io101i1I instanceof Io100oIl) || (io101i1I instanceof Io100Oi)) ? Io100Oi.I00000oOI : io0oll10il));
/* 45 */            for (Io101ll1ol io101ll1ol : this.I0000O) {
/* 59 */                io101ll1ol.I00000oIO.I00000oOI(io101ll1ol.I00000oIO(), io0oll10il);
                    }
                }

                public final void I00000oOI(I0oiil10Ili i0oiil10Ili) {
/* 1 */             toString();
/* 4 */             OlO0OIIl1 olO0OIIl1 = this.I0000oI00;
/* 6 */             Io0ooIl1 io0ooIl1 = Io0ooIl1.I00000oOI;
/* 8 */             olO0OIIl1.getClass();
/* 12 */            olO0OIIl1.I000lI(null, io0ooIl1);
/* 17 */            this.I0000Il00O.I00Io1lO(i0oiil10Ili);
/* 30 */            for (Io101ll1ol io101ll1ol : this.I0000O) {
/* 44 */                io101ll1ol.I00000oIO.I00000oOI(io101ll1ol.I00000oIO(), io0ooIl1);
                    }
                }

                public final void I0000Il00O() {
/* 1 */             toString();
/* 4 */             OlO0OIIl1 olO0OIIl1 = this.I0000oI00;
/* 6 */             olO0OIIl1.getClass();
/* 10 */            Io100Oi io100Oi = Io100Oi.I00000oOI;
/* 12 */            olO0OIIl1.I000lI(null, io100Oi);
/* 17 */            this.I0000Il00O.I00Io1lO(null);
/* 30 */            for (Io101ll1ol io101ll1ol : this.I0000O) {
/* 44 */                io101ll1ol.I00000oIO.I00000oOI(io101ll1ol.I00000oIO(), io100Oi);
                    }
                }

                public final void I0000O(Oi01iIoI oi01iIoI) {
/* 1 */             Io0oO1OiI io0oO1OiI = this.I0000Il00O;
                    synchronized (io0oO1OiI.I00ioIO) {
                        try {
/* 6 */                     Oi01iIoI oi01iIoI2 = io0oO1OiI.I00li1OI;
/* 8 */                     io0oO1OiI.I00li1OI = oi01iIoI;
/* 10 */                    if (oi01iIoI2 != null || oi01iIoI != null) {
/* 15 */                        o01l1ioOo0 o01l1iooo0 = io0oO1OiI.I00io1l;
/* 17 */                        if (oi01iIoI != null) {
/* 24 */                            o01l1iooo0.I0010I0i(new Io0lOi0(oi01iIoI));
                                } else {
/* 32 */                            o01l1iooo0.I0010I0i(Io0l00io.I0000O);
                                }
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 36 */            if (oi01iIoI == null) {
/* 40 */                int size = io0oO1OiI.I00iio.size();
/* 45 */                for (int i = 0; i < size; i++) {
/* 55 */                    ((Io0o0l0i1Il) io0oO1OiI.I00iio.get(i)).I0000O();
                        }
                    }
                }

                public final boolean I0000oI00(Map map) {
/* 1 */             Io0oO1OiI io0oO1OiI = this.I0000Il00O;
/* 7 */             if (io0oO1OiI.I000II() == null) {
/* 28 */                I000II.I001IO000("Cannot submit parameters without an active repeating request!");
/* 31 */                return false;
                    }
/* 9 */             o01l1ioOo0 o01l1iooo0 = io0oO1OiI.I00io1l;
/* 13 */            Io0liil0lOi io0liil0lOi = new Io0liil0lOi();
/* 16 */            io0liil0lOi.I00000oIO = map;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            return o01l1iooo0.I0010I0i(io0liil0lOi);
                }

                public final void I0001Ioi1lo(LinkedHashMap linkedHashMap) {
/* 1 */             Io0oO1OiI io0oO1OiI = this.I0000Il00O;
                    synchronized (io0oO1OiI.I00ioIO) {
/* 6 */                 o01l1ioOo0 o01l1iooo0 = io0oO1OiI.I00io1l;
/* 10 */                Map map = io0oO1OiI.I00ll1;
/* 12 */                Io0lOIl1OOo1 io0lOIl1OOo1 = new Io0lOIl1OOo1();
/* 15 */                io0lOIl1OOo1.I00000oIO = map;
/* 17 */                io0lOIl1OOo1.I00000oOI = linkedHashMap;
/* 19 */                VarHandle.storeStoreFence();
/* 22 */                o01l1iooo0.I0010I0i(io0lOIl1OOo1);
                    }
                }

                public final String toString() {
/* 18 */            return "GraphProcessor(cameraGraph: " + this.I00000oIO + ')';
                }
            }
