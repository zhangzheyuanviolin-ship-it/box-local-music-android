            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.jvm.functions.Function3;
            
            public final class OI1I0II implements IIoOo1iIio1l, OoooliO1IoI1 {
                public IIoOoIol0Io0 I00iOIl;
                public OI1I0OoOl I00iiI;

                @Override
                public final void I00000oIO(Oii1O0I oii1O0I, int i) {
/* 3 */             this.I00iOIl.I00000oIO(oii1O0I, i);
                }

                @Override
                public final boolean I0000O(Throwable th) {
/* 3 */             return this.I00iOIl.I0000O(th);
                }

                @Override
                public final I0OooiI1I I000OOo1O(Object obj, Function3 function3) {
/* 3 */             IIoOoIol0Io0 iIoOoIol0Io0 = this.I00iOIl;
/* 5 */             OI1I0OoOl oI1I0OoOl = this.I00iiI;
/* 11 */            I0iII1i10I i0iII1i10I = new I0iII1i10I(14);
/* 14 */            i0iII1i10I.I00iiI = oI1I0OoOl;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            I0OooiI1I i0OooiI1II00II0oii1o = iIoOoIol0Io0.I00II0oii1o((OoiIlOl1iI) obj, i0iII1i10I);
/* 23 */            if (i0OooiI1II00II0oii1o != null) {
/* 28 */                OI1I0OoOl.I000OOo1O.set(oI1I0OoOl, null);
                    }
/* 89 */            return i0OooiI1II00II0oii1o;
                }

                @Override
                public final void I000OiO(Object obj, Function3 function3) throws IiiI1OOll0l1 {
/* 1 */             AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OI1I0OoOl.I000OOo1O;
/* 3 */             OI1I0OoOl oI1I0OoOl = this.I00iiI;
/* 6 */             atomicReferenceFieldUpdater.set(oI1I0OoOl, null);
/* 9 */             IIoOoIol0Io0 iIoOoIol0Io0 = this.I00iOIl;
/* 15 */            O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(23);
/* 18 */            o0l0IlolloIO.I00iiI = oI1I0OoOl;
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            int i = iIoOoIol0Io0.I00iiO;
/* 28 */            I0iII1i10I i0iII1i10I = new I0iII1i10I(4);
/* 31 */            i0iII1i10I.I00iiI = o0l0IlolloIO;
/* 33 */            VarHandle.storeStoreFence();
/* 38 */            iIoOoIol0Io0.I001lllioOl(OoiIlOl1iI.I00000oIO, i, i0iII1i10I);
                }

                @Override
                public final void I000oI1ioi(Object obj) {
/* 3 */             this.I00iOIl.I000oI1ioi(obj);
                }

                @Override
                public final Ii00l101O getContext() {
/* 3 */             return this.I00iOIl.I00ilI0I1;
                }

                @Override
                public final void resumeWith(Object obj) {
/* 3 */             this.I00iOIl.resumeWith(obj);
                }
            }
