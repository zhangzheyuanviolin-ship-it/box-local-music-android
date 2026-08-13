            package p000;

            import android.hardware.camera2.params.DynamicRangeProfiles;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Set;
            
            public abstract class IioI0IoOi {
                public static final LinkedHashMap I00000oIO;
                public static final LinkedHashMap I00000oOI;

                static {
                    Iio1oiI iio1oiI;
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 6 */             I00000oIO = linkedHashMap;
/* 10 */            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 13 */            I00000oOI = linkedHashMap2;
/* 21 */            Iio1oiI iio1oiI2 = Iio1oiI.I0000O;
/* 23 */            linkedHashMap.put(1L, iio1oiI2);
/* 30 */            linkedHashMap2.put(iio1oiI2, Collections.singletonList(1L));
/* 41 */            linkedHashMap.put(2L, Iio1oiI.I0000oI00);
/* 52 */            linkedHashMap2.put(linkedHashMap.get(2L), Collections.singletonList(2L));
/* 61 */            Iio1oiI iio1oiI3 = Iio1oiI.I0001Ioi1lo;
/* 63 */            linkedHashMap.put(4L, iio1oiI3);
/* 70 */            linkedHashMap2.put(iio1oiI3, Collections.singletonList(4L));
/* 79 */            Iio1oiI iio1oiI4 = Iio1oiI.I000II;
/* 81 */            linkedHashMap.put(8L, iio1oiI4);
/* 88 */            linkedHashMap2.put(iio1oiI4, Collections.singletonList(8L));
/* 119 */           List listI000O01llI0 = IOOi1I.I000O01llI0(64L, 128L, 16L, 32L);
/* 123 */           Iterator it = listI000O01llI0.iterator();
                    while (true) {
/* 127 */               boolean zHasNext = it.hasNext();
/* 131 */               iio1oiI = Iio1oiI.I000O01llI0;
/* 133 */               if (!zHasNext) {
                            break;
                        }
/* 151 */               I00000oIO.put(Long.valueOf(((Number) it.next()).longValue()), iio1oiI);
                    }
/* 157 */           I00000oOI.put(iio1oiI, listI000O01llI0);
/* 188 */           List listI000O01llI02 = IOOi1I.I000O01llI0(1024L, 2048L, 256L, 512L);
/* 192 */           Iterator it2 = listI000O01llI02.iterator();
                    while (true) {
/* 196 */               boolean zHasNext2 = it2.hasNext();
/* 200 */               Iio1oiI iio1oiI5 = Iio1oiI.I000OOo1O;
/* 202 */               if (!zHasNext2) {
/* 226 */                   I00000oOI.put(iio1oiI5, listI000O01llI02);
/* 245 */                   return;
                        } else {
/* 220 */                   I00000oIO.put(Long.valueOf(((Number) it2.next()).longValue()), iio1oiI5);
                        }
                    }
                }

                public static Long I00000oIO(Iio1oiI iio1oiI, DynamicRangeProfiles dynamicRangeProfiles) {
/* 7 */             List list = (List) I00000oOI.get(iio1oiI);
/* 9 */             if (list == null) {
/* 50 */                return null;
                    }
/* 11 */            Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
/* 15 */            Iterator it = list.iterator();
/* 23 */            while (it.hasNext()) {
/* 31 */                long jLongValue = ((Number) it.next()).longValue();
/* 43 */                if (supportedProfiles.contains(Long.valueOf(jLongValue))) {
/* 45 */                    return Long.valueOf(jLongValue);
                        }
                    }
/* 50 */            return null;
                }
            }
