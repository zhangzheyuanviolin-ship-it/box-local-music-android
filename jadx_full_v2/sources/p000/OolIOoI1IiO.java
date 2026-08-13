            package p000;

            import android.hardware.camera2.CaptureRequest;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            
            public final class OolIOoI1IiO {
                public OolO1O I00000oIO;
                public OloOIoiI1 I00000oOI;
                public Object I0000Il00O;
                public IOi10loi I0000O;
                public I1OollilIo I0000oI00;
                public I1Il0loi I0001Ioi1lo;
                public boolean I000II;
                public LinkedHashMap I000O01llI0;
                public LinkedHashMap I000OOo1O;
                public LinkedHashSet I000OiO;
                public LinkedHashSet I000iOII;
                public Oi0OO1IIl1 I000l1;
                public I0OIi10lO0iO I000lI;
                public I0i10OI0o I000o00OoI0I;
                public I1lilIOI0Il I000oI1ioi;
                public OolII1l1oii I00100l0;
                public I1OollilIo I00100o1O0lo;

                /* JADX WARN: Removed duplicated region for block: B:74:0x013d  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoilo iOoilo) {
                    OolIIOO oolIIOO;
                    OOo0ooi oOo0ooi;
                    OOo0ooi oOo0ooi2;
                    IOi10loi iOi10loi;
                    AutoCloseable autoCloseable;
                    Oi01iIoI oi01iIoI;
                    IOi10loi iOi10loi2;
                    int iIncrementAndGet;
/* 3 */             if (iOoilo instanceof OolIIOO) {
/* 6 */                 oolIIOO = (OolIIOO) iOoilo;
/* 8 */                 int i = oolIIOO.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oolIIOO.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oolIIOO = new OolIIOO(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = oolIIOO.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oolIIOO.I00iio;
/* 35 */            if (i2 == 0) {
/* 52 */                lIoii1l01l0i.I00000oOI(obj);
/* 57 */                OOo0ooi oOo0ooi3 = new OOo0ooi();
                        try {
/* 62 */                    IIll0oO iIll0oOI00000oIO = this.I00000oIO.I00000oIO();
/* 66 */                    oolIIOO.I00iOIl = oOo0ooi3;
/* 68 */                    oolIIOO.I00iio = 1;
/* 70 */                    Object objI0000Il00O = iIll0oOI00000oIO.I0000Il00O(oolIIOO);
/* 74 */                    if (objI0000Il00O == ii0111o) {
/* 76 */                        return ii0111o;
                            }
/* 77 */                    oOo0ooi2 = oOo0ooi3;
/* 78 */                    obj = objI0000Il00O;
/* 79 */                    autoCloseable = (AutoCloseable) obj;
/* 82 */                    IIll1i iIll1i = (IIll1i) autoCloseable;
                            synchronized (this.I0000Il00O) {
                            }
                        } catch (CancellationException unused) {
/* 285 */                   oOo0ooi = oOo0ooi3;
/* 288 */                   l11I11lO.I0000O(3, "CXCP");
                            synchronized (this.I0000Il00O) {
                            }
                        }
                    } else {
/* 37 */                if (i2 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 34 */                    return null;
                        }
/* 39 */                oOo0ooi = oolIIOO.I00iOIl;
                        try {
/* 41 */                    lIoii1l01l0i.I00000oOI(obj);
/* 44 */                    oOo0ooi2 = oOo0ooi;
                            try {
/* 79 */                        autoCloseable = (AutoCloseable) obj;
                                try {
/* 82 */                            IIll1i iIll1i2 = (IIll1i) autoCloseable;
                                    synchronized (this.I0000Il00O) {
/* 93 */                                if (this.I000OiO.isEmpty()) {
/* 95 */                                    oi01iIoI = null;
                                        } else {
/* 97 */                                    Oi0OO1IIl1 oi0OO1IIl1 = this.I000l1;
/* 101 */                                   List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(this.I000OiO);
/* 119 */                                   LinkedHashMap linkedHashMapI0001Ioi1lo = O1Oii0O0loo.I0001Ioi1lo(this.I00000oOI.I00000oIO(this.I000l1), O1Oii0O0loo.I000iOII(this.I000O01llI0));
/* 127 */                                   LinkedHashMap linkedHashMap = new LinkedHashMap(this.I000OOo1O);
/* 130 */                                   O1lOllO o1lOllO = Olo10o10.I00000oOI;
/* 132 */                                   I1OollilIo i1OollilIo = this.I0000oI00;
/* 134 */                                   i1OollilIo.getClass();
/* 148 */                                   linkedHashMap.put(o1lOllO, new Integer(I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo)));
/* 155 */                                   ArrayList arrayList = new ArrayList(this.I000iOII);
/* 160 */                                   arrayList.add(this.I00100l0);
/* 167 */                                   oi01iIoI = new Oi01iIoI(listI00iIi0i1o, linkedHashMapI0001Ioi1lo, linkedHashMap, arrayList, oi0OO1IIl1, 32);
                                        }
/* 170 */                               iOi10loi2 = this.I0000O;
/* 172 */                               this.I000II = false;
/* 174 */                               this.I0000O = null;
                                    }
/* 177 */                           if (oi01iIoI == null) {
/* 179 */                               iIll1i2.I000l1();
/* 182 */                               oOo0ooi2.I00iOIl = iOi10loi2;
                                    } else {
/* 188 */                               if (iOi10loi2 != null) {
                                            synchronized (this.I0000Il00O) {
/* 193 */                                       I1Il0loi i1Il0loi = this.I0001Ioi1lo;
/* 199 */                                       int i3 = this.I0000oI00.I00000oIO;
/* 201 */                                       OolIIIlOOo oolIIIlOOo = new OolIIIlOOo();
/* 204 */                                       oolIIIlOOo.I00000oIO = i3;
/* 206 */                                       oolIIIlOOo.I00000oOI = iOi10loi2;
/* 208 */                                       VarHandle.storeStoreFence();
/* 211 */                                       i1Il0loi.addLast(oolIIIlOOo);
/* 214 */                                       I1OollilIo i1OollilIo2 = this.I00100o1O0lo;
/* 216 */                                       i1OollilIo2.getClass();
/* 221 */                                       iIncrementAndGet = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo2);
                                            }
/* 226 */                                   iOi100.I00000oIO(iIncrementAndGet);
                                        }
/* 239 */                               if (l11I11lO.I0000O(3, "CXCP")) {
/* 241 */                                   Objects.toString(oi01iIoI);
                                        }
/* 250 */                               if (iIll1i2.I00iOIl.I00000oIO()) {
/* 262 */                                   IOOlIIilOl0.I0001Ioi1lo(iIll1i2, "Cannot call startRepeating on ", " after close.");
                                        } else {
/* 254 */                                   iIll1i2.I00iiI.I0000O(oi01iIoI);
                                        }
/* 267 */                               I00000oOI(iIll1i2, oi01iIoI.I00000oOI);
                                    }
/* 270 */                           iOOl00.I00000oIO(autoCloseable, null);
                                } finally {
                                }
                            } catch (CancellationException unused2) {
/* 274 */                       oOo0ooi = oOo0ooi2;
/* 288 */                       l11I11lO.I0000O(3, "CXCP");
                                synchronized (this.I0000Il00O) {
/* 296 */                           if (this.I000II) {
/* 298 */                               this.I000II = false;
/* 302 */                               oOo0ooi.I00iOIl = this.I0000O;
/* 304 */                               this.I0000O = null;
                                    }
                                }
/* 311 */                       oOo0ooi2 = oOo0ooi;
/* 314 */                       iOi10loi = (IOi10loi) oOo0ooi2.I00iOIl;
/* 316 */                       if (iOi10loi != null) {
                                }
/* 323 */                       return OoiIlOl1iI.I00000oIO;
                            }
                        } catch (CancellationException unused3) {
/* 288 */                   l11I11lO.I0000O(3, "CXCP");
                            synchronized (this.I0000Il00O) {
                            }
                        }
                    }
/* 314 */           iOi10loi = (IOi10loi) oOo0ooi2.I00iOIl;
/* 316 */           if (iOi10loi != null) {
/* 320 */               iOi10loi.I00O10llo(OoiIlOl1iI.I00000oIO);
                    }
/* 323 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I00000oOI(IIll1i iIll1i, Map map) {
                    I0OIi10lO0iO i0OIi10lO0iOI00000oIO;
                    I0i10OI0o i0i10OI0o;
                    Object next;
/* 3 */             I1lilIOI0Il i1lilIOI0Il = null;
/* 11 */            Object obj = map != null ? map.get(CaptureRequest.CONTROL_AE_MODE) : null;
/* 19 */            Integer num = obj instanceof Integer ? (Integer) obj : null;
/* 20 */            if (num != null) {
/* 22 */                int iIntValue = num.intValue();
/* 26 */                List list = I0OIi10lO0iO.I00000oOI;
/* 28 */                i0OIi10lO0iOI00000oIO = iOIOlooOl.I00000oIO(iIntValue);
                    } else {
/* 34 */                i0OIi10lO0iOI00000oIO = null;
                    }
/* 44 */            Object obj2 = map != null ? map.get(CaptureRequest.CONTROL_AF_MODE) : null;
/* 52 */            Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
/* 53 */            if (num2 != null) {
/* 55 */                int iIntValue2 = num2.intValue();
/* 63 */                Iterator it = I0i10OI0o.I00000oOI.iterator();
                        while (true) {
/* 71 */                    if (!it.hasNext()) {
/* 85 */                        next = null;
                                break;
                            } else {
/* 73 */                        next = it.next();
/* 82 */                        if (((I0i10OI0o) next).I00000oIO == iIntValue2) {
                                    break;
                                }
                            }
                        }
/* 86 */                i0i10OI0o = (I0i10OI0o) next;
                    } else {
/* 89 */                i0i10OI0o = null;
                    }
/* 99 */            Object obj3 = map != null ? map.get(CaptureRequest.CONTROL_AWB_MODE) : null;
/* 107 */           Integer num3 = obj3 instanceof Integer ? (Integer) obj3 : null;
/* 108 */           if (num3 != null) {
/* 110 */               int iIntValue3 = num3.intValue();
/* 118 */               Iterator it2 = I1lilIOI0Il.I00000oOI.iterator();
                        while (true) {
/* 126 */                   if (!it2.hasNext()) {
                                break;
                            }
/* 128 */                   Object next2 = it2.next();
/* 137 */                   if (((I1lilIOI0Il) next2).I00000oIO == iIntValue3) {
/* 139 */                       i1lilIOI0Il = next2;
                                break;
                            }
                        }
/* 140 */               i1lilIOI0Il = i1lilIOI0Il;
                    }
/* 142 */           I1lilIOI0Il i1lilIOI0Il2 = i1lilIOI0Il;
/* 143 */           boolean z = false;
/* 157 */           boolean z2 = (i0OIi10lO0iOI00000oIO == null || i0OIi10lO0iOI00000oIO.equals(this.I000lI)) ? false : true;
/* 170 */           boolean z3 = (i0i10OI0o == null || i0i10OI0o.equals(this.I000o00OoI0I)) ? false : true;
/* 171 */           if (i1lilIOI0Il2 != null && !i1lilIOI0Il2.equals(this.I000oI1ioi)) {
/* 181 */               z = true;
                    }
/* 182 */           if (z2 || z3 || z) {
/* 195 */               if (l11I11lO.I0000O(3, "CXCP")) {
/* 197 */                   Objects.toString(i0OIi10lO0iOI00000oIO);
/* 200 */                   Objects.toString(i0i10OI0o);
/* 203 */                   Objects.toString(i1lilIOI0Il2);
                        }
/* 212 */               IIlOIo0OlliO.I00000oIO(iIll1i, i0OIi10lO0iOI00000oIO, i0i10OI0o, i1lilIOI0Il2, null, null, null, 56);
/* 215 */               if (i0OIi10lO0iOI00000oIO != null) {
/* 217 */                   this.I000lI = i0OIi10lO0iOI00000oIO;
                        }
/* 219 */               if (i0i10OI0o != null) {
/* 221 */                   this.I000o00OoI0I = i0i10OI0o;
                        }
/* 223 */               if (i1lilIOI0Il2 != null) {
/* 225 */                   this.I000oI1ioi = i1lilIOI0Il2;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(LinkedHashMap linkedHashMap, Map map, Set set, Oi0OO1IIl1 oi0OO1IIl1, Set set2, IOoilo iOoilo) throws Throwable {
                    OolIO1lIliIi oolIO1lIliIi;
                    OOo0ooi oOo0ooi;
/* 3 */             if (iOoilo instanceof OolIO1lIliIi) {
/* 6 */                 oolIO1lIliIi = (OolIO1lIliIi) iOoilo;
/* 8 */                 int i = oolIO1lIliIi.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oolIO1lIliIi.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oolIO1lIliIi = new OolIO1lIliIi(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = oolIO1lIliIi.I00iiI;
/* 27 */            Object obj2 = Ii0111o.I00iOIl;
/* 29 */            int i2 = oolIO1lIliIi.I00iio;
/* 32 */            if (i2 == 0) {
/* 50 */                lIoii1l01l0i.I00000oOI(obj);
/* 55 */                OOo0ooi oOo0ooi2 = new OOo0ooi();
                        synchronized (this.I0000Il00O) {
                            try {
/* 68 */                        if (l11I11lO.I0000O(3, "CXCP")) {
/* 70 */                            Objects.toString(linkedHashMap);
/* 73 */                            Objects.toString(map);
/* 76 */                            Objects.toString(set);
/* 79 */                            Objects.toString(oi0OO1IIl1);
                                }
/* 85 */                        if (linkedHashMap != null) {
/* 89 */                            this.I000O01llI0.clear();
/* 94 */                            this.I000O01llI0.putAll(linkedHashMap);
                                }
/* 97 */                        if (map != null) {
/* 101 */                           this.I000OOo1O.clear();
/* 106 */                           this.I000OOo1O.putAll(map);
                                }
/* 109 */                       if (set != null) {
/* 113 */                           this.I000OiO.clear();
/* 120 */                           this.I000OiO.addAll(set);
                                }
/* 123 */                       if (oi0OO1IIl1 != null) {
/* 125 */                           this.I000l1 = oi0OO1IIl1;
                                }
/* 127 */                       if (set2 != null) {
/* 131 */                           this.I000iOII.clear();
/* 138 */                           this.I000iOII.addAll(set2);
                                }
/* 141 */                       IOi10loi iOi10loi = this.I0000O;
/* 143 */                       if (iOi10loi == null) {
/* 147 */                           iOi10loi = new IOi10loi();
/* 150 */                           this.I0000O = iOi10loi;
                                }
/* 154 */                       if (this.I000II) {
/* 157 */                           return iOi10loi;
                                }
/* 158 */                       this.I000II = true;
/* 160 */                       oOo0ooi2.I00iOIl = iOi10loi;
/* 163 */                       oolIO1lIliIi.I00iOIl = oOo0ooi2;
/* 165 */                       oolIO1lIliIi.I00iio = 1;
/* 171 */                       if (I00000oIO(oolIO1lIliIi) == obj2) {
/* 173 */                           return obj2;
                                }
/* 174 */                       oOo0ooi = oOo0ooi2;
                            } catch (Throwable th) {
/* 685 */                       throw th;
                            }
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 45 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 48 */                    return null;
                        }
/* 36 */                oOo0ooi = oolIO1lIliIi.I00iOIl;
/* 38 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 175 */           return oOo0ooi.I00iOIl;
                }
            }
