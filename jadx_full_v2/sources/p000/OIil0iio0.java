            package p000;

            import android.util.ArrayMap;
            import java.util.Collections;
            import java.util.Map;
            import java.util.Set;
            import java.util.TreeMap;
            
            public class OIil0iio0 implements IOlOo1ll1l1 {
                public static final I0oloIO0 I00iiI;
                public static final OIil0iio0 I00iiO;
                public final TreeMap I00iOIl;

                static {
/* 4 */             I0oloIO0 i0oloIO0 = new I0oloIO0(6);
/* 7 */             I00iiI = i0oloIO0;
/* 19 */            I00iiO = new OIil0iio0(new TreeMap(i0oloIO0));
                }

                public OIil0iio0(TreeMap treeMap) {
/* 4 */             this.I00iOIl = treeMap;
                }

                public static OIil0iio0 I0001Ioi1lo(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 11 */            if (OIil0iio0.class.equals(iOlOo1ll1l1.getClass())) {
/* 13 */                return (OIil0iio0) iOlOo1ll1l1;
                    }
/* 20 */            TreeMap treeMap = new TreeMap(I00iiI);
/* 35 */            for (I1ioiI i1ioiI : iOlOo1ll1l1.I0000Il00O()) {
/* 43 */                Set<IOlOo0> setI0000oI00 = iOlOo1ll1l1.I0000oI00(i1ioiI);
/* 49 */                ArrayMap arrayMap = new ArrayMap();
/* 60 */                for (IOlOo0 iOlOo0 : setI0000oI00) {
/* 72 */                    arrayMap.put(iOlOo0, iOlOo1ll1l1.I000II(i1ioiI, iOlOo0));
                        }
/* 76 */                treeMap.put(i1ioiI, arrayMap);
                    }
/* 82 */            return new OIil0iio0(treeMap);
                }

                @Override
                public final void I00000oIO(IIoIil iIoIil) {
/* 28 */            for (Map.Entry entry : this.I00iOIl.tailMap(I1ioiI.I00000oIO("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
/* 48 */                if (!((I1ioiI) entry.getKey()).I00000oIO.startsWith("camera2.captureRequest.option.")) {
/* 168 */                   return;
                        }
/* 55 */                I1ioiI i1ioiI = (I1ioiI) entry.getKey();
/* 59 */                O1OIll00i o1OIll00i = (O1OIll00i) iIoIil.I00iiI;
/* 63 */                IOlOo1ll1l1 iOlOo1ll1l1 = (IOlOo1ll1l1) iIoIil.I00iiO;
/* 77 */                ((OI0oiliol10O) o1OIll00i.I00iiI).I000lI(i1ioiI, iOlOo1ll1l1.I000OiO(i1ioiI), iOlOo1ll1l1.I0000O(i1ioiI));
                    }
                }

                @Override
                public final Object I00000oOI(I1ioiI i1ioiI, Object obj) {
/* 7 */             Map map = (Map) this.I00iOIl.get(i1ioiI);
                    return map == null ? obj : map.get((IOlOo0) Collections.min(map.keySet()));
                }

                @Override
                public final Set I0000Il00O() {
/* 7 */             return Collections.unmodifiableSet(this.I00iOIl.keySet());
                }

                @Override
                public final Object I0000O(I1ioiI i1ioiI) {
/* 7 */             Map map = (Map) this.I00iOIl.get(i1ioiI);
/* 9 */             if (map != null) {
/* 21 */                return map.get((IOlOo0) Collections.min(map.keySet()));
                    }
/* 28 */            IioIoO10iOiI.I000OiO("Option does not exist: ", i1ioiI);
/* 31 */            return null;
                }

                @Override
                public final Set I0000oI00(I1ioiI i1ioiI) {
/* 7 */             Map map = (Map) this.I00iOIl.get(i1ioiI);
                    return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
                }

                @Override
                public final Object I000II(I1ioiI i1ioiI, IOlOo0 iOlOo0) {
/* 7 */             Map map = (Map) this.I00iOIl.get(i1ioiI);
/* 12 */            if (map == null) {
/* 31 */                IioIoO10iOiI.I000OiO("Option does not exist: ", i1ioiI);
/* 9 */                 return null;
                    }
/* 18 */            if (map.containsKey(iOlOo0)) {
/* 20 */                return map.get(iOlOo0);
                    }
/* 27 */            OoOil11Ol1o.I0010o("Option does not exist: ", i1ioiI, " with priority=", iOlOo0);
/* 9 */             return null;
                }

                @Override
                public final boolean I000O01llI0(I1ioiI i1ioiI) {
/* 3 */             return this.I00iOIl.containsKey(i1ioiI);
                }

                @Override
                public final IOlOo0 I000OiO(I1ioiI i1ioiI) {
/* 7 */             Map map = (Map) this.I00iOIl.get(i1ioiI);
/* 9 */             if (map != null) {
/* 19 */                return (IOlOo0) Collections.min(map.keySet());
                    }
/* 24 */            IioIoO10iOiI.I000OiO("Option does not exist: ", i1ioiI);
/* 27 */            return null;
                }
            }
