            package p000;

            import java.io.Closeable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.UUID;
            import java.util.WeakHashMap;
            
            public abstract class o0I0o10l0Oo1 {
                public static final WeakHashMap I00000oIO = new WeakHashMap();
                public static final WeakHashMap I00000oOI = new WeakHashMap();

                public static void I00000oIO(Throwable th) {
                    Throwable cause;
                    iOl0lOIi11 iol0loii11;
                    Closeable closeable;
/* 1 */             WeakHashMap weakHashMap = I00000oOI;
                    synchronized (weakHashMap) {
/* 4 */                 cause = th;
/* 5 */                 while (cause != null) {
                            try {
/* 11 */                        if (weakHashMap.containsKey(cause)) {
                                    break;
                                } else {
/* 13 */                            cause = cause.getCause();
                                }
                            } finally {
                            }
                        }
/* 32 */                weakHashMap.put(th, Boolean.valueOf(cause != null));
                    }
/* 36 */            if (cause != null) {
/* 312 */               return;
                    }
/* 40 */            WeakHashMap weakHashMap2 = I00000oIO;
                    synchronized (weakHashMap2) {
/* 43 */                Throwable cause2 = th;
/* 44 */                while (cause2 != null) {
                            try {
/* 50 */                        if (weakHashMap2.containsKey(cause2)) {
                                    break;
                                } else {
/* 52 */                            cause2 = cause2.getCause();
                                }
                            } finally {
                            }
                        }
/* 60 */                if (cause2 == null) {
/* 63 */                    iol0loii11 = null;
                        } else {
/* 71 */                    weakHashMap2.put(th, (o01l1oO11i) weakHashMap2.get(cause2));
/* 79 */                    iol0loii11 = new iOl0lOIi11(28);
                        }
                    }
/* 82 */            if (iol0loii11 != null || (closeable = o0IOOIili01o.I0000Il00O().I00000oOI) == null) {
/* 312 */               return;
                    }
/* 94 */            ArrayList arrayList = new ArrayList();
/* 97 */            for (closeable = o0IOOIili01o.I0000Il00O().I00000oOI; closeable != null; closeable = ((o01iIll0IO) closeable).I00iOIl) {
/* 99 */                arrayList.add(closeable);
                    }
/* 109 */           o01l00lil o01l00lilVar = new o01l00lil();
/* 120 */           UUID uuid = ((o01iIll0IO) ((o0OllIoI) arrayList.get(0))).I00iiI;
/* 122 */           if (uuid == null) {
/* 309 */               IOOlIIilOl0.I000II("Null rootTraceId");
/* 312 */               return;
                    }
/* 124 */           o01l00lilVar.I0000Il00O = uuid;
/* 132 */           ((o0OllIoI) arrayList.get(0)).getClass();
/* 137 */           o01l00lilVar.I0000O = -1L;
/* 139 */           o01l00lilVar.I0000oI00 = (byte) 1;
/* 141 */           int size = arrayList.size();
/* 145 */           IoilOOi ioilOOi = IoillO0OOoo.I00iiI;
/* 149 */           ii1oO1IOiI1o.I00000oIO(size, "expectedSize");
/* 154 */           ii1oO1IOiI1o.I00000oIO(size, "initialCapacity");
/* 157 */           Object[] objArrCopyOf = new Object[size];
/* 159 */           int size2 = arrayList.size();
/* 165 */           ii1oO1IOiI1o.I00000oIO(size2, "expectedSize");
/* 170 */           ii1oO1IOiI1o.I00000oIO(size2, "initialCapacity");
/* 173 */           Object[] objArrCopyOf2 = new Object[size2];
/* 183 */           int i = 0;
/* 184 */           boolean z = false;
/* 185 */           int i2 = 0;
/* 186 */           boolean z2 = false;
/* 191 */           for (o0OllIoI o0ollioi : l10oOI1I1o.I00000oIO(arrayList)) {
/* 202 */               String str = ((o01iIll0IO) o0ollioi).I00iio;
/* 204 */               str.getClass();
/* 210 */               int iI000II = IoilIilo.I000II(objArrCopyOf2.length, i2 + 1);
/* 215 */               if (iI000II > objArrCopyOf2.length || z2) {
/* 219 */                   objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iI000II);
/* 223 */                   z2 = false;
                        }
/* 224 */               int i3 = i2 + 1;
/* 226 */               objArrCopyOf2[i2] = str;
/* 228 */               o0OOOlI o0oooliZzh = o0ollioi.zzh();
/* 232 */               o0oooliZzh.getClass();
/* 238 */               int iI000II2 = IoilIilo.I000II(objArrCopyOf.length, i + 1);
/* 243 */               if (iI000II2 > objArrCopyOf.length || z) {
/* 247 */                   objArrCopyOf = Arrays.copyOf(objArrCopyOf, iI000II2);
/* 251 */                   z = false;
                        }
/* 254 */               objArrCopyOf[i] = o0oooliZzh;
/* 252 */               i++;
/* 257 */               i2 = i3;
                    }
/* 259 */           WeakHashMap weakHashMap3 = I00000oIO;
                    synchronized (weakHashMap3) {
                        try {
/* 262 */                   OOol0l1I1 oOol0l1I1I000lI = IoillO0OOoo.I000lI(i2, objArrCopyOf2);
/* 266 */                   if (oOol0l1I1I000lI == null) {
/* 304 */                       throw new NullPointerException("Null spansNames");
                            }
/* 268 */                   o01l00lilVar.I00000oIO = oOol0l1I1I000lI;
/* 270 */                   OOol0l1I1 oOol0l1I1I000lI2 = IoillO0OOoo.I000lI(i, objArrCopyOf);
/* 274 */                   if (oOol0l1I1I000lI2 == null) {
/* 296 */                       throw new NullPointerException("Null extras");
                            }
/* 276 */                   o01l00lilVar.I00000oOI = oOol0l1I1I000lI2;
/* 282 */                   weakHashMap3.put(th, o01l00lilVar.I00000oIO());
                        } finally {
                        }
                    }
                }
            }
