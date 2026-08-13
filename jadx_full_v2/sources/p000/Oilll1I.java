            package p000;

            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class Oilll1I implements OilloOil0 {
                public final AtomicBoolean I00000oIO = new AtomicBoolean(false);
                public final OilloOil0 I00000oOI;

                public Oilll1I(OilloOil0 oilloOil0) {
/* 12 */            this.I00000oOI = oilloOil0;
                }

                @Override
                public final void I00000oIO(OillooOlI oillooOlI) {
/* 7 */             if (this.I00000oIO.get()) {
/* 29 */                return;
                    }
/* 11 */            this.I00000oOI.I00000oIO(oillooOlI);
                }

                public final void I00000oOI() {
/* 4 */             this.I00000oIO.set(true);
                }
            }
