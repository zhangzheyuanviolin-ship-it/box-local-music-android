            package p000;
            
            public final class Olio11 implements Runnable {
                public OlioOil I00iOIl;
                public int I00iiI;
                public int I00iiO;

                @Override
                public final void run() {
                    boolean z;
/* 1 */             OlioOil olioOil = this.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 5 */             int i2 = this.I00iiO;
/* 9 */             boolean z2 = true;
/* 10 */            if (olioOil.I000OOo1O != i) {
/* 12 */                olioOil.I000OOo1O = i;
/* 14 */                z = true;
                    } else {
/* 16 */                z = false;
                    }
/* 19 */            if (olioOil.I000O01llI0 != i2) {
/* 21 */                olioOil.I000O01llI0 = i2;
                    } else {
/* 24 */                z2 = z;
                    }
/* 25 */            if (z2) {
/* 27 */                olioOil.I0001Ioi1lo();
                    }
                }
            }
