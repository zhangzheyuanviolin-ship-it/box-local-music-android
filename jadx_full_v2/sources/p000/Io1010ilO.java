            package p000;

            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.params.MeteringRectangle;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public final class Io1010ilO {
                public I1OooIoiIO I00000oIO;

                /* JADX WARN: Removed duplicated region for block: B:64:0x0088  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x00a2  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x00b6  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oOI(Io1010ilO io1010ilO, I0OIi10lO0iO i0OIi10lO0iO, I0i10OI0o i0i10OI0o, I1lilIOI0Il i1lilIOI0Il, IlOI0loiiI ilOI0loiiI, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i) {
                    IlOI0loiiI ilOI0loiiI2;
                    List list4;
                    List list5;
                    List list6;
                    List list7;
/* 9 */             I0OIi10lO0iO i0OIi10lO0iO2 = (i & 1) != 0 ? null : i0OIi10lO0iO;
/* 17 */            I0i10OI0o i0i10OI0o2 = (i & 2) != 0 ? null : i0i10OI0o;
/* 25 */            I1lilIOI0Il i1lilIOI0Il2 = (i & 4) != 0 ? null : i1lilIOI0Il;
/* 33 */            IlOI0loiiI ilOI0loiiI3 = (i & 8) != 0 ? null : ilOI0loiiI;
/* 41 */            List list8 = (i & 16) != 0 ? null : list;
/* 49 */            List list9 = (i & 32) != 0 ? null : list2;
/* 57 */            List list10 = (i & 64) != 0 ? null : list3;
/* 65 */            Boolean bool4 = (i & Barcode.FORMAT_ITF) != 0 ? null : bool;
/* 73 */            Boolean bool5 = (i & Barcode.FORMAT_QR_CODE) != 0 ? null : bool2;
/* 83 */            Boolean bool6 = (i & Barcode.FORMAT_UPC_A) != 0 ? null : bool3;
/* 86 */            I1OooIoiIO i1OooIoiIO = io1010ilO.I00000oIO;
                    while (true) {
/* 88 */                Object obj = i1OooIoiIO.I00000oIO;
/* 91 */                OlO011Oo olO011Oo = (OlO011Oo) obj;
/* 98 */                I0OIi10lO0iO i0OIi10lO0iO3 = i0OIi10lO0iO2 == null ? olO011Oo.I00000oIO : i0OIi10lO0iO2;
/* 104 */               I0i10OI0o i0i10OI0o3 = i0i10OI0o2 == null ? olO011Oo.I00000oOI : i0i10OI0o2;
/* 110 */               I1lilIOI0Il i1lilIOI0Il3 = i1lilIOI0Il2 == null ? olO011Oo.I0000Il00O : i1lilIOI0Il2;
/* 111 */               Boolean bool7 = bool6;
/* 118 */               IlOI0loiiI ilOI0loiiI4 = ilOI0loiiI3 == null ? olO011Oo.I0000O : ilOI0loiiI3;
/* 119 */               if (list8 != null) {
/* 123 */                   List list11 = list8;
/* 129 */                   if (list11.isEmpty()) {
/* 131 */                       list11 = null;
                            }
/* 133 */                   list4 = list11;
/* 135 */                   if (list4 == null) {
/* 137 */                       ilOI0loiiI2 = ilOI0loiiI4;
/* 143 */                       list4 = olO011Oo.I0000oI00;
                            } else {
/* 140 */                       ilOI0loiiI2 = ilOI0loiiI4;
                            }
                        }
/* 147 */               if (list9 != null) {
/* 150 */                   List list12 = list9;
/* 156 */                   if (list12.isEmpty()) {
/* 158 */                       list12 = null;
                            }
/* 159 */                   list5 = list12;
/* 161 */                   if (list5 == null) {
/* 163 */                       list5 = olO011Oo.I0001Ioi1lo;
                            }
                        }
/* 165 */               if (list10 != null) {
/* 169 */                   List list13 = list10;
/* 175 */                   if (list13.isEmpty()) {
/* 177 */                       list13 = null;
                            }
/* 179 */                   list7 = list13;
/* 181 */                   if (list7 == null) {
/* 183 */                       list6 = list5;
/* 189 */                       list7 = olO011Oo.I000II;
                            } else {
/* 186 */                       list6 = list5;
                            }
                        }
/* 198 */               Boolean bool8 = bool4 == null ? olO011Oo.I000O01llI0 : bool4;
/* 206 */               Boolean bool9 = bool5 == null ? olO011Oo.I000OOo1O : bool5;
/* 214 */               Boolean bool10 = bool7 == null ? olO011Oo.I000OiO : bool7;
/* 216 */               olO011Oo.getClass();
/* 246 */               if (I1OooIoiIO.I00000oOI.compareAndSet(i1OooIoiIO, obj, new OlO011Oo(i0OIi10lO0iO3, i0i10OI0o3, i1lilIOI0Il3, ilOI0loiiI2, list4, list6, list7, bool8, bool9, bool10))) {
/* 248 */                   return;
                        } else {
/* 249 */                   bool6 = bool7;
                        }
                    }
                }

                public final LinkedHashMap I00000oIO() {
/* 5 */             OlO011Oo olO011Oo = (OlO011Oo) this.I00000oIO.I00000oIO;
/* 9 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 12 */            I0OIi10lO0iO i0OIi10lO0iO = olO011Oo.I00000oIO;
/* 14 */            if (i0OIi10lO0iO != null) {
/* 24 */                linkedHashMap.put(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(i0OIi10lO0iO.I00000oIO));
                    }
/* 27 */            I0i10OI0o i0i10OI0o = olO011Oo.I00000oOI;
/* 29 */            if (i0i10OI0o != null) {
/* 39 */                linkedHashMap.put(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i0i10OI0o.I00000oIO));
                    }
/* 42 */            I1lilIOI0Il i1lilIOI0Il = olO011Oo.I0000Il00O;
/* 44 */            if (i1lilIOI0Il != null) {
/* 54 */                linkedHashMap.put(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(i1lilIOI0Il.I00000oIO));
                    }
/* 57 */            IlOI0loiiI ilOI0loiiI = olO011Oo.I0000O;
/* 59 */            if (ilOI0loiiI != null) {
/* 69 */                linkedHashMap.put(CaptureRequest.FLASH_MODE, Integer.valueOf(ilOI0loiiI.I00000oIO));
                    }
/* 72 */            List list = olO011Oo.I0000oI00;
/* 75 */            if (list != null) {
/* 87 */                linkedHashMap.put(CaptureRequest.CONTROL_AE_REGIONS, list.toArray(new MeteringRectangle[0]));
                    }
/* 90 */            List list2 = olO011Oo.I0001Ioi1lo;
/* 92 */            if (list2 != null) {
/* 104 */               linkedHashMap.put(CaptureRequest.CONTROL_AF_REGIONS, list2.toArray(new MeteringRectangle[0]));
                    }
/* 107 */           List list3 = olO011Oo.I000II;
/* 109 */           if (list3 != null) {
/* 121 */               linkedHashMap.put(CaptureRequest.CONTROL_AWB_REGIONS, list3.toArray(new MeteringRectangle[0]));
                    }
/* 124 */           Boolean bool = olO011Oo.I000O01llI0;
/* 126 */           if (bool != null) {
/* 130 */               linkedHashMap.put(CaptureRequest.CONTROL_AE_LOCK, bool);
                    }
/* 133 */           Boolean bool2 = olO011Oo.I000OiO;
/* 135 */           if (bool2 != null) {
/* 139 */               linkedHashMap.put(CaptureRequest.CONTROL_AWB_LOCK, bool2);
                    }
/* 245 */           return linkedHashMap;
                }
            }
