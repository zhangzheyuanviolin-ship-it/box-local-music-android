            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IiI1li implements IIiOOIoi0 {
                public IiI1oOoo I00iOIl;
                public int I00iiI;
                public int I00iiO;

                @Override
                public final Object attachCompleter(IIiOOI iIiOOI) {
/* 1 */             IiI1oOoo iiI1oOoo = this.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 5 */             int i2 = this.I00iiO;
/* 9 */             I1ioiIOl0 i1ioiIOl0 = new I1ioiIOl0();
/* 12 */            i1ioiIOl0.I00000oIO = i;
/* 14 */            i1ioiIOl0.I00000oOI = i2;
/* 16 */            i1ioiIOl0.I0000Il00O = iIiOOI;
/* 18 */            VarHandle.storeStoreFence();
/* 25 */            I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(23);
/* 28 */            i0iOo0oioiO.I00iiI = iiI1oOoo;
/* 30 */            i0iOo0oioiO.I00iiO = i1ioiIOl0;
/* 32 */            VarHandle.storeStoreFence();
/* 39 */            I0100i i0100i = new I0100i(17);
/* 42 */            i0100i.I00iiI = iIiOOI;
/* 44 */            VarHandle.storeStoreFence();
/* 47 */            iiI1oOoo.I0001Ioi1lo(i0iOo0oioiO, i0100i);
/* 50 */            return "DefaultSurfaceProcessor#snapshot";
                }
            }
