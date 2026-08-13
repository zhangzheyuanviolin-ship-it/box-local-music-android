            package p000;

            import java.util.Iterator;
            
            public final class OiIi0lIOl extends OiIi1O implements Iterator {
                public OiIi0Oilo I00iOIl;
                public boolean I00iiI;
                public OiIi1OI I00iiO;

                @Override
                public final void I00000oIO(OiIi0Oilo oiIi0Oilo) {
/* 1 */             OiIi0Oilo oiIi0Oilo2 = this.I00iOIl;
/* 3 */             if (oiIi0Oilo == oiIi0Oilo2) {
/* 5 */                 OiIi0Oilo oiIi0Oilo3 = oiIi0Oilo2.I00iio;
/* 7 */                 this.I00iOIl = oiIi0Oilo3;
/* 14 */                this.I00iiI = oiIi0Oilo3 == null;
                    }
                }

                @Override
                public final boolean hasNext() {
/* 3 */             if (this.I00iiI) {
                        return this.I00iiO.I00iOIl != null;
                    }
/* 12 */            OiIi0Oilo oiIi0Oilo = this.I00iOIl;
                    return (oiIi0Oilo == null || oiIi0Oilo.I00iiO == null) ? false : true;
                }

                @Override
                public final Object next() {
/* 3 */             if (this.I00iiI) {
/* 6 */                 this.I00iiI = false;
/* 10 */                OiIi0Oilo oiIi0Oilo = this.I00iiO.I00iOIl;
/* 12 */                this.I00iOIl = oiIi0Oilo;
/* 14 */                return oiIi0Oilo;
                    }
/* 15 */            OiIi0Oilo oiIi0Oilo2 = this.I00iOIl;
/* 22 */            OiIi0Oilo oiIi0Oilo3 = oiIi0Oilo2 != null ? oiIi0Oilo2.I00iiO : null;
/* 23 */            this.I00iOIl = oiIi0Oilo3;
/* 55 */            return oiIi0Oilo3;
                }
            }
