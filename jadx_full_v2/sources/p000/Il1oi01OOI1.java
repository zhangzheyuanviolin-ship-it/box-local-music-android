            package p000;

            import java.util.Enumeration;
            import java.util.Hashtable;
            import java.util.Vector;
            
            public final class Il1oi01OOI1 extends I00IoO0 {
                public Hashtable I00iOIl;
                public Vector I00iiI;

                @Override
                public final I00OIO1 I0000O() {
/* 3 */             Vector vector = this.I00iiI;
/* 9 */             I00IOO i00ioo = new I00IOO(vector.size());
/* 12 */            Enumeration enumerationElements = vector.elements();
/* 20 */            while (enumerationElements.hasMoreElements()) {
/* 36 */                i00ioo.I0000O((Il1l1ooI) this.I00iOIl.get((I00O0i0ii) enumerationElements.nextElement()));
                    }
/* 43 */            Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(i00ioo, 0);
/* 47 */            ii0ol0ii01I.I00iio = -1;
/* 113 */           return ii0ol0ii01I;
                }
            }
