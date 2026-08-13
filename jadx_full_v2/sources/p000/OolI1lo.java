            package p000;

            import android.hardware.camera2.CaptureRequest;
            import android.util.ArrayMap;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public final class OolI1lo implements Ool1lo {
                public static final IOi10loi I000l1 = iiiO1IOliI0.I00000oIO(new Oi10OoO0l(4, null));
                public static final IOi10loi I000lI;
                public OOiO01IO I00000oIO;
                public OOiO01IO I00000oOI;
                public OolO1O I0000Il00O;
                public OOiO01IO I0000O;
                public OolOi0i I0000oI00;
                public IIoO11o I0001Ioi1lo;
                public volatile boolean I000II;
                public OllO00oiil I000O01llI0;
                public OllO00oiil I000OOo1O;
                public OllO00oiil I000OiO;
                public LinkedHashMap I000iOII;

                static {
/* 16 */            IOi10loi iOi10loi = new IOi10loi();
/* 19 */            iOi10loi.I000II(null);
/* 22 */            I000lI = iOi10loi;
                }

                public static ArrayList I000o00OoI0I(int i, String str) {
/* 3 */             ArrayList arrayList = new ArrayList(i);
/* 7 */             for (int i2 = 0; i2 < i; i2++) {
/* 11 */                IOi10loi iOi10loi = new IOi10loi();
/* 21 */                iOi10loi.I00iIO(new Ioi1lIO(str, null, 2));
/* 24 */                arrayList.add(iOi10loi);
                    }
/* 37 */            return arrayList;
                }

                public static Ool1o1l I000oI1ioi(LinkedHashMap linkedHashMap) {
/* 10 */            Ool1o1l ool1o1l = new Ool1o1l((IIl0lo1oi) null, (LinkedHashMap) null, Oi0OO1IIl1.I00000oIO(1), 7);
/* 13 */            Il0li01oOil il0li01oOil = Ool1iI0OiI.I00ilI0I1;
/* 15 */            il0li01oOil.getClass();
/* 20 */            I01I0Iioooo0 i01I0Iioooo0 = new I01I0Iioooo0(il0li01oOil);
/* 27 */            while (i01I0Iioooo0.hasNext()) {
/* 39 */                Ool1o1l ool1o1l2 = (Ool1o1l) linkedHashMap.get((Ool1iI0OiI) i01I0Iioooo0.next());
/* 41 */                if (ool1o1l2 != null) {
/* 49 */                    ool1o1l.I00000oIO.I0000O(ool1o1l2.I00000oIO.I00iiI);
/* 56 */                    ool1o1l.I00000oOI.putAll(ool1o1l2.I00000oOI);
/* 65 */                    ool1o1l.I0000Il00O.addAll(ool1o1l2.I0000Il00O);
/* 68 */                    Oi0OO1IIl1 oi0OO1IIl1 = ool1o1l2.I0000O;
/* 70 */                    if (oi0OO1IIl1 != null) {
/* 78 */                        ool1o1l.I0000O = Oi0OO1IIl1.I00000oIO(oi0OO1IIl1.I00000oIO);
                            }
                        }
                    }
/* 168 */           return ool1o1l;
                }

                @Override
                public final IiIOI1ol0o I00000oIO(List list, List list2, List list3, O11ooiIoo0l o11ooiIoo0l, I0OIi10lO0iO i0OIi10lO0iO, long j) {
/* 24 */            IOi10loi iOi10loiI00100l0 = !this.I000II ? I00100l0(new OolI1IIioII(this, list, list2, list3, o11ooiIoo0l, i0OIi10lO0iO, j, null)) : null;
                    return iOi10loiI00100l0 == null ? I000l1 : iOi10loiI00100l0;
                }

                @Override
                public final IiIOI1ol0o I00000oOI() {
/* 13 */            IOi10loi iOi10loiI00100l0 = this.I000II ? null : I00100l0(new IIl00I(this, null, 11));
                    return iOi10loiI00100l0 == null ? I000l1 : iOi10loiI00100l0;
                }

                @Override
                public final IiIOI1ol0o I0000Il00O(List list, List list2, List list3) {
/* 20 */            IOi10loi iOi10loiI00100l0 = !this.I000II ? I00100l0(new OolI1OOo1(this, list, list2, list3, null)) : null;
                    return iOi10loiI00100l0 == null ? I000l1 : iOi10loiI00100l0;
                }

                @Override
                public final Object I0000oI00(Oll0io oll0io) {
/* 7 */             OolOOl0 oolOOl0 = (OolOOl0) this.I000OOo1O.getValue();
/* 9 */             oolOOl0.getClass();
/* 12 */            return OolOOl0.I00000oIO(oolOOl0, oll0io);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final List I0001Ioi1lo(ArrayList arrayList, int i, int i2, int i3) {
                    ArrayList arrayList2;
/* 3 */             ArrayList arrayList3 = null;
/* 3 */             Object[] objArr = 0;
/* 4 */             if (this.I000II) {
/* 76 */                arrayList2 = arrayList;
                    } else {
/* 6 */                 int size = arrayList.size();
/* 14 */                arrayList2 = arrayList;
/* 18 */                Ool1oiIOI ool1oiIOI = new Ool1oiIOI(this, arrayList2, i, i2, i3, null);
/* 21 */                OolOi0i oolOi0i = this.I0000oI00;
/* 40 */                Ii01I10 ii01I10 = O0000Ioio00.I0000O(oolOi0i.I0000Il00O.get(), Boolean.TRUE) ? Ii01I10.I00iio : Ii01I10.I00iOIl;
/* 44 */                ArrayList arrayList4 = new ArrayList(size);
/* 48 */                for (int i4 = 0; i4 < size; i4++) {
/* 55 */                    arrayList4.add(new IOi10loi());
                        }
/* 71 */                iOi1II01i0.I0000O(oolOi0i.I0000oI00, null, ii01I10, new Ol110ii1I((Object) ool1oiIOI, (Object) arrayList4, (IOoil1iiIilo) (objArr == true ? 1 : 0), 12), 1);
/* 74 */                arrayList3 = arrayList4;
                    }
                    return arrayList3 == null ? I000o00OoI0I(arrayList2.size(), "Capture request is cancelled on closed CameraGraph") : arrayList3;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final IiIOI1ol0o I000II(IIl0oI iIl0oI, Map map) {
/* 15 */            IOi10loi iOi10loiI00100l0 = this.I000II ? null : I00100l0(new I0l1I01o10I1(this, iIl0oI, map, 0 == true ? 1 : 0, 4));
                    return iOi10loiI00100l0 == null ? I000lI : iOi10loiI00100l0;
                }

                @Override
                public final IiIOI1ol0o I000O01llI0(int i) {
/* 11 */            IOi10loi iOi10loiI00100l0 = this.I000II ? null : I00100l0(new OolI0iil(this, i, null));
                    return iOi10loiI00100l0 == null ? I000l1 : iOi10loiI00100l0;
                }

                @Override
                public final IiIOI1ol0o I000OOo1O(List list) {
/* 1 */             Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 13 */            IOi10loi iOi10loiI00100l0 = this.I000II ? null : I00100l0(new I0l11loiOIl(this, list, (IOoil1iiIilo) null));
                    return iOi10loiI00100l0 == null ? I000lI : iOi10loiI00100l0;
                }

                @Override
                public final IiIOI1ol0o I000OiO(LinkedHashSet linkedHashSet, boolean z) {
/* 11 */            IOi10loi iOi10loiI00100l0 = this.I000II ? null : I00100l0(new OolI1i(linkedHashSet, z, this, null));
                    return iOi10loiI00100l0 == null ? I000lI : iOi10loiI00100l0;
                }

                @Override
                public final IiIOI1ol0o I000iOII(Map map, Ool1iI0OiI ool1iI0OiI, IOlOo0 iOlOo0) {
/* 3 */             if (this.I000II) {
/* 5 */                 return I000lI;
                    }
/* 23 */            if (!O0000Ioio00.I0000O(this.I0000oI00.I0000Il00O.get(), Boolean.TRUE)) {
/* 59 */                IoOOl0iOl1io.I001lIiIIo1O("Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: ", Thread.currentThread().getName());
/* 22 */                return null;
                    }
/* 27 */            IIOlO1ii iIOlO1ii = this.I0000oI00.I0000oI00;
/* 29 */            Ii01I10 ii01I10 = Ii01I10.I00iOIl;
/* 44 */            return iOi1II01i0.I00000oOI(iIOlO1ii, null, new O1o1iI(this, ool1iI0OiI, map, iOlOo0, (IOoil1iiIilo) null, 22), 1);
                }

                @Override
                public final IiIOI1ol0o I000l1(Map map, IOlOo0 iOlOo0) {
/* 1 */             Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 13 */            IOi10loi iOi10loiI00100l0 = this.I000II ? null : I00100l0(new I0l1I01o10I1(this, map, iOlOo0, null));
                    return iOi10loiI00100l0 == null ? I000lI : iOi10loiI00100l0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final IiIOI1ol0o I000lI() {
/* 12 */            IOi10loi iOi10loiI00100l0 = this.I000II ? null : I00100l0(new I0l11loiOIl((Object) this, (IOoil1iiIilo) (0 == true ? 1 : 0), 5));
                    return iOi10loiI00100l0 == null ? I000l1 : iOi10loiI00100l0;
                }

                public final IOi10loi I00100l0(Function1 function1) {
/* 1 */             OolOi0i oolOi0i = this.I0000oI00;
/* 20 */            Ii01I10 ii01I10 = O0000Ioio00.I0000O(oolOi0i.I0000Il00O.get(), Boolean.TRUE) ? Ii01I10.I00iio : Ii01I10.I00iOIl;
/* 24 */            IOi10loi iOi10loi = new IOi10loi();
/* 38 */            iOi1II01i0.I0000O(oolOi0i.I0000oI00, null, ii01I10, new Ol110ii1I(function1, iOi10loi, (IOoil1iiIilo) null, 11), 1);
/* 77 */            return iOi10loi;
                }

                public final Object I00100o1O0lo(Ool1iI0OiI ool1iI0OiI, Map map, IOlOo0 iOlOo0, Oll0io oll0io) {
/* 1 */             LinkedHashMap linkedHashMap = this.I000iOII;
/* 10 */            if (l11I11lO.I0000O(3, "CXCP")) {
/* 12 */                Objects.toString(ool1iI0OiI);
/* 15 */                Objects.toString(map);
/* 18 */                Objects.toString(iOlOo0);
                    }
/* 21 */            Object ool1o1l = linkedHashMap.get(ool1iI0OiI);
/* 26 */            if (ool1o1l == null) {
/* 32 */                ool1o1l = new Ool1o1l((IIl0lo1oi) null, (LinkedHashMap) null, (Oi0OO1IIl1) null, 15);
/* 35 */                linkedHashMap.put(ool1iI0OiI, ool1o1l);
                    }
/* 38 */            Ool1o1l ool1o1l2 = (Ool1o1l) ool1o1l;
/* 43 */            IIl0lo1oi iIl0lo1oi = new IIl0lo1oi(0);
/* 50 */            iIl0lo1oi.I0000O(ool1o1l2.I00000oIO.I00iiI);
/* 65 */            for (Map.Entry entry : map.entrySet()) {
/* 77 */                CaptureRequest.Key key = (CaptureRequest.Key) entry.getKey();
/* 79 */                Object value = entry.getValue();
/* 89 */                iIl0lo1oi.I00iiI.I000lI(iOil1io0i00.I00000oIO(key), iOlOo0, value);
                    }
/* 115 */           linkedHashMap.put(ool1iI0OiI, new Ool1o1l(iIl0lo1oi, new LinkedHashMap(ool1o1l2.I00000oOI), IOOi0Ool1i.I00iiO(ool1o1l2.I0000Il00O), ool1o1l2.I0000O));
/* 122 */           return I0010I0i(I000oI1ioi(linkedHashMap), null, oll0io);
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0010I0i(Ool1o1l ool1o1l, LinkedHashSet linkedHashSet, IOoilo iOoilo) {
                    OolI1Oo00i oolI1Oo00i;
/* 3 */             if (iOoilo instanceof OolI1Oo00i) {
/* 6 */                 oolI1Oo00i = (OolI1Oo00i) iOoilo;
/* 8 */                 int i = oolI1Oo00i.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oolI1Oo00i.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 23 */                    oolI1Oo00i = new OolI1Oo00i(this, iOoilo);
                        }
                    }
/* 19 */            OolI1Oo00i oolI1Oo00i2 = oolI1Oo00i;
/* 27 */            Object objI0000Il00O = oolI1Oo00i2.I00iOIl;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = oolI1Oo00i2.I00iiO;
/* 33 */            IiIOI1ol0o iiIOI1ol0o = null;
/* 35 */            if (i2 == 0) {
/* 50 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 55 */                if (!this.I000II) {
/* 67 */                    if (this.I0001Ioi1lo.I00iOIl.I00000oOI(IIl0001IOo.I00000oIO, null) != null) {
/* 181 */                       OIiilo1Ool0o.I00000oIO();
/* 33 */                        return null;
                            }
/* 75 */                    IIooIO0II iIooIO0II = (IIooIO0II) this.I000O01llI0.getValue();
/* 79 */                    int i3 = ool1o1l.I0000O.I00000oIO;
/* 82 */                    if (i3 == -1) {
/* 85 */                        i3 = 1;
                            }
/* 86 */                    iIooIO0II.I00000oOI(i3);
/* 96 */                    OolIOoI1IiO oolIOoI1IiO = (OolIOoI1IiO) this.I000OiO.getValue();
/* 104 */                   LinkedHashMap linkedHashMapI00000oOI = iOil1io0i00.I00000oOI(ool1o1l.I00000oIO.I00000oIO());
/* 108 */                   O1lOllO o1lOllO = Olo10o10.I00000oIO;
/* 117 */                   OI10ooIio oI10ooIio = new OI10ooIio(new ArrayMap());
/* 134 */                   for (Map.Entry entry : ool1o1l.I00000oOI.entrySet()) {
/* 154 */                       oI10ooIio.I00000oIO.put((String) entry.getKey(), entry.getValue());
                            }
/* 158 */                   Map mapSingletonMap = Collections.singletonMap(o1lOllO, oI10ooIio);
/* 162 */                   Oi0OO1IIl1 oi0OO1IIl1 = ool1o1l.I0000O;
/* 164 */                   Set set = ool1o1l.I0000Il00O;
/* 166 */                   oolI1Oo00i2.I00iiO = 1;
/* 170 */                   objI0000Il00O = oolIOoI1IiO.I0000Il00O(linkedHashMapI00000oOI, mapSingletonMap, linkedHashSet, oi0OO1IIl1, set, oolI1Oo00i2);
/* 174 */                   if (objI0000Il00O == ii0111o) {
/* 176 */                       return ii0111o;
                            }
                        }
                        return iiIOI1ol0o != null ? I000lI : iiIOI1ol0o;
                    }
/* 37 */            if (i2 != 1) {
/* 46 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                return null;
                    }
/* 39 */            lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 178 */           iiIOI1ol0o = (IiIOI1ol0o) objI0000Il00O;
                    if (iiIOI1ol0o != null) {
                    }
                }

                @Override
                public final void close() {
/* 2 */             this.I000II = true;
/* 7 */             l11I11lO.I0000O(3, "CXCP");
/* 16 */            OolIOoI1IiO oolIOoI1IiO = (OolIOoI1IiO) this.I000OiO.getValue();
                    synchronized (oolIOoI1IiO.I0000Il00O) {
                        try {
/* 23 */                    if (oolIOoI1IiO.I000II) {
/* 26 */                        oolIOoI1IiO.I000II = false;
/* 28 */                        IOi10loi iOi10loi = oolIOoI1IiO.I0000O;
/* 30 */                        if (iOi10loi != null) {
/* 39 */                            iOi10loi.I00iIO(new CancellationException("UseCaseCameraState closed"));
                                }
/* 46 */                        oolIOoI1IiO.I0000O = null;
                            }
/* 54 */                    while (!oolIOoI1IiO.I0001Ioi1lo.isEmpty()) {
/* 73 */                        ((OolIIIlOOo) oolIOoI1IiO.I0001Ioi1lo.removeFirst()).I00000oOI.I00iIO(new CancellationException("UseCaseCameraState closed"));
/* 78 */                        oolIOoI1IiO.I00100o1O0lo.I00000oIO();
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }
            }
