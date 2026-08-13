            package p000;

            import android.os.Bundle;
            import android.os.SystemClock;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class i1I1oIl extends iil0oiil0 {
                public l0olllO1i I00000oIO;
                public lIl1O1li I00000oOI;

                @Override
                public final void I00000oIO(Bundle bundle) {
/* 1 */             lIl1O1li lil1o1li = this.I00000oOI;
/* 9 */             ((l0olllO1i) lil1o1li.I00iOIl).I00li1OI.getClass();
/* 16 */            lil1o1li.I0111i(bundle, System.currentTimeMillis());
                }

                @Override
                public final void I00000oOI(String str) {
/* 1 */             l0olllO1i l0olllo1i = this.I00000oIO;
/* 3 */             il11ll0i il11ll0iVar = l0olllo1i.I00lll10;
/* 5 */             l0olllO1i.I0000O(il11ll0iVar);
/* 10 */            l0olllo1i.I00li1OI.getClass();
/* 17 */            il11ll0iVar.I010i10l(SystemClock.elapsedRealtime(), str);
                }

                @Override
                public final void I0000Il00O(String str, String str2, Bundle bundle) {
/* 3 */             this.I00000oOI.I010ioo(str, str2, bundle);
                }

                @Override
                public final void I0000O(String str) {
/* 1 */             l0olllO1i l0olllo1i = this.I00000oIO;
/* 3 */             il11ll0i il11ll0iVar = l0olllo1i.I00lll10;
/* 5 */             l0olllO1i.I0000O(il11ll0iVar);
/* 10 */            l0olllo1i.I00li1OI.getClass();
/* 17 */            il11ll0iVar.I010OIo1l(SystemClock.elapsedRealtime(), str);
                }

                @Override
                public final void I0000oI00(String str, String str2, Bundle bundle) {
/* 3 */             lIl1O1li lil1o1li = this.I00000oIO.I00lli11;
/* 5 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 8 */             lil1o1li.I011IO1I11OI(str, str2, bundle);
                }

                @Override
                public final List I0001Ioi1lo(String str, String str2) {
/* 1 */             lIl1O1li lil1o1li = this.I00000oOI;
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) lil1o1li.I00iOIl;
/* 7 */             l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 9 */             l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 11 */            l0olllO1i.I000II(l0o10ooo0);
/* 19 */            if (l0o10ooo0.I010l1O()) {
/* 21 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 28 */                l01o0io1ooo0.I00ilO0.I00000oOI("Cannot get conditional user properties from analytics worker thread");
/* 33 */                return new ArrayList(0);
                    }
/* 41 */            if (lolOiIoiillI.I0001Ioi1lo()) {
/* 43 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 50 */                l01o0io1ooo0.I00ilO0.I00000oOI("Cannot get conditional user properties from main thread");
/* 55 */                return new ArrayList(0);
                    }
/* 61 */            AtomicReference atomicReference = new AtomicReference();
/* 64 */            l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 66 */            l0olllO1i.I000II(l0o10ooo02);
/* 73 */            IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(9);
/* 76 */            iO0iIlI1li.I00iiI = atomicReference;
/* 78 */            iO0iIlI1li.I00iiO = str;
/* 80 */            iO0iIlI1li.I00iio = str2;
/* 82 */            iO0iIlI1li.I00ilI0I1 = lil1o1li;
/* 84 */            VarHandle.storeStoreFence();
/* 91 */            l0o10ooo02.I010oio1OO0(atomicReference, 5000L, "get conditional user properties", iO0iIlI1li);
/* 98 */            List list = (List) atomicReference.get();
/* 100 */           if (list != null) {
/* 119 */               return lioil0ilIOi.I01Iol(list);
                    }
/* 102 */           l0olllO1i.I000II(l01o0io1ooo0);
/* 110 */           l01o0io1ooo0.I00ilO0.I0000Il00O("Timed out waiting for get conditional user properties", null);
/* 115 */           return new ArrayList();
                }

                @Override
                public final int I000II(String str) {
/* 1 */             lIl1O1li lil1o1li = this.I00000oOI;
/* 3 */             lil1o1li.getClass();
/* 6 */             lII0I0I000I.I0000O(str);
/* 13 */            iIl1iil iil1iil = ((l0olllO1i) lil1o1li.I00iOIl).I00iio;
/* 15 */            return 25;
                }

                @Override
                public final Map I000O01llI0(String str, String str2, boolean z) {
/* 1 */             lIl1O1li lil1o1li = this.I00000oOI;
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) lil1o1li.I00iOIl;
/* 7 */             l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 9 */             l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 11 */            l0olllO1i.I000II(l0o10ooo0);
/* 18 */            if (l0o10ooo0.I010l1O()) {
/* 20 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 27 */                l01o0io1ooo0.I00ilO0.I00000oOI("Cannot get user properties from analytics worker thread");
/* 30 */                return Collections.EMPTY_MAP;
                    }
/* 37 */            if (lolOiIoiillI.I0001Ioi1lo()) {
/* 39 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 46 */                l01o0io1ooo0.I00ilO0.I00000oOI("Cannot get user properties from main thread");
/* 49 */                return Collections.EMPTY_MAP;
                    }
/* 54 */            AtomicReference atomicReference = new AtomicReference();
/* 57 */            l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 59 */            l0olllO1i.I000II(l0o10ooo02);
/* 65 */            l1oloOI l1olooi = new l1oloOI(1);
/* 68 */            l1olooi.I00ilI0I1 = atomicReference;
/* 70 */            l1olooi.I00iiI = str;
/* 72 */            l1olooi.I00iiO = str2;
/* 74 */            l1olooi.I00iio = z;
/* 76 */            l1olooi.I00ilO0 = lil1o1li;
/* 78 */            VarHandle.storeStoreFence();
/* 85 */            l0o10ooo02.I010oio1OO0(atomicReference, 5000L, "get user properties", l1olooi);
/* 92 */            List<lio0llOI0> list = (List) atomicReference.get();
/* 94 */            if (list == null) {
/* 96 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 107 */               l01o0io1ooo0.I00ilO0.I0000Il00O("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
/* 110 */               return Collections.EMPTY_MAP;
                    }
/* 119 */           I1Io0i0II i1Io0i0II = new I1Io0i0II(list.size());
/* 130 */           for (lio0llOI0 lio0lloi0 : list) {
/* 138 */               Object objZza = lio0lloi0.zza();
/* 142 */               if (objZza != null) {
/* 146 */                   i1Io0i0II.put(lio0lloi0.I00iiI, objZza);
                        }
                    }
/* 408 */           return i1Io0i0II;
                }

                @Override
                public final String zzh() {
/* 7 */             lO0liIO0 lo0liio0 = ((l0olllO1i) this.I00000oOI.I00iOIl).I00ll1;
/* 9 */             l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 12 */            lIol0ili1Oi liol0ili1oi = lo0liio0.I00iiO;
/* 14 */            if (liol0ili1oi != null) {
/* 16 */                return liol0ili1oi.I00000oIO;
                    }
/* 19 */            return null;
                }

                @Override
                public final String zzi() {
/* 7 */             lO0liIO0 lo0liio0 = ((l0olllO1i) this.I00000oOI.I00iOIl).I00ll1;
/* 9 */             l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 12 */            lIol0ili1Oi liol0ili1oi = lo0liio0.I00iiO;
/* 14 */            if (liol0ili1oi != null) {
/* 16 */                return liol0ili1oi.I00000oOI;
                    }
/* 19 */            return null;
                }

                @Override
                public final String zzj() {
/* 9 */             return (String) this.I00000oOI.I00io1l.get();
                }

                @Override
                public final String zzk() {
/* 3 */             return this.I00000oOI.I011IOil();
                }

                @Override
                public final long zzl() {
/* 3 */             lioil0ilIOi lioil0ilioi = this.I00000oIO.I00l0I0l0lO1;
/* 5 */             l0olllO1i.I0000oI00(lioil0ilioi);
/* 8 */             return lioil0ilioi.I01OIo();
                }
            }
