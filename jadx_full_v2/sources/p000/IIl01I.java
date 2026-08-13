            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CameraManager;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class IIl01I extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final String I00iiI;
                public final IIl01i0I I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIl01I(String str, IIl01i0I iIl01i0I, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = str;
/* 5 */             this.I00iiO = iIl01i0I;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IIl01i0I iIl01i0I = this.I00iiO;
/* 5 */             String str = this.I00iiI;
                    switch (i) {
                        case 0:
/* 20 */                    return new IIl01I(str, iIl01i0I, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new IIl01I(str, iIl01i0I, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((IIl01I) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Exception {
                    Boolean boolValueOf;
                    int i;
                    CameraDevice.CameraDeviceSetup cameraDeviceSetup;
/* 3 */             int i2 = this.I00iOIl;
/* 5 */             IIl01i0I iIl01i0I = this.I00iiO;
/* 7 */             String str = this.I00iiI;
/* 13 */            int i3 = 3;
                    switch (i2) {
                        case 0:
/* 331 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 333 */                   lIoii1l01l0i.I00000oOI(obj);
/* 336 */                   IIllI0o.I0000Il00O(str);
/* 339 */                   IIl0l10l iIl0l10l = iIl01i0I.I0000Il00O;
                            try {
/* 347 */                       IIlOil01ol iIlOil01ol = (IIlOil01ol) iIl01i0I.I000l1.getValue();
/* 349 */                       iIlOil01ol.getClass();
/* 354 */                       ArrayList arrayList = new ArrayList();
/* 357 */                       IIioOOoI100 iIioOOoI100 = iIlOil01ol.I00000oIO;
/* 359 */                       if (iIioOOoI100 != null) {
/* 363 */                           CameraManager cameraManager = iIioOOoI100.I00000oIO;
/* 365 */                           I0ii1OiO i0ii1OiO = new I0ii1OiO(1);
/* 372 */                           i0ii1OiO.I00000oOI = cameraManager.getCameraDeviceSetup(str);
/* 374 */                           VarHandle.storeStoreFence();
/* 377 */                           arrayList.add(i0ii1OiO);
                                }
/* 383 */                       IIioOOoI100 iIioOOoI1002 = iIlOil01ol.I00000oOI;
/* 385 */                       if (iIioOOoI1002 != null) {
                                    try {
/* 389 */                               CameraManager cameraManager2 = iIioOOoI1002.I00000oIO;
/* 391 */                               I0ii1OiO i0ii1OiO2 = new I0ii1OiO(1);
/* 398 */                               i0ii1OiO2.I00000oOI = cameraManager2.getCameraDeviceSetup(str);
/* 400 */                               VarHandle.storeStoreFence();
/* 403 */                               arrayList.add(i0ii1OiO2);
                                    } catch (UnsupportedOperationException unused) {
                                    }
                                }
/* 409 */                       I0ii1OiO i0ii1OiO3 = new I0ii1OiO(0);
/* 412 */                       i0ii1OiO3.I00000oOI = arrayList;
/* 414 */                       VarHandle.storeStoreFence();
/* 417 */                       return i0ii1OiO3;
                            } catch (Exception e) {
/* 422 */                       if (e instanceof CameraAccessException) {
/* 440 */                           Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
/* 443 */                           CameraAccessException cameraAccessException = (CameraAccessException) e;
/* 445 */                           int reason = cameraAccessException.getReason();
/* 449 */                           if (reason != 1) {
/* 451 */                               if (reason == 2) {
/* 483 */                                   i3 = 6;
                                        } else if (reason == 3) {
/* 481 */                                   i3 = 0;
                                        } else if (reason == 4) {
/* 479 */                                   i3 = 1;
                                        } else if (reason != 5) {
/* 471 */                                   Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
/* 474 */                                   i3 = 11;
                                        } else {
/* 477 */                                   i3 = 2;
                                        }
                                    }
/* 484 */                           iIl0l10l.I00000oIO(true, str, i3);
                                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
/* 528 */                           Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
/* 532 */                           iIl0l10l.I00000oIO(false, str, 9);
                                } else if (!(e instanceof IllegalStateException)) {
/* 511 */                           throw e;
                                }
/* 487 */                       return null;
                            }
                        default:
/* 27 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 29 */                    lIoii1l01l0i.I00000oOI(obj);
/* 32 */                    OOiO01IO oOiO01IO = iIl01i0I.I00000oIO;
/* 34 */                    IIl0l10l iIl0l10l2 = iIl01i0I.I0000Il00O;
                            try {
/* 46 */                        boolValueOf = Boolean.valueOf(((CameraManager) oOiO01IO.get()).isCameraDeviceSetupSupported(str));
                            } catch (Exception e2) {
/* 55 */                        if (e2 instanceof CameraAccessException) {
/* 73 */                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e2.getMessage());
/* 76 */                            CameraAccessException cameraAccessException2 = (CameraAccessException) e2;
/* 78 */                            int reason2 = cameraAccessException2.getReason();
/* 82 */                            if (reason2 == 1) {
/* 118 */                               i = 3;
                                    } else if (reason2 == 2) {
/* 116 */                               i = 6;
                                    } else if (reason2 == 3) {
/* 114 */                               i = 0;
                                    } else if (reason2 == 4) {
/* 112 */                               i = 1;
                                    } else if (reason2 != 5) {
/* 104 */                               Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException2);
/* 107 */                               i = 11;
                                    } else {
/* 110 */                               i = 2;
                                    }
/* 119 */                           iIl0l10l2.I00000oIO(true, str, i);
                                } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
/* 163 */                           Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e2.getMessage());
/* 167 */                           iIl0l10l2.I00000oIO(false, str, 9);
                                } else if (!(e2 instanceof IllegalStateException)) {
/* 146 */                           throw e2;
                                }
/* 122 */                       boolValueOf = null;
                            }
/* 177 */                   if (O0000Ioio00.I0000O(boolValueOf, Boolean.TRUE)) {
/* 182 */                       IIllI0o.I0000Il00O(str);
                                try {
/* 1 */                             cameraDeviceSetup = ((CameraManager) oOiO01IO.get()).getCameraDeviceSetup(str);
                                } catch (Exception e3) {
/* 200 */                           if (e3 instanceof CameraAccessException) {
/* 218 */                               Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e3.getMessage());
/* 221 */                               CameraAccessException cameraAccessException3 = (CameraAccessException) e3;
/* 223 */                               int reason3 = cameraAccessException3.getReason();
/* 227 */                               if (reason3 != 1) {
/* 229 */                                   if (reason3 == 2) {
/* 261 */                                       i3 = 6;
                                            } else if (reason3 == 3) {
/* 259 */                                       i3 = 0;
                                            } else if (reason3 == 4) {
/* 257 */                                       i3 = 1;
                                            } else if (reason3 != 5) {
/* 249 */                                       Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException3);
/* 252 */                                       i3 = 11;
                                            } else {
/* 255 */                                       i3 = 2;
                                            }
                                        }
/* 262 */                               iIl0l10l2.I00000oIO(true, str, i3);
                                    } else if ((e3 instanceof IllegalArgumentException) || (e3 instanceof SecurityException) || (e3 instanceof UnsupportedOperationException) || (e3 instanceof NullPointerException)) {
/* 306 */                               Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e3.getMessage());
/* 310 */                               iIl0l10l2.I00000oIO(false, str, 9);
                                    } else if (!(e3 instanceof IllegalStateException)) {
/* 289 */                               throw e3;
                                    }
/* 265 */                           cameraDeviceSetup = null;
                                }
/* 314 */                       if (cameraDeviceSetup != null) {
/* 318 */                           IIl0OIOoOl0 iIl0OIOoOl0 = new IIl0OIOoOl0();
/* 321 */                           iIl0OIOoOl0.I00000oIO = cameraDeviceSetup;
/* 323 */                           iIl0OIOoOl0.I00000oOI = str;
/* 325 */                           iIl0OIOoOl0.I0000Il00O = iIl0l10l2;
/* 327 */                           VarHandle.storeStoreFence();
/* 330 */                           return iIl0OIOoOl0;
                                }
                            }
/* 179 */                   return null;
                    }
                }
            }
