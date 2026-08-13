            package p000;

            import android.os.Handler;
            import android.os.Trace;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Map;
            import java.util.Set;
            
            public final class I0oI01oi1Il implements IO0I000 {
                public Oo10IliO00O I00000oIO;
                public IIliIi1O0OiO I00000oOI;
                public OlOO00iI0lI I0000Il00O;
                public IIl0oO I0000O;

                @Override
                public final IO01oi0 I00000oIO(IIlOl1oOlo1o iIlOl1oOlo1o, Map map, IO0Il0o1OI iO0Il0o1OI) throws Exception {
                    IIioOlO0o1 iIioOlO0o1I00000oOI;
/* 1 */             IIliIi1O0OiO iIliIi1O0OiO = this.I00000oOI;
/* 7 */             if (iIliIi1O0OiO.I000O01llI0 != 2) {
/* 478 */               IoOOl0iOl1io.I000o00OoI0I(iOililO0i0.I00000oIO(this.I00000oOI.I000O01llI0), "Unsupported session mode: ", " for Extension CameraGraph");
/* 6 */                 return null;
                    }
/* 13 */            Object obj = iIliIi1O0OiO.I000II.get(IIloiOIOoo.I00000oIO);
/* 24 */            Integer num = obj instanceof Integer ? (Integer) obj : null;
/* 25 */            if (num == null) {
/* 462 */               I000II.I001IO000("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
/* 6 */                 return null;
                    }
/* 27 */            int iIntValue = num.intValue();
/* 35 */            if (this.I00000oOI.I0000O != null) {
/* 456 */               I000II.I001IO000("Reprocessing is not supported for Extensions");
/* 6 */                 return null;
                    }
/* 47 */            IIioli iIioli = (IIioli) this.I0000O.I00000oIO(iIlOl1oOlo1o.I000l1());
/* 55 */            Set set = (Set) iIioli.I00io1l.getValue();
/* 65 */            if (!set.contains(Integer.valueOf(iIntValue))) {
/* 97 */                Log.w("CXCP", iIlOl1oOlo1o + " does not support extension mode " + iIntValue + ". Supported extensions are " + set);
                    }
/* 105 */           if (this.I00000oOI.I0000oI00 != null) {
                        synchronized (iIioli.I00ilO0) {
/* 120 */                   iIioOlO0o1I00000oOI = (IIioOlO0o1) iIioli.I00ilO0.get(Integer.valueOf(iIntValue));
                        }
/* 123 */               if (iIioOlO0o1I00000oOI == null) {
/* 126 */                   IIl0oO iIl0oO = iIioli.I00iiO;
/* 128 */                   String str = iIioli.I00iOIl;
                            try {
/* 151 */                       Trace.beginSection(((Object) IIllI0o.I0000Il00O(str)) + "#awaitExtensionMetadata");
                                synchronized (iIl0oO.I0001Ioi1lo) {
/* 163 */                           IIioOlO0o1 iIioOlO0o1I00000oOI2 = (IIioOlO0o1) iIl0oO.I0001Ioi1lo.get(str);
/* 165 */                           if (iIioOlO0o1I00000oOI2 != null) {
/* 168 */                               iIioOlO0o1I00000oOI = iIioOlO0o1I00000oOI2;
                                    } else if (iIl0oO.I0000oI00()) {
/* 190 */                               iIioOlO0o1I00000oOI = iIl0oO.I00000oOI(true, str, iIntValue);
                                    } else {
/* 177 */                               iIioOlO0o1I00000oOI2 = iIl0oO.I00000oOI(false, str, iIntValue);
/* 183 */                               iIl0oO.I0001Ioi1lo.put(str, iIioOlO0o1I00000oOI2);
/* 168 */                               iIioOlO0o1I00000oOI = iIioOlO0o1I00000oOI2;
                                    }
                                }
/* 195 */                       Trace.endSection();
                                synchronized (iIioli.I00ilO0) {
/* 207 */                           iIioli.I00ilO0.put(Integer.valueOf(iIntValue), iIioOlO0o1I00000oOI);
                                }
                            } catch (Throwable th) {
/* 272 */                       Trace.endSection();
/* 275 */                       throw th;
                            }
                        }
/* 223 */               if (!((Boolean) iIioOlO0o1I00000oOI.I00iio.getValue()).booleanValue()) {
/* 244 */                   Log.w("CXCP", iIlOl1oOlo1o + " does not support Postview streams");
                        }
/* 257 */               if (this.I00000oOI.I0000oI00.I00000oIO.size() != 1) {
/* 262 */                   I000II.I001IO000("Postview streams can only have one OutputStream.config object");
/* 6 */                     return null;
                        }
                    }
/* 283 */           OIl1Oli oIl1OliI00000oIO = iOl0ll0OI1II.I00000oIO(this.I00000oOI, this.I0000Il00O, map);
/* 293 */           if (oIl1OliI00000oIO.I00000oIO.isEmpty()) {
/* 313 */               Log.w("CXCP", "Failed to create OutputConfigurations for " + this.I00000oOI);
/* 316 */               iO0Il0o1OI.I00000oIO();
/* 319 */               return loilIl10Ii.I00iiO;
                    }
/* 328 */           if (!oIl1OliI00000oIO.I00000oOI.isEmpty()) {
/* 450 */               I000II.I001IO000("Deferred output is not supported for Extensions");
/* 6 */                 return null;
                    }
/* 332 */           Il1oI0O il1oI0O = new Il1oI0O();
/* 335 */           il1oI0O.I00000oIO = iO0Il0o1OI;
/* 337 */           VarHandle.storeStoreFence();
/* 342 */           ArrayList arrayList = oIl1OliI00000oIO.I00000oIO;
/* 348 */           Handler handlerI00000oIO = this.I00000oIO.I00000oIO();
/* 352 */           II0l011 iI0l011 = new II0l011(1);
/* 355 */           iI0l011.I00iiI = handlerI00000oIO;
/* 357 */           VarHandle.storeStoreFence();
/* 360 */           IIliIi1O0OiO iIliIi1O0OiO2 = this.I00000oOI;
/* 362 */           int i = iIliIi1O0OiO2.I0001Ioi1lo;
/* 364 */           Map map2 = iIliIi1O0OiO2.I000II;
/* 366 */           Integer numValueOf = Integer.valueOf(iIntValue);
/* 370 */           I0oiIOi00lo1 i0oiIOi00lo1 = oIl1OliI00000oIO.I0000Il00O;
/* 372 */           Il1o1i1I1I il1o1i1I1I = new Il1o1i1I1I();
/* 375 */           il1o1i1I1I.I00000oIO = arrayList;
/* 377 */           il1o1i1I1I.I00000oOI = iI0l011;
/* 379 */           il1o1i1I1I.I0000Il00O = iO0Il0o1OI;
/* 381 */           il1o1i1I1I.I0000O = i;
/* 383 */           il1o1i1I1I.I0000oI00 = map2;
/* 385 */           il1o1i1I1I.I0001Ioi1lo = numValueOf;
/* 387 */           il1o1i1I1I.I000II = il1oI0O;
/* 389 */           il1o1i1I1I.I000O01llI0 = i0oiIOi00lo1;
/* 391 */           VarHandle.storeStoreFence();
/* 398 */           if (iIlOl1oOlo1o.I00lll10(il1o1i1I1I)) {
/* 444 */               return new IO01oi(oIl1OliI00000oIO.I00000oOI, oIl1OliI00000oIO.I0000O);
                    }
/* 429 */           Log.w("CXCP", "Failed to create ExtensionCaptureSession from " + iIlOl1oOlo1o + " for " + iO0Il0o1OI + '!');
/* 432 */           iO0Il0o1OI.I00000oIO();
/* 435 */           return loilIl10Ii.I00iiO;
                }
            }
