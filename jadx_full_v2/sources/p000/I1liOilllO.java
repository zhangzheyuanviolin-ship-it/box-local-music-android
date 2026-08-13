            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1liOilllO extends O1ooOo {
                public Oo10Oioll0 I00o0iI0io1;
                public final I1liOl0 I00o0l1o1o0;

                public I1liOilllO(I1liOl0 i1liOl0) {
/* 1 */             this.I00o0l1o1o0 = i1liOl0;
                }

                @Override
                public final void I010101Oo1lO() {
/* 1 */             I1liOl0 i1liOl0 = this.I00o0l1o1o0;
/* 3 */             i1liOl0.I00000oIO = this;
/* 7 */             if (i1liOl0.I00000oOI != null) {
/* 13 */                I00o101lO i00o101lO = new I00o101lO(15);
/* 16 */                i00o101lO.I00iiI = this;
/* 18 */                i00o101lO.I00iiO = i1liOl0;
/* 20 */                VarHandle.storeStoreFence();
/* 27 */                this.I00o0iI0io1 = l1l0OIOOOo.I00000oIO(this, i00o101lO);
                    }
                }

                @Override
                public final void I010I0() {
/* 1 */             I1liOl0 i1liOl0 = this.I00o0l1o1o0;
/* 6 */             if (i1liOl0.I00000oIO == this) {
/* 8 */                 i1liOl0.I00000oIO = null;
                    }
/* 10 */            Oo10Oioll0 oo10Oioll0 = this.I00o0iI0io1;
/* 12 */            if (oo10Oioll0 != null) {
/* 14 */                oo10Oioll0.I00000oOI();
                    }
/* 17 */            this.I00o0iI0io1 = null;
                }
            }
