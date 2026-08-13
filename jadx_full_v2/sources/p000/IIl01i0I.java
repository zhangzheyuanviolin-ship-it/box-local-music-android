            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraManager;
            import android.os.Build;
            import android.util.Log;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Objects;
            
            public final class IIl01i0I {
                public OOiO01IO I00000oIO;
                public Oo10IliO00O I00000oOI;
                public IIl0l10l I0000Il00O;
                public OOiO01IO I0000O;
                public IIOlO1ii I0000oI00;
                public Object I0001Ioi1lo;
                public ArrayList I000II;
                public LinkedHashMap I000O01llI0;
                public LinkedHashMap I000OOo1O;
                public int I000OiO;
                public OOli00O001 I000iOII;
                public OllO00oiil I000l1;

                public static void I0000oI00(OOIoOo0O oOIoOo0O, ArrayList arrayList) {
/* 1 */             Objects.toString(arrayList);
/* 10 */            if (iOlI0o0II.I00000oIO(oOIoOo0O, arrayList) instanceof IO10l0l0) {
/* 33 */                Log.e("CXCP", "Failed to send camera ID list: " + arrayList + '!');
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(String str, IOoilo iOoilo) throws Throwable {
                    IIl0111il iIl0111il;
                    IiIOI1ol0o iiIOI1ol0o;
/* 3 */             if (iOoilo instanceof IIl0111il) {
/* 6 */                 iIl0111il = (IIl0111il) iOoilo;
/* 8 */                 int i = iIl0111il.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIl0111il.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIl0111il = new IIl0111il(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00o0iI0io1 = iIl0111il.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iIl0111il.I00ilI0I1;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 33 */            if (i2 == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(objI00o0iI0io1);
/* 60 */                if (Build.VERSION.SDK_INT < 35) {
/* 31 */                    return null;
                        }
                        synchronized (this.I0001Ioi1lo) {
                            try {
/* 66 */                        LinkedHashMap linkedHashMap = this.I000O01llI0;
/* 68 */                        IIllI0o iIllI0oI00000oIO = IIllI0o.I00000oIO(str);
/* 72 */                        Object objI00000oOI = linkedHashMap.get(iIllI0oI00000oIO);
/* 76 */                        if (objI00000oOI == null) {
/* 91 */                            objI00000oOI = iOi1II01i0.I00000oOI(this.I0000oI00, this.I00000oOI.I0000O, new IIl01I(str, this, iOoil1iiIilo, 0), 2);
/* 95 */                            linkedHashMap.put(iIllI0oI00000oIO, objI00000oOI);
                                }
/* 102 */                       iiIOI1ol0o = (IiIOI1ol0o) objI00000oOI;
                            } catch (Throwable th) {
/* 332 */                       throw th;
                            }
                        }
/* 105 */               iIl0111il.I00iOIl = str;
/* 107 */               iIl0111il.I00iiI = iiIOI1ol0o;
/* 109 */               iIl0111il.I00ilI0I1 = 1;
/* 111 */               objI00o0iI0io1 = iiIOI1ol0o.I00o0iI0io1(iIl0111il);
/* 115 */               if (objI00o0iI0io1 == ii0111o) {
/* 117 */                   return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 49 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                IiIOI1ol0o iiIOI1ol0o2 = iIl0111il.I00iiI;
/* 39 */                String str2 = iIl0111il.I00iOIl;
/* 41 */                lIoii1l01l0i.I00000oOI(objI00o0iI0io1);
/* 44 */                iiIOI1ol0o = iiIOI1ol0o2;
/* 45 */                str = str2;
                    }
/* 118 */           I0ii1OiO i0ii1OiO = (I0ii1OiO) objI00o0iI0io1;
/* 120 */           if (i0ii1OiO != null) {
/* 142 */               return i0ii1OiO;
                    }
/* 122 */           IIllI0o.I0000Il00O(str);
                    synchronized (this.I0001Ioi1lo) {
/* 134 */               this.I000O01llI0.remove(IIllI0o.I00000oIO(str), iiIOI1ol0o);
                    }
/* 138 */           return i0ii1OiO;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(String str, IOoilo iOoilo) throws Throwable {
                    IIl01I011lii iIl01I011lii;
                    IiIOI1ol0o iiIOI1ol0o;
/* 3 */             if (iOoilo instanceof IIl01I011lii) {
/* 6 */                 iIl01I011lii = (IIl01I011lii) iOoilo;
/* 8 */                 int i = iIl01I011lii.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iIl01I011lii.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iIl01I011lii = new IIl01I011lii(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00o0iI0io1 = iIl01I011lii.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iIl01I011lii.I00ilI0I1;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 32 */            int i3 = 1;
/* 33 */            if (i2 == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(objI00o0iI0io1);
                        synchronized (this.I0001Ioi1lo) {
                            try {
/* 59 */                        LinkedHashMap linkedHashMap = this.I000OOo1O;
/* 61 */                        IIllI0o iIllI0oI00000oIO = IIllI0o.I00000oIO(str);
/* 65 */                        Object objI00000oOI = linkedHashMap.get(iIllI0oI00000oIO);
/* 69 */                        if (objI00000oOI == null) {
/* 83 */                            objI00000oOI = iOi1II01i0.I00000oOI(this.I0000oI00, this.I00000oOI.I0000O, new IIl01I(str, this, iOoil1iiIilo, i3), 2);
/* 87 */                            linkedHashMap.put(iIllI0oI00000oIO, objI00000oOI);
                                }
/* 94 */                        iiIOI1ol0o = (IiIOI1ol0o) objI00000oOI;
                            } catch (Throwable th) {
/* 332 */                       throw th;
                            }
                        }
/* 97 */                iIl01I011lii.I00iOIl = str;
/* 99 */                iIl01I011lii.I00iiI = iiIOI1ol0o;
/* 101 */               iIl01I011lii.I00ilI0I1 = 1;
/* 103 */               objI00o0iI0io1 = iiIOI1ol0o.I00o0iI0io1(iIl01I011lii);
/* 107 */               if (objI00o0iI0io1 == ii0111o) {
/* 109 */                   return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 49 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                IiIOI1ol0o iiIOI1ol0o2 = iIl01I011lii.I00iiI;
/* 39 */                String str2 = iIl01I011lii.I00iOIl;
/* 41 */                lIoii1l01l0i.I00000oOI(objI00o0iI0io1);
/* 44 */                iiIOI1ol0o = iiIOI1ol0o2;
/* 45 */                str = str2;
                    }
/* 110 */           IIl0OIOoOl0 iIl0OIOoOl0 = (IIl0OIOoOl0) objI00o0iI0io1;
/* 112 */           if (iIl0OIOoOl0 != null) {
/* 134 */               return iIl0OIOoOl0;
                    }
/* 114 */           IIllI0o.I0000Il00O(str);
                    synchronized (this.I0001Ioi1lo) {
/* 126 */               this.I000OOo1O.remove(IIllI0o.I00000oIO(str), iiIOI1ol0o);
                    }
/* 130 */           return iIl0OIOoOl0;
                }

                public final void I0000Il00O(OOIoOo0O oOIoOo0O, String str, boolean z) throws CameraAccessException {
                    ArrayList arrayList;
                    synchronized (this.I0001Ioi1lo) {
/* 4 */                 arrayList = this.I000II;
                    }
/* 8 */             ArrayList arrayListI0000O = null;
/* 9 */             if (z) {
/* 11 */                if (arrayList == null || arrayList.isEmpty()) {
/* 66 */                    Log.i("CXCP", "New camera " + str + " detected");
/* 69 */                    arrayListI0000O = I0000O();
                        } else {
/* 20 */                    Iterator it = arrayList.iterator();
/* 28 */                    while (it.hasNext()) {
/* 42 */                        if (O0000Ioio00.I0000O(((IIllI0o) it.next()).I00000oIO, str)) {
                                    break;
                                }
                            }
/* 66 */                    Log.i("CXCP", "New camera " + str + " detected");
/* 69 */                    arrayListI0000O = I0000O();
                        }
                    } else {
/* 74 */                if (z) {
/* 157 */                   I000II.I00000oIO();
/* 160 */                   return;
                        }
/* 76 */                if (arrayList == null) {
/* 130 */                   Log.i("CXCP", "Unavailable camera " + str + " detected");
/* 133 */                   arrayListI0000O = I0000O();
                            break;
                        }
/* 82 */                if (!arrayList.isEmpty()) {
/* 85 */                    Iterator it2 = arrayList.iterator();
/* 93 */                    while (it2.hasNext()) {
/* 107 */                       if (O0000Ioio00.I0000O(((IIllI0o) it2.next()).I00000oIO, str)) {
/* 130 */                           Log.i("CXCP", "Unavailable camera " + str + " detected");
/* 133 */                           arrayListI0000O = I0000O();
                                    break;
                                }
                            }
                        }
                    }
/* 137 */           if (arrayListI0000O != null && (arrayListI0000O.size() >= this.I000OiO || arrayList == null)) {
/* 150 */               arrayList = arrayListI0000O;
                    }
/* 151 */           if (arrayList != null) {
/* 153 */               I0000oI00(oOIoOo0O, arrayList);
                    }
                }

                public final ArrayList I0000O() throws CameraAccessException {
                    try {
/* 10 */                String[] cameraIdList = ((CameraManager) this.I00000oIO.get()).getCameraIdList();
/* 16 */                ArrayList arrayList = new ArrayList();
/* 21 */                for (String str : cameraIdList) {
/* 25 */                    IIllI0o.I00000oOI(str);
/* 32 */                    arrayList.add(IIllI0o.I00000oIO(str));
                        }
/* 44 */                if (arrayList.size() < this.I000OiO) {
/* 96 */                    Log.w("CXCP", "Failed to query camera ID list: Invalid list returned: " + arrayList + '.');
/* 99 */                    return arrayList;
                        }
                        synchronized (this.I0001Ioi1lo) {
/* 49 */                    this.I000II = arrayList;
                        }
/* 68 */                Log.i("CXCP", "Loaded CameraIdList " + arrayList);
/* 71 */                return arrayList;
                    } catch (CameraAccessException e) {
/* 123 */               Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!", e);
/* 9 */                 return null;
                    } catch (ArrayIndexOutOfBoundsException e2) {
/* 114 */               Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Unexpected ArrayIndexOutOfBoundsException thrown by framework.", e2);
/* 9 */                 return null;
                    } catch (NullPointerException e3) {
/* 105 */               Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Null was returned by framework.", e3);
/* 9 */                 return null;
                    }
                }
            }
