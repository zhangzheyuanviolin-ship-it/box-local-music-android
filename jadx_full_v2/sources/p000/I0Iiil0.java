            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            
            public final class I0Iiil0 implements IIllOo0 {
                public final IIllOo0 I00iOIl;
                public final I0IiOl1oIloO I00iiI;
                public final I0IiOl0 I00iiO;

                public I0Iiil0(IIllOo0 iIllOo0, I0IiOl1oIloO i0IiOl1oIloO) {
/* 4 */             this.I00iOIl = iIllOo0;
/* 6 */             this.I00iiI = i0IiOl1oIloO;
/* 8 */             IIlIi00 iIlIi00 = i0IiOl1oIloO.I00iiO;
/* 12 */            IIlO1O0lOl iIlO1O0lOlI000O01llI0 = iIllOo0.I000O01llI0();
/* 16 */            iIlIi00.I001IIilI0O();
/* 20 */            I0IiOl0 i0IiOl0 = new I0IiOl0(iIlO1O0lOlI000O01llI0, 0);
/* 23 */            i0IiOl0.I0000O = iIlO1O0lOlI000O01llI0;
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            this.I00iiO = i0IiOl0;
                }

                @Override
                public final ListenableFuture I00000oIO() {
/* 3 */             return this.I00iOIl.I00000oIO();
                }

                @Override
                public final IIlO1O0lOl I00000oOI() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final IIllOioOlolI I0000Il00O() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final OIOiOoiIil1I I0000O() {
/* 3 */             return this.I00iOIl.I0000O();
                }

                @Override
                public final void I0000oI00(Ool10o ool10o) {
/* 3 */             this.I00iOIl.I0000oI00(ool10o);
                }

                @Override
                public final boolean I0001Ioi1lo() {
/* 3 */             return this.I00iOIl.I0001Ioi1lo();
                }

                @Override
                public final void I000II(Ool10o ool10o) {
/* 3 */             this.I00iOIl.I000II(ool10o);
                }

                @Override
                public final IIlO1O0lOl I000O01llI0() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final IIlIi00 I000OOo1O() {
/* 3 */             return this.I00iOIl.I000OOo1O();
                }

                @Override
                public final void I000OiO(Ool10o ool10o) {
/* 3 */             this.I00iOIl.I000OiO(ool10o);
                }

                @Override
                public final void I000iOII(IIlIi00 iIlIi00) {
/* 3 */             this.I00iOIl.I000iOII(iIlIi00);
                }

                @Override
                public final void I000l1(boolean z) {
/* 3 */             this.I00iOIl.I000l1(z);
                }

                @Override
                public final boolean I000lI() {
/* 3 */             return this.I00iOIl.I000lI();
                }

                @Override
                public final void I000o00OoI0I(Collection collection) {
/* 3 */             this.I00iOIl.I000o00OoI0I(collection);
                }

                @Override
                public final void I000oI1ioi(ArrayList arrayList) {
/* 3 */             this.I00iOIl.I000oI1ioi(arrayList);
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 3 */             return this.I00iOIl.I00100o1O0lo();
                }

                @Override
                public final void I0010I0i(boolean z) {
/* 3 */             this.I00iOIl.I0010I0i(z);
                }

                @Override
                public final IIllOioOlolI I0010o() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final void I00111O(Ool10o ool10o) {
/* 3 */             this.I00iOIl.I00111O(ool10o);
                }
            }
