            package p000;

            import android.util.Log;
            import android.view.Surface;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            
            public final class OolOOl0 {
                public OolOi0i I00000oIO;
                public IIloOiil I00000oOI;
                public Iol001OOI I0000Il00O;
                public Oilo101I11l0 I0000O;
                public Object I0000oI00;
                public IiIOIO1I I0001Ioi1lo;
                public LinkedHashMap I000II;
                public LinkedHashMap I000O01llI0;
                public IOi10loi I000OOo1O;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object I00000oIO(OolOOl0 oolOOl0, IOoilo iOoilo) throws Throwable {
                    OolOOIo1I oolOOIo1I;
/* 3 */             if (iOoilo instanceof OolOOIo1I) {
/* 6 */                 oolOOIo1I = (OolOOIo1I) iOoilo;
/* 8 */                 int i = oolOOIo1I.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oolOOIo1I.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oolOOIo1I = new OolOOIo1I(oolOOl0, iOoilo);
                        }
                    }
/* 25 */            Object obj = oolOOIo1I.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oolOOIo1I.I00iiO;
                    try {
/* 32 */                if (i2 != 0) {
/* 34 */                    if (i2 == 1) {
/* 36 */                        lIoii1l01l0i.I00000oOI(obj);
/* 39 */                        return obj;
                            }
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 47 */                lIoii1l01l0i.I00000oOI(obj);
                        synchronized (oolOOl0.I0000oI00) {
/* 53 */                    IiIOIO1I iiIOIO1I = oolOOl0.I0001Ioi1lo;
/* 55 */                    if (iiIOIO1I == null || oolOOl0.I000OOo1O != null) {
/* 94 */                        return Boolean.FALSE;
                            }
/* 63 */                    oolOOIo1I.I00iiO = 1;
/* 65 */                    Object objI0010o = iiIOIO1I.I0010o(oolOOIo1I);
                            return objI0010o == ii0111o ? ii0111o : objI0010o;
                        }
                    } catch (CancellationException unused) {
/* 80 */                if (l11I11lO.I0000O(5, "CXCP")) {
/* 86 */                    Log.w("CXCP", "Surface setup was cancelled");
                        }
/* 89 */                return Boolean.FALSE;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(List list, long j, IOoilo iOoilo) throws Throwable {
                    OolOOiooi oolOOiooi;
/* 3 */             if (iOoilo instanceof OolOOiooi) {
/* 6 */                 oolOOiooi = (OolOOiooi) iOoilo;
/* 8 */                 int i = oolOOiooi.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oolOOiooi.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oolOOiooi = new OolOOiooi(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000Il00O = oolOOiooi.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oolOOiooi.I00iiO;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 33 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 54 */                O1iOlO o1iOlO = new O1iOlO(list, iOoil1iiIilo, 16);
/* 57 */                oolOOiooi.I00iiO = 1;
/* 59 */                objI0000Il00O = lOlo0o.I0000Il00O(j, o1iOlO, oolOOiooi);
/* 63 */                if (objI0000Il00O == ii0111o) {
/* 65 */                    return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
                    }
/* 66 */            List list2 = (List) objI0000Il00O;
                    return list2 == null ? Il01100l.I00iOIl : list2;
                }

                public final void I0000Il00O(Surface surface) {
                    IiIO1ol1i1o0 iiIO1ol1i1o0;
                    synchronized (this.I0000oI00) {
                        try {
/* 6 */                     LinkedHashMap linkedHashMap = this.I000O01llI0;
/* 8 */                     if (linkedHashMap != null && (iiIO1ol1i1o0 = (IiIO1ol1i1o0) linkedHashMap.get(surface)) != null && !this.I000II.containsKey(surface)) {
/* 33 */                        if (l11I11lO.I0000O(3, "CXCP")) {
/* 35 */                            iiIO1ol1i1o0.toString();
                                }
/* 43 */                        this.I000II.put(surface, iiIO1ol1i1o0);
                                try {
/* 46 */                            iiIO1ol1i1o0.I0000O();
                                } catch (IiIO1IliI1Ol e) {
/* 58 */                            if (l11I11lO.I0000O(5, "CXCP")) {
/* 79 */                                Log.w("CXCP", "Error when " + surface + " going to increase the use count.", e);
                                    }
/* 86 */                            this.I0000O.I00000oIO(e.I00iOIl);
                                }
                            }
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }

                public final void I0000O() {
                    Set setKeySet;
/* 3 */             IIoI1li1o1l iIoI1li1o1lI00000oIO = this.I00000oOI.I00000oIO();
                    synchronized (iIoI1li1o1lI00000oIO.I00000oIO) {
                        try {
/* 12 */                    iIoI1li1o1lI00000oIO.I0000Il00O.add(this);
/* 15 */                    LinkedHashMap linkedHashMap = iIoI1li1o1lI00000oIO.I00000oOI;
/* 19 */                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 34 */                    for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 52 */                        if (((Number) entry.getValue()).intValue() > 0) {
/* 62 */                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                            }
/* 68 */                    setKeySet = linkedHashMap2.keySet();
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
/* 75 */            Iterator it = setKeySet.iterator();
/* 83 */            while (it.hasNext()) {
/* 91 */                I0000Il00O((Surface) it.next());
                    }
                }

                public final void I0000oI00() {
                    synchronized (this.I0000oI00) {
                        try {
/* 10 */                    if (this.I000II.isEmpty() && this.I000O01llI0 == null) {
/* 19 */                        l11I11lO.I0000O(3, "CXCP");
/* 24 */                        IIoI1li1o1l iIoI1li1o1lI00000oIO = this.I00000oOI.I00000oIO();
                                synchronized (iIoI1li1o1lI00000oIO.I00000oIO) {
/* 33 */                            iIoI1li1o1lI00000oIO.I0000Il00O.remove(this);
                                }
/* 37 */                        IOi10loi iOi10loi = this.I000OOo1O;
/* 39 */                        if (iOi10loi != null) {
/* 43 */                            iOi10loi.I00O10llo(OoiIlOl1iI.I00000oIO);
                                }
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }
            }
