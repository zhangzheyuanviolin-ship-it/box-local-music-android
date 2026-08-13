            package com.google.mlkit.vision.barcode.internal;

            import android.content.Context;
            import android.graphics.Point;
            import com.google.mlkit.vision.barcode.BarcodeScanner;
            import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
            import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.MobileVisionBase;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Set;
            import java.util.UUID;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.I000II;
            import p000.IOiOol0;
            import p000.IlIII1l;
            import p000.Io0Ool;
            import p000.O1o00iolI11;
            import p000.O1o0111OI00;
            import p000.OIiil10iiO;
            import p000.Oioo1I0o;
            import p000.OliOio1iiOI;
            import p000.OloIIoII1oo;
            import p000.OloIo0oOIO0;
            import p000.i0OlIl1l1o;
            import p000.i1olOi1oI;
            import p000.iO11101I;
            import p000.iOIIlIoO1l0;
            import p000.ii0iloI;
            import p000.ii1oIilolI;
            import p000.iii1IlooII;
            import p000.il00ii;
            import p000.il0II0OO1;
            import p000.ilIIoll0ll;
            import p000.ill1100Oii;
            import p000.l0IIioiIOIo;
            import p000.lOii1o;
            import p000.lOio0o;
            import p000.liloI11ilO;
            import p000.lliI0lOI;
            import p000.lliOo1oo;
            import p000.llo1OlOi;
            import p000.o0Ii11Oi1li;
            import p000.o0IiOl;
            import p000.o0IoIli0I;
            import p000.o0OI1Ooo1;
            import p000.o0OiOio;
            import p000.o0Oll1li;
            import p000.o0il1lO01O0;
            import p000.o0iloil;
            import p000.o0l1o1ooIoo;
            
/* 16 */    public final class zzh extends MobileVisionBase implements BarcodeScanner {
                public static final int zzc = 0;
                private static final BarcodeScannerOptions zzd = new BarcodeScannerOptions.Builder().build();
                final o0l1o1ooIoo zzb;
                private final boolean zze;
                private final BarcodeScannerOptions zzf;
                private int zzg;
                private boolean zzh;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzh(BarcodeScannerOptions barcodeScannerOptions, zzl zzlVar, Executor executor, o0OiOio o0oioio, O1o0111OI00 o1o0111OI00) {
                    o0l1o1ooIoo o0l1o1ooioo;
/* 261 */           super(zzlVar, executor);
/* 3 */             ZoomSuggestionOptions zoomSuggestionOptionsZzb = barcodeScannerOptions.zzb();
/* 8 */             if (zoomSuggestionOptionsZzb == null) {
/* 10 */                o0l1o1ooioo = null;
                    } else {
/* 17 */                Context contextI00000oOI = o1o0111OI00.I00000oOI();
/* 25 */                String packageName = o1o0111OI00.I00000oOI().getPackageName();
/* 31 */                o0il1lO01O0 o0il1lo01o0 = o0il1lO01O0.I000l1;
/* 38 */                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
/* 42 */                iO11101I io11101i = iOIIlIoO1l0.I00000oIO;
/* 48 */                Oioo1I0o oioo1I0o = new Oioo1I0o(contextI00000oOI);
/* 59 */                byte b = (byte) (((byte) (0 | 1)) | 2);
/* 61 */                if (b != 3) {
/* 338 */                   StringBuilder sb = new StringBuilder();
/* 343 */                   if ((b & 1) == 0) {
/* 347 */                       sb.append(" enableFirelog");
                            }
/* 352 */                   if ((b & 2) == 0) {
/* 356 */                       sb.append(" firelogEventType");
                            }
/* 369 */                   I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 399 */                   throw null;
                        }
/* 65 */                o0IoIli0I o0ioili0i = new o0IoIli0I();
/* 68 */                o0ioili0i.I00000oIO = "scanner-auto-zoom";
/* 70 */                o0ioili0i.I00000oOI = 1;
/* 72 */                VarHandle.storeStoreFence();
/* 78 */                o0OiOio o0oioio2 = new o0OiOio(contextI00000oOI, oioo1I0o, new o0OI1Ooo1(contextI00000oOI, o0ioili0i), "scanner-auto-zoom");
/* 81 */                o0l1o1ooioo = new o0l1o1ooIoo();
/* 86 */                Object obj = new Object();
/* 89 */                o0l1o1ooioo.I0000Il00O = obj;
/* 91 */                o0l1o1ooioo.I00000oIO = o0il1lo01o0;
/* 99 */                o0l1o1ooioo.I00000oOI = new AtomicBoolean(false);
/* 106 */               o0l1o1ooioo.I0000O = new iii1IlooII();
/* 108 */               o0l1o1ooioo.I0000oI00 = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
/* 110 */               o0l1o1ooioo.I0001Ioi1lo = io11101i;
/* 112 */               o0l1o1ooioo.I000II = o0oioio2;
/* 114 */               o0l1o1ooioo.I000O01llI0 = packageName;
/* 116 */               o0l1o1ooioo.I00100o1O0lo = 1;
/* 120 */               o0l1o1ooioo.I000OiO = 1.0f;
/* 124 */               o0l1o1ooioo.I000iOII = -1.0f;
/* 130 */               o0l1o1ooioo.I000l1 = io11101i.I00000oIO();
/* 132 */               VarHandle.storeStoreFence();
/* 137 */               zze zzeVar = new zze(zoomSuggestionOptionsZzb);
/* 140 */               ill1100Oii ill1100oii = ill1100Oii.I00iOIl;
/* 142 */               o0l1o1ooioo.I0010I0i = zzeVar;
/* 144 */               o0l1o1ooioo.I000OOo1O = ill1100oii;
/* 152 */               if (zoomSuggestionOptionsZzb.zza() >= 1.0f) {
/* 154 */                   float fZza = zoomSuggestionOptionsZzb.zza();
                            synchronized (obj) {
                                try {
/* 161 */                           if (fZza < 1.0f) {
/* 174 */                               throw new IllegalArgumentException();
                                    }
/* 163 */                           o0l1o1ooioo.I000iOII = fZza;
                                } finally {
                                }
                            }
                        }
                        synchronized (obj) {
                            try {
/* 178 */                       int i = o0l1o1ooioo.I00100o1O0lo;
/* 180 */                       if (i != 2 && i != 4) {
/* 186 */                           o0l1o1ooioo.I0000oI00(true);
/* 193 */                           lOii1o loii1o = new lOii1o(13);
/* 196 */                           loii1o.I00iiI = o0l1o1ooioo;
/* 198 */                           VarHandle.storeStoreFence();
/* 210 */                           o0l1o1ooioo.I000o00OoI0I = scheduledExecutorServiceUnconfigurableScheduledExecutorService.scheduleWithFixedDelay(loii1o, 500L, 500L, TimeUnit.MILLISECONDS);
/* 214 */                           if (o0l1o1ooioo.I00100o1O0lo == 1) {
/* 224 */                               o0l1o1ooioo.I000oI1ioi = UUID.randomUUID().toString();
/* 230 */                               o0l1o1ooioo.I000lI = io11101i.I00000oIO();
/* 232 */                               o0l1o1ooioo.I00100l0 = false;
/* 234 */                               lliOo1oo llioo1oo = lliOo1oo.SCANNER_AUTO_ZOOM_START;
/* 236 */                               float f = o0l1o1ooioo.I000OiO;
/* 239 */                               o0l1o1ooioo.I0000O(llioo1oo, f, f, null);
                                    } else {
/* 245 */                               lliOo1oo llioo1oo2 = lliOo1oo.SCANNER_AUTO_ZOOM_RESUME;
/* 247 */                               float f2 = o0l1o1ooioo.I000OiO;
/* 250 */                               o0l1o1ooioo.I0000O(llioo1oo2, f2, f2, null);
                                    }
/* 253 */                           o0l1o1ooioo.I00100o1O0lo = 2;
                                }
                            } finally {
                            }
                        }
                    }
/* 266 */           this.zzf = barcodeScannerOptions;
/* 268 */           boolean zZzf = zzb.zzf();
/* 272 */           this.zze = zZzf;
/* 274 */           o0Ii11Oi1li o0ii11oi1liZzc = zzb.zzc(barcodeScannerOptions);
/* 280 */           llo1OlOi llo1oloi = new llo1OlOi();
/* 284 */           llo1oloi.I00000oIO = null;
/* 286 */           llo1oloi.I00000oOI = o0ii11oi1liZzc;
/* 288 */           llo1oloi.I0000Il00O = null;
/* 290 */           llo1oloi.I0000O = null;
/* 292 */           llo1oloi.I0000oI00 = null;
/* 294 */           VarHandle.storeStoreFence();
/* 301 */           IOiOol0 iOiOol0 = new IOiOol0(15);
/* 311 */           iOiOol0.I00iio = zZzf ? lliI0lOI.TYPE_THICK : lliI0lOI.TYPE_THIN;
/* 313 */           iOiOol0.I00ilI0I1 = llo1oloi;
/* 328 */           o0oioio.I00000oOI(new o0Oll1li(iOiOol0, 1), lliOo1oo.ON_DEVICE_BARCODE_CREATE, o0oioio.I0000O());
/* 331 */           this.zzb = o0l1o1ooioo;
                }

                private final OloIIoII1oo zzf(OloIIoII1oo oloIIoII1oo, final int i, final int i2) {
/* 3 */             OliOio1iiOI oliOio1iiOI = new OliOio1iiOI() {
                        @Override
                        public final OloIIoII1oo then(Object obj) {
/* 9 */                     return this.zza.zzd(i, i2, (List) obj);
                        }
                    };
/* 6 */             o0IiOl o0iiol = (o0IiOl) oloIIoII1oo;
/* 8 */             o0iiol.getClass();
/* 11 */            i0OlIl1l1o i0olil1l1o = OloIo0oOIO0.I00000oIO;
/* 15 */            o0IiOl o0iiol2 = new o0IiOl();
/* 25 */            o0iiol.I00000oOI.I000l1(new l0IIioiIOIo(i0olil1l1o, oliOio1iiOI, o0iiol2));
/* 28 */            o0iiol.I0010I0i();
/* 98 */            return o0iiol2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
                
                    throw r0;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final synchronized void close() {
                    try {
/* 2 */                 o0l1o1ooIoo o0l1o1ooioo = this.zzb;
/* 4 */                 if (o0l1o1ooioo != null) {
/* 8 */                     o0l1o1ooioo.I0000Il00O(this.zzh);
/* 11 */                    o0l1o1ooIoo o0l1o1ooioo2 = this.zzb;
                            synchronized (o0l1o1ooioo2.I0000Il00O) {
/* 19 */                        if (o0l1o1ooioo2.I00100o1O0lo != 4) {
/* 26 */                            o0l1o1ooioo2.I0000Il00O(false);
/* 31 */                            o0l1o1ooioo2.I0000oI00.shutdown();
/* 34 */                            o0l1o1ooioo2.I00100o1O0lo = 4;
                                }
                            }
                        }
/* 42 */                super.close();
                    } finally {
                    }
                }

                @Override
                public final int getDetectorType() {
/* 1 */             return 1;
                }

                @Override
                public final IlIII1l[] getOptionalFeatures() {
                    return this.zze ? OIiil10iiO.I00000oIO : new IlIII1l[]{OIiil10iiO.I00000oOI};
                }

                @Override
                public final OloIIoII1oo process(InputImage inputImage) {
/* 13 */            return zzf(super.processBase(inputImage), inputImage.getWidth(), inputImage.getHeight());
                }

                /* JADX WARN: Code restructure failed: missing block: B:121:0x0333, code lost:
                
                    throw r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Removed duplicated region for block: B:112:0x0310 A[Catch: all -> 0x0260, Merged into TryCatch #1 {all -> 0x00bd, all -> 0x0260, blocks: (B:25:0x00af, B:27:0x00b6, B:31:0x00c0, B:33:0x00c6, B:35:0x00cc, B:38:0x00d9, B:40:0x00dd, B:41:0x00e7, B:43:0x0135, B:44:0x013c, B:46:0x0142, B:49:0x0150, B:51:0x0176, B:53:0x0196, B:52:0x017b, B:54:0x0198, B:56:0x01a3, B:57:0x01aa, B:58:0x01ae, B:60:0x01b7, B:62:0x01c9, B:64:0x01d5, B:67:0x01e2, B:68:0x021e, B:70:0x0226, B:72:0x0235, B:74:0x0241, B:76:0x0245, B:114:0x032c, B:80:0x024f, B:81:0x0251, B:117:0x032f, B:118:0x0330, B:82:0x0252, B:84:0x025e, B:88:0x0263, B:89:0x0292, B:91:0x0298, B:94:0x02bf, B:103:0x02d5, B:105:0x02db, B:107:0x02e4, B:109:0x02eb, B:110:0x030e, B:112:0x0310, B:113:0x032b), top: B:135:0x00af }] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OloIIoII1oo zzd(int i, int i2, List list) {
                    char c;
                    List list2;
                    boolean z;
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    int i3;
                    char c2;
                    Iterator it;
                    int i4;
                    float fI00000oIO;
                    List listUnmodifiableList;
/* 5 */             if (this.zzb == null) {
/* 7 */                 return lOio0o.I0000oI00(list);
                    }
/* 14 */            boolean z2 = true;
                    this.zzg++;
/* 20 */            ArrayList arrayList3 = new ArrayList();
/* 25 */            ArrayList arrayList4 = new ArrayList();
/* 28 */            Iterator it2 = list.iterator();
                    while (true) {
/* 36 */                c = 65535;
/* 37 */                if (!it2.hasNext()) {
                            break;
                        }
/* 43 */                Barcode barcode = (Barcode) it2.next();
/* 49 */                if (barcode.getFormat() == -1) {
/* 51 */                    arrayList4.add(barcode);
                        } else {
/* 55 */                    arrayList3.add(barcode);
                        }
                    }
/* 63 */            if (arrayList3.isEmpty()) {
/* 65 */                int size = arrayList4.size();
/* 69 */                int i5 = 0;
/* 70 */                while (i5 < size) {
/* 78 */                    Point[] cornerPoints = ((Barcode) arrayList4.get(i5)).getCornerPoints();
/* 82 */                    if (cornerPoints != null) {
/* 84 */                        o0l1o1ooIoo o0l1o1ooioo = this.zzb;
/* 86 */                        int i6 = this.zzg;
/* 96 */                        int iMin = i;
/* 98 */                        int iMin2 = i2;
/* 100 */                       int iMax = 0;
/* 101 */                       int iMax2 = 0;
/* 106 */                       for (Point point : Arrays.asList(cornerPoints)) {
/* 118 */                           iMin = Math.min(iMin, point.x);
/* 124 */                           iMin2 = Math.min(iMin2, point.y);
/* 130 */                           iMax = Math.max(iMax, point.x);
/* 136 */                           iMax2 = Math.max(iMax2, point.y);
/* 140 */                           c = c;
                                }
/* 143 */                       c2 = c;
                                float f = i;
                                float f2 = i2;
/* 162 */                       float f3 = (iMin + 0.0f) / f;
/* 163 */                       float f4 = (iMin2 + 0.0f) / f2;
/* 166 */                       float f5 = (iMax + 0.0f) / f;
/* 169 */                       float f6 = (iMax2 + 0.0f) / f2;
/* 170 */                       o0iloil o0iloilVar = new o0iloil(f3, f4, f5, f6);
                                synchronized (o0l1o1ooioo.I0000Il00O) {
                                    try {
/* 178 */                               arrayList = arrayList3;
/* 181 */                               if (o0l1o1ooioo.I00100o1O0lo != 2) {
/* 184 */                                   arrayList2 = arrayList4;
/* 186 */                                   i3 = size;
                                        } else if (o0iloilVar.I00000oOI()) {
/* 199 */                                   o0il1lO01O0 o0il1lo01o0 = o0l1o1ooioo.I00000oIO;
/* 203 */                                   if (!o0il1lo01o0.I0000O || o0il1lo01o0.I0000oI00 <= 0.0f) {
/* 220 */                                       if (!o0l1o1ooioo.I00100l0) {
/* 222 */                                           lliOo1oo llioo1oo = lliOo1oo.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
/* 224 */                                           float f7 = o0l1o1ooioo.I000OiO;
/* 226 */                                           o0l1o1ooioo.I0000O(llioo1oo, f7, f7, o0iloilVar);
/* 230 */                                           o0l1o1ooioo.I00100l0 = true;
                                                }
/* 232 */                                       Io0Ool io0Ool = o0l1o1ooIoo.I0010o;
/* 234 */                                       Locale locale = Locale.getDefault();
/* 238 */                                       arrayList2 = arrayList4;
/* 242 */                                       Float fValueOf = Float.valueOf(f3);
/* 246 */                                       Float fValueOf2 = Float.valueOf(f4);
/* 250 */                                       Float fValueOf3 = Float.valueOf(f5);
/* 254 */                                       Float fValueOf4 = Float.valueOf(f6);
/* 258 */                                       Float fValueOf5 = Float.valueOf(0.0f);
/* 262 */                                       Integer numValueOf = Integer.valueOf(i6);
/* 276 */                                       io0Ool.I0000Il00O(String.format(locale, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d", fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, numValueOf));
/* 281 */                                       o0l1o1ooioo.I0000O.I0000O(numValueOf, o0iloilVar);
/* 286 */                                       Set setI00000oOI = o0l1o1ooioo.I0000O.I00000oOI();
                                                int size2 = ((ii1oIilolI) setI00000oOI).I00iiI.size() - 1;
/* 303 */                                       o0l1o1ooioo.I00000oIO.getClass();
/* 306 */                                       int i7 = 10;
/* 308 */                                       if (size2 > 10) {
/* 312 */                                           Iterator it3 = ((ii1oIilolI) setI00000oOI).iterator();
/* 316 */                                           int i8 = i6;
/* 321 */                                           while (it3.hasNext()) {
/* 329 */                                               int iIntValue = ((Integer) it3.next()).intValue();
/* 333 */                                               if (i8 > iIntValue) {
/* 335 */                                                   i8 = iIntValue;
                                                        }
                                                    }
/* 356 */                                           o0l1o1ooIoo.I0010o.I0000Il00O("Removing recent frameIndex = " + i8);
/* 359 */                                           iii1IlooII iii1ilooii = o0l1o1ooioo.I0000O;
/* 371 */                                           Collection collection = (Collection) iii1ilooii.I00iio.remove(Integer.valueOf(i8));
/* 373 */                                           if (collection == null) {
/* 375 */                                               listUnmodifiableList = Collections.EMPTY_LIST;
                                                    } else {
/* 383 */                                               ArrayList arrayList5 = new ArrayList(3);
/* 386 */                                               arrayList5.addAll(collection);
                                                        iii1ilooii.I00ilI0I1 -= collection.size();
/* 398 */                                               collection.clear();
/* 401 */                                               listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                                                    }
/* 407 */                                           List list3 = listUnmodifiableList;
                                                }
/* 411 */                                       HashSet hashSet = new HashSet();
/* 414 */                                       iii1IlooII iii1ilooii2 = o0l1o1ooioo.I0000O;
/* 416 */                                       i1olOi1oI i1oloi1oi = iii1ilooii2.I00iOIl;
/* 418 */                                       if (i1oloi1oi == null) {
/* 422 */                                           i1oloi1oi = new i1olOi1oI(iii1ilooii2, i7);
/* 425 */                                           iii1ilooii2.I00iOIl = i1oloi1oi;
                                                }
/* 427 */                                       Iterator it4 = i1oloi1oi.iterator();
                                                while (true) {
/* 432 */                                           ii0iloI ii0iloi = (ii0iloI) it4;
/* 438 */                                           if (!ii0iloi.hasNext()) {
                                                        break;
                                                    }
/* 444 */                                           Map.Entry entry = (Map.Entry) ii0iloi.next();
/* 456 */                                           if (((Integer) entry.getKey()).intValue() != i6) {
/* 462 */                                               o0iloil o0iloilVar2 = (o0iloil) entry.getValue();
/* 468 */                                               if (o0iloilVar2.I00000oOI() && o0iloilVar.I00000oOI()) {
/* 501 */                                                   it = it4;
/* 511 */                                                   i4 = size;
/* 521 */                                                   o0iloil o0iloilVar3 = new o0iloil(Math.max(o0iloilVar2.I00000oIO, o0iloilVar.I00000oIO), Math.max(o0iloilVar2.I00000oOI, o0iloilVar.I00000oOI), Math.min(o0iloilVar2.I0000Il00O, o0iloilVar.I0000Il00O), Math.min(o0iloilVar2.I0000O, o0iloilVar.I0000O));
/* 542 */                                                   fI00000oIO = o0iloilVar3.I00000oIO() / ((o0iloilVar2.I00000oIO() + o0iloilVar.I00000oIO()) - o0iloilVar3.I00000oIO());
                                                        } else {
/* 476 */                                                   it = it4;
/* 478 */                                                   i4 = size;
/* 480 */                                                   fI00000oIO = 0.0f;
                                                        }
/* 549 */                                               if (fI00000oIO >= o0l1o1ooioo.I00000oIO.I00000oOI) {
/* 557 */                                                   hashSet.add((Integer) entry.getKey());
                                                        }
/* 560 */                                               it4 = it;
/* 562 */                                               size = i4;
                                                    }
                                                }
/* 566 */                                       i3 = size;
/* 568 */                                       int size3 = hashSet.size();
/* 572 */                                       o0il1lO01O0 o0il1lo01o02 = o0l1o1ooioo.I00000oIO;
/* 576 */                                       if (size3 >= o0il1lo01o02.I00000oIO || (o0il1lo01o02.I0000O && o0il1lo01o02.I0001Ioi1lo <= 0.0f)) {
                                                    synchronized (o0l1o1ooioo.I0000Il00O) {
/* 605 */                                               if (o0l1o1ooioo.I00000oIO() >= o0l1o1ooioo.I00000oIO.I000II) {
/* 614 */                                                   Float fValueOf6 = Float.valueOf(o0iloilVar.I00000oIO);
/* 620 */                                                   Float fValueOf7 = Float.valueOf(o0iloilVar.I00000oOI);
/* 626 */                                                   Float fValueOf8 = Float.valueOf(o0iloilVar.I0000Il00O);
/* 632 */                                                   Float fValueOf9 = Float.valueOf(o0iloilVar.I0000O);
/* 636 */                                                   il00ii il00iiVar = il0II0OO1.I00iiI;
/* 638 */                                                   Object[] objArr = {fValueOf6, fValueOf7, fValueOf8, fValueOf9};
/* 643 */                                                   liloI11ilO.I00000oIO(4, objArr);
/* 652 */                                                   il00ii il00iiVarListIterator = new ilIIoll0ll(objArr, 4).listIterator(0);
/* 656 */                                                   float f8 = 1.0E9f;
/* 663 */                                                   while (il00iiVarListIterator.hasNext()) {
/* 696 */                                                       float fMax = (o0l1o1ooioo.I00000oIO.I0000Il00O / 2.0f) / Math.max(Math.abs(((Float) il00iiVarListIterator.next()).floatValue() - 0.5f), 0.001f);
/* 700 */                                                       if (f8 > fMax) {
/* 702 */                                                           f8 = fMax;
                                                                }
                                                            }
/* 704 */                                                   float f9 = o0l1o1ooioo.I000OiO;
/* 706 */                                                   float f10 = f8 * f9;
/* 711 */                                                   float f11 = o0l1o1ooioo.I000iOII;
/* 713 */                                                   if (f10 < 1.0f) {
/* 715 */                                                       f10 = 1.0f;
                                                            }
/* 718 */                                                   if (f11 <= 0.0f || f10 <= f11) {
/* 725 */                                                       f11 = f10;
                                                            }
/* 726 */                                                   o0il1lO01O0 o0il1lo01o03 = o0l1o1ooioo.I00000oIO;
/* 730 */                                                   if (o0il1lo01o03.I000OOo1O) {
/* 734 */                                                       float f12 = (f11 - f9) / f9;
/* 739 */                                                       if (f12 > o0il1lo01o03.I000OiO || f12 < (-o0il1lo01o03.I000iOII)) {
/* 804 */                                                           o0l1o1ooIoo.I0010o.I0000Il00O("Going to set zoom = " + f11);
/* 809 */                                                           o0l1o1ooioo.I00000oOI(f11, lliOo1oo.SCANNER_AUTO_ZOOM_AUTO_ZOOM, o0iloilVar);
                                                                } else {
/* 772 */                                                           o0l1o1ooIoo.I0010o.I0000Il00O("Auto zoom to " + f11 + " is filtered by threshold");
/* 781 */                                                           o0l1o1ooioo.I000l1 = o0l1o1ooioo.I0001Ioi1lo.I00000oIO();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
/* 211 */                                       arrayList2 = arrayList4;
/* 213 */                                       i3 = size;
                                            }
                                        }
                                    } finally {
                                    }
                                }
/* 834 */                       i5++;
/* 836 */                       c = c2;
/* 838 */                       arrayList3 = arrayList;
/* 840 */                       arrayList4 = arrayList2;
/* 842 */                       size = i3;
/* 844 */                       z2 = true;
                            } else {
/* 825 */                       arrayList = arrayList3;
/* 827 */                       arrayList2 = arrayList4;
/* 829 */                       i3 = size;
/* 831 */                       c2 = c;
                            }
/* 834 */                   i5++;
/* 836 */                   c = c2;
/* 838 */                   arrayList3 = arrayList;
/* 840 */                   arrayList4 = arrayList2;
/* 842 */                   size = i3;
/* 844 */                   z2 = true;
                        }
/* 847 */               list2 = arrayList3;
/* 849 */               z = z2;
                    } else {
/* 851 */               list2 = arrayList3;
/* 853 */               z = true;
/* 854 */               this.zzh = true;
                    }
/* 862 */           if (z == this.zzf.zzd()) {
/* 865 */               list2 = list;
                    }
/* 867 */           return lOio0o.I0000oI00(list2);
                }

                @Override
/* 17 */        public final OloIIoII1oo process(O1o00iolI11 o1o00iolI11) {
/* 18 */            super.processBase(o1o00iolI11);
                    throw null;
                }
            }
