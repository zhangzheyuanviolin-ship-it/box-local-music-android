            package com.google.mlkit.vision.barcode.internal;

            import android.util.SparseArray;
            import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.IOiOol0;
            import p000.O1o0111OI00;
            import p000.iioil1o11o;
            import p000.iiooi0i00l;
            import p000.ilIIoll0ll;
            import p000.lliI0lOI;
            import p000.lliO0i0Iii0;
            import p000.lliOo1oo;
            import p000.lllllII;
            import p000.llloI00Ioil1;
            import p000.lloOlO0lOIO;
            import p000.o0II110Oo1o;
            import p000.o0Ii11Oi1li;
            import p000.o0IooioOOIl;
            import p000.o0OiI0Oo;
            import p000.o0OiOio;
            import p000.o0Oll1li;
            
            public final class zzb {
                static final AtomicReference zza;
                private static final SparseArray zzb;
                private static final SparseArray zzc;
                private static final Map zzd;

                static {
/* 3 */             SparseArray sparseArray = new SparseArray();
/* 6 */             zzb = sparseArray;
/* 10 */            SparseArray sparseArray2 = new SparseArray();
/* 13 */            zzc = sparseArray2;
/* 20 */            zza = new AtomicReference();
/* 25 */            sparseArray.put(-1, lllllII.FORMAT_UNKNOWN);
/* 31 */            sparseArray.put(1, lllllII.FORMAT_CODE_128);
/* 37 */            sparseArray.put(2, lllllII.FORMAT_CODE_39);
/* 43 */            sparseArray.put(4, lllllII.FORMAT_CODE_93);
/* 50 */            sparseArray.put(8, lllllII.FORMAT_CODABAR);
/* 57 */            sparseArray.put(16, lllllII.FORMAT_DATA_MATRIX);
/* 64 */            sparseArray.put(32, lllllII.FORMAT_EAN_13);
/* 71 */            sparseArray.put(64, lllllII.FORMAT_EAN_8);
/* 78 */            sparseArray.put(Barcode.FORMAT_ITF, lllllII.FORMAT_ITF);
/* 85 */            sparseArray.put(Barcode.FORMAT_QR_CODE, lllllII.FORMAT_QR_CODE);
/* 92 */            sparseArray.put(Barcode.FORMAT_UPC_A, lllllII.FORMAT_UPC_A);
/* 99 */            sparseArray.put(Barcode.FORMAT_UPC_E, lllllII.FORMAT_UPC_E);
/* 106 */           sparseArray.put(Barcode.FORMAT_PDF417, lllllII.FORMAT_PDF417);
/* 113 */           sparseArray.put(Barcode.FORMAT_AZTEC, lllllII.FORMAT_AZTEC);
/* 119 */           sparseArray2.put(0, llloI00Ioil1.TYPE_UNKNOWN);
/* 124 */           sparseArray2.put(1, llloI00Ioil1.TYPE_CONTACT_INFO);
/* 129 */           sparseArray2.put(2, llloI00Ioil1.TYPE_EMAIL);
/* 135 */           sparseArray2.put(3, llloI00Ioil1.TYPE_ISBN);
/* 140 */           sparseArray2.put(4, llloI00Ioil1.TYPE_PHONE);
/* 146 */           sparseArray2.put(5, llloI00Ioil1.TYPE_PRODUCT);
/* 152 */           sparseArray2.put(6, llloI00Ioil1.TYPE_SMS);
/* 158 */           sparseArray2.put(7, llloI00Ioil1.TYPE_TEXT);
/* 163 */           sparseArray2.put(8, llloI00Ioil1.TYPE_URL);
/* 170 */           sparseArray2.put(9, llloI00Ioil1.TYPE_WIFI);
/* 177 */           sparseArray2.put(10, llloI00Ioil1.TYPE_GEO);
/* 184 */           sparseArray2.put(11, llloI00Ioil1.TYPE_CALENDAR_EVENT);
/* 191 */           sparseArray2.put(12, llloI00Ioil1.TYPE_DRIVER_LICENSE);
/* 196 */           HashMap map = new HashMap();
/* 199 */           zzd = map;
/* 207 */           map.put(1, o0II110Oo1o.CODE_128);
/* 216 */           map.put(2, o0II110Oo1o.CODE_39);
/* 225 */           map.put(4, o0II110Oo1o.CODE_93);
/* 234 */           map.put(8, o0II110Oo1o.CODABAR);
/* 243 */           map.put(16, o0II110Oo1o.DATA_MATRIX);
/* 252 */           map.put(32, o0II110Oo1o.EAN_13);
/* 261 */           map.put(64, o0II110Oo1o.EAN_8);
/* 270 */           map.put(Integer.valueOf(Barcode.FORMAT_ITF), o0II110Oo1o.ITF);
/* 279 */           map.put(Integer.valueOf(Barcode.FORMAT_QR_CODE), o0II110Oo1o.QR_CODE);
/* 288 */           map.put(Integer.valueOf(Barcode.FORMAT_UPC_A), o0II110Oo1o.UPC_A);
/* 297 */           map.put(Integer.valueOf(Barcode.FORMAT_UPC_E), o0II110Oo1o.UPC_E);
/* 306 */           map.put(Integer.valueOf(Barcode.FORMAT_PDF417), o0II110Oo1o.PDF417);
/* 315 */           map.put(Integer.valueOf(Barcode.FORMAT_AZTEC), o0II110Oo1o.AZTEC);
                }

                public static lllllII zza(int i) {
/* 7 */             lllllII lllllii = (lllllII) zzb.get(i);
                    return lllllii == null ? lllllII.FORMAT_UNKNOWN : lllllii;
                }

                public static llloI00Ioil1 zzb(int i) {
/* 7 */             llloI00Ioil1 llloi00ioil1 = (llloI00Ioil1) zzc.get(i);
                    return llloi00ioil1 == null ? llloI00Ioil1.TYPE_UNKNOWN : llloi00ioil1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static o0Ii11Oi1li zzc(BarcodeScannerOptions barcodeScannerOptions) {
/* 1 */             int iZza = barcodeScannerOptions.zza();
/* 7 */             iiooi0i00l iiooi0i00lVar = new iiooi0i00l();
/* 10 */            if (iZza == 0) {
/* 14 */                Collection collectionValues = zzd.values();
/* 22 */                if (collectionValues instanceof Collection) {
/* 25 */                    Collection collection = collectionValues;
/* 34 */                    iiooi0i00lVar.I00000oOI(collection.size() + iiooi0i00lVar.I00000oOI);
/* 39 */                    if (collection instanceof iioil1o11o) {
/* 52 */                        iiooi0i00lVar.I00000oOI = ((iioil1o11o) collection).I00000oOI(iiooi0i00lVar.I00000oIO, iiooi0i00lVar.I00000oOI);
                            } else {
/* 55 */                        Iterator it = collectionValues.iterator();
/* 63 */                        while (it.hasNext()) {
/* 69 */                            iiooi0i00lVar.I00000oIO(it.next());
                                }
                            }
                        }
                    } else {
/* 87 */                for (Map.Entry entry : zzd.entrySet()) {
/* 106 */                   if ((((Integer) entry.getKey()).intValue() & iZza) != 0) {
/* 114 */                       iiooi0i00lVar.I00000oIO((o0II110Oo1o) entry.getValue());
                            }
                        }
                    }
/* 118 */           ilIIoll0ll iliioll0llI0000Il00O = iiooi0i00lVar.I0000Il00O();
/* 124 */           o0Ii11Oi1li o0ii11oi1li = new o0Ii11Oi1li();
/* 127 */           o0ii11oi1li.I00000oIO = iliioll0llI0000Il00O;
/* 129 */           VarHandle.storeStoreFence();
/* 186 */           return o0ii11oi1li;
                }

                public static String zzd() {
                    return true != zzf() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
                }

                public static void zze(o0OiOio o0oioio, final lliO0i0Iii0 llio0i0iii0) {
/* 8 */             o0oioio.I0000Il00O(new o0OiI0Oo() {
                        @Override
                        public final o0IooioOOIl zza() {
/* 5 */                     IOiOol0 iOiOol0 = new IOiOol0(15);
/* 17 */                    lliI0lOI llii0loi = zzb.zzf() ? lliI0lOI.TYPE_THICK : lliI0lOI.TYPE_THIN;
/* 19 */                    lliO0i0Iii0 llio0i0iii02 = llio0i0iii0;
/* 21 */                    iOiOol0.I00iio = llii0loi;
/* 25 */                    lloOlO0lOIO lloolo0loio = new lloOlO0lOIO();
/* 28 */                    lloolo0loio.I00000oIO = llio0i0iii02;
/* 30 */                    VarHandle.storeStoreFence();
/* 33 */                    iOiOol0.I00ilO0 = lloolo0loio;
/* 38 */                    return new o0Oll1li(iOiOol0, 0);
                        }
                    }, lliOo1oo.ON_DEVICE_BARCODE_LOAD);
                }

                public static boolean zzf() {
/* 1 */             AtomicReference atomicReference = zza;
/* 7 */             if (atomicReference.get() != null) {
/* 15 */                return ((Boolean) atomicReference.get()).booleanValue();
                    }
/* 28 */            boolean zZzd = zzo.zzd(O1o0111OI00.I0000Il00O().I00000oOI());
/* 36 */            atomicReference.set(Boolean.valueOf(zZzd));
/* 113 */           return zZzd;
                }
            }
