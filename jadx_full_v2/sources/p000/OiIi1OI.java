            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.WeakHashMap;
            
            public final class OiIi1OI implements Iterable {
                public OiIi0Oilo I00iOIl;
                public OiIi0Oilo I00iiI;
                public final WeakHashMap I00iiO = new WeakHashMap();
                public int I00iio = 0;

                public final Object I00000oOI(Object obj, Object obj2) {
/* 1 */             OiIi0Oilo oiIi0Oilo = this.I00iOIl;
/* 3 */             while (oiIi0Oilo != null && !oiIi0Oilo.I00iOIl.equals(obj)) {
/* 14 */                oiIi0Oilo = oiIi0Oilo.I00iiO;
                    }
/* 17 */            if (oiIi0Oilo != null) {
/* 19 */                return oiIi0Oilo.I00iiI;
                    }
/* 24 */            OiIi0Oilo oiIi0Oilo2 = new OiIi0Oilo();
/* 27 */            oiIi0Oilo2.I00iOIl = obj;
/* 29 */            oiIi0Oilo2.I00iiI = obj2;
/* 31 */            VarHandle.storeStoreFence();
                    this.I00iio++;
/* 40 */            OiIi0Oilo oiIi0Oilo3 = this.I00iiI;
/* 42 */            if (oiIi0Oilo3 == null) {
/* 44 */                this.I00iOIl = oiIi0Oilo2;
/* 46 */                this.I00iiI = oiIi0Oilo2;
/* 55 */                return null;
                    }
/* 49 */            oiIi0Oilo3.I00iiO = oiIi0Oilo2;
/* 51 */            oiIi0Oilo2.I00iio = oiIi0Oilo3;
/* 53 */            this.I00iiI = oiIi0Oilo2;
/* 55 */            return null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
                
                    if (r1.hasNext() != false) goto L28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
                
                    if (((p000.OiIi0IIioO) r6).hasNext() != false) goto L28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
                
                    return true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
                
                    return false;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OiIi1OI)) {
/* 7 */                 return false;
                    }
/* 11 */            OiIi1OI oiIi1OI = (OiIi1OI) obj;
/* 17 */            if (this.I00iio != oiIi1OI.I00iio) {
/* 7 */                 return false;
                    }
/* 20 */            Iterator it = iterator();
/* 24 */            Iterator it2 = oiIi1OI.iterator();
                    while (true) {
/* 29 */                OiIi0IIioO oiIi0IIioO = (OiIi0IIioO) it;
/* 35 */                if (!oiIi0IIioO.hasNext()) {
                            break;
                        }
/* 38 */                OiIi0IIioO oiIi0IIioO2 = (OiIi0IIioO) it2;
/* 44 */                if (!oiIi0IIioO2.hasNext()) {
                            break;
                        }
/* 50 */                Map.Entry entry = (Map.Entry) oiIi0IIioO.next();
/* 52 */                Object next = oiIi0IIioO2.next();
/* 56 */                if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                            break;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             Iterator it = iterator();
/* 5 */             int iHashCode = 0;
                    while (true) {
/* 7 */                 OiIi0IIioO oiIi0IIioO = (OiIi0IIioO) it;
/* 13 */                if (!oiIi0IIioO.hasNext()) {
/* 55 */                    return iHashCode;
                        }
/* 25 */                iHashCode += ((Map.Entry) oiIi0IIioO.next()).hashCode();
                    }
                }

                @Override
                public final Iterator iterator() {
/* 3 */             OiIi0Oilo oiIi0Oilo = this.I00iOIl;
/* 5 */             OiIi0Oilo oiIi0Oilo2 = this.I00iiI;
/* 7 */             OiIi0IIioO oiIi0IIioO = new OiIi0IIioO();
/* 10 */            oiIi0IIioO.I00iOIl = oiIi0Oilo2;
/* 12 */            oiIi0IIioO.I00iiI = oiIi0Oilo;
/* 18 */            this.I00iiO.put(oiIi0IIioO, Boolean.FALSE);
/* 55 */            return oiIi0IIioO;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("[");
/* 8 */             Iterator it = iterator();
                    while (true) {
/* 13 */                OiIi0IIioO oiIi0IIioO = (OiIi0IIioO) it;
/* 19 */                if (!oiIi0IIioO.hasNext()) {
/* 48 */                    sb.append("]");
/* 51 */                    return sb.toString();
                        }
/* 31 */                sb.append(((Map.Entry) oiIi0IIioO.next()).toString());
/* 38 */                if (oiIi0IIioO.hasNext()) {
/* 42 */                    sb.append(", ");
                        }
                    }
                }
            }
