            package p000;

            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            
            public final class OOiOlo1l0I0o {
                public Oi111lO I00000oIO;
                public IIl0O0iioOO I00000oOI;
                public IIl0l10l I0000Il00O;
                public Ii0110 I0000O;
                public iOliil I0000oI00;
                public LinkedHashSet I0001Ioi1lo;
                public ArrayList I000II;

                public final void I00000oIO(String str) {
/* 3 */             Oi01oOIIlo oi01oOIIlo = new Oi01oOIIlo();
/* 6 */             oi01oOIIlo.I00000oIO = str;
/* 10 */            IOi10loi iOi10loi = new IOi10loi();
/* 13 */            oi01oOIIlo.I00000oOI = iOi10loi;
/* 15 */            VarHandle.storeStoreFence();
/* 30 */            if (((IIIII1OI1) this.I0000oI00.I00iio).I000lI(oi01oOIIlo) instanceof IO10l0l0) {
/* 57 */                Log.e("CXCP", "Camera close by ID request failed for " + ((Object) IIllI0o.I0000Il00O(str)) + '!');
/* 62 */                iOi10loi.I00O10llo(OoiIlOl1iI.I00000oIO);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
                
                    p000.I000II.I001IO000("Check failed.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
                
                    return null;
                 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00e5 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00de -> B:44:0x00e1). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(Set set, IOoilo iOoilo) throws Throwable {
                    OOiOiIlOl oOiOiIlOl;
                    Iterator it;
                    boolean zHasNext;
/* 1 */             ArrayList arrayList = this.I000II;
/* 5 */             if (iOoilo instanceof OOiOiIlOl) {
/* 8 */                 oOiOiIlOl = (OOiOiIlOl) iOoilo;
/* 10 */                int i = oOiOiIlOl.I00ilI0I1;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    oOiOiIlOl.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    oOiOiIlOl = new OOiOiIlOl(this, iOoilo);
                        }
                    }
/* 27 */            Object obj = oOiOiIlOl.I00iiO;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = oOiOiIlOl.I00ilI0I1;
/* 35 */            if (i2 == 0) {
/* 54 */                lIoii1l01l0i.I00000oOI(obj);
/* 59 */                ArrayList arrayList2 = new ArrayList();
/* 62 */                Iterator it2 = arrayList.iterator();
/* 70 */                while (it2.hasNext()) {
/* 72 */                    Object next = it2.next();
/* 93 */                    if (set.contains(IIllI0o.I00000oIO(((OOiOOiI1loi) next).I00000oIO.I00000oIO.I00000oIO))) {
/* 95 */                        arrayList2.add(next);
                            }
                        }
/* 99 */                it = arrayList2.iterator();
/* 104 */               zHasNext = it.hasNext();
/* 108 */               OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 110 */               if (zHasNext) {
                        }
                    } else {
/* 37 */                if (i2 != 1) {
/* 50 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                    return null;
                        }
/* 39 */                OOiOOiI1loi oOiOOiI1loi = oOiOiIlOl.I00iiI;
/* 41 */                it = oOiOiIlOl.I00iOIl;
/* 43 */                lIoii1l01l0i.I00000oOI(obj);
/* 226 */               arrayList.remove(oOiOOiI1loi);
/* 104 */               zHasNext = it.hasNext();
/* 108 */               OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 110 */               if (zHasNext) {
/* 116 */                   oOiOOiI1loi = (OOiOOiI1loi) it.next();
/* 118 */                   Oi0O01 oi0O01 = oOiOOiI1loi.I00000oIO;
/* 120 */                   OoooIIOo10 ooooIIOo10 = oi0O01.I00000oIO;
/* 138 */                   ArrayList arrayListI00O10llo = IOOi0Ool1i.I00O10llo(Collections.singletonList(IIllI0o.I00000oIO(ooooIIOo10.I00000oIO)), oi0O01.I00000oOI);
/* 146 */                   if (!arrayListI00O10llo.isEmpty()) {
/* 149 */                       Iterator it3 = arrayListI00O10llo.iterator();
/* 157 */                       loop0: while (it3.hasNext()) {
/* 165 */                           String str = ((IIllI0o) it3.next()).I00000oIO;
/* 167 */                           LinkedHashSet linkedHashSet = this.I0001Ioi1lo;
/* 169 */                           if (linkedHashSet != null && linkedHashSet.isEmpty()) {
                                        break;
                                    }
/* 177 */                           Iterator it4 = linkedHashSet.iterator();
/* 185 */                           while (it4.hasNext()) {
/* 201 */                               if (O0000Ioio00.I0000O(((I0II0i00l) it4.next()).I00000oIO.I00000oIO, str)) {
                                            break;
                                        }
                                    }
                                    break loop0;
                                }
                            }
/* 210 */                   I0II0i00l i0II0i00l = oOiOOiI1loi.I00000oOI;
/* 212 */                   OI1I11lO1i oI1I11lO1i = oOiOOiI1loi.I0000Il00O;
/* 214 */                   oOiOiIlOl.I00iOIl = it;
/* 216 */                   oOiOiIlOl.I00iiI = oOiOOiI1loi;
/* 218 */                   oOiOiIlOl.I00ilI0I1 = 1;
/* 220 */                   i0II0i00l.I0000O(ooooIIOo10, oI1I11lO1i);
/* 223 */                   if (ooiIlOl1iI2 == ii0111o) {
/* 225 */                       return ii0111o;
                            }
/* 226 */                   arrayList.remove(oOiOOiI1loi);
/* 104 */                   zHasNext = it.hasNext();
/* 108 */                   OoiIlOl1iI ooiIlOl1iI22 = OoiIlOl1iI.I00000oIO;
/* 110 */                   if (zHasNext) {
/* 332 */                       return ooiIlOl1iI22;
                            }
                        }
                    }
                }

                public final void I0000Il00O(ArrayList arrayList) {
/* 1 */             Iterator it = arrayList.iterator();
/* 9 */             while (it.hasNext()) {
/* 15 */                OOiOOiI1loi oOiOOiI1loi = (OOiOOiI1loi) it.next();
/* 19 */                oOiOOiI1loi.I0000Il00O.I00000oOI();
/* 24 */                this.I000II.remove(oOiOOiI1loi);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000O(String str, List list, IIio00Io10 iIio00Io10, Ii0110 ii0110, IOoilo iOoilo) throws Throwable {
                    OOiOiIo oOiOiIo;
/* 3 */             if (iOoilo instanceof OOiOiIo) {
/* 6 */                 oOiOiIo = (OOiOiIo) iOoilo;
/* 8 */                 int i = oOiOiIo.I00ilO0;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oOiOiIo.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oOiOiIo = new OOiOiIo(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00000oIO = oOiOiIo.I00iio;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oOiOiIo.I00ilO0;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 33 */            if (i2 == 0) {
/* 56 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 59 */                IIllI0o.I0000Il00O(str);
/* 62 */                Oi111lO oi111lO = this.I00000oIO;
/* 64 */                IIl0O0iioOO iIl0O0iioOO = this.I00000oOI;
/* 66 */                oOiOiIo.I00iOIl = str;
/* 71 */                oOiOiIo.I00iiI = list;
/* 73 */                oOiOiIo.I00iiO = ii0110;
/* 75 */                oOiOiIo.I00ilO0 = 1;
/* 77 */                objI00000oIO = oi111lO.I00000oIO(str, iIl0O0iioOO, iIio00Io10, oOiOiIo);
/* 81 */                if (objI00000oIO == ii0111o) {
/* 83 */                    return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 52 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                ii0110 = oOiOiIo.I00iiO;
/* 39 */                list = oOiOiIo.I00iiI;
/* 44 */                str = oOiOiIo.I00iOIl;
/* 46 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
                    }
/* 84 */            OIi0ooOoOOo0 oIi0ooOoOOo0 = (OIi0ooOoOOo0) objI00000oIO;
/* 86 */            I0lIllO i0lIllO = oIi0ooOoOOo0.I00000oIO;
/* 88 */            if (i0lIllO == null) {
/* 92 */                IIlOloloOil iIlOloloOil = oIi0ooOoOOo0.I00000oOI;
/* 94 */                OOiO1oOo01 oOiO1oOo01 = new OOiO1oOo01();
/* 97 */                oOiO1oOo01.I00000oIO = iIlOloloOil;
/* 99 */                VarHandle.storeStoreFence();
/* 102 */               return oOiO1oOo01;
                    }
/* 117 */           Set setI00iio = IOOi0Ool1i.I00iio(IOOi0Ool1i.I00OI1(list, IIllI0o.I00000oIO(str)));
/* 125 */           OIoO1Ol oIoO1Ol = new OIoO1Ol(8);
/* 128 */           oIoO1Ol.I00iiI = this;
/* 130 */           VarHandle.storeStoreFence();
/* 133 */           I0II0i00l i0II0i00l = new I0II0i00l();
/* 136 */           i0II0i00l.I00000oIO = i0lIllO;
/* 138 */           i0II0i00l.I00000oOI = setI00iio;
/* 145 */           I01ii1IIl i01ii1IIl = new I01ii1IIl(2);
/* 148 */           i01ii1IIl.I00iiI = oIoO1Ol;
/* 150 */           i01ii1IIl.I00iiO = i0II0i00l;
/* 152 */           VarHandle.storeStoreFence();
/* 155 */           OI10llOi oI10llOi = new OI10llOi();
/* 158 */           oI10llOi.I00iio = ii0110;
/* 160 */           oI10llOi.I00ilI0I1 = i01ii1IIl;
/* 164 */           Object obj = new Object();
/* 167 */           oI10llOi.I00iiO = obj;
                    synchronized (obj) {
/* 182 */               oI10llOi.I00ilO0 = iOi1II01i0.I0000O(ii0110, null, null, new O1iOlO(oI10llOi, iOoil1iiIilo, 17), 3);
                    }
/* 185 */           VarHandle.storeStoreFence();
/* 188 */           i0II0i00l.I0000O = oI10llOi;
/* 196 */           iOi1II01i0.I0000O(ii0110, null, null, new I0II0OiI(i0II0i00l, iOoil1iiIilo, 0), 3);
/* 199 */           VarHandle.storeStoreFence();
/* 202 */           OOiOI11 oOiOI11 = new OOiOI11();
/* 205 */           oOiOI11.I00000oIO = i0II0i00l;
/* 207 */           VarHandle.storeStoreFence();
/* 210 */           return oOiOI11;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000oI00(Oi01loi1ioi oi01loi1ioi, IOoilo iOoilo) throws Throwable {
                    OOiOiIoIoi oOiOiIoIoi;
/* 1 */             LinkedHashSet linkedHashSet = this.I0001Ioi1lo;
/* 5 */             if (iOoilo instanceof OOiOiIoIoi) {
/* 8 */                 oOiOiIoIoi = (OOiOiIoIoi) iOoilo;
/* 10 */                int i = oOiOiIoIoi.I00iio;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    oOiOiIoIoi.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    oOiOiIoIoi = new OOiOiIoIoi(this, iOoilo);
                        }
                    }
/* 27 */            Object obj = oOiOiIoIoi.I00iiI;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = oOiOiIoIoi.I00iio;
/* 34 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 38 */            if (i2 == 0) {
/* 60 */                lIoii1l01l0i.I00000oOI(obj);
/* 63 */                I0II0i00l i0II0i00l = oi01loi1ioi.I00000oIO;
/* 94 */                Log.i("CXCP", "PruningCamera2DeviceManager#processRequestClose(" + ((Object) IIllI0o.I0000Il00O(i0II0i00l.I00000oIO.I00000oIO)) + ')');
/* 101 */               if (linkedHashSet.contains(i0II0i00l)) {
/* 103 */                   linkedHashSet.remove(i0II0i00l);
                        }
/* 106 */               ArrayList arrayList = this.I000II;
/* 110 */               ArrayList arrayList2 = new ArrayList();
/* 113 */               Iterator it = arrayList.iterator();
/* 121 */               while (it.hasNext()) {
/* 123 */                   Object next = it.next();
/* 132 */                   if (((OOiOOiI1loi) next).I00000oOI == i0II0i00l) {
/* 135 */                       arrayList2.add(next);
                            }
                        }
/* 139 */               oOiOiIoIoi.I00iOIl = oi01loi1ioi;
/* 141 */               oOiOiIoIoi.I00iio = 1;
/* 143 */               I0000Il00O(arrayList2);
/* 146 */               if (ooiIlOl1iI != ii0111o) {
                        }
                    }
/* 40 */            if (i2 != 1) {
/* 42 */                if (i2 == 2) {
/* 44 */                    lIoii1l01l0i.I00000oOI(obj);
/* 47 */                    return ooiIlOl1iI;
                        }
/* 50 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                return null;
                    }
/* 54 */            oi01loi1ioi = oOiOiIoIoi.I00iOIl;
/* 56 */            lIoii1l01l0i.I00000oOI(obj);
/* 151 */           oi01loi1ioi.I00000oIO.I0000Il00O();
/* 154 */           I0II0i00l i0II0i00l2 = oi01loi1ioi.I00000oIO;
/* 156 */           oOiOiIoIoi.I00iOIl = null;
/* 158 */           oOiOiIoIoi.I00iio = 2;
                    return i0II0i00l2.I00000oOI(oOiOiIoIoi) == ii0111o ? ii0111o : ooiIlOl1iI;
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
                
                    if (r4 == r2) goto L28;
                 */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0001Ioi1lo(Oi01o1o10O01 oi01o1o10O01, IOoilo iOoilo) throws Throwable {
                    OOiOlO0io oOiOlO0io;
                    Iterator it;
/* 1 */             LinkedHashSet linkedHashSet = this.I0001Ioi1lo;
/* 5 */             if (iOoilo instanceof OOiOlO0io) {
/* 8 */                 oOiOlO0io = (OOiOlO0io) iOoilo;
/* 10 */                int i = oOiOlO0io.I00ilI0I1;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    oOiOlO0io.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    oOiOlO0io = new OOiOlO0io(this, iOoilo);
                        }
                    }
/* 27 */            Object obj = oOiOlO0io.I00iiO;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = oOiOlO0io.I00ilI0I1;
/* 33 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 37 */            if (i2 == 0) {
/* 64 */                lIoii1l01l0i.I00000oOI(obj);
/* 71 */                Log.i("CXCP", "PruningCamera2DeviceManager#processRequestCloseAll()");
/* 74 */                ArrayList arrayList = this.I000II;
/* 76 */                oOiOlO0io.I00iOIl = oi01o1o10O01;
/* 78 */                oOiOlO0io.I00ilI0I1 = 1;
/* 80 */                I0000Il00O(arrayList);
                    } else {
/* 39 */                if (i2 != 1) {
/* 41 */                    if (i2 != 2) {
/* 53 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 56 */                        return null;
                            }
/* 43 */                    it = oOiOlO0io.I00iiI;
/* 45 */                    oi01o1o10O01 = oOiOlO0io.I00iOIl;
/* 47 */                    lIoii1l01l0i.I00000oOI(obj);
/* 114 */                   while (it.hasNext()) {
/* 120 */                       I0II0i00l i0II0i00l = (I0II0i00l) it.next();
/* 122 */                       oOiOlO0io.I00iOIl = oi01o1o10O01;
/* 124 */                       oOiOlO0io.I00iiI = it;
/* 126 */                       oOiOlO0io.I00ilI0I1 = 2;
/* 132 */                       if (i0II0i00l.I00000oOI(oOiOlO0io) == ii0111o) {
/* 134 */                           return ii0111o;
                                }
                            }
/* 135 */                   linkedHashSet.clear();
/* 140 */                   oi01o1o10O01.I00000oIO.I00O10llo(ooiIlOl1iI);
/* 332 */                   return ooiIlOl1iI;
                        }
/* 58 */                oi01o1o10O01 = oOiOlO0io.I00iOIl;
/* 60 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 86 */            Iterator it2 = linkedHashSet.iterator();
/* 94 */            while (it2.hasNext()) {
/* 102 */               ((I0II0i00l) it2.next()).I0000Il00O();
                    }
/* 106 */           it = linkedHashSet.iterator();
/* 114 */           while (it.hasNext()) {
                    }
/* 135 */           linkedHashSet.clear();
/* 140 */           oi01o1o10O01.I00000oIO.I00O10llo(ooiIlOl1iI);
/* 332 */           return ooiIlOl1iI;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(Oi01oOIIlo oi01oOIIlo, IOoilo iOoilo) throws Throwable {
                    OOiOli oOiOli;
                    String str;
                    Object next;
                    Oi01oOIIlo oi01oOIIlo2;
/* 1 */             LinkedHashSet linkedHashSet = this.I0001Ioi1lo;
/* 5 */             if (iOoilo instanceof OOiOli) {
/* 8 */                 oOiOli = (OOiOli) iOoilo;
/* 10 */                int i = oOiOli.I00ilI0I1;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    oOiOli.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    oOiOli = new OOiOli(this, iOoilo);
                        }
                    }
/* 27 */            Object obj = oOiOli.I00iiO;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = oOiOli.I00ilI0I1;
/* 34 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 38 */            if (i2 == 0) {
/* 65 */                lIoii1l01l0i.I00000oOI(obj);
/* 68 */                String str2 = oi01oOIIlo.I00000oIO;
/* 97 */                Log.i("CXCP", "PruningCamera2DeviceManager#processRequestCloseById(" + ((Object) IIllI0o.I0000Il00O(oi01oOIIlo.I00000oIO)) + ')');
/* 100 */               ArrayList arrayList = this.I000II;
/* 104 */               ArrayList arrayList2 = new ArrayList();
/* 107 */               Iterator it = arrayList.iterator();
/* 115 */               while (it.hasNext()) {
/* 117 */                   Object next2 = it.next();
/* 134 */                   if (O0000Ioio00.I0000O(((OOiOOiI1loi) next2).I00000oIO.I00000oIO.I00000oIO, str2)) {
/* 136 */                       arrayList2.add(next2);
                            }
                        }
/* 140 */               oOiOli.I00iOIl = oi01oOIIlo;
/* 142 */               oOiOli.I00iiI = str2;
/* 144 */               oOiOli.I00ilI0I1 = 1;
/* 146 */               I0000Il00O(arrayList2);
/* 149 */               if (ooiIlOl1iI != ii0111o) {
/* 152 */                   str = str2;
                        }
/* 204 */               return ii0111o;
                    }
/* 40 */            if (i2 != 1) {
/* 42 */                if (i2 != 2) {
/* 53 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                    return null;
                        }
/* 44 */                oi01oOIIlo2 = oOiOli.I00iOIl;
/* 46 */                lIoii1l01l0i.I00000oOI(obj);
/* 206 */               oi01oOIIlo = oi01oOIIlo2;
/* 209 */               oi01oOIIlo.I00000oOI.I00O10llo(ooiIlOl1iI);
/* 332 */               return ooiIlOl1iI;
                    }
/* 57 */            str = oOiOli.I00iiI;
/* 59 */            oi01oOIIlo = oOiOli.I00iOIl;
/* 61 */            lIoii1l01l0i.I00000oOI(obj);
/* 153 */           Iterator it2 = linkedHashSet.iterator();
                    while (true) {
/* 161 */               if (!it2.hasNext()) {
/* 181 */                   next = null;
                            break;
                        }
/* 163 */               next = it2.next();
/* 178 */               if (O0000Ioio00.I0000O(((I0II0i00l) next).I00000oIO.I00000oIO, str)) {
                            break;
                        }
                    }
/* 182 */           I0II0i00l i0II0i00l = (I0II0i00l) next;
/* 184 */           if (i0II0i00l != null) {
/* 186 */               linkedHashSet.remove(i0II0i00l);
/* 189 */               i0II0i00l.I0000Il00O();
/* 192 */               oOiOli.I00iOIl = oi01oOIIlo;
/* 194 */               oOiOli.I00iiI = null;
/* 196 */               oOiOli.I00ilI0I1 = 2;
/* 202 */               if (i0II0i00l.I00000oOI(oOiOli) != ii0111o) {
/* 205 */                   oi01oOIIlo2 = oi01oOIIlo;
/* 206 */                   oi01oOIIlo = oi01oOIIlo2;
                        }
/* 204 */               return ii0111o;
                    }
/* 209 */           oi01oOIIlo.I00000oOI.I00O10llo(ooiIlOl1iI);
/* 332 */           return ooiIlOl1iI;
                }

                /* JADX WARN: Code restructure failed: missing block: B:103:0x027a, code lost:
                
                    if (I00000oOI(r10, r0) != r1) goto L105;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:108:0x028e, code lost:
                
                    if (p000.OoiIlOl1iI.I00000oIO == r1) goto L109;
                 */
                /* JADX WARN: Removed duplicated region for block: B:117:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0139 A[LOOP:3: B:46:0x0133->B:48:0x0139, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0194  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x01e1  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000O01llI0(Oi0O01 oi0O01, IOoilo iOoilo) throws Throwable {
                    OOiOlio oOiOlio;
                    String str;
                    ArrayList arrayList;
                    Oi0O01 oi0O012;
                    List list;
                    Iterator it;
                    Iterator it2;
                    IIl0l10l iIl0l10l;
                    OOiOlio oOiOlio2;
                    Object obj;
                    String str2;
                    Oi0O01 oi0O013;
                    OOiOi1IIlIll oOiOi1IIlIll;
/* 3 */             if (iOoilo instanceof OOiOlio) {
/* 6 */                 oOiOlio = (OOiOlio) iOoilo;
/* 8 */                 int i = oOiOlio.I00ilO0;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oOiOlio.I00ilO0 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oOiOlio = new OOiOlio(this, iOoilo);
                        }
                    }
/* 25 */            Object obj2 = oOiOlio.I00iio;
/* 27 */            Object obj3 = Ii0111o.I00iOIl;
                    switch (oOiOlio.I00ilO0) {
                        case 0:
/* 98 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 103 */                   str = oi0O01.I00000oIO.I00000oIO;
/* 130 */                   Log.i("CXCP", "PruningCamera2DeviceManager#processRequestOpen(" + ((Object) IIllI0o.I0000Il00O(str)) + ')');
/* 139 */                   if (oi0O01.I00000oOI.isEmpty()) {
/* 141 */                       LinkedHashSet linkedHashSet = this.I0001Ioi1lo;
/* 145 */                       arrayList = new ArrayList();
/* 156 */                       for (Object obj4 : linkedHashSet) {
/* 173 */                           if (!O0000Ioio00.I0000O(((I0II0i00l) obj4).I00000oIO.I00000oIO, str)) {
/* 175 */                               arrayList.add(obj4);
                                    }
                                }
                            } else {
/* 195 */                       Set setI00iio = IOOi0Ool1i.I00iio(IOOi0Ool1i.I00OI1(oi0O01.I00000oOI, IIllI0o.I00000oIO(oi0O01.I00000oIO.I00000oIO)));
/* 199 */                       LinkedHashSet linkedHashSet2 = this.I0001Ioi1lo;
/* 203 */                       ArrayList arrayList2 = new ArrayList();
/* 214 */                       for (Object obj5 : linkedHashSet2) {
/* 229 */                           if (!((I0II0i00l) obj5).I00000oOI.equals(setI00iio)) {
/* 231 */                               arrayList2.add(obj5);
                                    }
                                }
/* 235 */                       arrayList = arrayList2;
                            }
/* 240 */                   if (!arrayList.isEmpty()) {
/* 244 */                       this.I0001Ioi1lo.removeAll(arrayList);
/* 247 */                       ArrayList arrayList3 = this.I000II;
/* 251 */                       ArrayList arrayList4 = new ArrayList();
/* 254 */                       Iterator it3 = arrayList3.iterator();
/* 262 */                       while (it3.hasNext()) {
/* 264 */                           Object next = it3.next();
/* 277 */                           if (arrayList.contains(((OOiOOiI1loi) next).I00000oOI)) {
/* 279 */                               arrayList4.add(next);
                                    }
                                }
/* 283 */                       oOiOlio.I00iOIl = oi0O01;
/* 285 */                       oOiOlio.I00iiI = str;
/* 287 */                       oOiOlio.I00iiO = arrayList;
/* 290 */                       oOiOlio.I00ilO0 = 1;
/* 292 */                       I0000Il00O(arrayList4);
/* 297 */                       if (OoiIlOl1iI.I00000oIO != obj3) {
/* 301 */                           ArrayList arrayList5 = arrayList;
/* 302 */                           oi0O012 = oi0O01;
/* 303 */                           list = arrayList5;
/* 304 */                           it = list.iterator();
/* 312 */                           while (it.hasNext()) {
/* 320 */                               ((I0II0i00l) it.next()).I0000Il00O();
                                    }
/* 324 */                           it2 = list.iterator();
/* 332 */                           while (it2.hasNext()) {
/* 338 */                               I0II0i00l i0II0i00l = (I0II0i00l) it2.next();
/* 340 */                               oOiOlio.I00iOIl = oi0O012;
/* 342 */                               oOiOlio.I00iiI = str;
/* 344 */                               oOiOlio.I00iiO = it2;
/* 347 */                               oOiOlio.I00ilO0 = 2;
/* 353 */                               if (i0II0i00l.I00000oOI(oOiOlio) == obj3) {
                                        }
                                    }
/* 357 */                           String str3 = str;
/* 361 */                           iIl0l10l = this.I0000Il00O;
/* 363 */                           OoooIIOo10 ooooIIOo10 = oi0O012.I00000oIO;
                                    synchronized (iIl0l10l.I00000oIO) {
/* 374 */                               iIl0l10l.I00000oOI.put(IIllI0o.I00000oIO(str3), ooooIIOo10);
                                    }
/* 378 */                           oOiOlio.I00iOIl = oi0O012;
/* 380 */                           oOiOlio.I00iiI = str3;
/* 382 */                           oOiOlio.I00iiO = null;
/* 385 */                           oOiOlio.I00ilO0 = 3;
/* 387 */                           Object objI000OOo1O = I000OOo1O(str3, oi0O012, oOiOlio);
/* 391 */                           if (objI000OOo1O != obj3) {
/* 395 */                               oOiOlio2 = oOiOlio;
/* 396 */                               obj = objI000OOo1O;
/* 397 */                               str2 = str3;
/* 398 */                               oi0O013 = oi0O012;
/* 399 */                               oOiOi1IIlIll = (OOiOi1IIlIll) obj;
/* 403 */                               if (!(oOiOi1IIlIll instanceof OOiOOl101l)) {
/* 405 */                                   OOiOOl101l oOiOOl101l = (OOiOOl101l) oOiOi1IIlIll;
/* 409 */                                   if (oOiOOl101l.I00000oIO != null) {
/* 447 */                                       Log.e("CXCP", "Failed to retrieve active camera for " + ((Object) IIllI0o.I0000Il00O(str2)) + ". Last camera error was " + ((Object) IIlOloloOil.I00000oOI(oOiOOl101l.I00000oIO.I00000oIO)));
                                            } else {
/* 476 */                                       Log.w("CXCP", "Failed to retrieve active camera for " + ((Object) IIllI0o.I0000Il00O(str2)) + ". Camera might have been closed during opening.");
                                            }
/* 479 */                                   return OoiIlOl1iI.I00000oIO;
                                        }
/* 484 */                               if (!(oOiOi1IIlIll instanceof OOiOOoO1ioiO)) {
/* 663 */                                   I000II.I001IO000("Check failed.");
/* 31 */                                    return null;
                                        }
/* 486 */                               OOiOOoO1ioiO oOiOOoO1ioiO = (OOiOOoO1ioiO) oOiOi1IIlIll;
/* 488 */                               I0II0i00l i0II0i00l2 = oOiOOoO1ioiO.I00000oIO;
/* 490 */                               OI1I11lO1i oI1I11lO1i = oOiOOoO1ioiO.I00000oOI;
/* 500 */                               if (oi0O013.I00000oOI.isEmpty()) {
/* 641 */                                   OoooIIOo10 ooooIIOo102 = oi0O013.I00000oIO;
/* 643 */                                   oOiOlio2.I00iOIl = null;
/* 645 */                                   oOiOlio2.I00iiI = null;
/* 648 */                                   oOiOlio2.I00ilO0 = 6;
/* 650 */                                   i0II0i00l2.I0000O(ooooIIOo102, oI1I11lO1i);
                                            break;
                                        } else {
/* 502 */                                   List list2 = oi0O013.I00000oOI;
/* 508 */                                   if (!(list2 instanceof Collection) || !list2.isEmpty()) {
/* 520 */                                       Iterator it4 = list2.iterator();
/* 528 */                                       while (it4.hasNext()) {
/* 536 */                                           String str4 = ((IIllI0o) it4.next()).I00000oIO;
/* 538 */                                           ArrayList arrayList6 = this.I000II;
/* 540 */                                           if (arrayList6 == null || !arrayList6.isEmpty()) {
/* 549 */                                               Iterator it5 = arrayList6.iterator();
/* 557 */                                               while (it5.hasNext()) {
/* 575 */                                                   if (O0000Ioio00.I0000O(((OOiOOiI1loi) it5.next()).I00000oOI.I00000oIO.I00000oIO, str4)) {
                                                                break;
                                                            }
                                                        }
                                                    }
/* 578 */                                           ArrayList arrayList7 = this.I000II;
/* 582 */                                           OOiOOiI1loi oOiOOiI1loi = new OOiOOiI1loi();
/* 585 */                                           oOiOOiI1loi.I00000oIO = oi0O013;
/* 587 */                                           oOiOOiI1loi.I00000oOI = i0II0i00l2;
/* 589 */                                           oOiOOiI1loi.I0000Il00O = oI1I11lO1i;
/* 591 */                                           VarHandle.storeStoreFence();
/* 594 */                                           arrayList7.add(oOiOOiI1loi);
/* 597 */                                           return OoiIlOl1iI.I00000oIO;
                                                    break;
                                                }
                                            }
/* 600 */                                   OoooIIOo10 ooooIIOo103 = oi0O013.I00000oIO;
/* 602 */                                   oOiOlio2.I00iOIl = oi0O013;
/* 604 */                                   oOiOlio2.I00iiI = null;
/* 607 */                                   oOiOlio2.I00ilO0 = 4;
/* 609 */                                   i0II0i00l2.I0000O(ooooIIOo103, oI1I11lO1i);
/* 614 */                                   if (OoiIlOl1iI.I00000oIO != obj3) {
/* 617 */                                       oOiOlio = oOiOlio2;
/* 622 */                                       Set setI00iio2 = IOOi0Ool1i.I00iio(oi0O013.I00000oOI);
/* 626 */                                       oOiOlio.I00iOIl = null;
/* 629 */                                       oOiOlio.I00ilO0 = 5;
                                                break;
                                            }
                                        }
                                    }
                                }
/* 657 */                       return obj3;
                            }
/* 359 */                   oi0O012 = oi0O01;
/* 357 */                   String str32 = str;
/* 361 */                   iIl0l10l = this.I0000Il00O;
/* 363 */                   OoooIIOo10 ooooIIOo104 = oi0O012.I00000oIO;
                            synchronized (iIl0l10l.I00000oIO) {
                            }
                            break;
                        case 1:
/* 87 */                    list = (List) oOiOlio.I00iiO;
/* 89 */                    str = oOiOlio.I00iiI;
/* 91 */                    oi0O012 = oOiOlio.I00iOIl;
/* 93 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 304 */                   it = list.iterator();
/* 312 */                   while (it.hasNext()) {
                            }
/* 324 */                   it2 = list.iterator();
/* 332 */                   while (it2.hasNext()) {
                            }
/* 357 */                   String str322 = str;
/* 361 */                   iIl0l10l = this.I0000Il00O;
/* 363 */                   OoooIIOo10 ooooIIOo1042 = oi0O012.I00000oIO;
                            synchronized (iIl0l10l.I00000oIO) {
                            }
                            break;
                        case 2:
/* 74 */                    it2 = (Iterator) oOiOlio.I00iiO;
/* 76 */                    str = oOiOlio.I00iiI;
/* 78 */                    oi0O012 = oOiOlio.I00iOIl;
/* 80 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 332 */                   while (it2.hasNext()) {
                            }
/* 357 */                   String str3222 = str;
/* 361 */                   iIl0l10l = this.I0000Il00O;
/* 363 */                   OoooIIOo10 ooooIIOo10422 = oi0O012.I00000oIO;
                            synchronized (iIl0l10l.I00000oIO) {
                            }
                            break;
                        case 3:
/* 58 */                    String str5 = oOiOlio.I00iiI;
/* 60 */                    Oi0O01 oi0O014 = oOiOlio.I00iOIl;
/* 62 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 66 */                    str2 = str5;
/* 67 */                    oi0O013 = oi0O014;
/* 68 */                    oOiOlio2 = oOiOlio;
/* 69 */                    obj = obj2;
/* 399 */                   oOiOi1IIlIll = (OOiOi1IIlIll) obj;
/* 403 */                   if (!(oOiOi1IIlIll instanceof OOiOOl101l)) {
                            }
                            break;
                        case 4:
/* 51 */                    oi0O013 = oOiOlio.I00iOIl;
/* 53 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 622 */                   Set setI00iio22 = IOOi0Ool1i.I00iio(oi0O013.I00000oOI);
/* 626 */                   oOiOlio.I00iOIl = null;
/* 629 */                   oOiOlio.I00ilO0 = 5;
                            break;
                        case 5:
/* 46 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 638 */                   return OoiIlOl1iI.I00000oIO;
                        case 6:
/* 41 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 658 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 37 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    r11 = r10.I00000oIO();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
                
                    if (r11 == null) goto L24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
                
                    r10.I0000Il00O();
                    r2.I00iOIl = r1;
                    r2.I00iiI = r9;
                    r2.I00iiO = r3;
                    r2.I00iio = r10;
                    r2.I00io1l = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
                
                    if (r10.I00000oOI(r2) != r7) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
                
                    r12 = r9;
                    r9 = r3;
                    r3 = r10;
                    r10 = r12;
                 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x008c A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0082 -> B:28:0x0086). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000OOo1O(String str, Oi0O01 oi0O01, IOoilo iOoilo) throws Throwable {
                    OOiOll oOiOll;
                    Oi0O01 oi0O012;
                    Iterator it;
                    String str2;
                    I0II0i00l i0II0i00l;
                    OI1I11lO1i oI1I11lO1iI00000oIO;
                    String str3;
                    Oi0O01 oi0O013;
                    OOiOI1I01o1 oOiOI1I01o1;
/* 3 */             LinkedHashSet linkedHashSet = this.I0001Ioi1lo;
/* 7 */             if (iOoilo instanceof OOiOll) {
/* 10 */                oOiOll = (OOiOll) iOoilo;
/* 12 */                int i = oOiOll.I00io1l;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    oOiOll.I00io1l = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    oOiOll = new OOiOll(this, iOoilo);
                        }
                    }
/* 29 */            Object obj = oOiOll.I00ilI0I1;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = oOiOll.I00io1l;
/* 38 */            if (i2 == 0) {
/* 72 */                lIoii1l01l0i.I00000oOI(obj);
/* 79 */                oi0O012 = oi0O01;
/* 75 */                it = linkedHashSet.iterator();
/* 81 */                str2 = str;
                        while (true) {
/* 86 */                    if (!it.hasNext()) {
                            }
                        }
/* 143 */               if (i0II0i00l == null) {
                        }
/* 306 */               if (oI1I11lO1iI00000oIO == null) {
                        }
                    } else {
/* 40 */                if (i2 != 1) {
/* 42 */                    if (i2 != 2) {
/* 55 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                        return null;
                            }
/* 44 */                    oi0O013 = oOiOll.I00iiI;
/* 46 */                    str3 = oOiOll.I00iOIl;
/* 48 */                    lIoii1l01l0i.I00000oOI(obj);
/* 177 */                   oOiOI1I01o1 = (OOiOI1I01o1) obj;
/* 185 */                   if (oOiOI1I01o1 instanceof OOiOI11) {
/* 264 */                       if (!(oOiOI1I01o1 instanceof OOiO1oOo01)) {
/* 300 */                           I000II.I00000oIO();
/* 37 */                            return null;
                                }
/* 282 */                       Log.i("CXCP", "PruningCameraDeviceManager: Failed to open " + ((Object) IIllI0o.I0000Il00O(str3)));
/* 285 */                       OoooIIOo10 ooooIIOo10 = oi0O013.I00000oIO;
/* 289 */                       IIlOloloOil iIlOloloOil = ((OOiO1oOo01) oOiOI1I01o1).I00000oIO;
/* 291 */                       ooooIIOo10.I00000oIO(iIlOloloOil);
/* 296 */                       return new OOiOOl101l(iIlOloloOil);
                            }
/* 189 */                   i0II0i00l = ((OOiOI11) oOiOI1I01o1).I00000oIO;
/* 191 */                   oI1I11lO1iI00000oIO = i0II0i00l.I00000oIO();
/* 195 */                   if (oI1I11lO1iI00000oIO == null) {
/* 248 */                       Log.i("CXCP", "PruningCameraDeviceManager: Failed to open " + ((Object) IIllI0o.I0000Il00O(str3)) + ": Camera may have been closed (possibly due to an error) immediately after opening");
/* 253 */                       oi0O013.I00000oIO.I00000oIO(null);
/* 258 */                       return new OOiOOl101l(null);
                            }
/* 220 */                   Log.i("CXCP", "PruningCameraDeviceManager: " + ((Object) IIllI0o.I0000Il00O(str3)) + " opened successfully");
/* 223 */                   linkedHashSet.add(i0II0i00l);
/* 306 */                   if (oI1I11lO1iI00000oIO == null) {
/* 321 */                       I000II.I001IO000("Required value was null.");
/* 37 */                        return null;
                            }
/* 308 */                   OOiOOoO1ioiO oOiOOoO1ioiO = new OOiOOoO1ioiO();
/* 311 */                   oOiOOoO1ioiO.I00000oIO = i0II0i00l;
/* 313 */                   oOiOOoO1ioiO.I00000oOI = oI1I11lO1iI00000oIO;
/* 315 */                   VarHandle.storeStoreFence();
/* 318 */                   return oOiOOoO1ioiO;
                        }
/* 59 */                I0II0i00l i0II0i00l2 = oOiOll.I00iio;
/* 61 */                Iterator it2 = oOiOll.I00iiO;
/* 63 */                Oi0O01 oi0O014 = oOiOll.I00iiI;
/* 65 */                String str4 = oOiOll.I00iOIl;
/* 67 */                lIoii1l01l0i.I00000oOI(obj);
/* 70 */                str2 = str4;
/* 135 */               linkedHashSet.remove(i0II0i00l2);
/* 138 */               it = it2;
/* 139 */               oi0O012 = oi0O014;
                        while (true) {
/* 86 */                    if (!it.hasNext()) {
/* 92 */                        i0II0i00l = (I0II0i00l) it.next();
/* 102 */                       if (O0000Ioio00.I0000O(i0II0i00l.I00000oIO.I00000oIO, str2)) {
                                    break;
                                }
                            } else {
/* 141 */                       i0II0i00l = null;
/* 142 */                       oI1I11lO1iI00000oIO = null;
                                break;
                            }
                        }
/* 143 */               if (i0II0i00l == null) {
/* 145 */                   List list = oi0O012.I00000oOI;
/* 148 */                   IIio00Io10 iIio00Io10 = oi0O012.I0000O;
/* 150 */                   Ii0110 ii0110 = this.I0000O;
/* 152 */                   oOiOll.I00iOIl = str2;
/* 154 */                   oOiOll.I00iiI = oi0O012;
/* 156 */                   oOiOll.I00iiO = null;
/* 158 */                   oOiOll.I00iio = null;
/* 160 */                   oOiOll.I00io1l = 2;
/* 167 */                   Object objI0000O = I0000O(str2, list, iIio00Io10, ii0110, oOiOll);
/* 171 */                   if (objI0000O != ii0111o) {
/* 174 */                       str3 = str2;
/* 175 */                       obj = objI0000O;
/* 176 */                       oi0O013 = oi0O012;
/* 177 */                       oOiOI1I01o1 = (OOiOI1I01o1) obj;
/* 185 */                       if (oOiOI1I01o1 instanceof OOiOI11) {
                                }
                            }
/* 173 */                   return ii0111o;
                        }
/* 306 */               if (oI1I11lO1iI00000oIO == null) {
                        }
                    }
                }
            }
