            package p000;

            import android.content.Context;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.params.StreamConfigurationMap;
            import android.os.Build;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            public final class IIoI00I00I implements IoolOI {
                public Context I00000oIO;
                public Ii10Ioo00l I00000oOI;
                public Object I0000Il00O;
                public Map I0000O;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v6, types: [loilIl10Ii] */
                /* JADX WARN: Type inference failed for: r10v7, types: [IlIIIi] */
                /* JADX WARN: Type inference failed for: r10v8, types: [IOO000ilo] */
                @Override
                public final void I00000oIO(List list) throws NumberFormatException, IIoIIIiillO {
                    List<String> listI00iIi0i1o;
                    boolean z;
                    int i;
                    ?? iOO000ilo;
                    synchronized (this.I0000Il00O) {
/* 5 */                 List list2 = list;
/* 9 */                 Set setKeySet = this.I0000O.keySet();
/* 17 */                if (!(setKeySet instanceof Collection)) {
/* 22 */                    setKeySet = IOOi0Ool1i.I00iIi0i1o(setKeySet);
                        }
/* 19 */                Collection collection = setKeySet;
/* 31 */                if (collection.isEmpty()) {
/* 33 */                    listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(list2);
                        } else {
/* 40 */                    ArrayList arrayList = new ArrayList();
/* 51 */                    for (Object obj : list2) {
/* 61 */                        if (!collection.contains(obj)) {
/* 63 */                            arrayList.add(obj);
                                }
                            }
/* 67 */                    listI00iIi0i1o = arrayList;
                        }
                    }
/* 77 */            if (!listI00iIi0i1o.isEmpty() && l11I11lO.I0000O(3, "CXCP")) {
/* 87 */                listI00iIi0i1o.toString();
                    }
/* 90 */            Ii10Ioo00l ii10Ioo00l = this.I00000oOI;
/* 94 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 101 */           if (!listI00iIi0i1o.isEmpty()) {
                        try {
/* 113 */                   for (String str : listI00iIi0i1o) {
/* 121 */                       IIlOlol0liO iIlOlol0liOI00000oIO = ii10Ioo00l.I00000oIO();
/* 125 */                       IIllI0o.I00000oOI(str);
/* 134 */                       IIlo0i0ll iIlo0i0llI00000oIO = iIlOlol0liOI00000oIO.I0000Il00O().I0000Il00O.I00000oIO(str);
/* 161 */                       IIo0OlO iIo0OlO = new IIo0OlO(iIlo0i0llI00000oIO, new OlOIOo0((StreamConfigurationMap) ((IIioli) iIlo0i0llI00000oIO).I0000O(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP), new OIl1o01(iIlo0i0llI00000oIO)));
/* 166 */                       Context context = this.I00000oIO;
/* 170 */                       OOil0lI oOil0lII00000oIO = iIo0OlO.I00000oIO();
/* 174 */                       Il0IIO il0IIO = new Il0IIO();
/* 177 */                       il0IIO.I00000oOI = str;
/* 179 */                       il0IIO.I0000Il00O = oOil0lII00000oIO;
/* 186 */                       il0IIO.I0001Ioi1lo = new LinkedHashMap();
                                try {
/* 188 */                           i = Integer.parseInt(str);
/* 192 */                           z = true;
                                } catch (NumberFormatException unused) {
/* 217 */                           l11I11lO.I0000oI00("EncoderProfilesProviderAdapter", "Camera id is not an integer:  " + il0IIO.I00000oOI + ", unable to create EncoderProfilesProviderAdapter.");
/* 220 */                           z = false;
/* 221 */                           i = -1;
                                }
/* 222 */                       il0IIO.I0000O = z;
/* 224 */                       il0IIO.I0000oI00 = i;
/* 226 */                       VarHandle.storeStoreFence();
/* 233 */                       if (Build.VERSION.SDK_INT >= 35) {
/* 241 */                           IIloOiil iIloOiil = (IIloOiil) ii10Ioo00l.I00000oIO.I00iio;
/* 245 */                           iOO000ilo = new IOO000ilo(15);
/* 248 */                           iOO000ilo.I00iiI = iIlo0i0llI00000oIO;
/* 250 */                           iOO000ilo.I00iiO = iIloOiil;
/* 252 */                           iOO000ilo.I00iio = iIo0OlO;
/* 254 */                           VarHandle.storeStoreFence();
                                } else {
/* 258 */                           iOO000ilo = IlIIIi.I00100l0;
                                }
/* 263 */                       linkedHashMap.put(str, new OlilioIoO11(context, iIlo0i0llI00000oIO, il0IIO, iOO000ilo));
                            }
                        } catch (Exception e) {
/* 340 */                   throw new IIoIIIiillO("Failed to build surface combinations", e);
                        }
                    }
                    synchronized (this.I0000Il00O) {
                        try {
/* 273 */                   LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 276 */                   Iterator it = list.iterator();
/* 284 */                   while (it.hasNext()) {
/* 290 */                       String str2 = (String) it.next();
/* 298 */                       if (this.I0000O.containsKey(str2)) {
/* 306 */                           linkedHashMap2.put(str2, this.I0000O.get(str2));
                                }
                            }
/* 312 */                   linkedHashMap2.putAll(linkedHashMap);
/* 315 */                   this.I0000O = linkedHashMap2;
/* 323 */                   if (l11I11lO.I0000O(3, "CXCP")) {
/* 325 */                       linkedHashMap2.size();
                            }
                        } catch (Throwable th) {
/* 331 */                   throw th;
                        }
                    }
                }
            }
