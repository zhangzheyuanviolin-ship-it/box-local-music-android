            package p000;

            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            
            public final class iii1IlooII extends iiOoioO implements Serializable {
                public transient iI0iIIo I00iio;
                public transient int I00ilI0I1;

                public iii1IlooII() {
/* 4 */             iI0iIIo ii0iiio = new iI0iIIo(6);
/* 14 */            if (ii0iiio.isEmpty()) {
/* 16 */                this.I00iio = ii0iiio;
                    } else {
/* 19 */                OIiilo1Ool0o.I00100o1O0lo();
/* 55 */                throw null;
                    }
                }

                public final void I0000Il00O() {
/* 1 */             iI0iIIo ii0iiio = this.I00iio;
/* 7 */             Iterator it = ii0iiio.values().iterator();
/* 15 */            while (it.hasNext()) {
/* 23 */                ((Collection) it.next()).clear();
                    }
/* 27 */            ii0iiio.clear();
/* 31 */            this.I00ilI0I1 = 0;
                }

                public final boolean I0000O(Object obj, Object obj2) {
/* 1 */             iI0iIIo ii0iiio = this.I00iio;
/* 7 */             Collection collection = (Collection) ii0iiio.get(obj);
/* 11 */            if (collection != null) {
/* 44 */                if (!collection.add(obj2)) {
/* 9 */                     return false;
                        }
                        this.I00ilI0I1++;
/* 10 */                return true;
                    }
/* 16 */            ArrayList arrayList = new ArrayList(3);
/* 23 */            if (!arrayList.add(obj2)) {
/* 36 */                I000II.I000O01llI0("New Collection violated the Collection spec");
/* 9 */                 return false;
                    }
                    this.I00ilI0I1++;
/* 30 */            ii0iiio.put(obj, arrayList);
/* 10 */            return true;
                }
            }
