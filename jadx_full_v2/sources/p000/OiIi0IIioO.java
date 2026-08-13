            package p000;

            import java.util.Iterator;
            
            public final class OiIi0IIioO extends OiIi1O implements Iterator {
                public OiIi0Oilo I00iOIl;
                public OiIi0Oilo I00iiI;

                @Override
                public final void I00000oIO(OiIi0Oilo oiIi0Oilo) {
/* 1 */             OiIi0Oilo oiIi0Oilo2 = this.I00iOIl;
/* 3 */             OiIi0Oilo oiIi0Oilo3 = null;
/* 4 */             if (oiIi0Oilo2 == oiIi0Oilo && oiIi0Oilo == this.I00iiI) {
/* 10 */                this.I00iiI = null;
/* 12 */                this.I00iOIl = null;
/* 14 */                oiIi0Oilo2 = null;
                    }
/* 15 */            OiIi0Oilo oiIi0Oilo4 = oiIi0Oilo2;
/* 16 */            if (oiIi0Oilo2 == oiIi0Oilo) {
/* 18 */                oiIi0Oilo4 = oiIi0Oilo2.I00iio;
/* 20 */                this.I00iOIl = oiIi0Oilo4;
                    }
/* 22 */            OiIi0Oilo oiIi0Oilo5 = this.I00iiI;
/* 24 */            if (oiIi0Oilo5 == oiIi0Oilo) {
/* 26 */                if (oiIi0Oilo5 != oiIi0Oilo4 && oiIi0Oilo4 != null) {
/* 31 */                    oiIi0Oilo3 = oiIi0Oilo5.I00iiO;
                        }
/* 33 */                this.I00iiI = oiIi0Oilo3;
                    }
                }

                @Override
                public final boolean hasNext() {
                    return this.I00iiI != null;
                }

                @Override
                public final Object next() {
/* 1 */             OiIi0Oilo oiIi0Oilo = this.I00iiI;
/* 3 */             OiIi0Oilo oiIi0Oilo2 = this.I00iOIl;
/* 14 */            this.I00iiI = (oiIi0Oilo == oiIi0Oilo2 || oiIi0Oilo2 == null) ? null : oiIi0Oilo.I00iiO;
/* 20 */            return oiIi0Oilo;
                }
            }
