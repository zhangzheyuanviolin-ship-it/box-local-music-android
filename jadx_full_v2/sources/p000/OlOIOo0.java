            package p000;

            import android.hardware.camera2.params.StreamConfigurationMap;
            import android.os.Build;
            import android.util.Size;
            import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            
            public final class OlOIOo0 {
                public final OIl1o01 I00000oIO;
                public final LinkedHashMap I00000oOI = new LinkedHashMap();
                public final Oi00IilOloo0 I0000Il00O;

                public OlOIOo0(StreamConfigurationMap streamConfigurationMap, OIl1o01 oIl1o01) {
/* 4 */             this.I00000oIO = oIl1o01;
/* 15 */            new LinkedHashMap();
/* 20 */            new LinkedHashMap();
/* 25 */            Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 28 */            oi00IilOloo0.I00iOIl = streamConfigurationMap;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            this.I0000Il00O = oi00IilOloo0;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:10:0x0028, B:12:0x002e, B:18:0x003f, B:20:0x0045), top: B:129:0x0028 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Size[] I00000oIO(int i) {
/* 7 */             Integer numValueOf = Integer.valueOf(i);
/* 11 */            LinkedHashMap linkedHashMap = this.I00000oOI;
/* 17 */            Size[] outputSizes = null;
/* 18 */            if (linkedHashMap.containsKey(numValueOf)) {
/* 28 */                Size[] sizeArr = (Size[]) linkedHashMap.get(Integer.valueOf(i));
/* 30 */                if (sizeArr != null) {
/* 36 */                    return (Size[]) sizeArr.clone();
                        }
/* 17 */                return null;
                    }
                    try {
/* 41 */                Oi00IilOloo0 oi00IilOloo0 = this.I0000Il00O;
/* 45 */                if (i == 4101) {
/* 47 */                    oi00IilOloo0.getClass();
/* 61 */                    if (!(IiOoli.I00000oIO(PixelJpegRSupportedQuirk.class) != null)) {
/* 66 */                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) oi00IilOloo0.I00iOIl;
/* 68 */                        if (streamConfigurationMap != null) {
/* 70 */                            outputSizes = streamConfigurationMap.getOutputSizes(i);
                                }
                            }
                        }
                    } catch (Throwable th) {
/* 90 */                l11I11lO.I0001Ioi1lo("StreamConfigurationMapCompat", "Failed to get output sizes for " + i, th);
                    }
/* 93 */            if (outputSizes == null || outputSizes.length == 0) {
/* 1168 */              l11I11lO.I0000oI00("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
/* 1261 */              return outputSizes;
                    }
/* 100 */           OIl1o01 oIl1o01 = this.I00000oIO;
/* 102 */           oIl1o01.getClass();
/* 109 */           I1Il00 i1Il00 = new I1Il00();
/* 112 */           i1Il00.I00iOIl = outputSizes;
/* 114 */           i1Il00.I00iiI = false;
/* 116 */           VarHandle.storeStoreFence();
/* 119 */           ArrayList arrayList = new ArrayList(i1Il00);
/* 132 */           if (oIl1o01.I0000Il00O != null) {
/* 182 */               Size[] sizeArr2 = (i == 34 && (Build.MANUFACTURER.equalsIgnoreCase("Motorola") || Build.BRAND.equalsIgnoreCase("Motorola")) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
/* 185 */               if (sizeArr2.length != 0) {
/* 188 */                   IOOii0O10Io0.I00100o1O0lo(arrayList, sizeArr2);
                        }
                    }
/* 191 */           IIlo0i0ll iIlo0i0ll = oIl1o01.I00000oIO;
/* 193 */           if (iIlo0i0ll != null && oIl1o01.I00000oOI != null) {
/* 203 */               String str = ((IIioli) iIlo0i0ll).I00iOIl;
/* 205 */               boolean zI0000Il00O = ilIl0101i.I0000Il00O();
/* 221 */               Collection<?> collectionI000O01llI0 = Il01100l.I00iOIl;
/* 223 */               if (zI0000Il00O) {
/* 229 */                   if (str.equals(OIllioIilO.I01OO1I) && i == 256) {
/* 247 */                       collectionI000O01llI0 = IOOi1I.I000O01llI0(new Size(4160, 3120), new Size(4000, 3000));
                            }
                        } else if (ilIl0101i.I0000O()) {
/* 263 */                   if (str.equals(OIllioIilO.I01OO1I) && i == 256) {
/* 281 */                       collectionI000O01llI0 = IOOi1I.I000O01llI0(new Size(4160, 3120), new Size(4000, 3000));
                            }
                        } else if (ilIl0101i.I00000oIO()) {
/* 299 */                   if (str.equals(OIllioIilO.I01OO1I) && (i == 34 || i == 35)) {
/* 323 */                       collectionI000O01llI0 = IOOi1I.I000O01llI0(new Size(720, 720), new Size(400, 400));
                            }
                        } else if (ilIl0101i.I000O01llI0()) {
/* 355 */                   if (str.equals(OIllioIilO.I01OO1I)) {
/* 357 */                       if (i == 34) {
/* 485 */                           collectionI000O01llI0 = IOOi1I.I000O01llI0(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(Barcode.FORMAT_PDF417, 1536), new Size(Barcode.FORMAT_PDF417, 1152), new Size(1920, 1080));
                                } else if (i == 35) {
/* 422 */                           collectionI000O01llI0 = IOOi1I.I000O01llI0(new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(Barcode.FORMAT_PDF417, 1536), new Size(Barcode.FORMAT_PDF417, 1152), new Size(1920, 1080));
                                }
                            } else if (str.equals("1") && (i == 34 || i == 35)) {
/* 564 */                       collectionI000O01llI0 = IOOi1I.I000O01llI0(new Size(3264, 2448), new Size(3264, 1836), new Size(2448, 2448), new Size(1920, 1920), new Size(Barcode.FORMAT_PDF417, 1536), new Size(Barcode.FORMAT_PDF417, 1152), new Size(1920, 1080));
                            }
                        } else if (ilIl0101i.I000II()) {
/* 580 */                   if (str.equals(OIllioIilO.I01OO1I)) {
/* 582 */                       if (i == 34) {
/* 676 */                           collectionI000O01llI0 = IOOi1I.I000O01llI0(new Size(4128, 3096), new Size(4128, 2322), new Size(3088, 3088), new Size(3264, 2448), new Size(3264, 1836), new Size(Barcode.FORMAT_PDF417, 1536), new Size(Barcode.FORMAT_PDF417, 1152), new Size(1920, 1080));
                                } else if (i == 35) {
/* 613 */                           collectionI000O01llI0 = IOOi1I.I000O01llI0(new Size(Barcode.FORMAT_PDF417, 1536), new Size(Barcode.FORMAT_PDF417, 1152), new Size(1920, 1080));
                                }
                            } else if (str.equals("1") && (i == 34 || i == 35)) {
/* 756 */                       collectionI000O01llI0 = IOOi1I.I000O01llI0(new Size(2576, 1932), new Size(2560, 1440), new Size(1920, 1920), new Size(Barcode.FORMAT_PDF417, 1536), new Size(Barcode.FORMAT_PDF417, 1152), new Size(1920, 1080));
                            }
                        } else if (ilIl0101i.I0000oI00()) {
/* 772 */                   if (str.equals(OIllioIilO.I01OO1I) && i == 256) {
/* 787 */                       collectionI000O01llI0 = Collections.singletonList(new Size(9280, 6944));
                            }
                        } else if (ilIl0101i.I0001Ioi1lo()) {
/* 803 */                   if (i == 35) {
/* 874 */                       collectionI000O01llI0 = IOOi1I.I000O01llI0(new Size(3840, 2160), new Size(3264, 2448), new Size(3200, 2400), new Size(2688, 1512), new Size(2592, 1944), new Size(2592, 1940), new Size(1920, 1440));
                            }
                        } else if (ilIl0101i.I00000oOI()) {
/* 886 */                   if (i == 35) {
/* 951 */                       collectionI000O01llI0 = IOOi1I.I000O01llI0(new Size(4032, 3024), new Size(4000, 3000), new Size(3264, 2448), new Size(3200, 2400), new Size(3024, 3024), new Size(2976, 2976), new Size(2448, 2448));
                            }
                        } else if (!ilIl0101i.I000OOo1O()) {
/* 1102 */                  l11I11lO.I0000oI00("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                        } else if (str.equals("1") && i == 35) {
/* 1093 */                  collectionI000O01llI0 = IOOi1I.I000O01llI0(new Size(1280, 720), new Size(1920, 1080), new Size(2304, 1296), new Size(640, 360), new Size(177, 144), new Size(2336, 1080), new Size(2400, 1080), new Size(1920, 824), new Size(1088, 1088), new Size(1728, 1728), new Size(2736, 2736), new Size(1824, 712));
                        }
/* 1107 */              Collection<?> collection = collectionI000O01llI0;
/* 1113 */              if (!collection.isEmpty()) {
/* 1115 */                  arrayList.removeAll(collection);
                        }
                    }
/* 1122 */          if (arrayList.isEmpty()) {
/* 1128 */              l11I11lO.I0000oI00("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
                    }
/* 1138 */          Size[] sizeArr3 = (Size[]) arrayList.toArray(new Size[0]);
/* 1144 */          linkedHashMap.put(Integer.valueOf(i), sizeArr3);
/* 1151 */          return (Size[]) sizeArr3.clone();
                }
            }
