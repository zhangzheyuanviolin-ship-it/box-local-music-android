            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LI1liOl0;", "LO1oooooIio;", "LI1liOilllO;", "<init>", "()V", "foundation"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class I1liOl0 extends O1oooooIio {
                public I1liOilllO I00000oIO;
                public IOi10loi I00000oOI;

                @Override
                public final O1ooOo I000II() {
/* 3 */             return new I1liOilllO(this);
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
                }

                public final Object I000OOo1O(IOoilo iOoilo) {
/* 1 */             IOi10loi iOi10loi = this.I00000oOI;
/* 3 */             if (iOi10loi == null) {
/* 7 */                 iOi10loi = new IOi10loi();
/* 10 */                this.I00000oOI = iOi10loi;
/* 12 */                I1liOilllO i1liOilllO = this.I00000oIO;
/* 14 */                if (i1liOilllO != null && i1liOilllO.I00lll10) {
/* 20 */                    I1liOl0 i1liOl0 = i1liOilllO.I00o0l1o1o0;
/* 26 */                    I00o101lO i00o101lO = new I00o101lO(15);
/* 29 */                    i00o101lO.I00iiI = i1liOilllO;
/* 31 */                    i00o101lO.I00iiO = i1liOl0;
/* 33 */                    VarHandle.storeStoreFence();
/* 40 */                    i1liOilllO.I00o0iI0io1 = l1l0OIOOOo.I00000oIO(i1liOilllO, i00o101lO);
                        }
                    }
/* 42 */            Object objI0010o = iOi10loi.I0010o(iOoilo);
                    return objI0010o == Ii0111o.I00iOIl ? objI0010o : OoiIlOl1iI.I00000oIO;
                }

                public final boolean equals(Object obj) {
                    return obj == this;
                }

                public final int hashCode() {
/* 1 */             return 234;
                }
            }
