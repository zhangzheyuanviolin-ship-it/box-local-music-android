            package com.google.mlkit.vision.text.pipeline;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.media.Image;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import com.google.android.libraries.vision.visionkit.pipeline.AndroidAssetUtil;
            import com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException;
            import com.google.mlkit.vision.common.internal.ImageConvertUtils;
            import com.google.mlkit.vision.common.internal.ImageUtils;
            import java.nio.ByteBuffer;
            import java.util.AbstractList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import p000.IoOlilli0ol;
            import p000.O1o01iO0liI0;
            import p000.OIOiOlIO01;
            import p000.i0iIioOlII;
            import p000.i0lli0l;
            import p000.i0llli0IlII;
            import p000.i0loOil1I;
            import p000.i0lolloO00;
            import p000.i0o0loii;
            import p000.i0o0o0OIloI;
            import p000.i0o10lO1i;
            import p000.i0oI0Oi11;
            import p000.i0oIIlI;
            import p000.i0olI0lII0l1;
            import p000.i0olII0I11oi;
            import p000.i1010i0lOiil;
            import p000.i1010oiOO;
            import p000.i101o1;
            import p000.i101o1l1I1ii;
            import p000.i101oi;
            import p000.i101olIl0OiI;
            import p000.i10I00i111;
            import p000.i10I011;
            import p000.i10I10;
            import p000.i10I1i1o0oO;
            import p000.i10I1iI;
            import p000.i10IIII01ol;
            import p000.i10i11Ili;
            import p000.i10ioI;
            import p000.i10ioIi;
            import p000.i10ioiO;
            import p000.i10iollO00;
            import p000.i10l11OI;
            import p000.i10lIlo;
            import p000.i10lIo1Ol;
            import p000.i10lO1lO0;
            import p000.i10lii0oOol;
            import p000.i10llI0i1;
            import p000.i11Oi1oO;
            import p000.lII0I0I000I;
            
            public final class zbi {
                zbh zba;
                boolean zbb;
                private final Context zbc;
                private final VkpTextRecognizerOptions zbd;
                private boolean zbe = true;

                private zbi(Context context, VkpTextRecognizerOptions vkpTextRecognizerOptions) {
/* 7 */             this.zbc = context;
/* 9 */             this.zbd = vkpTextRecognizerOptions;
                }

                public static zbi zba(Context context, VkpTextRecognizerOptions vkpTextRecognizerOptions) {
/* 3 */             return new zbi(context, vkpTextRecognizerOptions);
                }

                public final zbn zbb(IoOlilli0ol ioOlilli0ol, i10i11Ili i10i11ili, boolean z) throws O1o01iO0liI0, SecurityException {
                    i101olIl0OiI i101olil0oiiZbe;
                    i10IIII01ol i10iiii01olI00000oOI;
                    i10I00i111 i10i00i111;
                    i10IIII01ol i10iiii01olI00000oOI2;
                    i10I00i111 i10i00i1112;
                    i10I00i111 i10i00i1113;
/* 7 */             zbo zboVarZbc = zbc();
/* 15 */            if (!zboVarZbc.zbd()) {
/* 17 */                return zbn.zbe(zboVarZbc);
                    }
                    try {
/* 23 */                int i = i10i11ili.I00iOIl;
/* 25 */                int i2 = i10i11ili.I00iio;
/* 33 */                if (i == -1) {
/* 39 */                    Bitmap bitmapCopy = (Bitmap) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 41 */                    lII0I0I000I.I000II(bitmapCopy);
/* 44 */                    Bitmap.Config config = bitmapCopy.getConfig();
/* 48 */                    Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
/* 50 */                    if (config != config2) {
/* 56 */                        String.valueOf(bitmapCopy.getConfig());
/* 63 */                        bitmapCopy = bitmapCopy.copy(config2, bitmapCopy.isMutable());
                            }
/* 71 */                    zbh zbhVar = this.zba;
/* 73 */                    lII0I0I000I.I000II(zbhVar);
/* 85 */                    i101olil0oiiZbe = zbhVar.zbi(SystemClock.elapsedRealtime() * 1000, bitmapCopy, zbj.zbb(i2));
                        } else if (i == 35) {
/* 95 */                    Object objI00O0o1oo = OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 99 */                    lII0I0I000I.I000II(objI00O0o1oo);
/* 104 */                   Image.Plane[] planes = ((Image) objI00O0o1oo).getPlanes();
/* 108 */                   zbh zbhVar2 = this.zba;
/* 110 */                   lII0I0I000I.I000II(zbhVar2);
/* 117 */                   long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
/* 118 */                   Image.Plane plane = planes[0];
/* 120 */                   lII0I0I000I.I000II(plane);
/* 123 */                   ByteBuffer buffer = plane.getBuffer();
/* 127 */                   Image.Plane plane2 = planes[1];
/* 129 */                   lII0I0I000I.I000II(plane2);
/* 132 */                   ByteBuffer buffer2 = plane2.getBuffer();
/* 136 */                   Image.Plane plane3 = planes[2];
/* 138 */                   lII0I0I000I.I000II(plane3);
/* 141 */                   ByteBuffer buffer3 = plane3.getBuffer();
/* 145 */                   int i3 = i10i11ili.I00iiI;
/* 147 */                   int i4 = i10i11ili.I00iiO;
/* 149 */                   Image.Plane plane4 = planes[0];
/* 151 */                   lII0I0I000I.I000II(plane4);
/* 154 */                   int rowStride = plane4.getRowStride();
/* 158 */                   Image.Plane plane5 = planes[1];
/* 160 */                   lII0I0I000I.I000II(plane5);
/* 163 */                   int rowStride2 = plane5.getRowStride();
/* 167 */                   Image.Plane plane6 = planes[1];
/* 169 */                   lII0I0I000I.I000II(plane6);
/* 184 */                   i101olil0oiiZbe = zbhVar2.zbj(jElapsedRealtime, buffer, buffer2, buffer3, i3, i4, rowStride, rowStride2, plane6.getPixelStride(), zbj.zbb(i2));
                        } else if (i == 17) {
/* 197 */                   ByteBuffer byteBuffer = (ByteBuffer) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 199 */                   lII0I0I000I.I000II(byteBuffer);
/* 202 */                   ByteBuffer byteBufferBufferWithBackingArray = ImageConvertUtils.bufferWithBackingArray(byteBuffer);
/* 206 */                   zbh zbhVar3 = this.zba;
/* 208 */                   lII0I0I000I.I000II(zbhVar3);
/* 215 */                   i101olil0oiiZbe = zbhVar3.zbe(zbj.zba(byteBufferBufferWithBackingArray, i10i11ili));
                        } else {
/* 223 */                   if (i != 842094169) {
/* 985 */                       throw new O1o01iO0liI0("Unsupported image format: " + i10i11ili.I00iOIl, 3);
                            }
/* 225 */                   Object objI00O0o1oo2 = OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 229 */                   lII0I0I000I.I000II(objI00O0o1oo2);
/* 234 */                   ByteBuffer byteBufferYv12ToNv21Buffer = ImageConvertUtils.yv12ToNv21Buffer((ByteBuffer) objI00O0o1oo2, true);
/* 238 */                   zbh zbhVar4 = this.zba;
/* 240 */                   lII0I0I000I.I000II(zbhVar4);
/* 247 */                   i101olil0oiiZbe = zbhVar4.zbe(zbj.zba(byteBufferYv12ToNv21Buffer, i10i11ili));
                        }
/* 255 */               if (!i101olil0oiiZbe.I0000Il00O()) {
/* 268 */                   return zbn.zbe(zbo.zbc(3, new RemoteException("VisionKit pipeline returns empty result.")));
                        }
/* 277 */               i0o10lO1i i0o10lo1i = (i0o10lO1i) i101olil0oiiZbe.I00000oIO();
/* 287 */               Matrix uprightRotationMatrix = ImageUtils.getInstance().getUprightRotationMatrix(i10i11ili.I00iiI, i10i11ili.I00iiO, i2);
/* 291 */               boolean z2 = this.zbe;
/* 299 */               zbb zbbVar = new zbb(0, i101o1.I00iOIl);
/* 306 */               i11Oi1oO<i0iIioOlII> i11oi1ooI00100l0 = i0o10lo1i.I00100o1O0lo().I00100l0();
/* 312 */               HashMap map = new HashMap();
/* 317 */               HashMap map2 = new HashMap();
/* 322 */               HashMap map3 = new HashMap();
/* 333 */               for (i0iIioOlII i0iiioolii : i11oi1ooI00100l0) {
/* 346 */                   if (i0iiioolii.I00100l0() == 6) {
/* 352 */                       i10lIlo i10liloZbb = zbf.zbb(i0iiioolii.I0010o());
/* 356 */                       List listZbc = zbf.zbc(i10liloZbb);
/* 388 */                       i10l11OI i10l11oi = new i10l11OI(i0iiioolii.I000oI1ioi(), zbf.zba(listZbc, uprightRotationMatrix), listZbc, i0iiioolii.I00100o1O0lo(), i10liloZbb.I000oI1ioi());
/* 395 */                       Integer numValueOf = Integer.valueOf(i0iiioolii.I0010I0i());
/* 403 */                       if (map2.containsKey(numValueOf)) {
/* 409 */                           i10i00i1113 = (i10I00i111) map2.get(numValueOf);
                                } else {
/* 414 */                           i10I00i111 i10i00i1114 = new i10I00i111();
/* 417 */                           map2.put(numValueOf, i10i00i1114);
/* 420 */                           i10i00i1113 = i10i00i1114;
                                }
/* 421 */                       lII0I0I000I.I000II(i10i00i1113);
/* 424 */                       i10i00i1113.I00000oIO(i10l11oi);
                            }
                        }
/* 433 */               for (int i5 = 0; i5 < i11oi1ooI00100l0.size(); i5++) {
/* 439 */                   i0iIioOlII i0iiioolii2 = (i0iIioOlII) i11oi1ooI00100l0.get(i5);
/* 445 */                   if (i0iiioolii2.I00100l0() == 1) {
/* 453 */                       i10lIlo i10liloZbb2 = zbf.zbb(i0iiioolii2.I0010o());
/* 457 */                       List listZbc2 = zbf.zbc(i10liloZbb2);
/* 461 */                       Integer numValueOf2 = Integer.valueOf(i5);
/* 469 */                       if (map2.containsKey(numValueOf2)) {
/* 475 */                           i10I00i111 i10i00i1115 = (i10I00i111) map2.get(numValueOf2);
/* 477 */                           lII0I0I000I.I000II(i10i00i1115);
/* 480 */                           i10iiii01olI00000oOI2 = i10i00i1115.I00000oOI();
                                } else {
/* 487 */                           i10I011 i10i011 = i10I10.I00lll10;
/* 489 */                           i10iiii01olI00000oOI2 = i10IIII01ol.I00o101lO;
                                }
/* 484 */                       i10IIII01ol i10iiii01ol = i10iiii01olI00000oOI2;
/* 494 */                       String strI000oI1ioi = i0iiioolii2.I000oI1ioi();
/* 498 */                       Rect rectZba = zbf.zba(listZbc2, uprightRotationMatrix);
/* 510 */                       String strZba = zbg.zba(i0iiioolii2.I00111O().I00100l0());
/* 514 */                       float fI00100o1O0lo = i0iiioolii2.I00100o1O0lo();
/* 518 */                       float fI000oI1ioi = i10liloZbb2.I000oI1ioi();
/* 522 */                       lII0I0I000I.I000II(i10iiii01ol);
/* 528 */                       i10ioIi i10ioii = new i10ioIi(fI00100o1O0lo, fI000oI1ioi, rectZba, strI000oI1ioi, strZba, listZbc2, i10iiii01ol);
/* 535 */                       Integer numValueOf3 = Integer.valueOf(i0iiioolii2.I0010I0i());
/* 543 */                       if (map.containsKey(numValueOf3)) {
/* 549 */                           i10i00i1112 = (i10I00i111) map.get(numValueOf3);
                                } else {
/* 554 */                           i10I00i111 i10i00i1116 = new i10I00i111();
/* 557 */                           map.put(numValueOf3, i10i00i1116);
/* 560 */                           i10i00i1112 = i10i00i1116;
                                }
/* 561 */                       lII0I0I000I.I000II(i10i00i1112);
/* 564 */                       i10i00i1112.I00000oIO(i10ioii);
                            }
                        }
/* 577 */               for (int i6 = 0; i6 < i11oi1ooI00100l0.size(); i6++) {
/* 583 */                   i0iIioOlII i0iiioolii3 = (i0iIioOlII) i11oi1ooI00100l0.get(i6);
/* 589 */                   if (i0iiioolii3.I00100l0() == 3) {
/* 597 */                       i10lIlo i10liloZbb3 = zbf.zbb(i0iiioolii3.I0010o());
/* 601 */                       List listZbc3 = zbf.zbc(i10liloZbb3);
/* 605 */                       Integer numValueOf4 = Integer.valueOf(i6);
/* 613 */                       if (map.containsKey(numValueOf4)) {
/* 619 */                           i10I00i111 i10i00i1117 = (i10I00i111) map.get(numValueOf4);
/* 621 */                           lII0I0I000I.I000II(i10i00i1117);
/* 624 */                           i10iiii01olI00000oOI = i10i00i1117.I00000oOI();
                                } else {
/* 631 */                           i10I011 i10i0112 = i10I10.I00lll10;
/* 633 */                           i10iiii01olI00000oOI = i10IIII01ol.I00o101lO;
                                }
/* 628 */                       i10IIII01ol i10iiii01ol2 = i10iiii01olI00000oOI;
/* 638 */                       String strI000oI1ioi2 = i0iiioolii3.I000oI1ioi();
/* 642 */                       Rect rectZba2 = zbf.zba(listZbc3, uprightRotationMatrix);
/* 654 */                       String strZba2 = zbg.zba(i0iiioolii3.I00111O().I00100l0());
/* 658 */                       lII0I0I000I.I000II(i10iiii01ol2);
/* 672 */                       i10ioiO i10ioio = new i10ioiO(i0iiioolii3.I00100o1O0lo(), i10liloZbb3.I000oI1ioi(), rectZba2, strI000oI1ioi2, strZba2, listZbc3, i10iiii01ol2);
/* 679 */                       Integer numValueOf5 = Integer.valueOf(i0iiioolii3.I0010I0i());
/* 687 */                       if (map3.containsKey(numValueOf5)) {
/* 693 */                           i10i00i111 = (i10I00i111) map3.get(numValueOf5);
                                } else {
/* 698 */                           i10I00i111 i10i00i1118 = new i10I00i111();
/* 709 */                           map3.put(Integer.valueOf(i0iiioolii3.I0010I0i()), i10i00i1118);
/* 712 */                           i10i00i111 = i10i00i1118;
                                }
/* 713 */                       lII0I0I000I.I000II(i10i00i111);
/* 716 */                       i10i00i111.I00000oIO(i10ioio);
                            }
                        }
/* 725 */               i10I00i111 i10i00i1119 = new i10I00i111();
/* 733 */               for (int i7 = 0; i7 < i11oi1ooI00100l0.size(); i7++) {
/* 739 */                   i0iIioOlII i0iiioolii4 = (i0iIioOlII) i11oi1ooI00100l0.get(i7);
/* 746 */                   if (i0iiioolii4.I00100l0() == 4) {
/* 757 */                       List listZbc4 = zbf.zbc(zbf.zbb(i0iiioolii4.I0010o()));
/* 761 */                       i10I011 i10i0113 = i10I10.I00lll10;
/* 763 */                       i10IIII01ol i10iiii01olI00000oOI3 = i10IIII01ol.I00o101lO;
/* 765 */                       Integer numValueOf6 = Integer.valueOf(i7);
/* 773 */                       if (map3.containsKey(numValueOf6)) {
/* 779 */                           i10I00i111 i10i00i11110 = (i10I00i111) map3.get(numValueOf6);
/* 781 */                           lII0I0I000I.I000II(i10i00i11110);
/* 784 */                           i10iiii01olI00000oOI3 = i10i00i11110.I00000oOI();
/* 788 */                           map3.remove(numValueOf6);
                                }
/* 793 */                       i101oi i101oiVar = zbm.zba;
/* 797 */                       i101o1l1I1ii i101o1l1i1ii = new i101o1l1I1ii() {
                                    @Override
                                    public final Object zba(Object obj) {
/* 3 */                                 return ((i10ioiO) obj).I00iOIl;
                                    }
                                };
/* 810 */                       AbstractList i10i1i1o0oo = i10iiii01olI00000oOI3 != null ? new i10I1i1o0oO(i10iiii01olI00000oOI3, i101o1l1i1ii) : new i10I1iI(i10iiii01olI00000oOI3, i101o1l1i1ii);
/* 813 */                       i101oiVar.getClass();
/* 816 */                       String strI00000oIO = i101oi.I00000oIO(i10i1i1o0oo);
/* 820 */                       Rect rectZba3 = zbf.zba(listZbc4, uprightRotationMatrix);
/* 832 */                       String strZba3 = zbg.zba(i0iiioolii4.I00111O().I00100l0());
/* 836 */                       lII0I0I000I.I000II(i10iiii01olI00000oOI3);
/* 844 */                       i10i00i1119.I00000oIO(new i10ioI(strI00000oIO, rectZba3, listZbc4, strZba3, i10iiii01olI00000oOI3));
                            }
                        }
/* 855 */               Iterator it = map3.values().iterator();
/* 863 */               while (it.hasNext()) {
/* 871 */                   i10IIII01ol i10iiii01olI00000oOI4 = ((i10I00i111) it.next()).I00000oOI();
/* 875 */                   int i8 = i10iiii01olI00000oOI4.I00o0l1o1o0;
/* 877 */                   int i9 = 0;
/* 878 */                   while (i9 < i8) {
/* 884 */                       i10ioiO i10ioio2 = (i10ioiO) i10iiii01olI00000oOI4.get(i9);
/* 911 */                       i10i00i1119.I00000oIO(new i10ioI(i10ioio2.I00iOIl, i10ioio2.I00iiI, i10ioio2.I00iiO, i10ioio2.I00iio, new i10IIII01ol(new Object[]{i10ioio2}, 1)));
/* 914 */                       i9++;
/* 916 */                       it = it;
                            }
                        }
/* 919 */               i10IIII01ol i10iiii01olI00000oOI5 = i10i00i1119.I00000oOI();
/* 925 */               i101oi i101oiVar2 = zbm.zba;
/* 929 */               i101o1l1I1ii i101o1l1i1ii2 = new i101o1l1I1ii() {
                            @Override
                            public final Object zba(Object obj) {
/* 3 */                         return ((i10ioI) obj).I00iOIl;
                            }
                        };
/* 942 */               AbstractList i10i1i1o0oo2 = i10iiii01olI00000oOI5 != null ? new i10I1i1o0oO(i10iiii01olI00000oOI5, i101o1l1i1ii2) : new i10I1iI(i10iiii01olI00000oOI5, i101o1l1i1ii2);
/* 945 */               i101oiVar2.getClass();
/* 952 */               i10iollO00 i10iollo00 = new i10iollO00(i101oi.I00000oIO(i10i1i1o0oo2), i10iiii01olI00000oOI5);
/* 955 */               i10I011 i10i0114 = i10I10.I00lll10;
/* 959 */               zba zbaVar = new zba(zbbVar, i10iollo00, i10IIII01ol.I00o101lO, z2);
/* 963 */               this.zbe = false;
/* 965 */               return zbaVar;
                    } catch (O1o01iO0liI0 e) {
/* 1009 */              return zbn.zbe(zbo.zbc(2, new RemoteException("Failed to process input image.".concat(String.valueOf(e.getMessage())))));
                    }
                }

                public final zbo zbc() {
/* 1 */             boolean z = this.zbb;
/* 3 */             i101o1 i101o1Var = i101o1.I00iOIl;
/* 6 */             if (z) {
/* 10 */                return new zbb(0, i101o1Var);
                    }
/* 14 */            zbh zbhVar = this.zba;
/* 17 */            if (zbhVar == null) {
/* 21 */                AndroidAssetUtil.I00000oIO(this.zbc);
/* 24 */                VkpTextRecognizerOptions vkpTextRecognizerOptions = this.zbd;
/* 28 */                String strZba = vkpTextRecognizerOptions.zba();
/* 32 */                String strZbc = vkpTextRecognizerOptions.zbc();
/* 36 */                String strZbb = vkpTextRecognizerOptions.zbb();
/* 40 */                boolean zZbd = vkpTextRecognizerOptions.zbd();
/* 44 */                i0loOil1I i0looil1iI00100l0 = i0lolloO00.I00100l0();
/* 48 */                int i = 4;
/* 53 */                char c = zZbd ? (char) 4 : (char) 0;
/* 54 */                i0oI0Oi11 i0oi0oi11I000oI1ioi = i0oIIlI.I000oI1ioi();
/* 58 */                i0lli0l i0lli0lVarI000oI1ioi = i0llli0IlII.I000oI1ioi();
/* 62 */                i0lli0lVarI000oI1ioi.I0000O();
/* 69 */                i0llli0IlII.I00100l0((i0llli0IlII) i0lli0lVarI000oI1ioi.I00iiI, strZbc);
/* 72 */                i0lli0lVarI000oI1ioi.I0000O();
/* 79 */                i0llli0IlII.I00100o1O0lo((i0llli0IlII) i0lli0lVarI000oI1ioi.I00iiI, strZba);
/* 82 */                i0lli0lVarI000oI1ioi.I0000O();
/* 89 */                i0llli0IlII.I0010I0i((i0llli0IlII) i0lli0lVarI000oI1ioi.I00iiI);
/* 92 */                i0lli0lVarI000oI1ioi.I0000O();
/* 99 */                i0llli0IlII.I00111O((i0llli0IlII) i0lli0lVarI000oI1ioi.I00iiI);
/* 106 */               if (!strZbb.isEmpty()) {
/* 108 */                   i10lIo1Ol i10lio1olI000oI1ioi = i10lO1lO0.I000oI1ioi();
/* 112 */                   i10lii0oOol i10lii0ooolI000oI1ioi = i10llI0i1.I000oI1ioi();
/* 116 */                   i10lii0ooolI000oI1ioi.I0000O();
/* 1 */                     ((i10llI0i1) i10lii0ooolI000oI1ioi.I00iiI).zbe = strZbb;
/* 126 */                   i10lio1olI000oI1ioi.I0000O();
/* 139 */                   i10lO1lO0.I00100l0((i10lO1lO0) i10lio1olI000oI1ioi.I00iiI, (i10llI0i1) i10lii0ooolI000oI1ioi.I00000oIO());
/* 142 */                   i0lli0lVarI000oI1ioi.I0000O();
/* 155 */                   i0llli0IlII.I0010o((i0llli0IlII) i0lli0lVarI000oI1ioi.I00iiI, (i10lO1lO0) i10lio1olI000oI1ioi.I00000oIO());
                        }
/* 158 */               i0oi0oi11I000oI1ioi.I0000O();
/* 171 */               i0oIIlI.I00100l0((i0oIIlI) i0oi0oi11I000oI1ioi.I00iiI, (i0llli0IlII) i0lli0lVarI000oI1ioi.I00000oIO());
/* 174 */               if (c == 0) {
/* 194 */                   i = 1;
                        } else if (c == 1) {
/* 192 */                   i = 2;
                        } else if (c == 2) {
/* 190 */                   i = 3;
                        } else if (c != 3) {
/* 188 */                   i = c != 4 ? 0 : 5;
                        }
/* 195 */               i0o0loii i0o0loiiVarI000oI1ioi = i0o0o0OIloI.I000oI1ioi();
/* 199 */               i0o0loiiVarI000oI1ioi.I0000O();
/* 206 */               i0o0o0OIloI.I00100l0((i0o0o0OIloI) i0o0loiiVarI000oI1ioi.I00iiI, i);
/* 209 */               i0oi0oi11I000oI1ioi.I0000O();
/* 222 */               i0oIIlI.I0010I0i((i0oIIlI) i0oi0oi11I000oI1ioi.I00iiI, (i0o0o0OIloI) i0o0loiiVarI000oI1ioi.I00000oIO());
/* 225 */               i1010i0lOiil i1010i0loiilI000oI1ioi = i1010oiOO.I000oI1ioi();
/* 229 */               i1010i0loiilI000oI1ioi.I0000O();
/* 236 */               i1010oiOO.I00100l0((i1010oiOO) i1010i0loiilI000oI1ioi.I00iiI);
/* 239 */               i0oi0oi11I000oI1ioi.I0000O();
/* 252 */               i0oIIlI.I00100o1O0lo((i0oIIlI) i0oi0oi11I000oI1ioi.I00iiI, (i1010oiOO) i1010i0loiilI000oI1ioi.I00000oIO());
/* 255 */               i0looil1iI00100l0.I0000O();
/* 268 */               i0lolloO00.I0010I0i((i0lolloO00) i0looil1iI00100l0.I00iiI, (i0oIIlI) i0oi0oi11I000oI1ioi.I00000oIO());
/* 271 */               i0olI0lII0l1 i0oli0lii0l1I000oI1ioi = i0olII0I11oi.I000oI1ioi();
/* 275 */               i0oli0lii0l1I000oI1ioi.I0000O();
/* 282 */               i0olII0I11oi.I00100l0((i0olII0I11oi) i0oli0lii0l1I000oI1ioi.I00iiI);
/* 285 */               i0looil1iI00100l0.I0000O();
/* 298 */               i0lolloO00.I00100o1O0lo((i0lolloO00) i0looil1iI00100l0.I00iiI, (i0olII0I11oi) i0oli0lii0l1I000oI1ioi.I00000oIO());
/* 315 */               zbh zbhVar2 = new zbh((i0lolloO00) i0looil1iI00100l0.I00000oIO(), this.zbd.zba(), "mlkit_google_ocr_pipeline");
/* 318 */               this.zba = zbhVar2;
/* 320 */               zbhVar = zbhVar2;
                    }
                    try {
/* 321 */               zbhVar.zbg();
/* 324 */               this.zbb = true;
/* 328 */               return new zbb(0, i101o1Var);
                    } catch (PipelineException e) {
/* 354 */               return zbo.zbc(1, new RemoteException("Failed to initialize detector. ".concat((String) e.getRootCauseMessage().I00000oOI())));
                    }
                }

                public final void zbd() {
/* 1 */             zbh zbhVar = this.zba;
/* 3 */             if (zbhVar != null) {
/* 7 */                 if (this.zbb) {
/* 9 */                     zbhVar.zbh();
                        }
/* 14 */                this.zba.zbf();
/* 18 */                this.zba = null;
                    }
/* 21 */            this.zbb = false;
/* 24 */            this.zbe = true;
                }
            }
