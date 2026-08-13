            package p000;

            import android.hardware.camera2.CaptureResult;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public final class IIll1i implements IIlOIo0OlliO, AutoCloseable {
                public OI1I11lO1i I00iOIl;
                public Io0oi0 I00iiI;
                public IOol1Ol I00iiO;
                public IIll10 I00iio;
                public IIll1I0 I00ilI0I1;
                public int I00ilO0;

                public static Object I0000Il00O(IIll1i iIll1i, List list, List list2, List list3, O11ooiIoo0l o11ooiIoo0l, O11ooiIoo0l o11ooiIoo0l2, O11ooiIoo0l o11ooiIoo0l3, I0OIi10lO0iO i0OIi10lO0iO, I1loII i1loII, long j, long j2, IOoilo iOoilo, int i) {
/* 12 */            List list4 = (i & 8) != 0 ? null : list;
/* 20 */            List list5 = (i & 16) != 0 ? null : list2;
/* 28 */            List list6 = (i & 32) != 0 ? null : list3;
/* 36 */            I0OIi10lO0iO i0OIi10lO0iO2 = (i & Barcode.FORMAT_UPC_A) != 0 ? null : i0OIi10lO0iO;
/* 44 */            I1loII i1loII2 = (i & Barcode.FORMAT_UPC_E) != 0 ? null : i1loII;
/* 52 */            if (!iIll1i.I00iOIl.I00000oIO()) {
/* 80 */                return iIll1i.I00iiO.I00000oIO(list4, list5, list6, o11ooiIoo0l, o11ooiIoo0l2, o11ooiIoo0l3, i0OIi10lO0iO2, i1loII2, 60, new Long(j), new Long(j2), iOoilo);
                    }
/* 89 */            IOOlIIilOl0.I0001Ioi1lo(iIll1i, "Cannot call lock3A on ", " after close.");
/* 7 */             return null;
                }

                public static IOi10loi I000II(IIll1i iIll1i, boolean z, boolean z2, long j) {
/* 7 */             if (iIll1i.I00iOIl.I00000oIO()) {
/* 132 */               IOOlIIilOl0.I0001Ioi1lo(iIll1i, "Cannot call lock3AForCapture on ", " after close.");
/* 135 */               return null;
                    }
/* 9 */             IOol1Ol iOol1Ol = iIll1i.I00iiO;
/* 11 */            iOol1Ol.getClass();
/* 14 */            Map map = IOol1Ol.I00100o1O0lo;
/* 20 */            Map map2 = z ? map : IOol1Ol.I00100l0;
/* 24 */            IOoiolOI iOoiolOI = new IOoiolOI();
/* 27 */            iOoiolOI.I00iOIl = z2;
/* 29 */            iOoiolOI.I00iiI = z;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            O10ol1o1O o10ol1o1O = iOol1Ol.I0000O;
/* 36 */            IOi10loi iOi10loi = IOol1Ol.I0010I0i;
/* 38 */            Io0oi0 io0oi0 = iOol1Ol.I00000oIO;
/* 46 */            if (io0oi0.I0000Il00O.I000II() == null) {
/* 48 */                return iOi10loi;
                    }
/* 49 */            if (map2 != null) {
/* 52 */                map = map2;
                    }
/* 57 */            Iterator it = map.entrySet().iterator();
/* 65 */            while (it.hasNext()) {
/* 82 */                O0000Ioio00.I0000O(((Map.Entry) it.next()).getValue(), 1);
                    }
/* 98 */            Oi10iO1 oi10iO1 = new Oi10iO1(iOoiolOI, 60, Long.valueOf(j));
/* 101 */           o10ol1o1O.I0000oI00(oi10iO1);
/* 108 */           if (io0oi0.I0000oI00(map)) {
/* 122 */               io0oi0.I0001Ioi1lo(iOol1Ol.I0000Il00O.I00000oIO());
/* 125 */               return oi10iO1.I00iio;
                    }
/* 112 */           o10ol1o1O.I00iOIl.remove(oi10iO1);
/* 115 */           return iOi10loi;
                }

                public static IOi10loi I001i1lo1io(IIll1i iIll1i, long j, int i) {
                    Boolean bool;
                    Map map;
                    Oi10iO1 oi10iO1;
/* 3 */             Boolean bool2 = Boolean.TRUE;
/* 12 */            Boolean bool3 = (i & 1) != 0 ? null : bool2;
/* 19 */            Boolean bool4 = (i & 4) != 0 ? null : bool2;
/* 30 */            long j2 = (i & 32) != 0 ? 3000000000L : j;
/* 38 */            if (iIll1i.I00iOIl.I00000oIO()) {
/* 276 */               IOOlIIilOl0.I0001Ioi1lo(iIll1i, "Cannot call unlock3A on ", " after close.");
/* 7 */                 return null;
                    }
/* 40 */            IOol1Ol iOol1Ol = iIll1i.I00iiO;
/* 44 */            Long l = new Long(j2);
/* 47 */            IOi10loi iOi10loi = IOol1Ol.I0010I0i;
/* 49 */            Io0oi0 io0oi0 = iOol1Ol.I00000oIO;
/* 51 */            Io1010ilO io1010ilO = iOol1Ol.I0000Il00O;
/* 53 */            IIlo0OOlI iIlo0OOlI = IIlo0i0ll.I000OiO;
/* 55 */            IIlo0i0ll iIlo0i0ll = iOol1Ol.I00000oOI;
/* 57 */            iIlo0OOlI.getClass();
/* 68 */            Boolean bool5 = !IIlo0OOlI.I00000oIO(iIlo0i0ll) ? null : bool2;
/* 73 */            if (!O0000Ioio00.I0000O(bool3, bool2) && !O0000Ioio00.I0000O(bool5, bool2) && !O0000Ioio00.I0000O(bool4, bool2)) {
/* 93 */                return iiiO1IOliI0.I00000oIO(new Oi10OoO0l(0, null));
                    }
/* 104 */           if (io0oi0.I0000Il00O.I000II() != null) {
/* 111 */               if (!O0000Ioio00.I0000O(bool5, bool2)) {
/* 142 */                   bool = bool5;
                        } else if (io0oi0.I0000oI00(IOol1Ol.I000oI1ioi)) {
/* 128 */                   bool = bool5;
/* 138 */                   Io1010ilO.I00000oOI(io1010ilO, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767);
                        }
/* 143 */               boolean zI0000O = O0000Ioio00.I0000O(bool3, bool2);
/* 147 */               boolean zI0000O2 = O0000Ioio00.I0000O(bool, bool2);
/* 151 */               boolean zI0000O3 = O0000Ioio00.I0000O(bool4, bool2);
/* 155 */               if (zI0000O || zI0000O2 || zI0000O3) {
/* 166 */                   LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 169 */                   if (zI0000O) {
/* 175 */                       linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, IOol1Ol.I0010o);
                            }
/* 178 */                   if (zI0000O2) {
/* 184 */                       linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, IOol1Ol.I00111O);
                            }
/* 187 */                   if (zI0000O3) {
/* 193 */                       linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, IOol1Ol.I001IIilI0O);
                            }
/* 196 */                   map = linkedHashMap;
                        } else {
/* 161 */                   map = Il011I1OiO0I.I00iOIl;
                        }
/* 209 */               Oi10iO1 oi10iO12 = new Oi10iO1(lIoiOI1I1.I00000oIO(map), 60, l);
/* 214 */               iOol1Ol.I0000O.I0000oI00(oi10iO12);
/* 228 */               Boolean bool6 = O0000Ioio00.I0000O(bool3, bool2) ? Boolean.FALSE : null;
/* 236 */               Boolean bool7 = O0000Ioio00.I0000O(bool4, bool2) ? Boolean.FALSE : null;
/* 240 */               if (bool6 == null && bool7 == null) {
/* 245 */                   oi10iO1 = oi10iO12;
                        } else {
/* 251 */                   oi10iO1 = oi10iO12;
/* 259 */                   Io1010ilO.I00000oOI(io1010ilO, null, null, null, null, null, null, null, bool6, null, bool7, 383);
                        }
/* 266 */               io0oi0.I0001Ioi1lo(io1010ilO.I00000oIO());
/* 269 */               return oi10iO1.I00iio;
                    }
/* 121 */           return iOi10loi;
                }

                public final IOi10loi I000O01llI0() {
/* 7 */             I0OIi10lO0iO i0OIi10lO0iOI00000oIO = null;
/* 8 */             if (this.I00iOIl.I00000oIO()) {
/* 68 */                IOOlIIilOl0.I0001Ioi1lo(this, "Cannot call setTorchOn on ", " after close.");
/* 7 */                 return null;
                    }
/* 10 */            IOol1Ol iOol1Ol = this.I00iiO;
/* 20 */            I0OIi10lO0iO i0OIi10lO0iO = ((OlO011Oo) iOol1Ol.I0000Il00O.I00000oIO.I00000oIO).I00000oIO;
/* 22 */            List list = I0OIi10lO0iO.I00000oOI;
/* 25 */            if ((i0OIi10lO0iO == null || i0OIi10lO0iO.I00000oIO != 1) && (i0OIi10lO0iO == null || i0OIi10lO0iO.I00000oIO != 0)) {
/* 42 */                i0OIi10lO0iOI00000oIO = I0OIi10lO0iO.I00000oIO(1);
                    }
/* 59 */            return IOol1Ol.I00000oOI(iOol1Ol, i0OIi10lO0iOI00000oIO, null, null, IlOI0loiiI.I00000oIO(2), null, null, null, 118);
                }

                public final void I000l1() {
/* 7 */             if (this.I00iOIl.I00000oIO()) {
/* 20 */                IOOlIIilOl0.I0001Ioi1lo(this, "Cannot call stopRepeating on ", " after close.");
                    } else {
/* 12 */                this.I00iiI.I0000O(null);
                    }
                }

                public final void I00100l0(ArrayList arrayList) {
                    Object next;
/* 7 */             if (this.I00iOIl.I00000oIO()) {
/* 135 */               IOOlIIilOl0.I0001Ioi1lo(this, "Cannot call submit on ", " after close.");
/* 168 */               return;
                    }
/* 13 */            if (arrayList.isEmpty()) {
/* 127 */               I000II.I001IO000("Cannot call submit with an empty list of Requests!");
/* 130 */               return;
                    }
/* 15 */            Io0oi0 io0oi0 = this.I00iiI;
/* 17 */            io0oi0.getClass();
/* 20 */            Iterator it = arrayList.iterator();
                    while (true) {
/* 28 */                if (!it.hasNext()) {
/* 42 */                    next = null;
                            break;
                        } else {
/* 30 */                    next = it.next();
/* 39 */                    if (((Oi01iIoI) next).I0001Ioi1lo != null) {
                                break;
                            }
                        }
                    }
/* 43 */            Oi01iIoI oi01iIoI = (Oi01iIoI) next;
/* 45 */            if (oi01iIoI == null || io0oi0.I00000oOI.I0000O != null) {
/* 101 */               Io0oO1OiI io0oO1OiI = io0oi0.I0000Il00O;
/* 103 */               o01l1ioOo0 o01l1iooo0 = io0oO1OiI.I00io1l;
/* 107 */               Io0l0i io0l0i = new Io0l0i();
/* 110 */               io0l0i.I00000oIO = arrayList;
/* 112 */               VarHandle.storeStoreFence();
/* 119 */               if (o01l1iooo0.I0010I0i(io0l0i)) {
/* 124 */                   return;
                        }
/* 121 */               io0oO1OiI.I00000oIO(arrayList);
/* 124 */               return;
                    }
/* 58 */            StringBuilder sb = new StringBuilder("Cannot submit ");
/* 61 */            sb.append(oi01iIoI);
/* 64 */            Ioloo0I1O0l0 ioloo0I1O0l0 = oi01iIoI.I0001Ioi1lo;
/* 68 */            sb.append(" with input request ");
/* 71 */            sb.append(ioloo0I1O0l0);
/* 76 */            sb.append(" to ");
/* 79 */            sb.append(io0oi0);
/* 84 */            sb.append(" because CameraGraph was not configured to support reprocessing");
/* 100 */           throw new IllegalStateException(sb.toString().toString());
                }

                public final IOi10loi I001l0I00(boolean z) {
/* 8 */             if (this.I00iOIl.I00000oIO()) {
/* 77 */                IOOlIIilOl0.I0001Ioi1lo(this, "Cannot call unlock3APostCapture on ", " after close.");
/* 7 */                 return null;
                    }
/* 10 */            IOol1Ol iOol1Ol = this.I00iiO;
/* 12 */            IOi10loi iOi10loi = IOol1Ol.I0010I0i;
/* 14 */            Io0oi0 io0oi0 = iOol1Ol.I00000oIO;
/* 22 */            if (io0oi0.I0000Il00O.I000II() != null) {
/* 36 */                if (io0oi0.I0000oI00(z ? IOol1Ol.I001i1O0Ol : IOol1Ol.I001IO000)) {
/* 53 */                    Oi10iO1 oi10iO1 = z ? new Oi10iO1(IOol1Ol.I001i1lo1io, null, null) : new Oi10iO1(Il011I1OiO0I.I00iOIl);
/* 58 */                    iOol1Ol.I0000O.I0000oI00(oi10iO1);
/* 67 */                    io0oi0.I0001Ioi1lo(iOol1Ol.I0000Il00O.I00000oIO());
/* 70 */                    return oi10iO1.I00iio;
                        }
                    }
/* 38 */            return iOi10loi;
                }

                @Override
                public final void close() {
                    synchronized (this.I00iio.I00000oIO) {
                    }
                    synchronized (this.I00ilI0I1.I00000oIO) {
                    }
/* 15 */            this.I00iOIl.I00000oOI();
                }

                public final String toString() {
/* 13 */            return "CameraGraph.Session-" + this.I00ilO0;
                }
            }
