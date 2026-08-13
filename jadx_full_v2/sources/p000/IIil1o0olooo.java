            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.params.OutputConfiguration;
            import android.hardware.camera2.params.SessionConfiguration;
            import android.os.Build;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Map;
            
            public final class IIil1o0olooo {
                public Oo10IliO00O I00000oIO;
                public IIl01i0I I00000oOI;
                public IIl0oO I0000Il00O;
                public OOiOlo1l0I0o I0000O;
                public Oi00IilOloo0 I0000oI00;
                public Object I0001Ioi1lo;
                public LinkedHashSet I000II;

                /* JADX WARN: Removed duplicated region for block: B:106:0x0203  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x020f  */
                /* JADX WARN: Removed duplicated region for block: B:109:0x0212  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x0221  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x01cb  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x01ce  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IIliIi1O0OiO iIliIi1O0OiO, IOoilo iOoilo) throws Exception {
                    IIil1o iIil1o;
                    I0ii1OiO i0ii1OiO;
                    IIliIi1O0OiO iIliIi1O0OiO2;
                    SessionConfiguration sessionConfiguration;
                    OutputConfiguration outputConfiguration;
                    IIl0OIOoOl0 iIl0OIOoOl0;
                    CaptureRequest.Builder builderCreateCaptureRequest;
                    Integer num;
                    int i;
/* 3 */             IIliIi1O0OiO iIliIi1O0OiO3 = iIliIi1O0OiO;
/* 7 */             IIl01i0I iIl01i0I = this.I00000oOI;
/* 11 */            if (iOoilo instanceof IIil1o) {
/* 14 */                iIil1o = (IIil1o) iOoilo;
/* 16 */                int i2 = iIil1o.I00ilO0;
/* 22 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 25 */                    iIil1o.I00ilO0 = i2 - Integer.MIN_VALUE;
                        } else {
/* 30 */                    iIil1o = new IIil1o(this, iOoilo);
                        }
                    }
/* 33 */            Object objI00000oIO = iIil1o.I00iio;
/* 35 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 37 */            int i3 = iIil1o.I00ilO0;
/* 45 */            if (i3 == 0) {
/* 74 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 81 */                if (Build.VERSION.SDK_INT < 35) {
/* 85 */                    IOllOl1i1i iOllOl1i1i = new IOllOl1i1i();
/* 88 */                    iOllOl1i1i.I00000oIO = 0;
/* 90 */                    VarHandle.storeStoreFence();
/* 93 */                    return iOllOl1i1i;
                        }
/* 94 */                String str = iIliIi1O0OiO3.I00000oIO;
/* 96 */                iIil1o.I00iOIl = iIliIi1O0OiO3;
/* 98 */                iIil1o.I00ilO0 = 1;
/* 100 */               objI00000oIO = iIl01i0I.I00000oIO(str, iIil1o);
/* 104 */               if (objI00000oIO != ii0111o) {
                        }
/* 306 */               return ii0111o;
                    }
/* 47 */            if (i3 != 1) {
/* 49 */                if (i3 != 2) {
/* 64 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 42 */                    return null;
                        }
/* 51 */                sessionConfiguration = iIil1o.I00iiO;
/* 53 */                i0ii1OiO = iIil1o.I00iiI;
/* 55 */                iIliIi1O0OiO2 = iIil1o.I00iOIl;
/* 57 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 311 */               iIl0OIOoOl0 = (IIl0OIOoOl0) objI00000oIO;
/* 313 */               if (iIl0OIOoOl0 == null) {
/* 315 */                   int i4 = iIliIi1O0OiO2.I0001Ioi1lo;
/* 317 */                   String str2 = iIl0OIOoOl0.I00000oOI;
/* 319 */                   IIl0l10l iIl0l10l = iIl0OIOoOl0.I0000Il00O;
                            try {
/* 1 */                         builderCreateCaptureRequest = iIl0OIOoOl0.I00000oIO.createCaptureRequest(i4);
                            } catch (Exception e) {
/* 332 */                       if (e instanceof CameraAccessException) {
/* 352 */                           Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 355 */                           CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 357 */                           int reason = cameraAccessException.getReason();
/* 362 */                           boolean z = true;
/* 363 */                           if (reason != 1) {
/* 366 */                               if (reason == 2) {
/* 403 */                                   i = 6;
                                        } else if (reason == 3) {
/* 401 */                                   i = 0;
                                        } else if (reason == 4) {
/* 399 */                                   i = 1;
                                        } else if (reason != 5) {
/* 390 */                                   Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 393 */                                   i = 11;
                                        } else {
/* 397 */                                   i = 2;
                                        }
/* 395 */                               z = true;
                                    } else {
/* 405 */                               i = 3;
                                    }
/* 406 */                           iIl0l10l.I00000oIO(z, str2, i);
                                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
/* 451 */                           Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 457 */                           iIl0l10l.I00000oIO(false, str2, 9);
                                } else if (!(e instanceof IllegalStateException)) {
/* 432 */                           throw e;
                                }
                            }
                        } else {
/* 460 */                   builderCreateCaptureRequest = null;
                        }
/* 461 */               if (builderCreateCaptureRequest != null) {
/* 477 */                   for (Map.Entry entry : iIliIi1O0OiO2.I000II.entrySet()) {
/* 485 */                       Object key = entry.getKey();
/* 489 */                       Object value = entry.getValue();
/* 500 */                       CaptureRequest.Key key2 = key instanceof CaptureRequest.Key ? (CaptureRequest.Key) key : null;
/* 501 */                       if (key2 != null) {
/* 503 */                           builderCreateCaptureRequest.set(key2, value);
                                }
                            }
/* 511 */                   sessionConfiguration.setSessionParameters(builderCreateCaptureRequest.build());
                        }
/* 528 */               num = i0ii1OiO == null ? new Integer(i0ii1OiO.I00000oIO(sessionConfiguration).I00iOIl) : null;
/* 529 */               if (num != null) {
/* 548 */                   IOllOl1i1i iOllOl1i1i2 = new IOllOl1i1i();
/* 552 */                   iOllOl1i1i2.I00000oIO = 0;
/* 554 */                   VarHandle.storeStoreFence();
/* 900 */                   return iOllOl1i1i2;
                        }
/* 531 */               int iIntValue = num.intValue();
/* 537 */               IOllOl1i1i iOllOl1i1i3 = new IOllOl1i1i();
/* 540 */               iOllOl1i1i3.I00000oIO = iIntValue;
/* 542 */               VarHandle.storeStoreFence();
/* 545 */               return iOllOl1i1i3;
                    }
/* 68 */            iIliIi1O0OiO3 = iIil1o.I00iOIl;
/* 70 */            lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 108 */           I0ii1OiO i0ii1OiO2 = (I0ii1OiO) objI00000oIO;
/* 110 */           int i5 = iIliIi1O0OiO3.I000O01llI0;
/* 112 */           String str3 = iIliIi1O0OiO3.I00000oIO;
/* 114 */           if (i5 == 0) {
/* 116 */               i5 = 0;
                    } else if (i5 == 1) {
/* 120 */               i5 = 1;
                    } else if (i5 == 2) {
/* 144 */               Log.i("CXCP", "Unsupported session mode: " + ((Object) iOililO0i0.I00000oIO(iIliIi1O0OiO3.I000O01llI0)));
/* 149 */               IOllOl1i1i iOllOl1i1i4 = new IOllOl1i1i();
/* 152 */               iOllOl1i1i4.I00000oIO = 0;
/* 154 */               VarHandle.storeStoreFence();
/* 157 */               return iOllOl1i1i4;
                    }
/* 160 */           LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 165 */           Iterator it = iIliIi1O0OiO3.I00000oOI.iterator();
/* 173 */           while (it.hasNext()) {
/* 191 */               for (OIlI1io oIlI1io : ((IIo1lioOolol) it.next()).I00000oIO) {
/* 199 */                   int i6 = oIlI1io.I00000oOI;
/* 201 */                   String str4 = oIlI1io.I0000Il00O;
/* 253 */                   I0oiIOi00lo1 i0oiIOi00lo1I00000oIO = lo1iloiI1.I00000oIO(null, Integer.valueOf(i6), l1I0oI.I00l0I0l0lO1, oIlI1io.I0000O, oIlI1io.I0000oI00, oIlI1io.I0001Ioi1lo, oIlI1io.I000O01llI0, oIlI1io.I00000oIO, false, 0, !(str4 == null ? false : str4.equals(str3)) ? str4 : null, 1536);
/* 257 */                   if (i0oiIOi00lo1I00000oIO != null && (outputConfiguration = (OutputConfiguration) i0oiIOi00lo1I00000oIO.I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(OutputConfiguration.class))) != null) {
/* 275 */                       linkedHashSet.add(outputConfiguration);
                            }
                        }
                    }
/* 287 */           SessionConfiguration sessionConfigurationI000O01llI0 = I11OiIiiO.I000O01llI0(i5, IOOi0Ool1i.I00iIi0i1o(linkedHashSet));
/* 291 */           iIil1o.I00iOIl = iIliIi1O0OiO3;
/* 293 */           iIil1o.I00iiI = i0ii1OiO2;
/* 295 */           iIil1o.I00iiO = sessionConfigurationI000O01llI0;
/* 298 */           iIil1o.I00ilO0 = 2;
/* 300 */           Object objI00000oOI = iIl01i0I.I00000oOI(str3, iIil1o);
/* 304 */           if (objI00000oOI != ii0111o) {
/* 307 */               i0ii1OiO = i0ii1OiO2;
/* 308 */               objI00000oIO = objI00000oOI;
/* 309 */               iIliIi1O0OiO2 = iIliIi1O0OiO3;
/* 310 */               sessionConfiguration = sessionConfigurationI000O01llI0;
/* 311 */               iIl0OIOoOl0 = (IIl0OIOoOl0) objI00000oIO;
/* 313 */               if (iIl0OIOoOl0 == null) {
                        }
/* 461 */               if (builderCreateCaptureRequest != null) {
                        }
/* 528 */               if (i0ii1OiO == null) {
                        }
/* 529 */               if (num != null) {
                        }
                    }
/* 306 */           return ii0111o;
                }
            }
